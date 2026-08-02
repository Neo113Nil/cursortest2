package com.anythink.core.common.d;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.NoticeUtils;
import com.anythink.core.common.h.ae;
import com.anythink.core.common.v.aj;
import java.util.Map;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13500a = "anythink_notice_handler";

    public static void a(String str, String str2, Map<String, Object> map) {
        try {
            com.anythink.core.common.h.n a9 = a(str, str2);
            if (a9 != null) {
                if (ATSDK.isNetworkLogDebug()) {
                    Log.i(f13500a, "notifyWin, placementId: " + str + ", format: " + str2 + ", extra: " + map);
                }
                if (map != null) {
                    Object obj = map.get("second_price");
                    if (obj instanceof Double) {
                        a9.b(((Double) obj).doubleValue());
                    }
                    Object obj2 = map.get("bidding_name");
                    if (obj2 instanceof String) {
                        a9.b((String) obj2);
                    }
                    Object obj3 = map.get(NoticeUtils.ORIGIN_ILRD);
                    if (obj3 instanceof String) {
                        a9.c((String) obj3);
                    }
                    Object obj4 = map.get("waterfall_info");
                    if (obj4 instanceof String) {
                        com.anythink.core.common.d.a().a(str, (String) obj4);
                    }
                }
                com.anythink.core.common.u.c.a(t.b().g()).a(22, a9);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, String str2, String str3, double d9, Map<String, Object> map) {
        try {
            com.anythink.core.common.h.n a9 = a(str, str2);
            if (a9 != null) {
                if (ATSDK.isNetworkLogDebug()) {
                    Log.i(f13500a, "notifyLoss, placementId: " + str + ", format: " + str2 + ", lossCode: " + str3 + ", winnerPrice: " + d9 + ", extra: " + map);
                }
                if (map != null) {
                    a9.a(d9);
                    try {
                        a9.c(Integer.parseInt(str3));
                    } catch (Throwable unused) {
                    }
                    Object obj = map.get("bidding_name");
                    if (obj instanceof String) {
                        a9.a((String) obj);
                    }
                    Object obj2 = map.get(NoticeUtils.ORIGIN_ILRD);
                    if (obj2 instanceof String) {
                        a9.c((String) obj2);
                    }
                    Object obj3 = map.get("waterfall_info");
                    if (obj3 instanceof String) {
                        com.anythink.core.common.d.a().a(str, (String) obj3);
                    }
                }
                com.anythink.core.common.u.c.a(t.b().g()).a(23, a9);
            }
            com.anythink.core.common.f a10 = com.anythink.core.common.f.a(t.b().g(), str, str2);
            if (a10 != null) {
                a10.d();
            }
        } catch (Throwable unused2) {
        }
    }

    private static com.anythink.core.common.h.n a(String str, String str2) {
        if (!t.b().f13533d) {
            Log.e(f13500a, "SDK should be inited first!");
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            Log.e(f13500a, "Please put placementId!");
            return null;
        }
        com.anythink.core.common.f a9 = com.anythink.core.common.u.a().a(str, str2);
        if (a9 == null) {
            Log.e(f13500a, "The \"" + str + "\" object has not been created yet!");
            return null;
        }
        Context g9 = t.b().g();
        com.anythink.core.common.h.c a10 = a9.a(g9, false, false, (ae) null);
        if (a10 != null) {
            return a10.i().af();
        }
        com.anythink.core.d.l a11 = com.anythink.core.d.n.a(g9).a(str);
        String h3 = a9.h();
        if (TextUtils.isEmpty(h3)) {
            h3 = "";
        }
        com.anythink.core.common.h.n a12 = aj.a(h3, str, a11, 0, 0, null, null, 0, a9.i());
        if (a11 == null) {
            a12.K(str2);
        }
        return a12;
    }
}
