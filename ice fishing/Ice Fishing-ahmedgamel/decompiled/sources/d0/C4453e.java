package d0;

/* renamed from: d0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4453e {

    /* renamed from: a, reason: collision with root package name */
    public final long f37134a;

    /* renamed from: b, reason: collision with root package name */
    public final long f37135b;

    public C4453e(long j6, long j9) {
        if (j9 == 0) {
            this.f37134a = 0L;
            this.f37135b = 1L;
        } else {
            this.f37134a = j6;
            this.f37135b = j9;
        }
    }

    public final String toString() {
        return this.f37134a + "/" + this.f37135b;
    }
}
