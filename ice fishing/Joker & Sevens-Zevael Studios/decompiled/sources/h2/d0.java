package h2;

import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final e f2637a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f2638b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2639c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2640d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2641e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2642f;

    /* renamed from: g, reason: collision with root package name */
    public final s2.c f2643g;

    /* renamed from: h, reason: collision with root package name */
    public final s2.l f2644h;

    /* renamed from: i, reason: collision with root package name */
    public final k2.d f2645i;

    /* renamed from: j, reason: collision with root package name */
    public final long f2646j;

    public d0(e eVar, h0 h0Var, List list, int i10, boolean z10, int i11, s2.c cVar, s2.l lVar, k2.d dVar, long j3) {
        this.f2637a = eVar;
        this.f2638b = h0Var;
        this.f2639c = list;
        this.f2640d = i10;
        this.f2641e = z10;
        this.f2642f = i11;
        this.f2643g = cVar;
        this.f2644h = lVar;
        this.f2645i = dVar;
        this.f2646j = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return pc.j.a(this.f2637a, d0Var.f2637a) && pc.j.a(this.f2638b, d0Var.f2638b) && this.f2639c.equals(d0Var.f2639c) && this.f2640d == d0Var.f2640d && this.f2641e == d0Var.f2641e && this.f2642f == d0Var.f2642f && pc.j.a(this.f2643g, d0Var.f2643g) && this.f2644h == d0Var.f2644h && pc.j.a(this.f2645i, d0Var.f2645i) && s2.a.b(this.f2646j, d0Var.f2646j);
    }

    public final int hashCode() {
        return Long.hashCode(this.f2646j) + ((this.f2645i.hashCode() + ((this.f2644h.hashCode() + ((this.f2643g.hashCode() + v.f.b(this.f2642f, a4.d.d((((this.f2639c.hashCode() + ((this.f2638b.hashCode() + (this.f2637a.hashCode() * 31)) * 31)) * 31) + this.f2640d) * 31, 31, this.f2641e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.f2637a);
        sb.append(", style=");
        sb.append(this.f2638b);
        sb.append(", placeholders=");
        sb.append(this.f2639c);
        sb.append(", maxLines=");
        sb.append(this.f2640d);
        sb.append(", softWrap=");
        sb.append(this.f2641e);
        sb.append(", overflow=");
        int i10 = this.f2642f;
        sb.append((Object) (i10 == 1 ? "Clip" : i10 == 2 ? "Ellipsis" : i10 == 5 ? "MiddleEllipsis" : i10 == 3 ? "Visible" : i10 == 4 ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.f2643g);
        sb.append(", layoutDirection=");
        sb.append(this.f2644h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.f2645i);
        sb.append(", constraints=");
        sb.append((Object) s2.a.k(this.f2646j));
        sb.append(')');
        return sb.toString();
    }
}
