package defpackage;

/* loaded from: classes10.dex */
public final class xdz implements otj0, x7p {
    public static final jdj x = qh91.d(20, new wdz());
    public final c6u0 a = new c6u0();
    public otj0 b;
    public boolean c;
    public boolean w;

    @Override // defpackage.otj0
    public final synchronized void a() {
        this.a.a();
        this.w = true;
        if (!this.c) {
            this.b.a();
            this.b = null;
            x.a0(this);
        }
    }

    @Override // defpackage.otj0
    public final Class b() {
        return this.b.b();
    }

    public final synchronized void c() {
        this.a.a();
        if (!this.c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.c = false;
        if (this.w) {
            a();
        }
    }

    @Override // defpackage.x7p
    public final c6u0 d() {
        return this.a;
    }

    @Override // defpackage.otj0
    public final Object get() {
        return this.b.get();
    }

    @Override // defpackage.otj0
    public final int getSize() {
        return this.b.getSize();
    }
}
