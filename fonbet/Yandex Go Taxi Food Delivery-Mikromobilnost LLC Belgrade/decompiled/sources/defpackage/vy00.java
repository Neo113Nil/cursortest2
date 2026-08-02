package defpackage;

import java.util.HashMap;
import java.util.function.Consumer;

/* loaded from: classes6.dex */
public final class vy00 {
    public final kf00 a;

    public vy00(kf00 kf00Var) {
        this.a = kf00Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(String str, Consumer consumer) {
        kz00 kz00Var = new kz00(0);
        consumer.accept(kz00Var);
        int hashCode = str.hashCode();
        kf00 kf00Var = this.a;
        switch (hashCode) {
            case -1336051973:
                if (str.equals("Map.StopPopup.Shown")) {
                    String str2 = kz00Var.a;
                    String str3 = kz00Var.b;
                    String str4 = kz00Var.d;
                    String str5 = kz00Var.c;
                    HashMap A = oyr.A(kf00Var);
                    if (str2 != null) {
                        A.put("mode", str2);
                    }
                    if (str3 != null) {
                        A.put("route_id", str3);
                    }
                    if (str4 != null) {
                        A.put("stop_id", str4);
                    }
                    if (str5 != null) {
                        A.put("vehicle_id", str5);
                    }
                    kf00Var.a.a("Map.StopPopup.Shown", A, 1, new HashMap());
                    break;
                }
                break;
            case 556081222:
                if (str.equals("Map.Stop.Tapped")) {
                    String str6 = kz00Var.a;
                    String str7 = kz00Var.b;
                    String str8 = kz00Var.d;
                    String str9 = kz00Var.c;
                    HashMap A2 = oyr.A(kf00Var);
                    if (str6 != null) {
                        A2.put("mode", str6);
                    }
                    if (str7 != null) {
                        A2.put("route_id", str7);
                    }
                    if (str8 != null) {
                        A2.put("stop_id", str8);
                    }
                    if (str9 != null) {
                        A2.put("vehicle_id", str9);
                    }
                    kf00Var.a.a("Map.Stop.Tapped", A2, 1, new HashMap());
                    break;
                }
                break;
            case 1402695703:
                if (str.equals("Map.Stop.Shown")) {
                    String str10 = kz00Var.a;
                    String str11 = kz00Var.b;
                    String str12 = kz00Var.d;
                    String str13 = kz00Var.c;
                    HashMap A3 = oyr.A(kf00Var);
                    if (str10 != null) {
                        A3.put("mode", str10);
                    }
                    if (str11 != null) {
                        A3.put("route_id", str11);
                    }
                    if (str12 != null) {
                        A3.put("stop_id", str12);
                    }
                    if (str13 != null) {
                        A3.put("vehicle_id", str13);
                    }
                    kf00Var.a.a("Map.Stop.Shown", A3, 1, new HashMap());
                    break;
                }
                break;
            case 1554249186:
                if (str.equals("Map.StopPopup.Tapped")) {
                    String str14 = kz00Var.a;
                    String str15 = kz00Var.b;
                    String str16 = kz00Var.d;
                    String str17 = kz00Var.c;
                    HashMap A4 = oyr.A(kf00Var);
                    if (str14 != null) {
                        A4.put("mode", str14);
                    }
                    if (str15 != null) {
                        A4.put("route_id", str15);
                    }
                    if (str16 != null) {
                        A4.put("stop_id", str16);
                    }
                    if (str17 != null) {
                        A4.put("vehicle_id", str17);
                    }
                    kf00Var.a.a("Map.StopPopup.Tapped", A4, 1, new HashMap());
                    break;
                }
                break;
            case 1717880933:
                if (str.equals("Map.TransportVehicle.Tapped")) {
                    String str18 = kz00Var.a;
                    String str19 = kz00Var.b;
                    String str20 = kz00Var.d;
                    String str21 = kz00Var.c;
                    HashMap A5 = oyr.A(kf00Var);
                    if (str18 != null) {
                        A5.put("mode", str18);
                    }
                    if (str19 != null) {
                        A5.put("route_id", str19);
                    }
                    if (str20 != null) {
                        A5.put("stop_id", str20);
                    }
                    if (str21 != null) {
                        A5.put("vehicle_id", str21);
                    }
                    kf00Var.a.a("Map.TransportVehicle.Tapped", A5, 1, new HashMap());
                    break;
                }
                break;
        }
    }
}
