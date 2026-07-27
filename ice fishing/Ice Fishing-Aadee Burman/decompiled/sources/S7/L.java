package S7;

/* loaded from: classes2.dex */
public final class L extends M {

    /* renamed from: v, reason: collision with root package name */
    public final t0 f2924v;

    public L(long j6, t0 t0Var) {
        super(j6);
        this.f2924v = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2924v.run();
    }

    @Override // S7.M
    public final String toString() {
        return super.toString() + this.f2924v;
    }
}
