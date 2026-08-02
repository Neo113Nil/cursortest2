package com.anythink.basead.i;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.AdError;
import com.anythink.core.common.h.aq;
import com.anythink.core.common.h.ay;
import com.anythink.core.common.t;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b extends com.anythink.core.common.m.a {

    /* renamed from: a, reason: collision with root package name */
    String f9863a;

    /* renamed from: b, reason: collision with root package name */
    JSONObject f9864b;

    public b(int i, ay ayVar, String str) {
        String str2 = "";
        try {
            switch (i) {
                case 1:
                    str2 = ayVar.f();
                    break;
                case 2:
                    str2 = ayVar.g();
                    break;
                case 3:
                    str2 = ayVar.ay();
                    break;
                case 4:
                    str2 = ayVar.az();
                    break;
                case 5:
                    str2 = ayVar.aA();
                    break;
                case 6:
                    str2 = ayVar.aB();
                    break;
                case 7:
                    str2 = ayVar.aC();
                    break;
                case 8:
                    str2 = ayVar.aD();
                    break;
                case 9:
                    str2 = ayVar.aE();
                    break;
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            Uri parse = Uri.parse(ayVar.ak(str2));
            this.f9863a = parse.getScheme() + "://" + parse.getAuthority() + parse.getPath();
            this.f9864b = new JSONObject();
            for (String str3 : parse.getQueryParameterNames()) {
                this.f9864b.put(str3, URLEncoder.encode(parse.getQueryParameter(str3)));
            }
            this.f9864b.put("req_id", str);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // com.anythink.core.common.m.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.m.a
    public final void b(AdError adError) {
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Encoding", com.anythink.expressad.foundation.g.f.g.b.f20128d);
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        return hashMap;
    }

    @Override // com.anythink.core.common.m.a
    public final byte[] d() {
        JSONObject jSONObject = this.f9864b;
        if (jSONObject == null) {
            return new byte[0];
        }
        try {
            jSONObject.put("t", String.valueOf(System.currentTimeMillis()));
        } catch (Exception unused) {
        }
        return com.anythink.core.common.m.a.b(this.f9864b.toString());
    }

    @Override // com.anythink.core.common.m.a
    public final String g() {
        return "";
    }

    @Override // com.anythink.core.common.m.a
    public final String h() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final Context i() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final String j() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, Object> k() {
        return null;
    }

    public final String n() {
        return this.f9863a;
    }

    @Override // com.anythink.core.common.m.a
    public final Object a(Object obj) {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final String b() {
        return this.f9863a;
    }

    public final void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f9864b.put("scenario", str);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
        JSONObject jSONObject = new JSONObject();
        Map<String, String> c9 = c();
        if (c9 != null) {
            try {
                for (String str : c9.keySet()) {
                    jSONObject.put(str, c9.get(str));
                }
            } catch (Exception unused) {
            }
        }
        String jSONObject2 = jSONObject.toString();
        JSONObject jSONObject3 = this.f9864b;
        t.a().a(1, b(), jSONObject2, jSONObject3 != null ? jSONObject3.toString() : "", aq.a(1000));
        com.anythink.core.common.u.e.a("tk", adError.getPlatformCode(), adError.getPlatformMSG(), this.f9863a, "", "1", "", (ATAdRequest) null);
    }
}
