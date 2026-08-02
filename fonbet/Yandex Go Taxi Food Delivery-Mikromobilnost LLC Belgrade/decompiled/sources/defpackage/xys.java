package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.DefaultLifecycleObserver;

/* loaded from: classes10.dex */
public abstract class xys implements nv31, qy01, DefaultLifecycleObserver {
    public boolean a;

    public abstract void a(Drawable drawable);

    @Override // defpackage.jax0
    public void b(Drawable drawable) {
        d(drawable);
    }

    public final void c() {
        Object n = n();
        Animatable animatable = n instanceof Animatable ? (Animatable) n : null;
        if (animatable == null) {
            return;
        }
        if (this.a) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final void d(Drawable drawable) {
        Object n = n();
        Animatable animatable = n instanceof Animatable ? (Animatable) n : null;
        if (animatable != null) {
            animatable.stop();
        }
        a(drawable);
        c();
    }

    @Override // defpackage.jax0
    public final void f(Drawable drawable) {
        d(drawable);
    }

    @Override // defpackage.jax0
    public final void g(Drawable drawable) {
        d(drawable);
    }

    public abstract Drawable n();

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(pey peyVar) {
        this.a = true;
        c();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(pey peyVar) {
        this.a = false;
        c();
    }
}
