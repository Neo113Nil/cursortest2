package defpackage;

import com.ybsdk.feature.pin.api.entities.BiometricHelper$PromptMode;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class vx5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BiometricHelper$PromptMode.values().length];
        try {
            iArr[BiometricHelper$PromptMode.Encrypt.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BiometricHelper$PromptMode.Decrypt.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
