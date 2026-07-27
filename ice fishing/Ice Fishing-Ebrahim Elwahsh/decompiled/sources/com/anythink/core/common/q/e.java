package com.anythink.core.common.q;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.t;
import com.anythink.core.common.e.b;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.n;
import com.anythink.core.common.k;
import com.anythink.core.common.m.q;
import com.anythink.core.common.u;
import com.anythink.core.common.v.ak;
import com.anythink.core.d.l;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e implements com.anythink.core.common.k.e {

    /* renamed from: a, reason: collision with root package name */
    private static String f16178a = "anythink_s2s_reward";

    /* renamed from: b, reason: collision with root package name */
    private int f16179b = -1;

    /* renamed from: c, reason: collision with root package name */
    private String f16180c = "";

    /* renamed from: d, reason: collision with root package name */
    private String f16181d = "";

    public final String b() {
        return this.f16181d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(ATBaseAdAdapter aTBaseAdAdapter, l lVar, n nVar, String str, String str2, long j9, Object obj) {
        if (nVar != null) {
            try {
                JSONObject O8 = nVar.O(4);
                if (O8 != null) {
                    O8.put("sdk_time", j9);
                    String userId = aTBaseAdAdapter.getUserId();
                    if (TextUtils.isEmpty(userId) && !TextUtils.isEmpty(str2)) {
                        userId = ATInitMediation.getStringFromMap(u.a().b(str), "user_id");
                    }
                    O8.put("api_c", obj);
                    O8.put("user_id", userId);
                    O8.put("curr_ts", j9);
                    O8.put("ps_ct", lVar.ar());
                    O8.put(l.a.ay, lVar.bo());
                    O8.put(k.f14481x, ak.c(aTBaseAdAdapter.getUnitGroupInfo()));
                    return com.anythink.core.common.v.k.d(O8.toString());
                }
                return "";
            } catch (Exception e6) {
                e6.printStackTrace();
                return "";
            }
        }
        return "";
    }

    public final int a() {
        return this.f16179b;
    }

    @Override // com.anythink.core.common.k.e
    public final void a(final long j9, final ATBaseAdAdapter aTBaseAdAdapter, final n nVar) {
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.q.e.1
            @Override // java.lang.Runnable
            public final void run() {
                n nVar2;
                String str;
                String str2;
                try {
                    if (aTBaseAdAdapter == null || (nVar2 = nVar) == null) {
                        return;
                    }
                    final String aI = nVar2.aI();
                    String g9 = nVar.g();
                    if (TextUtils.isEmpty(g9) || TextUtils.equals(aI, g9)) {
                        str = aI;
                        str2 = "";
                    } else {
                        str2 = aI;
                        str = g9;
                    }
                    l a9 = com.anythink.core.d.n.a(t.b().g()).a(str);
                    if (a9 != null && a9.bG() == 1) {
                        try {
                            Object opt = new JSONObject(a.a(a9.Q())).opt("api_c");
                            if (opt == null) {
                                opt = new JSONObject();
                            }
                            String b9 = e.b(aTBaseAdAdapter, a9, nVar, str, str2, j9, opt);
                            bv unitGroupInfo = aTBaseAdAdapter.getUnitGroupInfo();
                            if (TextUtils.isEmpty(b9) || unitGroupInfo == null || TextUtils.isEmpty(unitGroupInfo.aj())) {
                                return;
                            }
                            new c(t.b().g(), unitGroupInfo.aj(), b9, nVar, a9, str, str2).a(0, new q() { // from class: com.anythink.core.common.q.e.1.1
                                @Override // com.anythink.core.common.m.q
                                public final void onLoadCanceled(int i) {
                                }

                                @Override // com.anythink.core.common.m.q
                                public final void onLoadError(int i, String str3, AdError adError) {
                                    e.this.f16179b = -2;
                                    if (adError != null) {
                                        Log.e(e.f16178a, "S2S impression error! PlacementId: " + aI + ", " + adError.printStackTrace());
                                        e.this.f16181d = adError.toString();
                                        try {
                                            e.this.f16179b = Integer.parseInt(adError.getPlatformCode());
                                        } catch (Exception unused) {
                                        }
                                    }
                                }

                                @Override // com.anythink.core.common.m.q
                                public final void onLoadFinish(int i, Object obj) {
                                    if (t.b().F()) {
                                        Log.i(e.f16178a, "S2S impression succeeded. PlacementId: " + aI + ":" + obj);
                                    }
                                    if (obj != null) {
                                        try {
                                            JSONObject jSONObject = new JSONObject(obj.toString());
                                            e.this.f16179b = jSONObject.optInt("code");
                                            if (e.this.f16179b == 0) {
                                                e.this.f16180c = jSONObject.optString("data");
                                            }
                                        } catch (Exception e6) {
                                            e6.printStackTrace();
                                        }
                                    }
                                }

                                @Override // com.anythink.core.common.m.q
                                public final void onLoadStart(int i) {
                                }
                            });
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }, 2);
    }

    @Override // com.anythink.core.common.k.e
    public final void a(final long j9, final long j10, final ATBaseAdAdapter aTBaseAdAdapter, final n nVar) {
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.q.e.2
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                String str2;
                try {
                    final String aI = nVar.aI();
                    String g9 = nVar.g();
                    if (TextUtils.isEmpty(g9) || TextUtils.equals(aI, g9)) {
                        str = aI;
                        str2 = "";
                    } else {
                        str2 = aI;
                        str = g9;
                    }
                    l a9 = com.anythink.core.d.n.a(t.b().g()).a(str);
                    if (a9.v() != 1) {
                        return;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j11 = j10;
                    long j12 = (j11 == 0 || elapsedRealtime < j11) ? elapsedRealtime : j11;
                    JSONObject jSONObject = new JSONObject(a.a(a9.Q()));
                    int optInt = jSONObject.optInt("a");
                    String optString = jSONObject.optString("b");
                    Object opt = jSONObject.opt("api_c");
                    if (opt == null) {
                        opt = new JSONObject();
                    }
                    b a10 = a.a(optString, e.this.a(str, str2, j9, j12, nVar, aTBaseAdAdapter, opt));
                    if (TextUtils.isEmpty(a10.a())) {
                        com.anythink.core.common.u.e.a("1004658", str, str2, nVar, a9, "", a10.b());
                    } else {
                        new d(t.b().g(), optInt, a10.a(), nVar, a9, str, str2).a(0, new q() { // from class: com.anythink.core.common.q.e.2.1
                            @Override // com.anythink.core.common.m.q
                            public final void onLoadCanceled(int i) {
                            }

                            @Override // com.anythink.core.common.m.q
                            public final void onLoadError(int i, String str3, AdError adError) {
                                Log.e(e.f16178a, "S2S reward error! PlacementId: " + aI + ", " + adError.printStackTrace());
                            }

                            @Override // com.anythink.core.common.m.q
                            public final void onLoadFinish(int i, Object obj) {
                                if (t.b().F()) {
                                    Log.i(e.f16178a, "S2S reward succeeded. PlacementId: " + aI);
                                }
                            }

                            @Override // com.anythink.core.common.m.q
                            public final void onLoadStart(int i) {
                            }
                        });
                    }
                } catch (Throwable unused) {
                }
            }
        }, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:7:0x0013, B:10:0x0072, B:12:0x0078, B:13:0x0089, B:15:0x0093, B:18:0x009b, B:19:0x00a3, B:20:0x00a9, B:22:0x00e8, B:23:0x00ed), top: B:6:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e8 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:7:0x0013, B:10:0x0072, B:12:0x0078, B:13:0x0089, B:15:0x0093, B:18:0x009b, B:19:0x00a3, B:20:0x00a9, B:22:0x00e8, B:23:0x00ed), top: B:6:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String a(String str, String str2, long j9, long j10, n nVar, ATBaseAdAdapter aTBaseAdAdapter, Object obj) {
        String str3;
        String userId;
        String str4;
        Map<String, Object> map;
        String userCustomData;
        Map<String, Object> internalNetworkInfoMap;
        try {
            internalNetworkInfoMap = aTBaseAdAdapter.getInternalNetworkInfoMap();
        } catch (Throwable unused) {
        }
        try {
            if (internalNetworkInfoMap != null) {
                str3 = new JSONObject(internalNetworkInfoMap).toString();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.anythink.core.common.m.e.bk, str);
                jSONObject.put("req_id", nVar.aJ());
                jSONObject.put("show_id", nVar.z());
                jSONObject.put("unit_id", nVar.M());
                jSONObject.put("nw_firm_id", nVar.Y());
                jSONObject.put("scenario_id", nVar.f14168F);
                jSONObject.put("rv_start_ts", j9);
                jSONObject.put("r_callback_ts", j10);
                jSONObject.put("rv_play_dur", j10 - j9);
                jSONObject.put("tp_bid_id", nVar.o());
                jSONObject.put(b.a.f13087f, str3);
                userId = aTBaseAdAdapter.getUserId();
                if (TextUtils.isEmpty(userId) || TextUtils.isEmpty(str2)) {
                    str4 = userId;
                    map = null;
                } else {
                    map = u.a().b(str);
                    str4 = ATInitMediation.getStringFromMap(map, "user_id");
                }
                userCustomData = aTBaseAdAdapter.getUserCustomData();
                if (TextUtils.isEmpty(userCustomData) && !TextUtils.isEmpty(str2)) {
                    if (map == null) {
                        map = u.a().b(str);
                    }
                    userCustomData = ATInitMediation.getStringFromMap(map, ATAdConst.KEY.USER_CUSTOM_DATA);
                }
                jSONObject.put("user_id", str4);
                jSONObject.put("extra_data", userCustomData);
                jSONObject.put("curr_ts", System.currentTimeMillis());
                jSONObject.put("api_c", obj);
                JSONObject a9 = com.anythink.core.common.d.l.a(nVar, aTBaseAdAdapter).a();
                a9.put("o_p_usd", nVar.L());
                a9.put("cur_rate", nVar.u());
                jSONObject.put(l.a.i, a9.toString());
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put(l.a.an, str2);
                }
                jSONObject.put("i_t", this.f16180c);
                jSONObject.put("i_t_c", this.f16179b);
                return jSONObject.toString();
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.anythink.core.common.m.e.bk, str);
            jSONObject2.put("req_id", nVar.aJ());
            jSONObject2.put("show_id", nVar.z());
            jSONObject2.put("unit_id", nVar.M());
            jSONObject2.put("nw_firm_id", nVar.Y());
            jSONObject2.put("scenario_id", nVar.f14168F);
            jSONObject2.put("rv_start_ts", j9);
            jSONObject2.put("r_callback_ts", j10);
            jSONObject2.put("rv_play_dur", j10 - j9);
            jSONObject2.put("tp_bid_id", nVar.o());
            jSONObject2.put(b.a.f13087f, str3);
            userId = aTBaseAdAdapter.getUserId();
            if (TextUtils.isEmpty(userId)) {
            }
            str4 = userId;
            map = null;
            userCustomData = aTBaseAdAdapter.getUserCustomData();
            if (TextUtils.isEmpty(userCustomData)) {
                if (map == null) {
                }
                userCustomData = ATInitMediation.getStringFromMap(map, ATAdConst.KEY.USER_CUSTOM_DATA);
            }
            jSONObject2.put("user_id", str4);
            jSONObject2.put("extra_data", userCustomData);
            jSONObject2.put("curr_ts", System.currentTimeMillis());
            jSONObject2.put("api_c", obj);
            JSONObject a92 = com.anythink.core.common.d.l.a(nVar, aTBaseAdAdapter).a();
            a92.put("o_p_usd", nVar.L());
            a92.put("cur_rate", nVar.u());
            jSONObject2.put(l.a.i, a92.toString());
            if (!TextUtils.isEmpty(str2)) {
            }
            jSONObject2.put("i_t", this.f16180c);
            jSONObject2.put("i_t_c", this.f16179b);
            return jSONObject2.toString();
        } catch (Throwable unused2) {
            return "";
        }
        str3 = "";
    }

    private static void a(String str, String str2, ATBaseAdAdapter aTBaseAdAdapter, JSONObject jSONObject) {
        String str3;
        Map<String, Object> map;
        String userId = aTBaseAdAdapter.getUserId();
        if (!TextUtils.isEmpty(userId) || TextUtils.isEmpty(str2)) {
            str3 = userId;
            map = null;
        } else {
            map = u.a().b(str);
            str3 = ATInitMediation.getStringFromMap(map, "user_id");
        }
        String userCustomData = aTBaseAdAdapter.getUserCustomData();
        if (TextUtils.isEmpty(userCustomData) && !TextUtils.isEmpty(str2)) {
            if (map == null) {
                map = u.a().b(str);
            }
            userCustomData = ATInitMediation.getStringFromMap(map, ATAdConst.KEY.USER_CUSTOM_DATA);
        }
        jSONObject.put("user_id", str3);
        jSONObject.put("extra_data", userCustomData);
    }
}
