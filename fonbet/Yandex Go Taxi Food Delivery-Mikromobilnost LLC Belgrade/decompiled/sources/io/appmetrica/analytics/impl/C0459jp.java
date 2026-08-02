package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.IParamsCallback;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* renamed from: io.appmetrica.analytics.impl.jp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0459jp implements InterfaceC0488kp {
    public static final Map k = Collections.unmodifiableMap(new C0373gp());
    public final C0600ol b;
    public final C0690rp c;
    public final Handler d;
    public PublicLogger e;
    public HashMap i;
    public final List a = Arrays.asList("appmetrica_uuid", "appmetrica_device_id", "appmetrica_device_id_hash", IParamsCallback.YANDEX_MOBILE_METRICA_GET_AD_URL, IParamsCallback.YANDEX_MOBILE_METRICA_REPORT_AD_URL, IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS);
    public final Object g = new Object();
    public final WeakHashMap h = new WeakHashMap();
    public boolean j = false;
    public final C0402hp f = new C0402hp(this);

    public C0459jp(C0600ol c0600ol, C0690rp c0690rp, Handler handler) {
        this.b = c0600ol;
        this.c = c0690rp;
        this.d = handler;
    }

    public final void a(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        EnumC0315ep enumC0315ep;
        if (this.h.containsKey(startupParamsCallback)) {
            List list = (List) this.h.get(startupParamsCallback);
            if (this.c.a((Collection) list)) {
                startupParamsCallback.onReceive(a(list));
            } else {
                StartupParamsCallback.Reason reason = null;
                if (bundle.containsKey("startup_error_key_code")) {
                    int i = bundle.getInt("startup_error_key_code");
                    enumC0315ep = EnumC0315ep.UNKNOWN;
                    if (i == 1) {
                        enumC0315ep = EnumC0315ep.NETWORK;
                    } else if (i == 2) {
                        enumC0315ep = EnumC0315ep.PARSE;
                    }
                } else {
                    enumC0315ep = null;
                }
                if (enumC0315ep == null) {
                    if (this.c.a()) {
                        enumC0315ep = EnumC0315ep.UNKNOWN;
                    } else {
                        PublicLogger publicLogger = this.e;
                        if (publicLogger != null) {
                            publicLogger.warning("Clids error. Passed clids: %s, and clids from server are empty.", this.i);
                        }
                        reason = new StartupParamsCallback.Reason("INCONSISTENT_CLIDS");
                    }
                }
                if (reason == null) {
                    reason = (StartupParamsCallback.Reason) CollectionUtils.getOrDefault(k, enumC0315ep, StartupParamsCallback.Reason.UNKNOWN);
                }
                startupParamsCallback.onRequestError(reason, a(list));
            }
            this.h.remove(startupParamsCallback);
            if (this.h.isEmpty()) {
                C0781v0 c0781v0 = this.b.d;
                synchronized (c0781v0.f) {
                    c0781v0.c = false;
                    c0781v0.c();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00c5 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0096, B:11:0x00c5, B:12:0x00cc, B:14:0x00d2, B:15:0x00d9, B:17:0x00ee, B:19:0x00f9, B:20:0x0105, B:26:0x00f3, B:27:0x0082, B:29:0x008f), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d2 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0096, B:11:0x00c5, B:12:0x00cc, B:14:0x00d2, B:15:0x00d9, B:17:0x00ee, B:19:0x00f9, B:20:0x0105, B:26:0x00f3, B:27:0x0082, B:29:0x008f), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ee A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0096, B:11:0x00c5, B:12:0x00cc, B:14:0x00d2, B:15:0x00d9, B:17:0x00ee, B:19:0x00f9, B:20:0x0105, B:26:0x00f3, B:27:0x0082, B:29:0x008f), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f9 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0096, B:11:0x00c5, B:12:0x00cc, B:14:0x00d2, B:15:0x00d9, B:17:0x00ee, B:19:0x00f9, B:20:0x0105, B:26:0x00f3, B:27:0x0082, B:29:0x008f), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f3 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0096, B:11:0x00c5, B:12:0x00cc, B:14:0x00d2, B:15:0x00d9, B:17:0x00ee, B:19:0x00f9, B:20:0x0105, B:26:0x00f3, B:27:0x0082, B:29:0x008f), top: B:3:0x0063 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Bundle bundle) {
        HashMap hashMap;
        HashMap a;
        IdentifiersResult a2 = M4.a(bundle, "Uuid");
        IdentifiersResult a3 = M4.a(bundle, "DeviceId");
        IdentifiersResult a4 = M4.a(bundle, "DeviceIdHash");
        IdentifiersResult a5 = M4.a(bundle, "AdUrlReport");
        IdentifiersResult a6 = M4.a(bundle, "AdUrlGet");
        IdentifiersResult a7 = M4.a(bundle, "Clids");
        IdentifiersResult a8 = M4.a(bundle, "RequestClids");
        IdentifiersResult a9 = M4.a(bundle, "GAID");
        IdentifiersResult a10 = M4.a(bundle, "HOAID");
        IdentifiersResult a11 = M4.a(bundle, "YANDEX_ADV_ID");
        IdentifiersResult a12 = M4.a(bundle, "CUSTOM_SDK_HOSTS");
        long j = bundle.getLong("ServerTimeOffset");
        long j2 = bundle.getLong("NextStartupTime");
        C0503lb a13 = M4.a(bundle);
        Bundle bundle2 = bundle.getBundle("module_configs");
        C0690rp c0690rp = this.c;
        synchronized (c0690rp) {
            try {
                IdentifiersResult identifiersResult = (IdentifiersResult) c0690rp.b.get("appmetrica_uuid");
                if (identifiersResult != null) {
                    Sr sr = c0690rp.o;
                    String str = identifiersResult.id;
                    sr.getClass();
                    if (Sr.a(str)) {
                        c0690rp.a("appmetrica_device_id", a3);
                        c0690rp.a("appmetrica_device_id_hash", a4);
                        c0690rp.b.put("appmetrica_google_adv_id", a9);
                        c0690rp.b.put("appmetrica_huawei_oaid", a10);
                        c0690rp.b.put("appmetrica_yandex_adv_id", a11);
                        c0690rp.l.a(a12);
                        c0690rp.m.a(a13);
                        if (!C0690rp.a(a6)) {
                            c0690rp.b.put(IParamsCallback.YANDEX_MOBILE_METRICA_GET_AD_URL, a6);
                        }
                        if (!C0690rp.a(a5)) {
                            c0690rp.b.put(IParamsCallback.YANDEX_MOBILE_METRICA_REPORT_AD_URL, a5);
                        }
                        c0690rp.f = j;
                        C0785v4 c0785v4 = c0690rp.k;
                        hashMap = c0690rp.e;
                        a = Vc.a(a8.id);
                        c0785v4.getClass();
                        if (!Or.a((Map) hashMap) ? Or.a((Map) a) : hashMap.equals(a)) {
                            c0690rp.b.put(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, a7);
                            c0690rp.g = false;
                        }
                        c0690rp.h = j2;
                        c0690rp.c();
                    }
                }
                Sr sr2 = c0690rp.o;
                String str2 = a2.id;
                sr2.getClass();
                if (Sr.a(str2)) {
                    c0690rp.b.put("appmetrica_uuid", a2);
                }
                c0690rp.a("appmetrica_device_id", a3);
                c0690rp.a("appmetrica_device_id_hash", a4);
                c0690rp.b.put("appmetrica_google_adv_id", a9);
                c0690rp.b.put("appmetrica_huawei_oaid", a10);
                c0690rp.b.put("appmetrica_yandex_adv_id", a11);
                c0690rp.l.a(a12);
                c0690rp.m.a(a13);
                if (!C0690rp.a(a6)) {
                }
                if (!C0690rp.a(a5)) {
                }
                c0690rp.f = j;
                C0785v4 c0785v42 = c0690rp.k;
                hashMap = c0690rp.e;
                a = Vc.a(a8.id);
                c0785v42.getClass();
                if (!Or.a((Map) hashMap) ? Or.a((Map) a) : hashMap.equals(a)) {
                }
                c0690rp.h = j2;
                c0690rp.c();
            } catch (Throwable th) {
                throw th;
            }
        }
        V4.l().m().a(bundle2, new SdkIdentifiers(a2.id, a3.id, a4.id));
        h();
    }

    public final InterfaceC0875y7 c() {
        return this.f;
    }

    public final String d() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.c.b.get("appmetrica_device_id");
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.id;
    }

    public final C0561nb e() {
        C0503lb c0503lb;
        C0690rp c0690rp = this.c;
        C0417ib c0417ib = c0690rp.n;
        C0445jb c0445jb = c0690rp.m;
        synchronized (c0445jb) {
            c0503lb = c0445jb.b;
        }
        c0417ib.getClass();
        return new C0561nb(c0503lb.a);
    }

    public final long f() {
        return this.c.f;
    }

    public final String g() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.c.b.get("appmetrica_uuid");
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.id;
    }

    public final void h() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry entry : this.h.entrySet()) {
            List list = (List) entry.getValue();
            if (this.c.a((Collection) list)) {
                weakHashMap.put((StartupParamsCallback) entry.getKey(), list);
            }
        }
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            StartupParamsCallback startupParamsCallback = (StartupParamsCallback) ((Map.Entry) it.next()).getKey();
            if (startupParamsCallback != null) {
                a(new Bundle(), startupParamsCallback);
            }
        }
        weakHashMap.clear();
    }

    public final void i() {
        synchronized (this.g) {
            try {
                if (this.j) {
                    if (this.c.b()) {
                    }
                }
                this.j = true;
                a(this.a, this.f, this.i, false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Bundle bundle) {
        b(bundle, null);
    }

    public final void a(PublicLogger publicLogger) {
        this.e = publicLogger;
    }

    public final void a(List list, InterfaceC0875y7 interfaceC0875y7, Map map, boolean z) {
        ResultReceiverC0904z7 resultReceiverC0904z7 = new ResultReceiverC0904z7(this.d, interfaceC0875y7);
        C0600ol c0600ol = this.b;
        c0600ol.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.IdentifiersData", new C0822wc(resultReceiverC0904z7, list, map, z));
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = La.a;
        G4 g4 = new G4("", "", HProv.ALG_TYPE_BLOCK, 0, anonymousInstance);
        g4.m = bundle;
        C0902z5 c0902z5 = c0600ol.a;
        c0600ol.a(C0600ol.a(g4, c0902z5), c0902z5, 1, (Map) null);
    }

    public final void a(Map<String, String> map) {
        if (Or.a((Map) map)) {
            return;
        }
        synchronized (this.g) {
            try {
                HashMap b = AbstractC0230bq.b(map);
                this.i = b;
                this.b.a(b);
                C0690rp c0690rp = this.c;
                c0690rp.getClass();
                if (!Or.a((Map) b) && !Or.a(b, c0690rp.e)) {
                    c0690rp.e = new HashMap(b);
                    c0690rp.g = true;
                    c0690rp.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(String str) {
        synchronized (this.g) {
            this.b.a(str);
        }
    }

    public final void a(StartupParamsCallback startupParamsCallback, List<String> list, Map<String, String> map) {
        synchronized (this.g) {
            try {
                C0690rp c0690rp = this.c;
                c0690rp.getClass();
                if (!Or.a((Map) map) && !Or.a(map, c0690rp.e)) {
                    c0690rp.e = new HashMap(map);
                    c0690rp.g = true;
                    c0690rp.c();
                }
                a(startupParamsCallback, list);
                if (this.c.a((List) list)) {
                    a(list, new C0430ip(this, startupParamsCallback), map, true);
                } else {
                    a(new Bundle(), startupParamsCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final StartupParamsCallback.Result a(List list) {
        HashMap hashMap = new HashMap();
        C0690rp c0690rp = this.c;
        synchronized (c0690rp) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    IdentifiersResult identifiersResult = (IdentifiersResult) c0690rp.b.get(str);
                    if (identifiersResult != null) {
                        hashMap.put(str, c0690rp.c.a(identifiersResult));
                    }
                }
                c0690rp.l.a(list, hashMap);
                c0690rp.m.a(list, hashMap);
            } catch (Throwable th) {
                throw th;
            }
        }
        return new StartupParamsCallback.Result(hashMap);
    }

    public final void a(StartupParamsCallback startupParamsCallback, List list) {
        if (this.h.isEmpty()) {
            C0781v0 c0781v0 = this.b.d;
            synchronized (c0781v0.f) {
                c0781v0.c = true;
                c0781v0.b();
            }
        }
        this.h.put(startupParamsCallback, list);
    }

    public final AdvIdentifiersResult a() {
        C0690rp c0690rp = this.c;
        T t = c0690rp.j;
        IdentifiersResult identifiersResult = (IdentifiersResult) c0690rp.b.get("appmetrica_google_adv_id");
        IdentifiersResult identifiersResult2 = (IdentifiersResult) c0690rp.b.get("appmetrica_huawei_oaid");
        IdentifiersResult identifiersResult3 = (IdentifiersResult) c0690rp.b.get("appmetrica_yandex_adv_id");
        t.getClass();
        return new AdvIdentifiersResult(T.a(identifiersResult), T.a(identifiersResult2), T.a(identifiersResult3));
    }

    public final void b(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        synchronized (this.g) {
            try {
                b(bundle);
                h();
                if (startupParamsCallback != null) {
                    a(bundle, startupParamsCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(List<String> list) {
        synchronized (this.g) {
            try {
                List list2 = this.c.d;
                if (Or.a((Collection) list)) {
                    if (!Or.a((Collection) list2)) {
                        C0690rp c0690rp = this.c;
                        c0690rp.d = null;
                        c0690rp.i.a((List<String>) null);
                        this.b.a((List) null);
                    }
                } else if (!Or.a(list, list2)) {
                    C0690rp c0690rp2 = this.c;
                    c0690rp2.d = list;
                    c0690rp2.i.a(list);
                    this.b.a(list);
                } else {
                    this.b.a(list2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str) {
        synchronized (this.g) {
            this.b.b(str);
        }
    }

    public final Map<String, String> b() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.c.b.get(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS);
        String str = identifiersResult == null ? null : identifiersResult.id;
        if (!TextUtils.isEmpty(str)) {
            return Vc.a(str);
        }
        return this.i;
    }
}
