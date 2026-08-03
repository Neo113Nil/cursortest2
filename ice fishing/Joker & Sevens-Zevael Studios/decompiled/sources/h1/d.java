package h1;

import f1.d0;
import f1.i;
import f1.l;
import x1.i0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface d extends s2.c {
    static void V(d dVar, f1.g gVar, long j3, long j6, float f10, l lVar, int i10, int i11) {
        dVar.u(gVar, 0L, j3, (i11 & 16) != 0 ? j3 : j6, (i11 & 32) != 0 ? 1.0f : f10, lVar, (i11 & 512) != 0 ? 1 : i10);
    }

    static void c0(i0 i0Var, long j3, float f10, long j6, int i10) {
        if ((i10 & 4) != 0) {
            j6 = i0Var.f8081g.J();
        }
        b bVar = i0Var.f8081g;
        bVar.f2595g.f2593c.b(f10, j6, b.a(bVar, j3, f.f2601b, 3));
    }

    static long e0(long j3, long j6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) - Float.intBitsToFloat((int) (j6 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) - Float.intBitsToFloat((int) (j6 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    static /* synthetic */ void l(d dVar, long j3, long j6, int i10) {
        if ((i10 & 4) != 0) {
            j6 = e0(dVar.d(), 0L);
        }
        dVar.Z(j3, 0L, j6, f.f2601b, (i10 & 64) != 0 ? 3 : 0);
    }

    static /* synthetic */ void o(d dVar, i iVar, d0 d0Var, float f10, g gVar, int i10) {
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        c cVar = gVar;
        if ((i10 & 8) != 0) {
            cVar = f.f2601b;
        }
        dVar.Y(iVar, d0Var, f11, cVar, (i10 & 32) != 0 ? 3 : 0);
    }

    static void q(i0 i0Var, d0 d0Var, long j3, long j6, long j10, c cVar, int i10) {
        long j11 = (i10 & 2) != 0 ? 0L : j3;
        long e02 = (i10 & 4) != 0 ? e0(i0Var.f8081g.d(), j11) : j6;
        c cVar2 = (i10 & 32) != 0 ? f.f2601b : cVar;
        b bVar = i0Var.f8081g;
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        bVar.f2595g.f2593c.h(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (e02 >> 32)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (e02 & 4294967295L)) + Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), bVar.b(d0Var, cVar2, 1.0f, null, 3, 1));
    }

    a5.c A();

    void G(long j3, long j6, long j10, float f10, int i10);

    default long J() {
        return i7.b.v(A().x());
    }

    void Y(i iVar, d0 d0Var, float f10, c cVar, int i10);

    void Z(long j3, long j6, long j10, c cVar, int i10);

    default long d() {
        return A().x();
    }

    s2.l getLayoutDirection();

    void u(f1.g gVar, long j3, long j6, long j10, float f10, l lVar, int i10);
}
