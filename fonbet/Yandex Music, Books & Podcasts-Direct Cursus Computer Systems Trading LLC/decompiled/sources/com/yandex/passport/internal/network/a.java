package com.yandex.passport.internal.network;

import android.text.TextUtils;
import com.yandex.passport.internal.analytics.w;
import com.yandex.passport.internal.report.reporters.f1;
import com.yandex.passport.internal.ui.social.gimap.t;
import defpackage.b6e;
import defpackage.hrg;
import defpackage.kac;
import defpackage.l3o;
import defpackage.o3o;
import defpackage.ouj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {
    public final f1 a;

    public a(w wVar, com.yandex.passport.common.a aVar, f1 f1Var) {
        this.a = f1Var;
    }

    public static String a(JSONArray jSONArray, int i) {
        JSONObject optJSONObject = jSONArray.optJSONObject(i);
        if (optJSONObject == null) {
            return jSONArray.optString(i);
        }
        String string = optJSONObject.getString("code");
        String string2 = optJSONObject.getString("field");
        return TextUtils.isEmpty(string2) ? string : ouj.o(string2, ".", string);
    }

    public static JSONObject b(l3o l3oVar) {
        return new JSONObject(c(l3oVar));
    }

    public static String c(l3o l3oVar) {
        o3o o3oVar = l3oVar.g;
        String D = o3oVar != null ? o3oVar.D() : null;
        l3oVar.close();
        if (D != null) {
            return D;
        }
        kac.f("empty response body");
        return null;
    }

    public static String d(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("errors");
        if (optJSONArray == null) {
            return null;
        }
        return a(optJSONArray, 0);
    }

    public static ArrayList e(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("errors");
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            String a = a(optJSONArray, i);
            if (a == null) {
                return null;
            }
            arrayList.add(a);
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.yandex.passport.common.account.a f(l3o l3oVar) {
        com.yandex.passport.common.network.n nVar;
        String optString;
        JSONObject b = b(l3oVar);
        JSONObject jSONObject = b.getJSONObject("status");
        String str = null;
        t tVar = null;
        str = null;
        str = null;
        if (jSONObject.getInt("status") == 1) {
            String string = b.getString("xtoken");
            if (string != null && string.length() > 0 && !string.equals("-")) {
                str = string;
            }
            return new com.yandex.passport.common.account.a(str);
        }
        String string2 = jSONObject.getString("phrase");
        String string3 = jSONObject.getString("trace");
        JSONObject optJSONObject = b.optJSONObject("hint");
        if (optJSONObject != null) {
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("imap_server");
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("smtp_server");
            if (optJSONObject2 != null && optJSONObject3 != null) {
                nVar = new com.yandex.passport.common.network.n(20, new com.yandex.passport.internal.ui.social.gimap.b(optJSONObject2.getString("host"), optJSONObject2.getInt("port"), optJSONObject2.getBoolean("ssl")), new com.yandex.passport.internal.ui.social.gimap.b(optJSONObject3.getString("host"), optJSONObject3.getInt("port"), optJSONObject3.getBoolean("ssl")));
                optString = b.optString("provider");
                if (!optString.equals("")) {
                    t.c.getClass();
                    for (t tVar2 : t.values()) {
                        if (tVar2.a.equals(optString)) {
                            tVar = tVar2;
                        }
                    }
                    b6e.p("illegal provider response = %s", Arrays.copyOf(new Object[]{optString}, 1));
                    return null;
                }
                throw new com.yandex.passport.internal.ui.social.gimap.c(hrg.l(' ', string2, string3), nVar, tVar);
            }
        }
        nVar = null;
        optString = b.optString("provider");
        if (!optString.equals("")) {
        }
        throw new com.yandex.passport.internal.ui.social.gimap.c(hrg.l(' ', string2, string3), nVar, tVar);
    }

    public static ArrayList g(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            Iterator<String> keys2 = jSONObject2.keys();
            ArrayList arrayList2 = new ArrayList(jSONObject2.length());
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                arrayList2.add(new com.yandex.passport.internal.network.response.e(jSONObject2.getJSONObject(next2).getString("title"), next2));
            }
            arrayList.add(new com.yandex.passport.internal.network.response.f(next, arrayList2));
        }
        return arrayList;
    }

    public static void h(JSONObject jSONObject) {
        String d = d(jSONObject);
        if (d == null) {
            return;
        }
        i(d);
        throw new com.yandex.passport.data.exceptions.h(d);
    }

    public static void i(String str) {
        if (str.equals("oauth_token.invalid")) {
            throw new com.yandex.passport.common.exception.a();
        }
    }
}
