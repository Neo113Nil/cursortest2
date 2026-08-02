package defpackage;

import com.yandex.go.flex.common.api.actions.DeeplinkNavigationAction;
import com.yandex.go.overdraft.data.model.ActionButton$$serializer;
import com.yandex.go.overdraft.data.model.Complement$$serializer;
import com.yandex.go.overdraft.data.model.DebtAvailablePaymentMethod$$serializer;
import com.yandex.go.overdraft.data.model.DebtDetail;
import com.yandex.go.overdraft.data.model.DebtFlow;
import com.yandex.go.overdraft.data.model.DebtInfo;
import com.yandex.go.overdraft.data.model.DebtPaymentMethodDto;
import com.yandex.go.overdraft.data.model.DebtPaymentMethodDto$$serializer;
import com.yandex.go.overdraft.data.model.DebtStatusesParam;
import com.yandex.go.overdraft.data.model.DebtStatusesResponse;
import com.yandex.go.overdraft.data.model.DebtUiOpenSource;
import com.yandex.go.overdraft.data.model.OrderPaymentMethodSettingsDto$$serializer;
import com.yandex.go.overdraft.data.model.OrderStatus$$serializer;
import com.yandex.go.overdraft.data.model.PaymentState;
import com.yandex.go.overdraft.data.model.Ride$$serializer;
import com.yandex.go.overdraft.data.model.TopNotification$$serializer;
import com.yandex.go.overdraft.data.model.i;
import com.yandex.go.overdraft.data.model.k;
import com.yandex.go.overdraft.data.model.o;
import com.yandex.go.overdraft.data.model.r;
import com.yandex.go.overdraft.data.model.s;
import com.yandex.go.overdraft.data.model.t;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3Fragment;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.yandex.taxi.common_models.net.p;
import ru.yandex.taxi.personalstate.api.network.objects.DataType;
import ru.yandex.taxi.scooters.data.model.DebtStatus;

/* loaded from: classes13.dex */
public final /* synthetic */ class rsf implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ rsf(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        zy11 zy11Var2;
        jw00 jw00Var;
        zy11 zy11Var3;
        switch (this.a) {
            case 0:
                zy11Var = zy11.a;
                return zy11Var;
            case 1:
                zy11Var2 = zy11.a;
                return zy11Var2;
            case 2:
                return new eez0();
            case 3:
                throw new IllegalStateException("No AnalyticsEventListener provided");
            case 4:
                jw00Var = DashboardV3Fragment.toolbarButtonsMarginDecorator_delegate$lambda$11();
                return jw00Var;
            case 5:
                zy11Var3 = zy11.a;
                return zy11Var3;
            case 6:
                return vez0.g("ru.yandex.taxi.personalstate.api.network.objects.DataType", DataType.values(), new String[]{"popup", "notification"}, new Annotation[][]{null, null});
            case 7:
                return new ssp0("kotlinx.datetime.DateTimeUnit.DateBased", qoi0.a(trg.class), new lfx[]{qoi0.a(vrg.class), qoi0.a(xrg.class)}, new KSerializer[]{gsg.a, t630.a});
            case 8:
                return new ssp0("kotlinx.datetime.DateTimeUnit", qoi0.a(asg.class), new lfx[]{qoi0.a(vrg.class), qoi0.a(xrg.class), qoi0.a(zrg.class)}, new KSerializer[]{gsg.a, t630.a, z5z0.a});
            case 9:
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
                if (evu0.J("kotlinx.datetime.DayBased")) {
                    ny61.g("Blank serial names are prohibited");
                    return null;
                }
                h0c h0cVar = new h0c("kotlinx.datetime.DayBased");
                h0cVar.a("days", h6w.b, false);
                return new asq0("kotlinx.datetime.DayBased", ovu0.g, h0cVar.c.size(), j73.d0(serialDescriptorArr), h0cVar);
            case 10:
                return "Failed to get unread messages count";
            case 11:
                qtg qtgVar = rtg.Companion;
                return DebtStatus.Companion.serializer();
            case 12:
                i iVar = DebtDetail.Companion;
                return DebtDetail.Type.Companion.serializer();
            case 13:
                return vez0.g("com.yandex.go.overdraft.data.model.DebtDetail.Type", DebtDetail.Type.values(), new String[]{"ride", "tips"}, new Annotation[][]{null, null});
            case 14:
                k kVar = DebtFlow.Companion;
                return new p53(TopNotification$$serializer.INSTANCE, 0);
            case 15:
                o oVar = DebtInfo.Companion;
                return new p53(Ride$$serializer.INSTANCE, 0);
            case 16:
                o oVar2 = DebtInfo.Companion;
                return new p53(ActionButton$$serializer.INSTANCE, 0);
            case 17:
                return new o4o("com.yandex.go.overdraft.data.model.DebtNotificationAction.TopupYandexCard", xtg.INSTANCE, new Annotation[0]);
            case 18:
                return new o4o("com.yandex.go.overdraft.data.model.DebtNotificationAction.Unknown", ytg.INSTANCE, new Annotation[0]);
            case 19:
                r rVar = DebtPaymentMethodDto.Companion;
                return new p53(Complement$$serializer.INSTANCE, 0);
            case 20:
                return vez0.g("ru.yandex.taxi.scooters.data.model.DebtStatus", DebtStatus.values(), new String[]{"no_funds", "waiting"}, new Annotation[][]{null, null});
            case 21:
                s sVar = DebtStatusesParam.Companion;
                return new p53(DebtAvailablePaymentMethod$$serializer.INSTANCE, 0);
            case 22:
                t tVar = DebtStatusesResponse.Companion;
                return new p53(OrderStatus$$serializer.INSTANCE, 0);
            case 23:
                t tVar2 = DebtStatusesResponse.Companion;
                return new p53(auu0.a, 0);
            case 24:
                t tVar3 = DebtStatusesResponse.Companion;
                return new p53(DebtPaymentMethodDto$$serializer.INSTANCE, 0);
            case 25:
                t tVar4 = DebtStatusesResponse.Companion;
                return new p53(OrderPaymentMethodSettingsDto$$serializer.INSTANCE, 0);
            case 26:
                t tVar5 = DebtStatusesResponse.Companion;
                return PaymentState.Companion.serializer();
            case 27:
                return vez0.g("com.yandex.go.overdraft.data.model.DebtUiOpenSource", DebtUiOpenSource.values(), new String[]{"summary", "main_screen", "order_button", "active_order", null}, new Annotation[][]{null, null, null, null, null});
            case 28:
                mzg mzgVar = uzg.Companion;
                return new p53(p.e, 0);
            default:
                return DeeplinkNavigationAction.Companion.serializer();
        }
    }
}
