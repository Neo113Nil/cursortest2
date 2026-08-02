package defpackage;

import com.yandex.go.dto.response.Action$RouteInput;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class w7w0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Action$RouteInput.AdditionalActionType.values().length];
        try {
            iArr[Action$RouteInput.AdditionalActionType.PREORDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Action$RouteInput.AdditionalActionType.ORDER_TO_ANOTHER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
