package O7;

/* loaded from: classes2.dex */
public final class L extends M {

    /* renamed from: v, reason: collision with root package name */
    public final t0 f2560v;

    public L(long j9, t0 t0Var) {
        super(j9);
        this.f2560v = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2560v.run();
    }

    @Override // O7.M
    public final String toString() {
        return super.toString() + this.f2560v;
    }
}
