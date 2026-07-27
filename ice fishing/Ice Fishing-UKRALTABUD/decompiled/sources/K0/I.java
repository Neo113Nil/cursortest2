package K0;

/* loaded from: classes.dex */
public abstract class I extends AbstractC0043t {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f470k = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f471h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f472i;

    /* renamed from: j, reason: collision with root package name */
    public u0.b f473j;

    public final void e(boolean z2) {
        long j2 = this.f471h - (z2 ? 4294967296L : 1L);
        this.f471h = j2;
        if (j2 <= 0 && this.f472i) {
            n();
        }
    }

    public abstract Thread h();

    public final void j(boolean z2) {
        this.f471h = (z2 ? 4294967296L : 1L) + this.f471h;
        if (z2) {
            return;
        }
        this.f472i = true;
    }

    public abstract long k();

    public final boolean l() {
        u0.b bVar = this.f473j;
        if (bVar == null) {
            return false;
        }
        B b2 = (B) (bVar.isEmpty() ? null : bVar.removeFirst());
        if (b2 == null) {
            return false;
        }
        b2.run();
        return true;
    }

    public abstract void n();
}
