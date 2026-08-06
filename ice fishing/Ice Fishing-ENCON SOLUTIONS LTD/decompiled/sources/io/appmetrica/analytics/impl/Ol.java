package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import io.appmetrica.analytics.AdvIdentifiersResult;
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

/* loaded from: classes.dex */
public final class Ol implements Pl {

    /* renamed from: k, reason: collision with root package name */
    public static final Map f4877k = Collections.unmodifiableMap(new Ll());

    /* renamed from: a, reason: collision with root package name */
    public final List f4878a;

    /* renamed from: b, reason: collision with root package name */
    public final C0851wi f4879b;

    /* renamed from: c, reason: collision with root package name */
    public final Wl f4880c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f4881d;

    /* renamed from: e, reason: collision with root package name */
    public PublicLogger f4882e;

    /* renamed from: f, reason: collision with root package name */
    public final Ml f4883f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4884g;

    /* renamed from: h, reason: collision with root package name */
    public final WeakHashMap f4885h;

    /* renamed from: i, reason: collision with root package name */
    public HashMap f4886i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4887j;

    public Ol(Context context, C0851wi c0851wi, Ve ve, Handler handler) {
        this(c0851wi, new Wl(context, ve), handler);
    }

    public final void a(StartupParamsCallback startupParamsCallback, List<String> list, Map<String, String> map) {
        synchronized (this.f4884g) {
            try {
                Wl wl = this.f4880c;
                wl.getClass();
                if (!AbstractC0572lo.a((Map) map) && !AbstractC0572lo.a(map, wl.f5325e)) {
                    wl.f5325e = new HashMap(map);
                    wl.f5327g = true;
                    wl.c();
                }
                a(startupParamsCallback, list);
                if (this.f4880c.a((List) list)) {
                    a(list, new Nl(this, startupParamsCallback), map, true);
                } else {
                    a(new Bundle(), startupParamsCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b4 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c1 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00dd A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e2 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Bundle bundle) {
        HashMap hashMap;
        HashMap a2;
        IdentifiersResult a3 = S3.a(bundle, "Uuid");
        IdentifiersResult a4 = S3.a(bundle, "DeviceId");
        IdentifiersResult a5 = S3.a(bundle, "DeviceIdHash");
        IdentifiersResult a6 = S3.a(bundle, "AdUrlReport");
        IdentifiersResult a7 = S3.a(bundle, "AdUrlGet");
        IdentifiersResult a8 = S3.a(bundle, "Clids");
        IdentifiersResult a9 = S3.a(bundle, "RequestClids");
        IdentifiersResult a10 = S3.a(bundle, "GAID");
        IdentifiersResult a11 = S3.a(bundle, "HOAID");
        IdentifiersResult a12 = S3.a(bundle, "YANDEX_ADV_ID");
        IdentifiersResult a13 = S3.a(bundle, "CUSTOM_SDK_HOSTS");
        long j2 = bundle.getLong("ServerTimeOffset");
        long j3 = bundle.getLong("NextStartupTime");
        V9 a14 = S3.a(bundle);
        Bundle bundle2 = bundle.getBundle("module_configs");
        Wl wl = this.f4880c;
        synchronized (wl) {
            try {
                IdentifiersResult identifiersResult = (IdentifiersResult) wl.f5322b.get(StartupParamsCallback.APPMETRICA_UUID);
                if (identifiersResult != null) {
                    C0676po c0676po = wl.f5335o;
                    String str = identifiersResult.id;
                    c0676po.getClass();
                    if (C0676po.a(str)) {
                        wl.a(StartupParamsCallback.APPMETRICA_DEVICE_ID, a4);
                        wl.a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, a5);
                        wl.f5322b.put("appmetrica_google_adv_id", a10);
                        wl.f5322b.put("appmetrica_huawei_oaid", a11);
                        wl.f5322b.put("appmetrica_yandex_adv_id", a12);
                        wl.f5332l.a(a13);
                        wl.f5333m.a(a14);
                        if (!Wl.a(a7)) {
                            wl.f5322b.put("appmetrica_get_ad_url", a7);
                        }
                        if (!Wl.a(a6)) {
                            wl.f5322b.put("appmetrica_report_ad_url", a6);
                        }
                        wl.f5326f = j2;
                        C3 c3 = wl.f5331k;
                        hashMap = wl.f5325e;
                        a2 = AbstractC0430gb.a(a9.id);
                        c3.getClass();
                        if (!AbstractC0572lo.a((Map) hashMap) ? AbstractC0572lo.a((Map) a2) : hashMap.equals(a2)) {
                            wl.f5322b.put("appmetrica_clids", a8);
                            wl.f5327g = false;
                        }
                        wl.f5328h = j3;
                        wl.c();
                    }
                }
                wl.c(a3);
                wl.a(StartupParamsCallback.APPMETRICA_DEVICE_ID, a4);
                wl.a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, a5);
                wl.f5322b.put("appmetrica_google_adv_id", a10);
                wl.f5322b.put("appmetrica_huawei_oaid", a11);
                wl.f5322b.put("appmetrica_yandex_adv_id", a12);
                wl.f5332l.a(a13);
                wl.f5333m.a(a14);
                if (!Wl.a(a7)) {
                }
                if (!Wl.a(a6)) {
                }
                wl.f5326f = j2;
                C3 c32 = wl.f5331k;
                hashMap = wl.f5325e;
                a2 = AbstractC0430gb.a(a9.id);
                c32.getClass();
                if (!AbstractC0572lo.a((Map) hashMap) ? AbstractC0572lo.a((Map) a2) : hashMap.equals(a2)) {
                }
                wl.f5328h = j3;
                wl.c();
            } catch (Throwable th) {
                throw th;
            }
        }
        C0294b4.l().m().a(bundle2, new SdkIdentifiers(a3.id, a4.id, a5.id));
        h();
    }

    public final A6 c() {
        return this.f4883f;
    }

    public final String d() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f4880c.f5322b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.id;
    }

    public final X9 e() {
        V9 v9;
        Wl wl = this.f4880c;
        S9 s9 = wl.f5334n;
        T9 t9 = wl.f5333m;
        synchronized (t9) {
            v9 = t9.f5102b;
        }
        s9.getClass();
        Boolean bool = v9.f5225a;
        return new X9();
    }

    public final long f() {
        return this.f4880c.f5326f;
    }

    public final String g() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f4880c.f5322b.get(StartupParamsCallback.APPMETRICA_UUID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.id;
    }

    public final void h() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry entry : this.f4885h.entrySet()) {
            List list = (List) entry.getValue();
            if (this.f4880c.a((Collection) list)) {
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
        synchronized (this.f4884g) {
            try {
                if (this.f4887j) {
                    if (this.f4880c.b()) {
                    }
                }
                this.f4887j = true;
                a(this.f4878a, this.f4883f, this.f4886i, false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Ol(C0851wi c0851wi, Wl wl, Handler handler) {
        this.f4878a = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, "appmetrica_get_ad_url", "appmetrica_report_ad_url", "appmetrica_clids");
        this.f4884g = new Object();
        this.f4885h = new WeakHashMap();
        this.f4887j = false;
        this.f4879b = c0851wi;
        this.f4880c = wl;
        this.f4881d = handler;
        this.f4883f = new Ml(this);
    }

    public final void a(Bundle bundle) {
        b(bundle, null);
    }

    public final void a(PublicLogger publicLogger) {
        this.f4882e = publicLogger;
    }

    public final void a(List list, A6 a6, Map map, boolean z2) {
        B6 b6 = new B6(this.f4881d, a6);
        C0851wi c0851wi = this.f4879b;
        c0851wi.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.IdentifiersData", new Xa(b6, list, map, z2));
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = AbstractC0842w9.f7096a;
        M3 m3 = new M3("", "", 1536, 0, anonymousInstance);
        m3.f4916m = bundle;
        F4 f4 = c0851wi.f7116a;
        c0851wi.a(C0851wi.a(m3, f4), f4, 1, (Map) null);
    }

    public final void a(Map<String, String> map) {
        if (AbstractC0572lo.a((Map) map)) {
            return;
        }
        synchronized (this.f4884g) {
            try {
                HashMap b2 = Fm.b(map);
                this.f4886i = b2;
                this.f4879b.a(b2);
                Wl wl = this.f4880c;
                wl.getClass();
                if (!AbstractC0572lo.a((Map) b2) && !AbstractC0572lo.a(b2, wl.f5325e)) {
                    wl.f5325e = new HashMap(b2);
                    wl.f5327g = true;
                    wl.c();
                }
            } finally {
            }
        }
    }

    public final void a(String str) {
        synchronized (this.f4884g) {
            this.f4879b.a(str);
        }
    }

    public final void a(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        Jl jl;
        if (this.f4885h.containsKey(startupParamsCallback)) {
            List list = (List) this.f4885h.get(startupParamsCallback);
            if (this.f4880c.a((Collection) list)) {
                startupParamsCallback.onReceive(a(list));
            } else {
                StartupParamsCallback.Reason reason = null;
                if (bundle.containsKey("startup_error_key_code")) {
                    int i2 = bundle.getInt("startup_error_key_code");
                    jl = Jl.UNKNOWN;
                    if (i2 == 1) {
                        jl = Jl.NETWORK;
                    } else if (i2 == 2) {
                        jl = Jl.PARSE;
                    }
                } else {
                    jl = null;
                }
                if (jl == null) {
                    if (!this.f4880c.a()) {
                        PublicLogger publicLogger = this.f4882e;
                        if (publicLogger != null) {
                            publicLogger.warning("Clids error. Passed clids: %s, and clids from server are empty.", this.f4886i);
                        }
                        reason = new StartupParamsCallback.Reason("INCONSISTENT_CLIDS");
                    } else {
                        jl = Jl.UNKNOWN;
                    }
                }
                if (reason == null) {
                    reason = (StartupParamsCallback.Reason) CollectionUtils.getOrDefault(f4877k, jl, StartupParamsCallback.Reason.UNKNOWN);
                }
                startupParamsCallback.onRequestError(reason, a(list));
            }
            this.f4885h.remove(startupParamsCallback);
            if (this.f4885h.isEmpty()) {
                C0652p0 c0652p0 = this.f4879b.f7119d;
                synchronized (c0652p0.f6707f) {
                    c0652p0.f6704c = false;
                    c0652p0.c();
                }
            }
        }
    }

    public final void b(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        synchronized (this.f4884g) {
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
        synchronized (this.f4884g) {
            try {
                List list2 = this.f4880c.f5324d;
                if (AbstractC0572lo.a((Collection) list)) {
                    if (!AbstractC0572lo.a((Collection) list2)) {
                        Wl wl = this.f4880c;
                        wl.f5324d = null;
                        wl.f5329i.a((List<String>) null);
                        this.f4879b.a((List) null);
                    }
                } else if (!AbstractC0572lo.a(list, list2)) {
                    Wl wl2 = this.f4880c;
                    wl2.f5324d = list;
                    wl2.f5329i.a(list);
                    this.f4879b.a(list);
                } else {
                    this.f4879b.a(list2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final StartupParamsCallback.Result a(List list) {
        HashMap hashMap = new HashMap();
        Wl wl = this.f4880c;
        synchronized (wl) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    IdentifiersResult identifiersResult = (IdentifiersResult) wl.f5322b.get(str);
                    if (identifiersResult != null) {
                        hashMap.put(str, wl.f5323c.a(identifiersResult));
                    }
                }
                wl.f5332l.a(list, hashMap);
                wl.f5333m.a(list, hashMap);
            } catch (Throwable th) {
                throw th;
            }
        }
        return new StartupParamsCallback.Result(hashMap);
    }

    public final void b(String str) {
        synchronized (this.f4884g) {
            this.f4879b.b(str);
        }
    }

    public final Map<String, String> b() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f4880c.f5322b.get("appmetrica_clids");
        String str = identifiersResult == null ? null : identifiersResult.id;
        if (!TextUtils.isEmpty(str)) {
            return AbstractC0430gb.a(str);
        }
        return this.f4886i;
    }

    public final void a(StartupParamsCallback startupParamsCallback, List list) {
        if (this.f4885h.isEmpty()) {
            C0652p0 c0652p0 = this.f4879b.f7119d;
            synchronized (c0652p0.f6707f) {
                c0652p0.f6704c = true;
                c0652p0.b();
            }
        }
        this.f4885h.put(startupParamsCallback, list);
    }

    public final AdvIdentifiersResult a() {
        Wl wl = this.f4880c;
        P p2 = wl.f5330j;
        IdentifiersResult identifiersResult = (IdentifiersResult) wl.f5322b.get("appmetrica_google_adv_id");
        IdentifiersResult identifiersResult2 = (IdentifiersResult) wl.f5322b.get("appmetrica_huawei_oaid");
        IdentifiersResult identifiersResult3 = (IdentifiersResult) wl.f5322b.get("appmetrica_yandex_adv_id");
        p2.getClass();
        return new AdvIdentifiersResult(P.a(identifiersResult), P.a(identifiersResult2), P.a(identifiersResult3));
    }
}
