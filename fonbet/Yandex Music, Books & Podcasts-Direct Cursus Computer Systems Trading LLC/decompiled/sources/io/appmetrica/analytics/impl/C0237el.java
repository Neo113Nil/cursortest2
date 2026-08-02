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

/* renamed from: io.appmetrica.analytics.impl.el, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0237el {
    public final C0741w5 a;
    public final Xq b;
    public final C0295gl c;
    public final C0649t0 d;
    public So e;
    public final Wm f;

    public C0237el(C0649t0 c0649t0, Xq xq, C0741w5 c0741w5, Wm wm) {
        this(c0649t0, xq, c0741w5, wm, new C0295gl(c0649t0, wm));
    }

    public final Yj a(Vq vq, C0351ik c0351ik) {
        String str;
        this.d.b();
        Xq xq = this.b;
        xq.getClass();
        Lq lq = vq.a;
        String str2 = lq == null ? "" : (String) WrapUtils.getOrDefault(lq.a, "");
        byte[] fromModel = xq.a.fromModel(vq);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(c0351ik.b.getApiKey());
        Set set = Ea.a;
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        C4 c4 = new C4(fromModel, str2, 5891, orCreatePublicLogger);
        c4.c = c0351ik.d();
        HashMap hashMap = c4.q;
        Xh xh = new Xh(c0351ik.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c0351ik.b);
        L9 l9 = c0351ik.c;
        synchronized (c0351ik) {
            str = c0351ik.f;
        }
        return new Yj(c4, true, 1, hashMap, new C0351ik(xh, counterConfiguration, l9, str));
    }

    public final void b(String str) {
        Xh xh = this.a.a;
        synchronized (xh) {
            xh.a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
        }
    }

    public C0237el(C0649t0 c0649t0, Xq xq, C0741w5 c0741w5, Wm wm, C0295gl c0295gl) {
        this.d = c0649t0;
        this.a = c0741w5;
        this.b = xq;
        this.f = wm;
        this.c = c0295gl;
    }

    public final void a(Ro ro) {
        this.e = ro;
        this.a.b.setUuid(ro.g());
    }

    public final void a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        if (AbstractC0734vr.a(bool)) {
            this.a.b.setLocationTracking(bool.booleanValue());
        }
        if (AbstractC0734vr.a(bool2)) {
            this.a.b.setDataSendingEnabled(bool2.booleanValue());
        }
        if (AbstractC0734vr.a(bool3)) {
            this.a.b.setAdvIdentifiersTracking(bool3.booleanValue(), bool4.booleanValue());
        }
        H6 a = H6.a();
        C0741w5 c0741w5 = this.a;
        a(a(a, c0741w5), c0741w5, 1, (Map) null);
    }

    public final void a(H6 h6, C0351ik c0351ik, int i, Map map) {
        String str;
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        this.d.b();
        if (!AbstractC0734vr.a(map)) {
            h6.setValue(Fc.c(map));
            a(h6, c0351ik);
        }
        Xh xh = new Xh(c0351ik.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c0351ik.b);
        L9 l9 = c0351ik.c;
        synchronized (c0351ik) {
            str = c0351ik.f;
        }
        a(new Yj(h6, false, i, null, new C0351ik(xh, counterConfiguration, l9, str)));
    }

    public static H6 a(H6 h6, C0351ik c0351ik) {
        if (Ea.a.contains(Integer.valueOf(h6.d))) {
            h6.c = c0351ik.d();
        }
        return h6;
    }

    public final void a(List list) {
        Xh xh = this.a.a;
        synchronized (xh) {
            xh.a.put("PROCESS_CFG_CUSTOM_HOSTS", AbstractC0734vr.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
        }
    }

    public final void a(HashMap hashMap) {
        Xh xh = this.a.a;
        synchronized (xh) {
            xh.a.put("PROCESS_CFG_CLIDS", Fc.c(hashMap));
        }
    }

    public final void a(String str) {
        Xh xh = this.a.a;
        synchronized (xh) {
            xh.a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
        }
    }

    public final void a(Yj yj) {
        C0351ik c0351ik = yj.e;
        So so = this.e;
        if (so != null) {
            c0351ik.b.setUuid(((Ro) so).g());
        } else {
            c0351ik.getClass();
        }
        this.c.a(yj);
    }
}
