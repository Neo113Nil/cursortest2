package L1;

/* loaded from: classes.dex */
public abstract class E extends AbstractC0015p {

    /* renamed from: c, reason: collision with root package name */
    public long f529c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f530d;
    public u1.e e;

    public final void h() {
        long j = this.f529c - 4294967296L;
        this.f529c = j;
        if (j <= 0 && this.f530d) {
            l();
        }
    }

    public abstract Thread i();

    public final void j(boolean z2) {
        this.f529c = (z2 ? 4294967296L : 1L) + this.f529c;
        if (z2) {
            return;
        }
        this.f530d = true;
    }

    public final boolean k() {
        u1.e eVar = this.e;
        if (eVar == null) {
            return false;
        }
        AbstractC0022x abstractC0022x = (AbstractC0022x) (eVar.isEmpty() ? null : eVar.removeFirst());
        if (abstractC0022x == null) {
            return false;
        }
        abstractC0022x.run();
        return true;
    }

    public abstract void l();
}
