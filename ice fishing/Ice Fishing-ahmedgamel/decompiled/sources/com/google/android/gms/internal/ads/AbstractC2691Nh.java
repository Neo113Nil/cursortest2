package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Nh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2691Nh {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f26509a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f26510b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a(String str, String... strArr) {
        String str2;
        StringBuilder sb = new StringBuilder();
        Matcher matcher = f26509a.matcher(str);
        if (matcher.find()) {
            int end = matcher.end();
            sb.append(str.substring(0, end));
            String str3 = strArr[0];
            if (str3 != null) {
                sb.append(str3);
            }
            sb.append(str.substring(end));
        } else {
            if (!f26510b.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb.append(str2);
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static String b(St st) {
        C3301ha c3301ha = AbstractC3569ma.f32293k6;
        q2.r rVar = q2.r.f40207e;
        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue() && st.f27600T) {
            C3105du c3105du = st.f27602V;
            c3105du.getClass();
            if (((JSONObject) c3105du.f29859u).optBoolean((String) rVar.f40210c.a(AbstractC3569ma.f32311m6), true) && st.f27608b != 4) {
                int i = c3105du.g() == 1 ? 3 : 1;
                String str = st.f27628l0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("creativeType", com.anythink.basead.exoplayer.f.f.b(i));
                    jSONObject.put("contentUrl", str);
                    return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                } catch (JSONException e9) {
                    int i6 = u2.z.f41322b;
                    v2.i.g("Unable to build OMID ENV JSON", e9);
                }
            }
        }
        return null;
    }
}
