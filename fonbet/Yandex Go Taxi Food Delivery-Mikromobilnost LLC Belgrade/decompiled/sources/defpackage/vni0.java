package defpackage;

import com.yandex.go.navigation.screen.api.Screen;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class vni0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Screen.values().length];
        try {
            iArr[Screen.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Screen.SUMMARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Screen.ROUTE_SELECTOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Screen.CHOOSE_B.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
