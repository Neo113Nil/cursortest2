package A1;

import i1.C0250g;

/* loaded from: classes.dex */
public abstract class J extends AbstractC0018t {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f9f = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f10c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11d;

    /* renamed from: e, reason: collision with root package name */
    public C0250g f12e;

    public final void o(boolean z2) {
        long j2 = this.f10c - (z2 ? 4294967296L : 1L);
        this.f10c = j2;
        if (j2 <= 0 && this.f11d) {
            t();
        }
    }

    public abstract Thread p();

    public final void q(boolean z2) {
        this.f10c = (z2 ? 4294967296L : 1L) + this.f10c;
        if (z2) {
            return;
        }
        this.f11d = true;
    }

    public abstract long r();

    public final boolean s() {
        C0250g c0250g = this.f12e;
        if (c0250g == null) {
            return false;
        }
        C c2 = (C) (c0250g.isEmpty() ? null : c0250g.removeFirst());
        if (c2 == null) {
            return false;
        }
        c2.run();
        return true;
    }

    public abstract void t();
}
