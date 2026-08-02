package defpackage;

import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class trw {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TariffOrderFlow.values().length];
        try {
            iArr[TariffOrderFlow.TAXI_FLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TariffOrderFlow.DRIVE_FLOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TariffOrderFlow.SHUTTLE_FLOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TariffOrderFlow.DELIVERY_FLOW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TariffOrderFlow.COPTER_FLOW.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TariffOrderFlow.COPTER_CITY_TOUR_FLOW.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
