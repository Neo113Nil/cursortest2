package defpackage;

import com.ybsdk.feature.pin.internal.screens.checkpin.CheckType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class rhb {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CheckType.values().length];
        try {
            iArr[CheckType.ENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CheckType.VALIDATE_PIN_ON_RETURN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CheckType.SET_BIOMETRY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
