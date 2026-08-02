package defpackage;

import com.yandex.go.navigator.alt_select.traffic.TrafficLevel;

/* loaded from: classes12.dex */
public abstract class trb1 implements e950 {
    public static final int a(int i) {
        switch (i) {
            case 0:
                return v2h0.traffic_level_0_48;
            case 1:
                return v2h0.traffic_level_1_48;
            case 2:
                return v2h0.traffic_level_2_48;
            case 3:
                return v2h0.traffic_level_3_48;
            case 4:
                return v2h0.traffic_level_4_48;
            case 5:
                return v2h0.traffic_level_5_48;
            case 6:
                return v2h0.traffic_level_6_48;
            case 7:
                return v2h0.traffic_level_7_48;
            case 8:
                return v2h0.traffic_level_8_48;
            case 9:
                return v2h0.traffic_level_9_48;
            case 10:
                return v2h0.traffic_level_10_48;
            default:
                return v2h0.traffic_level_0_48;
        }
    }

    public static final int b(TrafficLevel trafficLevel) {
        int i = u901.a[trafficLevel.ordinal()];
        if (i == 1) {
            return vog0.traffic_free;
        }
        if (i == 2) {
            return vog0.traffic_light;
        }
        if (i == 3) {
            return vog0.traffic_hard;
        }
        w511.b();
        return 0;
    }

    public static final int c(TrafficLevel trafficLevel) {
        int i = u901.a[trafficLevel.ordinal()];
        if (i == 1) {
            return mqg0.white;
        }
        if (i == 2) {
            return mqg0.black;
        }
        if (i == 3) {
            return mqg0.white;
        }
        w511.b();
        return 0;
    }
}
