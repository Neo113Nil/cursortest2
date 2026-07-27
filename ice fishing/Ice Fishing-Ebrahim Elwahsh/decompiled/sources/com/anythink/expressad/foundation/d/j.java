package com.anythink.expressad.foundation.d;

import android.net.Uri;
import android.text.TextUtils;
import com.anythink.expressad.foundation.h.v;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j extends com.anythink.expressad.out.k implements com.anythink.expressad.g.b, Serializable {
    public static final String cD = "j";
    public static final String cE = "apk_alt";
    public static final String cF = "disableApkAlt";
    public static final String cG = "apk_info";
    public static final String cH = "ntbarpt";
    public static final String cI = "ntbarpasbl";
    public static final String cJ = "atat_type";
    public static final String cK = "akdlui";
    public static final String cL = "ttc";
    public static final String cM = "ttc_ct";
    public static final String cN = "ttc_pe";
    public static final String cO = "ttc_po";
    public static final String cP = "adv_id";
    public static final String cQ = "ttc_type";
    public static final String cR = "ttc_ct2";
    public static final String cS = "gh_id";
    public static final String cT = "gh_path";
    public static final String cU = "bind_id";
    public static final String cV = "mark";
    public static final String cW = "isPost";
    public static final int cX = 604800;
    public static final int cY = 1800;
    public static final String cZ = "apk_download_start";
    public static final String da = "apk_download_end";
    public static final String db = "apk_install";
    public static final String dc = "loopback";
    public static final String dd = "domain";
    public static final String de = "key";
    public static final String df = "value";

    /* renamed from: l, reason: collision with root package name */
    private static final long f18941l = 1;

    /* renamed from: d, reason: collision with root package name */
    private b f18945d;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f18950j;

    /* renamed from: k, reason: collision with root package name */
    private String f18951k;

    /* renamed from: n, reason: collision with root package name */
    private int f18953n;

    /* renamed from: o, reason: collision with root package name */
    private String f18954o;

    /* renamed from: p, reason: collision with root package name */
    private int f18955p;

    /* renamed from: q, reason: collision with root package name */
    private Map<String, String> f18956q;

    /* renamed from: r, reason: collision with root package name */
    private String f18957r;

    /* renamed from: s, reason: collision with root package name */
    private String f18958s;

    /* renamed from: t, reason: collision with root package name */
    private int f18959t;

    /* renamed from: u, reason: collision with root package name */
    private int f18960u;

    /* renamed from: v, reason: collision with root package name */
    private com.anythink.expressad.b.a.b f18961v;

    /* renamed from: a, reason: collision with root package name */
    private int f18942a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f18943b = 0;

    /* renamed from: c, reason: collision with root package name */
    private String f18944c = "";

    /* renamed from: e, reason: collision with root package name */
    private int f18946e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f18947f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f18948g = 0;

    /* renamed from: h, reason: collision with root package name */
    private String f18949h = "";

    /* renamed from: m, reason: collision with root package name */
    private boolean f18952m = false;

    private void a(b bVar) {
        this.f18945d = bVar;
    }

    private void b(int i) {
        this.f18942a = i;
    }

    private void c(int i) {
        this.f18946e = i;
    }

    private void d(int i) {
        this.f18947f = i;
    }

    private void e(int i) {
        this.f18948g = i;
    }

    private void f(String str) {
        this.f18954o = str;
    }

    private void g(int i) {
        this.f18960u = i;
    }

    private void h(int i) {
        this.f18959t = i;
    }

    private void i(int i) {
        this.f18953n = i;
    }

    public final b aO() {
        return this.f18945d;
    }

    public final int aP() {
        return this.f18943b;
    }

    public final int aQ() {
        return this.f18942a;
    }

    public final int aR() {
        return this.f18946e;
    }

    public final int aS() {
        return this.f18947f;
    }

    public final int aT() {
        return this.f18948g;
    }

    public final String aU() {
        return this.f18949h;
    }

    public final String aV() {
        return this.i;
    }

    public final String aW() {
        return this.f18950j;
    }

    @Deprecated
    public final String aX() {
        return this.f18951k;
    }

    public final String aY() {
        return this.f18954o;
    }

    public final int aZ() {
        return this.f18955p;
    }

    public com.anythink.expressad.b.a.b al() {
        return this.f18961v;
    }

    public final int ba() {
        return this.f18960u;
    }

    public final int bb() {
        return this.f18959t;
    }

    public final String bc() {
        return this.f18958s;
    }

    public final int bd() {
        return this.f18953n;
    }

    public final boolean be() {
        return this.f18952m;
    }

    public final String v(String str) {
        Map<String, String> map;
        try {
            if (TextUtils.isEmpty(str) || (map = this.f18956q) == null || map.size() <= 0) {
                return str;
            }
            Uri parse = Uri.parse(str);
            String host = parse.getHost();
            String str2 = map.get("domain");
            if (TextUtils.isEmpty(host) || !host.contains(str2)) {
                return str;
            }
            String str3 = map.get("key");
            String str4 = map.get("value");
            if (!str.contains(str3) && TextUtils.isEmpty(parse.getQueryParameter(str3)) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                return str + "&" + str3 + "=" + str4;
            }
            if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                return str;
            }
            return str.replace(str3 + "=" + (TextUtils.isEmpty(parse.getQueryParameter(str3)) ? "" : parse.getQueryParameter(str3)), str3 + "=" + str4);
        } catch (Throwable unused) {
            return str;
        }
    }

    private void a(int i) {
        this.f18943b = i;
    }

    private void b(String str) {
        this.i = str;
    }

    private void c(String str) {
        this.f18950j = str;
    }

    private void d(String str) {
        this.f18951k = str;
    }

    private void e(String str) {
        this.f18957r = str;
    }

    private void f(int i) {
        this.f18955p = i;
    }

    private void g(String str) {
        this.f18958s = str;
    }

    private static Map<String, String> h(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            HashMap hashMap = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap.put("domain", jSONObject.getString("domain"));
                hashMap.put("key", jSONObject.getString("key"));
                hashMap.put("value", jSONObject.getString("value"));
                return hashMap;
            } catch (Throwable unused) {
                return hashMap;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private void a(String str) {
        this.f18949h = str;
    }

    private String b() {
        return this.f18957r;
    }

    private static JSONObject c(JSONObject jSONObject, d dVar) {
        if (dVar == null) {
            return jSONObject;
        }
        jSONObject.put(cL, ((j) dVar).f18952m);
        jSONObject.put(cM, ((j) dVar).f18953n);
        jSONObject.put(cP, ((j) dVar).f18958s);
        jSONObject.put("ttc_type", ((j) dVar).f18959t);
        jSONObject.put(cR, ((j) dVar).f18960u);
        jSONObject.put(cS, ((j) dVar).i);
        jSONObject.put(cT, com.anythink.core.express.a.a.a(((j) dVar).f18950j));
        jSONObject.put(cU, ((j) dVar).f18951k);
        jSONObject.put(cE, ((j) dVar).f18942a);
        jSONObject.put(cF, ((j) dVar).f18943b);
        b bVar = ((j) dVar).f18945d;
        if (bVar != null) {
            jSONObject.put(cG, bVar.g());
        }
        jSONObject.put(cV, ((j) dVar).f18954o);
        jSONObject.put(cW, ((j) dVar).f18955p);
        jSONObject.put(d.bn, dVar.y());
        jSONObject.put(cI, ((j) dVar).f18947f);
        jSONObject.put(cH, ((j) dVar).f18946e);
        jSONObject.put(cJ, ((j) dVar).f18948g);
        jSONObject.put(cK, ((j) dVar).f18949h);
        return jSONObject;
    }

    private Map<String, String> a() {
        return this.f18956q;
    }

    public static d b(JSONObject jSONObject, d dVar) {
        if (jSONObject == null) {
            return null;
        }
        try {
            ((j) dVar).f18952m = jSONObject.optBoolean(cL);
            ((j) dVar).f18953n = jSONObject.optInt(cM, 604800);
            ((j) dVar).f18958s = jSONObject.optString(cP);
            ((j) dVar).f18959t = jSONObject.optInt("ttc_type", 3);
            ((j) dVar).f18960u = jSONObject.optInt(cR, 1800);
            ((j) dVar).f18954o = jSONObject.optString(cV);
            ((j) dVar).f18955p = jSONObject.optInt(cW);
            try {
                if (jSONObject.has(dc)) {
                    String optString = jSONObject.optString(dc);
                    if (!TextUtils.isEmpty(optString)) {
                        ((j) dVar).f18957r = optString;
                        ((j) dVar).f18956q = h(optString);
                    }
                }
            } catch (Exception unused) {
            }
            String optString2 = jSONObject.optString(cS);
            if (!TextUtils.isEmpty(optString2)) {
                ((j) dVar).i = optString2;
                String optString3 = jSONObject.optString(cT);
                if (!TextUtils.isEmpty(optString3)) {
                    ((j) dVar).f18950j = com.anythink.core.express.a.a.b(optString3);
                }
                ((j) dVar).f18951k = jSONObject.optString(cU);
            }
            dVar.e(jSONObject.optString("cam_html"));
            dVar.b(jSONObject.optString("cam_html"));
            ((j) dVar).f18942a = jSONObject.optInt(cE, 0);
            ((j) dVar).f18943b = jSONObject.optInt(cF, 0);
            ((j) dVar).f18945d = b.a(jSONObject.optString(cG));
            ((j) dVar).f18947f = jSONObject.optInt(cI, 0);
            ((j) dVar).f18946e = jSONObject.optInt(cH, 0);
            ((j) dVar).f18948g = jSONObject.optInt(cJ, 0);
            ((j) dVar).f18949h = jSONObject.optString(cK, "");
            return dVar;
        } catch (Exception e6) {
            e6.printStackTrace();
            e6.getLocalizedMessage();
            return dVar;
        }
    }

    private void a(Map<String, String> map) {
        this.f18956q = map;
    }

    private void a(boolean z8) {
        this.f18952m = z8;
    }

    public void a(com.anythink.expressad.b.a.b bVar) {
        this.f18961v = bVar;
    }

    public static d a(JSONObject jSONObject, d dVar) {
        if (jSONObject == null) {
            return null;
        }
        try {
            ((j) dVar).f18952m = jSONObject.optBoolean(cL);
            ((j) dVar).f18953n = jSONObject.optInt(cM, 604800);
            ((j) dVar).f18958s = jSONObject.optString(cP);
            ((j) dVar).f18959t = jSONObject.optInt("ttc_type", 3);
            ((j) dVar).f18960u = jSONObject.optInt(cR, 1800);
            dVar.a(System.currentTimeMillis());
            dVar.m(jSONObject.optString(e.f18818f));
            dVar.n(jSONObject.optString(e.f18822k));
            ((j) dVar).f18954o = jSONObject.optString(cV);
            ((j) dVar).f18955p = jSONObject.optInt(cW);
            try {
                if (jSONObject.has(dc)) {
                    String optString = jSONObject.optString(dc);
                    if (!TextUtils.isEmpty(optString)) {
                        ((j) dVar).f18957r = optString;
                        ((j) dVar).f18956q = h(optString);
                    }
                }
            } catch (Exception unused) {
            }
            String optString2 = jSONObject.optString(cS);
            if (!TextUtils.isEmpty(optString2)) {
                ((j) dVar).i = optString2;
                String optString3 = jSONObject.optString(cT);
                if (!TextUtils.isEmpty(optString3)) {
                    ((j) dVar).f18950j = com.anythink.core.express.a.a.b(optString3);
                }
                ((j) dVar).f18951k = jSONObject.optString(cU);
            }
            ((j) dVar).f18942a = jSONObject.optInt(cE, 0);
            ((j) dVar).f18943b = jSONObject.optInt(cF, 0);
            ((j) dVar).f18945d = b.a(jSONObject.optString(cG));
            ((j) dVar).f18947f = jSONObject.optInt(cI, 0);
            ((j) dVar).f18946e = jSONObject.optInt(cH, 0);
            ((j) dVar).f18948g = jSONObject.optInt(cJ, 0);
            ((j) dVar).f18949h = jSONObject.optString(cK, "");
            return dVar;
        } catch (Exception e6) {
            e6.printStackTrace();
            e6.getLocalizedMessage();
            return dVar;
        }
    }

    public final boolean b(d dVar) {
        boolean z8 = this.f18942a == 1 && dVar.R() == 3 && ((j) dVar).f18943b != 1;
        if (z8) {
            try {
                if (v.a(com.anythink.core.common.d.t.b().g(), bi())) {
                    return false;
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return z8;
    }

    public static String a(e eVar, d dVar, String str) {
        if (eVar != null && !TextUtils.isEmpty(str)) {
            try {
                HashMap<String, String> a9 = eVar.a();
                if (a9 != null) {
                    a9.entrySet().iterator();
                    for (Map.Entry<String, String> entry : a9.entrySet()) {
                        String key = entry.getKey();
                        str = str.replaceAll("\\{" + key + "\\}", entry.getValue());
                    }
                }
                HashMap<String, String> A8 = dVar.A();
                if (A8 != null) {
                    A8.entrySet().iterator();
                    for (Map.Entry<String, String> entry2 : A8.entrySet()) {
                        String key2 = entry2.getKey();
                        str = str.replaceAll("\\{" + key2 + "\\}", entry2.getValue());
                    }
                }
                HashMap<String, String> b9 = eVar.b();
                if (b9 != null) {
                    for (Map.Entry<String, String> entry3 : b9.entrySet()) {
                        String key3 = entry3.getKey();
                        str = str.replaceAll("\\{" + key3 + "\\}", entry3.getValue());
                    }
                }
                str = str.replaceAll("\\{c\\}", URLEncoder.encode(eVar.e(), com.anythink.expressad.foundation.g.a.bR));
                Matcher matcher = Pattern.compile("=\\{.*?\\}").matcher(str);
                while (matcher.find()) {
                    str = str.replace(matcher.group(0), "=");
                }
                return str;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return str;
    }
}
