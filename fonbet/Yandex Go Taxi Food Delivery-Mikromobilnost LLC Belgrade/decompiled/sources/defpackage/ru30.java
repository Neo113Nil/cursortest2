package defpackage;

import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;
import ru.yandex.taxi.masstransit.model.MtTransportSystemId;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class ru30 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[MtTransportType.values().length];
        try {
            iArr[MtTransportType.BUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MtTransportType.METROBUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MtTransportType.AEROEXPRESS_BUS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MtTransportType.DOLMUS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MtTransportType.MINIBUS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[MtTransportType.TROLLEYBUS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[MtTransportType.TRAMWAY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[MtTransportType.RAPID_TRAM.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[MtTransportType.DUBAI_TRAM.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[MtTransportType.HISTORIC_TRAM.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[MtTransportType.UNDERGROUND.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[MtTransportType.RAILWAY.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[MtTransportType.SUBURBAN.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[MtTransportType.SUBURBAN_EXPRESS.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[MtTransportType.MCD.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[MtTransportType.SBAHN.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[MtTransportType.AEROEXPRESS.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[MtTransportType.FERRY.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[MtTransportType.WATER.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[MtTransportType.FUNICULAR.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[MtTransportType.CABLE.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[MtTransportType.AERO.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[MtTransportType.UNKNOWN.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        a = iArr;
        int[] iArr2 = new int[MtTransportSystemId.values().length];
        try {
            iArr2[MtTransportSystemId.MOSCOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[MtTransportSystemId.SAINT_PETERSBURG.ordinal()] = 2;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[MtTransportSystemId.EKATERINBURG.ordinal()] = 3;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[MtTransportSystemId.NIZHNY_NOVGOROD.ordinal()] = 4;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[MtTransportSystemId.SAMARA.ordinal()] = 5;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[MtTransportSystemId.KAZAN.ordinal()] = 6;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[MtTransportSystemId.NOVOSIBIRSK.ordinal()] = 7;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[MtTransportSystemId.KIEV.ordinal()] = 8;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr2[MtTransportSystemId.MINSK.ordinal()] = 9;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr2[MtTransportSystemId.ALMATY.ordinal()] = 10;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr2[MtTransportSystemId.DUBAI_UNDERGROUND.ordinal()] = 11;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr2[MtTransportSystemId.DUBAI_MONORAIL.ordinal()] = 12;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr2[MtTransportSystemId.DUBAI_TRAM.ordinal()] = 13;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr2[MtTransportSystemId.UNKNOWN.ordinal()] = 14;
        } catch (NoSuchFieldError unused37) {
        }
        b = iArr2;
    }
}
