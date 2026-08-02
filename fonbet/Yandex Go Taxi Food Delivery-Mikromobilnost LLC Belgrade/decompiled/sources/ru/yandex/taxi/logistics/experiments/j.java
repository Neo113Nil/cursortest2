package ru.yandex.taxi.logistics.experiments;

import ru.yandex.taxi.logistics.experiments.DeliveryPvzExperiment;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class j {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeliveryPvzExperiment.RouteType.values().length];
        try {
            iArr[DeliveryPvzExperiment.RouteType.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeliveryPvzExperiment.RouteType.DESTINATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
