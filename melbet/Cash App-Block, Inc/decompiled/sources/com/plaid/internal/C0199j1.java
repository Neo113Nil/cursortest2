package com.plaid.internal;

import android.util.Base64;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.C0251p;
import com.plaid.internal.InterfaceC0270r1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.plaid.internal.j1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0199j1 implements InterfaceC0172g1 {
    public static final C0323x0 e;
    public final String a;
    public final String b;
    public final JSONObject c;
    public final JSONObject d;

    static {
        W3 w3 = Z3.a;
        e = new C0323x0("flowV2");
    }

    public C0199j1(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        this.a = str;
        this.b = str2;
        this.c = jSONObject;
        this.d = jSONObject2;
    }

    @Override // com.plaid.internal.InterfaceC0172g1
    public final String a(InterfaceC0270r1 interfaceC0270r1, C0251p c0251p) {
        C0323x0 c0323x0;
        InterfaceC0270r1.b a;
        int i;
        String str;
        c0251p.d = "v2";
        String str2 = this.a;
        String str3 = (String) AbstractC0306v1.b(str2).get("cid");
        if (str3 == null) {
            LinkedHashMap b = AbstractC0306v1.b(str2);
            str3 = (String) b.get("vfp");
            if (str3 == null) {
                str3 = (String) b.get("token");
            }
        }
        c0251p.e = str3;
        JSONObject jSONObject = this.c;
        boolean z = false;
        while (true) {
            C0251p.a aVar = new C0251p.a(this.a);
            c0251p.c.add(aVar);
            try {
                String jSONObject2 = jSONObject.toString();
                c0323x0 = e;
                W3 w3 = W3.TRACE;
                c0323x0.a(w3, "att request body: %s", jSONObject2);
                a = interfaceC0270r1.a(new InterfaceC0270r1.a(this.a, true, jSONObject2, ((Number) c0251p.f.a("connection-timeout-att", 10000, Number.class)).intValue()));
                i = a.b;
                aVar.b = i;
                if (i >= 200 && i <= 202) {
                    str = a.a;
                    c0323x0.a(w3, "att response body: %s", str);
                    if (z) {
                        break;
                    }
                    try {
                        if (new JSONObject(str).optInt("status", -1) != 1004) {
                            break;
                        }
                        JSONObject jSONObject3 = this.d;
                        String optString = jSONObject3 == null ? null : jSONObject3.optString("application-id");
                        if (optString == null) {
                            c0323x0.a(W3.DEBUG, "missing att1004.application-id, continue flow v2", new Object[0]);
                            break;
                        }
                        c0323x0.a(W3.DEBUG, "flow v2.5 detected, use application-id: %s", optString);
                        try {
                            JSONObject jSONObject4 = new JSONObject(jSONObject.toString());
                            try {
                                jSONObject4.putOpt("application-id", optString);
                                jSONObject = jSONObject4;
                                z = true;
                            } catch (JSONException e2) {
                                OptionalProvider$$ExternalSyntheticLambda0.m(e2);
                                return null;
                            }
                        } catch (JSONException e3) {
                            OptionalProvider$$ExternalSyntheticLambda0.m(e3);
                            return null;
                        }
                    } catch (JSONException unused) {
                    }
                } else {
                    break;
                }
            } catch (IOException e4) {
                throw new C0260q(T0.GENERIC_COMMUNICATION_ERROR, e4);
            }
        }
        if (i >= 300 && i < 400) {
            throw new C0260q(T0.AUTH_INVALID_RESPONSE, "Unexpected redirect in flow v2");
        }
        c0323x0.a(W3.INFO, "error response code: %i %s", Integer.valueOf(i), a.c);
        c0323x0.a(W3.DEBUG, "error response body: %s", a.a);
        if (i == 404) {
            throw new C0260q(T0.AUTH_BAD_CREDENTIALS);
        }
        if (i != 410) {
            throw new C0260q(T0.AUTH_INVALID_RESPONSE, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unsupported response status="));
        }
        throw new C0260q(T0.AUTH_VFP_KEY_EXPIRED);
        String encodeToString = Base64.encodeToString(str.getBytes(), 10);
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append("___");
        sb.append(encodeToString);
        sb.append(z ? "___R2" : "");
        return sb.toString();
    }

    public static C0199j1 a(String str) {
        String str2 = (String) AbstractC0306v1.b(str).get("data");
        if (str2 != null) {
            try {
                String str3 = new String(Base64.decode(str2, 8));
                e.a(W3.TRACE, "decoded data: %s", str3);
                JSONObject jSONObject = new JSONObject(str3);
                try {
                    String string2 = jSONObject.getString("url");
                    try {
                        String string3 = jSONObject.getString("vfp");
                        try {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                            try {
                                new URL(string2);
                                return new C0199j1(string2, string3, jSONObject2, jSONObject.optJSONObject("att-1004"));
                            } catch (MalformedURLException unused) {
                                throw new C0260q(T0.AUTH_MALFORMED_INPUT_DATA, Recorder$$ExternalSyntheticOutline2.m("Malformed url ", string2));
                            }
                        } catch (JSONException unused2) {
                            throw new C0260q(T0.AUTH_MALFORMED_INPUT_DATA, "Invalid flow.v2 data - missing data field");
                        }
                    } catch (JSONException unused3) {
                        throw new C0260q(T0.AUTH_MALFORMED_INPUT_DATA, "Invalid flow.v2 data - missing vfp field");
                    }
                } catch (JSONException unused4) {
                    throw new C0260q(T0.AUTH_MALFORMED_INPUT_DATA, "Invalid flow.v2 data - missing url field");
                }
            } catch (Exception unused5) {
                throw new C0260q(T0.AUTH_MALFORMED_INPUT_DATA, "Invalid flow.v2 data - cannot parse as json");
            }
        }
        throw new C0260q(T0.AUTH_MALFORMED_INPUT_DATA, "Invalid flow.v2 data - missing in url");
    }
}
