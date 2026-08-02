package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import ru.yandex.taxi.eatskit.EatsKitDelegates$ClickTarget;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class xrv0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[Screen.values().length];
        try {
            iArr[Screen.ORDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Screen.MAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Screen.SUMMARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Screen.MULTI_AREA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[EatsKitDelegates$ClickTarget.values().length];
        try {
            iArr2[EatsKitDelegates$ClickTarget.BUTTON_ERROR_HIDE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EatsKitDelegates$ClickTarget.BUTTON_ERROR_RELOAD.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
