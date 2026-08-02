package defpackage;

import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.api.pro.entities.RegistrationType$OngoingOperation;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.screens.changephone.presentation.ChangePhoneStatusScreenParams;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.registration.a;
import com.ybsdk.screens.registration.applicationstatus.presentation.RegistrationApplicationStatusFragment;
import com.ybsdk.screens.registration.applicationstatus.presentation.RegistrationApplicationStatusScreenParams;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;
import com.ybsdk.screens.registration.phoneconfirmation.presentation.PhoneConfirmationFragment;
import com.ybsdk.screens.registration.phoneconfirmation.presentation.PhoneConfirmationParams;
import java.util.Collections;
import java.util.List;
import kotlin.collections.b;

/* loaded from: classes3.dex */
public final class u1h implements k3h {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ u1h(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        List singletonList;
        int i = this.a;
        a aVar = this.b;
        x0h x0hVar = x0h.a;
        switch (i) {
            case 0:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.ChangeNumber)) {
                    return x0hVar;
                }
                DeeplinkAction.ChangeNumber changeNumber = (DeeplinkAction.ChangeNumber) baseDeeplinkAction;
                return new v0h(Collections.singletonList(aVar.c(changeNumber.getApplicationId(), changeNumber.getForceInitialScreenOnResult(), ChangePhoneStatusScreenParams.Status.INITIAL)), null, 6);
            case 1:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.Registration)) {
                    return x0hVar;
                }
                DeeplinkAction.Registration registration = (DeeplinkAction.Registration) baseDeeplinkAction;
                boolean standAlone = registration.getStandAlone();
                a aVar2 = this.b;
                if (standAlone) {
                    YBProduct product = registration.getProduct();
                    String uri = registration.getDeeplinkUri().toString();
                    hri0 hri0Var = aVar2.b;
                    PhoneConfirmationParams phoneConfirmationParams = new PhoneConfirmationParams(product, b.f(), RegistrationType$OngoingOperation.REGISTRATION, true, false, uri, 16, null);
                    hri0Var.getClass();
                    singletonList = Collections.singletonList(new FragmentScreen("PhoneConfirmationScreen", false, phoneConfirmationParams, null, qoi0.a(PhoneConfirmationFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 10, null));
                } else {
                    singletonList = Collections.singletonList(a.d(aVar2, registration.getProduct(), null, false, registration.getDeeplinkUri().toString(), 14));
                }
                return new v0h(singletonList, null, 6);
            case 2:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.SecondFactorAuthorization)) {
                    return x0hVar;
                }
                CodeConfirmationParams.HeaderText.TwoFAText twoFAText = new CodeConfirmationParams.HeaderText.TwoFAText(null, 1, null);
                String value = ((DeeplinkAction.SecondFactorAuthorization) baseDeeplinkAction).getTrackId().getValue();
                hri0 hri0Var2 = aVar.b;
                CodeConfirmationParams.Authorization authorization = new CodeConfirmationParams.Authorization(twoFAText, null, value, null, false, false, aVar.e.n().isEnabled() ? Integer.valueOf(dzh0.ybsdk_sms_code_confirmation_enter_code_confirm_account_subtitle) : null, null, false, null, "request_key_authorization", 896, null);
                OpenScreenRequirement.WithUid withUid = OpenScreenRequirement.WithUid.INSTANCE;
                hri0Var2.getClass();
                return new v0h(Collections.singletonList(hri0.a(authorization, withUid)), null, 6);
            default:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.StatusCheck)) {
                    return x0hVar;
                }
                DeeplinkAction.StatusCheck statusCheck = (DeeplinkAction.StatusCheck) baseDeeplinkAction;
                YBProduct product2 = statusCheck.getProduct();
                String applicationId = statusCheck.getApplicationId();
                RegistrationType$OngoingOperation ongoingOperation = statusCheck.getOngoingOperation();
                hri0 hri0Var3 = aVar.b;
                com.ybsdk.rconfig.b bVar = aVar.e;
                bVar.getClass();
                RegistrationApplicationStatusScreenParams.StatusPolling statusPolling = new RegistrationApplicationStatusScreenParams.StatusPolling(applicationId, ((CommonFeatureFlag) bVar.d(wlp.K0).getData()).isEnabled(), ongoingOperation, product2, null);
                hri0Var3.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("RegistrationApplicationStatusScreen", false, statusPolling, null, qoi0.a(RegistrationApplicationStatusFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 10, null)), null, 6);
        }
    }
}
