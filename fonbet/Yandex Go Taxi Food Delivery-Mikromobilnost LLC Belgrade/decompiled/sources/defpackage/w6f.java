package defpackage;

import com.ybsdk.feature.pin.internal.domain.PinState;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class w6f {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PinState.values().length];
        try {
            iArr[PinState.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
