package d0;

/* renamed from: d0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4438e {

    /* renamed from: a, reason: collision with root package name */
    public final long f36981a;

    /* renamed from: b, reason: collision with root package name */
    public final long f36982b;

    public C4438e(long j6, long j9) {
        if (j9 == 0) {
            this.f36981a = 0L;
            this.f36982b = 1L;
        } else {
            this.f36981a = j6;
            this.f36982b = j9;
        }
    }

    public final String toString() {
        return this.f36981a + "/" + this.f36982b;
    }
}
