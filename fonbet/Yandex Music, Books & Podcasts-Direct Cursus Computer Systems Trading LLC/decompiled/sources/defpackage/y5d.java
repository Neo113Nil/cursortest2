package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class y5d implements lhu, z8t, yn7 {
    public boolean a;

    public abstract void a(Drawable drawable);

    public final void b() {
        Object q = q();
        Animatable animatable = q instanceof Animatable ? (Animatable) q : null;
        if (animatable == null) {
            return;
        }
        if (this.a) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final void c(Drawable drawable) {
        Object q = q();
        Animatable animatable = q instanceof Animatable ? (Animatable) q : null;
        if (animatable != null) {
            animatable.stop();
        }
        a(drawable);
        b();
    }

    @Override // defpackage.i6s
    public final void f(Drawable drawable) {
        c(drawable);
    }

    @Override // defpackage.i6s
    public final void j(Drawable drawable) {
        c(drawable);
    }

    @Override // defpackage.yn7
    public final void onStart(dzf dzfVar) {
        this.a = true;
        b();
    }

    @Override // defpackage.yn7
    public final void onStop(dzf dzfVar) {
        this.a = false;
        b();
    }

    @Override // defpackage.i6s
    public final void p(Drawable drawable) {
        c(drawable);
    }

    public abstract Drawable q();
}
