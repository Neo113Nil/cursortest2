package defpackage;

/* loaded from: classes.dex */
public final class rqg implements k2o, r3c {
    public static final vx6 e = irf.U(20, new bs4(27));
    public final uer a = new uer();
    public k2o b;
    public boolean c;
    public boolean d;

    public final synchronized void a() {
        this.a.a();
        if (!this.c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.c = false;
        if (this.d) {
            g();
        }
    }

    @Override // defpackage.r3c
    public final uer b() {
        return this.a;
    }

    @Override // defpackage.k2o
    public final int f() {
        return this.b.f();
    }

    @Override // defpackage.k2o
    public final synchronized void g() {
        this.a.a();
        this.d = true;
        if (!this.c) {
            this.b.g();
            this.b = null;
            e.c(this);
        }
    }

    @Override // defpackage.k2o
    public final Object get() {
        return this.b.get();
    }

    @Override // defpackage.k2o
    public final Class h() {
        return this.b.h();
    }
}
