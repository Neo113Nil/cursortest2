package o4;

import bc.x;
import java.util.Set;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: i, reason: collision with root package name */
    public static final d f5195i = new d(1, false, false, false, false, -1, -1, x.f1069g);

    /* renamed from: a, reason: collision with root package name */
    public final int f5196a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5197b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5198c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5199d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5200e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5201f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5202g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f5203h;

    public d(int i10, boolean z10, boolean z11, boolean z12, boolean z13, long j3, long j6, Set set) {
        a4.d.t("requiredNetworkType", i10);
        pc.j.e(set, "contentUriTriggers");
        this.f5196a = i10;
        this.f5197b = z10;
        this.f5198c = z11;
        this.f5199d = z12;
        this.f5200e = z13;
        this.f5201f = j3;
        this.f5202g = j6;
        this.f5203h = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !d.class.equals(obj.getClass())) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f5197b == dVar.f5197b && this.f5198c == dVar.f5198c && this.f5199d == dVar.f5199d && this.f5200e == dVar.f5200e && this.f5201f == dVar.f5201f && this.f5202g == dVar.f5202g && this.f5196a == dVar.f5196a) {
            return pc.j.a(this.f5203h, dVar.f5203h);
        }
        return false;
    }

    public final int hashCode() {
        int d10 = ((((((((v.f.d(this.f5196a) * 31) + (this.f5197b ? 1 : 0)) * 31) + (this.f5198c ? 1 : 0)) * 31) + (this.f5199d ? 1 : 0)) * 31) + (this.f5200e ? 1 : 0)) * 31;
        long j3 = this.f5201f;
        int i10 = (d10 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j6 = this.f5202g;
        return this.f5203h.hashCode() + ((i10 + ((int) (j6 ^ (j6 >>> 32)))) * 31);
    }
}
