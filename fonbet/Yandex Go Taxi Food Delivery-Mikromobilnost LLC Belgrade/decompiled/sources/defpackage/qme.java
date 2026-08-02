package defpackage;

import ru.yandex.taxi.eatskit.EatsKitDelegates$ClickTarget;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class qme {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EatsKitDelegates$ClickTarget.values().length];
        try {
            iArr[EatsKitDelegates$ClickTarget.BUTTON_ERROR_HIDE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EatsKitDelegates$ClickTarget.BUTTON_ERROR_RELOAD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EatsKitDelegates$ClickTarget.BUTTON_AUTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EatsKitDelegates$ClickTarget.BUTTON_AUTH_HIDE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EatsKitDelegates$ClickTarget.BUTTON_CLOSE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
