package defpackage;

import android.net.NetworkCapabilities;
import com.samsung.android.sdk.samsungpay.v2.PartnerRequest;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.payments.data.model.response.ActionButton;
import com.yandex.go.payments.sbp.domain.analytics.SbpBindingAnalytics$Button;
import com.yandex.go.payments.sbp.ui.opening_bank_dialog.OpeningBankDialogModalView;
import com.yandex.go.places.analytics.generated.DiscoveryAnalytics$OrganizationListFiltersCardClickType;
import com.yandex.go.places.analytics.generated.DiscoveryAnalytics$OrganizationListFiltersCardCloseReason;
import com.yandex.go.places.impl.ui.filters.OrganizationsFiltersModalView;
import com.yandex.go.places.impl.ui.organizations.OrganizationsModalView;
import com.yandex.go.places.impl.ui.organizations.d;
import com.yandex.go.places.impl.ui.sorting.OrganizationsSortingModalView;
import com.yandex.go.superapp.order.multi.old.view.OrderStackView;
import com.yandex.go.superapp.order.multi.old.view.OrderViewContainer;
import com.yandex.go.taxi.order.cancel.v2.mvp.OrderCancelModalView;
import com.yandex.go.taxi.order.info.OrderInfoContentView;
import com.yandex.messaging.paging.PagedLoader$LoadState;
import com.yandex.messaging.paging.PagedLoader$LoadType;
import com.yandex.messenger.websdk.api.PushToken;
import com.ybsdk.feature.partnerselection.internal.screens.partners.presentation.PartnersFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ru.yandex.taxi.eatskit.internal.nativeapi.NativeApi;
import ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutModalView;
import ru.yandex.taxi.masstransit.model.CheckoutUIState$PaymentCheckoutUIState;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.OrderFragment;
import ru.yandex.taxi.order.f;
import ru.yandex.taxi.order.i;
import ru.yandex.taxi.order.view.OrderView;
import ru.yandex.taxi.orderforanother.router.a;
import ru.yandex.taxi.orderforanother.v1.ui.WhoRideSelectorModalView;
import ru.yandex.taxi.settings.profile.rating.PassengerRatingInfoDialog;
import ru.yandex.video.m3.ott.impl.OttTrackingReporterImpl;
import ru.yandex.yx_platform_api.NetCapabilityValidatedHandler$onListen$1;

/* loaded from: classes13.dex */
public final /* synthetic */ class sd30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sd30(b890 b890Var, ArrayList arrayList, PagedLoader$LoadType pagedLoader$LoadType, List list) {
        this.a = 25;
        this.b = b890Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rm80 rm80Var;
        z790 z790Var;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((MtCheckoutModalView) obj2).onBackButtonClicked((ld30) obj);
                break;
            case 1:
                MtCheckoutModalView.renderSuccessCheckoutPaymentState$lambda$3$1((CheckoutUIState$PaymentCheckoutUIState) obj, (MtCheckoutModalView) obj2);
                break;
            case 2:
                NativeApi.executeMethodOnMainThread$lambda$0((sls) obj2, (String) obj);
                break;
            case 3:
                qk50 qk50Var = (qk50) obj2;
                j7u0 j7u0Var = (j7u0) obj;
                if (!jl40.l(qk50Var.x, j7u0Var)) {
                    qk50Var.x = j7u0Var;
                    qk50Var.f(j7u0Var);
                    qk50Var.c.invoke(j7u0Var);
                    break;
                }
                break;
            case 4:
                ((mg21) ((lg21) ((da0) obj2).H)).c(((hl50) obj).d);
                break;
            case 5:
                NetCapabilityValidatedHandler$onListen$1.onCapabilitiesChanged$lambda$0((NetworkCapabilities) obj2, (xeo) obj);
                break;
            case 6:
                ((vh60) obj2).f.f = (PushToken) obj;
                break;
            case 7:
                OpeningBankDialogModalView openingBankDialogModalView = (OpeningBankDialogModalView) obj;
                int i2 = la70.a[((ActionButton) obj2).b.ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3) {
                        w511.b();
                        break;
                    } else {
                        openingBankDialogModalView.dismiss();
                        qa70 qa70Var = openingBankDialogModalView.presenter;
                        dfm0 dfm0Var = qa70Var.C;
                        gq4 gq4Var = qa70Var.y;
                        dfm0Var.a(gq4Var.b, SbpBindingAnalytics$Button.OPEN);
                        qa70Var.x.invoke(gq4Var.b);
                        break;
                    }
                } else {
                    qa70 qa70Var2 = openingBankDialogModalView.presenter;
                    qa70Var2.C.a(qa70Var2.y.b, SbpBindingAnalytics$Button.CANCEL);
                    openingBankDialogModalView.dismiss();
                    break;
                }
                break;
            case 8:
                ((fj70) obj).T.invoke(((cl9) obj2).b);
                break;
            case 9:
                OrderCancelModalView.createButton$lambda$0$0((OrderCancelModalView) obj2, (pl70) obj);
                break;
            case 10:
                String str = (String) obj2;
                at20 at20Var = (at20) obj;
                f fVar = (f) at20Var.b;
                o2y0 o2y0Var = (o2y0) at20Var.a;
                if (!jl40.l(str, "PAYMENT_TYPE_UNACCEPTABLE")) {
                    if (!jl40.l(str, "PERSONAL_WALLET_INSUFFICIENT_FUNDS")) {
                        fVar.p0(o2y0Var);
                        break;
                    } else {
                        fVar.m0(o2y0Var);
                        break;
                    }
                } else {
                    fVar.m0(o2y0Var);
                    break;
                }
            case 11:
                ((rp70) obj2).f = false;
                ((ht10) obj).k();
                break;
            case 12:
                ((qq70) obj2).e((DriveState) obj);
                break;
            case 13:
                ((zv70) obj2).n();
                ((a) obj).d.a().c(WhoRideSelectorModalView.class, true, null);
                break;
            case 14:
                o2y0 o2y0Var2 = (o2y0) obj;
                i presenter = ((OrderFragment) obj2).getPresenter();
                ((f) presenter.J).a0(o2y0Var2);
                presenter.Pg(presenter.M.b(), presenter.y0, o2y0Var2);
                break;
            case 15:
                OrderInfoContentView.applyDriverInfo$lambda$1((OrderInfoContentView) obj2, (qim) obj);
                break;
            case 16:
                ((tls) obj2).invoke((String) obj);
                break;
            case 17:
                OrderStackView.removeOrderView$lambda$0((OrderStackView) obj2, (Runnable) obj);
                break;
            case 18:
                ((OrderViewContainer) obj2).expandOrderView((OrderView) obj);
                break;
            case 19:
                ani aniVar = (ani) obj2;
                String str2 = (String) obj;
                pav pavVar = aniVar.T;
                yj80 yj80Var = (yj80) ((zo31) aniVar.R);
                nac nacVar = (nac) pavVar.a(yj80Var.c);
                nacVar.i = new ak80(aniVar, str2);
                nacVar.h = new ub60(23, aniVar);
                GoImageView goImageView = yj80Var.c;
                nacVar.f(goImageView.getMeasuredWidth(), goImageView.getMeasuredHeight());
                nacVar.c(str2);
                break;
            case 20:
                rm80Var = ((OrganizationsFiltersModalView) obj2).organizationsFiltersPresenter;
                fl10 fl10Var = rm80Var.C;
                jio jioVar = rm80Var.x;
                fr frVar = ((c6r) obj).c;
                if (frVar != null) {
                    int i3 = 21;
                    if (!(frVar instanceof uq)) {
                        if (!(frVar instanceof tq)) {
                            rm80Var.A.a(frVar, null);
                            break;
                        } else {
                            jioVar.b(DiscoveryAnalytics$OrganizationListFiltersCardClickType.SearchWithFilters, null);
                            ((da0) fl10Var.a).r(new ur70(i3));
                            jioVar.a(DiscoveryAnalytics$OrganizationListFiltersCardCloseReason.SearchFiltersButton);
                            break;
                        }
                    } else {
                        jioVar.b(DiscoveryAnalytics$OrganizationListFiltersCardClickType.ResetFilters, null);
                        rm80Var.z.a.b();
                        ((da0) fl10Var.a).r(new ur70(i3));
                        jioVar.a(DiscoveryAnalytics$OrganizationListFiltersCardCloseReason.ResetFiltersButton);
                        break;
                    }
                }
                break;
            case 21:
                d presenter2 = ((OrganizationsModalView) obj2).getPresenter();
                fr frVar2 = ((kp80) obj).a.a.d;
                if (frVar2 instanceof uq) {
                    presenter2.L.d.b();
                    presenter2.Qg();
                }
                if (frVar2 == null) {
                    presenter2.getClass();
                    break;
                } else {
                    presenter2.M.a(frVar2, null);
                    break;
                }
            case 22:
                OrganizationsSortingModalView.organizationsSortingListAdapter_delegate$lambda$0$0((OrganizationsSortingModalView) ((com.yandex.go.places.impl.ui.sorting.recycler.viewholders.a) obj2).S.b, ((rp80) obj).a);
                break;
            case 23:
                vq80 vq80Var = (vq80) obj;
                emn emnVar = ((uq80) obj2).c;
                if (emnVar != null) {
                    if (vq80Var == null) {
                        emnVar.a();
                        break;
                    } else {
                        emnVar.b(vq80Var);
                        break;
                    }
                }
                break;
            case 24:
                OttTrackingReporterImpl.report$lambda$3((OttTrackingReporterImpl) obj2, (Map) obj);
                break;
            case 25:
                ArrayList arrayList = (ArrayList) obj;
                WeakReference weakReference = ((b890) obj2).k;
                if (weakReference != null && (z790Var = (z790) weakReference.get()) != null) {
                    z790Var.a(arrayList);
                    break;
                }
                break;
            case 26:
                ((b890) obj2).f((PagedLoader$LoadType) obj, PagedLoader$LoadState.ERROR);
                break;
            case 27:
                ((PartnerRequest) obj2).h((com.samsung.android.sdk.samsungpay.v2.f) obj);
                break;
            case 28:
                PartnersFragment.render$lambda$19$lambda$17$lambda$16((qj90) obj2, (PartnersFragment) obj);
                break;
            default:
                PassengerRatingInfoDialog.showRatingInfoButton$lambda$0$0((PassengerRatingInfoDialog) obj2, (String) obj);
                break;
        }
    }

    public /* synthetic */ sd30(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ sd30(CheckoutUIState$PaymentCheckoutUIState checkoutUIState$PaymentCheckoutUIState, MtCheckoutModalView mtCheckoutModalView) {
        this.a = 1;
        this.c = checkoutUIState$PaymentCheckoutUIState;
        this.b = mtCheckoutModalView;
    }
}
