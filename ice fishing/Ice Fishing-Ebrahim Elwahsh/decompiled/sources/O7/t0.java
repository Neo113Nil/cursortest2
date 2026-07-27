package O7;

import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class t0 extends T7.s implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final long f2628x;

    public t0(long j9, AbstractC5219c abstractC5219c) {
        super(abstractC5219c, abstractC5219c.getContext());
        this.f2628x = j9;
    }

    @Override // O7.h0
    public final String L() {
        return super.L() + "(timeMillis=" + this.f2628x + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0399y.i(this.f2578v);
        o(new s0("Timed out waiting for " + this.f2628x + " ms", this));
    }
}
