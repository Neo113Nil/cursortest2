package a8;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static final long[] f4499e = new long[0];

    /* renamed from: a, reason: collision with root package name */
    public final Y7.e f4500a;

    /* renamed from: b, reason: collision with root package name */
    public final c8.i f4501b;

    /* renamed from: c, reason: collision with root package name */
    public long f4502c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f4503d;

    public r(Y7.e descriptor, c8.i iVar) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        this.f4500a = descriptor;
        this.f4501b = iVar;
        int e6 = descriptor.e();
        if (e6 <= 64) {
            this.f4502c = e6 != 64 ? (-1) << e6 : 0L;
            this.f4503d = f4499e;
            return;
        }
        this.f4502c = 0L;
        int i = (e6 - 1) >>> 6;
        long[] jArr = new long[i];
        if ((e6 & 63) != 0) {
            jArr[i - 1] = (-1) << e6;
        }
        this.f4503d = jArr;
    }
}
