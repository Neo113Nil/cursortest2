package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ActionButtonsState;
import com.yandex.payment.sdk.core.data.PaymentMethodsFilter;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;
import ru.yandex.taxi.logistics.sdk.tracking.impl.details.ui.model.TitleStyle;

/* loaded from: classes5.dex */
public abstract class te91 {
    public static final byte[] a = {-98, DerValue.tag_UniversalString, -119, 2, -45, Alerts.alert_no_renegotiation, -85, 29};
    public static final byte[] b = {-4, 125, -25, 105, -116, PKIBody._RP, -49};
    public static final byte[] c = {-1, 105, -3, 109, -116, PKIBody._CKUANN, -60, 109, -21, 108, -42, 96, -78, 10, DerValue.TAG_PRIVATE, 66, -9, Alerts.alert_no_application_protocol};

    public static final void a(String str, TitleStyle titleStyle, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(274397546);
        int i2 = (btsVar2.k(str) ? 4 : 2) | i | (btsVar2.c(titleStyle.ordinal()) ? 32 : 16);
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar2.Q();
            if (Q == did.a) {
                Q = new nni(15);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            web1.c(fnq0.b(c530.a, false, (tls) Q), 0.0f, false, 0.0f, null, null, wwg.S(-909495218, true, new e9j(str, titleStyle), btsVar2), null, null, null, null, null, false, btsVar, 1572864, 0, 8126);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new e9j(str, titleStyle, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
    public static final void b(f530 f530Var, ActionButtonsState actionButtonsState, hwc hwcVar, czs czsVar, tls tlsVar, fid fidVar, int i) {
        tls tlsVar2;
        f530 f530Var2;
        wls wlsVar;
        int i2;
        c530 c530Var;
        ?? r1;
        wls wlsVar2;
        tls tlsVar3;
        Object obj;
        cj6 cj6Var;
        sls slsVar;
        Object obj2;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-77672486);
        dmw0 dmw0Var = btsVar.a;
        int i3 = i | 6 | (btsVar.c(actionButtonsState.ordinal()) ? 32 : 16) | (btsVar.k(hwcVar) ? 256 : 128) | (btsVar.k(czsVar) ? 2048 : 1024) | (btsVar.e(tlsVar) ? 16384 : 8192);
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            c530 c530Var2 = c530.a;
            f530 c2 = ljs0.c(c530Var2, 1.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, c2);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            wls wlsVar3 = d.f;
            qje.W(btsVar, wlsVar3, d);
            wls wlsVar4 = d.e;
            qje.W(btsVar, wlsVar4, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar5 = d.g;
            qje.W(btsVar, wlsVar5, valueOf);
            tls tlsVar4 = d.h;
            qje.M(btsVar, tlsVar4);
            wls wlsVar6 = d.d;
            qje.W(btsVar, wlsVar6, d2);
            ActionButtonsState actionButtonsState2 = ActionButtonsState.HIDDEN;
            Object obj3 = did.a;
            cj6 cj6Var2 = cj6.a;
            if (actionButtonsState != actionButtonsState2) {
                btsVar.e0(260480817);
                f530 o2 = an91.o(cj6Var2.a(c530Var2, x4c.A), 8.0f, 0.0f, 0.0f, 8.0f, 6);
                boolean z2 = (i3 & HProv.ALG_CLASS_ALL) == 16384;
                Object Q = btsVar.Q();
                if (z2 || Q == obj3) {
                    Q = new fc01(6, tlsVar);
                    btsVar.o0(Q);
                }
                i2 = i3;
                wlsVar2 = wlsVar4;
                wlsVar = wlsVar5;
                obj = obj3;
                c530Var = c530Var2;
                tlsVar3 = tlsVar4;
                slsVar = slsVar2;
                cj6Var = cj6Var2;
                r1 = 0;
                vpa1.a(o2, false, ButtonSize.M, (sls) Q, wwg.S(367939781, false, vb31.a, btsVar), btsVar, 24960, 2);
                btsVar.t(false);
            } else {
                wlsVar = wlsVar5;
                i2 = i3;
                c530Var = c530Var2;
                r1 = 0;
                wlsVar2 = wlsVar4;
                tlsVar3 = tlsVar4;
                obj = obj3;
                cj6Var = cj6Var2;
                slsVar = slsVar2;
                btsVar.e0(260712418);
                btsVar.t(false);
            }
            f530 o3 = an91.o(cj6Var.a(c530Var, x4c.C), 0.0f, 0.0f, 8.0f, 8.0f, 3);
            lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar, r1);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o4 = btsVar.o();
            f530 d3 = b.d(btsVar, o3);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar3, a2);
            qje.W(btsVar, wlsVar2, o4);
            vfc.v(hashCode2, btsVar, wlsVar, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar6, d3);
            if (hwcVar.a) {
                btsVar.e0(1618203448);
                ButtonSize buttonSize = ButtonSize.M;
                boolean z3 = (i2 & HProv.ALG_CLASS_ALL) == 16384 ? true : r1;
                Object Q2 = btsVar.Q();
                obj2 = obj;
                if (z3 || Q2 == obj2) {
                    tlsVar2 = tlsVar;
                    Q2 = new fc01(7, tlsVar2);
                    btsVar.o0(Q2);
                } else {
                    tlsVar2 = tlsVar;
                }
                z = true;
                vpa1.a(null, false, buttonSize, (sls) Q2, wwg.S(284775887, true, new jvx0(23, hwcVar), btsVar), btsVar, 24960, 3);
                btsVar.t(r1);
            } else {
                tlsVar2 = tlsVar;
                obj2 = obj;
                z = true;
                btsVar.e0(1618701246);
                btsVar.t(r1);
            }
            if (czsVar.a) {
                btsVar.e0(1618752458);
                f530 o5 = an91.o(c530Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                ButtonSize buttonSize2 = ButtonSize.M;
                boolean z4 = (i2 & HProv.ALG_CLASS_ALL) == 16384 ? z : r1;
                Object Q3 = btsVar.Q();
                if (z4 || Q3 == obj2) {
                    Q3 = new fc01(8, tlsVar2);
                    btsVar.o0(Q3);
                }
                efd.a.getClass();
                vpa1.a(o5, false, buttonSize2, (sls) Q3, efd.b, btsVar, 24960, 2);
                btsVar.t(r1);
            } else {
                btsVar.e0(1619202206);
                btsVar.t(r1);
            }
            if (actionButtonsState == ActionButtonsState.BACK_AND_FOCUS_ROUTE) {
                btsVar.e0(1619283612);
                f530 o6 = an91.o(c530Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                ButtonSize buttonSize3 = ButtonSize.M;
                boolean z5 = (i2 & HProv.ALG_CLASS_ALL) == 16384 ? z : r1;
                Object Q4 = btsVar.Q();
                if (z5 || Q4 == obj2) {
                    Q4 = new fc01(9, tlsVar2);
                    btsVar.o0(Q4);
                }
                efd.a.getClass();
                vpa1.a(o6, false, buttonSize3, (sls) Q4, efd.c, btsVar, 24960, 2);
                btsVar.t(r1);
            } else {
                btsVar.e0(1619716062);
                btsVar.t(r1);
            }
            btsVar.t(z);
            btsVar.t(z);
            f530Var2 = c530Var;
        } else {
            tlsVar2 = tlsVar;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ub31(i, 0, tlsVar2, f530Var2, actionButtonsState, hwcVar, czsVar);
        }
    }

    public static final PaymentMethodsFilter c(PaymentMethodsFilter paymentMethodsFilter) {
        return new PaymentMethodsFilter(paymentMethodsFilter.isStoredCardAvailable(), paymentMethodsFilter.isGooglePayAvailable(), paymentMethodsFilter.isSBPAvailable(), paymentMethodsFilter.isYBAccountAvailable(), paymentMethodsFilter.isNewSbpTokenAvailable(), paymentMethodsFilter.isSbpTokenAvailable(), paymentMethodsFilter.getAvailableYaCardTypes());
    }
}
