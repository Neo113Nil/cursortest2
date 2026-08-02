package defpackage;

import ru.yandex.taxi.persuggest.domain.model.CoordinateProvider$Source;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class zne {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CoordinateProvider$Source.values().length];
        try {
            iArr[CoordinateProvider$Source.GPS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CoordinateProvider$Source.LBS_WIFI.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CoordinateProvider$Source.LBS_GSM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CoordinateProvider$Source.LBS_IP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CoordinateProvider$Source.LBS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[CoordinateProvider$Source.MAPKIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[CoordinateProvider$Source.PLATFORM_LBS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[CoordinateProvider$Source.FUSED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[CoordinateProvider$Source.ZERO_KM.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[CoordinateProvider$Source.RIDETECH_LOCATION_SDK.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[CoordinateProvider$Source.RIDETECH_LOCATION_SDK_LAST_LOCATION.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[CoordinateProvider$Source.UNKNOWN.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        a = iArr;
    }
}
