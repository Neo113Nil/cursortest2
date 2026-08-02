package ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.widget.sticky_widgets;

import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.c;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import defpackage.aii0;
import defpackage.b64;
import defpackage.bts;
import defpackage.byk0;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.did;
import defpackage.el51;
import defpackage.f530;
import defpackage.fid;
import defpackage.fj91;
import defpackage.gl51;
import defpackage.ibb1;
import defpackage.j0;
import defpackage.j01;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.lhg;
import defpackage.lhl0;
import defpackage.lr20;
import defpackage.m4m0;
import defpackage.mb;
import defpackage.mhg;
import defpackage.ohd;
import defpackage.on1;
import defpackage.osv;
import defpackage.oz40;
import defpackage.p;
import defpackage.q791;
import defpackage.qje;
import defpackage.qn1;
import defpackage.r1b0;
import defpackage.rn1;
import defpackage.sb2;
import defpackage.sls;
import defpackage.sn1;
import defpackage.tls;
import defpackage.tn1;
import defpackage.un1;
import defpackage.v4v;
import defpackage.web1;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.yx40;
import defpackage.z5b1;
import defpackage.zpn;
import defpackage.zy11;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(on1 on1Var, fid fidVar, int i) {
        androidx.compose.runtime.internal.a S;
        bts btsVar = (bts) fidVar;
        btsVar.g0(260756459);
        int i2 = (btsVar.k(on1Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            lhg lhgVar = (lhg) btsVar.m(mhg.a);
            int i3 = i2 & 14;
            boolean e = btsVar.e(lhgVar) | (i3 == 4);
            Object Q = btsVar.Q();
            Object obj = did.a;
            androidx.compose.runtime.internal.a aVar = null;
            if (e || Q == obj) {
                Q = new AiChatWidgetKt$AiChatWidget$1$1(lhgVar, on1Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            byk0 c = cyk0.c(46.0f);
            f530 b = m4m0.b(ibb1.c(c530.a, 24.0f, c, 0L, 0L, 28), ((el51) btsVar.m(gl51.a)).a(), c);
            String str = on1Var.c.a;
            boolean e2 = (i3 == 4) | btsVar.e(lhgVar);
            Object Q2 = btsVar.Q();
            if (e2 || Q2 == obj) {
                Q2 = new j0(20, on1Var, lhgVar);
                btsVar.o0(Q2);
            }
            f530 d = q791.d(b, true, str, null, (sls) Q2, 12);
            v4v v4vVar = on1Var.d;
            if (v4vVar == null) {
                btsVar.e0(-1399237557);
                btsVar.t(false);
                S = null;
            } else {
                btsVar.e0(-1399237556);
                S = wwg.S(-310182462, true, new mb(v4vVar, 1), btsVar);
                btsVar.t(false);
            }
            androidx.compose.runtime.internal.a S2 = wwg.S(1389592455, true, new rn1(on1Var), btsVar);
            v4v v4vVar2 = on1Var.e;
            if (v4vVar2 == null) {
                btsVar.e0(-1398847701);
                btsVar.t(false);
            } else {
                btsVar.e0(-1398847700);
                aVar = wwg.S(1338426942, true, new mb(v4vVar2, 2), btsVar);
                btsVar.t(false);
            }
            web1.c(d, 64.0f, false, 0.0f, null, S, S2, null, null, aVar, null, null, false, btsVar, 1572864, 0, 7580);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rn1(on1Var, i);
        }
    }

    public static final void b(CharSequence charSequence, boolean z, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-763605580);
        int i2 = (btsVar.e(charSequence) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c g = z5b1.g("BlinkingCursor", btsVar, 0);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new j01(16);
                btsVar.o0(Q);
            }
            osv d = z5b1.d(g, 0.0f, 1.0f, sb2.w(sb2.y((tls) Q), RepeatMode.Restart, 0L, 4), "CursorAlpha", btsVar, 29112, 0);
            f530 c = fj91.c(c530.a, IntrinsicSize.Min);
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            androidx.compose.runtime.internal.a S = wwg.S(1586171944, true, new tn1(0, d), btsVar);
            androidx.compose.runtime.internal.a S2 = wwg.S(-666572583, true, new un1(0, charSequence), btsVar);
            if (z) {
                btsVar.e0(-2019852812);
                S.invoke(btsVar, 6);
                S2.invoke(btsVar, 6);
                btsVar.t(false);
            } else {
                btsVar.e0(-2019793292);
                S2.invoke(btsVar, 6);
                S.invoke(btsVar, 6);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qn1(charSequence, z, i, 0);
        }
    }

    public static final void c(List list, fid fidVar, int i) {
        List list2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1466994424);
        int i2 = (btsVar.e(list) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = f.g(0);
                btsVar.o0(Q);
            }
            yx40 yx40Var = (yx40) Q;
            p pVar = (p) kotlin.collections.a.S(yx40Var.getIntValue(), list);
            if (pVar == null) {
                aii0 v = btsVar.v();
                if (v != null) {
                    v.d = new sn1(i, 0, list);
                    return;
                }
                return;
            }
            boolean k = btsVar.k(pVar);
            Object Q2 = btsVar.Q();
            if (k || Q2 == obj) {
                Q2 = f.j("");
                btsVar.o0(Q2);
            }
            oz40 oz40Var = (oz40) Q2;
            boolean k2 = btsVar.k(pVar) | btsVar.k(oz40Var) | btsVar.e(list);
            Object Q3 = btsVar.Q();
            if (k2 || Q3 == obj) {
                list2 = list;
                Object aiChatWidgetKt$DynamicText$1$1 = new AiChatWidgetKt$DynamicText$1$1(pVar, list2, oz40Var, yx40Var, null);
                btsVar.o0(aiChatWidgetKt$DynamicText$1$1);
                Q3 = aiChatWidgetKt$DynamicText$1$1;
            } else {
                list2 = list;
            }
            zpn.e(btsVar, (wls) Q3, pVar);
            b((CharSequence) oz40Var.getValue(), false, btsVar, 48);
        } else {
            list2 = list;
            btsVar.Y();
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            v2.d = new sn1(i, 1, list2);
        }
    }
}
