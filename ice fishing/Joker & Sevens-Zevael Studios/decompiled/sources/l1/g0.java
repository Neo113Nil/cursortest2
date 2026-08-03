package l1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g0 extends i0 implements Iterable, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public final String f4005g;

    /* renamed from: h, reason: collision with root package name */
    public final float f4006h;

    /* renamed from: i, reason: collision with root package name */
    public final float f4007i;

    /* renamed from: j, reason: collision with root package name */
    public final float f4008j;

    /* renamed from: k, reason: collision with root package name */
    public final float f4009k;

    /* renamed from: l, reason: collision with root package name */
    public final float f4010l;

    /* renamed from: m, reason: collision with root package name */
    public final float f4011m;

    /* renamed from: n, reason: collision with root package name */
    public final float f4012n;

    /* renamed from: o, reason: collision with root package name */
    public final List f4013o;

    /* renamed from: p, reason: collision with root package name */
    public final List f4014p;

    public g0(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, ArrayList arrayList) {
        this.f4005g = str;
        this.f4006h = f10;
        this.f4007i = f11;
        this.f4008j = f12;
        this.f4009k = f13;
        this.f4010l = f14;
        this.f4011m = f15;
        this.f4012n = f16;
        this.f4013o = list;
        this.f4014p = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g0)) {
            g0 g0Var = (g0) obj;
            return pc.j.a(this.f4005g, g0Var.f4005g) && this.f4006h == g0Var.f4006h && this.f4007i == g0Var.f4007i && this.f4008j == g0Var.f4008j && this.f4009k == g0Var.f4009k && this.f4010l == g0Var.f4010l && this.f4011m == g0Var.f4011m && this.f4012n == g0Var.f4012n && pc.j.a(this.f4013o, g0Var.f4013o) && pc.j.a(this.f4014p, g0Var.f4014p);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4014p.hashCode() + ((this.f4013o.hashCode() + a4.d.b(this.f4012n, a4.d.b(this.f4011m, a4.d.b(this.f4010l, a4.d.b(this.f4009k, a4.d.b(this.f4008j, a4.d.b(this.f4007i, a4.d.b(this.f4006h, this.f4005g.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f0(this);
    }
}
