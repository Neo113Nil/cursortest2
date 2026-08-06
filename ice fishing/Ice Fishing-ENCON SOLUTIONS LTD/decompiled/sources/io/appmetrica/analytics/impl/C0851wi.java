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

/* renamed from: io.appmetrica.analytics.impl.wi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0851wi {

    /* renamed from: a, reason: collision with root package name */
    public final F4 f7116a;

    /* renamed from: b, reason: collision with root package name */
    public final Sn f7117b;

    /* renamed from: c, reason: collision with root package name */
    public final C0903yi f7118c;

    /* renamed from: d, reason: collision with root package name */
    public final C0652p0 f7119d;

    /* renamed from: e, reason: collision with root package name */
    public Pl f7120e;

    /* renamed from: f, reason: collision with root package name */
    public final Yj f7121f;

    public C0851wi(C0652p0 c0652p0, Sn sn, F4 f4, Yj yj) {
        this(c0652p0, sn, f4, yj, new C0903yi(c0652p0, yj));
    }

    public final void a(C0824vh c0824vh) {
        Fh fh = c0824vh.f7069e;
        Pl pl = this.f7120e;
        if (pl != null) {
            fh.f4459b.setUuid(((Ol) pl).g());
        } else {
            fh.getClass();
        }
        this.f7118c.a(c0824vh);
    }

    public final void b(String str) {
        Bf bf = this.f7116a.f4458a;
        synchronized (bf) {
            bf.f4214a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
        }
    }

    public C0851wi(C0652p0 c0652p0, Sn sn, F4 f4, Yj yj, C0903yi c0903yi) {
        this.f7119d = c0652p0;
        this.f7116a = f4;
        this.f7117b = sn;
        this.f7121f = yj;
        this.f7118c = c0903yi;
    }

    public final void a(Ol ol) {
        this.f7120e = ol;
        this.f7116a.f4459b.setUuid(ol.g());
    }

    public final void a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        if (AbstractC0572lo.a(bool)) {
            this.f7116a.f4459b.setLocationTracking(bool.booleanValue());
        }
        if (AbstractC0572lo.a(bool2)) {
            this.f7116a.f4459b.setDataSendingEnabled(bool2.booleanValue());
        }
        if (AbstractC0572lo.a(bool3)) {
            this.f7116a.f4459b.setAdvIdentifiersTracking(bool3.booleanValue(), bool4.booleanValue());
        }
        P5 a2 = P5.a();
        F4 f4 = this.f7116a;
        a(a(a2, f4), f4, 1, (Map) null);
    }

    public final void a(P5 p5, Fh fh, int i2, Map map) {
        String str;
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        this.f7119d.b();
        if (!AbstractC0572lo.a(map)) {
            p5.setValue(AbstractC0430gb.b(map));
            a(p5, fh);
        }
        Bf bf = new Bf(fh.f4458a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(fh.f4459b);
        D8 d8 = fh.f4384c;
        synchronized (fh) {
            str = fh.f4387f;
        }
        a(new C0824vh(p5, false, i2, null, new Fh(bf, counterConfiguration, d8, str)));
    }

    public static P5 a(P5 p5, Fh fh) {
        if (AbstractC0842w9.f7096a.contains(Integer.valueOf(p5.f4907d))) {
            p5.f4906c = fh.d();
        }
        return p5;
    }

    public final void a(List list) {
        Bf bf = this.f7116a.f4458a;
        synchronized (bf) {
            bf.f4214a.put("PROCESS_CFG_CUSTOM_HOSTS", AbstractC0572lo.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
        }
    }

    public final void a(HashMap hashMap) {
        Bf bf = this.f7116a.f4458a;
        synchronized (bf) {
            bf.f4214a.put("PROCESS_CFG_CLIDS", AbstractC0430gb.b(hashMap));
        }
    }

    public final void a(String str) {
        Bf bf = this.f7116a.f4458a;
        synchronized (bf) {
            bf.f4214a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
        }
    }

    public final C0824vh a(Qn qn, Fh fh) {
        String str;
        String str2;
        this.f7119d.b();
        Sn sn = this.f7117b;
        sn.getClass();
        Gn gn = qn.f4964a;
        if (gn == null) {
            str = "";
        } else {
            str = (String) WrapUtils.getOrDefault(gn.f4444a, "");
        }
        byte[] fromModel = sn.f5074a.fromModel(qn);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(fh.f4459b.getApiKey());
        Set set = AbstractC0842w9.f7096a;
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        M3 m3 = new M3(fromModel, str, 5891, orCreatePublicLogger);
        m3.f4906c = fh.d();
        HashMap hashMap = m3.f4729q;
        Bf bf = new Bf(fh.f4458a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(fh.f4459b);
        D8 d8 = fh.f4384c;
        synchronized (fh) {
            str2 = fh.f4387f;
        }
        return new C0824vh(m3, true, 1, hashMap, new Fh(bf, counterConfiguration, d8, str2));
    }
}
