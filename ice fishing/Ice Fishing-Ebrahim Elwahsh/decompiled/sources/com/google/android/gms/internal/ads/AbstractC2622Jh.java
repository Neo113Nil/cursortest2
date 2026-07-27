package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Jh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2622Jh {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f25786a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f25787b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a(String str, String... strArr) {
        String str2;
        StringBuilder sb = new StringBuilder();
        Matcher matcher = f25786a.matcher(str);
        if (matcher.find()) {
            int end = matcher.end();
            sb.append(str.substring(0, end));
            String str3 = strArr[0];
            if (str3 != null) {
                sb.append(str3);
            }
            sb.append(str.substring(end));
        } else {
            if (!f25787b.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb.append(str2);
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static String b(Ut ut) {
        C3151ea c3151ea = AbstractC3368ia.k6;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && ut.f28133T) {
            C3761pr c3761pr = ut.f28135V;
            c3761pr.getClass();
            if (((JSONObject) c3761pr.f33523u).optBoolean((String) rVar.f40119c.a(AbstractC3368ia.f31731m6), true) && ut.f28141b != 4) {
                int i = c3761pr.H() == 1 ? 3 : 1;
                String str = ut.f28161l0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("creativeType", com.anythink.basead.b.c.i.b(i));
                    jSONObject.put("contentUrl", str);
                    return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                } catch (JSONException e6) {
                    int i4 = t2.C.f40822b;
                    u2.i.g("Unable to build OMID ENV JSON", e6);
                }
            }
        }
        return null;
    }
}
