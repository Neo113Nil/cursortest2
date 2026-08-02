package defpackage;

import android.os.Bundle;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.feature.savings.api.SavingsTwoFactorAuthResult;
import com.ybsdk.screens.registration.RegistrationFeature$Result;
import com.ybsdk.screens.registration.a;

/* loaded from: classes3.dex */
public final class wcm0 implements udm0 {
    public final /* synthetic */ a a;

    public wcm0(a aVar) {
        this.a = aVar;
    }

    public final SavingsTwoFactorAuthResult a(Bundle bundle) {
        RegistrationFeature$Result registrationFeature$Result = (RegistrationFeature$Result) bundle.getParcelable(TarifficatorScenarioActivity.RESULT_KEY);
        return registrationFeature$Result instanceof RegistrationFeature$Result.VerificationToken ? new SavingsTwoFactorAuthResult.Success(((RegistrationFeature$Result.VerificationToken) registrationFeature$Result).getVerificationToken()) : SavingsTwoFactorAuthResult.Cancel.INSTANCE;
    }
}
