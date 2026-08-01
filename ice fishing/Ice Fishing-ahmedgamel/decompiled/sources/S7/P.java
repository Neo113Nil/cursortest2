package S7;

import v7.C5127h;

/* loaded from: classes2.dex */
public abstract class P extends AbstractC0402u {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f2931y = 0;

    /* renamed from: v, reason: collision with root package name */
    public long f2932v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2933w;

    /* renamed from: x, reason: collision with root package name */
    public C5127h f2934x;

    public final void A(boolean z3) {
        long j6 = this.f2932v - (z3 ? 4294967296L : 1L);
        this.f2932v = j6;
        if (j6 <= 0 && this.f2933w) {
            shutdown();
        }
    }

    public final void B(E e9) {
        C5127h c5127h = this.f2934x;
        if (c5127h == null) {
            c5127h = new C5127h();
            this.f2934x = c5127h;
        }
        c5127h.addLast(e9);
    }

    public abstract Thread C();

    public final void D(boolean z3) {
        this.f2932v = (z3 ? 4294967296L : 1L) + this.f2932v;
        if (z3) {
            return;
        }
        this.f2933w = true;
    }

    public abstract long E();

    public final boolean F() {
        C5127h c5127h = this.f2934x;
        if (c5127h == null) {
            return false;
        }
        E e9 = (E) (c5127h.isEmpty() ? null : c5127h.removeFirst());
        if (e9 == null) {
            return false;
        }
        e9.run();
        return true;
    }

    public void G(long j6, M m4) {
        RunnableC0407z.f3016C.K(j6, m4);
    }

    public abstract void shutdown();
}
