package h2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a0 implements b {

    /* renamed from: a, reason: collision with root package name */
    public final r2.o f2612a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2613b;

    /* renamed from: c, reason: collision with root package name */
    public final k2.l f2614c;

    /* renamed from: d, reason: collision with root package name */
    public final k2.j f2615d;

    /* renamed from: e, reason: collision with root package name */
    public final k2.k f2616e;

    /* renamed from: f, reason: collision with root package name */
    public final k2.r f2617f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2618g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2619h;

    /* renamed from: i, reason: collision with root package name */
    public final r2.a f2620i;

    /* renamed from: j, reason: collision with root package name */
    public final r2.p f2621j;

    /* renamed from: k, reason: collision with root package name */
    public final n2.b f2622k;

    /* renamed from: l, reason: collision with root package name */
    public final long f2623l;

    /* renamed from: m, reason: collision with root package name */
    public final r2.l f2624m;

    /* renamed from: n, reason: collision with root package name */
    public final f1.f0 f2625n;

    /* renamed from: o, reason: collision with root package name */
    public final h1.c f2626o;

    public a0(long j3, long j6, k2.l lVar, k2.j jVar, k2.k kVar, k2.r rVar, String str, long j10, r2.a aVar, r2.p pVar, n2.b bVar, long j11, r2.l lVar2, f1.f0 f0Var) {
        this(j3 != 16 ? new r2.c(j3) : r2.n.f6036a, j6, lVar, jVar, kVar, rVar, str, j10, aVar, pVar, bVar, j11, lVar2, f0Var, (h1.c) null);
    }

    public final boolean a(a0 a0Var) {
        if (this == a0Var) {
            return true;
        }
        return s2.n.a(this.f2613b, a0Var.f2613b) && pc.j.a(this.f2614c, a0Var.f2614c) && pc.j.a(this.f2615d, a0Var.f2615d) && pc.j.a(this.f2616e, a0Var.f2616e) && pc.j.a(this.f2617f, a0Var.f2617f) && pc.j.a(this.f2618g, a0Var.f2618g) && s2.n.a(this.f2619h, a0Var.f2619h) && pc.j.a(this.f2620i, a0Var.f2620i) && pc.j.a(this.f2621j, a0Var.f2621j) && pc.j.a(this.f2622k, a0Var.f2622k) && f1.q.c(this.f2623l, a0Var.f2623l);
    }

    public final boolean b(a0 a0Var) {
        return pc.j.a(this.f2612a, a0Var.f2612a) && pc.j.a(this.f2624m, a0Var.f2624m) && pc.j.a(this.f2625n, a0Var.f2625n) && pc.j.a(this.f2626o, a0Var.f2626o);
    }

    public final a0 c(a0 a0Var) {
        if (a0Var == null) {
            return this;
        }
        r2.o oVar = a0Var.f2612a;
        return b0.a(this, oVar.b(), oVar.c(), oVar.a(), a0Var.f2613b, a0Var.f2614c, a0Var.f2615d, a0Var.f2616e, a0Var.f2617f, a0Var.f2618g, a0Var.f2619h, a0Var.f2620i, a0Var.f2621j, a0Var.f2622k, a0Var.f2623l, a0Var.f2624m, a0Var.f2625n, a0Var.f2626o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return a(a0Var) && b(a0Var);
    }

    public final int hashCode() {
        r2.o oVar = this.f2612a;
        long b2 = oVar.b();
        int i10 = f1.q.f2284i;
        int hashCode = Long.hashCode(b2) * 31;
        f1.d0 c3 = oVar.c();
        int hashCode2 = (Float.hashCode(oVar.a()) + ((hashCode + (c3 != null ? c3.hashCode() : 0)) * 31)) * 31;
        s2.o[] oVarArr = s2.n.f6400b;
        int c7 = a4.d.c(hashCode2, 31, this.f2613b);
        k2.l lVar = this.f2614c;
        int i11 = (c7 + (lVar != null ? lVar.f3615g : 0)) * 31;
        k2.j jVar = this.f2615d;
        int hashCode3 = (i11 + (jVar != null ? Integer.hashCode(jVar.f3609a) : 0)) * 31;
        k2.k kVar = this.f2616e;
        int hashCode4 = (hashCode3 + (kVar != null ? Integer.hashCode(kVar.f3610a) : 0)) * 31;
        k2.r rVar = this.f2617f;
        int hashCode5 = (hashCode4 + (rVar != null ? rVar.hashCode() : 0)) * 31;
        String str = this.f2618g;
        int c10 = a4.d.c((hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f2619h);
        r2.a aVar = this.f2620i;
        int hashCode6 = (c10 + (aVar != null ? Float.hashCode(aVar.f6013a) : 0)) * 31;
        r2.p pVar = this.f2621j;
        int hashCode7 = (hashCode6 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        n2.b bVar = this.f2622k;
        int c11 = a4.d.c((hashCode7 + (bVar != null ? bVar.f5042g.hashCode() : 0)) * 31, 31, this.f2623l);
        r2.l lVar2 = this.f2624m;
        int i12 = (c11 + (lVar2 != null ? lVar2.f6034a : 0)) * 31;
        f1.f0 f0Var = this.f2625n;
        int hashCode8 = (i12 + (f0Var != null ? f0Var.hashCode() : 0)) * 961;
        h1.c cVar = this.f2626o;
        return hashCode8 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        r2.o oVar = this.f2612a;
        sb.append((Object) f1.q.i(oVar.b()));
        sb.append(", brush=");
        sb.append(oVar.c());
        sb.append(", alpha=");
        sb.append(oVar.a());
        sb.append(", fontSize=");
        sb.append((Object) s2.n.d(this.f2613b));
        sb.append(", fontWeight=");
        sb.append(this.f2614c);
        sb.append(", fontStyle=");
        sb.append(this.f2615d);
        sb.append(", fontSynthesis=");
        sb.append(this.f2616e);
        sb.append(", fontFamily=");
        sb.append(this.f2617f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f2618g);
        sb.append(", letterSpacing=");
        sb.append((Object) s2.n.d(this.f2619h));
        sb.append(", baselineShift=");
        sb.append(this.f2620i);
        sb.append(", textGeometricTransform=");
        sb.append(this.f2621j);
        sb.append(", localeList=");
        sb.append(this.f2622k);
        sb.append(", background=");
        a4.d.q(this.f2623l, sb, ", textDecoration=");
        sb.append(this.f2624m);
        sb.append(", shadow=");
        sb.append(this.f2625n);
        sb.append(", platformStyle=null, drawStyle=");
        sb.append(this.f2626o);
        sb.append(')');
        return sb.toString();
    }

    public a0(r2.o oVar, long j3, k2.l lVar, k2.j jVar, k2.k kVar, k2.r rVar, String str, long j6, r2.a aVar, r2.p pVar, n2.b bVar, long j10, r2.l lVar2, f1.f0 f0Var, h1.c cVar) {
        this.f2612a = oVar;
        this.f2613b = j3;
        this.f2614c = lVar;
        this.f2615d = jVar;
        this.f2616e = kVar;
        this.f2617f = rVar;
        this.f2618g = str;
        this.f2619h = j6;
        this.f2620i = aVar;
        this.f2621j = pVar;
        this.f2622k = bVar;
        this.f2623l = j10;
        this.f2624m = lVar2;
        this.f2625n = f0Var;
        this.f2626o = cVar;
    }

    public a0(long j3, long j6, k2.l lVar, k2.j jVar, k2.k kVar, k2.r rVar, String str, long j10, r2.a aVar, r2.p pVar, n2.b bVar, long j11, r2.l lVar2, f1.f0 f0Var, int i10) {
        this((i10 & 1) != 0 ? f1.q.f2283h : j3, (i10 & 2) != 0 ? s2.n.f6401c : j6, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : jVar, (i10 & 16) != 0 ? null : kVar, (i10 & 32) != 0 ? null : rVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? s2.n.f6401c : j10, (i10 & 256) != 0 ? null : aVar, (i10 & 512) != 0 ? null : pVar, (i10 & 1024) != 0 ? null : bVar, (i10 & 2048) != 0 ? f1.q.f2283h : j11, (i10 & 4096) != 0 ? null : lVar2, (i10 & 8192) != 0 ? null : f0Var);
    }
}
