package defpackage;

import com.yandex.go.preorder.mode.SourcePointMode;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class wfv0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SourcePointMode.values().length];
        try {
            iArr[SourcePointMode.ROUTE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SourcePointMode.ROUTE_WITH_FOCUS_TO_POINT_A.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SourcePointMode.ROUTE_WITH_POINT_A_CONFIRMATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SourcePointMode.ROUTE_WITH_FOCUS_TO_POINT_B.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
