package com.anythink.core.b.d;

import D.y;
import android.text.TextUtils;
import com.anythink.basead.exoplayer.f.f;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBiddingNotice;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.ac;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.aw;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.cd;
import com.anythink.core.common.v.ah;
import com.anythink.core.common.v.k;
import com.anythink.core.common.v.p;
import com.anythink.core.common.v.q;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import u1.h;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    static final String f11739a = "a";

    private static int a(boolean z3, int i, int i6) {
        return i == i6 ? !z3 ? 1 : 4 : (i == 67 || i == 35) ? 3 : 2;
    }

    private static int b(boolean z3, int i, int i6) {
        return i == i6 ? !z3 ? 1 : 2 : (i == 67 || i == 35) ? 3 : 4;
    }

    private static void a(Map<String, Object> map, int i, int i6, bv bvVar) {
        com.anythink.core.d.b g4 = y.g(y.h());
        if (g4 == null || g4.c() == null || !g4.c().contains(Integer.valueOf(i)) || i6 == 8) {
            return;
        }
        map.put(ATBiddingNotice.ADN_EXTRA_NW_FIRM_ID, Integer.valueOf(i6));
        if (bvVar != null) {
            map.put(ATBiddingNotice.ADN_EXTRA_NATIVE_MATERIAL_INFO, bvVar.aX());
        }
    }

    private static String b(ad adVar, double d2) {
        String a9 = a(adVar, d2);
        try {
            return String.valueOf((int) Math.round(Double.parseDouble(a9)));
        } catch (Throwable unused) {
            return a9;
        }
    }

    private static String b(int i) {
        if (i == 8) {
            return k.b("LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUZ3d0RRWUpLb1pJaHZjTkFRRUJCUUFEU3dBd1NBSkJBTGpNVCt3QTZEdVViaGZvYTZ5MDQ4czVNWFcrOEY2bgpxNkxzb2FaMWNDdVJ0MDhLU0ZoZ3kwYmp3dWpLVkxLeW1nUVJRUWFGUkhFamF2aTNXd28vUG9jQ0F3RUFBUT09Ci0tLS0tRU5EIFBVQkxJQyBLRVktLS0tLQ==");
        }
        return "";
    }

    public static String a(ad adVar, cd cdVar, double d2, double d9) {
        String str = adVar.winNoticeUrl;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int i = adVar.f13422d;
        String replace = str.replace(c.f11755f, a(adVar, d9));
        if (i == 28 || i == 8 || i == 81 || i == 11) {
            return replace.replace(c.f11751b, a(adVar, d2));
        }
        if (i == 66) {
            return a(replace, a(adVar, cdVar, d9));
        }
        return i == 39 ? replace.replace(c.f11757h, String.valueOf(d9)).replace(c.f11756g, a(adVar.f13420b)) : replace;
    }

    public static String a(ad adVar, aw awVar, int i, boolean z3, double d2, double d9, String str, Map<String, Object> map) {
        String replace;
        double max;
        bv A9;
        int i6 = adVar.f13422d;
        String str2 = adVar.loseNoticeUrl;
        if (TextUtils.isEmpty(str2)) {
            if (awVar != null) {
                String C8 = awVar.C();
                String i9 = awVar.i();
                if (i6 == 8) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(ah.a("kwwsv=22zlq1jgw1tt1frp2zlqbqrwlfh1ifj"));
                    sb.append("?viewid=&position_id=");
                    sb.append(C8);
                    sb.append("&loss=${AUCTION_LOSS}&win_price=${AUCTION_PRICE}&server_bidding_type=1&win_seat=${AUCTION_SEAT_ID}&mrqid=");
                    str2 = h.g(sb, i9, "&meSrc=299");
                } else {
                    str2 = "";
                }
            }
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
        }
        String replace2 = str2.replace(c.f11751b, a(adVar, d2)).replace(c.f11752c, b(adVar, d2)).replace(c.f11753d, str);
        if (i6 == 8) {
            replace = replace2.replace(c.f11754e, String.valueOf(i == i6 ? !z3 ? 1 : 4 : (i == 67 || i == 35) ? 3 : 2));
        } else if (i6 == 29) {
            replace = replace2.replace(c.f11754e, i6 == i ? "1" : "10001");
        } else {
            replace = replace2.replace(c.f11754e, "");
        }
        if (i6 == 6) {
            replace = replace.replace(c.f11756g, ATAdConst.CURRENCY.USD.toString());
        } else if (i6 == 39) {
            replace = replace.replace(c.f11753d, str).replace(c.f11756g, a(adVar.f13420b));
        }
        if (i6 == 66) {
            replace = a(replace, a(adVar, awVar, d2, str));
        }
        if (i6 == 28 && map != null) {
            replace = a(replace, map, adVar, d2);
        }
        if (i6 != 65) {
            return replace;
        }
        bv a9 = c.a(adVar);
        if (a9 != null) {
            max = Math.max(d9, p.a(a9));
        } else {
            max = (awVar == null || (A9 = awVar.A()) == null || A9.ar() <= 0.0d) ? d9 : Math.max(d9, A9.ar());
        }
        if (max == 0.0d) {
            return replace;
        }
        double d10 = 0.01d + max;
        if (d10 < d2) {
            max = d10;
        }
        return replace.replace(c.f11755f, String.valueOf(max));
    }

    private static String a(String str, Map<String, Object> map, ad adVar, double d2) {
        try {
            String a9 = a(adVar, d2);
            String replace = str.replace(c.f11767s, a9).replace(c.f11768t, a9);
            int a10 = q.a(map, ATBiddingNotice.ADN_ID, -1);
            int i = 1;
            if (a10 != 1 && a10 != 2) {
                i = 3;
                if (a10 == 3 || a10 == 4) {
                    i = 2;
                }
            }
            String replace2 = replace.replace(c.f11760l, String.valueOf(i));
            String str2 = "other";
            int a11 = q.a(map, ATBiddingNotice.ADN_EXTRA_NW_FIRM_ID, 0);
            if (a11 > 0) {
                if (a11 == 15) {
                    str2 = "chuanshanjia";
                } else if (a11 == 22) {
                    str2 = "baidu";
                }
            }
            String replace3 = replace2.replace(c.f11761m, str2);
            Object obj = map.get(ATBiddingNotice.ADN_EXTRA_NATIVE_MATERIAL_INFO);
            if (obj != null) {
                try {
                    String a12 = q.a((Map<String, Object>) obj, j.w.f12604A, "");
                    if (!TextUtils.isEmpty(a12)) {
                        replace3 = replace3.replace(c.f11763o, a12);
                    }
                    String a13 = q.a((Map<String, Object>) obj, j.w.f12605B, "");
                    if (!TextUtils.isEmpty(a13)) {
                        replace3 = replace3.replace(c.f11762n, a13);
                    }
                } catch (Throwable unused) {
                }
            }
            String a14 = q.a(map, ATBiddingNotice.ADN_REQUEST_ID, "");
            if (!TextUtils.isEmpty(a14)) {
                replace3 = replace3.replace(c.f11764p, a14);
            }
            return replace3.replace(c.f11765q, String.valueOf(q.a(map, ATBiddingNotice.ADN_REQUEST_IS_SHOW, 2))).replace(c.f11766r, String.valueOf(q.a(map, ATBiddingNotice.ADN_REQUEST_IS_CLICK, 2)));
        } catch (Exception unused2) {
            return str;
        }
    }

    public static String a(ad adVar, double d2) {
        int i = adVar.f13422d;
        if (i == 8 || i == 28) {
            return a(i, String.valueOf((int) Math.round(d2)));
        }
        if (i == 66 && adVar.j() > 0.0d) {
            return String.valueOf(d2 / adVar.j());
        }
        return String.valueOf(d2);
    }

    public static String a(boolean z3, int i, int i6, boolean z6) {
        if (i == 3) {
            return "-1";
        }
        if (i6 == 8) {
            if (i != 1) {
                return "1";
            }
            return "5";
        }
        if (i6 == 29) {
            if (i != 1) {
                return "2";
            }
            return ErrorCode.adapterNotExistError;
        }
        if (i6 == 34) {
            if (i == 2) {
                return "102";
            }
            return ErrorCode.networkError;
        }
        if (i6 == 59) {
            return "102";
        }
        if (i6 == 39) {
            if (i != 6) {
                return "102";
            }
            return "103";
        }
        if (z6) {
            return "103";
        }
        if (i == 1) {
            return "2";
        }
        if (i == 5) {
            return "1";
        }
        if (z3) {
            return "102";
        }
        return "103";
    }

    private static String a(int i) {
        if (i == 2) {
            return "102";
        }
        return ErrorCode.networkError;
    }

    public static String a(boolean z3, int i) {
        if (i == 3) {
            return "-1";
        }
        if (i == 1) {
            return "5";
        }
        if (i == 4) {
            return "2";
        }
        if (i == 6) {
            return ATAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_FLOOR;
        }
        return z3 ? "102" : "103";
    }

    public static Map<String, Object> a(boolean z3, int i, int i6, bv bvVar, ad adVar) {
        int i9 = 2;
        HashMap hashMap = new HashMap(2);
        if (i != i6) {
            i9 = (i == 67 || i == 35) ? 3 : 4;
        } else if (!z3) {
            i9 = 1;
        }
        hashMap.put(ATBiddingNotice.ADN_ID, Integer.valueOf(i9));
        a(hashMap, adVar);
        a(hashMap, i6, i, bvVar);
        return hashMap;
    }

    private static void a(Map<String, Object> map, ad adVar) {
        if (adVar != null) {
            try {
                String originRequestId = adVar.getOriginRequestId();
                if (TextUtils.isEmpty(originRequestId)) {
                    return;
                }
                map.put(ATBiddingNotice.ADN_REQUEST_ID, originRequestId);
                List<ac> list = adVar.f13438u;
                if (list == null || list.isEmpty()) {
                    return;
                }
                for (int i = 0; i < list.size(); i++) {
                    ac acVar = list.get(i);
                    if (acVar != null && acVar.c().equals(originRequestId)) {
                        map.put(ATBiddingNotice.ADN_REQUEST_IS_SHOW, Integer.valueOf(acVar.f() ? 1 : 0));
                        map.put(ATBiddingNotice.ADN_REQUEST_IS_CLICK, Integer.valueOf(acVar.g() ? 1 : 0));
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public static Map<String, Object> a(int i, bv bvVar) {
        HashMap hashMap = new HashMap(2);
        if (bvVar != null) {
            int g4 = bvVar.g();
            f.y(g4 == i ? 5 : 6, hashMap, ATBiddingNotice.ADN_ID, bvVar.o() ? 101 : 100, ATBiddingNotice.ADN_TYPE);
            a(hashMap, i, g4, bvVar);
        }
        return hashMap;
    }

    public static Map<String, Object> a(ad adVar, cd cdVar, double d2) {
        HashMap hashMap = new HashMap();
        hashMap.put(c.f11755f, a(adVar, d2));
        String b9 = cdVar.b();
        if (!TextUtils.isEmpty(b9)) {
            hashMap.put(c.i, b9);
            return hashMap;
        }
        hashMap.put(c.i, "");
        return hashMap;
    }

    public static Map<String, Object> a(ad adVar, aw awVar, double d2, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(c.f11751b, a(adVar, d2));
        hashMap.put(c.f11752c, b(adVar, d2));
        hashMap.put(c.f11753d, str);
        String d9 = awVar.d();
        if (!TextUtils.isEmpty(d9)) {
            hashMap.put(c.i, d9);
        } else {
            hashMap.put(c.i, "");
        }
        hashMap.put(c.f11758j, TextUtils.equals(str, "1") ? "900" : TextUtils.equals(str, "2") ? "203" : (TextUtils.equals(str, "102") || TextUtils.equals(str, "103")) ? "203" : "900");
        hashMap.put(c.f11759k, Long.valueOf(System.currentTimeMillis() / 1000));
        return hashMap;
    }

    private static String a(String str, Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                str = str.replace(entry.getKey(), entry.getValue().toString());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return str;
    }

    private static String a(String str) {
        if (ATAdConst.CURRENCY.RMB.toString().equalsIgnoreCase(str)) {
            return j.C0076j.f12486b;
        }
        return j.C0076j.f12485a;
    }

    public static String a(int i, String str) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (i == 8) {
            str2 = k.b("LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUZ3d0RRWUpLb1pJaHZjTkFRRUJCUUFEU3dBd1NBSkJBTGpNVCt3QTZEdVViaGZvYTZ5MDQ4czVNWFcrOEY2bgpxNkxzb2FaMWNDdVJ0MDhLU0ZoZ3kwYmp3dWpLVkxLeW1nUVJRUWFGUkhFamF2aTNXd28vUG9jQ0F3RUFBUT09Ci0tLS0tRU5EIFBVQkxJQyBLRVktLS0tLQ==");
        } else {
            str2 = "";
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        try {
            str3 = URLEncoder.encode(com.anythink.core.common.q.a.a(str2, str, false).a());
        } catch (Throwable unused) {
            str3 = null;
        }
        return !TextUtils.isEmpty(str3) ? str3 : str;
    }

    private static String a(int i, String str, String str2) {
        if (i == 8) {
            StringBuilder sb = new StringBuilder();
            sb.append(ah.a("kwwsv=22zlq1jgw1tt1frp2zlqbqrwlfh1ifj"));
            sb.append("?viewid=&position_id=");
            sb.append(str);
            sb.append("&loss=${AUCTION_LOSS}&win_price=${AUCTION_PRICE}&server_bidding_type=1&win_seat=${AUCTION_SEAT_ID}&mrqid=");
            return h.g(sb, str2, "&meSrc=299");
        }
        return "";
    }
}
