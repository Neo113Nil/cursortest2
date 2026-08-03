package l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: k, reason: collision with root package name */
    public static int f3988k;

    /* renamed from: l, reason: collision with root package name */
    public static final p6.i f3989l = new p6.i();

    /* renamed from: a, reason: collision with root package name */
    public final String f3990a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3991b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3992c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3993d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3994e;

    /* renamed from: f, reason: collision with root package name */
    public final g0 f3995f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3996g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3997h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3998i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3999j;

    public f(String str, float f10, float f11, float f12, float f13, g0 g0Var, long j3, int i10, boolean z10) {
        int i11;
        synchronized (f3989l) {
            i11 = f3988k;
            f3988k = i11 + 1;
        }
        this.f3990a = str;
        this.f3991b = f10;
        this.f3992c = f11;
        this.f3993d = f12;
        this.f3994e = f13;
        this.f3995f = g0Var;
        this.f3996g = j3;
        this.f3997h = i10;
        this.f3998i = z10;
        this.f3999j = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return pc.j.a(this.f3990a, fVar.f3990a) && s2.f.a(this.f3991b, fVar.f3991b) && s2.f.a(this.f3992c, fVar.f3992c) && this.f3993d == fVar.f3993d && this.f3994e == fVar.f3994e && this.f3995f.equals(fVar.f3995f) && f1.q.c(this.f3996g, fVar.f3996g) && this.f3997h == fVar.f3997h && this.f3998i == fVar.f3998i;
    }

    public final int hashCode() {
        int hashCode = (this.f3995f.hashCode() + a4.d.b(this.f3994e, a4.d.b(this.f3993d, a4.d.b(this.f3992c, a4.d.b(this.f3991b, this.f3990a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i10 = f1.q.f2284i;
        return Boolean.hashCode(this.f3998i) + v.f.b(this.f3997h, a4.d.c(hashCode, 31, this.f3996g), 31);
    }
}
