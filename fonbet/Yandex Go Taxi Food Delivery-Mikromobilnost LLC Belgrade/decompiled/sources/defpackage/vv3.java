package defpackage;

import android.os.Bundle;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.autotopup.api.TwoFactorAuthResult;
import com.ybsdk.screens.registration.RegistrationFeature$Result;
import com.ybsdk.screens.registration.a;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;

/* loaded from: classes3.dex */
public final class vv3 implements uk11 {
    public final /* synthetic */ a a;

    public vv3(a aVar) {
        this.a = aVar;
    }

    public final TwoFactorAuthResult a(Bundle bundle) {
        RegistrationFeature$Result registrationFeature$Result = (RegistrationFeature$Result) bundle.getParcelable(TarifficatorScenarioActivity.RESULT_KEY);
        return registrationFeature$Result instanceof RegistrationFeature$Result.VerificationToken ? new TwoFactorAuthResult.Success(((RegistrationFeature$Result.VerificationToken) registrationFeature$Result).getVerificationToken()) : TwoFactorAuthResult.Cancel.INSTANCE;
    }

    public final FragmentScreen b(String str) {
        return a.e(this.a, new CodeConfirmationParams.HeaderText.UniversalText(null, 1, null), str, new CodeConfirmationParams.HeaderImage.Resource(txg0.ybsdk_ic_transfers_sbp), null, false, null, null, "AUTO_TOPUP_REQUEST_KEY", OpenScreenRequirement.WithBuid.INSTANCE, false, null, 3304);
    }
}
