package androidx.biometric;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class BiometricManager$Api29Impl {
    public static int canAuthenticate(BiometricManager biometricManager) {
        return biometricManager.canAuthenticate();
    }

    public static BiometricManager create(Context context) {
        return (BiometricManager) context.getSystemService(BiometricManager.class);
    }

    public static Method getCanAuthenticateWithCryptoMethod() {
        try {
            return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
