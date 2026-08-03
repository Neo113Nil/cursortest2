package h2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: d, reason: collision with root package name */
    public static final h0 f2673d = new h0(0, null, 0, 0, 16777215);

    /* renamed from: a, reason: collision with root package name */
    public final a0 f2674a;

    /* renamed from: b, reason: collision with root package name */
    public final q f2675b;

    /* renamed from: c, reason: collision with root package name */
    public final t f2676c;

    public h0(a0 a0Var, q qVar, t tVar) {
        this.f2674a = a0Var;
        this.f2675b = qVar;
        this.f2676c = tVar;
    }

    public static h0 a(h0 h0Var, long j3, long j6, k2.l lVar, k2.r rVar, long j10, long j11, r2.i iVar, int i10) {
        long b2 = (i10 & 1) != 0 ? h0Var.f2674a.f2612a.b() : j3;
        long j12 = (i10 & 2) != 0 ? h0Var.f2674a.f2613b : j6;
        k2.l lVar2 = (i10 & 4) != 0 ? h0Var.f2674a.f2614c : lVar;
        a0 a0Var = h0Var.f2674a;
        k2.j jVar = a0Var.f2615d;
        k2.k kVar = a0Var.f2616e;
        k2.r rVar2 = (i10 & 32) != 0 ? a0Var.f2617f : rVar;
        String str = a0Var.f2618g;
        long j13 = (i10 & 128) != 0 ? a0Var.f2619h : j10;
        r2.a aVar = a0Var.f2620i;
        r2.p pVar = a0Var.f2621j;
        n2.b bVar = a0Var.f2622k;
        long j14 = a0Var.f2623l;
        r2.l lVar3 = a0Var.f2624m;
        f1.f0 f0Var = a0Var.f2625n;
        h1.c cVar = a0Var.f2626o;
        q qVar = h0Var.f2675b;
        int i11 = qVar.f2696a;
        int i12 = qVar.f2697b;
        long j15 = (i10 & 131072) != 0 ? qVar.f2698c : j11;
        r2.q qVar2 = qVar.f2699d;
        t tVar = (i10 & 524288) != 0 ? h0Var.f2676c : k0.a.f3585a;
        return new h0(new a0(f1.q.c(b2, a0Var.f2612a.b()) ? a0Var.f2612a : b2 != 16 ? new r2.c(b2) : r2.n.f6036a, j12, lVar2, jVar, kVar, rVar2, str, j13, aVar, pVar, bVar, j14, lVar3, f0Var, cVar), new q(i11, i12, j15, qVar2, tVar != null ? tVar.f2708a : null, (i10 & 1048576) != 0 ? qVar.f2701f : iVar, qVar.f2702g, qVar.f2703h, qVar.f2704i), tVar);
    }

    public static h0 d(h0 h0Var, long j3, long j6, long j10, int i10, long j11, int i11) {
        long j12 = (i11 & 2) != 0 ? s2.n.f6401c : j6;
        long j13 = (i11 & 128) != 0 ? s2.n.f6401c : j10;
        long j14 = f1.q.f2283h;
        int i12 = (32768 & i11) != 0 ? Integer.MIN_VALUE : i10;
        long j15 = (i11 & 131072) != 0 ? s2.n.f6401c : j11;
        a0 a6 = b0.a(h0Var.f2674a, j3, null, Float.NaN, j12, null, null, null, null, null, j13, null, null, null, j14, null, null, null);
        q a8 = r.a(h0Var.f2675b, i12, Integer.MIN_VALUE, j15, null, null, null, 0, Integer.MIN_VALUE, null);
        return (h0Var.f2674a == a6 && h0Var.f2675b == a8) ? h0Var : new h0(a6, a8);
    }

    public final long b() {
        return this.f2674a.f2612a.b();
    }

    public final h0 c(h0 h0Var) {
        return (h0Var == null || h0Var.equals(f2673d)) ? this : new h0(this.f2674a.c(h0Var.f2674a), this.f2675b.a(h0Var.f2675b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return pc.j.a(this.f2674a, h0Var.f2674a) && pc.j.a(this.f2675b, h0Var.f2675b) && pc.j.a(this.f2676c, h0Var.f2676c);
    }

    public final int hashCode() {
        int hashCode = (this.f2675b.hashCode() + (this.f2674a.hashCode() * 31)) * 31;
        t tVar = this.f2676c;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) f1.q.i(b()));
        sb.append(", brush=");
        a0 a0Var = this.f2674a;
        sb.append(a0Var.f2612a.c());
        sb.append(", alpha=");
        sb.append(a0Var.f2612a.a());
        sb.append(", fontSize=");
        sb.append((Object) s2.n.d(a0Var.f2613b));
        sb.append(", fontWeight=");
        sb.append(a0Var.f2614c);
        sb.append(", fontStyle=");
        sb.append(a0Var.f2615d);
        sb.append(", fontSynthesis=");
        sb.append(a0Var.f2616e);
        sb.append(", fontFamily=");
        sb.append(a0Var.f2617f);
        sb.append(", fontFeatureSettings=");
        sb.append(a0Var.f2618g);
        sb.append(", letterSpacing=");
        sb.append((Object) s2.n.d(a0Var.f2619h));
        sb.append(", baselineShift=");
        sb.append(a0Var.f2620i);
        sb.append(", textGeometricTransform=");
        sb.append(a0Var.f2621j);
        sb.append(", localeList=");
        sb.append(a0Var.f2622k);
        sb.append(", background=");
        a4.d.q(a0Var.f2623l, sb, ", textDecoration=");
        sb.append(a0Var.f2624m);
        sb.append(", shadow=");
        sb.append(a0Var.f2625n);
        sb.append(", drawStyle=");
        sb.append(a0Var.f2626o);
        sb.append(", textAlign=");
        q qVar = this.f2675b;
        sb.append((Object) r2.k.a(qVar.f2696a));
        sb.append(", textDirection=");
        sb.append((Object) r2.m.a(qVar.f2697b));
        sb.append(", lineHeight=");
        sb.append((Object) s2.n.d(qVar.f2698c));
        sb.append(", textIndent=");
        sb.append(qVar.f2699d);
        sb.append(", platformStyle=");
        sb.append(this.f2676c);
        sb.append(", lineHeightStyle=");
        sb.append(qVar.f2701f);
        sb.append(", lineBreak=");
        sb.append((Object) r2.e.a(qVar.f2702g));
        sb.append(", hyphens=");
        sb.append((Object) r2.d.a(qVar.f2703h));
        sb.append(", textMotion=");
        sb.append(qVar.f2704i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h0(a0 a0Var, q qVar) {
        this(a0Var, qVar, r0 == null ? null : new t(r0));
        a0Var.getClass();
        s sVar = qVar.f2700e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h0(long j3, k2.l lVar, long j6, long j10, int i10) {
        this(new a0(r1, (i10 & 2) != 0 ? s2.n.f6401c : j3, (i10 & 4) != 0 ? null : lVar, null, null, (i10 & 32) != 0 ? null : k2.r.f3618a, null, (i10 & 128) != 0 ? s2.n.f6401c : j6, null, null, null, r1, null, null), new q(Integer.MIN_VALUE, Integer.MIN_VALUE, (i10 & 131072) != 0 ? s2.n.f6401c : j10, null, null, null, 0, Integer.MIN_VALUE, null), null);
        long j11 = f1.q.f2283h;
    }
}
