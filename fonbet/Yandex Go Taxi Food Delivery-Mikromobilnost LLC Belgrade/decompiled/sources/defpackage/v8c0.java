package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.ui.switchMeeting.a;
import com.ybsdk.feature.main.internal.screens.sbpAccount.SbpAccountInfoFragment;
import com.ybsdk.feature.qr.internal.screens.container.QrContainerFragment;
import com.ybsdk.feature.qr.payments.internal.screens.refresh.presentation.QrRefreshFragment;
import com.ybsdk.feature.savings.internal.screens.close.SavingsAccountCloseFragment;
import com.ybsdk.feature.savings.internal.screens.create.SavingsAccountCreationFragment;
import com.ybsdk.feature.savings.internal.screens.goal.SavingsAccountGoalFragment;
import com.ybsdk.feature.savings.internal.screens.lock.SavingsAccountLockFragment;
import com.ybsdk.feature.savings.internal.screens.name.SavingsAccountNameFragment;
import com.ybsdk.feature.split.deposit.internal.ui.autotopup.status.SplitDepositAutoTopupStatusFragment;
import com.ybsdk.feature.split.deposit.internal.ui.deposit.SplitDepositFragment;
import com.ybsdk.feature.status.screen.internal.ui.StatusScreenFragment;
import com.ybsdk.feature.testpayment.internal.presentation.TestPaymentFragment;
import com.ybsdk.feature.transactions.impl.ui.screens.list.TransactionsFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.confirm.TransferMe2MeConfirmFragment;
import com.ybsdk.screens.notice.presentation.TopupNoticeDeprecatedFragment;
import com.ybsdk.screens.notice.presentation.TopupNoticeFragment;
import com.ybsdk.screens.registration.applicationstatus.presentation.RegistrationApplicationStatusFragment;
import ru.yandex.taxi.logistics.sdk.postcard.presentation.b;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.widgets.data.api.WidgetsApi;

/* loaded from: classes3.dex */
public final class v8c0 implements v7p {
    public final /* synthetic */ int a;
    public final n3w b;

    public v8c0(s8c0 s8c0Var, n3w n3wVar) {
        this.a = 0;
        this.b = n3wVar;
    }

    public static v8c0 a(n3w n3wVar) {
        return new v8c0(n3wVar, 5);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 1;
        n3w n3wVar = this.b;
        switch (i) {
            case 0:
                if (((y7c0) n3wVar.a) instanceof u7c0) {
                    return new ulr(i2);
                }
                return null;
            case 1:
                return new ywd0((Activity) n3wVar.a);
            case 2:
                return new rxd0((Activity) n3wVar.a);
            case 3:
                return new b((Context) n3wVar.a);
            case 4:
                return new nyv((Activity) n3wVar.a, 1);
            case 5:
                on2 on2Var = ((d551) n3wVar.a).a;
                on2Var.getClass();
                WidgetsApi widgetsApi = (WidgetsApi) on2Var.a(GoApiName.TaxiV4, WidgetsApi.class);
                q5z.i(widgetsApi);
                return widgetsApi;
            case 6:
                return new QrContainerFragment((p6g0) n3wVar.a);
            case 7:
                return new QrRefreshFragment((adg0) n3wVar.a);
            case 8:
                return new RegistrationApplicationStatusFragment((oqi0) n3wVar.a);
            case 9:
                return new SavingsAccountCloseFragment((a4m0) n3wVar.a);
            case 10:
                return new SavingsAccountCreationFragment((w4m0) n3wVar.a);
            case 11:
                return new SavingsAccountGoalFragment((k6m0) n3wVar.a);
            case 12:
                return new SavingsAccountLockFragment((b7m0) n3wVar.a);
            case 13:
                return new SavingsAccountNameFragment((i7m0) n3wVar.a);
            case 14:
                return new SbpAccountInfoFragment((gem0) n3wVar.a);
            case 15:
                return new q4o0((pz40) n3wVar.a);
            case 16:
                return new x0s0((sit) n3wVar.a);
            case 17:
                return new ru.yandex.taxi.requirements.glued.ui.ui.b((i8h) n3wVar.a);
            case 18:
                return new SplitDepositAutoTopupStatusFragment((tst0) n3wVar.a);
            case 19:
                return new SplitDepositFragment((wut0) n3wVar.a);
            case 20:
                return new StatusScreenFragment((i9u0) n3wVar.a);
            case 21:
                return new com.yandex.go.superapp_carts.domain.loading.b((tse) n3wVar.a);
            case 22:
                return new jaw0((kaw0) n3wVar.a);
            case 23:
                return new a();
            case 24:
                return new TestPaymentFragment((ohy0) n3wVar.a);
            case 25:
                ChatRequest chatRequest = ((q6b) n3wVar.a).b;
                q5z.i(chatRequest);
                return chatRequest;
            case 26:
                return new TopupNoticeDeprecatedFragment((wxz0) n3wVar.a);
            case 27:
                return new TopupNoticeFragment((zxz0) n3wVar.a);
            case 28:
                return new TransactionsFragment((bg01) n3wVar.a);
            default:
                return new TransferMe2MeConfirmFragment((nm01) n3wVar.a);
        }
    }

    public /* synthetic */ v8c0(n3w n3wVar, int i) {
        this.a = i;
        this.b = n3wVar;
    }
}
