package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public abstract class yn91 {
    public static final void a(j1c0 j1c0Var, wp2 wp2Var, wp2 wp2Var2, fid fidVar, int i) {
        wp2 wp2Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1551662566);
        int i2 = i | (btsVar.k(j1c0Var) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            wp2Var3 = wp2Var2;
            f530 c = bzk0.c(ljs0.c, wp2Var3, qke.q);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            c36 c36Var = null;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            btsVar.e0(1045990632);
            pa90 a = wya1.a(j1c0Var.a, 0, btsVar);
            if (wp2Var == null) {
                btsVar.e0(-1411607277);
                btsVar.t(false);
            } else {
                btsVar.e0(-1411607276);
                c36Var = tse0.e(tje.n(wp2Var, btsVar), 5, btsVar, false);
            }
            o4b1.b(a, null, c530.a, null, null, 0.0f, c36Var, btsVar, 8, 56);
            btsVar.t(false);
            btsVar.t(true);
        } else {
            wp2Var3 = wp2Var2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t240(j1c0Var, wp2Var, wp2Var3, i, 24);
        }
    }

    public static final void b(k1c0 k1c0Var, m3u0 m3u0Var, qor qorVar, fid fidVar, int i) {
        qor qorVar2;
        qor qorVar3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1261260965);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(k1c0Var) ? 4 : 2) | (btsVar.k(m3u0Var) ? 32 : 16) | 384;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.a0();
            int i3 = i & 1;
            o430 o430Var = did.a;
            if (i3 == 0 || btsVar.C()) {
                Object Q = btsVar.Q();
                if (Q == o430Var) {
                    Q = f.f(0.0f);
                    btsVar.o0(Q);
                }
                qorVar3 = (tx40) Q;
            } else {
                btsVar.Y();
                qorVar3 = qorVar;
            }
            btsVar.u();
            k3r k3rVar = ljs0.c;
            uo5 uo5Var = x4c.b;
            z910 d = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, k3rVar);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            boolean z = (((i2 & 112) ^ 48) > 32 && btsVar.k(m3u0Var)) || (i2 & 48) == 32;
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new xo1(m3u0Var, 11);
                btsVar.o0(Q2);
            }
            f530 a = androidx.compose.ui.graphics.d.a(c530.a, (tls) Q2);
            z910 d3 = pi6.d(uo5Var, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d4 = b.d(btsVar, a);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d3);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d4);
            c(qorVar3, wwg.S(-1309534087, true, new lbb0(1, k1c0Var), btsVar), btsVar, 438);
            e(qorVar3, btsVar, 54);
            d(54, btsVar, qorVar3, null);
            btsVar.t(true);
            btsVar.t(true);
            qorVar2 = qorVar3;
        } else {
            btsVar.Y();
            qorVar2 = qorVar;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t240(k1c0Var, m3u0Var, qorVar2, i, 23);
        }
    }

    public static final void c(qor qorVar, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(242406422);
        int i3 = i & 6;
        cj6 cj6Var = cj6.a;
        if (i3 == 0) {
            i2 = (btsVar.k(cj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(qorVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(aVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            float b = w4a1.b(btsVar, usg0.pin_slot_size);
            float b2 = w4a1.b(btsVar, usg0.address_on_map_bg_radius);
            float b3 = w4a1.b(btsVar, usg0.pin_slot_bg_radius);
            byk0 c = cyk0.c(b2);
            byk0 c2 = cyk0.c(b3);
            long n = tje.n(AppColor$Palette.Line, btsVar);
            f530 a = cj6Var.a(c530.a, x4c.B);
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new f0(qorVar, 5);
                btsVar.o0(Q);
            }
            f530 l = ymb1.l(ljs0.m(an91.k(bzk0.c(aab1.a(1.0f, n, ymb1.l(an91.o(androidx.compose.ui.graphics.d.a(a, (tls) Q), 0.0f, 0.0f, 0.0f, 35.0f, 7), c), c), AppColor$Palette.BgFloating, qke.q), 4.0f), b), c2);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, l);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            nnm.p((i2 >> 6) & 14, aVar, btsVar, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(qorVar, aVar, i, 7);
        }
    }

    public static final void d(int i, fid fidVar, final qor qorVar, f530 f530Var) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1378895783);
        int i3 = i & 6;
        cj6 cj6Var = cj6.a;
        if (i3 == 0) {
            i2 = (btsVar.k(cj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(qorVar) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if (btsVar.V(i4 & 1, (i4 & 147) != 146)) {
            fwi fwiVar = (fwi) btsVar.m(j.h);
            final float w0 = fwiVar.w0(12.0f);
            final float w02 = fwiVar.w0(6.0f);
            final float w03 = fwiVar.w0(2.0f);
            final float w04 = fwiVar.w0(8.0f);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new Matrix();
                btsVar.o0(Q);
            }
            final Matrix matrix = (Matrix) Q;
            Object Q2 = btsVar.Q();
            Object obj = Q2;
            if (Q2 == o430Var) {
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
                btsVar.o0(paint);
                obj = paint;
            }
            final Paint paint2 = (Paint) obj;
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = ArgbEvaluatorCompat.getInstance();
                btsVar.o0(Q3);
            }
            final ArgbEvaluatorCompat argbEvaluatorCompat = (ArgbEvaluatorCompat) Q3;
            c530 c530Var = c530.a;
            f530 a = cj6Var.a(ljs0.n(c530Var, 28.0f, 22.0f), x4c.B);
            boolean b = btsVar.b(w03) | btsVar.b(w04) | ((i4 & 112) == 32) | btsVar.b(w0) | btsVar.b(w02) | btsVar.e(argbEvaluatorCompat) | btsVar.e(matrix) | btsVar.e(paint2);
            Object Q4 = btsVar.Q();
            if (b || Q4 == o430Var) {
                f530Var2 = c530Var;
                tls tlsVar = new tls() { // from class: a1c0
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        qam qamVar = (qam) obj2;
                        float f = w04;
                        float f2 = w03;
                        float floatValue = (qorVar.getFloatValue() * (f - f2)) + f2;
                        float f3 = w0;
                        float f4 = w02;
                        float f5 = (f4 + floatValue) / 2.0f;
                        float f6 = (f5 - floatValue) / f5;
                        float max = Math.max(f6, 0.0f);
                        int intValue = argbEvaluatorCompat.evaluate((0.0f - f6) / (1.0f - f6), (Integer) 855638016, (Integer) 0).intValue();
                        Matrix matrix2 = matrix;
                        matrix2.reset();
                        matrix2.postScale((f3 + floatValue) / 2.0f, f5);
                        Paint paint3 = paint2;
                        paint3.setAlpha(255);
                        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{intValue, 0}, new float[]{max, 1.0f}, Shader.TileMode.CLAMP);
                        radialGradient.setLocalMatrix(matrix2);
                        paint3.setShader(radialGradient);
                        float intBitsToFloat = Float.intBitsToFloat((int) (qamVar.c() >> 32)) / 2.0f;
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / 2.0f;
                        ((cot) qamVar.N().a).n(intBitsToFloat, intBitsToFloat2);
                        try {
                            i28 q = qamVar.N().q();
                            float f7 = ((-f3) / 2.0f) - floatValue;
                            float f8 = ((-f4) / 2.0f) - floatValue;
                            Canvas canvas = t72.a;
                            float f9 = floatValue * 2.0f;
                            ((s72) q).a.drawOval(f7, f8, f3 + f7 + f9, f4 + f8 + f9, paint3);
                            ((cot) qamVar.N().a).n(-intBitsToFloat, -intBitsToFloat2);
                            return zy11.a;
                        } catch (Throwable th) {
                            ((cot) qamVar.N().a).n(-intBitsToFloat, -intBitsToFloat2);
                            throw th;
                        }
                    }
                };
                btsVar.o0(tlsVar);
                Q4 = tlsVar;
            } else {
                f530Var2 = c530Var;
            }
            qeb1.a(0, btsVar, (tls) Q4, a);
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(qorVar, f530Var2, i, 6);
        }
    }

    public static final void e(qor qorVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(650194464);
        int i3 = i & 6;
        int i4 = 4;
        cj6 cj6Var = cj6.a;
        if (i3 == 0) {
            i2 = (btsVar.k(cj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(qorVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 a = cj6Var.a(c530.a, x4c.B);
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new f0(qorVar, i4);
                btsVar.o0(Q);
            }
            f530 c = bzk0.c(ljs0.e(ljs0.q(an91.o(androidx.compose.ui.graphics.d.a(a, (tls) Q), 0.0f, 0.0f, 0.0f, 11.0f, 7), 3.0f), 24.0f), AppColor$Palette.Text, cyk0.d(0.0f, 0.0f, 8.0f, 8.0f));
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z4(qorVar, i, 29);
        }
    }

    public static final void f(f530 f530Var, boolean z, ButtonSize buttonSize, ButtonForm buttonForm, sls slsVar, a aVar, fid fidVar, int i) {
        ButtonSize buttonSize2;
        ButtonForm buttonForm2;
        float f;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2055248820);
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.a(z) ? 32 : 16) | 3456 | (btsVar.e(slsVar) ? 16384 : 8192);
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            ButtonSize buttonSize3 = ButtonSize.L;
            ButtonForm buttonForm3 = ButtonForm.Squircle;
            int i3 = n1d0.a[buttonForm3.ordinal()];
            if (i3 == 1) {
                btsVar.e0(-590830980);
                btsVar.t(false);
                f = Float.POSITIVE_INFINITY;
            } else {
                if (i3 != 2) {
                    throw unr0.y(-590832232, btsVar, false);
                }
                btsVar.e0(-590829818);
                f = tcb1.c(buttonSize3, btsVar);
                btsVar.t(false);
            }
            k2z.a(new up2(zp2.c), new up2(zp2.a), wwg.S(-1502507228, true, new ya2(f530Var, buttonSize3, z, (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040 ? cyk0.c(f) : cyk0.a, slsVar, aVar), btsVar), btsVar, 384);
            buttonSize2 = buttonSize3;
            buttonForm2 = buttonForm3;
        } else {
            btsVar.Y();
            buttonSize2 = buttonSize;
            buttonForm2 = buttonForm;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ya2(f530Var, z, buttonSize2, buttonForm2, slsVar, aVar, i);
        }
    }

    public static final tls g(tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        boolean z = ((((i & 14) ^ 6) > 4 && ((bts) fidVar).k(tlsVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && ((bts) fidVar).k(tlsVar2)) || (i & 48) == 32);
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        if (z || Q == did.a) {
            Q = new wnf0(tlsVar, tlsVar2, 11);
            btsVar.o0(Q);
        }
        return (tls) Q;
    }
}
