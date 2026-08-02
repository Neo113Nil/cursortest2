package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.appsflyer.AdRevenueScheme;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.cp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0184cp {
    public final Hb a;
    public final C0227eb b;
    public final C0497nl c;
    public final Wg d;
    public final Lp e;
    public final V3 f;
    public final C0162c3 g;
    public final Gc h;
    public final Ip i;
    public final Xe j;
    public final La k;

    public C0184cp() {
        this(new Gc(), new Hb(), new C0227eb(), new C0497nl(), new Wg(), new Lp(), new V3(), new C0162c3(), new Ip(), new Xe(), new La());
    }

    public final void a(C0328hp c0328hp, Ec ec) {
        long j;
        String str;
        ArrayList a;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4 = ec.optJSONObject("queries");
        if (optJSONObject4 != null && (optJSONObject2 = optJSONObject4.optJSONObject("list")) != null && (optJSONObject3 = optJSONObject2.optJSONObject("host")) != null) {
            c0328hp.g = optJSONObject3.optString("url", null);
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = ec.get("distribution_customization");
        } catch (Throwable unused) {
        }
        JSONObject optJSONObject5 = ((JSONObject) jSONObject).optJSONObject("clids");
        if (optJSONObject5 != null) {
            HashMap hashMap = new HashMap();
            Iterator<String> keys = optJSONObject5.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject6 = optJSONObject5.optJSONObject(next);
                if (optJSONObject6 != null && optJSONObject6.has(Constants.KEY_VALUE)) {
                    hashMap.put(next, optJSONObject6.getString(Constants.KEY_VALUE));
                }
            }
            c0328hp.j = Jp.a((Map) hashMap);
        }
        JSONObject optJSONObject7 = ec.optJSONObject(CommonUrlParts.LOCALE);
        String str2 = "";
        c0328hp.m = (optJSONObject7 == null || (optJSONObject = optJSONObject7.optJSONObject(AdRevenueScheme.COUNTRY)) == null || !optJSONObject.optBoolean("reliable", false)) ? "" : optJSONObject.optString(Constants.KEY_VALUE, "");
        JSONObject optJSONObject8 = ec.optJSONObject("time");
        if (optJSONObject8 != null) {
            try {
                c0328hp.l = Long.valueOf(optJSONObject8.getLong("max_valid_difference_seconds"));
            } catch (Throwable unused2) {
            }
        }
        C0846zp c0846zp = new C0846zp();
        JSONObject optJSONObject9 = ec.optJSONObject("stat_sending");
        if (optJSONObject9 != null) {
            c0846zp.a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject9, "disabled_reporting_interval_seconds", c0846zp.a);
        }
        this.e.getClass();
        c0328hp.p = new Kp(c0846zp.a);
        this.b.getClass();
        C0732vp c0732vp = new C0732vp();
        try {
            Object jSONObject2 = new JSONObject();
            try {
                jSONObject2 = ec.get("features");
            } catch (Throwable unused3) {
            }
            JSONObject optJSONObject10 = ((JSONObject) jSONObject2).optJSONObject("list");
            if (optJSONObject10 != null) {
                C0106a5 c0106a5 = new C0106a5();
                c0106a5.a = C0227eb.a(optJSONObject10, "permissions_collecting", c0732vp.a);
                c0106a5.b = C0227eb.a(optJSONObject10, "features_collecting", c0732vp.b);
                c0106a5.c = C0227eb.a(optJSONObject10, "google_aid", c0732vp.c);
                c0106a5.d = C0227eb.a(optJSONObject10, "sim_info", c0732vp.d);
                c0106a5.e = C0227eb.a(optJSONObject10, "huawei_oaid", c0732vp.e);
                c0106a5.f = optJSONObject10.has("ssl_pinning") ? Boolean.valueOf(optJSONObject10.getJSONObject("ssl_pinning").getBoolean("enabled")) : null;
                c0328hp.b = new C0164c5(c0106a5);
            }
        } catch (Throwable unused4) {
        }
        this.a.getClass();
        try {
            Object jSONObject3 = new JSONObject();
            try {
                jSONObject3 = ec.get("query_hosts");
            } catch (Throwable unused5) {
            }
            JSONObject optJSONObject11 = ((JSONObject) jSONObject3).optJSONObject("list");
            if (optJSONObject11 != null) {
                try {
                    str = optJSONObject11.getJSONObject("get_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused6) {
                    str = "";
                }
                if (!TextUtils.isEmpty(str)) {
                    c0328hp.d = str;
                }
                ArrayList a2 = Hb.a(optJSONObject11, "report");
                if (!AbstractC0734vr.a((Collection) a2)) {
                    c0328hp.e = a2;
                }
                try {
                    str2 = optJSONObject11.getJSONObject("report_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused7) {
                }
                if (!TextUtils.isEmpty(str2)) {
                    c0328hp.f = str2;
                }
                ArrayList a3 = Hb.a(optJSONObject11, "startup");
                if (!AbstractC0734vr.a((Collection) a3)) {
                    c0328hp.c = a3;
                }
                ArrayList a4 = Hb.a(optJSONObject11, "diagnostic");
                if (!AbstractC0734vr.a((Collection) a4)) {
                    c0328hp.n = a4;
                }
                HashMap hashMap2 = new HashMap();
                Iterator<String> keys2 = optJSONObject11.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    if (!Hb.a.contains(next2) && (a = Hb.a(optJSONObject11, next2)) != null) {
                        hashMap2.put(next2, a);
                    }
                }
                c0328hp.o = hashMap2;
            }
        } catch (Throwable unused8) {
        }
        this.c.getClass();
        Ap ap = new Ap();
        JSONObject optJSONObject12 = ec.optJSONObject("retry_policy");
        int i = ap.w;
        int i2 = ap.x;
        if (optJSONObject12 != null) {
            i = optJSONObject12.optInt("max_interval_seconds", i);
            i2 = optJSONObject12.optInt("exponential_multiplier", ap.x);
        }
        c0328hp.q = new RetryPolicyConfig(i, i2);
        this.d.getClass();
        if (c0328hp.b.a) {
            JSONObject optJSONObject13 = ec.optJSONObject("permissions_collecting");
            C0790xp c0790xp = new C0790xp();
            long j2 = c0790xp.a;
            if (optJSONObject13 != null) {
                j2 = optJSONObject13.optLong("check_interval_seconds", j2);
                j = optJSONObject13.optLong("force_send_interval_seconds", c0790xp.b);
            } else {
                j = c0790xp.b;
            }
            c0328hp.k = new Ug(j2, j);
        }
        V3 v3 = this.f;
        v3.getClass();
        C0645sp c0645sp = new C0645sp();
        JSONObject optJSONObject14 = ec.optJSONObject("cache_control");
        if (optJSONObject14 != null) {
            c0645sp.a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject14, "last_known_location_ttl", c0645sp.a);
        }
        v3.a.getClass();
        c0328hp.r = new S3(c0645sp.a);
        this.g.getClass();
        C0162c3.a(c0328hp, ec);
        Ip ip = this.i;
        ip.getClass();
        JSONObject optJSONObject15 = ec.optJSONObject("startup_update");
        C0818yp c0818yp = new C0818yp();
        Integer a5 = Fc.a(optJSONObject15, "interval_seconds", null);
        if (a5 != null) {
            c0818yp.a = a5.intValue();
        }
        ip.a.getClass();
        c0328hp.t = new Gp(c0818yp.a);
        Map<String, Ee> c = this.j.a.c();
        We we = new We(ec);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Ee> entry : c.entrySet()) {
            Object invoke = we.invoke(entry);
            if (invoke != null) {
                linkedHashMap.put(entry.getKey(), invoke);
            }
        }
        c0328hp.u = linkedHashMap;
        Ka ka = this.k.a;
        C0703up c0703up = new C0703up();
        JSONObject optJSONObject16 = ec.optJSONObject("external_attribution");
        if (optJSONObject16 != null) {
            c0703up.a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject16, "collecting_interval_seconds", c0703up.a);
        }
        ka.getClass();
        c0328hp.v = new Ja(c0703up.a);
    }

    public C0184cp(Gc gc, Hb hb, C0227eb c0227eb, C0497nl c0497nl, Wg wg, Lp lp, V3 v3, C0162c3 c0162c3, Ip ip, Xe xe, La la) {
        this.a = hb;
        this.b = c0227eb;
        this.c = c0497nl;
        this.d = wg;
        this.e = lp;
        this.f = v3;
        this.g = c0162c3;
        this.h = gc;
        this.i = ip;
        this.j = xe;
        this.k = la;
    }
}
