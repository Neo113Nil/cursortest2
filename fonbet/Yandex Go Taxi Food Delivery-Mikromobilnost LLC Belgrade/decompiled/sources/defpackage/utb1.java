package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.EditText;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.NumberFormatUtils$Currencies;
import com.ybsdk.feature.credit.deposit.api.BoostDepositScreenParams;
import com.ybsdk.feature.credit.deposit.api.CreditDepositScreenParams;
import com.ybsdk.feature.credit.deposit.api.CreditLimitDepositScreenParams;
import com.ybsdk.feature.credit.deposit.api.CreditScreenParams;
import com.ybsdk.feature.credit.deposit.api.MkkDepositScreenParams;
import com.ybsdk.feature.credit.deposit.internal.screens.deposit.CreditType;
import com.ybsdk.rconfig.configs.CreditDepositHiddenNumPadScenariosConfig;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes6.dex */
public abstract class utb1 {
    public static final void a(h111 h111Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        boolean z;
        wp2 wp2Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1138823477);
        dmw0 dmw0Var = btsVar.a;
        int i3 = (btsVar.e(h111Var) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
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
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            c530 c530Var = c530.a;
            f530 d3 = b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d3);
            UiStateDrawableWrapper uiStateDrawableWrapper = h111Var.a;
            UiStateDrawableWrapper uiStateDrawableWrapper2 = h111Var.b;
            boolean k = btsVar.k(uiStateDrawableWrapper);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                UiStateDrawableWrapper uiStateDrawableWrapper3 = h111Var.a;
                Drawable drawable = uiStateDrawableWrapper3 != null ? uiStateDrawableWrapper3.getDrawable() : null;
                Q = (drawable == null || drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) ? null : new u92(ffx.d0(drawable, 0, 0, 7));
                btsVar.o0(Q);
            }
            l8v l8vVar = (l8v) Q;
            boolean k2 = btsVar.k(uiStateDrawableWrapper2);
            Object Q2 = btsVar.Q();
            if (k2 || Q2 == o430Var) {
                Drawable drawable2 = uiStateDrawableWrapper2 != null ? uiStateDrawableWrapper2.getDrawable() : null;
                u92 u92Var = (drawable2 == null || drawable2.getIntrinsicWidth() <= 0 || drawable2.getIntrinsicHeight() <= 0) ? null : new u92(ffx.d0(drawable2, 0, 0, 7));
                btsVar.o0(u92Var);
                Q2 = u92Var;
            }
            l8v l8vVar2 = (l8v) Q2;
            if (l8vVar == null) {
                btsVar.e0(954881213);
                z = false;
                btsVar.t(false);
            } else {
                btsVar.e0(954881214);
                o4b1.c(l8vVar, null, ljs0.n(an91.k(tra1.b(c530Var, h111Var.f ? 1.0f : 0.5f), 6.0f), 36.0f, 24.0f), null, mhe.a, 0.0f, null, 0, btsVar, 24624, 232);
                z = false;
                btsVar.t(false);
            }
            if (l8vVar2 == null) {
                btsVar.e0(955262451);
                btsVar.t(z);
            } else {
                btsVar.e0(955262452);
                o4b1.c(l8vVar2, null, cj6.a.a(bzk0.c(c530Var, AppColor$Palette.BgFloating, cyk0.c(25.0f)), x4c.w), null, null, 0.0f, null, 0, btsVar, 48, 248);
                btsVar.t(false);
            }
            btsVar.t(true);
            kdc kdcVar = h111Var.e;
            if (kdcVar != null) {
                btsVar.e0(-1769980970);
                long d4 = rzo.d(s8o.m(kdcVar, (Context) btsVar.m(AndroidCompositionLocals_androidKt.b)));
                int i4 = up2.c;
                btsVar.t(false);
                wp2Var = new up2(d4);
            } else {
                btsVar.e0(-1769899936);
                btsVar.t(false);
                wp2Var = AppColor$Palette.Text;
            }
            i2 = 1;
            qgy.b(h111Var.c, h111Var.d.toString(), new ypu(x4c.H), wp2Var, 0L, 0L, new sjy0(3), 0L, 0, 0, 0, xya1.e(btsVar).h.a, null, btsVar, 0, 0, 12144);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            i2 = 1;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xg30(h111Var, f530Var, i, i2);
        }
    }

    public static CreditType b(CreditScreenParams creditScreenParams) {
        if (creditScreenParams instanceof CreditDepositScreenParams) {
            return CreditType.CREDIT_DEPOSIT;
        }
        if (creditScreenParams instanceof CreditLimitDepositScreenParams) {
            return CreditType.CREDIT_LIMIT_DEPOSIT;
        }
        if (creditScreenParams instanceof MkkDepositScreenParams) {
            return CreditType.MKK_DEPOSIT;
        }
        if (creditScreenParams instanceof BoostDepositScreenParams) {
            return CreditType.BOOST_DEPOSIT;
        }
        w511.b();
        return null;
    }

    public static waf c(CreditScreenParams creditScreenParams, tv3 tv3Var) {
        Set N0;
        String agreementId = creditScreenParams.getAgreementId();
        MoneyEntity moneyEntity = new MoneyEntity(BigDecimal.ZERO, NumberFormatUtils$Currencies.RUB.getIso(), "");
        CreditType b = b(creditScreenParams);
        com.ybsdk.rconfig.b bVar = tv3Var.a;
        if (creditScreenParams instanceof CreditDepositScreenParams) {
            List<String> creditDepositScenarios = ((CreditDepositHiddenNumPadScenariosConfig) bVar.d(naf.a).getData()).getCreditDepositScenarios();
            ArrayList arrayList = new ArrayList(tcc.n(creditDepositScenarios, 10));
            Iterator<T> it = creditDepositScenarios.iterator();
            while (it.hasNext()) {
                arrayList.add(((String) it.next()).toLowerCase(Locale.ROOT));
            }
            N0 = a.N0(arrayList);
        } else if (creditScreenParams instanceof CreditLimitDepositScreenParams) {
            List<String> creditLimitDepositScenarios = ((CreditDepositHiddenNumPadScenariosConfig) bVar.d(naf.a).getData()).getCreditLimitDepositScenarios();
            ArrayList arrayList2 = new ArrayList(tcc.n(creditLimitDepositScenarios, 10));
            Iterator<T> it2 = creditLimitDepositScenarios.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((String) it2.next()).toLowerCase(Locale.ROOT));
            }
            N0 = a.N0(arrayList2);
        } else if (creditScreenParams instanceof MkkDepositScreenParams) {
            List<String> mkkDepositScenarios = ((CreditDepositHiddenNumPadScenariosConfig) bVar.d(naf.a).getData()).getMkkDepositScenarios();
            ArrayList arrayList3 = new ArrayList(tcc.n(mkkDepositScenarios, 10));
            Iterator<T> it3 = mkkDepositScenarios.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((String) it3.next()).toLowerCase(Locale.ROOT));
            }
            N0 = a.N0(arrayList3);
        } else {
            if (!(creditScreenParams instanceof BoostDepositScreenParams)) {
                w511.b();
                return null;
            }
            List<String> boostDepositScenarios = ((CreditDepositHiddenNumPadScenariosConfig) bVar.d(naf.a).getData()).getBoostDepositScenarios();
            ArrayList arrayList4 = new ArrayList(tcc.n(boostDepositScenarios, 10));
            Iterator<T> it4 = boostDepositScenarios.iterator();
            while (it4.hasNext()) {
                arrayList4.add(((String) it4.next()).toLowerCase(Locale.ROOT));
            }
            N0 = a.N0(arrayList4);
        }
        boolean z = !a.G(N0, creditScreenParams.getScenario());
        t8j0 t8j0Var = new t8j0();
        EmptyList emptyList = EmptyList.a;
        return new waf(agreementId, t8j0Var, null, moneyEntity, null, null, emptyList, null, null, null, null, null, null, null, null, b, z, emptyList);
    }

    public static final void d(NumberKeyboardView numberKeyboardView, EditText editText) {
        editText.setShowSoftInputOnFocus(false);
        numberKeyboardView.setOnCharPressed(new ub60(3, editText));
        numberKeyboardView.setOnKeyBackspacePressed(new uh60(4, editText));
    }
}
