package com.anythink.core.common.m;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.AdError;
import com.anythink.core.basead.adx.api.ATAdxSetting;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.bm;
import com.anythink.core.common.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class s extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f14710a = "s";

    /* renamed from: b, reason: collision with root package name */
    public static final String f14711b = "sdk_custom";

    /* renamed from: f, reason: collision with root package name */
    private static final String f14712f = "YXBpdjQ=";

    /* renamed from: A, reason: collision with root package name */
    private JSONObject f14713A;

    /* renamed from: B, reason: collision with root package name */
    private final AtomicInteger f14714B = new AtomicInteger(0);

    /* renamed from: C, reason: collision with root package name */
    private ATAdRequest f14715C;

    /* renamed from: D, reason: collision with root package name */
    private String f14716D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f14717E;

    /* renamed from: F, reason: collision with root package name */
    private final bm f14718F;

    /* renamed from: c, reason: collision with root package name */
    Map<String, Object> f14719c;

    /* renamed from: d, reason: collision with root package name */
    long f14720d;

    /* renamed from: e, reason: collision with root package name */
    long f14721e;

    /* renamed from: g, reason: collision with root package name */
    private String f14722g;

    /* renamed from: h, reason: collision with root package name */
    private String f14723h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private Context f14724j;

    /* renamed from: k, reason: collision with root package name */
    private String f14725k;

    /* renamed from: l, reason: collision with root package name */
    private String f14726l;

    /* renamed from: u, reason: collision with root package name */
    private String f14727u;

    /* renamed from: v, reason: collision with root package name */
    private Map<String, Object> f14728v;

    /* renamed from: w, reason: collision with root package name */
    private Map<String, String> f14729w;

    /* renamed from: x, reason: collision with root package name */
    private int f14730x;

    /* renamed from: y, reason: collision with root package name */
    private JSONObject f14731y;

    /* renamed from: z, reason: collision with root package name */
    private String f14732z;

    public s(Context context, bm bmVar) {
        this.f14731y = null;
        this.f14718F = bmVar;
        if (bmVar != null) {
            this.f14725k = bmVar.b();
            this.f14726l = bmVar.c();
            this.f14724j = context;
            this.i = bmVar.d();
            this.f14722g = com.anythink.core.common.d.t.b().r();
            this.f14723h = com.anythink.core.common.d.t.b().g(this.i);
            this.f14727u = bmVar.e();
            this.f14719c = bmVar.f();
            this.f14728v = bmVar.g();
            this.f14730x = bmVar.h();
            this.f14729w = bmVar.i();
            this.f14731y = bmVar.k();
            this.f14732z = bmVar.l();
            this.f14713A = bmVar.m();
            this.f14715C = bmVar.j();
        }
    }

    private synchronized void t() {
        try {
            b();
            u();
        } catch (Throwable unused) {
        }
    }

    private static boolean u() {
        try {
            com.anythink.core.common.d.t.b();
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.anythink.core.common.m.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.m.a
    public String b() {
        if (!TextUtils.isEmpty(this.f14716D)) {
            return this.f14716D;
        }
        com.anythink.core.common.i.a();
        return com.anythink.core.common.i.c();
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        hashMap.put("Accept-Encoding", com.anythink.expressad.foundation.g.f.g.b.f19341d);
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
    public final boolean d_() {
        return true;
    }

    @Override // com.anythink.core.common.m.a
    public JSONObject e() {
        Object obj;
        Object obj2;
        JSONObject e9 = super.e();
        try {
            e9.put("app_id", this.f14725k);
            e9.put(e.bk, this.i);
            e9.put("session_id", this.f14723h);
            e9.put("nw_ver", com.anythink.core.common.v.m.g());
            e9.put("exclude_myofferid", com.anythink.core.common.r.a().a(this.f14724j));
            if (com.anythink.core.common.d.t.b().l() != null) {
                e9.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.EXCLUDE_OFFER, com.anythink.core.common.d.t.b().l());
            }
            String C8 = com.anythink.core.common.d.t.b().C();
            if (!TextUtils.isEmpty(C8)) {
                e9.put("sy_id", C8);
            }
            String D8 = com.anythink.core.common.d.t.b().D();
            if (TextUtils.isEmpty(D8)) {
                com.anythink.core.common.d.t.b().k(com.anythink.core.common.d.t.b().B());
                e9.put("bk_id", com.anythink.core.common.d.t.b().B());
            } else {
                e9.put("bk_id", D8);
            }
            JSONObject a9 = e.a(this.f14719c);
            if (a9 != null) {
                e9.put("custom", a9);
            }
            e9.put("deny", com.anythink.core.common.v.m.q(com.anythink.core.common.d.t.b().g()));
            if (com.anythink.core.common.d.t.b().z()) {
                com.anythink.core.common.d.t.b().A().fillRequestParam(e9);
            }
            Map<String, Object> map = this.f14728v;
            if (map != null && (obj2 = map.get(ATAdConst.KEY.CP_PLACEMENT_ID)) != null) {
                e9.put(e.ai, obj2.toString());
            }
            Map<String, String> map2 = this.f14729w;
            if (map2 != null && map2.size() != 0) {
                try {
                    e9.put("cached", new JSONObject(this.f14729w));
                } catch (Throwable unused) {
                }
            }
            e9.put(e.aq, this.f14730x);
            JSONObject a10 = com.anythink.core.c.b.a().a(this.i);
            if (a10 != null) {
                e9.put(e.ar, a10);
            }
            if (w.a().a(this.i)) {
                e9.put(e.as, 2);
            } else {
                e9.put(e.as, 1);
            }
            if (ATAdxSetting.getInstance().isAdxNetworkMode(this.i)) {
                e9.put(e.be, 1);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = this.f14731y;
                if (jSONObject2 != null && jSONObject2.length() > 0) {
                    Iterator<String> keys = this.f14731y.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, this.f14731y.get(next));
                    }
                }
                if (jSONObject.length() > 0) {
                    e9.put(e.bg, jSONObject.toString());
                }
            } catch (Throwable unused2) {
            }
            e9.put(e.bj, new JSONArray(ATAdConst.AD_SUPPORT_SDK_DSP_ID_ARRAY));
            if (!TextUtils.isEmpty(this.f14732z)) {
                e9.put(e.bm, this.f14732z);
                JSONObject jSONObject3 = this.f14713A;
                if (jSONObject3 != null) {
                    e9.put(e.bn, jSONObject3);
                }
            }
            ATAdRequest aTAdRequest = this.f14715C;
            if (aTAdRequest != null) {
                e9.put(e.bp, aTAdRequest.getChannelSource());
            } else {
                e9.put(e.bp, com.anythink.core.common.d.t.b().E());
            }
            Pair<Integer, List<String>> I8 = com.anythink.core.common.d.t.b().I();
            if (I8 != null && (obj = I8.first) != null) {
                e9.put(e.bq, ((Integer) obj).intValue());
            }
            com.anythink.core.d.b b9 = com.anythink.core.d.d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.d.t.b().p());
            if (b9 != null) {
                String f3 = b9.f();
                if (!TextUtils.isEmpty(f3)) {
                    e9.put(e.br, f3);
                }
            }
        } catch (JSONException unused3) {
        }
        return e9;
    }

    @Override // com.anythink.core.common.m.a
    public final JSONObject f() {
        return super.f();
    }

    @Override // com.anythink.core.common.m.a
    public final String h() {
        return this.f14725k;
    }

    @Override // com.anythink.core.common.m.a
    public final Context i() {
        return this.f14724j;
    }

    @Override // com.anythink.core.common.m.a
    public final String j() {
        return this.f14726l;
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, Object> k() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final int l() {
        return 191;
    }

    @Override // com.anythink.core.common.m.a
    public final com.anythink.core.common.m.b.d m() {
        return com.anythink.core.common.m.b.d.a(com.anythink.core.common.m.b.g.f14518a, this.i);
    }

    @Override // com.anythink.core.common.m.a
    public final List<String> q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j.aa.f12391a);
        return arrayList;
    }

    public final s s() {
        this.f14717E = true;
        return this;
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.m.a
    public final void a(int i, q qVar) {
        this.f14720d = System.currentTimeMillis();
        this.f14721e = SystemClock.elapsedRealtime();
        super.a(i, qVar);
    }

    @Override // com.anythink.core.common.m.a
    public void b(AdError adError) {
        com.anythink.core.common.u.e.a("placement", adError.getPlatformCode(), adError.getPlatformMSG(), b(), this.i, "", "", this.f14715C);
    }

    private void a(JSONObject jSONObject) {
        JSONObject a9 = com.anythink.core.c.b.a().a(this.i);
        if (a9 != null) {
            jSONObject.put(e.ar, a9);
        }
    }

    @Override // com.anythink.core.common.m.a
    public Object a(Object obj) {
        try {
            bm bmVar = this.f14718F;
            if (bmVar != null) {
                bmVar.b(this.f14717E);
            }
            com.anythink.core.common.u.e.a("placement", this.i, this.f14720d, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.f14721e, this.f14715C);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (this.f14719c != null) {
                    jSONObject.put(f14711b, new JSONObject(this.f14719c));
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return obj;
    }

    @Override // com.anythink.core.common.m.a
    public final void a(int i, int i6, String str, AdError adError) {
        if (this.f14411r != null) {
            u();
            this.f14411r.onLoadError(i, str, adError);
        }
        b(adError);
        a(i6);
    }

    @Override // com.anythink.core.common.m.a
    public final void a(int i) {
        try {
            t();
            super.a(i);
        } catch (Throwable unused) {
        }
    }

    public final s a(String str) {
        this.f14716D = str;
        return this;
    }
}
