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
    private static final long f19570l = 1;

    /* renamed from: d, reason: collision with root package name */
    private b f19574d;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f19579j;

    /* renamed from: k, reason: collision with root package name */
    private String f19580k;

    /* renamed from: n, reason: collision with root package name */
    private int f19582n;

    /* renamed from: o, reason: collision with root package name */
    private String f19583o;

    /* renamed from: p, reason: collision with root package name */
    private int f19584p;

    /* renamed from: q, reason: collision with root package name */
    private Map<String, String> f19585q;

    /* renamed from: r, reason: collision with root package name */
    private String f19586r;

    /* renamed from: s, reason: collision with root package name */
    private String f19587s;

    /* renamed from: t, reason: collision with root package name */
    private int f19588t;

    /* renamed from: u, reason: collision with root package name */
    private int f19589u;

    /* renamed from: v, reason: collision with root package name */
    private com.anythink.expressad.b.a.b f19590v;

    /* renamed from: a, reason: collision with root package name */
    private int f19571a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f19572b = 0;

    /* renamed from: c, reason: collision with root package name */
    private String f19573c = "";

    /* renamed from: e, reason: collision with root package name */
    private int f19575e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f19576f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f19577g = 0;

    /* renamed from: h, reason: collision with root package name */
    private String f19578h = "";

    /* renamed from: m, reason: collision with root package name */
    private boolean f19581m = false;

    private void a(b bVar) {
        this.f19574d = bVar;
    }

    private void b(int i) {
        this.f19571a = i;
    }

    private void c(int i) {
        this.f19575e = i;
    }

    private void d(int i) {
        this.f19576f = i;
    }

    private void e(int i) {
        this.f19577g = i;
    }

    private void f(String str) {
        this.f19583o = str;
    }

    private void g(int i) {
        this.f19589u = i;
    }

    private void h(int i) {
        this.f19588t = i;
    }

    private void i(int i) {
        this.f19582n = i;
    }

    public final b aO() {
        return this.f19574d;
    }

    public final int aP() {
        return this.f19572b;
    }

    public final int aQ() {
        return this.f19571a;
    }

    public final int aR() {
        return this.f19575e;
    }

    public final int aS() {
        return this.f19576f;
    }

    public final int aT() {
        return this.f19577g;
    }

    public final String aU() {
        return this.f19578h;
    }

    public final String aV() {
        return this.i;
    }

    public final String aW() {
        return this.f19579j;
    }

    @Deprecated
    public final String aX() {
        return this.f19580k;
    }

    public final String aY() {
        return this.f19583o;
    }

    public final int aZ() {
        return this.f19584p;
    }

    public com.anythink.expressad.b.a.b al() {
        return this.f19590v;
    }

    public final int ba() {
        return this.f19589u;
    }

    public final int bb() {
        return this.f19588t;
    }

    public final String bc() {
        return this.f19587s;
    }

    public final int bd() {
        return this.f19582n;
    }

    public final boolean be() {
        return this.f19581m;
    }

    public final String v(String str) {
        Map<String, String> map;
        try {
            if (TextUtils.isEmpty(str) || (map = this.f19585q) == null || map.size() <= 0) {
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
        this.f19572b = i;
    }

    private void b(String str) {
        this.i = str;
    }

    private void c(String str) {
        this.f19579j = str;
    }

    private void d(String str) {
        this.f19580k = str;
    }

    private void e(String str) {
        this.f19586r = str;
    }

    private void f(int i) {
        this.f19584p = i;
    }

    private void g(String str) {
        this.f19587s = str;
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
        this.f19578h = str;
    }

    private String b() {
        return this.f19586r;
    }

    private static JSONObject c(JSONObject jSONObject, d dVar) {
        if (dVar == null) {
            return jSONObject;
        }
        jSONObject.put(cL, ((j) dVar).f19581m);
        jSONObject.put(cM, ((j) dVar).f19582n);
        jSONObject.put(cP, ((j) dVar).f19587s);
        jSONObject.put("ttc_type", ((j) dVar).f19588t);
        jSONObject.put(cR, ((j) dVar).f19589u);
        jSONObject.put(cS, ((j) dVar).i);
        jSONObject.put(cT, com.anythink.core.express.a.a.a(((j) dVar).f19579j));
        jSONObject.put(cU, ((j) dVar).f19580k);
        jSONObject.put(cE, ((j) dVar).f19571a);
        jSONObject.put(cF, ((j) dVar).f19572b);
        b bVar = ((j) dVar).f19574d;
        if (bVar != null) {
            jSONObject.put(cG, bVar.g());
        }
        jSONObject.put(cV, ((j) dVar).f19583o);
        jSONObject.put(cW, ((j) dVar).f19584p);
        jSONObject.put(d.bn, dVar.y());
        jSONObject.put(cI, ((j) dVar).f19576f);
        jSONObject.put(cH, ((j) dVar).f19575e);
        jSONObject.put(cJ, ((j) dVar).f19577g);
        jSONObject.put(cK, ((j) dVar).f19578h);
        return jSONObject;
    }

    private Map<String, String> a() {
        return this.f19585q;
    }

    public static d b(JSONObject jSONObject, d dVar) {
        if (jSONObject == null) {
            return null;
        }
        try {
            ((j) dVar).f19581m = jSONObject.optBoolean(cL);
            ((j) dVar).f19582n = jSONObject.optInt(cM, 604800);
            ((j) dVar).f19587s = jSONObject.optString(cP);
            ((j) dVar).f19588t = jSONObject.optInt("ttc_type", 3);
            ((j) dVar).f19589u = jSONObject.optInt(cR, 1800);
            ((j) dVar).f19583o = jSONObject.optString(cV);
            ((j) dVar).f19584p = jSONObject.optInt(cW);
            try {
                if (jSONObject.has(dc)) {
                    String optString = jSONObject.optString(dc);
                    if (!TextUtils.isEmpty(optString)) {
                        ((j) dVar).f19586r = optString;
                        ((j) dVar).f19585q = h(optString);
                    }
                }
            } catch (Exception unused) {
            }
            String optString2 = jSONObject.optString(cS);
            if (!TextUtils.isEmpty(optString2)) {
                ((j) dVar).i = optString2;
                String optString3 = jSONObject.optString(cT);
                if (!TextUtils.isEmpty(optString3)) {
                    ((j) dVar).f19579j = com.anythink.core.express.a.a.b(optString3);
                }
                ((j) dVar).f19580k = jSONObject.optString(cU);
            }
            dVar.e(jSONObject.optString("cam_html"));
            dVar.b(jSONObject.optString("cam_html"));
            ((j) dVar).f19571a = jSONObject.optInt(cE, 0);
            ((j) dVar).f19572b = jSONObject.optInt(cF, 0);
            ((j) dVar).f19574d = b.a(jSONObject.optString(cG));
            ((j) dVar).f19576f = jSONObject.optInt(cI, 0);
            ((j) dVar).f19575e = jSONObject.optInt(cH, 0);
            ((j) dVar).f19577g = jSONObject.optInt(cJ, 0);
            ((j) dVar).f19578h = jSONObject.optString(cK, "");
            return dVar;
        } catch (Exception e9) {
            e9.printStackTrace();
            e9.getLocalizedMessage();
            return dVar;
        }
    }

    private void a(Map<String, String> map) {
        this.f19585q = map;
    }

    private void a(boolean z6) {
        this.f19581m = z6;
    }

    public void a(com.anythink.expressad.b.a.b bVar) {
        this.f19590v = bVar;
    }

    public static d a(JSONObject jSONObject, d dVar) {
        if (jSONObject == null) {
            return null;
        }
        try {
            ((j) dVar).f19581m = jSONObject.optBoolean(cL);
            ((j) dVar).f19582n = jSONObject.optInt(cM, 604800);
            ((j) dVar).f19587s = jSONObject.optString(cP);
            ((j) dVar).f19588t = jSONObject.optInt("ttc_type", 3);
            ((j) dVar).f19589u = jSONObject.optInt(cR, 1800);
            dVar.a(System.currentTimeMillis());
            dVar.m(jSONObject.optString(e.f19447f));
            dVar.n(jSONObject.optString(e.f19451k));
            ((j) dVar).f19583o = jSONObject.optString(cV);
            ((j) dVar).f19584p = jSONObject.optInt(cW);
            try {
                if (jSONObject.has(dc)) {
                    String optString = jSONObject.optString(dc);
                    if (!TextUtils.isEmpty(optString)) {
                        ((j) dVar).f19586r = optString;
                        ((j) dVar).f19585q = h(optString);
                    }
                }
            } catch (Exception unused) {
            }
            String optString2 = jSONObject.optString(cS);
            if (!TextUtils.isEmpty(optString2)) {
                ((j) dVar).i = optString2;
                String optString3 = jSONObject.optString(cT);
                if (!TextUtils.isEmpty(optString3)) {
                    ((j) dVar).f19579j = com.anythink.core.express.a.a.b(optString3);
                }
                ((j) dVar).f19580k = jSONObject.optString(cU);
            }
            ((j) dVar).f19571a = jSONObject.optInt(cE, 0);
            ((j) dVar).f19572b = jSONObject.optInt(cF, 0);
            ((j) dVar).f19574d = b.a(jSONObject.optString(cG));
            ((j) dVar).f19576f = jSONObject.optInt(cI, 0);
            ((j) dVar).f19575e = jSONObject.optInt(cH, 0);
            ((j) dVar).f19577g = jSONObject.optInt(cJ, 0);
            ((j) dVar).f19578h = jSONObject.optString(cK, "");
            return dVar;
        } catch (Exception e9) {
            e9.printStackTrace();
            e9.getLocalizedMessage();
            return dVar;
        }
    }

    public final boolean b(d dVar) {
        boolean z6 = this.f19571a == 1 && dVar.R() == 3 && ((j) dVar).f19572b != 1;
        if (z6) {
            try {
                if (v.a(com.anythink.core.common.d.t.b().g(), bi())) {
                    return false;
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return z6;
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
                HashMap<String, String> A9 = dVar.A();
                if (A9 != null) {
                    A9.entrySet().iterator();
                    for (Map.Entry<String, String> entry2 : A9.entrySet()) {
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
