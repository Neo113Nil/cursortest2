package z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k0 extends y0.m implements x1.w {

    /* renamed from: u, reason: collision with root package name */
    public float f8972u;

    /* renamed from: v, reason: collision with root package name */
    public float f8973v;

    /* renamed from: w, reason: collision with root package name */
    public float f8974w;

    /* renamed from: x, reason: collision with root package name */
    public float f8975x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8976y;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r5 != Integer.MAX_VALUE) goto L24;
     */
    @Override // x1.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v1.f0 e(x1.o0 o0Var, v1.d0 d0Var, long j3) {
        int i10;
        int i11;
        int i12;
        int j6;
        int h10;
        int i13;
        int g8;
        long a6;
        int i14 = 0;
        if (s2.f.a(this.f8974w, Float.NaN)) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = o0Var.D(this.f8974w);
            if (i10 < 0) {
                i10 = 0;
            }
        }
        if (s2.f.a(this.f8975x, Float.NaN)) {
            i11 = Integer.MAX_VALUE;
        } else {
            i11 = o0Var.D(this.f8975x);
            if (i11 < 0) {
                i11 = 0;
            }
        }
        if (!s2.f.a(this.f8972u, Float.NaN)) {
            i12 = o0Var.D(this.f8972u);
            if (i12 > i10) {
                i12 = i10;
            }
            if (i12 < 0) {
                i12 = 0;
            }
        }
        i12 = 0;
        if (!s2.f.a(this.f8973v, Float.NaN)) {
            int D = o0Var.D(this.f8973v);
            if (D > i11) {
                D = i11;
            }
            if (D < 0) {
                D = 0;
            }
            if (D != Integer.MAX_VALUE) {
                i14 = D;
            }
        }
        long a8 = s2.b.a(i12, i10, i14, i11);
        if (this.f8976y) {
            int j10 = s2.a.j(j3);
            int h11 = s2.a.h(j3);
            int i15 = s2.a.i(j3);
            int g10 = s2.a.g(j3);
            int j11 = s2.a.j(a8);
            if (j11 < j10) {
                j11 = j10;
            }
            if (j11 > h11) {
                j11 = h11;
            }
            int h12 = s2.a.h(a8);
            if (h12 >= j10) {
                j10 = h12;
            }
            if (j10 <= h11) {
                h11 = j10;
            }
            int i16 = s2.a.i(a8);
            if (i16 < i15) {
                i16 = i15;
            }
            if (i16 > g10) {
                i16 = g10;
            }
            int g11 = s2.a.g(a8);
            if (g11 >= i15) {
                i15 = g11;
            }
            if (i15 <= g10) {
                g10 = i15;
            }
            a6 = s2.b.a(j11, h11, i16, g10);
        } else {
            if (s2.f.a(this.f8972u, Float.NaN)) {
                j6 = s2.a.j(j3);
                int h13 = s2.a.h(a8);
                if (j6 > h13) {
                    j6 = h13;
                }
            } else {
                j6 = s2.a.j(a8);
            }
            if (s2.f.a(this.f8974w, Float.NaN)) {
                h10 = s2.a.h(j3);
                int j12 = s2.a.j(a8);
                if (h10 < j12) {
                    h10 = j12;
                }
            } else {
                h10 = s2.a.h(a8);
            }
            if (s2.f.a(this.f8973v, Float.NaN)) {
                i13 = s2.a.i(j3);
                int g12 = s2.a.g(a8);
                if (i13 > g12) {
                    i13 = g12;
                }
            } else {
                i13 = s2.a.i(a8);
            }
            if (s2.f.a(this.f8975x, Float.NaN)) {
                g8 = s2.a.g(j3);
                int i17 = s2.a.i(a8);
                if (g8 < i17) {
                    g8 = i17;
                }
            } else {
                g8 = s2.a.g(a8);
            }
            a6 = s2.b.a(j6, h10, i13, g8);
        }
        v1.j0 e10 = d0Var.e(a6);
        return o0Var.H(e10.f7085g, e10.f7086h, bc.w.f1068g, new c1.h(e10, 7));
    }
}
