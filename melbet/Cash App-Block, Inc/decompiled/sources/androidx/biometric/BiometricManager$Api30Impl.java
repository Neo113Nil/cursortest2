package androidx.biometric;

import android.hardware.biometrics.BiometricManager;

/* loaded from: classes3.dex */
public abstract class BiometricManager$Api30Impl {
    public static int canAuthenticate(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(i);
    }
}
