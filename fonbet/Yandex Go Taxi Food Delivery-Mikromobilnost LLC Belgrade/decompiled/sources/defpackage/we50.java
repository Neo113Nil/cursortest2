package defpackage;

import com.yandex.go.navigator.driving.GuidanceCompletionReason;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class we50 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GuidanceCompletionReason.values().length];
        try {
            iArr[GuidanceCompletionReason.END_OF_ROUTE_ACHIEVED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GuidanceCompletionReason.COMPLETED_BY_USER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GuidanceCompletionReason.GUIDANCE_ROUTE_IS_NULL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
