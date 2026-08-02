package defpackage;

import androidx.lifecycle.Lifecycle;

/* loaded from: classes.dex */
public final class qx60 {
    public final Runnable a;
    public final j750 b;
    public final ox60 c;

    public qx60(Runnable runnable) {
        this.a = runnable;
        j750 j750Var = new j750(new s59(this));
        this.b = j750Var;
        ox60 ox60Var = new ox60();
        this.c = ox60Var;
        j750Var.b(ox60Var);
    }

    public final void a(pey peyVar, mx60 mx60Var) {
        Lifecycle lifecycle = peyVar.getLifecycle();
        if (lifecycle.b() == Lifecycle.State.DESTROYED) {
            return;
        }
        kx60 kx60Var = new kx60(mx60Var, new nx60(peyVar, mx60Var));
        mx60Var.a.add(kx60Var);
        kx60Var.h(false);
        j750.a(this.b, kx60Var);
        px60 px60Var = new px60(kx60Var, this, lifecycle);
        lifecycle.a(px60Var);
        mx60Var.c.add(px60Var);
    }

    public final void b(mx60 mx60Var) {
        kx60 kx60Var = new kx60(mx60Var, new nx60(null, mx60Var));
        mx60Var.a.add(kx60Var);
        j750.a(this.b, kx60Var);
    }

    public final void c() {
        this.c.a();
    }

    public qx60() {
        this(null);
    }
}
