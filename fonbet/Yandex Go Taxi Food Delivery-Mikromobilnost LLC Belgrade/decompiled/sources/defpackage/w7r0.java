package defpackage;

import android.os.Bundle;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.screens.registration.RegistrationFeature$Result;

/* loaded from: classes3.dex */
public final class w7r0 implements gyp0 {
    public final /* synthetic */ tw51 a;

    public w7r0(tw51 tw51Var) {
        this.a = tw51Var;
    }

    public final String a(Bundle bundle) {
        RegistrationFeature$Result registrationFeature$Result = (RegistrationFeature$Result) bundle.getParcelable(TarifficatorScenarioActivity.RESULT_KEY);
        if (registrationFeature$Result instanceof RegistrationFeature$Result.VerificationToken) {
            return ((RegistrationFeature$Result.VerificationToken) registrationFeature$Result).getVerificationToken();
        }
        return null;
    }
}
