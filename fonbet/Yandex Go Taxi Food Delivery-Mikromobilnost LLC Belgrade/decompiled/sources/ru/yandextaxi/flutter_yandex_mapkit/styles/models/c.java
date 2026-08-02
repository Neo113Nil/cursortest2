package ru.yandextaxi.flutter_yandex_mapkit.styles.models;

import ru.yandextaxi.flutter_yandex_mapkit.styles.models.TransportRouteViewStyleData;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransportRouteViewStyleData.FitnessPolylineStyleData.TrafficTypeID.values().length];
        try {
            iArr[TransportRouteViewStyleData.FitnessPolylineStyleData.TrafficTypeID.OTHER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransportRouteViewStyleData.FitnessPolylineStyleData.TrafficTypeID.PEDESTRIAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransportRouteViewStyleData.FitnessPolylineStyleData.TrafficTypeID.BICYCLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TransportRouteViewStyleData.FitnessPolylineStyleData.TrafficTypeID.AUTO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
