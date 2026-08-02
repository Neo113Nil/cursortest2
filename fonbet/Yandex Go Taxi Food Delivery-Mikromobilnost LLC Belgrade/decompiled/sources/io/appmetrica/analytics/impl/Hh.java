package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class Hh extends AbstractC0421ig {
    public static final Kh d = new Kh("UUID_RESULT", null);
    public static final Kh e = new Kh("DEVICE_ID_RESULT", null);
    public static final Kh f = new Kh("DEVICE_ID_HASH_RESULT", null);
    public static final Kh g = new Kh("AD_URL_GET_RESULT", null);
    public static final Kh h = new Kh("AD_URL_REPORT_RESULT", null);
    public static final Kh i = new Kh("CUSTOM_HOSTS", null);
    public static final Kh j = new Kh("SERVER_TIME_OFFSET", null);
    public static final Kh k = new Kh("RESPONSE_CLIDS_RESULT", null);
    public static final Kh l = new Kh("CUSTOM_SDK_HOSTS", null);
    public static final Kh m = new Kh("CLIENT_CLIDS", null);
    public static final Kh n = new Kh("DEFERRED_DEEP_LINK_WAS_CHECKED", null);
    public static final Kh o = new Kh("API_LEVEL", null);
    public static final Kh p = new Kh("NEXT_STARTUP_TIME", null);
    public static final Kh q = new Kh("GAID", null);
    public static final Kh r = new Kh("HOAID", null);
    public static final Kh s = new Kh("YANDEX_ADV_ID", null);
    public static final Kh t = new Kh("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);
    public static final Kh u = new Kh("SCREEN_INFO", null);
    public static final Kh v = new Kh("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);
    public static final Kh w = new Kh("FEATURES", null);
    public static final Kh x = new Kh("APPMETRICA_CLIENT_CONFIG", null);

    public Hh(InterfaceC0418ic interfaceC0418ic) {
        super(interfaceC0418ic);
    }

    public final Hh a(C0503lb c0503lb) {
        String str = w.b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", c0503lb.a).put("STATUS", c0503lb.b.getValue()).putOpt("ERROR_EXPLANATION", c0503lb.c);
        } catch (Throwable unused) {
        }
        return (Hh) d(str, jSONObject.toString());
    }

    public final long b(long j2) {
        return this.a.getLong(j.a, j2);
    }

    public final Hh c(long j2) {
        return (Hh) d(o.b, j2);
    }

    public final Hh d(long j2) {
        return (Hh) d(p.b, j2);
    }

    public final Hh e(long j2) {
        return (Hh) d(j.b, j2);
    }

    public final AppMetricaConfig.Builder f() {
        String string = this.a.getString(x.b, null);
        if (string == null) {
            return null;
        }
        return new A4().a(string);
    }

    public final List<String> g() {
        String string = this.a.getString(i.b, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return Vc.c(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IdentifiersResult h(String str) {
        IdentifiersResult identifiersResult;
        String string;
        try {
            string = this.a.getString(str, null);
        } catch (Throwable unused) {
        }
        if (string != null) {
            JSONObject jSONObject = new JSONObject(string);
            identifiersResult = new IdentifiersResult(JsonUtils.optStringOrNull(jSONObject, "ID"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            return identifiersResult != null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "no identifier in preferences") : identifiersResult;
        }
        identifiersResult = null;
        if (identifiersResult != null) {
        }
    }

    public final String i(String str) {
        return this.a.getString(m.b, str);
    }

    public final Hh j(String str) {
        return (Hh) d(m.b, str);
    }

    public final C0503lb k() {
        String string = this.a.getString(w.b, null);
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                return new C0503lb(JsonUtils.optBooleanOrNull(jSONObject, "libSslEnabled"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new C0503lb(null, IdentifierStatus.UNKNOWN, null);
    }

    public final IdentifiersResult l() {
        return h(q.b);
    }

    public final IdentifiersResult m() {
        return h(r.b);
    }

    public final long n() {
        return this.a.getLong(p.b, 0L);
    }

    public final IdentifiersResult o() {
        return h(k.b);
    }

    public final ScreenInfo p() {
        return Vc.f(this.a.getString(u.b, null));
    }

    public final IdentifiersResult q() {
        return h(d.b);
    }

    public final IdentifiersResult r() {
        return h(s.b);
    }

    public final boolean s() {
        return this.a.getBoolean(n.b, false);
    }

    public final boolean t() {
        return this.a.getBoolean(v.b, false);
    }

    public final Hh u() {
        return (Hh) d(n.b, true);
    }

    public final void v() {
        d(v.b, true);
    }

    public final Hh b(IdentifiersResult identifiersResult) {
        return a(h.b, identifiersResult);
    }

    public final Hh c(IdentifiersResult identifiersResult) {
        return a(l.b, identifiersResult);
    }

    public final Hh d(IdentifiersResult identifiersResult) {
        return a(f.b, identifiersResult);
    }

    public final IdentifiersResult e() {
        return h(h.b);
    }

    public final Hh i(IdentifiersResult identifiersResult) {
        return a(d.b, identifiersResult);
    }

    public final Hh j(IdentifiersResult identifiersResult) {
        return a(s.b, identifiersResult);
    }

    public final Hh b(boolean z) {
        return (Hh) d(t.b, z);
    }

    public final IdentifiersResult d() {
        return h(g.b);
    }

    public final Hh e(IdentifiersResult identifiersResult) {
        return a(e.b, identifiersResult);
    }

    public final IdentifiersResult i() {
        return h(f.b);
    }

    public final IdentifiersResult j() {
        return h(e.b);
    }

    public final Hh g(IdentifiersResult identifiersResult) {
        return a(r.b, identifiersResult);
    }

    public final Hh f(IdentifiersResult identifiersResult) {
        return a(q.b, identifiersResult);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0421ig
    public final String g(String str) {
        return new Kh(str, null).b;
    }

    public final long a(long j2) {
        return this.a.getLong(o.b, j2);
    }

    public final Hh a(IdentifiersResult identifiersResult) {
        return a(g.b, identifiersResult);
    }

    public final Hh a(List<String> list) {
        return (Hh) d(i.b, Or.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
    }

    public final IdentifiersResult h() {
        return h(l.b);
    }

    public final boolean a(boolean z) {
        return this.a.getBoolean(t.b, z);
    }

    public final Hh h(IdentifiersResult identifiersResult) {
        return a(k.b, identifiersResult);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0421ig, io.appmetrica.analytics.impl.Jh
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final Hh e(String str) {
        return (Hh) f(new Kh(str, null).b);
    }

    public final void a(ScreenInfo screenInfo) {
        d(u.b, Vc.a(screenInfo));
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        d(x.b, appMetricaConfig.toJson());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Hh a(String str, IdentifiersResult identifiersResult) {
        String jSONObject;
        if (identifiersResult != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("ID", identifiersResult.id).put("STATUS", identifiersResult.status.getValue()).put("ERROR_EXPLANATION", identifiersResult.errorExplanation);
                } catch (Throwable unused) {
                }
                jSONObject = jSONObject2.toString();
            } catch (Throwable unused2) {
            }
            if (jSONObject != null) {
                d(str, jSONObject);
            }
            return this;
        }
        jSONObject = null;
        if (jSONObject != null) {
        }
        return this;
    }
}
