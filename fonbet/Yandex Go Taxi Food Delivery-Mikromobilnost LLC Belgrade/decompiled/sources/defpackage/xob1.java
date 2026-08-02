package defpackage;

import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;
import ru.yandex.taxi.masstransit.model.MtTransportSystemId;

/* loaded from: classes6.dex */
public abstract class xob1 {
    public static au2 a;
    public static mgv b;

    public static final gdc a(MtTransportType mtTransportType) {
        switch (ru30.a[mtTransportType.ordinal()]) {
            case 1:
            case 2:
                return new gdc(tog0.mt_bus_color);
            case 3:
            case 17:
                return new gdc(tog0.mt_aeroexpress_color);
            case 4:
            case 5:
                return new gdc(tog0.mt_minibus_color);
            case 6:
                return new gdc(tog0.mt_trolley_color);
            case 7:
            case 8:
                return new gdc(tog0.mt_tram_color);
            case 9:
                return new gdc(tog0.mt_uae_tram_color);
            case 10:
            case 11:
            case 16:
            case 20:
            case 21:
            case 22:
            case 23:
                return new gdc(tog0.mt_fallback_color);
            case 12:
            case 13:
            case 14:
            case 15:
                return new gdc(tog0.mt_train_color);
            case 18:
            case 19:
                return new gdc(tog0.mt_ship_color);
            default:
                w511.b();
                return null;
        }
    }

    public static final int b(MtTransportType mtTransportType) {
        switch (ru30.a[mtTransportType.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return q2h0.ic_bus_16;
            case 4:
            case 5:
                return q2h0.ic_minibus_16;
            case 6:
                return q2h0.ic_trolley_16;
            case 7:
            case 8:
                return q2h0.ic_tram_16;
            case 9:
                return q2h0.ic_uae_tram_16;
            case 10:
                return q2h0.ic_historical_tram_16;
            case 11:
                return q2h0.ic_subway_16;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return q2h0.ic_train_16;
            case 17:
                return q2h0.ic_aeroexpress_16;
            case 18:
            case 19:
                return q2h0.ic_ship_16;
            case 20:
                return q2h0.ic_funicular_16;
            case 21:
                return q2h0.ic_cableway_16;
            case 22:
                return q2h0.ic_aero_16;
            case 23:
                return q2h0.ic_unknown_16;
            default:
                w511.b();
                return 0;
        }
    }

    public static final Integer c(MtTransportSystemId mtTransportSystemId) {
        switch (ru30.b[mtTransportSystemId.ordinal()]) {
            case 1:
                return Integer.valueOf(q2h0.ic_subway_msk_16);
            case 2:
                return Integer.valueOf(q2h0.ic_subway_spb_16);
            case 3:
                return Integer.valueOf(q2h0.ic_subway_ekb_16);
            case 4:
                return Integer.valueOf(q2h0.ic_subway_nn_16);
            case 5:
                return Integer.valueOf(q2h0.ic_subway_samara_16);
            case 6:
                return Integer.valueOf(q2h0.ic_subway_kazan_16);
            case 7:
                return Integer.valueOf(q2h0.ic_subway_nsk_16);
            case 8:
                return Integer.valueOf(q2h0.ic_subway_kiev_16);
            case 9:
                return Integer.valueOf(q2h0.ic_subway_minsk_16);
            case 10:
                return Integer.valueOf(q2h0.ic_subway_almaty_16);
            case 11:
                return Integer.valueOf(q2h0.ic_subway_ae_metro_16);
            case 12:
                return Integer.valueOf(q2h0.ic_uae_monorail_16);
            case 13:
                return Integer.valueOf(q2h0.ic_uae_tram_16);
            default:
                w511.b();
            case 14:
                return null;
        }
    }

    public static final int d(MtTransportType mtTransportType) {
        switch (ru30.a[mtTransportType.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return q2h0.ic_bus_24;
            case 4:
            case 5:
                return q2h0.ic_minibus_24;
            case 6:
                return q2h0.ic_trolley_24;
            case 7:
            case 8:
                return q2h0.ic_tram_24;
            case 9:
                return q2h0.ic_uae_tram_24;
            case 10:
                return q2h0.ic_historical_tram_24;
            case 11:
                return q2h0.ic_subway_24;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return q2h0.ic_train_24;
            case 17:
                return q2h0.ic_aeroexpress_24;
            case 18:
            case 19:
                return q2h0.ic_ship_24;
            case 20:
                return q2h0.ic_funicular_24;
            case 21:
                return q2h0.ic_cableway_24;
            case 22:
                return q2h0.ic_aero_24;
            case 23:
                return q2h0.ic_unknown_24;
            default:
                w511.b();
                return 0;
        }
    }

    public static final int e(MtTransportType mtTransportType) {
        switch (ru30.a[mtTransportType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return q2h0.ic_bus_stop_selected;
            case 7:
            case 8:
            case 9:
            case 10:
                return q2h0.ic_tram_stop_selected;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return q2h0.ic_train_stop_selected;
            case 18:
            case 19:
                return q2h0.ic_water_stop_selected;
            case 20:
            case 21:
                return q2h0.ic_cable_stop_selected;
            case 22:
            case 23:
                return d(mtTransportType);
            default:
                w511.b();
                return 0;
        }
    }

    public static final int f(MtTransportType mtTransportType, boolean z) {
        Integer valueOf;
        if (!z) {
            return d(mtTransportType);
        }
        switch (ru30.a[mtTransportType.ordinal()]) {
            case 1:
            case 2:
            case 3:
                valueOf = Integer.valueOf(q2h0.ic_bus_24_v2);
                break;
            case 4:
            case 5:
                valueOf = Integer.valueOf(q2h0.ic_minibus_24_v2);
                break;
            case 6:
                valueOf = Integer.valueOf(q2h0.ic_trolley_24_v2);
                break;
            case 7:
            case 8:
                valueOf = Integer.valueOf(q2h0.ic_tram_24_v2);
                break;
            case 9:
                valueOf = Integer.valueOf(q2h0.ic_uae_tram_24_v2);
                break;
            case 10:
                valueOf = Integer.valueOf(q2h0.ic_historical_tram_24_v2);
                break;
            case 11:
                valueOf = Integer.valueOf(q2h0.ic_subway_24_v2);
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                valueOf = Integer.valueOf(q2h0.ic_train_24_v2);
                break;
            case 17:
                valueOf = Integer.valueOf(q2h0.ic_aeroexpress_24);
                break;
            case 18:
            case 19:
                valueOf = Integer.valueOf(q2h0.ic_ship_24);
                break;
            case 20:
                valueOf = Integer.valueOf(q2h0.ic_funicular_24);
                break;
            case 21:
                valueOf = Integer.valueOf(q2h0.ic_cableway_24);
                break;
            case 22:
                valueOf = Integer.valueOf(q2h0.ic_aero_24_v2);
                break;
            case 23:
                valueOf = Integer.valueOf(q2h0.ic_unknown_24_v2);
                break;
            default:
                w511.b();
                return 0;
        }
        return valueOf.intValue();
    }
}
