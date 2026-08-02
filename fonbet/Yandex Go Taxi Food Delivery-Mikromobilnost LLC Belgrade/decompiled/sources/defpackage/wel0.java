package defpackage;

import ru.yandex.taxi.masstransit.model.RouteType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class wel0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RouteType.values().length];
        try {
            iArr[RouteType.ROUTE_TYPE_BUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RouteType.ROUTE_TYPE_MINIBUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RouteType.ROUTE_TYPE_SHUTTLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RouteType.ROUTE_TYPE_TRAMWAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[RouteType.ROUTE_TYPE_TROLLEYBUS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[RouteType.ROUTE_TYPE_RAILWAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[RouteType.ROUTE_TYPE_WATER.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[RouteType.ROUTE_TYPE_FUNICULAR.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[RouteType.ROUTE_TYPE_CABLE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[RouteType.ROUTE_TYPE_AERO.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[RouteType.ROUTE_TYPE_UNDERGROUND.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        a = iArr;
    }
}
