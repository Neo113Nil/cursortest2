package defpackage;

import com.ybsdk.feature.dashboard.api.model.SupportState;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class rkw0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SupportState.values().length];
        try {
            iArr[SupportState.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SupportState.HAS_UNREAD_MESSAGES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
