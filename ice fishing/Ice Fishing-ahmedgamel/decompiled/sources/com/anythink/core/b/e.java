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
import com.google.android.gms.internal.ads.Wv;
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
    public static final double f12602j = 10000.0d;

    /* renamed from: k, reason: collision with root package name */
    final String f12603k;

    /* renamed from: l, reason: collision with root package name */
    protected final List<JSONObject> f12604l;

    /* renamed from: m, reason: collision with root package name */
    List<bv> f12605m;

    /* renamed from: n, reason: collision with root package name */
    List<bv> f12606n;

    /* renamed from: o, reason: collision with root package name */
    String f12607o;

    /* renamed from: p, reason: collision with root package name */
    String f12608p;

    /* renamed from: q, reason: collision with root package name */
    String f12609q;

    /* renamed from: r, reason: collision with root package name */
    com.anythink.core.b.b.b f12610r;

    /* renamed from: s, reason: collision with root package name */
    long f12611s;

    /* renamed from: t, reason: collision with root package name */
    protected AtomicBoolean f12612t;

    /* renamed from: u, reason: collision with root package name */
    protected AtomicBoolean f12613u;

    /* renamed from: v, reason: collision with root package name */
    ConcurrentHashMap<String, bv> f12614v;

    /* renamed from: w, reason: collision with root package name */
    ConcurrentHashMap<String, bv> f12615w;

    /* renamed from: x, reason: collision with root package name */
    ConcurrentHashMap<String, bv> f12616x;

    /* renamed from: y, reason: collision with root package name */
    ConcurrentHashMap<String, bv> f12617y;

    /* renamed from: z, reason: collision with root package name */
    com.anythink.core.common.t.b f12618z;

    public e(com.anythink.core.common.h.a aVar) {
        super(aVar);
        this.f12603k = getClass().getSimpleName().concat(":");
        this.f12604l = new ArrayList();
        this.f12605m = new ArrayList();
        this.f12606n = new ArrayList();
        this.f12612t = new AtomicBoolean(false);
        this.f12613u = new AtomicBoolean(false);
        this.f12614v = new ConcurrentHashMap<>();
        this.f12615w = new ConcurrentHashMap<>();
        this.f12616x = new ConcurrentHashMap<>();
        this.f12617y = new ConcurrentHashMap<>();
        this.f12618z = new com.anythink.core.common.t.b() { // from class: com.anythink.core.b.e.1
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
        List<bv> list = aVar.f14120j;
        if (list != null && list.size() > 0) {
            for (bv bvVar : aVar.f14120j) {
                if (bvVar != null) {
                    this.f12614v.put(bvVar.z(), bvVar);
                    this.f12616x.put(bvVar.z(), bvVar);
                }
            }
        }
        List<bv> list2 = aVar.f14121k;
        if (list2 != null && list2.size() > 0) {
            for (bv bvVar2 : aVar.f14121k) {
                this.f12615w.put(bvVar2.z(), bvVar2);
                this.f12617y.put(bvVar2.z(), bvVar2);
            }
        }
        JSONObject jSONObject = aVar.f14128r;
        if (jSONObject != null) {
            this.f12604l.add(jSONObject);
        }
        this.f12607o = aVar.f14115d;
        this.f12608p = aVar.f14116e;
        this.f12609q = b();
    }

    private void b(long j6) {
        com.anythink.core.common.t.d.a().a(this.f12618z, j6, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c(final long j6) {
        try {
            try {
                if (this.f12613u.get()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                final ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                a(arrayList, concurrentHashMap, concurrentHashMap2);
                this.f12613u.set(true);
                a(arrayList, new q() { // from class: com.anythink.core.b.e.3
                    @Override // com.anythink.core.common.m.q
                    public final void onLoadCanceled(int i) {
                        synchronized (e.this) {
                            try {
                                if (e.this.f12524h.get()) {
                                    e eVar = e.this;
                                    String str = eVar.f12603k;
                                    String str2 = eVar.f12522f.f14116e;
                                } else {
                                    e.this.f12613u.set(false);
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
                                if (e.this.f12524h.get()) {
                                    e eVar = e.this;
                                    String str2 = eVar.f12603k;
                                    String str3 = eVar.f12522f.f14116e;
                                } else {
                                    e.this.f12613u.set(false);
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
                                if (e.this.f12524h.get()) {
                                    e eVar = e.this;
                                    String str = eVar.f12603k;
                                    String str2 = eVar.f12522f.f14116e;
                                } else {
                                    e.this.f12613u.set(false);
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
        com.anythink.core.common.t.d.a().b(this.f12618z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void g() {
        if (this.f12524h.get()) {
            return;
        }
        this.f12612t.set(true);
        if (this.f12604l.size() > 0) {
            c(SystemClock.elapsedRealtime());
        }
    }

    private boolean h() {
        return this.f12612t.get() && !this.f12613u.get();
    }

    private synchronized void i() {
        try {
            try {
                if (!this.f12524h.get()) {
                    this.f12524h.set(true);
                    f();
                    this.f12616x.clear();
                    a(0L, -3, ATBidRequestInfo.BIDDING_REQUEST_TIMEOUT_TYPE, this.f12614v);
                    a(0L, -3, ATBidRequestInfo.BIDDING_REQUEST_TIMEOUT_TYPE, this.f12615w);
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
        if ((this.f12606n.size() > 0 || this.f12605m.size() > 0) && (bVar = this.f12610r) != null) {
            bVar.a(this.f12606n, this.f12605m);
        }
        this.f12606n.clear();
        this.f12605m.clear();
    }

    private synchronized void k() {
        if (m()) {
            this.f12524h.set(true);
        }
    }

    private void l() {
        if (ATSDK.isNetworkLogDebug()) {
            if (this.f12606n.size() > 0 || this.f12605m.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("PlacementId", this.f12522f.f14116e);
                    if (this.f12522f.f14129s.ah()) {
                        jSONObject.put("isAdxNetworkMode", true);
                    }
                    jSONObject.put("S2S HeadBidding Success List", d.a(this.f12606n));
                    jSONObject.put("S2S HeadBidding Fail List", d.a(this.f12605m));
                } catch (Exception unused) {
                }
                ab.a(ab.f17408a, jSONObject.toString(), false);
            }
        }
    }

    private boolean m() {
        return this.f12614v.size() == 0 && this.f12615w.size() == 0 && this.f12616x.size() == 0;
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
        return !this.f12613u.get() && this.f12604l.size() > 0;
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
    public final void a(boolean z6) {
        this.f12523g = z6;
    }

    @Override // com.anythink.core.b.d
    public final void a(com.anythink.core.b.b.b bVar) {
        List<bv> list;
        this.f12611s = SystemClock.elapsedRealtime();
        this.f12610r = bVar;
        if (ATSDK.isNetworkLogDebug()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("PlacementId", this.f12522f.f14116e);
                if (this.f12522f.f14129s.ah()) {
                    jSONObject.put("isAdxNetworkMode", true);
                }
                jSONObject.put("S2S Start HeadBidding List", d.a(this.f12522f.f14120j));
                jSONObject.put("S2S Start HeadBidding List(Directly)", d.b(this.f12604l));
            } catch (Exception unused) {
            }
            ab.a(ab.f17408a, jSONObject.toString(), false);
        }
        if (this.f12522f.f14120j.size() == 0 && (list = this.f12522f.f14121k) != null && list.size() > 0) {
            c(this.f12611s);
            return;
        }
        long n9 = this.f12522f.f14124n.n();
        if (n9 <= 0) {
            n9 = 500;
        }
        com.anythink.core.common.t.d.a().a(this.f12618z, n9, false);
        Iterator<Map.Entry<String, bv>> it = this.f12614v.entrySet().iterator();
        while (it.hasNext()) {
            bv value = it.next().getValue();
            if (value.g() == 66) {
                com.anythink.core.common.a.i.a(this.f12522f.f14113b).a(value.z(), System.currentTimeMillis());
            }
            new i(this.f12522f).a(value, new i.a() { // from class: com.anythink.core.b.e.2
                @Override // com.anythink.core.b.i.a
                public final void onBidTokenObtainFail(String str, bv bvVar) {
                    if (e.this.f12524h.get()) {
                        return;
                    }
                    bvVar.m(SystemClock.elapsedRealtime() - e.this.f12611s);
                    if (str == null) {
                        str = "";
                    }
                    e.this.f12616x.remove(bvVar.z());
                    e.this.f12614v.remove(bvVar.z());
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
                    com.anythink.core.b.b.b bVar2 = e.this.f12610r;
                    if (bVar2 != null) {
                        bVar2.a(bvVar, aTBaseAdAdapter);
                    }
                }

                @Override // com.anythink.core.b.i.a
                public final void onBidTokenObtainSuccess(bv bvVar, JSONObject jSONObject2) {
                    if (e.this.f12524h.get()) {
                        return;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    bvVar.m(elapsedRealtime - e.this.f12611s);
                    bvVar.a(elapsedRealtime);
                    e.this.f12616x.remove(bvVar.z());
                    e.a(e.this, bvVar);
                    if (!e.this.f12612t.get() || e.this.f12612t.get()) {
                        e.a(e.this, jSONObject2, bvVar);
                    } else {
                        onBidTokenObtainFail(ATBidRequestInfo.BIDTOKEN_OBTAIN_TIMEOUT_TYPE, bvVar);
                    }
                }
            });
        }
    }

    private void b(bv bvVar) {
        int g9 = bvVar.g();
        com.anythink.core.common.u.e.a(bvVar, this.f12522f, bvVar.X(), true, f.a().b(g9));
        f.a().a(g9);
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
        this.f12605m.add(bvVar);
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
        boolean z6;
        Throwable th;
        if (this.f12616x.size() == 0) {
            f();
            if (!this.f12613u.get()) {
                z6 = true;
                synchronized (this) {
                    if (jSONObject != null && bvVar != null) {
                        try {
                            this.f12604l.add(jSONObject);
                            this.f12617y.put(bvVar.z(), bvVar);
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    try {
                        if (this.f12604l.size() > 0 && (z6 || (this.f12612t.get() && !this.f12613u.get()))) {
                            c(this.f12611s);
                            return;
                        } else {
                            if (this.f12605m.size() <= 0 || !m()) {
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
        z6 = false;
        synchronized (this) {
        }
    }

    public synchronized void a(List<JSONObject> list, Map<String, bv> map, Map<String, JSONObject> map2) {
        try {
            for (JSONObject jSONObject : this.f12604l) {
                list.add(jSONObject);
                map2.put(jSONObject.optString("ad_source_id"), jSONObject);
            }
            this.f12604l.clear();
            ConcurrentHashMap<String, bv> concurrentHashMap = this.f12617y;
            if (concurrentHashMap != null) {
                Iterator<Map.Entry<String, bv>> it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    bv value = it.next().getValue();
                    if (value != null) {
                        value.b(SystemClock.elapsedRealtime());
                    }
                }
            }
            map.putAll(this.f12617y);
            this.f12617y.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(long j6, int i, String str, Map<String, bv> map) {
        for (bv bvVar : map.values()) {
            if (a(bvVar, str, i)) {
                this.f12606n.add(bvVar);
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
                        this.f12614v.remove(adVar.f14214k);
                        bv remove = map.remove(adVar.f14214k);
                        if (this.f12615w.containsKey(adVar.f14214k)) {
                            try {
                                remove = this.f12615w.remove(adVar.f14214k);
                                this.f12615w.clear();
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        if (remove != null) {
                            if (adVar.isSuccessWithUseType()) {
                                int i4 = i + 1;
                                double sortPrice = i4 < list.size() ? list.get(i4).getSortPrice() : 0.0d;
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
                                com.anythink.core.common.a.i.a(eVar.f12522f.f14113b).a(remove.z(), adVar.f14226w);
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
                    this.f12614v.remove(str2);
                }
                if (this.f12615w.containsKey(str2)) {
                    this.f12615w.clear();
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
        if (this.f12606n.size() >= 2) {
            Collections.sort(this.f12606n);
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
        int g9 = bvVar.g();
        com.anythink.core.common.u.e.a(bvVar, this.f12522f, bvVar.X(), false, f.a().b(g9));
        f.a().a(g9);
    }

    @Override // com.anythink.core.b.d
    public void a(bv bvVar, z zVar, long j6) {
        String i;
        if (zVar instanceof ad) {
            ad adVar = (ad) zVar;
            boolean isSuccessWithUseType = adVar.isSuccessWithUseType();
            boolean a9 = d.a(isSuccessWithUseType, bvVar, zVar);
            int i4 = 0;
            AdError a10 = ae.a(0, this.f12522f.f14129s, bvVar, zVar);
            int i6 = 1;
            boolean z6 = a10 != null;
            if (isSuccessWithUseType && !a9 && !z6) {
                bvVar.c(j6 > 0 ? bvVar.X() + j6 : 0L);
                this.f12606n.add(bvVar);
                if (bvVar.q() == 3 || bvVar.q() == 7) {
                    adVar.f14210f = System.currentTimeMillis() + adVar.f14209e;
                } else {
                    adVar.f14210f = System.currentTimeMillis() + bvVar.s();
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
            if (z6) {
                b(bvVar, a10.getPlatformMSG(), j6, -13);
                bvVar.b(zVar.getPrice());
                bvVar.e(zVar.getSortPrice());
                b(adVar, bvVar);
                return;
            }
            if (adVar.useType == 2) {
                bvVar.V();
                i = "filter by s2s bid max count";
            } else {
                StringBuilder sb = new StringBuilder("errorCode:[");
                sb.append(adVar.f14205a);
                sb.append("],errorMsg:[");
                i = Wv.i(sb, adVar.errorMsg, "]");
                i6 = 0;
                i4 = -1;
            }
            if (a(bvVar, i, i4, i6)) {
                this.f12606n.add(bvVar);
            } else {
                b(bvVar, i, j6, i4);
            }
        }
    }

    @Override // com.anythink.core.b.d
    public final void a() {
        i();
    }

    public static /* synthetic */ void a(e eVar, bv bvVar) {
        int g9 = bvVar.g();
        com.anythink.core.common.u.e.a(bvVar, eVar.f12522f, bvVar.X(), true, f.a().b(g9));
        f.a().a(g9);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(e eVar, JSONObject jSONObject, bv bvVar) {
        boolean z6;
        e eVar2;
        Throwable th;
        String str = eVar.f12603k;
        if (eVar.f12616x.size() == 0) {
            eVar.f();
            if (!eVar.f12613u.get()) {
                z6 = true;
                synchronized (eVar) {
                    if (jSONObject != null && bvVar != null) {
                        try {
                            eVar.f12604l.add(jSONObject);
                            eVar.f12617y.put(bvVar.z(), bvVar);
                        } catch (Throwable th2) {
                            th = th2;
                            eVar2 = eVar;
                            throw th;
                        }
                    }
                    try {
                        if (eVar.f12604l.size() > 0 && (z6 || (eVar.f12612t.get() && !eVar.f12613u.get()))) {
                            eVar.c(eVar.f12611s);
                            return;
                        } else {
                            if (eVar.f12605m.size() <= 0 || !eVar.m()) {
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
        z6 = false;
        synchronized (eVar) {
        }
    }

    public static /* synthetic */ void a(e eVar, String str, bv bvVar) {
        if (TextUtils.equals(str, ATBidRequestInfo.NO_ADAPTER_ERROR_TYPE) || TextUtils.equals(str, ATBidRequestInfo.NO_SUPPORT_BIDDING_TYPE)) {
            return;
        }
        int g9 = bvVar.g();
        com.anythink.core.common.u.e.a(bvVar, eVar.f12522f, bvVar.X(), false, f.a().b(g9));
        f.a().a(g9);
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
