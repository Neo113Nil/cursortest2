package com.plaid.internal;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class H {
    public static String a(r rVar, C0251p c0251p) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (InterfaceC0277s interfaceC0277s : c0251p.c) {
                jSONArray.put(new JSONObject().put("u", C0330x7.a(interfaceC0277s.b())).put("s", interfaceC0277s.a()));
            }
            String str = c0251p.e;
            if (str != null) {
                jSONObject.put("cid", C0330x7.a(str));
            }
            EnumC0223l7 enumC0223l7 = rVar.a;
            if (enumC0223l7 != null) {
                jSONObject.put("st", enumC0223l7.getCode());
            }
            if (rVar.a() != null) {
                jSONObject.put("er", rVar.a().getCode());
            }
            jSONObject.put("os", "and").put("v", 20901).put("fl", c0251p.d).put("rq", jSONArray);
        } catch (JSONException unused) {
        }
        return Base64.encodeToString(("client-error:" + jSONObject).getBytes(StandardCharsets.UTF_8), 10);
    }
}
