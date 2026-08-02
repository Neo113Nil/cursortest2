package defpackage;

import ru.yandex.taxi.multiexit.MultiexitProcessActionType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class z9t0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MultiexitProcessActionType.values().length];
        try {
            iArr[MultiexitProcessActionType.CONTINUE_TAXI_FLOW_WITH_NOTIFICATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MultiexitProcessActionType.CONTINUE_TAXI_FLOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MultiexitProcessActionType.FOCUS_MULTIEXIT_POINT_WITH_NOTIFICATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MultiexitProcessActionType.FOCUS_MULTIEXIT_POINT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MultiexitProcessActionType.DEFAULT_SHOW_MULTIEXIT_MODAL_VIEW.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
