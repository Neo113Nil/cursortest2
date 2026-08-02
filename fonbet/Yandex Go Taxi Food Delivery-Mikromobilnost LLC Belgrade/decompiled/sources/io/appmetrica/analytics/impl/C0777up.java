package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.yandex.messaging.core.net.entities.BackendConfig;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.common.clid.ClidProvider;

/* renamed from: io.appmetrica.analytics.impl.up, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0777up {
    public final Xb a;
    public final C0532mb b;
    public final C0889yl c;
    public final C0538mh d;
    public final C0287dq e;
    public final Y3 f;
    public final C0236c3 g;
    public final Wc h;
    public final C0201aq i;
    public final C0536mf j;
    public final Ta k;

    public C0777up() {
        this(new Wc(), new Xb(), new C0532mb(), new C0889yl(), new C0538mh(), new C0287dq(), new Y3(), new C0236c3(), new C0201aq(), new C0536mf(), new Ta());
    }

    public final void a(C0922zp c0922zp, Uc uc) {
        long j;
        String str;
        ArrayList a;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4 = uc.optJSONObject("queries");
        if (optJSONObject4 != null && (optJSONObject2 = optJSONObject4.optJSONObject("list")) != null && (optJSONObject3 = optJSONObject2.optJSONObject(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST)) != null) {
            c0922zp.g = optJSONObject3.optString("url", null);
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = uc.get("distribution_customization");
        } catch (Throwable unused) {
        }
        JSONObject optJSONObject5 = ((JSONObject) jSONObject).optJSONObject(ClidProvider.CLID_TABLE_NAME);
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
            c0922zp.j = AbstractC0230bq.a((Map) hashMap);
        }
        JSONObject optJSONObject7 = uc.optJSONObject("locale");
        String str2 = "";
        c0922zp.m = (optJSONObject7 == null || (optJSONObject = optJSONObject7.optJSONObject("country")) == null || !optJSONObject.optBoolean("reliable", false)) ? "" : optJSONObject.optString("value", "");
        JSONObject optJSONObject8 = uc.optJSONObject(RemoteBioParameters.TIME);
        if (optJSONObject8 != null) {
            try {
                c0922zp.l = Long.valueOf(optJSONObject8.getLong("max_valid_difference_seconds"));
            } catch (Throwable unused2) {
            }
        }
        Rp rp = new Rp();
        JSONObject optJSONObject9 = uc.optJSONObject("stat_sending");
        if (optJSONObject9 != null) {
            rp.a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject9, "disabled_reporting_interval_seconds", rp.a);
        }
        this.e.getClass();
        c0922zp.p = new C0259cq(rp.a);
        this.b.getClass();
        Np np = new Np();
        try {
            Object jSONObject2 = new JSONObject();
            try {
                jSONObject2 = uc.get("features");
            } catch (Throwable unused3) {
            }
            JSONObject optJSONObject10 = ((JSONObject) jSONObject2).optJSONObject("list");
            if (optJSONObject10 != null) {
                C0295e5 c0295e5 = new C0295e5();
                c0295e5.a = C0532mb.a(optJSONObject10, "permissions_collecting", np.a);
                c0295e5.b = C0532mb.a(optJSONObject10, "features_collecting", np.b);
                c0295e5.c = C0532mb.a(optJSONObject10, "google_aid", np.c);
                c0295e5.d = C0532mb.a(optJSONObject10, "sim_info", np.d);
                c0295e5.e = C0532mb.a(optJSONObject10, "huawei_oaid", np.e);
                c0295e5.f = optJSONObject10.has("ssl_pinning") ? Boolean.valueOf(optJSONObject10.getJSONObject("ssl_pinning").getBoolean(BackendConfig.Restrictions.ENABLED)) : null;
                c0922zp.b = new C0353g5(c0295e5);
            }
        } catch (Throwable unused4) {
        }
        this.a.getClass();
        try {
            Object jSONObject3 = new JSONObject();
            try {
                jSONObject3 = uc.get("query_hosts");
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
                    c0922zp.d = str;
                }
                ArrayList a2 = Xb.a(optJSONObject11, "report");
                if (!Or.a((Collection) a2)) {
                    c0922zp.e = a2;
                }
                try {
                    str2 = optJSONObject11.getJSONObject("report_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused7) {
                }
                if (!TextUtils.isEmpty(str2)) {
                    c0922zp.f = str2;
                }
                ArrayList a3 = Xb.a(optJSONObject11, "startup");
                if (!Or.a((Collection) a3)) {
                    c0922zp.c = a3;
                }
                ArrayList a4 = Xb.a(optJSONObject11, "diagnostic");
                if (!Or.a((Collection) a4)) {
                    c0922zp.n = a4;
                }
                HashMap hashMap2 = new HashMap();
                Iterator<String> keys2 = optJSONObject11.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    if (!Xb.a.contains(next2) && (a = Xb.a(optJSONObject11, next2)) != null) {
                        hashMap2.put(next2, a);
                    }
                }
                c0922zp.o = hashMap2;
            }
        } catch (Throwable unused8) {
        }
        this.c.getClass();
        Sp sp = new Sp();
        JSONObject optJSONObject12 = uc.optJSONObject("retry_policy");
        int i = sp.w;
        int i2 = sp.x;
        if (optJSONObject12 != null) {
            i = optJSONObject12.optInt("max_interval_seconds", i);
            i2 = optJSONObject12.optInt("exponential_multiplier", sp.x);
        }
        c0922zp.q = new RetryPolicyConfig(i, i2);
        this.d.getClass();
        if (c0922zp.b.a) {
            JSONObject optJSONObject13 = uc.optJSONObject("permissions_collecting");
            Pp pp = new Pp();
            long j2 = pp.a;
            if (optJSONObject13 != null) {
                j2 = optJSONObject13.optLong("check_interval_seconds", j2);
                j = optJSONObject13.optLong("force_send_interval_seconds", pp.b);
            } else {
                j = pp.b;
            }
            c0922zp.k = new C0480kh(j2, j);
        }
        Y3 y3 = this.f;
        y3.getClass();
        Kp kp = new Kp();
        JSONObject optJSONObject14 = uc.optJSONObject("cache_control");
        if (optJSONObject14 != null) {
            kp.a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject14, "last_known_location_ttl", kp.a);
        }
        y3.a.getClass();
        c0922zp.r = new V3(kp.a);
        this.g.getClass();
        C0236c3.a(c0922zp, uc);
        C0201aq c0201aq = this.i;
        c0201aq.getClass();
        JSONObject optJSONObject15 = uc.optJSONObject("startup_update");
        Qp qp = new Qp();
        Integer a5 = Vc.a(optJSONObject15, "interval_seconds", null);
        if (a5 != null) {
            qp.a = a5.intValue();
        }
        c0201aq.a.getClass();
        c0922zp.t = new Yp(qp.a);
        Map<String, Te> b = this.j.a.b();
        C0507lf c0507lf = new C0507lf(uc);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Te> entry : b.entrySet()) {
            Object invoke = c0507lf.invoke(entry);
            if (invoke != null) {
                linkedHashMap.put(entry.getKey(), invoke);
            }
        }
        c0922zp.u = linkedHashMap;
        Sa sa = this.k.a;
        Mp mp = new Mp();
        JSONObject optJSONObject16 = uc.optJSONObject("external_attribution");
        if (optJSONObject16 != null) {
            mp.a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject16, "collecting_interval_seconds", mp.a);
        }
        sa.getClass();
        c0922zp.v = new Ra(mp.a);
    }

    public C0777up(Wc wc, Xb xb, C0532mb c0532mb, C0889yl c0889yl, C0538mh c0538mh, C0287dq c0287dq, Y3 y3, C0236c3 c0236c3, C0201aq c0201aq, C0536mf c0536mf, Ta ta) {
        this.a = xb;
        this.b = c0532mb;
        this.c = c0889yl;
        this.d = c0538mh;
        this.e = c0287dq;
        this.f = y3;
        this.g = c0236c3;
        this.h = wc;
        this.i = c0201aq;
        this.j = c0536mf;
        this.k = ta;
    }
}
