package defpackage;

import ru.yandex.taxi.communications.api.dto.BannerWidgets;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class z1z0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BannerWidgets.NamedActionType.values().length];
        try {
            iArr[BannerWidgets.NamedActionType.SCOOTERS_USE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BannerWidgets.NamedActionType.TAXI_USE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
