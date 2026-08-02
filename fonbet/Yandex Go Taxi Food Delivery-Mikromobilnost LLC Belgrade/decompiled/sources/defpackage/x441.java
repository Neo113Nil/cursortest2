package defpackage;

import com.yandex.go.walking.navigation.impl.model.WalkNavFocusButtonState;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class x441 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WalkNavFocusButtonState.values().length];
        try {
            iArr[WalkNavFocusButtonState.FOCUS_ROUTE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WalkNavFocusButtonState.FOCUS_USER_LOCATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
