package pl.droidsonroids.gif;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public class GifImageView extends ImageView {

    /* renamed from: n, reason: collision with root package name */
    public boolean f39943n;

    public GifImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        B8.e eVar;
        List list = B8.f.f235a;
        if (attributeSet == null || isInEditMode()) {
            eVar = new B8.e();
        } else {
            eVar = new B8.e(this, attributeSet);
            int i = eVar.f232b;
            if (i >= 0) {
                Drawable drawable = getDrawable();
                if (drawable instanceof c) {
                    ((c) drawable).f39965z.r(i);
                }
                Drawable background = getBackground();
                if (background instanceof c) {
                    ((c) background).f39965z.r(i);
                }
            }
        }
        this.f39943n = eVar.f231a;
        int i6 = eVar.f233c;
        if (i6 > 0) {
            super.setImageResource(i6);
        }
        int i9 = eVar.f234d;
        if (i9 > 0) {
            super.setBackgroundResource(i9);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        Drawable drawable = getDrawable();
        long[][] jArr = dVar.f39966n;
        if (jArr[0] != null && (drawable instanceof c)) {
            ((c) drawable).a(r0.f39965z.o(r1, r0.f39964y));
        }
        Drawable background = getBackground();
        if (jArr[1] == null || !(background instanceof c)) {
            return;
        }
        ((c) background).a(r0.f39965z.o(r5, r0.f39964y));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new d(super.onSaveInstanceState(), this.f39943n ? getDrawable() : null, this.f39943n ? getBackground() : null);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        if (B8.f.a(this, false, i)) {
            return;
        }
        super.setBackgroundResource(i);
    }

    public void setFreezesAnimation(boolean z3) {
        this.f39943n = z3;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        if (B8.f.a(this, true, i)) {
            return;
        }
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        List list = B8.f.f235a;
        if (uri != null) {
            try {
                setImageDrawable(new c(getContext().getContentResolver(), uri));
                return;
            } catch (IOException unused) {
            }
        }
        super.setImageURI(uri);
    }
}
