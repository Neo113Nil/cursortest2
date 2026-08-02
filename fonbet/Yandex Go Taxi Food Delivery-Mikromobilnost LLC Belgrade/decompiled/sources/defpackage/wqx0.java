package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class wqx0 implements vfd0 {
    public final gio a;

    public wqx0(gio gioVar) {
        this.a = gioVar;
    }

    public final void e(int i, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        if (str4 == null) {
            str4 = "no_value";
        }
        if (str5 == null) {
            str5 = "no_value";
        }
        if (str6 == null) {
            str6 = "no_value";
        }
        gio gioVar = this.a;
        gioVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("session_id", str);
        linkedHashMap.put("place", str4);
        linkedHashMap.put("offers_batch_id", str2);
        linkedHashMap.put("offers_position_id", str3);
        linkedHashMap.put("position", String.valueOf(i));
        linkedHashMap.put(Constants.KEY_PAGE, str5);
        linkedHashMap.put("from", str6);
        linkedHashMap.put("url", "no_value");
        linkedHashMap.put("custom_parameters", map);
        linkedHashMap.put("_meta", gio.a(new HashMap()));
        gioVar.e("PlusPayment.Offer.Click", linkedHashMap);
    }

    public final void f(int i, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        if (str4 == null) {
            str4 = "no_value";
        }
        if (str5 == null) {
            str5 = "no_value";
        }
        if (str6 == null) {
            str6 = "no_value";
        }
        gio gioVar = this.a;
        gioVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("session_id", str);
        linkedHashMap.put("offers_batch_id", str2);
        linkedHashMap.put("offers_position_id", str3);
        linkedHashMap.put("position", String.valueOf(i));
        linkedHashMap.put(Constants.KEY_PAGE, str5);
        linkedHashMap.put("place", str4);
        linkedHashMap.put("from", str6);
        linkedHashMap.put("url", "no_value");
        linkedHashMap.put("custom_parameters", map);
        linkedHashMap.put("_meta", gio.a(new HashMap()));
        gioVar.e("PlusPayment.Offer.Show", linkedHashMap);
    }
}
