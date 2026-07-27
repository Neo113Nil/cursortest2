package com.anythink.basead.i;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.b.b.j;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.x;
import com.anythink.core.common.i;
import com.anythink.core.common.m.o;
import com.anythink.core.common.v.k;
import com.anythink.core.common.v.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d extends com.anythink.core.common.m.a {

    /* renamed from: a, reason: collision with root package name */
    String f9081a;

    /* renamed from: b, reason: collision with root package name */
    String f9082b;

    /* renamed from: c, reason: collision with root package name */
    String f9083c;

    /* renamed from: d, reason: collision with root package name */
    int f9084d;

    /* renamed from: e, reason: collision with root package name */
    int f9085e;

    /* renamed from: f, reason: collision with root package name */
    int f9086f;

    /* renamed from: g, reason: collision with root package name */
    int f9087g;

    /* renamed from: h, reason: collision with root package name */
    String[] f9088h;
    int i;

    /* renamed from: j, reason: collision with root package name */
    int f9089j;

    /* renamed from: k, reason: collision with root package name */
    String f9090k;

    /* renamed from: l, reason: collision with root package name */
    String f9091l = "OnlineOfferLoader";

    public d(x xVar, int i, int i6, String[] strArr, String str) {
        this.f9081a = xVar.f14158d;
        this.f9082b = xVar.f14156b;
        this.f9083c = xVar.f14157c;
        this.i = xVar.f14159e;
        this.f9086f = i;
        this.f9087g = i6;
        this.f9088h = strArr;
        this.f9084d = xVar.f14162h;
        this.f9085e = xVar.i;
        this.f9089j = xVar.f14163j;
        this.f9090k = str;
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
        hashMap.put("Content-Encoding", com.anythink.expressad.foundation.g.f.g.b.f19341d);
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        return hashMap;
    }

    @Override // com.anythink.core.common.m.a
    public final byte[] d() {
        try {
            return g().getBytes(com.anythink.expressad.foundation.g.a.bR);
        } catch (Exception unused) {
            return g().getBytes();
        }
    }

    @Override // com.anythink.core.common.m.a
    public final JSONObject e() {
        JSONObject e9 = super.e();
        try {
            e9.put("app_id", t.b().p());
            e9.put(com.anythink.core.common.m.e.bk, this.f9082b);
            e9.put("session_id", t.b().g(this.f9082b));
            e9.put("t_g_id", this.f9084d);
            e9.put("gro_id", this.f9085e);
            String C8 = t.b().C();
            if (!TextUtils.isEmpty(C8)) {
                e9.put("sy_id", C8);
            }
            String D8 = t.b().D();
            if (TextUtils.isEmpty(D8)) {
                t.b().k(t.b().B());
                e9.put("bk_id", t.b().B());
            } else {
                e9.put("bk_id", D8);
            }
            e9.put("deny", m.q(t.b().g()));
            JSONObject a9 = com.anythink.core.common.m.e.a(this.f9082b);
            if (a9 != null) {
                e9.put("customs", a9);
            }
            com.anythink.core.common.m.e.a(e9);
        } catch (Exception unused) {
        }
        return e9;
    }

    @Override // com.anythink.core.common.m.a
    public final JSONObject f() {
        return super.f();
    }

    @Override // com.anythink.core.common.m.a
    public final String g() {
        HashMap hashMap = new HashMap();
        String a9 = k.a(e().toString());
        String a10 = k.a(f().toString());
        hashMap.put("p", a9);
        hashMap.put(com.anythink.core.common.m.e.f14631W, a10);
        hashMap.put("request_id", this.f9081a);
        hashMap.put("ad_source_id", Integer.valueOf(Integer.parseInt(this.f9083c)));
        hashMap.put(com.anythink.expressad.a.f17625h, Integer.valueOf(this.i));
        String[] strArr = this.f9088h;
        char c9 = 0;
        if (strArr != null && strArr.length > 0) {
            JSONArray jSONArray = new JSONArray();
            for (String str : this.f9088h) {
                jSONArray.put(str);
            }
            hashMap.put("exclude_offers", jSONArray);
        }
        if (t.b().l() != null) {
            hashMap.put(com.anythink.core.b.a.a.f11630c, k.a(t.b().l().toString()));
        }
        int i = this.f9086f;
        if (i > 0 && this.f9087g > 0) {
            hashMap.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_WIDTH, Integer.valueOf(i));
            hashMap.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_HEIGHT, Integer.valueOf(this.f9087g));
        }
        JSONObject jSONObject = new JSONObject(hashMap);
        try {
            String valueOf = String.valueOf(this.f9089j);
            switch (valueOf.hashCode()) {
                case j.f5817X /* 49 */:
                    if (valueOf.equals("1")) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 50:
                    if (valueOf.equals("2")) {
                        break;
                    }
                    c9 = 65535;
                    break;
                case 51:
                    if (valueOf.equals("3")) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 52:
                    if (valueOf.equals("4")) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            if (c9 == 0 || c9 == 1 || c9 == 2 || c9 == 3) {
                jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.ADP_ACCEPT_TYPE, new JSONArray(ATAdConst.AD_SUPPORT_TYPE_ARRAY));
                jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.ADP_ACCEPT_VAST_VER, new JSONArray(ATAdConst.AD_SUPPORT_VAST_VERSION_ARRAY));
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
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

    @Override // com.anythink.core.common.m.a
    public final int l() {
        return com.anythink.expressad.video.module.a.a.f21731U;
    }

    @Override // com.anythink.core.common.m.a
    public final Object a(Object obj) {
        return obj;
    }

    @Override // com.anythink.core.common.m.a
    public final String b() {
        i.a();
        return i.f();
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.m.a
    public final void a(int i, Object obj) {
        if (obj == null) {
            a(i, o.f14702m, "Return Empty Ad.", ErrorCode.getErrorCode(ErrorCode.noADError, "", ""));
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(obj.toString());
            if (TextUtils.isEmpty(jSONObject.optString("data"))) {
                a(i, o.f14703n, obj.toString(), ErrorCode.getErrorCode(ErrorCode.noADError, "", obj.toString()));
            } else {
                super.a(i, jSONObject);
            }
        } catch (Throwable unused) {
            a(i, o.f14704o, obj.toString(), ErrorCode.getErrorCode(ErrorCode.noADError, "", obj.toString()));
        }
    }
}
