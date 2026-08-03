package h2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f2696a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2697b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2698c;

    /* renamed from: d, reason: collision with root package name */
    public final r2.q f2699d;

    /* renamed from: e, reason: collision with root package name */
    public final s f2700e;

    /* renamed from: f, reason: collision with root package name */
    public final r2.i f2701f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2702g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2703h;

    /* renamed from: i, reason: collision with root package name */
    public final r2.s f2704i;

    public q(int i10, int i11, long j3, r2.q qVar, s sVar, r2.i iVar, int i12, int i13, r2.s sVar2) {
        this.f2696a = i10;
        this.f2697b = i11;
        this.f2698c = j3;
        this.f2699d = qVar;
        this.f2700e = sVar;
        this.f2701f = iVar;
        this.f2702g = i12;
        this.f2703h = i13;
        this.f2704i = sVar2;
        if (s2.n.a(j3, s2.n.f6401c) || s2.n.c(j3) >= 0.0f) {
            return;
        }
        m2.a.b("lineHeight can't be negative (" + s2.n.c(j3) + ')');
    }

    public final q a(q qVar) {
        return qVar == null ? this : r.a(this, qVar.f2696a, qVar.f2697b, qVar.f2698c, qVar.f2699d, qVar.f2700e, qVar.f2701f, qVar.f2702g, qVar.f2703h, qVar.f2704i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f2696a == qVar.f2696a && this.f2697b == qVar.f2697b && s2.n.a(this.f2698c, qVar.f2698c) && pc.j.a(this.f2699d, qVar.f2699d) && pc.j.a(this.f2700e, qVar.f2700e) && pc.j.a(this.f2701f, qVar.f2701f) && this.f2702g == qVar.f2702g && this.f2703h == qVar.f2703h && pc.j.a(this.f2704i, qVar.f2704i);
    }

    public final int hashCode() {
        int b2 = v.f.b(this.f2697b, Integer.hashCode(this.f2696a) * 31, 31);
        s2.o[] oVarArr = s2.n.f6400b;
        int c3 = a4.d.c(b2, 31, this.f2698c);
        r2.q qVar = this.f2699d;
        int hashCode = (c3 + (qVar != null ? qVar.hashCode() : 0)) * 31;
        s sVar = this.f2700e;
        int hashCode2 = (hashCode + (sVar != null ? sVar.hashCode() : 0)) * 31;
        r2.i iVar = this.f2701f;
        int b10 = v.f.b(this.f2703h, v.f.b(this.f2702g, (hashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31, 31), 31);
        r2.s sVar2 = this.f2704i;
        return b10 + (sVar2 != null ? sVar2.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) r2.k.a(this.f2696a)) + ", textDirection=" + ((Object) r2.m.a(this.f2697b)) + ", lineHeight=" + ((Object) s2.n.d(this.f2698c)) + ", textIndent=" + this.f2699d + ", platformStyle=" + this.f2700e + ", lineHeightStyle=" + this.f2701f + ", lineBreak=" + ((Object) r2.e.a(this.f2702g)) + ", hyphens=" + ((Object) r2.d.a(this.f2703h)) + ", textMotion=" + this.f2704i + ')';
    }
}
