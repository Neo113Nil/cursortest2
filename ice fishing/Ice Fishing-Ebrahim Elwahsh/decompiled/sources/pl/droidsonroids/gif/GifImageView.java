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
    public boolean f39853n;

    public GifImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        x8.c cVar;
        List list = x8.d.f41810a;
        if (attributeSet == null || isInEditMode()) {
            cVar = new x8.c();
        } else {
            cVar = new x8.c(this, attributeSet);
            int i = cVar.f41807b;
            if (i >= 0) {
                Drawable drawable = getDrawable();
                if (drawable instanceof c) {
                    ((c) drawable).f39875z.r(i);
                }
                Drawable background = getBackground();
                if (background instanceof c) {
                    ((c) background).f39875z.r(i);
                }
            }
        }
        this.f39853n = cVar.f41806a;
        int i4 = cVar.f41808c;
        if (i4 > 0) {
            super.setImageResource(i4);
        }
        int i9 = cVar.f41809d;
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
        long[][] jArr = dVar.f39876n;
        if (jArr[0] != null && (drawable instanceof c)) {
            ((c) drawable).a(r0.f39875z.o(r1, r0.f39874y));
        }
        Drawable background = getBackground();
        if (jArr[1] == null || !(background instanceof c)) {
            return;
        }
        ((c) background).a(r0.f39875z.o(r5, r0.f39874y));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new d(super.onSaveInstanceState(), this.f39853n ? getDrawable() : null, this.f39853n ? getBackground() : null);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        if (x8.d.a(this, false, i)) {
            return;
        }
        super.setBackgroundResource(i);
    }

    public void setFreezesAnimation(boolean z8) {
        this.f39853n = z8;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        if (x8.d.a(this, true, i)) {
            return;
        }
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        List list = x8.d.f41810a;
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
