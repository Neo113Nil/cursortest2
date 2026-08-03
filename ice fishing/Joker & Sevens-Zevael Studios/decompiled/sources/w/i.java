package w;

import x1.h1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i extends y0.m implements x1.n, h1 {

    /* renamed from: u, reason: collision with root package name */
    public long f7436u;

    /* renamed from: v, reason: collision with root package name */
    public f1.g0 f7437v;

    /* renamed from: w, reason: collision with root package name */
    public long f7438w;

    /* renamed from: x, reason: collision with root package name */
    public s2.l f7439x;

    /* renamed from: y, reason: collision with root package name */
    public f1.b0 f7440y;

    /* renamed from: z, reason: collision with root package name */
    public f1.g0 f7441z;

    @Override // x1.h1
    public final void C() {
        this.f7438w = 9205357640488583168L;
        this.f7439x = null;
        this.f7440y = null;
        this.f7441z = null;
        x1.f.m(this);
    }

    @Override // x1.n
    public final void b(x1.i0 i0Var) {
        h1.b bVar = i0Var.f8081g;
        if (this.f7437v != f1.d0.f2219a) {
            pc.s sVar = new pc.s();
            if (e1.e.a(bVar.d(), this.f7438w) && i0Var.getLayoutDirection() == this.f7439x && pc.j.a(this.f7441z, this.f7437v)) {
                f1.b0 b0Var = this.f7440y;
                pc.j.b(b0Var);
                sVar.f5683g = b0Var;
            } else {
                x1.f.s(this, new a0.l(sVar, this, i0Var, 2));
            }
            this.f7440y = (f1.b0) sVar.f5683g;
            this.f7438w = bVar.d();
            this.f7439x = i0Var.getLayoutDirection();
            this.f7441z = this.f7437v;
            Object obj = sVar.f5683g;
            pc.j.b(obj);
            f1.b0 b0Var2 = (f1.b0) obj;
            if (!f1.q.c(this.f7436u, f1.q.f2283h)) {
                long j3 = this.f7436u;
                boolean z10 = b0Var2 instanceof f1.z;
                h1.f fVar = h1.f.f2601b;
                if (z10) {
                    e1.c cVar = ((f1.z) b0Var2).f2292a;
                    float f10 = cVar.f1931a;
                    float f11 = cVar.f1932b;
                    long floatToRawIntBits = (Float.floatToRawIntBits(f10) << 32) | (4294967295L & Float.floatToRawIntBits(f11));
                    float f12 = cVar.f1933c - cVar.f1931a;
                    float f13 = cVar.f1934d - cVar.f1932b;
                    i0Var.Z(j3, floatToRawIntBits, (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), fVar, 3);
                } else if (b0Var2 instanceof f1.a0) {
                    f1.a0 a0Var = (f1.a0) b0Var2;
                    f1.i iVar = a0Var.f2213b;
                    if (iVar != null) {
                        i0Var.e(iVar, j3, fVar);
                    } else {
                        e1.d dVar = a0Var.f2212a;
                        float intBitsToFloat = Float.intBitsToFloat((int) (dVar.f1942h >> 32));
                        float f14 = dVar.f1935a;
                        float f15 = dVar.f1936b;
                        long floatToRawIntBits2 = (Float.floatToRawIntBits(f15) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32);
                        float b2 = dVar.b();
                        float a6 = dVar.a();
                        long floatToRawIntBits3 = (Float.floatToRawIntBits(a6) & 4294967295L) | (Float.floatToRawIntBits(b2) << 32);
                        long floatToRawIntBits4 = (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                        int i10 = (int) (floatToRawIntBits2 >> 32);
                        int i11 = (int) (floatToRawIntBits2 & 4294967295L);
                        bVar.f2595g.f2593c.h(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (floatToRawIntBits3 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (floatToRawIntBits3 & 4294967295L)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (floatToRawIntBits4 >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits4 & 4294967295L)), h1.b.a(bVar, j3, fVar, 3));
                    }
                } else {
                    if (!(b0Var2 instanceof f1.y)) {
                        throw new ac.d();
                    }
                    i0Var.e(((f1.y) b0Var2).f2291a, j3, fVar);
                }
            }
        } else if (!f1.q.c(this.f7436u, f1.q.f2283h)) {
            h1.d.l(i0Var, this.f7436u, 0L, 126);
        }
        i0Var.a();
    }
}
