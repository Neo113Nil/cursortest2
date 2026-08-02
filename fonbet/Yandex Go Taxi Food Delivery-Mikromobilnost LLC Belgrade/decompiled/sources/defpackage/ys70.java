package defpackage;

import com.yandex.go.taxi.order.cache.api.data.model.OrderCacheParams;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class ys70 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OrderCacheParams.Service.values().length];
        try {
            iArr[OrderCacheParams.Service.TAXI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrderCacheParams.Service.LINKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OrderCacheParams.Service.SCOOTERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[OrderCacheParams.Service.DRIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[OrderCacheParams.Service.LOGISTICS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
