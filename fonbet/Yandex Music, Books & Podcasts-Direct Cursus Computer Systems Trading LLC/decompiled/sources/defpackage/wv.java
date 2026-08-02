package defpackage;

import android.content.Context;
import androidx.compose.foundation.lazy.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.music.core.ui.compose.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class wv extends uif implements ryc {
    public final /* synthetic */ int r;
    public final /* synthetic */ List s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wv(List list, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(4);
        this.r = i;
        this.s = list;
        this.t = obj;
        this.u = obj2;
        this.v = obj3;
        this.w = obj4;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        u00 u00Var;
        f20 f20Var;
        int i2;
        m0r m0rVar;
        switch (this.r) {
            case 0:
                vci vciVar = vci.a;
                a aVar = (a) obj;
                int intValue = ((Number) obj2).intValue();
                hq5 hq5Var = (hq5) obj3;
                int intValue2 = ((Number) obj4).intValue();
                Object obj5 = gq5.a;
                jab jabVar = (jab) this.u;
                j00 j00Var = (j00) this.t;
                poi poiVar = (poi) this.v;
                if ((intValue2 & 6) == 0) {
                    i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(i & 1, (i & 147) != 146)) {
                    u00 u00Var2 = (u00) ((ArrayList) this.s).get(intValue);
                    oq5Var.Z(527341653);
                    if (u00Var2 instanceof s00) {
                        oq5Var.Z(527407186);
                        s00 s00Var = (s00) u00Var2;
                        f20 f20Var2 = s00Var.a;
                        mqs mqsVar = s00Var.b;
                        Object L = szf.L(mqsVar, s00Var.c);
                        int i3 = s00Var.c;
                        Object K = oq5Var.K();
                        if (K == obj5) {
                            K = gld.R(g.a, oq5Var);
                            oq5Var.k0(K);
                        }
                        mm6 mm6Var = (mm6) K;
                        Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
                        boolean f = oq5Var.f(mqsVar) | oq5Var.d(i3);
                        Object K2 = oq5Var.K();
                        if (f || K2 == obj5) {
                            context.getClass();
                            mm6Var.getClass();
                            u00Var = u00Var2;
                            f20Var = f20Var2;
                            K2 = up6.C(mm6Var, mqsVar, context, new i00(i3, 0, j00Var, jabVar, L, j00Var.h.a(jabVar, null)), Intrinsics.d(j00Var.e.d, mqsVar.a));
                            oq5Var.k0(K2);
                        } else {
                            u00Var = u00Var2;
                            f20Var = f20Var2;
                        }
                        bg5 bg5Var = (bg5) K2;
                        boolean f2 = oq5Var.f(poiVar);
                        Object K3 = oq5Var.K();
                        if (f2 || K3 == obj5) {
                            K3 = new sv(poiVar, 0);
                            oq5Var.k0(K3);
                        }
                        yci s = wyf.s(vciVar, (Function0) K3);
                        boolean h = oq5Var.h(j00Var) | oq5Var.h(jabVar) | oq5Var.h(L);
                        Object K4 = oq5Var.K();
                        if (h || K4 == obj5) {
                            K4 = new tv(0, j00Var, jabVar, L);
                            oq5Var.k0(K4);
                        }
                        yci a = androidx.compose.ui.platform.a.a(com.yandex.music.core.ui.compose.a.b(s, null, 0L, 0.0f, null, (Function2) K4, 15), "track");
                        Object obj6 = (Integer) ((f9h) this.w).get(u00Var);
                        if (obj6 == null) {
                            obj6 = "without_volume";
                        }
                        yci c = b.c(a, "volume_number", obj6);
                        z = false;
                        ksw.a(f20Var, bg5Var, b.b(c, r2.a - 1), oq5Var, 0);
                        oq5Var.p(false);
                    } else {
                        z = false;
                        if (!(u00Var2 instanceof t00)) {
                            throw vz1.i(oq5Var, 1125389678, false);
                        }
                        oq5Var.Z(528630260);
                        int i4 = ((t00) u00Var2).a;
                        boolean f3 = oq5Var.f(poiVar);
                        Object K5 = oq5Var.K();
                        if (f3 || K5 == obj5) {
                            K5 = new sv(poiVar, 1);
                            oq5Var.k0(K5);
                        }
                        rzf.a(i4, 0, oq5Var, b.b(androidx.compose.ui.platform.a.a(wyf.s(vciVar, (Function0) K5), "volume"), i4));
                        oq5Var.p(false);
                    }
                    oq5Var.p(z);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            default:
                a aVar2 = (a) obj;
                int intValue3 = ((Number) obj2).intValue();
                hq5 hq5Var2 = (hq5) obj3;
                int intValue4 = ((Number) obj4).intValue();
                Object obj7 = gq5.a;
                h5t h5tVar = (h5t) this.u;
                if ((intValue4 & 6) == 0) {
                    i2 = (((oq5) hq5Var2).f(aVar2) ? 4 : 2) | intValue4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= ((oq5) hq5Var2).d(intValue3) ? 32 : 16;
                }
                boolean z2 = true;
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(i2 & 1, (i2 & 147) != 146)) {
                    j0r j0rVar = (j0r) this.s.get(intValue3);
                    oq5Var2.Z(922277014);
                    p0r p0rVar = j0rVar.b;
                    w5t a2 = ((l5t) this.t).a();
                    h0r h0rVar = j0rVar.a;
                    mqs mqsVar2 = h0rVar.a;
                    mqs mqsVar3 = (mqs) h0rVar.d.getValue();
                    h5tVar.getClass();
                    mqsVar3.getClass();
                    oq5Var2.Z(-324513422);
                    if (((Boolean) oq5Var2.j(koe.a)).booleanValue()) {
                        m0rVar = nrm.a;
                        oq5Var2.p(false);
                    } else {
                        Object K6 = oq5Var2.K();
                        if (K6 == obj7) {
                            K6 = gld.R(g.a, oq5Var2);
                            oq5Var2.k0(K6);
                        }
                        mm6 mm6Var2 = (mm6) K6;
                        Context context2 = (Context) oq5Var2.j(AndroidCompositionLocals_androidKt.b);
                        boolean f4 = oq5Var2.f(mqsVar2) | oq5Var2.g(false);
                        Object K7 = oq5Var2.K();
                        if (f4 || K7 == obj7) {
                            mm6Var2.getClass();
                            context2.getClass();
                            rhq rhqVar = new rhq(1, h5tVar, mqsVar3);
                            l18 l18Var = l18.b;
                            bdt I = hag.I(lf5.class);
                            qdc qdcVar = l18Var.a;
                            qdcVar.getClass();
                            lf5 lf5Var = (lf5) qdcVar.C(I);
                            Object o0rVar = new o0r(new fg5(lf5Var, mqsVar2, false, mm6Var2, context2, rhqVar), mm6Var2, lf5Var, mqsVar2, rhqVar);
                            oq5Var2.k0(o0rVar);
                            K7 = o0rVar;
                        }
                        m0rVar = (m0r) K7;
                        oq5Var2.p(false);
                    }
                    m0r m0rVar2 = m0rVar;
                    vci vciVar2 = vci.a;
                    yci f5 = b.b(androidx.compose.ui.platform.a.a(vciVar2, "smart_preview_item"), intValue3).f(vciVar2);
                    ynn ynnVar = (ynn) this.v;
                    boolean h2 = oq5Var2.h(h5tVar);
                    if ((((i2 & 112) ^ 48) <= 32 || !oq5Var2.d(intValue3)) && (i2 & 48) != 32) {
                        z2 = false;
                    }
                    boolean z3 = h2 | z2;
                    Object K8 = oq5Var2.K();
                    if (z3 || K8 == obj7) {
                        K8 = new i5t(h5tVar, intValue3);
                        oq5Var2.k0(K8);
                    }
                    yci b = com.yandex.music.core.ui.compose.a.b(f5, ynnVar, 0L, 0.0f, null, (Function2) K8, 14);
                    Object K9 = oq5Var2.K();
                    if (K9 == obj7) {
                        K9 = new r1p(1, (aqi) this.w);
                        oq5Var2.k0(K9);
                    }
                    hyf.g(p0rVar, a2, m0rVar2, androidx.compose.ui.layout.a.b(b, (pyc) K9), 0L, oq5Var2, 0);
                    oq5Var2.p(false);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
        }
    }
}
