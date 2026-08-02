package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import com.yandex.go.scooters.discovery.ScootersDiscoveryModalView$createToolbarLogotype$1$2;
import com.yandex.go.scooters.insurance.analytics.InsuranceCloseReason;
import com.yandex.go.scooters.insurance.analytics.InsuranceScreen;
import com.yandex.go.scooters.insurance.model.ScootersInsuranceControl;
import com.yandex.go.scooters.insurance.suggest.ScootersInsuranceSuggestModalView;
import com.yandex.go.scooters.offers.v2.components.bottom.ScootersCardBottomComponent;
import com.yandex.go.scooters.offers.v2.components.options.ScootersCardInsuranceComponent;
import com.yandex.go.scooters.offers.v2.components.options.ScootersCardSuperPassComponent;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.scooters.presentation.common.ui.ScootersMultiSelectChipsComponent;
import ru.yandex.taxi.scooters.presentation.common.ui.header.ScootersCardHeaderComponent;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersNewControlPanelView;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.e;
import ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoModalView;
import ru.yandex.taxi.scooters.presentation.finish_info.info.ScootersFinishInfoCard;
import ru.yandex.taxi.scooters.presentation.personal_goals.promo_plate.ScootersPersonalGoalsPromoPlateView;

/* loaded from: classes14.dex */
public final /* synthetic */ class tmm0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tmm0(run0 run0Var, tls tlsVar) {
        this.a = 21;
        this.c = run0Var;
        this.b = tlsVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        ScootersCardSuperPassComponent superPassComponentLazy$lambda$0;
        ScootersPersonalGoalsPromoPlateView personalGoalsComponentLazy$lambda$0;
        zy11 paymentOptions$lambda$1;
        zy11 success$lambda$1;
        bys labelsAdapter_delegate$lambda$0;
        ListItemComponent insuranceV3ItemWithTrailButton_delegate$lambda$0;
        BadgeView badgeViewLazy$lambda$0;
        zy11 onDraw$lambda$1;
        lmn0 itemV2Binding_delegate$lambda$0;
        ScootersPersonalGoalsPromoPlateView sharingPersonalGoalsPromoPlateView_delegate$lambda$0;
        zsn0 zsn0Var;
        wtn0 binding;
        wtn0 binding2;
        sls slsVar;
        zy11 refreshChips$lambda$0$0;
        bys bysVar;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((tls) obj2).invoke(((wmm0) obj).e);
                break;
            case 1:
                ((tls) obj2).invoke(new stm0(((fum0) obj).a));
                break;
            case 2:
                ((tls) obj2).invoke(new rtm0((wtm0) obj));
                break;
            case 3:
                ((tls) obj2).invoke(new ptm0(((vtm0) obj).b));
                break;
            case 4:
                ((tls) obj2).invoke(new otm0(((ytm0) obj).c));
                break;
            case 5:
                eum0 eum0Var = (eum0) obj;
                ((tls) obj2).invoke(new qtm0(eum0Var.g, eum0Var.a));
                break;
            case 6:
                ((iym0) obj2).P((zzs) obj);
                break;
            case 7:
                superPassComponentLazy$lambda$0 = ScootersCardBottomComponent.superPassComponentLazy$lambda$0((Context) obj2, (ScootersCardBottomComponent) obj);
                break;
            case 8:
                personalGoalsComponentLazy$lambda$0 = ScootersCardBottomComponent.personalGoalsComponentLazy$lambda$0((Context) obj2, (pav) obj);
                break;
            case 9:
                paymentOptions$lambda$1 = ScootersCardBottomComponent.setPaymentOptions$lambda$1((ScootersCardBottomComponent) obj2, (m6a0) obj);
                break;
            case 10:
                success$lambda$1 = ScootersCardHeaderComponent.success$lambda$1((tls) obj2, (r7p0) obj);
                break;
            case 11:
                labelsAdapter_delegate$lambda$0 = ScootersCardHeaderComponent.labelsAdapter_delegate$lambda$0((ScootersCardHeaderComponent) obj2, (Context) obj);
                break;
            case 12:
                insuranceV3ItemWithTrailButton_delegate$lambda$0 = ScootersCardInsuranceComponent.insuranceV3ItemWithTrailButton_delegate$lambda$0((Context) obj2, (ScootersCardInsuranceComponent) obj);
                break;
            case 13:
                badgeViewLazy$lambda$0 = ScootersCardSuperPassComponent.badgeViewLazy$lambda$0((Context) obj2, (ScootersCardSuperPassComponent) obj);
                break;
            case 14:
                ((o9n0) ((nan0) obj2).p.E).b.r(new zef(4, ((rbo0) obj).b));
                break;
            case 15:
                e eVar = (e) obj2;
                eVar.Mg(((zuo0) obj).getSessionId());
                r0 r0Var = eVar.N.b.a;
                r0Var.getClass();
                r0Var.m(null, wnj.a);
                break;
            case 16:
                onDraw$lambda$1 = ScootersDiscoveryModalView$createToolbarLogotype$1$2.onDraw$lambda$1((ScootersDiscoveryModalView$createToolbarLogotype$1$2) obj2, (Canvas) obj);
                break;
            case 17:
                itemV2Binding_delegate$lambda$0 = ScootersFinishInfoCard.itemV2Binding_delegate$lambda$0((Context) obj2, (ScootersFinishInfoCard) obj);
                break;
            case 18:
                sharingPersonalGoalsPromoPlateView_delegate$lambda$0 = ScootersFinishInfoModalView.sharingPersonalGoalsPromoPlateView_delegate$lambda$0((Context) obj2, (ScootersFinishInfoModalView) obj);
                break;
            case 19:
                ((tls) obj2).invoke(new orn0(((wrn0) obj).e));
                break;
            case 20:
                ScootersInsuranceSuggestModalView scootersInsuranceSuggestModalView = ((vtn0) obj2).a;
                zsn0Var = scootersInsuranceSuggestModalView.scootersInsuranceAnalytics;
                zsn0Var.a(InsuranceCloseReason.ENABLE_INSURANCE_BUTTON, ScootersInsuranceControl.BUTTON, (String) obj, InsuranceScreen.PRE_BOOK);
                binding = scootersInsuranceSuggestModalView.getBinding();
                binding.d.stopAnimation();
                binding2 = scootersInsuranceSuggestModalView.getBinding();
                binding2.e.setEnabled(true);
                slsVar = scootersInsuranceSuggestModalView.onFullInsuranceEnabled;
                slsVar.invoke();
                break;
            case 21:
                tls tlsVar = (tls) obj2;
                int i2 = nun0.a[((run0) obj).d.ordinal()];
                if (i2 == 1) {
                    tlsVar.invoke(pun0.b);
                } else if (i2 != 2) {
                    w511.b();
                    break;
                } else {
                    tlsVar.invoke(pun0.c);
                }
                break;
            case 22:
                ((gh00) ((ah00) obj2)).u((hr7) obj);
                break;
            case 23:
                refreshChips$lambda$0$0 = ScootersMultiSelectChipsComponent.refreshChips$lambda$0$0((ScootersMultiSelectChipsComponent) obj2, (eqb) obj);
                break;
            case 24:
                break;
            case 25:
                bysVar = ScootersNewControlPanelView.topButtonsRvAdapter_delegate$lambda$0((Context) obj2, (ScootersNewControlPanelView) obj);
                break;
            case 26:
                ((m1k) obj2).dispose();
                ((d5o0) obj).invoke();
                break;
            case 27:
                ((m1k) obj2).dispose();
                ((d5o0) obj).invoke();
                break;
            case 28:
                ((tls) obj2).invoke(new a8o0(((l8o0) obj).a));
                break;
            default:
                ((tls) obj2).invoke(new y7o0(((h8o0) obj).b));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ tmm0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
