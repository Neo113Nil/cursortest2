package S7;

import v7.C5117h;

/* loaded from: classes2.dex */
public abstract class P extends AbstractC0406u {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f3014y = 0;

    /* renamed from: v, reason: collision with root package name */
    public long f3015v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3016w;

    /* renamed from: x, reason: collision with root package name */
    public C5117h f3017x;

    public final void A(boolean z6) {
        long j6 = this.f3015v - (z6 ? 4294967296L : 1L);
        this.f3015v = j6;
        if (j6 <= 0 && this.f3016w) {
            shutdown();
        }
    }

    public final void B(E e9) {
        C5117h c5117h = this.f3017x;
        if (c5117h == null) {
            c5117h = new C5117h();
            this.f3017x = c5117h;
        }
        c5117h.addLast(e9);
    }

    public abstract Thread C();

    public final void D(boolean z6) {
        this.f3015v = (z6 ? 4294967296L : 1L) + this.f3015v;
        if (z6) {
            return;
        }
        this.f3016w = true;
    }

    public abstract long E();

    public final boolean F() {
        C5117h c5117h = this.f3017x;
        if (c5117h == null) {
            return false;
        }
        E e9 = (E) (c5117h.isEmpty() ? null : c5117h.removeFirst());
        if (e9 == null) {
            return false;
        }
        e9.run();
        return true;
    }

    public void G(long j6, M m9) {
        RunnableC0411z.f3099C.K(j6, m9);
    }

    public abstract void shutdown();
}
