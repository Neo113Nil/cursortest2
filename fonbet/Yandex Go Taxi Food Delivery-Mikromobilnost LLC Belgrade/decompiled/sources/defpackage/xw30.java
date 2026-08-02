package defpackage;

import ru.yandex.taxi.masstransit.analytic.MtDetailRouteCardCloseReason;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class xw30 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MtDetailRouteCardCloseReason.values().length];
        try {
            iArr[MtDetailRouteCardCloseReason.PULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MtDetailRouteCardCloseReason.SYSTEM_BACK_BUTTON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MtDetailRouteCardCloseReason.CARD_BACK_BUTTON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
