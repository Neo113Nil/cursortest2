package yc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class s0 extends u {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f8900l = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f8901i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8902j;

    /* renamed from: k, reason: collision with root package name */
    public bc.k f8903k;

    public final void A(h0 h0Var) {
        bc.k kVar = this.f8903k;
        if (kVar == null) {
            kVar = new bc.k();
            this.f8903k = kVar;
        }
        kVar.addLast(h0Var);
    }

    public abstract Thread B();

    public final void C(boolean z10) {
        this.f8901i = (z10 ? 4294967296L : 1L) + this.f8901i;
        if (z10) {
            return;
        }
        this.f8902j = true;
    }

    public abstract long D();

    public final boolean E() {
        bc.k kVar = this.f8903k;
        if (kVar == null) {
            return false;
        }
        h0 h0Var = (h0) (kVar.isEmpty() ? null : kVar.removeFirst());
        if (h0Var == null) {
            return false;
        }
        h0Var.run();
        return true;
    }

    public void F(long j3, p0 p0Var) {
        b0.f8832p.J(j3, p0Var);
    }

    public abstract void shutdown();

    public final void z(boolean z10) {
        long j3 = this.f8901i - (z10 ? 4294967296L : 1L);
        this.f8901i = j3;
        if (j3 <= 0 && this.f8902j) {
            shutdown();
        }
    }
}
