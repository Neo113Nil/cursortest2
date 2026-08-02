package defpackage;

import com.yandex.go.analytics.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes6.dex */
public final class uex0 {
    public final ubx0 a;
    public final vex0 b;
    public final b c;

    public uex0(ubx0 ubx0Var, vex0 vex0Var, b bVar) {
        this.a = ubx0Var;
        this.b = vex0Var;
        this.c = bVar;
    }

    public final void a(boolean z, String str, Map map, Boolean bool) {
        ArrayList arrayList;
        if (map.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(gw00.e(new Pair((String) entry.getKey(), String.valueOf(((Boolean) entry.getValue()).booleanValue()))));
            }
        }
        vex0 vex0Var = this.b;
        ubx0 ubx0Var = this.a;
        if (z) {
            String analyticsName = vex0Var.a.getAnalyticsName();
            o7r0 o7r0Var = ubx0Var.a;
            o7r0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("source", analyticsName);
            hashMap.put("tariff_class", str);
            if (arrayList != null) {
                hashMap.put("shown_tariffs", arrayList);
            }
            o7r0Var.a.a("TariffCard.Shown", hashMap, 1, g8e.v(hashMap, "has_mastercard_discount", bool));
            return;
        }
        String analyticsName2 = vex0Var.a.getAnalyticsName();
        o7r0 o7r0Var2 = ubx0Var.a;
        o7r0Var2.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("source", analyticsName2);
        hashMap2.put("tariff_class", str);
        if (arrayList != null) {
            hashMap2.put("shown_tariffs", arrayList);
        }
        o7r0Var2.a.a("TariffCard.Closed", hashMap2, 1, g8e.v(hashMap2, "has_mastercard_discount", bool));
    }
}
