package H;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f355a;

    /* renamed from: b, reason: collision with root package name */
    public final long f356b;

    public e(long j2, long j3) {
        if (j3 == 0) {
            this.f355a = 0L;
            this.f356b = 1L;
        } else {
            this.f355a = j2;
            this.f356b = j3;
        }
    }

    public final String toString() {
        return this.f355a + "/" + this.f356b;
    }
}
