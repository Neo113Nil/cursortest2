package j0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float f3291a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f3292b;

    static {
        float f10 = 24;
        float f11 = 8;
        new z.c0(f10, f11, f10, f11);
        float f12 = 16;
        if (f12 < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative");
        }
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative");
        }
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative");
        }
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative");
        }
        float f13 = 12;
        if (f13 < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative");
        }
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative");
        }
        if (f13 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative");
        }
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative");
        }
        if (f13 < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative");
        }
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative");
        }
        if (f12 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative");
        }
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative");
        }
        f3291a = 58;
        f3292b = 40;
        int i10 = l0.d.f3812a;
    }

    public static a a(long j3, m0.r rVar) {
        long j6 = f1.q.f2283h;
        j jVar = (j) rVar.j(l.f3404a);
        a aVar = jVar.K;
        if (aVar == null) {
            int i10 = l0.d.f3812a;
            a aVar2 = new a(l.c(jVar, 26), l.c(jVar, l0.d.f3814c), f1.q.b(l.c(jVar, l0.d.f3812a), 0.12f), f1.q.b(l.c(jVar, l0.d.f3813b), 0.38f));
            jVar.K = aVar2;
            aVar = aVar2;
        }
        long j10 = j3 != 16 ? j3 : aVar.f3285a;
        long j11 = j6 != 16 ? j6 : aVar.f3286b;
        long j12 = j6 != 16 ? j6 : aVar.f3287c;
        if (j6 == 16) {
            j6 = aVar.f3288d;
        }
        return new a(j10, j11, j12, j6);
    }
}
