package y1;

import android.view.ViewParent;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f1 implements x1.l1 {

    /* renamed from: g, reason: collision with root package name */
    public i1.b f8528g;

    /* renamed from: h, reason: collision with root package name */
    public final f1.u f8529h;

    /* renamed from: i, reason: collision with root package name */
    public final r f8530i;

    /* renamed from: j, reason: collision with root package name */
    public oc.e f8531j;

    /* renamed from: k, reason: collision with root package name */
    public oc.a f8532k;

    /* renamed from: l, reason: collision with root package name */
    public long f8533l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8534m;

    /* renamed from: o, reason: collision with root package name */
    public float[] f8536o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8537p;

    /* renamed from: t, reason: collision with root package name */
    public int f8541t;

    /* renamed from: v, reason: collision with root package name */
    public f1.b0 f8543v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8544w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8545x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8547z;

    /* renamed from: n, reason: collision with root package name */
    public final float[] f8535n = f1.d0.i();

    /* renamed from: q, reason: collision with root package name */
    public s2.c f8538q = v6.a.c();

    /* renamed from: r, reason: collision with root package name */
    public s2.l f8539r = s2.l.f6396g;

    /* renamed from: s, reason: collision with root package name */
    public final h1.b f8540s = new h1.b();

    /* renamed from: u, reason: collision with root package name */
    public long f8542u = f1.j0.f2266b;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8546y = true;
    public final wc.i A = new wc.i(11, this);

    public f1(i1.b bVar, f1.u uVar, r rVar, oc.e eVar, oc.a aVar) {
        this.f8528g = bVar;
        this.f8529h = uVar;
        this.f8530i = rVar;
        this.f8531j = eVar;
        this.f8532k = aVar;
        long j3 = Integer.MAX_VALUE;
        this.f8533l = (j3 & 4294967295L) | (j3 << 32);
    }

    public final float[] a() {
        float[] fArr = this.f8536o;
        if (fArr == null) {
            fArr = f1.d0.i();
            this.f8536o = fArr;
        }
        if (this.f8545x) {
            this.f8545x = false;
            float[] b2 = b();
            if (this.f8546y) {
                return b2;
            }
            if (!e0.r(b2, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArr[0])) {
            return null;
        }
        return fArr;
    }

    public final float[] b() {
        boolean z10 = this.f8544w;
        float[] fArr = this.f8535n;
        if (z10) {
            i1.b bVar = this.f8528g;
            long j3 = bVar.f3032v;
            i1.d dVar = bVar.f3011a;
            if ((9223372034707292159L & j3) == 9205357640488583168L) {
                j3 = i7.b.v(i7.b.F(this.f8533l));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
            float r5 = dVar.r();
            float f10 = dVar.f();
            float v10 = dVar.v();
            float C = dVar.C();
            float I = dVar.I();
            float d10 = dVar.d();
            float H = dVar.H();
            double d11 = v10 * 0.017453292519943295d;
            float sin = (float) Math.sin(d11);
            float cos = (float) Math.cos(d11);
            float f11 = -sin;
            float f12 = (f10 * cos) - (1.0f * sin);
            float f13 = (1.0f * cos) + (f10 * sin);
            double d12 = C * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d12);
            float cos2 = (float) Math.cos(d12);
            float f14 = -sin2;
            float f15 = sin * sin2;
            float f16 = sin * cos2;
            float f17 = cos * sin2;
            float f18 = cos * cos2;
            float f19 = (f13 * sin2) + (r5 * cos2);
            float f20 = (f13 * cos2) + ((-r5) * sin2);
            double d13 = I * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d13);
            float cos3 = (float) Math.cos(d13);
            float f21 = -sin3;
            float f22 = (cos3 * f15) + (f21 * cos2);
            float f23 = ((f15 * sin3) + (cos2 * cos3)) * d10;
            float f24 = sin3 * cos * d10;
            float f25 = ((sin3 * f16) + (cos3 * f14)) * d10;
            float f26 = f22 * H;
            float f27 = cos * cos3 * H;
            float f28 = ((cos3 * f16) + (f21 * f14)) * H;
            float f29 = f17 * 1.0f;
            float f30 = f11 * 1.0f;
            float f31 = f18 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f23;
                fArr[1] = f24;
                fArr[2] = f25;
                fArr[3] = 0.0f;
                fArr[4] = f26;
                fArr[5] = f27;
                fArr[6] = f28;
                fArr[7] = 0.0f;
                fArr[8] = f29;
                fArr[9] = f30;
                fArr[10] = f31;
                fArr[11] = 0.0f;
                float f32 = -intBitsToFloat;
                fArr[12] = ((f23 * f32) - (intBitsToFloat2 * f26)) + f19 + intBitsToFloat;
                fArr[13] = ((f24 * f32) - (intBitsToFloat2 * f27)) + f12 + intBitsToFloat2;
                fArr[14] = ((f32 * f25) - (intBitsToFloat2 * f28)) + f20;
                fArr[15] = 1.0f;
            }
            this.f8544w = false;
            this.f8546y = f1.d0.k(fArr);
        }
        return fArr;
    }

    public final long c(boolean z10, long j3) {
        float[] b2;
        if (z10) {
            b2 = a();
            if (b2 == null) {
                return 9187343241974906880L;
            }
        } else {
            b2 = b();
        }
        return this.f8546y ? j3 : f1.d0.m(b2, j3);
    }

    public final void d(long j3) {
        r rVar = this.f8530i;
        if (rVar.f8616l) {
            rVar.J(-4.0f);
        }
        i1.b bVar = this.f8528g;
        if (!s2.i.a(bVar.f3030t, j3)) {
            bVar.f3030t = j3;
            bVar.f3011a.B((int) (j3 >> 32), (int) (j3 & 4294967295L), bVar.f3031u);
        }
        ViewParent parent = rVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(rVar, rVar);
        }
    }

    public final void e(long j3) {
        if (s2.k.a(j3, this.f8533l)) {
            return;
        }
        r rVar = this.f8530i;
        if (rVar.f8616l) {
            rVar.J(-4.0f);
        }
        this.f8533l = j3;
        if (this.f8537p || this.f8534m) {
            return;
        }
        rVar.invalidate();
        if (true != this.f8537p) {
            this.f8537p = true;
            rVar.v(this, true);
        }
    }

    public final void f() {
        if (this.f8537p) {
            if (!f1.j0.a(this.f8542u, f1.j0.f2266b) && !s2.k.a(this.f8528g.f3031u, this.f8533l)) {
                i1.b bVar = this.f8528g;
                float b2 = f1.j0.b(this.f8542u) * ((int) (this.f8533l >> 32));
                float c3 = f1.j0.c(this.f8542u) * ((int) (this.f8533l & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(c3) & 4294967295L) | (Float.floatToRawIntBits(b2) << 32);
                if (!e1.b.b(bVar.f3032v, floatToRawIntBits)) {
                    bVar.f3032v = floatToRawIntBits;
                    bVar.f3011a.L(floatToRawIntBits);
                }
            }
            i1.b bVar2 = this.f8528g;
            s2.c cVar = this.f8538q;
            s2.l lVar = this.f8539r;
            long j3 = this.f8533l;
            long j6 = bVar2.f3031u;
            i1.d dVar = bVar2.f3011a;
            if (!s2.k.a(j6, j3)) {
                bVar2.f3031u = j3;
                long j10 = bVar2.f3030t;
                dVar.B((int) (j10 >> 32), (int) (4294967295L & j10), j3);
                if (bVar2.f3019i == 9205357640488583168L) {
                    bVar2.f3017g = true;
                    bVar2.a();
                }
            }
            bVar2.f3012b = cVar;
            bVar2.f3013c = lVar;
            bVar2.f3014d = this.A;
            dVar.J(cVar, lVar, bVar2, bVar2.f3015e);
            if (this.f8537p) {
                this.f8537p = false;
                this.f8530i.v(this, false);
            }
        }
    }

    @Override // x1.l1
    public final void invalidate() {
        if (this.f8537p || this.f8534m) {
            return;
        }
        r rVar = this.f8530i;
        rVar.invalidate();
        if (true != this.f8537p) {
            this.f8537p = true;
            rVar.v(this, true);
        }
    }
}
