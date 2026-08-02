package com.anythink.basead.exoplayer.d;

import android.util.Log;
import com.anythink.basead.exoplayer.k.af;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7571a = "ClearKeyUtil";

    private a() {
    }

    public static byte[] a(byte[] bArr) {
        if (af.f9132a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(af.a(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(b(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(b(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return af.c(sb.toString());
        } catch (JSONException e9) {
            Log.e(f7571a, "Failed to adjust response data: " + af.a(bArr), e9);
            return bArr;
        }
    }

    private static byte[] b(byte[] bArr) {
        return af.f9132a >= 27 ? bArr : af.c(af.a(bArr).replace('+', '-').replace('/', '_'));
    }

    private static String b(String str) {
        return str.replace('-', '+').replace('_', '/');
    }

    private static String a(String str) {
        return str.replace('+', '-').replace('/', '_');
    }
}
