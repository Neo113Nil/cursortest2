package defpackage;

import com.yandex.go.taxi.order.api.change.destination.RouteChangeType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class uh70 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RouteChangeType.values().length];
        try {
            iArr[RouteChangeType.CHANGE_MID_POINT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
