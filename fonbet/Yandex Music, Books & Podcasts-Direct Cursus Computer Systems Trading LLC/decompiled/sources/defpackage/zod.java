package defpackage;

import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zod implements tzj {
    public xod a;
    public final uod b;
    public final AndroidComposeView c;
    public Function2 d;
    public Function0 e;
    public long f;
    public boolean g;
    public float[] i;
    public boolean j;
    public int n;
    public ocg p;
    public boolean q;
    public boolean r;
    public boolean t;
    public final float[] h = feh.a();
    public jx7 k = zsd.l();
    public xof l = xof.a;
    public final ou3 m = new ou3();
    public long o = a7t.b;
    public boolean s = true;
    public final kma u = new kma(17, this);

    public zod(xod xodVar, uod uodVar, AndroidComposeView androidComposeView, Function2 function2, Function0 function0) {
        this.a = xodVar;
        this.b = uodVar;
        this.c = androidComposeView;
        this.d = function2;
        this.e = function0;
        long j = Integer.MAX_VALUE;
        this.f = (j & 4294967295L) | (j << 32);
    }

    @Override // defpackage.tzj
    public final void a(float[] fArr) {
        feh.e(fArr, m());
    }

    @Override // defpackage.tzj
    public final void b(spi spiVar, boolean z) {
        float[] l = z ? l() : m();
        if (this.s) {
            return;
        }
        if (l != null) {
            feh.c(l, spiVar);
            return;
        }
        spiVar.b = 0.0f;
        spiVar.c = 0.0f;
        spiVar.d = 0.0f;
        spiVar.e = 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bf  */
    @Override // defpackage.tzj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(zco zcoVar) {
        long j;
        int i;
        Function0 function0;
        int i2;
        Function0 function02;
        int i3 = zcoVar.a | this.n;
        this.l = zcoVar.r;
        this.k = zcoVar.q;
        int i4 = i3 & 4096;
        if (i4 != 0) {
            this.o = zcoVar.l;
        }
        if ((i3 & 1) != 0) {
            xod xodVar = this.a;
            float f = zcoVar.b;
            yod yodVar = xodVar.a;
            if (yodVar.A() != f) {
                yodVar.j(f);
            }
        }
        if ((i3 & 2) != 0) {
            xod xodVar2 = this.a;
            float f2 = zcoVar.c;
            yod yodVar2 = xodVar2.a;
            if (yodVar2.L() != f2) {
                yodVar2.m(f2);
            }
        }
        if ((i3 & 4) != 0) {
            this.a.h(zcoVar.d);
        }
        if ((i3 & 8) != 0) {
            xod xodVar3 = this.a;
            float f3 = zcoVar.e;
            yod yodVar3 = xodVar3.a;
            if (yodVar3.H() != f3) {
                yodVar3.o(f3);
            }
        }
        if ((i3 & 16) != 0) {
            xod xodVar4 = this.a;
            float f4 = zcoVar.f;
            yod yodVar4 = xodVar4.a;
            if (yodVar4.F() != f4) {
                yodVar4.d(f4);
            }
        }
        boolean z = true;
        if ((i3 & 32) != 0) {
            xod xodVar5 = this.a;
            float f5 = zcoVar.g;
            yod yodVar5 = xodVar5.a;
            if (yodVar5.K() != f5) {
                yodVar5.B(f5);
                xodVar5.g = true;
                xodVar5.a();
            }
            if (zcoVar.g > 0.0f && !this.t && (function02 = this.e) != null) {
                function02.invoke();
            }
        }
        if ((i3 & 64) != 0) {
            xod xodVar6 = this.a;
            long j2 = zcoVar.h;
            yod yodVar6 = xodVar6.a;
            if (!d85.c(j2, yodVar6.s())) {
                yodVar6.u(j2);
            }
        }
        if ((i3 & 128) != 0) {
            xod xodVar7 = this.a;
            long j3 = zcoVar.i;
            yod yodVar7 = xodVar7.a;
            if (!d85.c(j3, yodVar7.t())) {
                yodVar7.x(j3);
            }
        }
        if ((i3 & 1024) != 0) {
            xod xodVar8 = this.a;
            float f6 = zcoVar.j;
            yod yodVar8 = xodVar8.a;
            if (yodVar8.r() != f6) {
                yodVar8.l(f6);
            }
        }
        if ((i3 & 256) != 0) {
            yod yodVar9 = this.a.a;
            if (yodVar9.I() != 0.0f) {
                yodVar9.h();
            }
        }
        if ((i3 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
            yod yodVar10 = this.a.a;
            if (yodVar10.q() != 0.0f) {
                yodVar10.i();
            }
        }
        if ((i3 & 2048) != 0) {
            xod xodVar9 = this.a;
            float f7 = zcoVar.k;
            yod yodVar11 = xodVar9.a;
            if (yodVar11.v() != f7) {
                yodVar11.k(f7);
            }
        }
        if (i4 != 0) {
            boolean a = a7t.a(this.o, a7t.b);
            xod xodVar10 = this.a;
            if (!a) {
                float b = a7t.b(this.o) * ((int) (this.f >> 32));
                j = 4294967295L;
                long floatToRawIntBits = (Float.floatToRawIntBits(a7t.c(this.o) * ((int) (this.f & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(b) << 32);
                if (!enj.c(xodVar10.v, floatToRawIntBits)) {
                    xodVar10.v = floatToRawIntBits;
                    xodVar10.a.E(floatToRawIntBits);
                }
                if ((i3 & 16384) != 0) {
                    xod xodVar11 = this.a;
                    boolean z2 = zcoVar.n;
                    if (xodVar11.w != z2) {
                        xodVar11.w = z2;
                        xodVar11.g = true;
                        xodVar11.a();
                    }
                }
                if ((131072 & i3) != 0) {
                    xod xodVar12 = this.a;
                    qwn qwnVar = zcoVar.s;
                    yod yodVar12 = xodVar12.a;
                    if (!Intrinsics.d(yodVar12.a(), qwnVar)) {
                        yodVar12.e(qwnVar);
                    }
                }
                if ((32768 & i3) != 0) {
                    xod xodVar13 = this.a;
                    int i5 = zcoVar.o;
                    if (i5 == 0) {
                        i2 = 0;
                    } else if (i5 == 1) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                        if (i5 != 2) {
                            xq0.q("Not supported composition strategy");
                            return;
                        }
                    }
                    yod yodVar13 = xodVar13.a;
                    if (yodVar13.p() != i2) {
                        yodVar13.J(i2);
                    }
                }
                if ((i3 & 7963) != 0) {
                    this.q = true;
                    this.r = true;
                }
                if (Intrinsics.d(this.p, zcoVar.t)) {
                    ocg ocgVar = zcoVar.t;
                    this.p = ocgVar;
                    if (ocgVar != null) {
                        xod xodVar14 = this.a;
                        if (ocgVar instanceof ayj) {
                            ynn ynnVar = ((ayj) ocgVar).j;
                            float f8 = ynnVar.a;
                            float f9 = ynnVar.b;
                            xodVar14.i((Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f9) & j), (Float.floatToRawIntBits(ynnVar.c - f8) << 32) | (Float.floatToRawIntBits(ynnVar.d - f9) & j), 0.0f);
                        } else if (ocgVar instanceof zxj) {
                            eak eakVar = ((zxj) ocgVar).j;
                            xodVar14.k = null;
                            xodVar14.i = 9205357640488583168L;
                            xodVar14.h = 0L;
                            xodVar14.j = 0.0f;
                            xodVar14.g = true;
                            xodVar14.n = false;
                            xodVar14.l = eakVar;
                            xodVar14.a();
                        } else if (ocgVar instanceof byj) {
                            byj byjVar = (byj) ocgVar;
                            nh0 nh0Var = byjVar.k;
                            if (nh0Var != null) {
                                xodVar14.k = null;
                                xodVar14.i = 9205357640488583168L;
                                xodVar14.h = 0L;
                                xodVar14.j = 0.0f;
                                xodVar14.g = true;
                                xodVar14.n = false;
                                xodVar14.l = nh0Var;
                                xodVar14.a();
                            } else {
                                xodVar14.i((Float.floatToRawIntBits(r4.a) << 32) | (Float.floatToRawIntBits(r4.b) & j), (Float.floatToRawIntBits(r4.b()) << 32) | (Float.floatToRawIntBits(r4.a()) & j), Float.intBitsToFloat((int) (byjVar.j.h >> 32)));
                            }
                        }
                        if ((ocgVar instanceof zxj) && Build.VERSION.SDK_INT < 33 && (function0 = this.e) != null) {
                            function0.invoke();
                        }
                    }
                } else {
                    z = false;
                }
                this.n = zcoVar.a;
                if (i3 == 0 || z) {
                    i = Build.VERSION.SDK_INT;
                    AndroidComposeView androidComposeView = this.c;
                    if (i < 26) {
                        woe.v(androidComposeView);
                        return;
                    } else {
                        androidComposeView.invalidate();
                        return;
                    }
                }
                return;
            }
            if (!enj.c(xodVar10.v, 9205357640488583168L)) {
                xodVar10.v = 9205357640488583168L;
                xodVar10.a.E(9205357640488583168L);
            }
        }
        j = 4294967295L;
        if ((i3 & 16384) != 0) {
        }
        if ((131072 & i3) != 0) {
        }
        if ((32768 & i3) != 0) {
        }
        if ((i3 & 7963) != 0) {
        }
        if (Intrinsics.d(this.p, zcoVar.t)) {
        }
        this.n = zcoVar.a;
        if (i3 == 0) {
        }
        i = Build.VERSION.SDK_INT;
        AndroidComposeView androidComposeView2 = this.c;
        if (i < 26) {
        }
    }

    @Override // defpackage.tzj
    public final long d(long j, boolean z) {
        float[] m;
        if (z) {
            m = l();
            if (m == null) {
                return 9187343241974906880L;
            }
        } else {
            m = m();
        }
        return this.s ? j : feh.b(j, m);
    }

    @Override // defpackage.tzj
    public final void destroy() {
        this.d = null;
        this.e = null;
        this.g = true;
        boolean z = this.j;
        AndroidComposeView androidComposeView = this.c;
        if (z) {
            this.j = false;
            androidComposeView.w(this, false);
        }
        uod uodVar = this.b;
        if (uodVar != null) {
            uodVar.a(this.a);
            androidComposeView.F(this);
        }
    }

    @Override // defpackage.tzj
    public final void e(Function2 function2, Function0 function0) {
        uod uodVar = this.b;
        if (uodVar == null) {
            throw ouj.f("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.a.s) {
            sme.a("layer should have been released before reuse");
        }
        this.a = uodVar.b();
        this.g = false;
        this.d = function2;
        this.e = function0;
        this.q = false;
        this.r = false;
        this.s = true;
        feh.d(this.h);
        float[] fArr = this.i;
        if (fArr != null) {
            feh.d(fArr);
        }
        this.o = a7t.b;
        this.t = false;
        long j = Integer.MAX_VALUE;
        this.f = (j & 4294967295L) | (j << 32);
        this.p = null;
        this.n = 0;
    }

    @Override // defpackage.tzj
    public final void f(long j) {
        if (hqe.a(j, this.f)) {
            return;
        }
        this.f = j;
        if (this.j || this.g) {
            return;
        }
        AndroidComposeView androidComposeView = this.c;
        androidComposeView.invalidate();
        if (true != this.j) {
            this.j = true;
            androidComposeView.w(this, true);
        }
    }

    @Override // defpackage.tzj
    public final void g(mu3 mu3Var, xod xodVar) {
        k();
        this.t = this.a.a.K() > 0.0f;
        ou3 ou3Var = this.m;
        nsh nshVar = ou3Var.b;
        nshVar.M(mu3Var);
        nshVar.c = xodVar;
        yd5.s(ou3Var, this.a);
    }

    @Override // defpackage.tzj
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo2getUnderlyingMatrixsQKQjiQ() {
        return m();
    }

    @Override // defpackage.tzj
    public final boolean h(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        xod xodVar = this.a;
        if (xodVar.w) {
            return a4g.E(xodVar.e(), intBitsToFloat, intBitsToFloat2);
        }
        return true;
    }

    @Override // defpackage.tzj
    public final void i(float[] fArr) {
        float[] l = l();
        if (l != null) {
            feh.e(fArr, l);
        }
    }

    @Override // defpackage.tzj
    public final void invalidate() {
        if (this.j || this.g) {
            return;
        }
        AndroidComposeView androidComposeView = this.c;
        androidComposeView.invalidate();
        if (true != this.j) {
            this.j = true;
            androidComposeView.w(this, true);
        }
    }

    @Override // defpackage.tzj
    public final void j(long j) {
        xod xodVar = this.a;
        if (!wpe.b(xodVar.t, j)) {
            xodVar.t = j;
            xodVar.a.G(xodVar.u, (int) (j >> 32), (int) (j & 4294967295L));
        }
        int i = Build.VERSION.SDK_INT;
        AndroidComposeView androidComposeView = this.c;
        if (i >= 26) {
            woe.v(androidComposeView);
        } else {
            androidComposeView.invalidate();
        }
    }

    @Override // defpackage.tzj
    public final void k() {
        if (this.j) {
            if (!a7t.a(this.o, a7t.b) && !hqe.a(this.a.u, this.f)) {
                xod xodVar = this.a;
                float b = a7t.b(this.o) * ((int) (this.f >> 32));
                float c = a7t.c(this.o) * ((int) (this.f & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(c) & 4294967295L) | (Float.floatToRawIntBits(b) << 32);
                if (!enj.c(xodVar.v, floatToRawIntBits)) {
                    xodVar.v = floatToRawIntBits;
                    xodVar.a.E(floatToRawIntBits);
                }
            }
            this.a.g(this.k, this.l, this.f, this.u);
            if (this.j) {
                this.j = false;
                this.c.w(this, false);
            }
        }
    }

    public final float[] l() {
        float[] fArr = this.i;
        if (fArr == null) {
            fArr = feh.a();
            this.i = fArr;
        }
        if (this.r) {
            this.r = false;
            float[] m = m();
            if (this.s) {
                return m;
            }
            if (!yd5.z(m, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArr[0])) {
            return null;
        }
        return fArr;
    }

    public final float[] m() {
        boolean z = this.q;
        float[] fArr = this.h;
        if (z) {
            xod xodVar = this.a;
            long j = xodVar.v;
            yod yodVar = xodVar.a;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = a4g.y(nt0.Q(this.f));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            float H = yodVar.H();
            float F = yodVar.F();
            float I = yodVar.I();
            float q = yodVar.q();
            float r = yodVar.r();
            float A = yodVar.A();
            float L = yodVar.L();
            double d = I * 0.017453292519943295d;
            float sin = (float) Math.sin(d);
            float cos = (float) Math.cos(d);
            float f = -sin;
            float f2 = (F * cos) - (1.0f * sin);
            float f3 = (1.0f * cos) + (F * sin);
            double d2 = q * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d2);
            float cos2 = (float) Math.cos(d2);
            float f4 = -sin2;
            float f5 = sin * sin2;
            float f6 = sin * cos2;
            float f7 = cos * sin2;
            float f8 = cos * cos2;
            float f9 = (f3 * sin2) + (H * cos2);
            float f10 = (f3 * cos2) + ((-H) * sin2);
            double d3 = r * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d3);
            float cos3 = (float) Math.cos(d3);
            float f11 = -sin3;
            float f12 = (cos3 * f5) + (f11 * cos2);
            float f13 = ((f5 * sin3) + (cos2 * cos3)) * A;
            float f14 = sin3 * cos * A;
            float f15 = ((sin3 * f6) + (cos3 * f4)) * A;
            float f16 = f12 * L;
            float f17 = cos * cos3 * L;
            float f18 = ((cos3 * f6) + (f11 * f4)) * L;
            float f19 = f7 * 1.0f;
            float f20 = f * 1.0f;
            float f21 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f13;
                fArr[1] = f14;
                fArr[2] = f15;
                fArr[3] = 0.0f;
                fArr[4] = f16;
                fArr[5] = f17;
                fArr[6] = f18;
                fArr[7] = 0.0f;
                fArr[8] = f19;
                fArr[9] = f20;
                fArr[10] = f21;
                fArr[11] = 0.0f;
                float f22 = -intBitsToFloat;
                fArr[12] = ((f13 * f22) - (intBitsToFloat2 * f16)) + f9 + intBitsToFloat;
                fArr[13] = ((f14 * f22) - (intBitsToFloat2 * f17)) + f2 + intBitsToFloat2;
                fArr[14] = ((f22 * f15) - (intBitsToFloat2 * f18)) + f10;
                fArr[15] = 1.0f;
            }
            this.q = false;
            this.s = tyf.B(fArr);
        }
        return fArr;
    }
}
