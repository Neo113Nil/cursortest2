package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Set;
import ru.yandex.taxi.common_models.net.map_object.Trigger;
import ru.yandex.taxi.common_models.net.map_object.r0;
import ru.yandex.taxi.preorder.source.pickup.PickupPointAnalytics$PointType;

/* loaded from: classes5.dex */
public final class ypb0 {
    public static final Set e = j73.f0(new String[]{"drag", "label_tap", "tap"});
    public final pj a;
    public final u8w b;
    public final x770 c;
    public final xsv0 d;

    public ypb0(pj pjVar, u8w u8wVar, x770 x770Var, xsv0 xsv0Var) {
        this.a = pjVar;
        this.b = u8wVar;
        this.c = x770Var;
        this.d = xsv0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(wpb0 wpb0Var, PickupPointAnalytics$PointType pickupPointAnalytics$PointType, String str) {
        String str2;
        int hashCode;
        if (!e.contains(str)) {
            return;
        }
        String analyticsName = pickupPointAnalytics$PointType.getAnalyticsName();
        uud0 b = wpb0Var.b(Trigger.TAP);
        String str3 = wpb0Var.a;
        String str4 = null;
        r0 e2 = b != null ? b.e() : null;
        if (e2 != null) {
            Uri parse = Uri.parse(e2.a);
            if (mfi.l.e(parse) != null) {
                this.d.getClass();
                wsv0 a = xsv0.a(parse);
                str2 = a.c;
                h1p h1pVar = a.a;
                if (h1pVar != null) {
                    String value = h1pVar.getValue();
                    if (!"drag".equals(str)) {
                        analyticsName = h1pVar.getValue();
                    }
                    if (str2 == null || evu0.J(str2)) {
                        str2 = null;
                    }
                    str4 = value;
                    hashCode = str.hashCode();
                    if (hashCode != -607398952) {
                        if (str.equals("label_tap")) {
                            x770 x770Var = this.c;
                            x770Var.getClass();
                            HashMap hashMap = new HashMap();
                            if (str3 != null) {
                                hashMap.put("pickup_point_id", str3);
                            }
                            if (analyticsName != null) {
                                hashMap.put("type", analyticsName);
                            }
                            if (str4 != null) {
                                hashMap.put("superappmode", str4);
                            }
                            if (str2 != null) {
                                hashMap.put("id_superappmode", str2);
                            }
                            x770Var.a.a("PickupPointsTapOnPickupPointLabel", hashMap, 1, new HashMap());
                            return;
                        }
                        return;
                    }
                    if (hashCode == 114595) {
                        if (str.equals("tap")) {
                            u8w u8wVar = this.b;
                            u8wVar.getClass();
                            HashMap hashMap2 = new HashMap();
                            if (str3 != null) {
                                hashMap2.put("pickup_point_id", str3);
                            }
                            if (analyticsName != null) {
                                hashMap2.put("type", analyticsName);
                            }
                            if (str4 != null) {
                                hashMap2.put("superappmode", str4);
                            }
                            if (str2 != null) {
                                hashMap2.put("id_superappmode", str2);
                            }
                            u8wVar.a.a("PickupPointsTapOnPickupPoint", hashMap2, 1, new HashMap());
                            return;
                        }
                        return;
                    }
                    if (hashCode == 3091764 && str.equals("drag")) {
                        pj pjVar = this.a;
                        pjVar.getClass();
                        HashMap hashMap3 = new HashMap();
                        if (str3 != null) {
                            hashMap3.put("pickup_point_id", str3);
                        }
                        if (analyticsName != null) {
                            hashMap3.put("type", analyticsName);
                        }
                        if (str4 != null) {
                            hashMap3.put("superappmode", str4);
                        }
                        if (str2 != null) {
                            hashMap3.put("id_superappmode", str2);
                        }
                        pjVar.a.a("AddressSelectionUserTouchDownPin", hashMap3, 1, new HashMap());
                        return;
                    }
                    return;
                }
            }
        }
        str2 = null;
        hashCode = str.hashCode();
        if (hashCode != -607398952) {
        }
    }
}
