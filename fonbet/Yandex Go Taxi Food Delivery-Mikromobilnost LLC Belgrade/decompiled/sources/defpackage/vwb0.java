package defpackage;

import com.ybsdk.feature.pin.internal.network.dto.IssuePinTokenResponse;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class vwb0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[IssuePinTokenResponse.Action.values().length];
        try {
            iArr[IssuePinTokenResponse.Action.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IssuePinTokenResponse.Action.AUTHORIZATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
