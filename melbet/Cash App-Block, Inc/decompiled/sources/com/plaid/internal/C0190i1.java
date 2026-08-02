package com.plaid.internal;

import android.util.Base64;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.plaid.internal.C0251p;
import com.plaid.internal.InterfaceC0270r1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.plaid.internal.i1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0190i1 implements InterfaceC0172g1 {
    public static final C0323x0 b;
    public final String a;

    static {
        W3 w3 = Z3.a;
        b = new C0323x0("flowV1");
    }

    public C0190i1(String str) {
        this.a = str;
    }

    @Override // com.plaid.internal.InterfaceC0172g1
    public final String a(InterfaceC0270r1 interfaceC0270r1, C0251p c0251p) {
        InterfaceC0270r1.b a;
        int i;
        c0251p.d = "v1";
        String str = this.a;
        String str2 = (String) AbstractC0306v1.b(str).get("cid");
        if (str2 == null) {
            LinkedHashMap b2 = AbstractC0306v1.b(str);
            String str3 = (String) b2.get("vfp");
            str2 = str3 == null ? (String) b2.get("token") : str3;
        }
        c0251p.e = str2;
        LinkedHashMap b3 = AbstractC0306v1.b(this.a);
        String str4 = (String) b3.get("vfp");
        if (str4 == null) {
            str4 = (String) b3.get("token");
        }
        int i2 = 0;
        while (true) {
            try {
                C0251p.a aVar = new C0251p.a(str);
                c0251p.c.add(aVar);
                a = interfaceC0270r1.a(new InterfaceC0270r1.a(str, false, null, ((Number) c0251p.f.a("connection-timeout", 10000, Number.class)).intValue()));
                i = a.b;
                aVar.b = i;
                if (i >= 200 && i <= 202) {
                    if (c0251p.f.a("forward-mno-response")) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("status", a.b);
                            jSONObject.put("statusText", a.c);
                            jSONObject.put("headers", new JSONObject(a.d));
                            jSONObject.put("body", a.a);
                            return Base64.encodeToString(("mno-resp:" + jSONObject).getBytes(StandardCharsets.UTF_8), 10);
                        } catch (JSONException e) {
                            throw new C0260q(T0.GENERIC_UNKNOWN_REASON, e);
                        }
                    }
                    String str5 = a.a;
                    try {
                        String a2 = a(new JSONObject(str5));
                        if (a2 != null) {
                            return a2;
                        }
                        throw new C0260q(T0.AUTH_INVALID_RESPONSE, "Received unknown payload: " + str5);
                    } catch (JSONException e2) {
                        throw new C0260q(T0.AUTH_INVALID_RESPONSE, e2);
                    }
                }
                if (i < 300 || i >= 400) {
                    break;
                }
                i2++;
                if (i2 > 10) {
                    throw new C0260q(T0.GENERIC_COMMUNICATION_ERROR, "too many redirects");
                }
                str = a.d.get("location");
                if (!c0251p.f.a("skip-vfp-detection")) {
                    LinkedHashMap b4 = AbstractC0306v1.b(str);
                    String str6 = (String) b4.get("vfp");
                    String str7 = str6 == null ? (String) b4.get("token") : str6;
                    if (str4 == null) {
                        str4 = str7;
                    } else if (str7 != null && !str7.equals(str4)) {
                        b.a(W3.DEBUG, "jumping out of redirect loop with different vfp: %s", str7);
                        return str7;
                    }
                }
            } catch (IOException e3) {
                throw new C0260q(T0.GENERIC_COMMUNICATION_ERROR, e3);
            }
        }
        C0323x0 c0323x0 = b;
        c0323x0.a(W3.INFO, "error response code: %d %s", Integer.valueOf(i), a.c);
        c0323x0.a(W3.DEBUG, "error response body: %s", a.a);
        if (i == 404) {
            throw new C0260q(T0.AUTH_BAD_CREDENTIALS);
        }
        if (i != 410) {
            throw new C0260q(T0.AUTH_INVALID_RESPONSE, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unsupported response status="));
        }
        throw new C0260q(T0.AUTH_VFP_KEY_EXPIRED);
    }

    public static String a(JSONObject jSONObject) {
        String optString = jSONObject.optString("vfp");
        if (!optString.isEmpty()) {
            return optString;
        }
        String optString2 = jSONObject.optString("token");
        String optString3 = jSONObject.optString("correlation_id");
        if (!optString2.isEmpty()) {
            return optString3.isEmpty() ? optString2 : Recorder$$ExternalSyntheticOutline2.m(optString3, "...", optString2);
        }
        String optString4 = jSONObject.optString("reconcilation_token");
        if (optString4.isEmpty()) {
            return null;
        }
        return optString3.isEmpty() ? optString4 : Recorder$$ExternalSyntheticOutline2.m(optString3, "...", optString4);
    }
}
