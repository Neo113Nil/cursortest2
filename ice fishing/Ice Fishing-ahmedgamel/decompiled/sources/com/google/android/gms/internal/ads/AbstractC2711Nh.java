package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Nh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2711Nh {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f27292a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f27293b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a(String str, String... strArr) {
        String str2;
        StringBuilder sb = new StringBuilder();
        Matcher matcher = f27292a.matcher(str);
        if (matcher.find()) {
            int end = matcher.end();
            sb.append(str.substring(0, end));
            String str3 = strArr[0];
            if (str3 != null) {
                sb.append(str3);
            }
            sb.append(str.substring(end));
        } else {
            if (!f27293b.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb.append(str2);
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static String b(St st) {
        C3324ha c3324ha = AbstractC3592ma.f33072k6;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() && st.f28383T) {
            C3128du c3128du = st.f28385V;
            c3128du.getClass();
            if (((JSONObject) c3128du.f30647u).optBoolean((String) rVar.f40509c.a(AbstractC3592ma.f33091m6), true) && st.f28391b != 4) {
                int i = c3128du.g() == 1 ? 3 : 1;
                String str = st.f28411l0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("creativeType", com.IceFishing.LiveIceFishing.k.b(i));
                    jSONObject.put("contentUrl", str);
                    return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                } catch (JSONException e9) {
                    int i4 = w2.z.f41712b;
                    x2.i.g("Unable to build OMID ENV JSON", e9);
                }
            }
        }
        return null;
    }
}
