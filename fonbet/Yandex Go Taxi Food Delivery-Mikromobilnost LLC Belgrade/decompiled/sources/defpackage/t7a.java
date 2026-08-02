package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.lazy.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.chargers.analytics.ChargersPerfEvent;
import com.yandex.go.chargers.offer.ui.compose.ui.a;
import com.yandex.go.chargers.payments.domain.d;
import com.yandex.passport.internal.flags.presentation.k;
import com.yandex.passport.internal.properties.u;
import java.util.Arrays;
import java.util.Iterator;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes12.dex */
public final class t7a implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ t7a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a1, code lost:
    
        if (defpackage.jl40.l(r4.Q(), java.lang.Integer.valueOf(r7)) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x021f, code lost:
    
        if (r3 == r2) goto L58;
     */
    @Override // defpackage.wls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        hfa0 hfa0Var;
        Object obj3;
        zy11 zy11Var;
        sls slsVar;
        wls wlsVar;
        float f;
        String str;
        o430 o430Var;
        boolean z;
        boolean z2;
        int i = this.a;
        o430 o430Var2 = did.a;
        zy11 zy11Var2 = zy11.a;
        Object obj4 = this.y;
        Object obj5 = this.x;
        Object obj6 = this.w;
        Object obj7 = this.c;
        Object obj8 = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Number) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.e0(633854856);
                    String key = ChargersPerfEvent.OFFER_CARD_COMPOSE.getKey();
                    fva0 a = f4z.a();
                    View view = (View) btsVar.m(AndroidCompositionLocals_androidKt.f);
                    boolean k = btsVar.k(view);
                    Object Q = btsVar.Q();
                    if (k || Q == o430Var2) {
                        View rootView = view.getRootView();
                        Object tag = rootView.getTag(t9h0.metricsStateHolder);
                        if (tag == null) {
                            tag = new xva0();
                            rootView.setTag(t9h0.metricsStateHolder, tag);
                        }
                        Q = (xva0) tag;
                        btsVar.o0(Q);
                    }
                    xva0 xva0Var = (xva0) Q;
                    Object Q2 = btsVar.Q();
                    if (Q2 == o430Var2) {
                        fva0.f(a, key, PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var = xva0Var.a;
                        if (yuf0Var != null) {
                            yuf0Var.I(key);
                            Q2 = zy11Var2;
                        } else {
                            Q2 = null;
                        }
                        btsVar.o0(Q2);
                    }
                    paa paaVar = (paa) obj8;
                    z0a0 d = ((dy90) ((d) ((tla) obj7)).b()).a.d();
                    u8a u8aVar = (u8a) ((m3u0) obj6).getValue();
                    u7a u7aVar = (u7a) obj5;
                    Context context = u7aVar.F;
                    int i2 = kyh0.scooters_offer_card_v2_a11y_payment_info_button;
                    rea0 rea0Var = u7aVar.M;
                    paa paaVar2 = (paa) obj8;
                    oaa oaaVar = paaVar2 instanceof oaa ? (oaa) paaVar2 : null;
                    a.a(paaVar, d, u8aVar, context.getString(i2, Arrays.copyOf(new Object[]{((sea0) rea0Var).a(context, (oaaVar == null || (hfa0Var = oaaVar.b) == null) ? null : hfa0Var.b())}, 1)), ((bgd) ((xfd) obj4)).a, btsVar, 0);
                    btsVar.t(false);
                } else {
                    btsVar.Y();
                }
                return zy11Var2;
            case 1:
                long j = ((wu60) obj2).a;
                yx40 yx40Var = (yx40) obj4;
                ((zvd0) obj).a();
                tx40 tx40Var = (tx40) obj6;
                tx40Var.setFloatValue(Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + tx40Var.getFloatValue());
                oz40 oz40Var = (oz40) obj5;
                n6y n6yVar = (n6y) oz40Var.getValue();
                if (n6yVar != null) {
                    t6y t6yVar = (t6y) n6yVar;
                    float floatValue = tx40Var.getFloatValue() + t6yVar.o;
                    float floatValue2 = (((tx40Var.getFloatValue() + (t6yVar.o + t6yVar.p)) - floatValue) / 2.0f) + floatValue;
                    Iterator it = ((b) obj8).j().k.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            n6y n6yVar2 = (n6y) next;
                            int i3 = ((t6y) n6yVar2).o;
                            t6y t6yVar2 = (t6y) n6yVar2;
                            int i4 = t6yVar2.o + t6yVar2.p;
                            int i5 = (int) floatValue2;
                            if (i3 <= i5 && i5 <= i4 && t6yVar.a != t6yVar2.a && (t6yVar2.l instanceof iam)) {
                                obj3 = next;
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    n6y n6yVar3 = (n6y) obj3;
                    if (n6yVar3 != null) {
                        int i6 = ((iam) ((t6y) n6yVar3).l).a;
                        ((wls) obj7).invoke(Integer.valueOf(yx40Var.getIntValue()), Integer.valueOf(i6));
                        yx40Var.setIntValue(i6);
                        tx40Var.setFloatValue(tx40Var.getFloatValue() + (t6yVar.o - r0.o));
                        oz40Var.setValue(n6yVar3);
                    }
                }
                return zy11Var2;
            default:
                fid fidVar2 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.E()) {
                        btsVar2.Y();
                        return zy11Var2;
                    }
                }
                c530 c530Var = c530.a;
                f530 m = an91.m(ljs0.c(c530Var, 1.0f), 32.0f, 0.0f, 2);
                String str2 = (String) obj8;
                String str3 = (String) obj7;
                sls slsVar2 = (sls) obj6;
                String str4 = (String) obj5;
                sls slsVar3 = (sls) obj4;
                z910 d2 = pi6.d(x4c.y, false);
                int S = cma1.S(fidVar2);
                bts btsVar3 = (bts) fidVar2;
                dmw0 dmw0Var = btsVar3.a;
                r1b0 o = btsVar3.o();
                f530 d3 = androidx.compose.ui.b.d(fidVar2, m);
                ohd.G1.getClass();
                sls slsVar4 = androidx.compose.ui.node.d.b;
                if (dmw0Var == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar3.i0();
                if (btsVar3.S) {
                    btsVar3.n(slsVar4);
                } else {
                    btsVar3.r0();
                }
                wls wlsVar2 = androidx.compose.ui.node.d.f;
                qje.W(fidVar2, wlsVar2, d2);
                wls wlsVar3 = androidx.compose.ui.node.d.e;
                qje.W(fidVar2, wlsVar3, o);
                wls wlsVar4 = androidx.compose.ui.node.d.g;
                if (!btsVar3.S) {
                    zy11Var = zy11Var2;
                    break;
                } else {
                    zy11Var = zy11Var2;
                }
                b64.z(S, btsVar3, S, wlsVar4);
                wls wlsVar5 = androidx.compose.ui.node.d.d;
                qje.W(fidVar2, wlsVar5, d3);
                f530 l = ymb1.l(ljs0.s(c530Var, 0.0f, 445.0f, 1), cyk0.c(20.0f));
                a7u0 a7u0Var = dgc.a;
                f530 l2 = an91.l(m4m0.b(l, ((agc) btsVar3.m(a7u0Var)).p, qke.q), 20.0f, 24.0f);
                sic a2 = qic.a(new i43(16.0f, true, new quz(11)), x4c.H, fidVar2, 54);
                int S2 = cma1.S(fidVar2);
                r1b0 o2 = btsVar3.o();
                f530 d4 = androidx.compose.ui.b.d(fidVar2, l2);
                btsVar3.i0();
                if (btsVar3.S) {
                    btsVar3.n(slsVar4);
                } else {
                    btsVar3.r0();
                }
                qje.W(fidVar2, wlsVar2, a2);
                qje.W(fidVar2, wlsVar3, o2);
                if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(S2))) {
                    b64.z(S2, btsVar3, S2, wlsVar4);
                }
                qje.W(fidVar2, wlsVar5, d4);
                btsVar3.e0(1326728647);
                if (str2 == null || str2.length() == 0) {
                    slsVar = slsVar4;
                    wlsVar = wlsVar2;
                    f = 1.0f;
                } else {
                    ety0 ety0Var = ((bq11) btsVar3.m(eq11.a)).f;
                    long j2 = ((agc) btsVar3.m(a7u0Var)).q;
                    f = 1.0f;
                    slsVar = slsVar4;
                    wlsVar = wlsVar2;
                    vqy0.c(str2, ljs0.c(c530Var, 1.0f), j2, 0L, null, 0L, new sjy0(3), 0L, 0, false, 0, 0, ety0Var, fidVar2, 48, 0, 130040);
                    fidVar2 = fidVar2;
                }
                btsVar3.t(false);
                btsVar3.e0(1326741682);
                btsVar3.t(false);
                f530 o3 = an91.o(ljs0.c(c530Var, f), 0.0f, 10.0f, 0.0f, 0.0f, 5);
                sic a3 = qic.a(new i43(2.0f, true, new quz(11)), x4c.G, fidVar2, 6);
                int S3 = cma1.S(fidVar2);
                r1b0 o4 = btsVar3.o();
                f530 d5 = androidx.compose.ui.b.d(fidVar2, o3);
                btsVar3.i0();
                if (btsVar3.S) {
                    btsVar3.n(slsVar);
                } else {
                    btsVar3.r0();
                }
                qje.W(fidVar2, wlsVar, a3);
                qje.W(fidVar2, wlsVar3, o4);
                if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(S3))) {
                    b64.z(S3, btsVar3, S3, wlsVar4);
                }
                qje.W(fidVar2, wlsVar5, d5);
                btsVar3.e0(1606968212);
                if (str3 == null || str3.length() == 0) {
                    str = str3;
                    o430Var = o430Var2;
                    z = false;
                } else {
                    btsVar3.e0(1606973692);
                    boolean k2 = btsVar3.k(slsVar2);
                    Object Q3 = btsVar3.Q();
                    if (!k2) {
                        o430Var = o430Var2;
                        break;
                    } else {
                        o430Var = o430Var2;
                    }
                    Q3 = new k(8, slsVar2);
                    btsVar3.o0(Q3);
                    z = false;
                    btsVar3.t(false);
                    fid fidVar3 = fidVar2;
                    str = str3;
                    u.g(384, 8, fidVar3, (sls) Q3, ljs0.e(ljs0.c(c530Var, f), 48.0f), str, false);
                    fidVar2 = fidVar3;
                }
                btsVar3.t(z);
                btsVar3.e0(1606983481);
                if (str != null && str4 != null) {
                    oeb1.c(fidVar2, ljs0.e(c530Var, 4.0f));
                }
                btsVar3.t(z);
                btsVar3.e0(1606990550);
                if (str4 == null || str4.length() == 0) {
                    z2 = false;
                } else {
                    btsVar3.e0(1606996092);
                    boolean k3 = btsVar3.k(slsVar3);
                    Object Q4 = btsVar3.Q();
                    if (k3 || Q4 == o430Var) {
                        Q4 = new k(9, slsVar3);
                        btsVar3.o0(Q4);
                    }
                    z2 = false;
                    btsVar3.t(false);
                    u.h(384, fidVar2, (sls) Q4, ljs0.e(ljs0.c(c530Var, f), 48.0f), str4, false);
                }
                ly3.A(btsVar3, z2, true, true, true);
                return zy11Var;
        }
    }
}
