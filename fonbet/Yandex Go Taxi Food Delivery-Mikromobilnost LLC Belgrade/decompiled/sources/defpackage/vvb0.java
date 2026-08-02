package defpackage;

import com.ybsdk.feature.pin.internal.domain.PinState;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class vvb0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PinState.values().length];
        try {
            iArr[PinState.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PinState.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PinState.LOADING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PinState.SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
