package e8;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static final long[] f37314e = new long[0];

    /* renamed from: a, reason: collision with root package name */
    public final c8.e f37315a;

    /* renamed from: b, reason: collision with root package name */
    public final g8.h f37316b;

    /* renamed from: c, reason: collision with root package name */
    public long f37317c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f37318d;

    public r(c8.e descriptor, g8.h hVar) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        this.f37315a = descriptor;
        this.f37316b = hVar;
        int e9 = descriptor.e();
        if (e9 <= 64) {
            this.f37317c = e9 != 64 ? (-1) << e9 : 0L;
            this.f37318d = f37314e;
            return;
        }
        this.f37317c = 0L;
        int i = (e9 - 1) >>> 6;
        long[] jArr = new long[i];
        if ((e9 & 63) != 0) {
            jArr[i - 1] = (-1) << e9;
        }
        this.f37318d = jArr;
    }
}
