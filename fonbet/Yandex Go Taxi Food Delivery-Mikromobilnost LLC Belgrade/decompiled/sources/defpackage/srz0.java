package defpackage;

import ru.yandex.taxi.preorder.tollroad.analytics.TollRoadSetReason;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class srz0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TollRoadSetReason.values().length];
        try {
            iArr[TollRoadSetReason.ROUTE_TAPPED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TollRoadSetReason.OPTION_SELECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TollRoadSetReason.INIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TollRoadSetReason.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TollRoadSetReason.GOT_NEW_TOLL_ROADS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TollRoadSetReason.NEW_ROUTE_FROM_MAPKIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[TollRoadSetReason.SOURCE_ADDRESS_CHANGED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[TollRoadSetReason.SELECTED_TARIFF_CHANGED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[TollRoadSetReason.DESTINATION_ADDRESS_CHANGED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        a = iArr;
    }
}
