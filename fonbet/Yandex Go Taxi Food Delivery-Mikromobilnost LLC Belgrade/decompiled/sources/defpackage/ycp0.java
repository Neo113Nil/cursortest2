package defpackage;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.pin.api.entities.PinScenario;
import com.ybsdk.feature.pin.api.entities.ReissueActionType;
import com.ybsdk.feature.pin.internal.screens.biometry.BiometricFragment;
import com.ybsdk.feature.pin.internal.screens.biometry.BiometricScreenParams;
import com.ybsdk.feature.pin.internal.screens.createpin.CreatePinFragment;
import com.ybsdk.feature.pin.internal.screens.createpin.CreatePinScreenParams;
import com.ybsdk.feature.pin.internal.screens.createpin.OnFinishStrategy;

/* loaded from: classes3.dex */
public final class ycp0 {
    public static FragmentScreen a(PinScenario pinScenario, String str) {
        return new FragmentScreen("CreateBiometricScreen", false, new BiometricScreenParams(pinScenario, str, null), null, qoi0.a(BiometricFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 10, null);
    }

    public static FragmentScreen b(ycp0 ycp0Var, ReissueActionType reissueActionType, OnFinishStrategy onFinishStrategy, PinScenario pinScenario, boolean z, Text.Resource resource, int i) {
        ReissueActionType reissueActionType2 = (i & 1) != 0 ? ReissueActionType.NONE : reissueActionType;
        OnFinishStrategy onFinishStrategy2 = (i & 2) != 0 ? OnFinishStrategy.EXIT : onFinishStrategy;
        Text.Resource resource2 = (i & 16) != 0 ? new Text.Resource(dzh0.ybsdk_pin_first_pin_set_title) : resource;
        ycp0Var.getClass();
        return new FragmentScreen(CreatePinFragment.SCREEN_KEY, false, new CreatePinScreenParams(null, reissueActionType2, pinScenario, onFinishStrategy2, z, null, resource2, 33, null), null, qoi0.a(CreatePinFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 10, null);
    }
}
