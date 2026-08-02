package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class mr0 {
    public final ImageView a;
    public kj3 b;
    public int c = 0;

    public mr0(ImageView imageView) {
        this.a = imageView;
    }

    public final void a() {
        kj3 kj3Var;
        ImageView imageView = this.a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            xpa.a(drawable);
        }
        if (drawable == null || (kj3Var = this.b) == null) {
            return;
        }
        ir0.e(drawable, kj3Var, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = this.a;
        Context context = imageView.getContext();
        int[] iArr = ken.f;
        lum W = lum.W(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) W.b;
        wdu.p(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) W.b, i, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = y2x.w(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                xpa.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(W.J(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(xpa.c(typedArray.getInt(3, -1), null));
            }
            W.f0();
        } catch (Throwable th) {
            W.f0();
            throw th;
        }
    }

    public final void c(int i) {
        ImageView imageView = this.a;
        if (i != 0) {
            Drawable w = y2x.w(imageView.getContext(), i);
            if (w != null) {
                xpa.a(w);
            }
            imageView.setImageDrawable(w);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
