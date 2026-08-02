package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.NonNull;
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

/* loaded from: classes5.dex */
public final class Ro implements So {
    public static final Map k = Collections.unmodifiableMap(new Oo());
    public final List a;
    public final C0237el b;
    public final Zo c;
    public final Handler d;
    public PublicLogger e;
    public final Po f;
    public final Object g;
    public final WeakHashMap h;
    public HashMap i;
    public boolean j;

    public Ro(C0237el c0237el, Zo zo, Handler handler) {
        this.a = Arrays.asList("appmetrica_uuid", "appmetrica_device_id", "appmetrica_device_id_hash", IParamsCallback.YANDEX_MOBILE_METRICA_GET_AD_URL, IParamsCallback.YANDEX_MOBILE_METRICA_REPORT_AD_URL, IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS);
        this.g = new Object();
        this.h = new WeakHashMap();
        this.j = false;
        this.b = c0237el;
        this.c = zo;
        this.d = handler;
        this.f = new Po(this);
    }

    public final void a(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        Mo mo;
        if (this.h.containsKey(startupParamsCallback)) {
            List list = (List) this.h.get(startupParamsCallback);
            if (this.c.a((Collection) list)) {
                startupParamsCallback.onReceive(a(list));
            } else {
                StartupParamsCallback.Reason reason = null;
                if (bundle.containsKey("startup_error_key_code")) {
                    int i = bundle.getInt("startup_error_key_code");
                    mo = Mo.UNKNOWN;
                    if (i == 1) {
                        mo = Mo.NETWORK;
                    } else if (i == 2) {
                        mo = Mo.PARSE;
                    }
                } else {
                    mo = null;
                }
                if (mo == null) {
                    if (this.c.a()) {
                        mo = Mo.UNKNOWN;
                    } else {
                        PublicLogger publicLogger = this.e;
                        if (publicLogger != null) {
                            publicLogger.warning("Clids error. Passed clids: %s, and clids from server are empty.", this.i);
                        }
                        reason = new StartupParamsCallback.Reason("INCONSISTENT_CLIDS");
                    }
                }
                if (reason == null) {
                    reason = (StartupParamsCallback.Reason) CollectionUtils.getOrDefault(k, mo, StartupParamsCallback.Reason.UNKNOWN);
                }
                startupParamsCallback.onRequestError(reason, a(list));
            }
            this.h.remove(startupParamsCallback);
            if (this.h.isEmpty()) {
                C0649t0 c0649t0 = this.b.d;
                synchronized (c0649t0.f) {
                    c0649t0.c = false;
                    c0649t0.c();
                }
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
        HashMap a;
        IdentifiersResult a2 = I4.a(bundle, "Uuid");
        IdentifiersResult a3 = I4.a(bundle, "DeviceId");
        IdentifiersResult a4 = I4.a(bundle, "DeviceIdHash");
        IdentifiersResult a5 = I4.a(bundle, "AdUrlReport");
        IdentifiersResult a6 = I4.a(bundle, "AdUrlGet");
        IdentifiersResult a7 = I4.a(bundle, "Clids");
        IdentifiersResult a8 = I4.a(bundle, "RequestClids");
        IdentifiersResult a9 = I4.a(bundle, "GAID");
        IdentifiersResult a10 = I4.a(bundle, "HOAID");
        IdentifiersResult a11 = I4.a(bundle, "YANDEX_ADV_ID");
        IdentifiersResult a12 = I4.a(bundle, "CUSTOM_SDK_HOSTS");
        long j = bundle.getLong("ServerTimeOffset");
        long j2 = bundle.getLong("NextStartupTime");
        C0199db a13 = I4.a(bundle);
        Bundle bundle2 = bundle.getBundle("module_configs");
        Zo zo = this.c;
        synchronized (zo) {
            try {
                IdentifiersResult identifiersResult = (IdentifiersResult) zo.b.get("appmetrica_uuid");
                if (identifiersResult != null) {
                    zr zrVar = zo.o;
                    String str = identifiersResult.id;
                    zrVar.getClass();
                    if (zr.a(str)) {
                        zo.a("appmetrica_device_id", a3);
                        zo.a("appmetrica_device_id_hash", a4);
                        zo.b.put("appmetrica_google_adv_id", a9);
                        zo.b.put("appmetrica_huawei_oaid", a10);
                        zo.b.put("appmetrica_yandex_adv_id", a11);
                        zo.l.a(a12);
                        zo.m.a(a13);
                        if (!Zo.a(a6)) {
                            zo.b.put(IParamsCallback.YANDEX_MOBILE_METRICA_GET_AD_URL, a6);
                        }
                        if (!Zo.a(a5)) {
                            zo.b.put(IParamsCallback.YANDEX_MOBILE_METRICA_REPORT_AD_URL, a5);
                        }
                        zo.f = j;
                        C0595r4 c0595r4 = zo.k;
                        hashMap = zo.e;
                        a = Fc.a(a8.id);
                        c0595r4.getClass();
                        if (!AbstractC0734vr.a((Map) hashMap) ? AbstractC0734vr.a((Map) a) : hashMap.equals(a)) {
                            zo.b.put(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, a7);
                            zo.g = false;
                        }
                        zo.h = j2;
                        zo.c();
                    }
                }
                zo.c(a2);
                zo.a("appmetrica_device_id", a3);
                zo.a("appmetrica_device_id_hash", a4);
                zo.b.put("appmetrica_google_adv_id", a9);
                zo.b.put("appmetrica_huawei_oaid", a10);
                zo.b.put("appmetrica_yandex_adv_id", a11);
                zo.l.a(a12);
                zo.m.a(a13);
                if (!Zo.a(a6)) {
                }
                if (!Zo.a(a5)) {
                }
                zo.f = j;
                C0595r4 c0595r42 = zo.k;
                hashMap = zo.e;
                a = Fc.a(a8.id);
                c0595r42.getClass();
                if (!AbstractC0734vr.a((Map) hashMap) ? AbstractC0734vr.a((Map) a) : hashMap.equals(a)) {
                }
                zo.h = j2;
                zo.c();
            } catch (Throwable th) {
                throw th;
            }
        }
        R4.l().m().a(bundle2, new SdkIdentifiers(a2.id, a3.id, a4.id));
        h();
    }

    @NonNull
    public final InterfaceC0656t7 c() {
        return this.f;
    }

    public final String d() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.c.b.get("appmetrica_device_id");
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.id;
    }

    @NonNull
    public final C0256fb e() {
        C0199db c0199db;
        Zo zo = this.c;
        C0112ab c0112ab = zo.n;
        C0141bb c0141bb = zo.m;
        synchronized (c0141bb) {
            c0199db = c0141bb.b;
        }
        c0112ab.getClass();
        return new C0256fb(c0199db.a);
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

    public Ro(@NonNull Context context, C0237el c0237el, C0608rh c0608rh, @NonNull Handler handler) {
        this(c0237el, new Zo(context, c0608rh), handler);
    }

    public final void a(@NonNull Bundle bundle) {
        b(bundle, null);
    }

    public final void a(@NonNull PublicLogger publicLogger) {
        this.e = publicLogger;
    }

    public final void a(List list, InterfaceC0656t7 interfaceC0656t7, Map map, boolean z) {
        ResultReceiverC0685u7 resultReceiverC0685u7 = new ResultReceiverC0685u7(this.d, interfaceC0656t7);
        C0237el c0237el = this.b;
        c0237el.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.IdentifiersData", new C0401kc(resultReceiverC0685u7, list, map, z));
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = Ea.a;
        C4 c4 = new C4("", "", 1536, 0, anonymousInstance);
        c4.m = bundle;
        C0741w5 c0741w5 = c0237el.a;
        c0237el.a(C0237el.a(c4, c0741w5), c0741w5, 1, (Map) null);
    }

    public final void a(Map<String, String> map) {
        if (AbstractC0734vr.a((Map) map)) {
            return;
        }
        synchronized (this.g) {
            try {
                HashMap b = Jp.b(map);
                this.i = b;
                this.b.a(b);
                Zo zo = this.c;
                zo.getClass();
                if (!AbstractC0734vr.a((Map) b) && !AbstractC0734vr.a(b, zo.e)) {
                    zo.e = new HashMap(b);
                    zo.g = true;
                    zo.c();
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

    public final void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list, Map<String, String> map) {
        synchronized (this.g) {
            try {
                Zo zo = this.c;
                zo.getClass();
                if (!AbstractC0734vr.a((Map) map) && !AbstractC0734vr.a(map, zo.e)) {
                    zo.e = new HashMap(map);
                    zo.g = true;
                    zo.c();
                }
                a(startupParamsCallback, list);
                if (this.c.a((List) list)) {
                    a(list, new Qo(this, startupParamsCallback), map, true);
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
        Zo zo = this.c;
        synchronized (zo) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    IdentifiersResult identifiersResult = (IdentifiersResult) zo.b.get(str);
                    if (identifiersResult != null) {
                        hashMap.put(str, zo.c.a(identifiersResult));
                    }
                }
                zo.l.a(list, hashMap);
                zo.m.a(list, hashMap);
            } catch (Throwable th) {
                throw th;
            }
        }
        return new StartupParamsCallback.Result(hashMap);
    }

    public final void a(StartupParamsCallback startupParamsCallback, List list) {
        if (this.h.isEmpty()) {
            C0649t0 c0649t0 = this.b.d;
            synchronized (c0649t0.f) {
                c0649t0.c = true;
                c0649t0.b();
            }
        }
        this.h.put(startupParamsCallback, list);
    }

    @NonNull
    public final AdvIdentifiersResult a() {
        Zo zo = this.c;
        S s = zo.j;
        IdentifiersResult identifiersResult = (IdentifiersResult) zo.b.get("appmetrica_google_adv_id");
        IdentifiersResult identifiersResult2 = (IdentifiersResult) zo.b.get("appmetrica_huawei_oaid");
        IdentifiersResult identifiersResult3 = (IdentifiersResult) zo.b.get("appmetrica_yandex_adv_id");
        s.getClass();
        return new AdvIdentifiersResult(S.a(identifiersResult), S.a(identifiersResult2), S.a(identifiersResult3));
    }

    public final void b(@NonNull Bundle bundle, StartupParamsCallback startupParamsCallback) {
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
                if (AbstractC0734vr.a((Collection) list)) {
                    if (!AbstractC0734vr.a((Collection) list2)) {
                        Zo zo = this.c;
                        zo.d = null;
                        zo.i.a((List<String>) null);
                        this.b.a((List) null);
                    }
                } else if (!AbstractC0734vr.a(list, list2)) {
                    Zo zo2 = this.c;
                    zo2.d = list;
                    zo2.i.a(list);
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
            return Fc.a(str);
        }
        return this.i;
    }
}
