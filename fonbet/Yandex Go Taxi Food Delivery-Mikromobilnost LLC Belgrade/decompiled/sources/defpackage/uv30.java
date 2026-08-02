package defpackage;

import ru.yandex.taxi.masstransit.ui.routeinfo.MtFloatingButtonState;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class uv30 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MtFloatingButtonState.values().length];
        try {
            iArr[MtFloatingButtonState.FOCUS_ROUTE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MtFloatingButtonState.FOCUS_USER_LOCATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
