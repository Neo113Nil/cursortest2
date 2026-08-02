package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes.dex */
public final class yxe0 {
    public final pho a;

    public yxe0(pho phoVar) {
        this.a = phoVar;
    }

    public static void a(yxe0 yxe0Var, String str, String str2, ArrayList arrayList, ArrayList arrayList2, int i) {
        String str3 = (i & 1) != 0 ? null : "list_preview_card";
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            arrayList = null;
        }
        if ((i & 16) != 0) {
            arrayList2 = null;
        }
        yxe0Var.getClass();
        HashMap hashMap = new HashMap();
        if (str3 != null) {
            hashMap.put("element_state", str3);
        }
        if (str != null) {
            hashMap.put("screen_type", str);
        }
        if (str2 != null) {
            hashMap.put("open_reason", str2);
        }
        if (arrayList != null) {
            hashMap.put(ClidProvider.STATE, arrayList);
        }
        if (arrayList2 != null) {
            hashMap.put("widgets", arrayList2);
        }
        yxe0Var.a.a("PreviewOrderList.Shown", hashMap, 1, new HashMap());
    }

    public static void b(yxe0 yxe0Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, String str8, String str9, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        String str10 = (i & 4) != 0 ? null : "preview_card";
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            str6 = null;
        }
        if ((i & 128) != 0) {
            str7 = null;
        }
        if ((i & 256) != 0) {
            map = null;
        }
        if ((i & 512) != 0) {
            str8 = null;
        }
        if ((i & 1024) != 0) {
            str9 = null;
        }
        yxe0Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("delivery_metrics", str);
        }
        if (str2 != null) {
            hashMap.put("button_name", str2);
        }
        if (str10 != null) {
            hashMap.put("element_state", str10);
        }
        if (str3 != null) {
            hashMap.put("open_reason", str3);
        }
        if (str4 != null) {
            hashMap.put("order_id", str4);
        }
        if (str5 != null) {
            hashMap.put(Constants.KEY_SERVICE, str5);
        }
        if (str6 != null) {
            hashMap.put("screen_type", str6);
        }
        if (str7 != null) {
            hashMap.put(ClidProvider.STATE, str7);
        }
        if (map != null) {
            hashMap.put("widget", map);
        }
        if (str8 != null) {
            hashMap.put("widget_id", str8);
        }
        if (str9 != null) {
            hashMap.put("widget_type", str9);
        }
        yxe0Var.a.a("PreviewOrderList.Tapped", hashMap, 1, new HashMap());
    }
}
