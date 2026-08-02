package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.ol, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0600ol {
    public final C0902z5 a;
    public final C0664qr b;
    public final C0658ql c;
    public final C0781v0 d;
    public InterfaceC0488kp e;
    public final C0602on f;

    public C0600ol(C0781v0 c0781v0, C0664qr c0664qr, C0902z5 c0902z5, C0602on c0602on) {
        this(c0781v0, c0664qr, c0902z5, c0602on, new C0658ql(c0781v0, c0602on));
    }

    public final C0425ik a(C0606or c0606or, C0714sk c0714sk) {
        String str;
        this.d.b();
        C0664qr c0664qr = this.b;
        c0664qr.getClass();
        C0317er c0317er = c0606or.a;
        String str2 = c0317er == null ? "" : (String) WrapUtils.getOrDefault(c0317er.a, "");
        byte[] fromModel = c0664qr.a.fromModel(c0606or);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(c0714sk.b.getApiKey());
        Set set = La.a;
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        G4 g4 = new G4(fromModel, str2, 5891, orCreatePublicLogger);
        g4.c = c0714sk.d();
        HashMap hashMap = g4.q;
        C0597oi c0597oi = new C0597oi(c0714sk.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c0714sk.b);
        R9 r9 = c0714sk.c;
        synchronized (c0714sk) {
            str = c0714sk.f;
        }
        return new C0425ik(g4, true, 1, hashMap, new C0714sk(c0597oi, counterConfiguration, r9, str));
    }

    public final void b(String str) {
        C0597oi c0597oi = this.a.a;
        synchronized (c0597oi) {
            c0597oi.a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
        }
    }

    public C0600ol(C0781v0 c0781v0, C0664qr c0664qr, C0902z5 c0902z5, C0602on c0602on, C0658ql c0658ql) {
        this.d = c0781v0;
        this.a = c0902z5;
        this.b = c0664qr;
        this.f = c0602on;
        this.c = c0658ql;
    }

    public final void a(C0459jp c0459jp) {
        this.e = c0459jp;
        this.a.b.setUuid(c0459jp.g());
    }

    public final void a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        if (Or.a(bool)) {
            this.a.b.setLocationTracking(bool.booleanValue());
        }
        if (Or.a(bool2)) {
            this.a.b.setDataSendingEnabled(bool2.booleanValue());
        }
        if (Or.a(bool3)) {
            this.a.b.setAdvIdentifiersTracking(bool3.booleanValue(), bool4.booleanValue());
        }
        K6 a = K6.a();
        C0902z5 c0902z5 = this.a;
        a(a(a, c0902z5), c0902z5, 1, (Map) null);
    }

    public final void a(K6 k6, C0714sk c0714sk, int i, Map map) {
        String str;
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        this.d.b();
        if (!Or.a(map)) {
            k6.setValue(Vc.c(map));
            a(k6, c0714sk);
        }
        C0597oi c0597oi = new C0597oi(c0714sk.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c0714sk.b);
        R9 r9 = c0714sk.c;
        synchronized (c0714sk) {
            str = c0714sk.f;
        }
        a(new C0425ik(k6, false, i, null, new C0714sk(c0597oi, counterConfiguration, r9, str)));
    }

    public static K6 a(K6 k6, C0714sk c0714sk) {
        if (La.a.contains(Integer.valueOf(k6.d))) {
            k6.c = c0714sk.d();
        }
        return k6;
    }

    public final void a(List list) {
        C0597oi c0597oi = this.a.a;
        synchronized (c0597oi) {
            c0597oi.a.put("PROCESS_CFG_CUSTOM_HOSTS", Or.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
        }
    }

    public final void a(HashMap hashMap) {
        C0597oi c0597oi = this.a.a;
        synchronized (c0597oi) {
            c0597oi.a.put("PROCESS_CFG_CLIDS", Vc.c(hashMap));
        }
    }

    public final void a(String str) {
        C0597oi c0597oi = this.a.a;
        synchronized (c0597oi) {
            c0597oi.a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
        }
    }

    public final void a(C0425ik c0425ik) {
        C0714sk c0714sk = c0425ik.e;
        InterfaceC0488kp interfaceC0488kp = this.e;
        if (interfaceC0488kp != null) {
            c0714sk.b.setUuid(((C0459jp) interfaceC0488kp).g());
        } else {
            c0714sk.getClass();
        }
        this.c.a(c0425ik);
    }
}
