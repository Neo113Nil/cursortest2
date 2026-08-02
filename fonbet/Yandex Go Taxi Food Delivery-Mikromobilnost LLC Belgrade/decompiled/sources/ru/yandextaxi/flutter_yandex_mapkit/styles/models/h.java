package ru.yandextaxi.flutter_yandex_mapkit.styles.models;

import ru.yandextaxi.flutter_yandex_mapkit.styles.models.TransportRouteViewStyleData;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class h {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransportRouteViewStyleData.TransportPolylineStyleData.YxTransportType.values().length];
        try {
            iArr[TransportRouteViewStyleData.TransportPolylineStyleData.YxTransportType.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransportRouteViewStyleData.TransportPolylineStyleData.YxTransportType.BUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransportRouteViewStyleData.TransportPolylineStyleData.YxTransportType.MINIBUS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TransportRouteViewStyleData.TransportPolylineStyleData.YxTransportType.RAILWAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TransportRouteViewStyleData.TransportPolylineStyleData.YxTransportType.SUBURBAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TransportRouteViewStyleData.TransportPolylineStyleData.YxTransportType.TRAM.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[TransportRouteViewStyleData.TransportPolylineStyleData.YxTransportType.TROLLEYBUS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[TransportRouteViewStyleData.TransportPolylineStyleData.YxTransportType.UNDERGROUND.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[TransportRouteViewStyleData.TransportPolylineStyleData.YxTransportType.WATER.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        a = iArr;
    }
}
