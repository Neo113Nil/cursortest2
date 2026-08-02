package defpackage;

import com.ybsdk.feature.pin.internal.screens.checkpin.CheckType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class uhb {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CheckType.values().length];
        try {
            iArr[CheckType.ENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CheckType.ENTER_PRO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CheckType.VALIDATE_PIN_ON_RETURN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CheckType.SET_BIOMETRY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CheckType.CHANGE_PIN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
