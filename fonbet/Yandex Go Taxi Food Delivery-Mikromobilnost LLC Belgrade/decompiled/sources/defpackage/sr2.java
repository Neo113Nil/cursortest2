package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.b;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class sr2 {
    public final ImageView a;
    public cfz0 b;
    public int c = 0;

    public sr2(ImageView imageView) {
        this.a = imageView;
    }

    public final void a() {
        cfz0 cfz0Var;
        ImageView imageView = this.a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            vbm.a(drawable);
        }
        if (drawable == null || (cfz0Var = this.b) == null) {
            return;
        }
        or2.e(drawable, cfz0Var, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = this.a;
        dfz0 e = dfz0.e(i, 0, imageView.getContext(), attributeSet, n4i0.AppCompatImageView);
        TypedArray typedArray = e.b;
        Context context = imageView.getContext();
        int[] iArr = n4i0.AppCompatImageView;
        TypedArray typedArray2 = e.b;
        WeakHashMap weakHashMap = b.a;
        sp31.b(imageView, context, iArr, attributeSet, typedArray2, i, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(n4i0.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = vng.t(resourceId, imageView.getContext())) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                vbm.a(drawable);
            }
            if (typedArray.hasValue(n4i0.AppCompatImageView_tint)) {
                e5b1.c(imageView, e.a(n4i0.AppCompatImageView_tint));
            }
            if (typedArray.hasValue(n4i0.AppCompatImageView_tintMode)) {
                e5b1.d(imageView, vbm.c(typedArray.getInt(n4i0.AppCompatImageView_tintMode, -1), null));
            }
            e.g();
        } catch (Throwable th) {
            e.g();
            throw th;
        }
    }

    public final void c(int i) {
        ImageView imageView = this.a;
        if (i != 0) {
            Drawable t = vng.t(i, imageView.getContext());
            if (t != null) {
                vbm.a(t);
            }
            imageView.setImageDrawable(t);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
