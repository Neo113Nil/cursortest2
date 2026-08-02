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
    private static final String f15496a = "s";

    /* renamed from: b, reason: collision with root package name */
    public static final String f15497b = "sdk_custom";

    /* renamed from: f, reason: collision with root package name */
    private static final String f15498f = "YXBpdjQ=";

    /* renamed from: A, reason: collision with root package name */
    private JSONObject f15499A;

    /* renamed from: B, reason: collision with root package name */
    private final AtomicInteger f15500B = new AtomicInteger(0);

    /* renamed from: C, reason: collision with root package name */
    private ATAdRequest f15501C;

    /* renamed from: D, reason: collision with root package name */
    private String f15502D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f15503E;

    /* renamed from: F, reason: collision with root package name */
    private final bm f15504F;

    /* renamed from: c, reason: collision with root package name */
    Map<String, Object> f15505c;

    /* renamed from: d, reason: collision with root package name */
    long f15506d;

    /* renamed from: e, reason: collision with root package name */
    long f15507e;

    /* renamed from: g, reason: collision with root package name */
    private String f15508g;

    /* renamed from: h, reason: collision with root package name */
    private String f15509h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private Context f15510j;

    /* renamed from: k, reason: collision with root package name */
    private String f15511k;

    /* renamed from: l, reason: collision with root package name */
    private String f15512l;

    /* renamed from: u, reason: collision with root package name */
    private String f15513u;

    /* renamed from: v, reason: collision with root package name */
    private Map<String, Object> f15514v;

    /* renamed from: w, reason: collision with root package name */
    private Map<String, String> f15515w;

    /* renamed from: x, reason: collision with root package name */
    private int f15516x;

    /* renamed from: y, reason: collision with root package name */
    private JSONObject f15517y;

    /* renamed from: z, reason: collision with root package name */
    private String f15518z;

    public s(Context context, bm bmVar) {
        this.f15517y = null;
        this.f15504F = bmVar;
        if (bmVar != null) {
            this.f15511k = bmVar.b();
            this.f15512l = bmVar.c();
            this.f15510j = context;
            this.i = bmVar.d();
            this.f15508g = com.anythink.core.common.d.t.b().r();
            this.f15509h = com.anythink.core.common.d.t.b().g(this.i);
            this.f15513u = bmVar.e();
            this.f15505c = bmVar.f();
            this.f15514v = bmVar.g();
            this.f15516x = bmVar.h();
            this.f15515w = bmVar.i();
            this.f15517y = bmVar.k();
            this.f15518z = bmVar.l();
            this.f15499A = bmVar.m();
            this.f15501C = bmVar.j();
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
        if (!TextUtils.isEmpty(this.f15502D)) {
            return this.f15502D;
        }
        com.anythink.core.common.i.a();
        return com.anythink.core.common.i.c();
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        hashMap.put("Accept-Encoding", com.anythink.expressad.foundation.g.f.g.b.f20128d);
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
            e9.put("app_id", this.f15511k);
            e9.put(e.bk, this.i);
            e9.put("session_id", this.f15509h);
            e9.put("nw_ver", com.anythink.core.common.v.m.g());
            e9.put("exclude_myofferid", com.anythink.core.common.r.a().a(this.f15510j));
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
            JSONObject a9 = e.a(this.f15505c);
            if (a9 != null) {
                e9.put("custom", a9);
            }
            e9.put("deny", com.anythink.core.common.v.m.q(com.anythink.core.common.d.t.b().g()));
            if (com.anythink.core.common.d.t.b().z()) {
                com.anythink.core.common.d.t.b().A().fillRequestParam(e9);
            }
            Map<String, Object> map = this.f15514v;
            if (map != null && (obj2 = map.get(ATAdConst.KEY.CP_PLACEMENT_ID)) != null) {
                e9.put(e.ai, obj2.toString());
            }
            Map<String, String> map2 = this.f15515w;
            if (map2 != null && map2.size() != 0) {
                try {
                    e9.put("cached", new JSONObject(this.f15515w));
                } catch (Throwable unused) {
                }
            }
            e9.put(e.aq, this.f15516x);
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
                JSONObject jSONObject2 = this.f15517y;
                if (jSONObject2 != null && jSONObject2.length() > 0) {
                    Iterator<String> keys = this.f15517y.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, this.f15517y.get(next));
                    }
                }
                if (jSONObject.length() > 0) {
                    e9.put(e.bg, jSONObject.toString());
                }
            } catch (Throwable unused2) {
            }
            e9.put(e.bj, new JSONArray(ATAdConst.AD_SUPPORT_SDK_DSP_ID_ARRAY));
            if (!TextUtils.isEmpty(this.f15518z)) {
                e9.put(e.bm, this.f15518z);
                JSONObject jSONObject3 = this.f15499A;
                if (jSONObject3 != null) {
                    e9.put(e.bn, jSONObject3);
                }
            }
            ATAdRequest aTAdRequest = this.f15501C;
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
                String f2 = b9.f();
                if (!TextUtils.isEmpty(f2)) {
                    e9.put(e.br, f2);
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
        return this.f15511k;
    }

    @Override // com.anythink.core.common.m.a
    public final Context i() {
        return this.f15510j;
    }

    @Override // com.anythink.core.common.m.a
    public final String j() {
        return this.f15512l;
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
        return com.anythink.core.common.m.b.d.a(com.anythink.core.common.m.b.g.f15304a, this.i);
    }

    @Override // com.anythink.core.common.m.a
    public final List<String> q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j.aa.f13177a);
        return arrayList;
    }

    public final s s() {
        this.f15503E = true;
        return this;
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.m.a
    public final void a(int i, q qVar) {
        this.f15506d = System.currentTimeMillis();
        this.f15507e = SystemClock.elapsedRealtime();
        super.a(i, qVar);
    }

    @Override // com.anythink.core.common.m.a
    public void b(AdError adError) {
        com.anythink.core.common.u.e.a("placement", adError.getPlatformCode(), adError.getPlatformMSG(), b(), this.i, "", "", this.f15501C);
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
            bm bmVar = this.f15504F;
            if (bmVar != null) {
                bmVar.b(this.f15503E);
            }
            com.anythink.core.common.u.e.a("placement", this.i, this.f15506d, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.f15507e, this.f15501C);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (this.f15505c != null) {
                    jSONObject.put(f15497b, new JSONObject(this.f15505c));
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return obj;
    }

    @Override // com.anythink.core.common.m.a
    public final void a(int i, int i4, String str, AdError adError) {
        if (this.f15197r != null) {
            u();
            this.f15197r.onLoadError(i, str, adError);
        }
        b(adError);
        a(i4);
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
        this.f15502D = str;
        return this;
    }
}
