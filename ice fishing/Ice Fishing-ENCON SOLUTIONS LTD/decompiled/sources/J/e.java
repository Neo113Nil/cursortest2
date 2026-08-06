package J;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f761a;

    /* renamed from: b, reason: collision with root package name */
    public final long f762b;

    public e(long j2, long j3) {
        if (j3 == 0) {
            this.f761a = 0L;
            this.f762b = 1L;
        } else {
            this.f761a = j2;
            this.f762b = j3;
        }
    }

    public final String toString() {
        return this.f761a + "/" + this.f762b;
    }
}
