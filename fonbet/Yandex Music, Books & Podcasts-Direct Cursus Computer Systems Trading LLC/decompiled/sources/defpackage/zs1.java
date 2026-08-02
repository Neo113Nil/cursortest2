package defpackage;

/* loaded from: classes5.dex */
public final class zs1 extends bt1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ct1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs1(ct1 ct1Var, int i) {
        super(0, ct1Var);
        this.c = i;
        switch (i) {
            case 1:
                this.d = ct1Var;
                super(0, ct1Var);
                jkk.b();
                break;
            default:
                this.d = ct1Var;
                jkk.b();
                break;
        }
    }

    @Override // defpackage.bt1
    public final void a() {
        ct1 ct1Var;
        int i;
        ct1 ct1Var2;
        switch (this.c) {
            case 0:
                hi3 hi3Var = new hi3();
                jkk.c();
                try {
                    jee jeeVar = jkk.a;
                    jeeVar.getClass();
                    synchronized (this.d.a) {
                        hi3 hi3Var2 = this.d.b;
                        hi3Var.t0(hi3Var2, hi3Var2.H());
                        ct1Var = this.d;
                        ct1Var.f = false;
                        i = ct1Var.m;
                    }
                    ct1Var.i.t0(hi3Var, hi3Var.b);
                    synchronized (this.d.a) {
                        this.d.m -= i;
                    }
                    jeeVar.getClass();
                    return;
                } catch (Throwable th) {
                    try {
                        jkk.a.getClass();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                hi3 hi3Var3 = new hi3();
                jkk.c();
                try {
                    jee jeeVar2 = jkk.a;
                    jeeVar2.getClass();
                    synchronized (this.d.a) {
                        hi3 hi3Var4 = this.d.b;
                        hi3Var3.t0(hi3Var4, hi3Var4.b);
                        ct1Var2 = this.d;
                        ct1Var2.g = false;
                    }
                    ct1Var2.i.t0(hi3Var3, hi3Var3.b);
                    this.d.i.flush();
                    jeeVar2.getClass();
                    return;
                } catch (Throwable th3) {
                    try {
                        jkk.a.getClass();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
        }
    }
}
