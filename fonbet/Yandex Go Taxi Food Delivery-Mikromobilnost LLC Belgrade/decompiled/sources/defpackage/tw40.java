package defpackage;

import com.yandex.go.net.taxi.dto.response.CanMakeMoreOrders;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class tw40 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CanMakeMoreOrders.values().length];
        try {
            iArr[CanMakeMoreOrders.UNMODIFIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CanMakeMoreOrders.ALLOWED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CanMakeMoreOrders.DISALLOWED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
