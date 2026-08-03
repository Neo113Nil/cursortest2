package k1;

import f1.g;
import f1.l;
import h1.d;
import pc.j;
import s2.i;
import s2.k;
import x1.i0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: e, reason: collision with root package name */
    public final g f3589e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3590f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3591g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final long f3592h;

    /* renamed from: i, reason: collision with root package name */
    public float f3593i;

    /* renamed from: j, reason: collision with root package name */
    public l f3594j;

    public a(g gVar) {
        int i10;
        int i11;
        long width = (gVar.f2252a.getWidth() << 32) | (gVar.f2252a.getHeight() & 4294967295L);
        this.f3589e = gVar;
        this.f3590f = width;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i10 = (int) (width >> 32)) < 0 || (i11 = (int) (width & 4294967295L)) < 0 || i10 > gVar.f2252a.getWidth() || i11 > gVar.f2252a.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f3592h = width;
        this.f3593i = 1.0f;
    }

    @Override // k1.b
    public final void a(float f10) {
        this.f3593i = f10;
    }

    @Override // k1.b
    public final void b(l lVar) {
        this.f3594j = lVar;
    }

    @Override // k1.b
    public final long d() {
        return i7.b.F(this.f3592h);
    }

    @Override // k1.b
    public final void e(i0 i0Var) {
        d.V(i0Var, this.f3589e, this.f3590f, (Math.round(Float.intBitsToFloat((int) (r1.d() & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (i0Var.f8081g.d() >> 32))) << 32), this.f3593i, this.f3594j, this.f3591g, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f3589e, aVar.f3589e) && i.a(0L, 0L) && k.a(this.f3590f, aVar.f3590f) && this.f3591g == aVar.f3591g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3591g) + a4.d.c(a4.d.c(this.f3589e.hashCode() * 31, 31, 0L), 31, this.f3590f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f3589e);
        sb.append(", srcOffset=");
        sb.append((Object) i.d(0L));
        sb.append(", srcSize=");
        sb.append((Object) k.b(this.f3590f));
        sb.append(", filterQuality=");
        int i10 = this.f3591g;
        sb.append((Object) (i10 == 0 ? "None" : i10 == 1 ? "Low" : i10 == 2 ? "Medium" : i10 == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
