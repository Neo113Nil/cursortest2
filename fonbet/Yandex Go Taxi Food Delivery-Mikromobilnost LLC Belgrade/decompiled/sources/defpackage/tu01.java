package defpackage;

import android.os.Bundle;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.version2.api.TransferTwoFactorScreenProvider$Request;
import com.ybsdk.feature.transfer.version2.api.TransferTwoFactorScreenProvider$TwoFactorResult;
import com.ybsdk.screens.registration.RegistrationFeature$Result;
import com.ybsdk.screens.registration.a;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationTarget;

/* loaded from: classes3.dex */
public final class tu01 implements hu01 {
    public final /* synthetic */ tw51 a;

    public tu01(tw51 tw51Var) {
        this.a = tw51Var;
    }

    public final TransferTwoFactorScreenProvider$TwoFactorResult a(Bundle bundle) {
        RegistrationFeature$Result registrationFeature$Result = (RegistrationFeature$Result) bundle.getParcelable(TarifficatorScenarioActivity.RESULT_KEY);
        if (jl40.l(registrationFeature$Result, RegistrationFeature$Result.Cancel.INSTANCE)) {
            return TransferTwoFactorScreenProvider$TwoFactorResult.Cancel.INSTANCE;
        }
        if (registrationFeature$Result instanceof RegistrationFeature$Result.VerificationToken) {
            return new TransferTwoFactorScreenProvider$TwoFactorResult.VerificationToken(((RegistrationFeature$Result.VerificationToken) registrationFeature$Result).getVerificationToken());
        }
        if (registrationFeature$Result == null) {
            return null;
        }
        w511.b();
        return null;
    }

    public final FragmentScreen b(rbv rbvVar, Text text, String str, TransferTwoFactorScreenProvider$Request transferTwoFactorScreenProvider$Request, TransferScenario transferScenario) {
        CodeConfirmationTarget codeConfirmationTarget;
        CodeConfirmationParams.HeaderImage headerImage = null;
        switch (transferScenario == null ? -1 : su01.a[transferScenario.ordinal()]) {
            case -1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                codeConfirmationTarget = CodeConfirmationTarget.YbAuthorization.INSTANCE;
                break;
            case 0:
            default:
                w511.b();
                return null;
            case 1:
                codeConfirmationTarget = CodeConfirmationTarget.MkkCashoutAuthorization.INSTANCE;
                break;
        }
        CodeConfirmationTarget codeConfirmationTarget2 = codeConfirmationTarget;
        a aVar = (a) ((h9g) this.a).R.get();
        CodeConfirmationParams.HeaderText.UniversalText universalText = new CodeConfirmationParams.HeaderText.UniversalText(null, 1, null);
        if (rbvVar instanceof nbv) {
            headerImage = new CodeConfirmationParams.HeaderImage.Resource(((nbv) rbvVar).a);
        } else if (rbvVar instanceof pbv) {
            headerImage = new CodeConfirmationParams.HeaderImage.Url(((pbv) rbvVar).a);
        }
        return a.e(aVar, universalText, str, headerImage, text, false, null, null, transferTwoFactorScreenProvider$Request.getKey(), OpenScreenRequirement.WithBuid.INSTANCE, false, codeConfirmationTarget2, 1248);
    }
}
