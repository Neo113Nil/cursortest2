package defpackage;

import com.ybsdk.feature.pin.api.entities.PinScenario;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ry5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PinScenario.values().length];
        try {
            iArr[PinScenario.SETUP_PIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PinScenario.CHANGE_PIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PinScenario.FORGOT_PIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PinScenario.REISSUE_PIN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
