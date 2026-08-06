package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Yl {

    /* renamed from: a, reason: collision with root package name */
    public final C0869xa f5446a;

    /* renamed from: b, reason: collision with root package name */
    public final W9 f5447b;

    /* renamed from: c, reason: collision with root package name */
    public final Fi f5448c;

    /* renamed from: d, reason: collision with root package name */
    public final C0925ze f5449d;

    /* renamed from: e, reason: collision with root package name */
    public final Hm f5450e;

    /* renamed from: f, reason: collision with root package name */
    public final C0422g3 f5451f;

    /* renamed from: g, reason: collision with root package name */
    public final C0628o2 f5452g;

    /* renamed from: h, reason: collision with root package name */
    public final C0456hb f5453h;

    /* renamed from: i, reason: collision with root package name */
    public final Em f5454i;

    /* renamed from: j, reason: collision with root package name */
    public final C0716rd f5455j;

    /* renamed from: k, reason: collision with root package name */
    public final D9 f5456k;

    public Yl() {
        this(new C0456hb(), new C0869xa(), new W9(), new Fi(), new C0925ze(), new Hm(), new C0422g3(), new C0628o2(), new Em(), new C0716rd(), new D9());
    }

    public final void a(C0364dm c0364dm, C0404fb c0404fb) {
        long j2;
        long j3;
        String str;
        ArrayList a2;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4 = c0404fb.optJSONObject("queries");
        if (optJSONObject4 != null && (optJSONObject2 = optJSONObject4.optJSONObject("list")) != null && (optJSONObject3 = optJSONObject2.optJSONObject("host")) != null) {
            c0364dm.f5830g = optJSONObject3.optString("url", null);
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = c0404fb.get("distribution_customization");
        } catch (Throwable unused) {
        }
        JSONObject optJSONObject5 = ((JSONObject) jSONObject).optJSONObject("clids");
        if (optJSONObject5 != null) {
            HashMap hashMap = new HashMap();
            Iterator<String> keys = optJSONObject5.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject6 = optJSONObject5.optJSONObject(next);
                if (optJSONObject6 != null && optJSONObject6.has("value")) {
                    hashMap.put(next, optJSONObject6.getString("value"));
                }
            }
            c0364dm.f5833j = Fm.a((Map) hashMap);
        }
        JSONObject optJSONObject7 = c0404fb.optJSONObject(CommonUrlParts.LOCALE);
        String str2 = "";
        c0364dm.f5836m = (optJSONObject7 == null || (optJSONObject = optJSONObject7.optJSONObject("country")) == null || !optJSONObject.optBoolean("reliable", false)) ? "" : optJSONObject.optString("value", "");
        JSONObject optJSONObject8 = c0404fb.optJSONObject("time");
        if (optJSONObject8 != null) {
            try {
                c0364dm.f5835l = Long.valueOf(optJSONObject8.getLong("max_valid_difference_seconds"));
            } catch (Throwable unused2) {
            }
        }
        C0829vm c0829vm = new C0829vm();
        JSONObject optJSONObject9 = c0404fb.optJSONObject("stat_sending");
        if (optJSONObject9 != null) {
            c0829vm.f7076a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject9, "disabled_reporting_interval_seconds", c0829vm.f7076a);
        }
        this.f5450e.getClass();
        c0364dm.f5839p = new Gm(c0829vm.f7076a);
        this.f5447b.getClass();
        C0725rm c0725rm = new C0725rm();
        try {
            Object jSONObject2 = new JSONObject();
            try {
                jSONObject2 = c0404fb.get("features");
            } catch (Throwable unused3) {
            }
            JSONObject optJSONObject10 = ((JSONObject) jSONObject2).optJSONObject("list");
            if (optJSONObject10 != null) {
                C0500j4 c0500j4 = new C0500j4();
                c0500j4.f6244a = W9.a(optJSONObject10, "permissions_collecting", c0725rm.f6848a);
                c0500j4.f6245b = W9.a(optJSONObject10, "features_collecting", c0725rm.f6849b);
                c0500j4.f6246c = W9.a(optJSONObject10, "google_aid", c0725rm.f6850c);
                c0500j4.f6247d = W9.a(optJSONObject10, "sim_info", c0725rm.f6851d);
                c0500j4.f6248e = W9.a(optJSONObject10, "huawei_oaid", c0725rm.f6852e);
                c0500j4.f6249f = optJSONObject10.has("ssl_pinning") ? Boolean.valueOf(optJSONObject10.getJSONObject("ssl_pinning").getBoolean("enabled")) : null;
                c0364dm.f5825b = new C0552l4(c0500j4);
            }
        } catch (Throwable unused4) {
        }
        this.f5446a.getClass();
        try {
            Object jSONObject3 = new JSONObject();
            try {
                jSONObject3 = c0404fb.get("query_hosts");
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
                    c0364dm.f5827d = str;
                }
                ArrayList a3 = C0869xa.a(optJSONObject11, "report");
                if (!AbstractC0572lo.a((Collection) a3)) {
                    c0364dm.f5828e = a3;
                }
                try {
                    str2 = optJSONObject11.getJSONObject("report_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused7) {
                }
                if (!TextUtils.isEmpty(str2)) {
                    c0364dm.f5829f = str2;
                }
                ArrayList a4 = C0869xa.a(optJSONObject11, "startup");
                if (!AbstractC0572lo.a((Collection) a4)) {
                    c0364dm.f5826c = a4;
                }
                ArrayList a5 = C0869xa.a(optJSONObject11, "diagnostic");
                if (!AbstractC0572lo.a((Collection) a5)) {
                    c0364dm.f5837n = a5;
                }
                HashMap hashMap2 = new HashMap();
                Iterator<String> keys2 = optJSONObject11.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    if (!C0869xa.f7196a.contains(next2) && (a2 = C0869xa.a(optJSONObject11, next2)) != null) {
                        hashMap2.put(next2, a2);
                    }
                }
                c0364dm.f5838o = hashMap2;
            }
        } catch (Throwable unused8) {
        }
        this.f5448c.getClass();
        C0855wm c0855wm = new C0855wm();
        JSONObject optJSONObject12 = c0404fb.optJSONObject("retry_policy");
        int i2 = c0855wm.f7151w;
        int i3 = c0855wm.f7152x;
        if (optJSONObject12 != null) {
            i2 = optJSONObject12.optInt("max_interval_seconds", i2);
            i3 = optJSONObject12.optInt("exponential_multiplier", c0855wm.f7152x);
        }
        c0364dm.f5840q = new RetryPolicyConfig(i2, i3);
        this.f5449d.getClass();
        if (c0364dm.f5825b.f6414a) {
            JSONObject optJSONObject13 = c0404fb.optJSONObject("permissions_collecting");
            C0777tm c0777tm = new C0777tm();
            if (optJSONObject13 != null) {
                j2 = optJSONObject13.optLong("check_interval_seconds", c0777tm.f6956a);
                j3 = optJSONObject13.optLong("force_send_interval_seconds", c0777tm.f6957b);
            } else {
                j2 = c0777tm.f6956a;
                j3 = c0777tm.f6957b;
            }
            c0364dm.f5834k = new C0873xe(j2, j3);
        }
        C0422g3 c0422g3 = this.f5451f;
        c0422g3.getClass();
        C0648om c0648om = new C0648om();
        JSONObject optJSONObject14 = c0404fb.optJSONObject("cache_control");
        if (optJSONObject14 != null) {
            c0648om.f6695a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject14, "last_known_location_ttl", c0648om.f6695a);
        }
        c0422g3.f6050a.getClass();
        c0364dm.f5841r = new C0345d3(c0648om.f6695a);
        this.f5452g.getClass();
        C0628o2.a(c0364dm, c0404fb);
        Em em = this.f5454i;
        em.getClass();
        JSONObject optJSONObject15 = c0404fb.optJSONObject("startup_update");
        C0803um c0803um = new C0803um();
        Integer a6 = AbstractC0430gb.a(optJSONObject15, "interval_seconds", null);
        if (a6 != null) {
            c0803um.f7025a = a6.intValue();
        }
        em.f4365a.getClass();
        c0364dm.t = new Cm(c0803um.f7025a);
        Map<String, Yc> c2 = this.f5455j.f6819a.c();
        C0691qd c0691qd = new C0691qd(c0404fb);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Yc> entry : c2.entrySet()) {
            Object invoke = c0691qd.invoke(entry);
            if (invoke != null) {
                linkedHashMap.put(entry.getKey(), invoke);
            }
        }
        c0364dm.f5843u = linkedHashMap;
        C9 c9 = this.f5456k.f4295a;
        C0700qm c0700qm = new C0700qm();
        JSONObject optJSONObject16 = c0404fb.optJSONObject("external_attribution");
        if (optJSONObject16 != null) {
            c0700qm.f6791a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject16, "collecting_interval_seconds", c0700qm.f6791a);
        }
        c9.getClass();
        c0364dm.f5844v = new B9(c0700qm.f6791a);
    }

    public Yl(C0456hb c0456hb, C0869xa c0869xa, W9 w9, Fi fi, C0925ze c0925ze, Hm hm, C0422g3 c0422g3, C0628o2 c0628o2, Em em, C0716rd c0716rd, D9 d9) {
        this.f5446a = c0869xa;
        this.f5447b = w9;
        this.f5448c = fi;
        this.f5449d = c0925ze;
        this.f5450e = hm;
        this.f5451f = c0422g3;
        this.f5452g = c0628o2;
        this.f5453h = c0456hb;
        this.f5454i = em;
        this.f5455j = c0716rd;
        this.f5456k = d9;
    }
}
