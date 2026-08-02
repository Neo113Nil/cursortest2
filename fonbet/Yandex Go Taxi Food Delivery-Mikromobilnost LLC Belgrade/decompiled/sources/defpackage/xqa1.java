package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.d;
import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationSwipeDirection;
import com.yandex.go.ai_widget.ui.component.a;
import com.yandex.go.ai_widget.ui.component.b;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class xqa1 {
    public static final void a(b bVar, f530 f530Var, fid fidVar, int i) {
        b bVar2 = bVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1167508118);
        int i2 = (btsVar.k(bVar2) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 c = ljs0.c(f530Var, 1.0f);
            lhl0 a = khl0.a(lr20.f, x4c.D, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c);
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
            int i3 = i2 & 14;
            b(bVar2, AiWidgetEvaluationSwipeDirection.LEFT, mt71.m(j1h0.ai_widget_like, 0, btsVar), ohb1.e(btsVar, kyh0.texts_evaluator_dislike_button_accessibility_label), tje.n(AppColor$Palette.Error, btsVar), "evaluation_dislike_btn", ira1.i(c530.a, 180.0f), btsVar, i3 | 1770032, 0);
            bVar2 = bVar;
            b(bVar2, AiWidgetEvaluationSwipeDirection.RIGHT, mt71.m(j1h0.ai_widget_like, 0, btsVar), ohb1.e(btsVar, kyh0.texts_evaluator_like_button_accessibility_label), tje.n(new up2(eq2.c), btsVar), "evaluation_like_btn", null, btsVar, i3 | 197168, 64);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0v(bVar2, f530Var, i, 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x010d, code lost:
    
        if (r21.c() != com.yandex.go.ai_widget.data.model.AiWidgetEvaluationSwipeDirection.RIGHT) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fa, code lost:
    
        if (r21.c() != com.yandex.go.ai_widget.data.model.AiWidgetEvaluationSwipeDirection.LEFT) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(b bVar, AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection, pa90 pa90Var, String str, long j, String str2, f530 f530Var, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        f530 f530Var3;
        float e;
        boolean z;
        boolean a;
        Object Q;
        boolean z2;
        f530 f530Var4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-377698769);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i3 = (btsVar.k(bVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.c(aiWidgetEvaluationSwipeDirection.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? btsVar.k(pa90Var) : btsVar.e(pa90Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.k(str) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.d(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= btsVar.k(str2) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 != 0) {
            i3 |= 1572864;
            f530Var2 = f530Var;
        } else {
            f530Var2 = f530Var;
            if ((i & 1572864) == 0) {
                i3 |= btsVar.k(f530Var2) ? 1048576 : 524288;
            }
        }
        if (btsVar.V(i3 & 1, (i3 & 599187) != 599186)) {
            c530 c530Var = c530.a;
            f530 f530Var5 = i4 != 0 ? c530Var : f530Var2;
            int[] iArr = no1.a;
            int i5 = iArr[aiWidgetEvaluationSwipeDirection.ordinal()];
            if (i5 == 1) {
                e = bVar.e();
            } else {
                if (i5 != 2) {
                    w511.b();
                    return;
                }
                e = bVar.d();
            }
            if (!bVar.g()) {
                int i6 = iArr[aiWidgetEvaluationSwipeDirection.ordinal()];
                if (i6 == 1) {
                    if (bVar.c() != null) {
                    }
                    z = true;
                } else if (i6 != 2) {
                    w511.b();
                    return;
                } else {
                    if (bVar.c() != null) {
                    }
                    z = true;
                }
                float d = cjb1.d(80.0f, 96.0f, e);
                float d2 = cjb1.d(30.0f, 32.0f, e);
                long L = rzo.L(tje.n(AppColor$Palette.ControlMinor, btsVar), e, j);
                long L2 = rzo.L(tje.n(AppColor$Palette.Text, btsVar), e, tje.n(AppColor$Palette.EverFront, btsVar));
                f530 m = ljs0.m(f530Var5, 96.0f);
                a = ((i3 & 7168) != 2048) | btsVar.a(z);
                Q = btsVar.Q();
                o430 o430Var = did.a;
                if (!a || Q == o430Var) {
                    Q = new lo1(str, z, 0);
                    btsVar.o0(Q);
                }
                f530 a2 = fnq0.a(m, (tls) Q);
                if (z) {
                    z2 = false;
                    btsVar.e0(792011285);
                    btsVar.t(false);
                    f530Var4 = c530Var;
                } else {
                    btsVar.e0(791597900);
                    boolean z3 = ((i3 & 14) == 4) | ((i3 & 112) == 32);
                    Object Q2 = btsVar.Q();
                    if (z3 || Q2 == o430Var) {
                        Q2 = new a(bVar, aiWidgetEvaluationSwipeDirection);
                        btsVar.o0(Q2);
                    }
                    tvd0 tvd0Var = exw0.a;
                    f530Var4 = new www0(bVar, aiWidgetEvaluationSwipeDirection, (PointerInputEventHandler) Q2, 4);
                    z2 = false;
                    btsVar.t(false);
                }
                f530 d3 = u3a1.d(a2.k(f530Var4), str2);
                uo5 uo5Var = x4c.y;
                z910 d4 = pi6.d(uo5Var, z2);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d5 = androidx.compose.ui.b.d(btsVar, d3);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (dmw0Var != null) {
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
                qje.W(btsVar, wlsVar, d4);
                wls wlsVar2 = d.e;
                qje.W(btsVar, wlsVar2, o);
                Integer valueOf = Integer.valueOf(hashCode);
                wls wlsVar3 = d.g;
                qje.W(btsVar, wlsVar3, valueOf);
                tls tlsVar = d.h;
                qje.M(btsVar, tlsVar);
                wls wlsVar4 = d.d;
                qje.W(btsVar, wlsVar4, d5);
                f530 b = m4m0.b(ljs0.m(c530Var, d), L, cyk0.a);
                z910 d6 = pi6.d(uo5Var, false);
                int i7 = i3;
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d7 = androidx.compose.ui.b.d(btsVar, b);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, d6);
                qje.W(btsVar, wlsVar2, o2);
                vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
                qje.W(btsVar, wlsVar4, d7);
                o4b1.b(pa90Var, null, an91.o(ljs0.m(c530Var, d2), 0.0f, 0.0f, 0.0f, 4.0f, 7), null, null, 0.0f, new c36(L2, 5), btsVar, 56 | ((i7 >> 6) & 14), 56);
                btsVar.t(true);
                btsVar.t(true);
                f530Var3 = f530Var5;
            }
            z = false;
            float d8 = cjb1.d(80.0f, 96.0f, e);
            float d22 = cjb1.d(30.0f, 32.0f, e);
            long L3 = rzo.L(tje.n(AppColor$Palette.ControlMinor, btsVar), e, j);
            long L22 = rzo.L(tje.n(AppColor$Palette.Text, btsVar), e, tje.n(AppColor$Palette.EverFront, btsVar));
            f530 m2 = ljs0.m(f530Var5, 96.0f);
            a = ((i3 & 7168) != 2048) | btsVar.a(z);
            Q = btsVar.Q();
            o430 o430Var2 = did.a;
            if (!a) {
            }
            Q = new lo1(str, z, 0);
            btsVar.o0(Q);
            f530 a22 = fnq0.a(m2, (tls) Q);
            if (z) {
            }
            f530 d32 = u3a1.d(a22.k(f530Var4), str2);
            uo5 uo5Var2 = x4c.y;
            z910 d42 = pi6.d(uo5Var2, z2);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d52 = androidx.compose.ui.b.d(btsVar, d32);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (dmw0Var != null) {
            }
        } else {
            btsVar.Y();
            f530Var3 = f530Var2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mo1(bVar, aiWidgetEvaluationSwipeDirection, pa90Var, str, j, str2, f530Var3, i, i2);
        }
    }

    public static final void c(int i, fid fidVar, sls slsVar, f530 f530Var) {
        sls slsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1610221338);
        int i2 = (btsVar.e(slsVar) ? 4 : 2) | i | 48;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 o = an91.o(c530Var, 0.0f, 8.0f, 8.0f, 8.0f, 1);
            f530Var = c530Var;
            ButtonSize buttonSize = ButtonSize.M;
            i7d.a.getClass();
            slsVar2 = slsVar;
            vpa1.a(o, false, buttonSize, slsVar2, i7d.b, btsVar, ((i2 << 9) & 7168) | 24960, 2);
        } else {
            slsVar2 = slsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vl5(slsVar2, f530Var, i, 3);
        }
    }

    public static final void d(int i, fid fidVar, tls tlsVar, f530 f530Var, List list) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1913088500);
        int i2 = (btsVar.k(list) ? 4 : 2) | i | 48 | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean isEmpty = list.isEmpty();
            c530 c530Var = c530.a;
            f530 o = isEmpty ? c530Var : an91.o(c530Var, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, o);
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
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            btsVar.e0(-1008639565);
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                fqa1.c((stk0) list.get(i3), null, tlsVar, btsVar, i2 & 896);
                if (i3 != scc.f(list)) {
                    btsVar.e0(265349896);
                    yrl.e(null, null, btsVar, 0, 7);
                    btsVar.t(false);
                } else {
                    btsVar.e0(265390258);
                    btsVar.t(false);
                }
            }
            btsVar.t(false);
            btsVar.t(true);
            f530Var = c530Var;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z840(f530Var, list, tlsVar, i);
        }
    }

    public static String e(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String p;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                p = "null";
            } else {
                try {
                    p = obj.toString();
                } catch (Exception e) {
                    String p2 = g8e.p(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(p2), (Throwable) e);
                    p = unr0.p("<", p2, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = p;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(objArr[i]);
            i++;
            i3 = indexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(Extension.FIX_SPACE);
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String f(String str) {
        return str == null ? "" : str;
    }
}
