package defpackage;

import android.content.res.Resources;
import android.graphics.Path;
import android.util.TypedValue;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.payment.sdk.ui.CardInputMode;
import com.yandex.xplat.payment.sdk.Scenario;
import com.yx360.design.compose.atoms.DsHeading$Size;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class r891 {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a4, code lost:
    
        if (defpackage.jl40.l(r2.Q(), java.lang.Integer.valueOf(r14)) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(z4f z4fVar, f530 f530Var, tls tlsVar, sls slsVar, sls slsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar;
        sls slsVar3;
        List list = z4fVar.c;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(380670598);
        dmw0 dmw0Var = btsVar2.a;
        int i3 = i | (btsVar2.k(z4fVar) ? 4 : 2) | (btsVar2.e(tlsVar) ? 256 : 128);
        if ((i3 & 9363) == 9362 && btsVar2.E()) {
            btsVar2.Y();
            slsVar3 = slsVar2;
            btsVar = btsVar2;
        } else {
            k3r k3rVar = ljs0.c;
            f530 k = f530Var.k(k3rVar);
            qnm qnmVar = qnm.a;
            long e = qnm.c(btsVar2).e();
            gji0 gji0Var = qke.q;
            f530 b = m4m0.b(k, e, gji0Var);
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a = qic.a(g43Var, so5Var, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, b);
            ohd.G1.getClass();
            sls slsVar4 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar4);
            } else {
                btsVar2.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar2, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar2, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar2.S) {
                i2 = i3;
            } else {
                i2 = i3;
            }
            b64.z(hashCode, btsVar2, hashCode, wlsVar3);
            wls wlsVar4 = d.d;
            qje.W(btsVar2, wlsVar4, d);
            String str = z4fVar.b;
            c530 c530Var = c530.a;
            nsa1.a(((i2 >> 3) & 112) | 384, btsVar2, tlsVar, ljs0.c(c530Var, 1.0f), str);
            qnm.d.getClass();
            oeb1.c(btsVar2, ljs0.m(c530Var, 4.0f));
            f530 b2 = m4m0.b(ymb1.l(k3rVar, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)), qnm.c(btsVar2).a(), gji0Var);
            sic a2 = qic.a(g43Var, so5Var, btsVar2, 0);
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d2 = b.d(btsVar2, b2);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar4);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar, a2);
            qje.W(btsVar2, wlsVar2, o2);
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar2, hashCode2, wlsVar3);
            }
            qje.W(btsVar2, wlsVar4, d2);
            oeb1.c(btsVar2, ljs0.m(c530Var, 1.0f));
            hq91.a(ohb1.e(btsVar2, oyh0.folders_selected_chats_title), an91.o(c530Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), null, DsHeading$Size.Xs, null, 0L, 0, 0L, 0, 0, wwg.S(-874011901, true, new ut9(16, z4fVar, slsVar), btsVar2), btsVar2, HProv.ALG_TYPE_SECURECHANNEL, 6, 1012);
            btsVar = btsVar2;
            if (list.isEmpty()) {
                btsVar.e0(-1776982127);
                f530 a3 = androidx.compose.ui.input.nestedscroll.b.a(pw91.u(k3rVar, pw91.o(btsVar), 14), y8e.a, null);
                slsVar3 = slsVar2;
                c6a1.a(48, btsVar, slsVar3, a3);
                btsVar.t(false);
            } else {
                slsVar3 = slsVar2;
                btsVar.e0(-1776640848);
                oeb1.c(btsVar, ljs0.m(c530Var, 2.0f));
                msa1.g(0, btsVar, null, list);
                btsVar.t(false);
            }
            btsVar.t(true);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b0((Object) z4fVar, f530Var, tlsVar, (cms) slsVar, (Object) slsVar3, i, 10);
        }
    }

    public static final void b(urh urhVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-281880233);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(urhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            cx20.a(null, null, null, null, null, false, false, null, wwg.S(9070217, true, new sp5(29, urhVar, tlsVar), btsVar), btsVar, 100663296, 255);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(urhVar, tlsVar, i, 8);
        }
    }

    public static final asw c(vv90 vv90Var) {
        asw aswVar = vv90Var instanceof asw ? (asw) vv90Var : null;
        if (aswVar != null) {
            return aswVar;
        }
        kbs.g("Incorrect PaymentApi provided");
        return null;
    }

    public static final Scenario d(CardInputMode cardInputMode) {
        int i = jx21.a[cardInputMode.ordinal()];
        if (i == 1) {
            return Scenario.CARD_BIND;
        }
        if (i == 2) {
            return Scenario.NEW_CARD_PAY;
        }
        w511.b();
        return null;
    }

    public static final void e(rq90 rq90Var, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = (d7 / 180.0d) * 3.141592653589793d;
        double cos = Math.cos(d10);
        double sin = Math.sin(d10);
        double a = vfc.a(d2, sin, d * cos, d5);
        double a2 = vfc.a(d2, cos, (-d) * sin, d6);
        double a3 = vfc.a(d4, sin, d3 * cos, d5);
        double d11 = d5;
        double a4 = vfc.a(d4, cos, (-d3) * sin, d6);
        double d12 = a - a3;
        double d13 = a2 - a4;
        double d14 = (a + a3) / 2.0d;
        double d15 = (a2 + a4) / 2.0d;
        double d16 = (d13 * d13) + (d12 * d12);
        if (d16 == 0.0d) {
            return;
        }
        double d17 = (1.0d / d16) - 0.25d;
        if (d17 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d16) / 1.99999d);
            e(rq90Var, d, d2, d3, d4, d11 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d17);
        double d18 = d12 * sqrt2;
        double d19 = sqrt2 * d13;
        if (z == z2) {
            d8 = d14 - d19;
            d9 = d15 + d18;
        } else {
            d8 = d14 + d19;
            d9 = d15 - d18;
        }
        double atan2 = Math.atan2(a2 - d9, a - d8);
        double atan22 = Math.atan2(a4 - d9, a3 - d8) - atan2;
        if (z2 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d20 = d8 * d11;
        double d21 = d9 * d6;
        double d22 = (d20 * cos) - (d21 * sin);
        double d23 = (d21 * cos) + (d20 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(d10);
        double sin2 = Math.sin(d10);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d24 = -d11;
        double d25 = d24 * cos2;
        double d26 = d6 * sin2;
        double d27 = (d25 * sin3) - (d26 * cos3);
        double d28 = d24 * sin2;
        double d29 = d6 * cos2;
        double d30 = atan22 / ceil;
        double d31 = d2;
        double d32 = atan2;
        double d33 = (cos3 * d29) + (sin3 * d28);
        int i = 0;
        double d34 = d;
        while (i < ceil) {
            double d35 = d32 + d30;
            double sin4 = Math.sin(d35);
            double cos4 = Math.cos(d35);
            double d36 = (((d11 * cos2) * cos4) + d22) - (d26 * sin4);
            int i2 = ceil;
            double d37 = (d29 * sin4) + (d5 * sin2 * cos4) + d23;
            double d38 = (d25 * sin4) - (d26 * cos4);
            double d39 = (cos4 * d29) + (sin4 * d28);
            double d40 = d35 - d32;
            double tan = Math.tan(d40 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d40)) / 3.0d;
            ((jb2) rq90Var).h((float) ((d27 * sqrt3) + d34), (float) ((d33 * sqrt3) + d31), (float) (d36 - (sqrt3 * d38)), (float) (d37 - (sqrt3 * d39)), (float) d36, (float) d37);
            i++;
            d30 = d30;
            d34 = d36;
            d31 = d37;
            ceil = i2;
            d32 = d35;
            d33 = d39;
            d27 = d38;
            sin2 = sin2;
            d11 = d5;
        }
    }

    public static final int f(Resources.Theme theme, int i) {
        TypedValue typedValue = new TypedValue();
        if (!theme.resolveAttribute(i, typedValue, true)) {
            typedValue = null;
        }
        if (typedValue != null) {
            return typedValue.data;
        }
        kbs.g("Theme does not contains all required colors");
        return 0;
    }

    public static final jb2 g(List list, rq90 rq90Var) {
        Path path;
        int i;
        int i2;
        float f;
        tr90 tr90Var;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        List list2 = list;
        jb2 jb2Var = (jb2) rq90Var;
        int j = jb2Var.j();
        Path path2 = jb2Var.a;
        jb2Var.p();
        jb2Var.q(j);
        tr90 tr90Var2 = list2.isEmpty() ? br90.c : (tr90) list2.get(0);
        int size = list2.size();
        float f13 = 0.0f;
        int i3 = 0;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        while (i3 < size) {
            tr90 tr90Var3 = (tr90) list2.get(i3);
            if (tr90Var3 instanceof br90) {
                jb2Var.g();
                path = path2;
                i = size;
                f = f13;
                i2 = i3;
                tr90Var = tr90Var3;
                f14 = f18;
                f16 = f14;
                f15 = f19;
                f17 = f15;
            } else {
                if (tr90Var3 instanceof nr90) {
                    nr90 nr90Var = (nr90) tr90Var3;
                    float f20 = nr90Var.c;
                    f14 += f20;
                    float f21 = nr90Var.d;
                    f15 += f21;
                    path2.rMoveTo(f20, f21);
                    f18 = f14;
                    f19 = f15;
                } else if (tr90Var3 instanceof fr90) {
                    fr90 fr90Var = (fr90) tr90Var3;
                    f14 = fr90Var.c;
                    float f22 = fr90Var.d;
                    jb2Var.m(f14, f22);
                    f15 = f22;
                    f19 = f15;
                    f18 = f14;
                } else if (tr90Var3 instanceof mr90) {
                    mr90 mr90Var = (mr90) tr90Var3;
                    float f23 = mr90Var.d;
                    float f24 = mr90Var.c;
                    path2.rLineTo(f24, f23);
                    f14 += f24;
                    f15 += f23;
                } else {
                    if (tr90Var3 instanceof er90) {
                        er90 er90Var = (er90) tr90Var3;
                        float f25 = er90Var.d;
                        f2 = er90Var.c;
                        jb2Var.l(f2, f25);
                        f15 = f25;
                        path = path2;
                        i = size;
                        f = f13;
                        i2 = i3;
                        tr90Var = tr90Var3;
                    } else if (tr90Var3 instanceof lr90) {
                        float f26 = ((lr90) tr90Var3).c;
                        path2.rLineTo(f26, f13);
                        f14 += f26;
                    } else if (tr90Var3 instanceof dr90) {
                        float f27 = ((dr90) tr90Var3).c;
                        jb2Var.l(f27, f15);
                        f14 = f27;
                    } else if (tr90Var3 instanceof rr90) {
                        float f28 = ((rr90) tr90Var3).c;
                        path2.rLineTo(f13, f28);
                        f15 += f28;
                    } else if (tr90Var3 instanceof sr90) {
                        float f29 = ((sr90) tr90Var3).c;
                        jb2Var.l(f14, f29);
                        f15 = f29;
                    } else {
                        if (tr90Var3 instanceof kr90) {
                            kr90 kr90Var = (kr90) tr90Var3;
                            jb2Var.a.rCubicTo(kr90Var.c, kr90Var.d, kr90Var.e, kr90Var.f, kr90Var.g, kr90Var.h);
                            f16 = kr90Var.e + f14;
                            f17 = kr90Var.f + f15;
                            f14 += kr90Var.g;
                            f12 = kr90Var.h;
                        } else {
                            if (tr90Var3 instanceof cr90) {
                                cr90 cr90Var = (cr90) tr90Var3;
                                jb2Var.h(cr90Var.c, cr90Var.d, cr90Var.e, cr90Var.f, cr90Var.g, cr90Var.h);
                                f5 = cr90Var.e;
                                f7 = cr90Var.f;
                                f8 = cr90Var.g;
                                f9 = cr90Var.h;
                            } else if (tr90Var3 instanceof pr90) {
                                if (tr90Var2.a) {
                                    f10 = f14 - f16;
                                    f11 = f15 - f17;
                                } else {
                                    f10 = 0.0f;
                                    f11 = 0.0f;
                                }
                                pr90 pr90Var = (pr90) tr90Var3;
                                jb2Var.a.rCubicTo(f10, f11, pr90Var.c, pr90Var.d, pr90Var.e, pr90Var.f);
                                f16 = pr90Var.c + f14;
                                f17 = pr90Var.d + f15;
                                f14 += pr90Var.e;
                                f12 = pr90Var.f;
                            } else if (tr90Var3 instanceof hr90) {
                                if (tr90Var2.a) {
                                    f14 = (f14 * 2.0f) - f16;
                                    f15 = (2.0f * f15) - f17;
                                }
                                hr90 hr90Var = (hr90) tr90Var3;
                                jb2Var.h(f14, f15, hr90Var.c, hr90Var.d, hr90Var.e, hr90Var.f);
                                f5 = hr90Var.c;
                                f7 = hr90Var.d;
                                f8 = hr90Var.e;
                                f9 = hr90Var.f;
                            } else if (tr90Var3 instanceof or90) {
                                or90 or90Var = (or90) tr90Var3;
                                float f30 = or90Var.f;
                                float f31 = or90Var.e;
                                float f32 = or90Var.d;
                                float f33 = or90Var.c;
                                path2.rQuadTo(f33, f32, f31, f30);
                                float f34 = f33 + f14;
                                float f35 = f32 + f15;
                                f14 += f31;
                                f15 += f30;
                                f16 = f34;
                                f17 = f35;
                                path = path2;
                                i = size;
                                i2 = i3;
                                tr90Var = tr90Var3;
                                f = 0.0f;
                            } else {
                                if (tr90Var3 instanceof gr90) {
                                    gr90 gr90Var = (gr90) tr90Var3;
                                    float f36 = gr90Var.f;
                                    float f37 = gr90Var.e;
                                    f6 = gr90Var.d;
                                    f5 = gr90Var.c;
                                    path2.quadTo(f5, f6, f37, f36);
                                    f15 = f36;
                                    f14 = f37;
                                } else if (tr90Var3 instanceof qr90) {
                                    if (tr90Var2.b) {
                                        f3 = f14 - f16;
                                        f4 = f15 - f17;
                                    } else {
                                        f3 = 0.0f;
                                        f4 = 0.0f;
                                    }
                                    qr90 qr90Var = (qr90) tr90Var3;
                                    float f38 = qr90Var.d;
                                    float f39 = qr90Var.c;
                                    path2.rQuadTo(f3, f4, f39, f38);
                                    f5 = f3 + f14;
                                    f6 = f4 + f15;
                                    f14 += f39;
                                    f15 += f38;
                                } else if (tr90Var3 instanceof ir90) {
                                    if (tr90Var2.b) {
                                        f14 = (f14 * 2.0f) - f16;
                                        f15 = (2.0f * f15) - f17;
                                    }
                                    ir90 ir90Var = (ir90) tr90Var3;
                                    float f40 = ir90Var.d;
                                    f2 = ir90Var.c;
                                    path2.quadTo(f14, f15, f2, f40);
                                    f17 = f15;
                                    f15 = f40;
                                    path = path2;
                                    i = size;
                                    i2 = i3;
                                    tr90Var = tr90Var3;
                                    f = 0.0f;
                                    f16 = f14;
                                } else if (tr90Var3 instanceof jr90) {
                                    jr90 jr90Var = (jr90) tr90Var3;
                                    float f41 = jr90Var.h + f14;
                                    float f42 = jr90Var.i + f15;
                                    path = path2;
                                    jb2Var = jb2Var;
                                    i2 = i3;
                                    i = size;
                                    f = 0.0f;
                                    e(jb2Var, f14, f15, f41, f42, jr90Var.c, jr90Var.d, jr90Var.e, jr90Var.f, jr90Var.g);
                                    f14 = f41;
                                    f16 = f14;
                                    f15 = f42;
                                    f17 = f15;
                                    tr90Var = tr90Var3;
                                } else {
                                    path = path2;
                                    i = size;
                                    i2 = i3;
                                    f = 0.0f;
                                    if (!(tr90Var3 instanceof ar90)) {
                                        w511.b();
                                        return null;
                                    }
                                    ar90 ar90Var = (ar90) tr90Var3;
                                    float f43 = ar90Var.i;
                                    float f44 = ar90Var.h;
                                    tr90Var = tr90Var3;
                                    jb2Var = jb2Var;
                                    e(jb2Var, f14, f15, f44, f43, ar90Var.c, ar90Var.d, ar90Var.e, ar90Var.f, ar90Var.g);
                                    f15 = f43;
                                    f17 = f15;
                                    f14 = f44;
                                    f16 = f14;
                                }
                                f17 = f6;
                                path = path2;
                                i = size;
                                i2 = i3;
                                tr90Var = tr90Var3;
                                f = 0.0f;
                                f16 = f5;
                            }
                            f17 = f7;
                            f14 = f8;
                            f15 = f9;
                            path = path2;
                            i = size;
                            i2 = i3;
                            tr90Var = tr90Var3;
                            f = 0.0f;
                            f16 = f5;
                        }
                        f15 += f12;
                        path = path2;
                        i = size;
                        i2 = i3;
                        tr90Var = tr90Var3;
                        f = 0.0f;
                    }
                    f14 = f2;
                }
                path = path2;
                i = size;
                f = f13;
                i2 = i3;
                tr90Var = tr90Var3;
            }
            i3 = i2 + 1;
            list2 = list;
            path2 = path;
            size = i;
            tr90Var2 = tr90Var;
            f13 = f;
        }
        return jb2Var;
    }
}
