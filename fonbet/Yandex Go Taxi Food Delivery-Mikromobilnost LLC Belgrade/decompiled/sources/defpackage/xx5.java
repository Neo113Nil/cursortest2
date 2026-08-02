package defpackage;

import android.hardware.biometrics.BiometricManager;

/* loaded from: classes10.dex */
public abstract class xx5 {
    public static int a(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(i);
    }
}
