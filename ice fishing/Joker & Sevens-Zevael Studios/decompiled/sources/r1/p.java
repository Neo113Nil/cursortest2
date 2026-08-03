package r1;

import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final long f5981a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5982b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5983c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5984d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5985e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5986f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5987g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5988h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f5989i;

    /* renamed from: j, reason: collision with root package name */
    public final long f5990j;

    /* renamed from: k, reason: collision with root package name */
    public final long f5991k;

    public p(long j3, long j6, long j10, long j11, boolean z10, float f10, int i10, boolean z11, ArrayList arrayList, long j12, long j13) {
        this.f5981a = j3;
        this.f5982b = j6;
        this.f5983c = j10;
        this.f5984d = j11;
        this.f5985e = z10;
        this.f5986f = f10;
        this.f5987g = i10;
        this.f5988h = z11;
        this.f5989i = arrayList;
        this.f5990j = j12;
        this.f5991k = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return m.a(this.f5981a, pVar.f5981a) && this.f5982b == pVar.f5982b && e1.b.b(this.f5983c, pVar.f5983c) && e1.b.b(this.f5984d, pVar.f5984d) && this.f5985e == pVar.f5985e && Float.compare(this.f5986f, pVar.f5986f) == 0 && this.f5987g == pVar.f5987g && this.f5988h == pVar.f5988h && this.f5989i.equals(pVar.f5989i) && e1.b.b(this.f5990j, pVar.f5990j) && e1.b.b(this.f5991k, pVar.f5991k);
    }

    public final int hashCode() {
        return Long.hashCode(this.f5991k) + a4.d.c((this.f5989i.hashCode() + a4.d.d(v.f.b(this.f5987g, a4.d.b(this.f5986f, a4.d.d(a4.d.c(a4.d.c(a4.d.c(Long.hashCode(this.f5981a) * 31, 31, this.f5982b), 31, this.f5983c), 31, this.f5984d), 31, this.f5985e), 31), 31), 31, this.f5988h)) * 31, 31, this.f5990j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) m.b(this.f5981a));
        sb.append(", uptime=");
        sb.append(this.f5982b);
        sb.append(", positionOnScreen=");
        sb.append((Object) e1.b.i(this.f5983c));
        sb.append(", position=");
        sb.append((Object) e1.b.i(this.f5984d));
        sb.append(", down=");
        sb.append(this.f5985e);
        sb.append(", pressure=");
        sb.append(this.f5986f);
        sb.append(", type=");
        int i10 = this.f5987g;
        sb.append((Object) (i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", activeHover=");
        sb.append(this.f5988h);
        sb.append(", historical=");
        sb.append(this.f5989i);
        sb.append(", scrollDelta=");
        sb.append((Object) e1.b.i(this.f5990j));
        sb.append(", originalEventPosition=");
        sb.append((Object) e1.b.i(this.f5991k));
        sb.append(')');
        return sb.toString();
    }
}
