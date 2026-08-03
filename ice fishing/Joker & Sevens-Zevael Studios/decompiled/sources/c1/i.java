package c1;

import f1.l;
import v1.d0;
import v1.f0;
import v1.j0;
import v1.p0;
import x1.i0;
import x1.n;
import x1.o0;
import x1.w;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i extends m implements w, n {

    /* renamed from: u, reason: collision with root package name */
    public k1.b f1211u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1212v;

    /* renamed from: w, reason: collision with root package name */
    public y0.f f1213w;

    /* renamed from: x, reason: collision with root package name */
    public v1.i f1214x;

    /* renamed from: y, reason: collision with root package name */
    public float f1215y;

    /* renamed from: z, reason: collision with root package name */
    public l f1216z;

    public static boolean r0(long j3) {
        return !e1.e.a(j3, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean s0(long j3) {
        return !e1.e.a(j3, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // x1.n
    public final void b(i0 i0Var) {
        h1.b bVar = i0Var.f8081g;
        long d10 = this.f1211u.d();
        long floatToRawIntBits = (Float.floatToRawIntBits(s0(d10) ? Float.intBitsToFloat((int) (d10 >> 32)) : Float.intBitsToFloat((int) (bVar.d() >> 32))) << 32) | (Float.floatToRawIntBits(r0(d10) ? Float.intBitsToFloat((int) (d10 & 4294967295L)) : Float.intBitsToFloat((int) (bVar.d() & 4294967295L))) & 4294967295L);
        long i10 = (Float.intBitsToFloat((int) (bVar.d() >> 32)) == 0.0f || Float.intBitsToFloat((int) (bVar.d() & 4294967295L)) == 0.0f) ? 0L : p0.i(floatToRawIntBits, this.f1214x.a(floatToRawIntBits, bVar.d()));
        long a6 = this.f1213w.a((Math.round(Float.intBitsToFloat((int) (i10 >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (i10 & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (bVar.d() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (bVar.d() & 4294967295L))) & 4294967295L), i0Var.getLayoutDirection());
        float f10 = (int) (a6 >> 32);
        float f11 = (int) (a6 & 4294967295L);
        ((f8.c) bVar.f2596h.f262h).u(f10, f11);
        try {
            this.f1211u.c(i0Var, i10, this.f1215y, this.f1216z);
            ((f8.c) bVar.f2596h.f262h).u(-f10, -f11);
            i0Var.a();
        } catch (Throwable th) {
            ((f8.c) bVar.f2596h.f262h).u(-f10, -f11);
            throw th;
        }
    }

    @Override // x1.w
    public final f0 e(o0 o0Var, d0 d0Var, long j3) {
        long a6;
        boolean z10 = false;
        boolean z11 = s2.a.d(j3) && s2.a.c(j3);
        if (s2.a.f(j3) && s2.a.e(j3)) {
            z10 = true;
        }
        if (((!this.f1212v || this.f1211u.d() == 9205357640488583168L) && z11) || z10) {
            a6 = s2.a.a(j3, s2.a.h(j3), 0, s2.a.g(j3), 0, 10);
        } else {
            long d10 = this.f1211u.d();
            int round = s0(d10) ? Math.round(Float.intBitsToFloat((int) (d10 >> 32))) : s2.a.j(j3);
            int round2 = r0(d10) ? Math.round(Float.intBitsToFloat((int) (d10 & 4294967295L))) : s2.a.i(j3);
            long floatToRawIntBits = (Float.floatToRawIntBits(s2.b.f(round, j3)) << 32) | (Float.floatToRawIntBits(s2.b.e(round2, j3)) & 4294967295L);
            if (this.f1212v && this.f1211u.d() != 9205357640488583168L) {
                float intBitsToFloat = !s0(this.f1211u.d()) ? Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f1211u.d() >> 32));
                float intBitsToFloat2 = !r0(this.f1211u.d()) ? Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f1211u.d() & 4294967295L));
                long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                floatToRawIntBits = (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : p0.i(floatToRawIntBits2, this.f1214x.a(floatToRawIntBits2, floatToRawIntBits));
            }
            a6 = s2.a.a(j3, s2.b.f(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), j3), 0, s2.b.e(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))), j3), 0, 10);
        }
        j0 e10 = d0Var.e(a6);
        return o0Var.H(e10.f7085g, e10.f7086h, bc.w.f1068g, new h(e10, 0));
    }

    @Override // y0.m
    public final boolean g0() {
        return false;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f1211u + ", sizeToIntrinsics=" + this.f1212v + ", alignment=" + this.f1213w + ", alpha=" + this.f1215y + ", colorFilter=" + this.f1216z + ')';
    }
}
