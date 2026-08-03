package l1;

import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k0 extends i0 {

    /* renamed from: g, reason: collision with root package name */
    public final String f4056g;

    /* renamed from: h, reason: collision with root package name */
    public final List f4057h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4058i;

    /* renamed from: j, reason: collision with root package name */
    public final f1.d0 f4059j;

    /* renamed from: k, reason: collision with root package name */
    public final float f4060k;

    /* renamed from: l, reason: collision with root package name */
    public final f1.d0 f4061l;

    /* renamed from: m, reason: collision with root package name */
    public final float f4062m;

    /* renamed from: n, reason: collision with root package name */
    public final float f4063n;

    /* renamed from: o, reason: collision with root package name */
    public final int f4064o;

    /* renamed from: p, reason: collision with root package name */
    public final int f4065p;

    /* renamed from: q, reason: collision with root package name */
    public final float f4066q;

    /* renamed from: r, reason: collision with root package name */
    public final float f4067r;

    /* renamed from: s, reason: collision with root package name */
    public final float f4068s;

    /* renamed from: t, reason: collision with root package name */
    public final float f4069t;

    public k0(String str, List list, int i10, f1.d0 d0Var, float f10, f1.d0 d0Var2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
        this.f4056g = str;
        this.f4057h = list;
        this.f4058i = i10;
        this.f4059j = d0Var;
        this.f4060k = f10;
        this.f4061l = d0Var2;
        this.f4062m = f11;
        this.f4063n = f12;
        this.f4064o = i11;
        this.f4065p = i12;
        this.f4066q = f13;
        this.f4067r = f14;
        this.f4068s = f15;
        this.f4069t = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k0.class == obj.getClass()) {
            k0 k0Var = (k0) obj;
            return pc.j.a(this.f4056g, k0Var.f4056g) && pc.j.a(this.f4059j, k0Var.f4059j) && this.f4060k == k0Var.f4060k && pc.j.a(this.f4061l, k0Var.f4061l) && this.f4062m == k0Var.f4062m && this.f4063n == k0Var.f4063n && this.f4064o == k0Var.f4064o && this.f4065p == k0Var.f4065p && this.f4066q == k0Var.f4066q && this.f4067r == k0Var.f4067r && this.f4068s == k0Var.f4068s && this.f4069t == k0Var.f4069t && this.f4058i == k0Var.f4058i && pc.j.a(this.f4057h, k0Var.f4057h);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f4057h.hashCode() + (this.f4056g.hashCode() * 31)) * 31;
        f1.d0 d0Var = this.f4059j;
        int b2 = a4.d.b(this.f4060k, (hashCode + (d0Var != null ? d0Var.hashCode() : 0)) * 31, 31);
        f1.d0 d0Var2 = this.f4061l;
        return Integer.hashCode(this.f4058i) + a4.d.b(this.f4069t, a4.d.b(this.f4068s, a4.d.b(this.f4067r, a4.d.b(this.f4066q, v.f.b(this.f4065p, v.f.b(this.f4064o, a4.d.b(this.f4063n, a4.d.b(this.f4062m, (b2 + (d0Var2 != null ? d0Var2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
