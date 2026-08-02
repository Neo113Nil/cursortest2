package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class jl0 implements k2o {
    public final AnimatedImageDrawable a;

    public jl0(AnimatedImageDrawable animatedImageDrawable) {
        this.a = animatedImageDrawable;
    }

    @Override // defpackage.k2o
    public final int f() {
        return xut.d(Bitmap.Config.ARGB_8888) * this.a.getIntrinsicHeight() * this.a.getIntrinsicWidth() * 2;
    }

    @Override // defpackage.k2o
    public final void g() {
        this.a.stop();
        this.a.clearAnimationCallbacks();
    }

    @Override // defpackage.k2o
    public final Object get() {
        return this.a;
    }

    @Override // defpackage.k2o
    public final Class h() {
        return Drawable.class;
    }
}
