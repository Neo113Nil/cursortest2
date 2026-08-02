package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import androidx.compose.animation.e;
import androidx.compose.animation.i;
import androidx.compose.animation.k;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes11.dex */
public abstract class q5b1 {
    public static final void a(f611 f611Var, fid fidVar, int i) {
        f611 f611Var2;
        int i2;
        bts btsVar;
        Object lc0Var;
        auy0 auy0Var;
        Context context;
        boolean z;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-730642760);
        int i3 = (btsVar2.e(f611Var) ? 4 : 2) | i;
        if (btsVar2.V(i3 & 1, (i3 & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 o = an91.o(c530Var, 0.0f, 24.0f, 0.0f, 4.0f, 5);
            sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d = b.d(btsVar2, o);
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
            qje.W(btsVar2, d.e, o2);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d);
            jeb1.f(f611Var.a, null, AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).g.b, btsVar2, 384, 0, 16378);
            Context context2 = (Context) btsVar2.m(AndroidCompositionLocals_androidKt.b);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                RobotoTextView robotoTextView = new RobotoTextView(context2, null, 0, 6, null);
                robotoTextView.setMaxLines(2);
                robotoTextView.setLineSpacing(1.0f, 1.2f);
                robotoTextView.setTextSize(13.0f);
                int u = tje.u(2, robotoTextView.getContext());
                robotoTextView.setPadding(u, u, u, u);
                robotoTextView.setTextColorAttr(xng0.textMain);
                robotoTextView.setTextTypeface(3);
                btsVar2.o0(robotoTextView);
                Q = robotoTextView;
            }
            RobotoTextView robotoTextView2 = (RobotoTextView) Q;
            Object Q2 = btsVar2.Q();
            if (Q2 == o430Var) {
                Q2 = new auy0(robotoTextView2);
                btsVar2.o0(Q2);
            }
            auy0 auy0Var2 = (auy0) Q2;
            f530 o3 = an91.o(c530Var, 0.0f, 4.0f, 0.0f, 2.0f, 5);
            boolean e = btsVar2.e(robotoTextView2) | btsVar2.e(context2) | btsVar2.e(f611Var) | btsVar2.e(auy0Var2);
            Object Q3 = btsVar2.Q();
            if (e || Q3 == o430Var) {
                i2 = 0;
                auy0Var = auy0Var2;
                context = context2;
                z = true;
                lc0Var = new lc0(robotoTextView2, context, f611Var, auy0Var, 5);
                f611Var2 = f611Var;
                btsVar2.o0(lc0Var);
            } else {
                auy0Var = auy0Var2;
                f611Var2 = f611Var;
                context = context2;
                lc0Var = Q3;
                z = true;
                i2 = 0;
            }
            tls tlsVar = (tls) lc0Var;
            boolean e2 = btsVar2.e(context) | btsVar2.e(f611Var2) | btsVar2.e(auy0Var);
            Object Q4 = btsVar2.Q();
            if (e2 || Q4 == o430Var) {
                Q4 = new q(16, context, f611Var2, auy0Var);
                btsVar2.o0(Q4);
            }
            tls tlsVar2 = (tls) Q4;
            btsVar = btsVar2;
            androidx.compose.ui.viewinterop.b.a(tlsVar, o3, tlsVar2, btsVar, 48, 0);
            btsVar.t(z);
        } else {
            f611Var2 = f611Var;
            i2 = 0;
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zi5(f611Var2, i, i2);
        }
    }

    public static final void b(f611 f611Var, tls tlsVar, tls tlsVar2, ety0 ety0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(306348775);
        int i2 = i | (btsVar.e(f611Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.e(tlsVar2) ? 256 : 128) | (btsVar.k(ety0Var) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            btsVar.a0();
            if ((i & 1) != 0 && !btsVar.C()) {
                btsVar.Y();
            }
            btsVar.u();
            v1u v1uVar = f611Var.d;
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d = b.d(btsVar, c530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            sls slsVar2 = null;
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
            f530 o2 = an91.o(c530Var, 4.0f, 0.0f, 0.0f, 0.0f, 14);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new teb(20);
                btsVar.o0(Q);
            }
            f530 a2 = fnq0.a(o2, (tls) Q);
            int i3 = i2 << 3;
            jeb1.f(f611Var.a, a2, AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var, btsVar, 384, i3 & HProv.ALG_CLASS_ALL, 16376);
            btsVar = btsVar;
            if (v1uVar.a.isEmpty()) {
                btsVar.e0(-1034737775);
                btsVar.t(false);
            } else {
                btsVar.e0(-1035032802);
                f530 o3 = an91.o(c530Var, 0.0f, 16.0f, 0.0f, 0.0f, 13);
                bzy0 bzy0Var = v1uVar.g;
                if (bzy0Var == null) {
                    btsVar.e0(-1034852848);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-1034852847);
                    boolean e = btsVar.e(bzy0Var) | ((i2 & 112) == 32);
                    Object Q2 = btsVar.Q();
                    if (e || Q2 == o430Var) {
                        Q2 = new mw2(25, tlsVar, bzy0Var);
                        btsVar.o0(Q2);
                    }
                    slsVar2 = (sls) Q2;
                    btsVar.t(false);
                }
                g(v1uVar, o3, slsVar2, tlsVar2, btsVar, (i3 & 7168) | 48);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new aj5(f611Var, tlsVar, tlsVar2, ety0Var, i);
        }
    }

    public static final void c(f611 f611Var, f530 f530Var, boolean z, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1143899319);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(f611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 16384 : 8192;
        }
        if (!btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            btsVar.Y();
        } else if (z) {
            btsVar.e0(-1633802523);
            int i3 = i2 & HProv.PP_DELETE_SAVED_PASSWD;
            int i4 = i2 >> 3;
            e(f611Var, f530Var, tlsVar, tlsVar2, null, btsVar, i3 | (i4 & 896) | (i4 & 7168));
            btsVar.t(false);
        } else {
            btsVar.e0(-1633683545);
            d(f611Var, f530Var, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ym1(f611Var, f530Var, z, tlsVar, tlsVar2, i, 1);
        }
    }

    public static final void d(final f611 f611Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1604981316);
        final int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.e(f611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        final int i4 = 0;
        final int i5 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 c = ljs0.c(f530Var, 1.0f);
            boolean e = btsVar.e(f611Var);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new j24(20, f611Var);
                btsVar.o0(Q);
            }
            ydb1.a(fnq0.a(c, (tls) Q), wwg.S(992031450, true, new zls() { // from class: cj5
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i4;
                    zy11 zy11Var = zy11.a;
                    f611 f611Var2 = f611Var;
                    switch (i6) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else {
                                q5b1.f(f611Var2, btsVar2, 0);
                                break;
                            }
                        case 1:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                btsVar3.Y();
                                break;
                            } else {
                                q5b1.a(f611Var2, btsVar3, 0);
                                break;
                            }
                        default:
                            fid fidVar4 = (fid) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            bts btsVar4 = (bts) fidVar4;
                            if (!btsVar4.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                                btsVar4.Y();
                                break;
                            } else {
                                ytb1.a(0, btsVar4, null, f611Var2.b);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), wwg.S(-823063275, true, new zls() { // from class: cj5
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i5;
                    zy11 zy11Var = zy11.a;
                    f611 f611Var2 = f611Var;
                    switch (i6) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else {
                                q5b1.f(f611Var2, btsVar2, 0);
                                break;
                            }
                        case 1:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                btsVar3.Y();
                                break;
                            } else {
                                q5b1.a(f611Var2, btsVar3, 0);
                                break;
                            }
                        default:
                            fid fidVar4 = (fid) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            bts btsVar4 = (bts) fidVar4;
                            if (!btsVar4.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                                btsVar4.Y();
                                break;
                            } else {
                                ytb1.a(0, btsVar4, null, f611Var2.b);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, wwg.S(-824397361, true, new zls() { // from class: cj5
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i3;
                    zy11 zy11Var = zy11.a;
                    f611 f611Var2 = f611Var;
                    switch (i6) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else {
                                q5b1.f(f611Var2, btsVar2, 0);
                                break;
                            }
                        case 1:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                btsVar3.Y();
                                break;
                            } else {
                                q5b1.a(f611Var2, btsVar3, 0);
                                break;
                            }
                        default:
                            fid fidVar4 = (fid) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            bts btsVar4 = (bts) fidVar4;
                            if (!btsVar4.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                                btsVar4.Y();
                                break;
                            } else {
                                ytb1.a(0, btsVar4, null, f611Var2.b);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, SlotSize.L, false, btsVar, 1597872, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(f611Var, f530Var, i, 29);
        }
    }

    public static final void e(f611 f611Var, f530 f530Var, tls tlsVar, tls tlsVar2, ety0 ety0Var, fid fidVar, int i) {
        int i2;
        bts btsVar;
        ety0 ety0Var2;
        ety0 ety0Var3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(171206033);
        if ((i & 6) == 0) {
            i2 = (btsVar2.e(f611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.e(tlsVar2) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= 8192;
        }
        if (btsVar2.V(i2 & 1, (i2 & 9363) != 9362)) {
            btsVar2.a0();
            if ((i & 1) == 0 || btsVar2.C()) {
                ety0Var3 = xya1.d(btsVar2).f.c;
            } else {
                btsVar2.Y();
                ety0Var3 = ety0Var;
            }
            btsVar2.u();
            String str = f611Var.f;
            String str2 = f611Var.d.f;
            boolean k = btsVar2.k(str) | btsVar2.k(str2);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                String str3 = f611Var.f;
                if (str3.length() <= 0) {
                    str3 = null;
                }
                if (str2.length() <= 0) {
                    str2 = null;
                }
                Q = a.X(j73.A(new String[]{str3, str2}), ". ", null, null, null, 62);
                btsVar2.o0(Q);
            }
            String str4 = (String) Q;
            String str5 = f611Var.b;
            boolean k2 = btsVar2.k(str4);
            Object Q2 = btsVar2.Q();
            if (k2 || Q2 == o430Var) {
                Q2 = new h0(str4, 17);
                btsVar2.o0(Q2);
            }
            f530 b = fnq0.b(f530Var, true, (tls) Q2);
            y2d.a.getClass();
            btsVar = btsVar2;
            a5l0.d(str5, b, 0.0f, 0.0f, null, 0.0f, ety0Var3, null, y2d.b, wwg.S(-617544319, true, new aj5(f611Var, tlsVar, tlsVar2, ety0Var3), btsVar2), btsVar, 906166272, 156);
            ety0Var2 = ety0Var3;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            ety0Var2 = ety0Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0(i, 8, tlsVar, f530Var, f611Var, tlsVar2, ety0Var2);
        }
    }

    public static final void f(f611 f611Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(584650288);
        int i2 = (btsVar.e(f611Var) ? 4 : 2) | i;
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            boolean k = btsVar.k(f611Var.g);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                kdc kdcVar = f611Var.g.a;
                Q = kdcVar != null ? Integer.valueOf(s8o.m(kdcVar, context)) : null;
                btsVar.o0(Q);
            }
            Integer num = (Integer) Q;
            f530 m = ljs0.m(c530.a, SlotSize.L.getSize());
            z910 d = pi6.d(x4c.y, false);
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
            xtb1.a(null, f611Var.c, num, null, btsVar, 0, 8);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zi5(f611Var, i, i3);
        }
    }

    public static final void g(final v1u v1uVar, final f530 f530Var, final sls slsVar, final tls tlsVar, fid fidVar, final int i) {
        int i2;
        sls slsVar2;
        tls tlsVar2;
        aii0 v;
        wls wlsVar;
        o430 o430Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-535134914);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(v1uVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            List list = v1uVar.a;
            if (list.isEmpty()) {
                v = btsVar.v();
                if (v != null) {
                    final int i3 = 0;
                    wlsVar = new wls() { // from class: bj5
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            zy11 zy11Var = zy11.a;
                            int i5 = i;
                            switch (i4) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int O = vng.O(i5 | 1);
                                    q5b1.g(v1uVar, f530Var, slsVar, tlsVar, (fid) obj, O);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int O2 = vng.O(i5 | 1);
                                    q5b1.g(v1uVar, f530Var, slsVar, tlsVar, (fid) obj, O2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            List A0 = a.A0(list, 3);
            String e = ohb1.e(btsVar, kyh0.mt_route_details_v2_ground_more_button);
            ib11 ib11Var = (ib11) a.P(A0);
            List J = a.J(A0, 1);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            Object Q = btsVar.Q();
            o430 o430Var2 = did.a;
            if (Q == o430Var2) {
                Q = new l75(14);
                btsVar.o0(Q);
            }
            tls tlsVar3 = (tls) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var2) {
                Q2 = new l75(15);
                btsVar.o0(Q2);
            }
            androidx.compose.animation.a.b(ib11Var, null, tlsVar3, null, "mainBubbleTransition", (tls) Q2, wwg.S(403538281, true, new dr5(tlsVar, A0, slsVar, e, 2), btsVar), btsVar, 1794432, 10);
            if (v1uVar.f.length() > 0) {
                btsVar.e0(63760997);
                f530 o2 = an91.o(c530.a, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                Object Q3 = btsVar.Q();
                if (Q3 == o430Var2) {
                    Q3 = new teb(20);
                    btsVar.o0(Q3);
                }
                o430Var = o430Var2;
                jeb1.f(v1uVar.f, fnq0.a(o2, (tls) Q3), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.a, btsVar, 384, 0, 16376);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                o430Var = o430Var2;
                btsVar.e0(63990862);
                btsVar.t(false);
            }
            Object Q4 = btsVar.Q();
            o430 o430Var3 = o430Var;
            if (Q4 == o430Var3) {
                Q4 = new l75(16);
                btsVar.o0(Q4);
            }
            tls tlsVar4 = (tls) Q4;
            Object Q5 = btsVar.Q();
            if (Q5 == o430Var3) {
                Q5 = new l75(17);
                btsVar.o0(Q5);
            }
            slsVar2 = slsVar;
            tlsVar2 = tlsVar;
            androidx.compose.animation.a.b(J, null, tlsVar4, null, "alternativesTransition", (tls) Q5, wwg.S(849012706, true, new dhj0(tlsVar2, slsVar2, e, 2), btsVar), btsVar, 1794432, 10);
            btsVar.t(true);
        } else {
            slsVar2 = slsVar;
            tlsVar2 = tlsVar;
            btsVar.Y();
        }
        v = btsVar.v();
        if (v != null) {
            final int i4 = 1;
            final sls slsVar4 = slsVar2;
            final tls tlsVar5 = tlsVar2;
            wlsVar = new wls() { // from class: bj5
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i4;
                    zy11 zy11Var = zy11.a;
                    int i5 = i;
                    switch (i42) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int O = vng.O(i5 | 1);
                            q5b1.g(v1uVar, f530Var, slsVar4, tlsVar5, (fid) obj, O);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int O2 = vng.O(i5 | 1);
                            q5b1.g(v1uVar, f530Var, slsVar4, tlsVar5, (fid) obj, O2);
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final void h(String str, sls slsVar, fid fidVar, int i) {
        sls slsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-148772378);
        int i2 = 16;
        int i3 = (btsVar.k(str) ? 4 : 2) | i | (btsVar.e(slsVar) ? 32 : 16);
        int i4 = 0;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 14) == 4;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new h0(str, i2);
                btsVar.o0(Q);
            }
            slsVar2 = slsVar;
            ulb1.b(fnq0.b(c530.a, false, (tls) Q), false, ButtonSize.XS, slsVar2, wwg.S(1132038965, true, new le(str, 8), btsVar), btsVar, ((i3 << 6) & 7168) | 24960);
        } else {
            slsVar2 = slsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fj5(i, i4, slsVar2, str);
        }
    }

    public static slp i(xnp0 xnp0Var) {
        return new slp(kotlin.collections.b.i(new Pair("READY_MESSAGE_TIMEOUT_MILLIS_KEY", xnp0Var.a), new Pair("ANIMATION_DURATION_MILLIS_KEY", xnp0Var.b), new Pair("HOSTS_FOR_OPEN_IN_SYSTEM_KEY", xnp0Var.c), new Pair("ALLOWED_HOSTS_KEY", xnp0Var.d), new Pair("JS_BRIDGE_ALLOWED_HOSTS_KEY", xnp0Var.e), new Pair("FORBIDDEN_HOSTS_KEY", xnp0Var.f), new Pair("WEBVIEW_HIDE_THRESHOLD_KEY", xnp0Var.g), new Pair("WEBVIEW_DOWNWARD_SCROLL_FRICTION_KEY", xnp0Var.h), new Pair("IS_PANEL_DIAGNOSTIC_ENABLED_KEY", xnp0Var.i)));
    }

    public static final CharSequence j(Context context, f611 f611Var, auy0 auy0Var) {
        List list = f611Var.d.d;
        CharSequence charSequence = "";
        for (int i = 3; i > 0; i--) {
            charSequence = l(context, f611Var, i, list.size());
            if (auy0Var.e(charSequence)) {
                return charSequence;
            }
        }
        for (int size = list.size(); size > 0; size--) {
            charSequence = l(context, f611Var, 1, size);
            if (auy0Var.e(charSequence)) {
                return charSequence;
            }
        }
        return charSequence;
    }

    public static final i k(e eVar) {
        ldf ldfVar = ubn.c;
        ldf ldfVar2 = ubn.a;
        ck11 K = sb2.K(200, 0, ldfVar, 2);
        ck11 K2 = sb2.K(200, 0, ldfVar, 2);
        i iVar = new i(k.e(new ck11(660, 120, ldfVar2), 2).a(k.p(new ck11(660, 120, ldfVar2), new l75(19))), k.f(K, 2).a(k.u(K2, new l75(20))));
        ujs0 ujs0Var = new ujs0(false, new dj5(ldfVar2, 0));
        eVar.getClass();
        iVar.d = ujs0Var;
        return iVar;
    }

    public static final SpannableStringBuilder l(Context context, f611 f611Var, int i, int i2) {
        List<ib11> A0 = a.A0(f611Var.d.a, i);
        v1u v1uVar = f611Var.d;
        int size = (v1uVar.a.size() - A0.size()) + v1uVar.c;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (ib11 ib11Var : A0) {
            spannableStringBuilder.append(fh4.f(context, ib11Var.b, ib11Var.c, ib11Var.d));
            spannableStringBuilder.append((CharSequence) " ");
        }
        CharSequence j = size <= 0 ? null : fh4.j(context, context.getString(kyh0.mt_other_variants, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1)), new bdc(xng0.controlMinor), new bdc(xng0.textMinor), tje.w(48, context));
        if (j != null) {
            spannableStringBuilder.append(j);
        }
        List A02 = a.A0(v1uVar.d, i2);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
        spannableStringBuilder2.append((CharSequence) " ");
        int i3 = 0;
        for (Object obj : A02) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                scc.m();
                throw null;
            }
            spannableStringBuilder2.append((CharSequence) obj);
            if (i3 != scc.f(A02)) {
                spannableStringBuilder2.append((CharSequence) Extension.FIX_SPACE);
            }
            i3 = i4;
        }
        return spannableStringBuilder2;
    }
}
