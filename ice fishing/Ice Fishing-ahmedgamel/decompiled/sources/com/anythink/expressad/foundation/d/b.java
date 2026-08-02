package com.anythink.expressad.foundation.d;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.Wv;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b implements com.anythink.expressad.g.b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19320a = "https://img.toponad.com/sdk/app-permissions.html?key=";

    /* renamed from: b, reason: collision with root package name */
    private static String f19321b = "app_name";

    /* renamed from: c, reason: collision with root package name */
    private static String f19322c = "perm_desc";

    /* renamed from: d, reason: collision with root package name */
    private static String f19323d = "ori_perm_desc";

    /* renamed from: e, reason: collision with root package name */
    private static String f19324e = "ori_perm_all";

    /* renamed from: f, reason: collision with root package name */
    private static String f19325f = "pri_url";

    /* renamed from: g, reason: collision with root package name */
    private static String f19326g = "upd_time";

    /* renamed from: h, reason: collision with root package name */
    private static String f19327h = "app_ver";
    private static String i = "dev_name";

    /* renamed from: j, reason: collision with root package name */
    private String f19328j;

    /* renamed from: k, reason: collision with root package name */
    private String f19329k;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList<String> f19330l = new ArrayList<>(3);

    /* renamed from: m, reason: collision with root package name */
    private ArrayList<String> f19331m = new ArrayList<>(3);

    /* renamed from: n, reason: collision with root package name */
    private ArrayList<String> f19332n = new ArrayList<>(3);

    /* renamed from: o, reason: collision with root package name */
    private String f19333o;

    /* renamed from: p, reason: collision with root package name */
    private String f19334p;

    /* renamed from: q, reason: collision with root package name */
    private String f19335q;

    /* renamed from: r, reason: collision with root package name */
    private String f19336r;

    /* renamed from: s, reason: collision with root package name */
    private String f19337s;

    private void b(String str) {
        this.f19328j = str;
    }

    private void c(String str) {
        this.f19333o = str;
    }

    private void d(String str) {
        this.f19329k = str;
    }

    private void e(String str) {
        this.f19334p = str;
    }

    private void f(String str) {
        this.f19335q = str;
    }

    private void g(String str) {
        this.f19336r = str;
    }

    private String h() {
        return this.f19328j;
    }

    private ArrayList<String> i() {
        return this.f19330l;
    }

    private ArrayList<String> j() {
        return this.f19331m;
    }

    private ArrayList<String> k() {
        return this.f19332n;
    }

    public final String a() {
        return this.f19333o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApkDisplayInfo{appName='");
        sb.append(this.f19329k);
        sb.append("', permDescJArray=");
        sb.append(this.f19330l);
        sb.append(", permDescOriJArray=");
        sb.append(this.f19331m);
        sb.append(", permDescAll=");
        sb.append(this.f19332n);
        sb.append(", priUrl='");
        sb.append(this.f19334p);
        sb.append("', updateTime='");
        sb.append(this.f19335q);
        sb.append("', appVersion='");
        sb.append(this.f19336r);
        sb.append("', devName='");
        return Wv.i(sb, this.f19337s, "'}");
    }

    private void a(ArrayList<String> arrayList) {
        this.f19330l = arrayList;
    }

    private void c(ArrayList<String> arrayList) {
        this.f19332n = arrayList;
    }

    private void h(String str) {
        this.f19337s = str;
    }

    public final String b() {
        return this.f19329k;
    }

    public final String d() {
        return this.f19335q;
    }

    public final String e() {
        return this.f19336r;
    }

    public final String f() {
        return this.f19337s;
    }

    public final JSONObject g() {
        try {
            JSONObject jSONObject = new JSONObject(this.f19328j);
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
        this.f19331m = arrayList;
    }

    private static JSONArray d(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            jSONArray.put(arrayList.get(i4));
        }
        return jSONArray;
    }

    public final String c() {
        return this.f19334p;
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
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            arrayList.add(jSONArray.optString(i4));
        }
        return arrayList;
    }

    private static b a(JSONObject jSONObject) {
        b bVar = null;
        if (jSONObject.has(f19321b)) {
            bVar = a((b) null);
            bVar.f19329k = jSONObject.optString(f19321b);
        }
        if (jSONObject.has(f19322c)) {
            bVar = a(bVar);
            JSONArray optJSONArray = jSONObject.optJSONArray(f19322c);
            if (optJSONArray != null) {
                bVar.f19330l = a(optJSONArray);
                ArrayList<String> arrayList = bVar.f19332n;
                String str = f19320a;
                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                    try {
                        if (optJSONArray.get(i4) instanceof String) {
                            str = i4 == 0 ? str + optJSONArray.optString(i4) : str + "," + optJSONArray.optString(i4);
                        }
                    } catch (JSONException e9) {
                        e9.printStackTrace();
                    }
                }
                bVar.f19333o = str;
                bVar.f19332n = arrayList;
            }
        }
        if (jSONObject.has(f19323d)) {
            bVar = a(bVar);
            JSONArray optJSONArray2 = jSONObject.optJSONArray(f19323d);
            if (optJSONArray2 != null) {
                bVar.f19331m = a(optJSONArray2);
                ArrayList<String> arrayList2 = bVar.f19332n;
                for (int i6 = 0; i6 < optJSONArray2.length(); i6++) {
                    try {
                        Object obj = optJSONArray2.get(i6);
                        if (obj instanceof String) {
                            arrayList2.add((String) obj);
                        }
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                }
                bVar.f19332n = arrayList2;
            }
        }
        if (jSONObject.has(f19325f)) {
            bVar = a(bVar);
            bVar.f19334p = jSONObject.optString(f19325f);
        }
        if (jSONObject.has(f19326g)) {
            bVar = a(bVar);
            bVar.f19335q = jSONObject.optString(f19326g);
        }
        if (jSONObject.has(f19327h)) {
            bVar = a(bVar);
            bVar.f19336r = jSONObject.optString(f19327h);
        }
        if (jSONObject.has(i)) {
            bVar = a(bVar);
            bVar.f19337s = jSONObject.optString(i);
        }
        if (bVar != null) {
            bVar.f19328j = jSONObject.toString();
        }
        return bVar;
    }
}
