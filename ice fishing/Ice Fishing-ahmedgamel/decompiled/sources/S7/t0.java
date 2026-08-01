package S7;

/* loaded from: classes2.dex */
public final class t0 extends X7.s implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final long f2992x;

    public t0(long j6, B7.c cVar) {
        super(cVar, cVar.getContext());
        this.f2992x = j6;
    }

    @Override // S7.h0
    public final String L() {
        return super.L() + "(timeMillis=" + this.f2992x + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0406y.i(this.f2942v);
        o(new s0("Timed out waiting for " + this.f2992x + " ms", this));
    }
}
