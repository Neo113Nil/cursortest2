package com.anythink.core.b.d;

import android.text.TextUtils;
import com.IceFishing.LiveIceFishing.k;
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
import com.anythink.core.common.v.p;
import com.anythink.core.common.v.q;
import com.google.android.gms.internal.ads.Wv;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    static final String f12525a = "a";

    private static int a(boolean z6, int i, int i4) {
        return i == i4 ? !z6 ? 1 : 4 : (i == 67 || i == 35) ? 3 : 2;
    }

    private static int b(boolean z6, int i, int i4) {
        return i == i4 ? !z6 ? 1 : 2 : (i == 67 || i == 35) ? 3 : 4;
    }

    private static void a(Map<String, Object> map, int i, int i4, bv bvVar) {
        com.anythink.core.d.b k9 = k.k(k.l());
        if (k9 == null || k9.c() == null || !k9.c().contains(Integer.valueOf(i)) || i4 == 8) {
            return;
        }
        map.put(ATBiddingNotice.ADN_EXTRA_NW_FIRM_ID, Integer.valueOf(i4));
        if (bvVar != null) {
            map.put(ATBiddingNotice.ADN_EXTRA_NATIVE_MATERIAL_INFO, bvVar.aX());
        }
    }

    private static String b(ad adVar, double d9) {
        String a9 = a(adVar, d9);
        try {
            return String.valueOf((int) Math.round(Double.parseDouble(a9)));
        } catch (Throwable unused) {
            return a9;
        }
    }

    private static String b(int i) {
        if (i == 8) {
            return com.anythink.core.common.v.k.b("LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUZ3d0RRWUpLb1pJaHZjTkFRRUJCUUFEU3dBd1NBSkJBTGpNVCt3QTZEdVViaGZvYTZ5MDQ4czVNWFcrOEY2bgpxNkxzb2FaMWNDdVJ0MDhLU0ZoZ3kwYmp3dWpLVkxLeW1nUVJRUWFGUkhFamF2aTNXd28vUG9jQ0F3RUFBUT09Ci0tLS0tRU5EIFBVQkxJQyBLRVktLS0tLQ==");
        }
        return "";
    }

    public static String a(ad adVar, cd cdVar, double d9, double d10) {
        String str = adVar.winNoticeUrl;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int i = adVar.f14208d;
        String replace = str.replace(c.f12541f, a(adVar, d10));
        if (i == 28 || i == 8 || i == 81 || i == 11) {
            return replace.replace(c.f12537b, a(adVar, d9));
        }
        if (i == 66) {
            return a(replace, a(adVar, cdVar, d10));
        }
        return i == 39 ? replace.replace(c.f12543h, String.valueOf(d10)).replace(c.f12542g, a(adVar.f14206b)) : replace;
    }

    public static String a(ad adVar, aw awVar, int i, boolean z6, double d9, double d10, String str, Map<String, Object> map) {
        String replace;
        double max;
        bv A9;
        int i4 = adVar.f14208d;
        String str2 = adVar.loseNoticeUrl;
        if (TextUtils.isEmpty(str2)) {
            if (awVar != null) {
                String C8 = awVar.C();
                String i6 = awVar.i();
                if (i4 == 8) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(ah.a("kwwsv=22zlq1jgw1tt1frp2zlqbqrwlfh1ifj"));
                    sb.append("?viewid=&position_id=");
                    sb.append(C8);
                    sb.append("&loss=${AUCTION_LOSS}&win_price=${AUCTION_PRICE}&server_bidding_type=1&win_seat=${AUCTION_SEAT_ID}&mrqid=");
                    str2 = Wv.i(sb, i6, "&meSrc=299");
                } else {
                    str2 = "";
                }
            }
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
        }
        String replace2 = str2.replace(c.f12537b, a(adVar, d9)).replace(c.f12538c, b(adVar, d9)).replace(c.f12539d, str);
        if (i4 == 8) {
            replace = replace2.replace(c.f12540e, String.valueOf(i == i4 ? !z6 ? 1 : 4 : (i == 67 || i == 35) ? 3 : 2));
        } else if (i4 == 29) {
            replace = replace2.replace(c.f12540e, i4 == i ? "1" : "10001");
        } else {
            replace = replace2.replace(c.f12540e, "");
        }
        if (i4 == 6) {
            replace = replace.replace(c.f12542g, ATAdConst.CURRENCY.USD.toString());
        } else if (i4 == 39) {
            replace = replace.replace(c.f12539d, str).replace(c.f12542g, a(adVar.f14206b));
        }
        if (i4 == 66) {
            replace = a(replace, a(adVar, awVar, d9, str));
        }
        if (i4 == 28 && map != null) {
            replace = a(replace, map, adVar, d9);
        }
        if (i4 != 65) {
            return replace;
        }
        bv a9 = c.a(adVar);
        if (a9 != null) {
            max = Math.max(d10, p.a(a9));
        } else {
            max = (awVar == null || (A9 = awVar.A()) == null || A9.ar() <= 0.0d) ? d10 : Math.max(d10, A9.ar());
        }
        if (max == 0.0d) {
            return replace;
        }
        double d11 = 0.01d + max;
        if (d11 < d9) {
            max = d11;
        }
        return replace.replace(c.f12541f, String.valueOf(max));
    }

    private static String a(String str, Map<String, Object> map, ad adVar, double d9) {
        try {
            String a9 = a(adVar, d9);
            String replace = str.replace(c.f12553s, a9).replace(c.f12554t, a9);
            int a10 = q.a(map, ATBiddingNotice.ADN_ID, -1);
            int i = 1;
            if (a10 != 1 && a10 != 2) {
                i = 3;
                if (a10 == 3 || a10 == 4) {
                    i = 2;
                }
            }
            String replace2 = replace.replace(c.f12546l, String.valueOf(i));
            String str2 = "other";
            int a11 = q.a(map, ATBiddingNotice.ADN_EXTRA_NW_FIRM_ID, 0);
            if (a11 > 0) {
                if (a11 == 15) {
                    str2 = "chuanshanjia";
                } else if (a11 == 22) {
                    str2 = "baidu";
                }
            }
            String replace3 = replace2.replace(c.f12547m, str2);
            Object obj = map.get(ATBiddingNotice.ADN_EXTRA_NATIVE_MATERIAL_INFO);
            if (obj != null) {
                try {
                    String a12 = q.a((Map<String, Object>) obj, j.w.f13390A, "");
                    if (!TextUtils.isEmpty(a12)) {
                        replace3 = replace3.replace(c.f12549o, a12);
                    }
                    String a13 = q.a((Map<String, Object>) obj, j.w.f13391B, "");
                    if (!TextUtils.isEmpty(a13)) {
                        replace3 = replace3.replace(c.f12548n, a13);
                    }
                } catch (Throwable unused) {
                }
            }
            String a14 = q.a(map, ATBiddingNotice.ADN_REQUEST_ID, "");
            if (!TextUtils.isEmpty(a14)) {
                replace3 = replace3.replace(c.f12550p, a14);
            }
            return replace3.replace(c.f12551q, String.valueOf(q.a(map, ATBiddingNotice.ADN_REQUEST_IS_SHOW, 2))).replace(c.f12552r, String.valueOf(q.a(map, ATBiddingNotice.ADN_REQUEST_IS_CLICK, 2)));
        } catch (Exception unused2) {
            return str;
        }
    }

    public static String a(ad adVar, double d9) {
        int i = adVar.f14208d;
        if (i == 8 || i == 28) {
            return a(i, String.valueOf((int) Math.round(d9)));
        }
        if (i == 66 && adVar.j() > 0.0d) {
            return String.valueOf(d9 / adVar.j());
        }
        return String.valueOf(d9);
    }

    public static String a(boolean z6, int i, int i4, boolean z9) {
        if (i == 3) {
            return "-1";
        }
        if (i4 == 8) {
            if (i != 1) {
                return "1";
            }
            return "5";
        }
        if (i4 == 29) {
            if (i != 1) {
                return "2";
            }
            return ErrorCode.adapterNotExistError;
        }
        if (i4 == 34) {
            if (i == 2) {
                return "102";
            }
            return ErrorCode.networkError;
        }
        if (i4 == 59) {
            return "102";
        }
        if (i4 == 39) {
            if (i != 6) {
                return "102";
            }
            return "103";
        }
        if (z9) {
            return "103";
        }
        if (i == 1) {
            return "2";
        }
        if (i == 5) {
            return "1";
        }
        if (z6) {
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

    public static String a(boolean z6, int i) {
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
        return z6 ? "102" : "103";
    }

    public static Map<String, Object> a(boolean z6, int i, int i4, bv bvVar, ad adVar) {
        int i6 = 2;
        HashMap hashMap = new HashMap(2);
        if (i != i4) {
            i6 = (i == 67 || i == 35) ? 3 : 4;
        } else if (!z6) {
            i6 = 1;
        }
        hashMap.put(ATBiddingNotice.ADN_ID, Integer.valueOf(i6));
        a(hashMap, adVar);
        a(hashMap, i4, i, bvVar);
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
                List<ac> list = adVar.f14224u;
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
            int g9 = bvVar.g();
            k.A(g9 == i ? 5 : 6, hashMap, ATBiddingNotice.ADN_ID, bvVar.o() ? 101 : 100, ATBiddingNotice.ADN_TYPE);
            a(hashMap, i, g9, bvVar);
        }
        return hashMap;
    }

    public static Map<String, Object> a(ad adVar, cd cdVar, double d9) {
        HashMap hashMap = new HashMap();
        hashMap.put(c.f12541f, a(adVar, d9));
        String b9 = cdVar.b();
        if (!TextUtils.isEmpty(b9)) {
            hashMap.put(c.i, b9);
            return hashMap;
        }
        hashMap.put(c.i, "");
        return hashMap;
    }

    public static Map<String, Object> a(ad adVar, aw awVar, double d9, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(c.f12537b, a(adVar, d9));
        hashMap.put(c.f12538c, b(adVar, d9));
        hashMap.put(c.f12539d, str);
        String d10 = awVar.d();
        if (!TextUtils.isEmpty(d10)) {
            hashMap.put(c.i, d10);
        } else {
            hashMap.put(c.i, "");
        }
        hashMap.put(c.f12544j, TextUtils.equals(str, "1") ? "900" : TextUtils.equals(str, "2") ? "203" : (TextUtils.equals(str, "102") || TextUtils.equals(str, "103")) ? "203" : "900");
        hashMap.put(c.f12545k, Long.valueOf(System.currentTimeMillis() / 1000));
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
            return j.C0076j.f13272b;
        }
        return j.C0076j.f13271a;
    }

    public static String a(int i, String str) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (i == 8) {
            str2 = com.anythink.core.common.v.k.b("LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUZ3d0RRWUpLb1pJaHZjTkFRRUJCUUFEU3dBd1NBSkJBTGpNVCt3QTZEdVViaGZvYTZ5MDQ4czVNWFcrOEY2bgpxNkxzb2FaMWNDdVJ0MDhLU0ZoZ3kwYmp3dWpLVkxLeW1nUVJRUWFGUkhFamF2aTNXd28vUG9jQ0F3RUFBUT09Ci0tLS0tRU5EIFBVQkxJQyBLRVktLS0tLQ==");
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
            return Wv.i(sb, str2, "&meSrc=299");
        }
        return "";
    }
}
