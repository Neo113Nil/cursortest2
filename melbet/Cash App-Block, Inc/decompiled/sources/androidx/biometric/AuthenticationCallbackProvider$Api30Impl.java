package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;

/* loaded from: classes3.dex */
public abstract class AuthenticationCallbackProvider$Api30Impl {
    public static int getAuthenticationType(BiometricPrompt.AuthenticationResult authenticationResult) {
        return authenticationResult.getAuthenticationType();
    }
}
