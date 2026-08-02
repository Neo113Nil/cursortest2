package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.theme.AppThemeType;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class twa1 {
    public static final void a(exl0 exl0Var, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-715443520);
        int i2 = i | (btsVar2.k(exl0Var) ? 4 : 2) | (btsVar2.e(tlsVar) ? 32 : 16) | (btsVar2.k(f530Var) ? 256 : 128);
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, f530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, a);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d);
            d(exl0Var, tlsVar, btsVar2, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            f(exl0Var.a, btsVar2, 0);
            jeb1.f(exl0Var.b, an91.m(c530.a, 16.0f, 0.0f, 2), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar2).g.a, btsVar2, 432, 0, 16376);
            btsVar = btsVar2;
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qeg0(exl0Var, tlsVar, f530Var, i, 14);
        }
    }

    public static final void b(CharSequence charSequence, tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        URLSpan[] uRLSpanArr;
        URLSpan uRLSpan;
        Throwable th;
        boolean z;
        CharSequence charSequence2 = charSequence;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(360295652);
        int i2 = i | (btsVar2.k(charSequence2) ? 4 : 2) | (btsVar2.e(tlsVar) ? 32 : 16);
        int i3 = 0;
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 l = an91.l(ljs0.c(c530Var, 1.0f), 8.0f, 16.0f);
            int i4 = i2 & 14;
            boolean z2 = i4 == 4;
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (z2 || Q == o430Var) {
                Spanned spanned = charSequence2 instanceof Spanned ? (Spanned) charSequence2 : null;
                Q = (spanned == null || (uRLSpanArr = (URLSpan[]) spanned.getSpans(0, charSequence2.length(), URLSpan.class)) == null || (uRLSpan = (URLSpan) j73.D(uRLSpanArr)) == null) ? null : uRLSpan.getURL();
                btsVar2.o0(Q);
            }
            String str = (String) Q;
            if (str != null) {
                btsVar2.e0(-1648220571);
                Context context = (Context) btsVar2.m(AndroidCompositionLocals_androidKt.b);
                boolean k = btsVar2.k(context);
                th = null;
                Object Q2 = btsVar2.Q();
                if (k || Q2 == o430Var) {
                    Q2 = tje.B(context);
                    btsVar2.o0(Q2);
                }
                AccessibilityManager accessibilityManager = (AccessibilityManager) Q2;
                Object Q3 = btsVar2.Q();
                if (Q3 == o430Var) {
                    Q3 = f.j(Boolean.valueOf(tje.L(context)));
                    btsVar2.o0(Q3);
                }
                oz40 oz40Var = (oz40) Q3;
                boolean e = btsVar2.e(accessibilityManager);
                Object Q4 = btsVar2.Q();
                if (e || Q4 == o430Var) {
                    Q4 = new vxj0(20, accessibilityManager, oz40Var);
                    btsVar2.o0(Q4);
                }
                zpn.a(accessibilityManager, (tls) Q4, btsVar2);
                z = ((Boolean) oz40Var.getValue()).booleanValue();
                btsVar2.t(false);
            } else {
                th = null;
                btsVar2.e0(444771088);
                btsVar2.t(false);
                z = false;
            }
            int i5 = 13;
            if (z) {
                btsVar2.e0(444818678);
                f530 c = ljs0.c(c530Var, 1.0f);
                awk0 awk0Var = new awk0(0);
                boolean k2 = ((i2 & 112) == 32) | btsVar2.k(str);
                Object Q5 = btsVar2.Q();
                if (k2 || Q5 == o430Var) {
                    Q5 = new a91(tlsVar, str, i5);
                    btsVar2.o0(Q5);
                }
                f530 d = q791.d(c, false, null, awk0Var, (sls) Q5, 11);
                boolean z3 = i4 == 4;
                Object Q6 = btsVar2.Q();
                if (z3 || Q6 == o430Var) {
                    Q6 = new oau(3, charSequence2);
                    btsVar2.o0(Q6);
                }
                f530 b = fnq0.b(d, false, (tls) Q6);
                z910 d2 = pi6.d(x4c.b, false);
                int hashCode = Long.hashCode(btsVar2.T);
                r1b0 o = btsVar2.o();
                f530 d3 = b.d(btsVar2, b);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (btsVar2.a == null) {
                    cma1.b0();
                    throw th;
                }
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar);
                } else {
                    btsVar2.r0();
                }
                qje.W(btsVar2, d.f, d2);
                qje.W(btsVar2, d.e, o);
                qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                qje.M(btsVar2, d.h);
                qje.W(btsVar2, d.d, d3);
                qgy.b(charSequence2, null, l, AppColor$Palette.TextMinor, uh6.E(13), 0L, null, 0L, 0, 0, 0, xya1.d(btsVar2).g.a, null, btsVar2, i4 | 28080, 0, 12256);
                btsVar2.t(true);
                btsVar2.t(false);
                btsVar = btsVar2;
                charSequence2 = charSequence;
            } else {
                btsVar2.e0(445307548);
                ety0 ety0Var = xya1.d(btsVar2).g.a;
                AppColor$Palette appColor$Palette = AppColor$Palette.TextMinor;
                long E = uh6.E(13);
                boolean z4 = (i2 & 112) == 32;
                Object Q7 = btsVar2.Q();
                if (z4 || Q7 == o430Var) {
                    Q7 = new uwl0(i3, tlsVar);
                    btsVar2.o0(Q7);
                }
                charSequence2 = charSequence;
                qgy.b(charSequence2, null, l, appColor$Palette, E, 0L, null, 0L, 0, 0, 0, ety0Var, (tls) Q7, btsVar2, i4 | 28032, 0, 4066);
                btsVar = btsVar2;
                btsVar.t(false);
            }
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ip30(charSequence2, tlsVar, i, 1);
        }
    }

    public static final void c(final exl0 exl0Var, tls tlsVar, fid fidVar, int i) {
        final exl0 exl0Var2;
        c530 c530Var;
        float f;
        int i2;
        float f2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1125555653);
        int i3 = i | (btsVar.k(exl0Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        final int i4 = 0;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            c530 c530Var2 = c530.a;
            f530 l = an91.l(i9a1.d(ljs0.c(c530Var2, 1.0f)), 8.0f, 8.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, l);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            CharSequence charSequence = exl0Var.g;
            if (charSequence == null) {
                btsVar.e0(350595056);
                btsVar.t(false);
            } else {
                btsVar.e0(350595057);
                b(charSequence, tlsVar, btsVar, i3 & 112);
                yrl.b(6, 6, btsVar, an91.m(c530Var2, 8.0f, 0.0f, 2));
                btsVar.t(false);
            }
            String str = exl0Var.c;
            o430 o430Var = did.a;
            if (str != null) {
                btsVar.e0(350812956);
                f530 c = ljs0.c(c530Var2, 1.0f);
                ButtonStyle buttonStyle = ButtonStyle.Ghost;
                boolean z = (i3 & 112) == 32;
                Object Q = btsVar.Q();
                if (z || Q == o430Var) {
                    Q = new v6k0(22, tlsVar);
                    btsVar.o0(Q);
                }
                i2 = i3;
                f = 8.0f;
                f2 = 1.0f;
                c530Var = c530Var2;
                d17.c(c, false, null, buttonStyle, null, (sls) Q, wwg.S(-1817117464, true, new jk30(str, 17), btsVar), btsVar, 1575942, 22);
                btsVar.t(false);
            } else {
                c530Var = c530Var2;
                f = 8.0f;
                i2 = i3;
                f2 = 1.0f;
                btsVar.e0(351085105);
                btsVar.t(false);
            }
            f530 e = n.e(c530Var, f, btsVar, c530Var, f2);
            ButtonStyle buttonStyle2 = ButtonStyle.Minor;
            int i5 = i2 & 112;
            boolean z2 = i5 == 32;
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new v6k0(23, tlsVar);
                btsVar.o0(Q2);
            }
            d17.c(e, false, null, buttonStyle2, null, (sls) Q2, wwg.S(906144973, true, new zls() { // from class: vwl0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i4;
                    zy11 zy11Var = zy11.a;
                    exl0 exl0Var3 = exl0Var;
                    switch (i6) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else {
                                jeb1.f(exl0Var3.d, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).g.a, btsVar2, 0, 0, 16382);
                                break;
                            }
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                btsVar3.Y();
                                break;
                            } else {
                                jeb1.f(exl0Var3.e, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar3).g.b, btsVar3, 0, 0, 16382);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), btsVar, 1575942, 22);
            f530 e2 = n.e(c530Var, f, btsVar, c530Var, f2);
            ButtonStyle buttonStyle3 = ButtonStyle.Main;
            boolean z3 = i5 == 32;
            Object Q3 = btsVar.Q();
            if (z3 || Q3 == o430Var) {
                Q3 = new v6k0(24, tlsVar);
                btsVar.o0(Q3);
            }
            final int i6 = 1;
            exl0Var2 = exl0Var;
            d17.c(e2, false, null, buttonStyle3, null, (sls) Q3, wwg.S(-262207548, true, new zls() { // from class: vwl0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i62 = i6;
                    zy11 zy11Var = zy11.a;
                    exl0 exl0Var3 = exl0Var2;
                    switch (i62) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else {
                                jeb1.f(exl0Var3.d, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).g.a, btsVar2, 0, 0, 16382);
                                break;
                            }
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                btsVar3.Y();
                                break;
                            } else {
                                jeb1.f(exl0Var3.e, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar3).g.b, btsVar3, 0, 0, 16382);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), btsVar, 1575942, 22);
            btsVar.t(true);
        } else {
            exl0Var2 = exl0Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t7l0(exl0Var2, tlsVar, i, 7);
        }
    }

    public static final void d(exl0 exl0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1866794871);
        dmw0 dmw0Var = btsVar2.a;
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(exl0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        int i3 = i2;
        if (btsVar2.V(i3 & 1, (i3 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 e = ljs0.e(ljs0.c(c530Var, 1.0f), 64.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d2 = b.d(btsVar2, e);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar2, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar2, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar2, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar2, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar2, wlsVar4, d2);
            sy2.a(btsVar2);
            AppThemeType a = srt.a(btsVar2);
            boolean c = btsVar2.c(a.ordinal());
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (c || Q == o430Var) {
                Q = Integer.valueOf(a == AppThemeType.Light ? exl0Var.f.a : exl0Var.f.b);
                btsVar2.o0(Q);
            }
            int intValue = ((Number) Q).intValue();
            f530 e2 = ljs0.e(c530Var, 26.0f);
            uo5 uo5Var = x4c.y;
            cj6 cj6Var = cj6.a;
            btsVar = btsVar2;
            o4b1.b(wya1.a(intValue, 0, btsVar2), null, cj6Var.a(e2, uo5Var), null, null, 0.0f, null, btsVar, 56, 120);
            String e3 = ohb1.e(btsVar, xxh0.common_back);
            f530 a2 = cj6Var.a(ljs0.i(c530Var, dsz0.b), x4c.x);
            boolean k = btsVar.k(e3);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = new dcc0(e3, 22);
                btsVar.o0(Q2);
            }
            f530 a3 = fnq0.a(a2, (tls) Q2);
            boolean z = (i3 & 112) == 32;
            Object Q3 = btsVar.Q();
            if (z || Q3 == o430Var) {
                Q3 = new v6k0(21, tlsVar);
                btsVar.o0(Q3);
            }
            f530 d3 = q791.d(a3, false, null, null, (sls) Q3, 15);
            z910 d4 = pi6.d(uo5Var, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d5 = b.d(btsVar, d3);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d4);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d5);
            sya1.a(vza1.c(), null, null, null, btsVar, 384, 10);
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new twl0(exl0Var, tlsVar, i, 0);
        }
    }

    public static final void e(exl0 exl0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-724531059);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(exl0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new v6k0(20, tlsVar);
                btsVar.o0(Q);
            }
            gya1.d(false, (sls) Q, btsVar, 0, 1);
            qy20.a(null, v2o.a, ymo.a, false, wwg.S(-1180259413, true, new u5(10, exl0Var, tlsVar), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 9);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new twl0(exl0Var, tlsVar, i, i3);
        }
    }

    public static final void f(String str, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(91001978);
        int i2 = i | (btsVar.k(str) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 m = an91.m(ljs0.g(ljs0.c(c530Var, 1.0f), 65.0f, 0.0f, 2), 16.0f, 0.0f, 2);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, m);
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
            jeb1.f(str, cj6.a.a(an91.m(c530Var, 0.0f, 12.0f, 1), x4c.x), AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).e.e, btsVar, (i2 & 14) | 384, 0, 16376);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fzv(str, i, 27);
        }
    }

    public static gly0 g() {
        return new gly0();
    }

    public static final void h(final View view) {
        view.animate().alpha(1.0f).setDuration(100L).setListener(new AnimatorListenerAdapter() { // from class: com.yandex.go.places.common.ui.AnimUtilsKt$shortFadeInAndShow$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                view.setVisibility(0);
            }
        }).start();
    }

    public static final void i(final View view) {
        view.animate().alpha(0.0f).setDuration(100L).setListener(new AnimatorListenerAdapter() { // from class: com.yandex.go.places.common.ui.AnimUtilsKt$shortFadeOutAndGone$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                view.setVisibility(8);
            }
        }).start();
    }

    public static int j(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }
}
