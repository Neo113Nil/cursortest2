package com.anythink.core.common.v;

import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATSDK;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.bv;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.internal.ads.Wv;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u.AbstractC5050e;

/* loaded from: classes.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17408a = "anythink_bidding";

    /* renamed from: b, reason: collision with root package name */
    private static final String f17409b = "anythink";

    /* renamed from: c, reason: collision with root package name */
    private static final int f17410c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f17411d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f17412e = 2;

    public static void a(String str, com.anythink.core.common.h.n nVar, String str2, bv bvVar, int i, int i4) {
        a(str, nVar, str2, bvVar, i, i4, null);
    }

    public static void b(String str, String str2, String str3, String str4, String str5) {
        a(str, str2, str3, str4, str5, false);
    }

    public static void a(String str, com.anythink.core.common.h.n nVar, String str2, bv bvVar, int i, int i4, List<String> list) {
        if (ATSDK.isNetworkLogDebug()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reason", str2);
                jSONObject.put(com.anythink.expressad.videocommon.e.b.f23195v, str);
                jSONObject.put("adtype", nVar.aL());
                jSONObject.put("adsourceId", bvVar.z());
                jSONObject.put("networkFirmId", bvVar.g());
                jSONObject.put("content", nVar.X());
                jSONObject.put("hourly_frequency", i);
                jSONObject.put("hourly_limit", bvVar.j());
                jSONObject.put("daily_frequency", i4);
                jSONObject.put("daily_limit", bvVar.i());
                jSONObject.put("pacing_limit", bvVar.y());
                jSONObject.put("request_fail_interval", bvVar.M());
                jSONObject.put("filter_source_ids", list != null ? list : "");
                a("anythink_network", jSONObject.toString(), 2);
            } catch (Throwable unused) {
            }
        }
    }

    public static void b(String str, String str2) {
        if (ATSDK.isNetworkLogDebug()) {
            Log.d(str, str2);
        }
    }

    public static void a(String str, String str2, String str3, bv bvVar) {
        if (ATSDK.isNetworkLogDebug()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NativeAdvancedJsUtils.f18693p, j.r.f13312D);
                jSONObject.put("result", str);
                jSONObject.put(com.anythink.expressad.videocommon.e.b.f23195v, str2);
                jSONObject.put("adtype", str3);
                jSONObject.put("adsourceId", bvVar.z());
                jSONObject.put("networkFirmId", bvVar.g());
                jSONObject.put("content", bvVar.k());
                jSONObject.put(com.anythink.expressad.foundation.g.a.f19880q, bvVar.F());
                a(f17408a, jSONObject.toString(), TextUtils.equals(j.r.f13327n, str));
            } catch (Throwable unused) {
            }
        }
    }

    private static void a(String str, String str2, String str3, String str4) {
        if (ATSDK.isNetworkLogDebug()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NativeAdvancedJsUtils.f18693p, j.r.f13313E);
                jSONObject.put("result", str);
                jSONObject.put(com.anythink.expressad.videocommon.e.b.f23195v, str2);
                jSONObject.put("adtype", str3);
                jSONObject.put("errorMsg", str4);
                a("anythink_network", jSONObject.toString(), TextUtils.equals(j.r.f13327n, str));
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(String str, String str2) {
        if (ATSDK.isNetworkLogDebug()) {
            a("anythink_".concat(String.valueOf(str)), str2, false);
        }
    }

    public static void a(String str, String str2, boolean z6) {
        if (z6) {
            a(str, str2, 1);
        } else {
            a(str, str2, 0);
        }
    }

    private static void a(String str, String str2, int i) {
        String property = System.getProperty("line.separator");
        try {
            if (str2.startsWith("{")) {
                str2 = new JSONObject(str2).toString(4);
            } else if (str2.startsWith("[")) {
                str2 = new JSONArray(str2).toString(4);
            }
        } catch (JSONException unused) {
        }
        String str3 = "╔═══════════════════════════════════════════════════════════════════════════════════════";
        for (String str4 : str2.split(property)) {
            str3 = Wv.h(Wv.g(str3, "\n"), "║ ", str4);
        }
        String g9 = Wv.g(str3, "\n╚═══════════════════════════════════════════════════════════════════════════════════════");
        StringBuilder b9 = AbstractC5050e.b(str);
        b9.append(com.anythink.core.common.d.t.b().z() ? "(DebuggerMode)" : "");
        String sb = b9.toString();
        String concat = " \n".concat(String.valueOf(g9));
        if (i == 1) {
            Log.e(sb, concat);
        } else if (i != 2) {
            Log.i(sb, concat);
        } else {
            Log.w(sb, concat);
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        String str6;
        if (ATSDK.isNetworkLogDebug()) {
            str2.getClass();
            switch (str2) {
                case "0":
                    str6 = j.r.f13332s;
                    break;
                case "1":
                    str6 = j.r.f13331r;
                    break;
                case "2":
                    str6 = j.r.f13329p;
                    break;
                case "3":
                    str6 = j.r.f13330q;
                    break;
                case "4":
                    str6 = j.r.f13333t;
                    break;
                default:
                    str6 = "";
                    break;
            }
            a(str, str6, str3, str4, str5, false);
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5, boolean z6) {
        String str6;
        if (ATSDK.isNetworkLogDebug()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.anythink.expressad.videocommon.e.b.f23195v, str);
                jSONObject.put("adtype", str2);
                jSONObject.put("api", str3);
                jSONObject.put("result", str4);
                jSONObject.put("reason", str5);
                if (z6) {
                    if (!TextUtils.isEmpty(str)) {
                        Map<String, Object> b9 = com.anythink.core.common.u.a().b(str);
                        if (b9.size() > 0) {
                            String str7 = "";
                            for (Map.Entry<String, Object> entry : b9.entrySet()) {
                                str7 = str7 + "key=" + entry.getKey() + ",value=" + entry.getValue().toString() + ";";
                            }
                            str6 = "[" + str7 + "]";
                            jSONObject.put("extra", str6);
                        }
                    }
                    str6 = "";
                    jSONObject.put("extra", str6);
                }
                StringBuilder sb = new StringBuilder("anythink_network");
                sb.append(com.anythink.core.common.d.t.b().z() ? "(DebuggerMode)" : "");
                Log.i(sb.toString(), jSONObject.toString());
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(com.anythink.core.common.h.n nVar, String str, String str2, String str3) {
        if (!ATSDK.isNetworkLogDebug() || nVar == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            int Y = nVar.Y();
            if (Y == 66) {
                jSONObject.put("isAdxNetworkMode", nVar.ah());
            }
            if (nVar.i() == 2) {
                jSONObject.put(com.anythink.core.express.b.a.f18312a, "shared placement");
            }
            if (nVar.N() != 0) {
                jSONObject.put("defaultAdSourceType", nVar.N());
            }
            jSONObject.put(com.anythink.expressad.videocommon.e.b.f23195v, nVar.aI());
            jSONObject.put("adType", nVar.aL());
            jSONObject.put("mixedFormatAdType", nVar.ac());
            jSONObject.put(NativeAdvancedJsUtils.f18693p, str);
            jSONObject.put("loadType", nVar.U());
            jSONObject.put("result", str2);
            jSONObject.put("segmentId", nVar.Z());
            jSONObject.put("adSourceId", nVar.M());
            jSONObject.put(com.anythink.expressad.foundation.g.g.a.b.ab, nVar.O());
            jSONObject.put("networkFirmId", Y);
            jSONObject.put("networkName", nVar.aF());
            jSONObject.put("networkVersion", nVar.f14815x);
            jSONObject.put("networkUnit", nVar.X());
            if (nVar.J() == 1) {
                String a9 = p.a(nVar.k());
                if (!TextUtils.isEmpty(a9)) {
                    jSONObject.put("isHB", "1 (" + a9 + ")");
                } else {
                    jSONObject.put("isHB", 1);
                }
            } else {
                jSONObject.put("isHB", 0);
            }
            jSONObject.put(com.anythink.expressad.foundation.g.a.f19880q, str3);
            jSONObject.put("hourly_frequency", nVar.Q());
            jSONObject.put("daily_frequency", nVar.R());
            jSONObject.put("network_list", nVar.S());
            jSONObject.put("request_network_num", nVar.T());
            jSONObject.put("handle_class", nVar.w());
        } catch (Throwable unused) {
        }
        a("network", jSONObject.toString());
    }
}
