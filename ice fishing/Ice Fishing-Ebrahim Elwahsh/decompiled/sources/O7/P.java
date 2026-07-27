package O7;

import r7.C4977h;

/* loaded from: classes2.dex */
public abstract class P extends AbstractC0395u {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f2567y = 0;

    /* renamed from: v, reason: collision with root package name */
    public long f2568v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2569w;

    /* renamed from: x, reason: collision with root package name */
    public C4977h f2570x;

    public final void A(boolean z8) {
        long j9 = this.f2568v - (z8 ? 4294967296L : 1L);
        this.f2568v = j9;
        if (j9 <= 0 && this.f2569w) {
            shutdown();
        }
    }

    public final void B(E e6) {
        C4977h c4977h = this.f2570x;
        if (c4977h == null) {
            c4977h = new C4977h();
            this.f2570x = c4977h;
        }
        c4977h.addLast(e6);
    }

    public abstract Thread C();

    public final void D(boolean z8) {
        this.f2568v = (z8 ? 4294967296L : 1L) + this.f2568v;
        if (z8) {
            return;
        }
        this.f2569w = true;
    }

    public abstract long E();

    public final boolean F() {
        C4977h c4977h = this.f2570x;
        if (c4977h == null) {
            return false;
        }
        E e6 = (E) (c4977h.isEmpty() ? null : c4977h.removeFirst());
        if (e6 == null) {
            return false;
        }
        e6.run();
        return true;
    }

    public void G(long j9, M m8) {
        RunnableC0400z.f2652C.K(j9, m8);
    }

    public abstract void shutdown();
}
