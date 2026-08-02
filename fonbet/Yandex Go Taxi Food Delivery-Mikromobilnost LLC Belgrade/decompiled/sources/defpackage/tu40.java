package defpackage;

import com.yandex.go.multimodal_route.ui.detailed_card.MultimodalRouteFabState;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class tu40 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MultimodalRouteFabState.values().length];
        try {
            iArr[MultimodalRouteFabState.FOCUS_ROUTE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MultimodalRouteFabState.FOCUS_USER_LOCATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
