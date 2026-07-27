package L0;

/* loaded from: classes.dex */
public abstract class I extends AbstractC0061t {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f618j = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f619g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f620h;

    /* renamed from: i, reason: collision with root package name */
    public u0.b f621i;

    public final void e(boolean z2) {
        long j2 = this.f619g - (z2 ? 4294967296L : 1L);
        this.f619g = j2;
        if (j2 <= 0 && this.f620h) {
            n();
        }
    }

    public abstract Thread h();

    public final void j(boolean z2) {
        this.f619g = (z2 ? 4294967296L : 1L) + this.f619g;
        if (z2) {
            return;
        }
        this.f620h = true;
    }

    public abstract long k();

    public final boolean l() {
        u0.b bVar = this.f621i;
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
