package com.anythink.expressad.foundation.d;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b implements com.anythink.expressad.g.b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18533a = "https://img.toponad.com/sdk/app-permissions.html?key=";

    /* renamed from: b, reason: collision with root package name */
    private static String f18534b = "app_name";

    /* renamed from: c, reason: collision with root package name */
    private static String f18535c = "perm_desc";

    /* renamed from: d, reason: collision with root package name */
    private static String f18536d = "ori_perm_desc";

    /* renamed from: e, reason: collision with root package name */
    private static String f18537e = "ori_perm_all";

    /* renamed from: f, reason: collision with root package name */
    private static String f18538f = "pri_url";

    /* renamed from: g, reason: collision with root package name */
    private static String f18539g = "upd_time";

    /* renamed from: h, reason: collision with root package name */
    private static String f18540h = "app_ver";
    private static String i = "dev_name";

    /* renamed from: j, reason: collision with root package name */
    private String f18541j;

    /* renamed from: k, reason: collision with root package name */
    private String f18542k;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList<String> f18543l = new ArrayList<>(3);

    /* renamed from: m, reason: collision with root package name */
    private ArrayList<String> f18544m = new ArrayList<>(3);

    /* renamed from: n, reason: collision with root package name */
    private ArrayList<String> f18545n = new ArrayList<>(3);

    /* renamed from: o, reason: collision with root package name */
    private String f18546o;

    /* renamed from: p, reason: collision with root package name */
    private String f18547p;

    /* renamed from: q, reason: collision with root package name */
    private String f18548q;

    /* renamed from: r, reason: collision with root package name */
    private String f18549r;

    /* renamed from: s, reason: collision with root package name */
    private String f18550s;

    private void b(String str) {
        this.f18541j = str;
    }

    private void c(String str) {
        this.f18546o = str;
    }

    private void d(String str) {
        this.f18542k = str;
    }

    private void e(String str) {
        this.f18547p = str;
    }

    private void f(String str) {
        this.f18548q = str;
    }

    private void g(String str) {
        this.f18549r = str;
    }

    private String h() {
        return this.f18541j;
    }

    private ArrayList<String> i() {
        return this.f18543l;
    }

    private ArrayList<String> j() {
        return this.f18544m;
    }

    private ArrayList<String> k() {
        return this.f18545n;
    }

    public final String a() {
        return this.f18546o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApkDisplayInfo{appName='");
        sb.append(this.f18542k);
        sb.append("', permDescJArray=");
        sb.append(this.f18543l);
        sb.append(", permDescOriJArray=");
        sb.append(this.f18544m);
        sb.append(", permDescAll=");
        sb.append(this.f18545n);
        sb.append(", priUrl='");
        sb.append(this.f18547p);
        sb.append("', updateTime='");
        sb.append(this.f18548q);
        sb.append("', appVersion='");
        sb.append(this.f18549r);
        sb.append("', devName='");
        return u1.h.g(sb, this.f18550s, "'}");
    }

    private void a(ArrayList<String> arrayList) {
        this.f18543l = arrayList;
    }

    private void c(ArrayList<String> arrayList) {
        this.f18545n = arrayList;
    }

    private void h(String str) {
        this.f18550s = str;
    }

    public final String b() {
        return this.f18542k;
    }

    public final String d() {
        return this.f18548q;
    }

    public final String e() {
        return this.f18549r;
    }

    public final String f() {
        return this.f18550s;
    }

    public final JSONObject g() {
        try {
            JSONObject jSONObject = new JSONObject(this.f18541j);
            if (jSONObject.length() > 0) {
                return jSONObject;
            }
            return null;
        } catch (JSONException e9) {
            e9.printStackTrace();
            return null;
        }
    }

    private static b a(b bVar) {
        return bVar == null ? new b() : bVar;
    }

    private void b(ArrayList<String> arrayList) {
        this.f18544m = arrayList;
    }

    private static JSONArray d(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            jSONArray.put(arrayList.get(i6));
        }
        return jSONArray;
    }

    public final String c() {
        return this.f18547p;
    }

    public static b a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return a(new JSONObject(str));
        } catch (JSONException e9) {
            e9.printStackTrace();
            return null;
        }
    }

    private static ArrayList<String> a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            arrayList.add(jSONArray.optString(i6));
        }
        return arrayList;
    }

    private static b a(JSONObject jSONObject) {
        b bVar = null;
        if (jSONObject.has(f18534b)) {
            bVar = a((b) null);
            bVar.f18542k = jSONObject.optString(f18534b);
        }
        if (jSONObject.has(f18535c)) {
            bVar = a(bVar);
            JSONArray optJSONArray = jSONObject.optJSONArray(f18535c);
            if (optJSONArray != null) {
                bVar.f18543l = a(optJSONArray);
                ArrayList<String> arrayList = bVar.f18545n;
                String str = f18533a;
                for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                    try {
                        if (optJSONArray.get(i6) instanceof String) {
                            str = i6 == 0 ? str + optJSONArray.optString(i6) : str + "," + optJSONArray.optString(i6);
                        }
                    } catch (JSONException e9) {
                        e9.printStackTrace();
                    }
                }
                bVar.f18546o = str;
                bVar.f18545n = arrayList;
            }
        }
        if (jSONObject.has(f18536d)) {
            bVar = a(bVar);
            JSONArray optJSONArray2 = jSONObject.optJSONArray(f18536d);
            if (optJSONArray2 != null) {
                bVar.f18544m = a(optJSONArray2);
                ArrayList<String> arrayList2 = bVar.f18545n;
                for (int i9 = 0; i9 < optJSONArray2.length(); i9++) {
                    try {
                        Object obj = optJSONArray2.get(i9);
                        if (obj instanceof String) {
                            arrayList2.add((String) obj);
                        }
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                }
                bVar.f18545n = arrayList2;
            }
        }
        if (jSONObject.has(f18538f)) {
            bVar = a(bVar);
            bVar.f18547p = jSONObject.optString(f18538f);
        }
        if (jSONObject.has(f18539g)) {
            bVar = a(bVar);
            bVar.f18548q = jSONObject.optString(f18539g);
        }
        if (jSONObject.has(f18540h)) {
            bVar = a(bVar);
            bVar.f18549r = jSONObject.optString(f18540h);
        }
        if (jSONObject.has(i)) {
            bVar = a(bVar);
            bVar.f18550s = jSONObject.optString(i);
        }
        if (bVar != null) {
            bVar.f18541j = jSONObject.toString();
        }
        return bVar;
    }
}
