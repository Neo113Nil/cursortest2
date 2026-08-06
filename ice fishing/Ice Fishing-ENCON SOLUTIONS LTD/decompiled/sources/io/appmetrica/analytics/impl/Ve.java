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

/* loaded from: classes.dex */
public final class Ve extends AbstractC0898yd {

    /* renamed from: d, reason: collision with root package name */
    public static final Ye f5234d = new Ye("UUID_RESULT", null);

    /* renamed from: e, reason: collision with root package name */
    public static final Ye f5235e = new Ye("DEVICE_ID_RESULT", null);

    /* renamed from: f, reason: collision with root package name */
    public static final Ye f5236f = new Ye("DEVICE_ID_HASH_RESULT", null);

    /* renamed from: g, reason: collision with root package name */
    public static final Ye f5237g = new Ye("AD_URL_GET_RESULT", null);

    /* renamed from: h, reason: collision with root package name */
    public static final Ye f5238h = new Ye("AD_URL_REPORT_RESULT", null);

    /* renamed from: i, reason: collision with root package name */
    public static final Ye f5239i = new Ye("CUSTOM_HOSTS", null);

    /* renamed from: j, reason: collision with root package name */
    public static final Ye f5240j = new Ye("SERVER_TIME_OFFSET", null);

    /* renamed from: k, reason: collision with root package name */
    public static final Ye f5241k = new Ye("RESPONSE_CLIDS_RESULT", null);

    /* renamed from: l, reason: collision with root package name */
    public static final Ye f5242l = new Ye("CUSTOM_SDK_HOSTS", null);

    /* renamed from: m, reason: collision with root package name */
    public static final Ye f5243m = new Ye("CLIENT_CLIDS", null);

    /* renamed from: n, reason: collision with root package name */
    public static final Ye f5244n = new Ye("DEFERRED_DEEP_LINK_WAS_CHECKED", null);

    /* renamed from: o, reason: collision with root package name */
    public static final Ye f5245o = new Ye("API_LEVEL", null);

    /* renamed from: p, reason: collision with root package name */
    public static final Ye f5246p = new Ye("NEXT_STARTUP_TIME", null);

    /* renamed from: q, reason: collision with root package name */
    public static final Ye f5247q = new Ye("GAID", null);

    /* renamed from: r, reason: collision with root package name */
    public static final Ye f5248r = new Ye("HOAID", null);

    /* renamed from: s, reason: collision with root package name */
    public static final Ye f5249s = new Ye("YANDEX_ADV_ID", null);
    public static final Ye t = new Ye("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);

    /* renamed from: u, reason: collision with root package name */
    public static final Ye f5250u = new Ye("SCREEN_INFO", null);

    /* renamed from: v, reason: collision with root package name */
    public static final Ye f5251v = new Ye("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);

    /* renamed from: w, reason: collision with root package name */
    public static final Ye f5252w = new Ye("FEATURES", null);

    /* renamed from: x, reason: collision with root package name */
    public static final Ye f5253x = new Ye("APPMETRICA_CLIENT_CONFIG", null);

    public Ve(Ha ha) {
        super(ha);
    }

    public final boolean a(boolean z2) {
        return this.f5393a.getBoolean(t.f5434b, z2);
    }

    public final long b(long j2) {
        return this.f5393a.getLong(f5240j.f5433a, j2);
    }

    public final Ve c(IdentifiersResult identifiersResult) {
        return a(f5242l.f5434b, identifiersResult);
    }

    public final IdentifiersResult d() {
        return h(f5237g.f5434b);
    }

    public final IdentifiersResult e() {
        return h(f5238h.f5434b);
    }

    public final Ve f(IdentifiersResult identifiersResult) {
        return a(f5247q.f5434b, identifiersResult);
    }

    public final IdentifiersResult h() {
        return h(f5242l.f5434b);
    }

    public final IdentifiersResult i() {
        return h(f5236f.f5434b);
    }

    public final IdentifiersResult j() {
        return h(f5235e.f5434b);
    }

    public final V9 k() {
        String string = this.f5393a.getString(f5252w.f5434b, null);
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                return new V9(JsonUtils.optBooleanOrNull(jSONObject, "libSslEnabled"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new V9(null, IdentifierStatus.UNKNOWN, null);
    }

    public final IdentifiersResult l() {
        return h(f5247q.f5434b);
    }

    public final IdentifiersResult m() {
        return h(f5248r.f5434b);
    }

    public final long n() {
        return this.f5393a.getLong(f5246p.f5434b, 0L);
    }

    public final IdentifiersResult o() {
        return h(f5241k.f5434b);
    }

    public final ScreenInfo p() {
        return AbstractC0430gb.e(this.f5393a.getString(f5250u.f5434b, null));
    }

    public final IdentifiersResult q() {
        return h(f5234d.f5434b);
    }

    public final IdentifiersResult r() {
        return h(f5249s.f5434b);
    }

    public final boolean s() {
        return this.f5393a.getBoolean(f5244n.f5434b, false);
    }

    public final boolean t() {
        return this.f5393a.getBoolean(f5251v.f5434b, false);
    }

    public final Ve u() {
        return (Ve) b(f5244n.f5434b, true);
    }

    public final void v() {
        b(f5251v.f5434b, true);
    }

    public final List<String> g() {
        String string = this.f5393a.getString(f5239i.f5434b, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return AbstractC0430gb.b(string);
    }

    public final long a(long j2) {
        return this.f5393a.getLong(f5245o.f5434b, j2);
    }

    public final Ve b(IdentifiersResult identifiersResult) {
        return a(f5238h.f5434b, identifiersResult);
    }

    public final Ve c(long j2) {
        return (Ve) b(f5245o.f5434b, j2);
    }

    public final Ve d(IdentifiersResult identifiersResult) {
        return a(f5236f.f5434b, identifiersResult);
    }

    public final Ve e(IdentifiersResult identifiersResult) {
        return a(f5235e.f5434b, identifiersResult);
    }

    public final AppMetricaConfig.Builder f() {
        String string = this.f5393a.getString(f5253x.f5434b, null);
        if (string == null) {
            return null;
        }
        return new G3().a(string);
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
            string = this.f5393a.getString(str, null);
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

    public final Ve i(IdentifiersResult identifiersResult) {
        return a(f5234d.f5434b, identifiersResult);
    }

    public final Ve j(IdentifiersResult identifiersResult) {
        return a(f5249s.f5434b, identifiersResult);
    }

    public final Ve g(IdentifiersResult identifiersResult) {
        return a(f5248r.f5434b, identifiersResult);
    }

    public final Ve a(IdentifiersResult identifiersResult) {
        return a(f5237g.f5434b, identifiersResult);
    }

    public final Ve b(boolean z2) {
        return (Ve) b(t.f5434b, z2);
    }

    public final Ve d(long j2) {
        return (Ve) b(f5246p.f5434b, j2);
    }

    public final Ve e(long j2) {
        return (Ve) b(f5240j.f5434b, j2);
    }

    public final String i(String str) {
        return this.f5393a.getString(f5243m.f5434b, str);
    }

    public final Ve j(String str) {
        return (Ve) b(f5243m.f5434b, str);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0898yd
    public final String f(String str) {
        return new Ye(str, null).f5434b;
    }

    public final Ve a(List<String> list) {
        return (Ve) b(f5239i.f5434b, AbstractC0572lo.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
    }

    public final Ve h(IdentifiersResult identifiersResult) {
        return a(f5241k.f5434b, identifiersResult);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0898yd
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final Ve g(String str) {
        return (Ve) d(new Ye(str, null).f5434b);
    }

    public final Ve a(V9 v9) {
        String str = f5252w.f5434b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", v9.f5225a).put("STATUS", v9.f5226b.getValue()).putOpt("ERROR_EXPLANATION", v9.f5227c);
        } catch (Throwable unused) {
        }
        return (Ve) b(str, jSONObject.toString());
    }

    public final void a(ScreenInfo screenInfo) {
        b(f5250u.f5434b, AbstractC0430gb.a(screenInfo));
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        b(f5253x.f5434b, appMetricaConfig.toJson());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Ve a(String str, IdentifiersResult identifiersResult) {
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
                b(str, jSONObject);
            }
            return this;
        }
        jSONObject = null;
        if (jSONObject != null) {
        }
        return this;
    }
}
