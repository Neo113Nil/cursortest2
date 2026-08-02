package defpackage;

import com.yandex.go.navigator.map_interactions.parkings.ui.ToggleButtonsUiAction;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class ss6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ToggleButtonsUiAction.values().length];
        try {
            iArr[ToggleButtonsUiAction.PARKING_TOGGLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ToggleButtonsUiAction.TRAFFIC_TOGGLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
