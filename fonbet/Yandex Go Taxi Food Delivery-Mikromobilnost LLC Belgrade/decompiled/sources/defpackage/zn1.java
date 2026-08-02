package defpackage;

import com.yandex.go.ai_widget.data.AiWidgetEvaluationInternalApi;
import com.yandex.go.benefits_center.data.BenefitsCenterInternalApi;
import com.yandex.go.charity.api.CharityApi;
import com.yandex.go.explorer.impl.data.api.ExplorerInternalApi;
import com.yandex.go.lottie_loader.data.api.LottieInternalApi;
import com.yandex.go.masstransit.sdk.client_api.data.network.ClientRetrofitApi;
import com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.network.MosmetroOtpApi;
import com.yandex.go.overdraft.data.DebtsApi;
import com.yandex.go.payments.shared.business.accountcreation.corp.checklogin.CorpAccountClientInfoApi;
import com.yandex.go.places.complaint.impl.data.api.ComplaintsInternalApi;
import com.yandex.go.places.impl.data.api.OrganizationsDiscoveryInternalApi;
import com.yandex.go.taxi.intercity.dashboard.impl.data.api.IntercityDashboardApi;
import com.yandex.go.taxi.order.change.driver.ChangeDriverApi;
import com.yandex.go.taxi.order.change.due.data.api.ChangeOrderDueApi;
import com.yandex.go.taxi.order.change.price.data.api.AdditionalPaymentApi;
import com.yandex.go.taxi.order.change.source.data.ChangeSourcePointApi;
import com.yandex.go.taxi.order.detailed_price.data.api.DetailedPriceApi;
import com.yandex.go.taxi.order.feedback.data.FeedbackSurveyApi;
import com.yandex.go.taxi.tariffs.data.NearestPositionApi;
import okhttp3.OkHttpClient;
import ru.yandex.taxi.checkin.api.CheckInApi;
import ru.yandex.taxi.hiredriver.HireDriverApi;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.MtCheckoutApi;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.MtCreatePaymentApi;
import ru.yandex.taxi.masstransit.geopayment.linkcard.network.MtLinkCardApi;
import ru.yandex.taxi.masstransit.geopayment.tickets.network.MtTicketsApi;
import ru.yandex.taxi.masstransit.trains.api.MtTrainScheduleApi;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes12.dex */
public final /* synthetic */ class zn1 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ on2 b;

    public /* synthetic */ zn1(on2 on2Var, int i) {
        this.a = i;
        this.b = on2Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        on2 on2Var = this.b;
        switch (i) {
            case 0:
                on2Var.getClass();
                return (AiWidgetEvaluationInternalApi) on2Var.a(GoApiName.TaxiV4, AiWidgetEvaluationInternalApi.class);
            case 1:
                return (OkHttpClient) on2Var.k.getValue();
            case 2:
                on2Var.getClass();
                return (AdditionalPaymentApi) on2Var.a(GoApiName.TaxiV4, AdditionalPaymentApi.class);
            case 3:
                on2Var.getClass();
                return (BenefitsCenterInternalApi) on2Var.a(GoApiName.TaxiV4, BenefitsCenterInternalApi.class);
            case 4:
                on2Var.getClass();
                return (BenefitsCenterInternalApi) on2Var.a(GoApiName.TaxiV4, BenefitsCenterInternalApi.class);
            case 5:
                on2Var.getClass();
                return (ChangeDriverApi) on2Var.a(GoApiName.TaxiV4, ChangeDriverApi.class);
            case 6:
                on2Var.getClass();
                return (ChangeOrderDueApi) on2Var.a(GoApiName.TaxiV4, ChangeOrderDueApi.class);
            case 7:
                on2Var.getClass();
                return (ChangeSourcePointApi) on2Var.a(GoApiName.TaxiV4, ChangeSourcePointApi.class);
            case 8:
                on2Var.getClass();
                return (CharityApi) on2Var.a(GoApiName.TaxiV4, CharityApi.class);
            case 9:
                on2Var.getClass();
                return (CheckInApi) on2Var.a(GoApiName.TaxiV4, CheckInApi.class);
            case 10:
                on2Var.getClass();
                return (ComplaintsInternalApi) on2Var.a(GoApiName.TaxiV4, ComplaintsInternalApi.class);
            case 11:
                on2Var.getClass();
                return (CorpAccountClientInfoApi) on2Var.a(GoApiName.TaxiV4, CorpAccountClientInfoApi.class);
            case 12:
                on2Var.getClass();
                return (CorpAccountClientInfoApi) on2Var.a(GoApiName.TaxiV4, CorpAccountClientInfoApi.class);
            case 13:
                on2Var.getClass();
                return (MtCreatePaymentApi) on2Var.a(GoApiName.TaxiV4, MtCreatePaymentApi.class);
            case 14:
                on2Var.getClass();
                return (DebtsApi) on2Var.a(GoApiName.TaxiV3, DebtsApi.class);
            case 15:
                on2Var.getClass();
                return (DetailedPriceApi) on2Var.a(GoApiName.TaxiV4, DetailedPriceApi.class);
            case 16:
                on2Var.getClass();
                return (ExplorerInternalApi) on2Var.a(GoApiName.TaxiV4, ExplorerInternalApi.class);
            case 17:
                on2Var.getClass();
                return (OrganizationsDiscoveryInternalApi) on2Var.a(GoApiName.TaxiV4, OrganizationsDiscoveryInternalApi.class);
            case 18:
                on2Var.getClass();
                return (FeedbackSurveyApi) on2Var.a(GoApiName.TaxiV4, FeedbackSurveyApi.class);
            case 19:
                on2Var.getClass();
                return (HireDriverApi) on2Var.a(GoApiName.TaxiV4, HireDriverApi.class);
            case 20:
                on2Var.getClass();
                return (IntercityDashboardApi) on2Var.a(GoApiName.TaxiV4, IntercityDashboardApi.class);
            case 21:
                on2Var.getClass();
                return (NearestPositionApi) on2Var.a(GoApiName.TaxiV3, NearestPositionApi.class);
            case 22:
                return (MtLinkCardApi) on2Var.a(GoApiName.TaxiV4, MtLinkCardApi.class);
            case 23:
                on2Var.getClass();
                return (umz) on2Var.a(GoApiName.TaxiV4, umz.class);
            case 24:
                on2Var.getClass();
                return (LottieInternalApi) on2Var.a(GoApiName.TaxiV4, LottieInternalApi.class);
            case 25:
                on2Var.getClass();
                return (ClientRetrofitApi) on2Var.a(GoApiName.TaxiV4, ClientRetrofitApi.class);
            case 26:
                on2Var.getClass();
                return (MosmetroOtpApi) on2Var.a(GoApiName.TaxiV4, MosmetroOtpApi.class);
            case 27:
                on2Var.getClass();
                return (MtCheckoutApi) on2Var.a(GoApiName.TaxiV4, MtCheckoutApi.class);
            case 28:
                on2Var.getClass();
                return (MtTicketsApi) on2Var.a(GoApiName.TaxiV4, MtTicketsApi.class);
            default:
                on2Var.getClass();
                return (MtTrainScheduleApi) on2Var.a(GoApiName.TaxiV4, MtTrainScheduleApi.class);
        }
    }
}
