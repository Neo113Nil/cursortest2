package com.anythink.core.b;

import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBidRequestInfo;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.AdError;
import com.anythink.core.b.i;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.ap;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.z;
import com.anythink.core.common.m.q;
import com.anythink.core.common.v.ab;
import com.anythink.core.common.v.ae;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class e extends d {

    /* renamed from: j, reason: collision with root package name */
    public static final double f11816j = 10000.0d;

    /* renamed from: k, reason: collision with root package name */
    final String f11817k;

    /* renamed from: l, reason: collision with root package name */
    protected final List<JSONObject> f11818l;

    /* renamed from: m, reason: collision with root package name */
    List<bv> f11819m;

    /* renamed from: n, reason: collision with root package name */
    List<bv> f11820n;

    /* renamed from: o, reason: collision with root package name */
    String f11821o;

    /* renamed from: p, reason: collision with root package name */
    String f11822p;

    /* renamed from: q, reason: collision with root package name */
    String f11823q;

    /* renamed from: r, reason: collision with root package name */
    com.anythink.core.b.b.b f11824r;

    /* renamed from: s, reason: collision with root package name */
    long f11825s;

    /* renamed from: t, reason: collision with root package name */
    protected AtomicBoolean f11826t;

    /* renamed from: u, reason: collision with root package name */
    protected AtomicBoolean f11827u;

    /* renamed from: v, reason: collision with root package name */
    ConcurrentHashMap<String, bv> f11828v;

    /* renamed from: w, reason: collision with root package name */
    ConcurrentHashMap<String, bv> f11829w;

    /* renamed from: x, reason: collision with root package name */
    ConcurrentHashMap<String, bv> f11830x;

    /* renamed from: y, reason: collision with root package name */
    ConcurrentHashMap<String, bv> f11831y;

    /* renamed from: z, reason: collision with root package name */
    com.anythink.core.common.t.b f11832z;

    public e(com.anythink.core.common.h.a aVar) {
        super(aVar);
        this.f11817k = getClass().getSimpleName().concat(":");
        this.f11818l = new ArrayList();
        this.f11819m = new ArrayList();
        this.f11820n = new ArrayList();
        this.f11826t = new AtomicBoolean(false);
        this.f11827u = new AtomicBoolean(false);
        this.f11828v = new ConcurrentHashMap<>();
        this.f11829w = new ConcurrentHashMap<>();
        this.f11830x = new ConcurrentHashMap<>();
        this.f11831y = new ConcurrentHashMap<>();
        this.f11832z = new com.anythink.core.common.t.b() { // from class: com.anythink.core.b.e.1
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.b.e.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.this.g();
                    }
                });
            }
        };
        List<bv> list = aVar.f13334j;
        if (list != null && list.size() > 0) {
            for (bv bvVar : aVar.f13334j) {
                if (bvVar != null) {
                    this.f11828v.put(bvVar.z(), bvVar);
                    this.f11830x.put(bvVar.z(), bvVar);
                }
            }
        }
        List<bv> list2 = aVar.f13335k;
        if (list2 != null && list2.size() > 0) {
            for (bv bvVar2 : aVar.f13335k) {
                this.f11829w.put(bvVar2.z(), bvVar2);
                this.f11831y.put(bvVar2.z(), bvVar2);
            }
        }
        JSONObject jSONObject = aVar.f13342r;
        if (jSONObject != null) {
            this.f11818l.add(jSONObject);
        }
        this.f11821o = aVar.f13329d;
        this.f11822p = aVar.f13330e;
        this.f11823q = b();
    }

    private void b(long j6) {
        com.anythink.core.common.t.d.a().a(this.f11832z, j6, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c(final long j6) {
        try {
            try {
                if (this.f11827u.get()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                final ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                a(arrayList, concurrentHashMap, concurrentHashMap2);
                this.f11827u.set(true);
                a(arrayList, new q() { // from class: com.anythink.core.b.e.3
                    @Override // com.anythink.core.common.m.q
                    public final void onLoadCanceled(int i) {
                        synchronized (e.this) {
                            try {
                                if (e.this.f11738h.get()) {
                                    e eVar = e.this;
                                    String str = eVar.f11817k;
                                    String str2 = eVar.f11736f.f13330e;
                                } else {
                                    e.this.f11827u.set(false);
                                    e.this.d();
                                    e.this.a(null, SystemClock.elapsedRealtime() - j6, "onLoadCanceled.", concurrentHashMap, concurrentHashMap2);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadError(int i, String str, AdError adError) {
                        synchronized (e.this) {
                            try {
                                if (e.this.f11738h.get()) {
                                    e eVar = e.this;
                                    String str2 = eVar.f11817k;
                                    String str3 = eVar.f11736f.f13330e;
                                } else {
                                    e.this.f11827u.set(false);
                                    e.this.d();
                                    e.this.a(null, SystemClock.elapsedRealtime() - j6, adError != null ? adError.getPlatformMSG() : "", concurrentHashMap, concurrentHashMap2);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadFinish(int i, Object obj) {
                        synchronized (e.this) {
                            try {
                                if (e.this.f11738h.get()) {
                                    e eVar = e.this;
                                    String str = eVar.f11817k;
                                    String str2 = eVar.f11736f.f13330e;
                                } else {
                                    e.this.f11827u.set(false);
                                    long elapsedRealtime = SystemClock.elapsedRealtime() - j6;
                                    e.this.a(e.a(obj), elapsedRealtime, null, concurrentHashMap, concurrentHashMap2);
                                    e.this.d();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadStart(int i) {
                    }
                });
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void f() {
        com.anythink.core.common.t.d.a().b(this.f11832z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void g() {
        if (this.f11738h.get()) {
            return;
        }
        this.f11826t.set(true);
        if (this.f11818l.size() > 0) {
            c(SystemClock.elapsedRealtime());
        }
    }

    private boolean h() {
        return this.f11826t.get() && !this.f11827u.get();
    }

    private synchronized void i() {
        try {
            try {
                if (!this.f11738h.get()) {
                    this.f11738h.set(true);
                    f();
                    this.f11830x.clear();
                    a(0L, -3, ATBidRequestInfo.BIDDING_REQUEST_TIMEOUT_TYPE, this.f11828v);
                    a(0L, -3, ATBidRequestInfo.BIDDING_REQUEST_TIMEOUT_TYPE, this.f11829w);
                    l();
                    k();
                    j();
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    private void j() {
        com.anythink.core.b.b.b bVar;
        if ((this.f11820n.size() > 0 || this.f11819m.size() > 0) && (bVar = this.f11824r) != null) {
            bVar.a(this.f11820n, this.f11819m);
        }
        this.f11820n.clear();
        this.f11819m.clear();
    }

    private synchronized void k() {
        if (m()) {
            this.f11738h.set(true);
        }
    }

    private void l() {
        if (ATSDK.isNetworkLogDebug()) {
            if (this.f11820n.size() > 0 || this.f11819m.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("PlacementId", this.f11736f.f13330e);
                    if (this.f11736f.f13343s.ah()) {
                        jSONObject.put("isAdxNetworkMode", true);
                    }
                    jSONObject.put("S2S HeadBidding Success List", d.a(this.f11820n));
                    jSONObject.put("S2S HeadBidding Fail List", d.a(this.f11819m));
                } catch (Exception unused) {
                }
                ab.a(ab.f16621a, jSONObject.toString(), false);
            }
        }
    }

    private boolean m() {
        return this.f11828v.size() == 0 && this.f11829w.size() == 0 && this.f11830x.size() == 0;
    }

    public abstract void a(List<JSONObject> list, q qVar);

    public abstract String b();

    public final synchronized void d() {
        if (e()) {
            com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.b.e.4
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (e.this) {
                        try {
                            if (e.this.e()) {
                                e.this.c(SystemClock.elapsedRealtime());
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }
    }

    public final boolean e() {
        return !this.f11827u.get() && this.f11818l.size() > 0;
    }

    private static List<ad> b(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof JSONObject) {
            JSONArray optJSONArray = ((JSONObject) obj).optJSONArray("data");
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(ad.a(optJSONArray.optJSONObject(i)));
            }
        }
        return arrayList;
    }

    @Override // com.anythink.core.b.d
    public final void a(boolean z3) {
        this.f11737g = z3;
    }

    @Override // com.anythink.core.b.d
    public final void a(com.anythink.core.b.b.b bVar) {
        List<bv> list;
        this.f11825s = SystemClock.elapsedRealtime();
        this.f11824r = bVar;
        if (ATSDK.isNetworkLogDebug()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("PlacementId", this.f11736f.f13330e);
                if (this.f11736f.f13343s.ah()) {
                    jSONObject.put("isAdxNetworkMode", true);
                }
                jSONObject.put("S2S Start HeadBidding List", d.a(this.f11736f.f13334j));
                jSONObject.put("S2S Start HeadBidding List(Directly)", d.b(this.f11818l));
            } catch (Exception unused) {
            }
            ab.a(ab.f16621a, jSONObject.toString(), false);
        }
        if (this.f11736f.f13334j.size() == 0 && (list = this.f11736f.f13335k) != null && list.size() > 0) {
            c(this.f11825s);
            return;
        }
        long n9 = this.f11736f.f13338n.n();
        if (n9 <= 0) {
            n9 = 500;
        }
        com.anythink.core.common.t.d.a().a(this.f11832z, n9, false);
        Iterator<Map.Entry<String, bv>> it = this.f11828v.entrySet().iterator();
        while (it.hasNext()) {
            bv value = it.next().getValue();
            if (value.g() == 66) {
                com.anythink.core.common.a.i.a(this.f11736f.f13327b).a(value.z(), System.currentTimeMillis());
            }
            new i(this.f11736f).a(value, new i.a() { // from class: com.anythink.core.b.e.2
                @Override // com.anythink.core.b.i.a
                public final void onBidTokenObtainFail(String str, bv bvVar) {
                    if (e.this.f11738h.get()) {
                        return;
                    }
                    bvVar.m(SystemClock.elapsedRealtime() - e.this.f11825s);
                    if (str == null) {
                        str = "";
                    }
                    e.this.f11830x.remove(bvVar.z());
                    e.this.f11828v.remove(bvVar.z());
                    e.a(e.this, str, bvVar);
                    switch (str) {
                        case "This network don't support header bidding in current TopOn's version.":
                        case "Network init error.":
                        case "The parameter is abnormal.":
                        case "There is no Network Adapter.":
                            e.this.b(bvVar, str, 0L, -9);
                            break;
                        case "Request Token or Custom bid info Timeout.":
                        case "Network BidToken or Custom bid info is Empty.":
                            e.this.b(bvVar, str, 0L, -2);
                            break;
                        default:
                            e.this.b(bvVar, "Unknown error: ".concat(str), 0L, -9);
                            break;
                    }
                    e.a(e.this, (JSONObject) null, (bv) null);
                }

                @Override // com.anythink.core.b.i.a
                public final void onBidTokenObtainStart(bv bvVar, ATBaseAdAdapter aTBaseAdAdapter) {
                    com.anythink.core.b.b.b bVar2 = e.this.f11824r;
                    if (bVar2 != null) {
                        bVar2.a(bvVar, aTBaseAdAdapter);
                    }
                }

                @Override // com.anythink.core.b.i.a
                public final void onBidTokenObtainSuccess(bv bvVar, JSONObject jSONObject2) {
                    if (e.this.f11738h.get()) {
                        return;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    bvVar.m(elapsedRealtime - e.this.f11825s);
                    bvVar.a(elapsedRealtime);
                    e.this.f11830x.remove(bvVar.z());
                    e.a(e.this, bvVar);
                    if (!e.this.f11826t.get() || e.this.f11826t.get()) {
                        e.a(e.this, jSONObject2, bvVar);
                    } else {
                        onBidTokenObtainFail(ATBidRequestInfo.BIDTOKEN_OBTAIN_TIMEOUT_TYPE, bvVar);
                    }
                }
            });
        }
    }

    private void b(bv bvVar) {
        int g4 = bvVar.g();
        com.anythink.core.common.u.e.a(bvVar, this.f11736f, bvVar.X(), true, f.a().b(g4));
        f.a().a(g4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(bv bvVar, String str, long j6, int i) {
        long j9 = 0;
        if (j6 > 0) {
            try {
                j9 = bvVar.X() + j6;
            } catch (Throwable th) {
                throw th;
            }
        }
        d.a(bvVar, str, j9, i);
        this.f11819m.add(bvVar);
    }

    private static void b(bv bvVar, ad adVar) {
        ap aW;
        if (bvVar == null || adVar == null || (aW = bvVar.aW()) == null) {
            return;
        }
        aW.b(adVar.m());
        aW.d(adVar.n());
        aW.a(adVar.o());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(JSONObject jSONObject, bv bvVar) {
        boolean z3;
        Throwable th;
        if (this.f11830x.size() == 0) {
            f();
            if (!this.f11827u.get()) {
                z3 = true;
                synchronized (this) {
                    if (jSONObject != null && bvVar != null) {
                        try {
                            this.f11818l.add(jSONObject);
                            this.f11831y.put(bvVar.z(), bvVar);
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    try {
                        if (this.f11818l.size() > 0 && (z3 || (this.f11826t.get() && !this.f11827u.get()))) {
                            c(this.f11825s);
                            return;
                        } else {
                            if (this.f11819m.size() <= 0 || !m()) {
                                return;
                            }
                            a(null, 0L, "", null, null);
                            return;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
            }
        }
        z3 = false;
        synchronized (this) {
        }
    }

    public synchronized void a(List<JSONObject> list, Map<String, bv> map, Map<String, JSONObject> map2) {
        try {
            for (JSONObject jSONObject : this.f11818l) {
                list.add(jSONObject);
                map2.put(jSONObject.optString("ad_source_id"), jSONObject);
            }
            this.f11818l.clear();
            ConcurrentHashMap<String, bv> concurrentHashMap = this.f11831y;
            if (concurrentHashMap != null) {
                Iterator<Map.Entry<String, bv>> it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    bv value = it.next().getValue();
                    if (value != null) {
                        value.b(SystemClock.elapsedRealtime());
                    }
                }
            }
            map.putAll(this.f11831y);
            this.f11831y.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(long j6, int i, String str, Map<String, bv> map) {
        for (bv bvVar : map.values()) {
            if (a(bvVar, str, i)) {
                this.f11820n.add(bvVar);
            } else {
                b(bvVar, str, j6, i);
            }
        }
        map.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(List<ad> list, long j6, String str, Map<String, bv> map, Map<String, JSONObject> map2) {
        Throwable th;
        e eVar;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    Collections.sort(list);
                    for (int i = 0; i < list.size(); i++) {
                        ad adVar = list.get(i);
                        this.f11828v.remove(adVar.f13428k);
                        bv remove = map.remove(adVar.f13428k);
                        if (this.f11829w.containsKey(adVar.f13428k)) {
                            try {
                                remove = this.f11829w.remove(adVar.f13428k);
                                this.f11829w.clear();
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        if (remove != null) {
                            if (adVar.isSuccessWithUseType()) {
                                int i6 = i + 1;
                                double sortPrice = i6 < list.size() ? list.get(i6).getSortPrice() : 0.0d;
                                eVar = this;
                                try {
                                    eVar.a(remove.g(), adVar, sortPrice, adVar.isSamePrice());
                                    ap aW = remove.aW();
                                    if (aW != null) {
                                        aW.b(adVar.m());
                                        aW.d(adVar.n());
                                        aW.a(adVar.o());
                                    }
                                    JSONObject jSONObject = map2.get(remove.z());
                                    if (jSONObject != null) {
                                        String optString = jSONObject.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BID_TOKEN);
                                        if (TextUtils.isEmpty(optString)) {
                                            optString = jSONObject.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BUYERUID);
                                        }
                                        remove.toString();
                                        adVar.c(optString);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    th = th;
                                    throw th;
                                }
                            } else {
                                eVar = this;
                            }
                            a(remove, adVar, j6);
                            if (remove.g() == 66) {
                                com.anythink.core.common.a.i.a(eVar.f11736f.f13327b).a(remove.z(), adVar.f13440w);
                            }
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        if (map != null) {
            for (String str2 : map.keySet()) {
                if (str2 != null) {
                    this.f11828v.remove(str2);
                }
                if (this.f11829w.containsKey(str2)) {
                    this.f11829w.clear();
                }
            }
        }
        if (map != null) {
            try {
                a(j6, -4, TextUtils.isEmpty(str) ? "No Response error." : "No Response error." + str, map);
            } catch (Throwable th5) {
                th = th5;
                th = th;
                throw th;
            }
        }
        if (this.f11820n.size() >= 2) {
            Collections.sort(this.f11820n);
        }
        l();
        k();
        j();
    }

    private static void a(Map<String, JSONObject> map, bv bvVar, ad adVar) {
        JSONObject jSONObject = map.get(bvVar.z());
        if (jSONObject != null) {
            String optString = jSONObject.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BID_TOKEN);
            if (TextUtils.isEmpty(optString)) {
                optString = jSONObject.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BUYERUID);
            }
            bvVar.toString();
            String str = adVar.token;
            adVar.c(optString);
        }
    }

    private void a(String str, bv bvVar) {
        if (TextUtils.equals(str, ATBidRequestInfo.NO_ADAPTER_ERROR_TYPE) || TextUtils.equals(str, ATBidRequestInfo.NO_SUPPORT_BIDDING_TYPE)) {
            return;
        }
        int g4 = bvVar.g();
        com.anythink.core.common.u.e.a(bvVar, this.f11736f, bvVar.X(), false, f.a().b(g4));
        f.a().a(g4);
    }

    @Override // com.anythink.core.b.d
    public void a(bv bvVar, z zVar, long j6) {
        String g4;
        if (zVar instanceof ad) {
            ad adVar = (ad) zVar;
            boolean isSuccessWithUseType = adVar.isSuccessWithUseType();
            boolean a9 = d.a(isSuccessWithUseType, bvVar, zVar);
            int i = 0;
            AdError a10 = ae.a(0, this.f11736f.f13343s, bvVar, zVar);
            int i6 = 1;
            boolean z3 = a10 != null;
            if (isSuccessWithUseType && !a9 && !z3) {
                bvVar.c(j6 > 0 ? bvVar.X() + j6 : 0L);
                this.f11820n.add(bvVar);
                if (bvVar.q() == 3 || bvVar.q() == 7) {
                    adVar.f13424f = System.currentTimeMillis() + adVar.f13423e;
                } else {
                    adVar.f13424f = System.currentTimeMillis() + bvVar.s();
                }
                a(bvVar, adVar);
                return;
            }
            if (a9) {
                b(bvVar, ATBidRequestInfo.LESS_THAN_BID_FLOOR_TYPE, j6, -11);
                bvVar.b(zVar.getPrice());
                bvVar.e(zVar.getSortPrice());
                a(adVar, bvVar);
                return;
            }
            if (z3) {
                b(bvVar, a10.getPlatformMSG(), j6, -13);
                bvVar.b(zVar.getPrice());
                bvVar.e(zVar.getSortPrice());
                b(adVar, bvVar);
                return;
            }
            if (adVar.useType == 2) {
                bvVar.V();
                g4 = "filter by s2s bid max count";
            } else {
                StringBuilder sb = new StringBuilder("errorCode:[");
                sb.append(adVar.f13419a);
                sb.append("],errorMsg:[");
                g4 = u1.h.g(sb, adVar.errorMsg, "]");
                i6 = 0;
                i = -1;
            }
            if (a(bvVar, g4, i, i6)) {
                this.f11820n.add(bvVar);
            } else {
                b(bvVar, g4, j6, i);
            }
        }
    }

    @Override // com.anythink.core.b.d
    public final void a() {
        i();
    }

    public static /* synthetic */ void a(e eVar, bv bvVar) {
        int g4 = bvVar.g();
        com.anythink.core.common.u.e.a(bvVar, eVar.f11736f, bvVar.X(), true, f.a().b(g4));
        f.a().a(g4);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(e eVar, JSONObject jSONObject, bv bvVar) {
        boolean z3;
        e eVar2;
        Throwable th;
        String str = eVar.f11817k;
        if (eVar.f11830x.size() == 0) {
            eVar.f();
            if (!eVar.f11827u.get()) {
                z3 = true;
                synchronized (eVar) {
                    if (jSONObject != null && bvVar != null) {
                        try {
                            eVar.f11818l.add(jSONObject);
                            eVar.f11831y.put(bvVar.z(), bvVar);
                        } catch (Throwable th2) {
                            th = th2;
                            eVar2 = eVar;
                            throw th;
                        }
                    }
                    try {
                        if (eVar.f11818l.size() > 0 && (z3 || (eVar.f11826t.get() && !eVar.f11827u.get()))) {
                            eVar.c(eVar.f11825s);
                            return;
                        } else {
                            if (eVar.f11819m.size() <= 0 || !eVar.m()) {
                                return;
                            }
                            eVar.a(null, 0L, "", null, null);
                            return;
                        }
                    } catch (Throwable th3) {
                        eVar2 = eVar;
                        th = th3;
                        throw th;
                    }
                }
            }
        }
        z3 = false;
        synchronized (eVar) {
        }
    }

    public static /* synthetic */ void a(e eVar, String str, bv bvVar) {
        if (TextUtils.equals(str, ATBidRequestInfo.NO_ADAPTER_ERROR_TYPE) || TextUtils.equals(str, ATBidRequestInfo.NO_SUPPORT_BIDDING_TYPE)) {
            return;
        }
        int g4 = bvVar.g();
        com.anythink.core.common.u.e.a(bvVar, eVar.f11736f, bvVar.X(), false, f.a().b(g4));
        f.a().a(g4);
    }

    public static /* synthetic */ List a(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof JSONObject) {
            JSONArray optJSONArray = ((JSONObject) obj).optJSONArray("data");
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(ad.a(optJSONArray.optJSONObject(i)));
            }
        }
        return arrayList;
    }
}
