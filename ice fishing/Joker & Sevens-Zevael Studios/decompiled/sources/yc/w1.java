package yc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w1 extends dd.t implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final long f8913k;

    public w1(long j3, hc.c cVar) {
        super(cVar, cVar.getContext());
        this.f8913k = j3;
    }

    @Override // yc.k1
    public final String U() {
        return super.U() + "(timeMillis=" + this.f8913k + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        a0.i(this.f8817i);
        A(new v1("Timed out waiting for " + this.f8913k + " ms", this));
    }
}
