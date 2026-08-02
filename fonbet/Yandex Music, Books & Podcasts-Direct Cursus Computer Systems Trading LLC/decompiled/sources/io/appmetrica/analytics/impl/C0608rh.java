package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.rh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0608rh extends Tf {
    public static final C0695uh d = new C0695uh("UUID_RESULT", null);
    public static final C0695uh e = new C0695uh("DEVICE_ID_RESULT", null);
    public static final C0695uh f = new C0695uh("DEVICE_ID_HASH_RESULT", null);
    public static final C0695uh g = new C0695uh("AD_URL_GET_RESULT", null);
    public static final C0695uh h = new C0695uh("AD_URL_REPORT_RESULT", null);
    public static final C0695uh i = new C0695uh("CUSTOM_HOSTS", null);
    public static final C0695uh j = new C0695uh("SERVER_TIME_OFFSET", null);
    public static final C0695uh k = new C0695uh("RESPONSE_CLIDS_RESULT", null);
    public static final C0695uh l = new C0695uh("CUSTOM_SDK_HOSTS", null);
    public static final C0695uh m = new C0695uh("CLIENT_CLIDS", null);
    public static final C0695uh n = new C0695uh("DEFERRED_DEEP_LINK_WAS_CHECKED", null);
    public static final C0695uh o = new C0695uh("API_LEVEL", null);
    public static final C0695uh p = new C0695uh("NEXT_STARTUP_TIME", null);
    public static final C0695uh q = new C0695uh("GAID", null);
    public static final C0695uh r = new C0695uh("HOAID", null);
    public static final C0695uh s = new C0695uh("YANDEX_ADV_ID", null);
    public static final C0695uh t = new C0695uh("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);
    public static final C0695uh u = new C0695uh("SCREEN_INFO", null);
    public static final C0695uh v = new C0695uh("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);
    public static final C0695uh w = new C0695uh("FEATURES", null);
    public static final C0695uh x = new C0695uh("APPMETRICA_CLIENT_CONFIG", null);

    public C0608rh(Tb tb) {
        super(tb);
    }

    @NonNull
    public final C0608rh a(@NonNull C0199db c0199db) {
        String str = w.b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", c0199db.a).put("STATUS", c0199db.b.getIo.appmetrica.analytics.rtm.internal.Constants.KEY_VALUE java.lang.String()).putOpt("ERROR_EXPLANATION", c0199db.c);
        } catch (Throwable unused) {
        }
        return (C0608rh) b(str, jSONObject.toString());
    }

    public final long b(long j2) {
        return this.a.getLong(j.a, j2);
    }

    public final C0608rh c(long j2) {
        return (C0608rh) b(o.b, j2);
    }

    @NonNull
    public final C0608rh d(long j2) {
        return (C0608rh) b(p.b, j2);
    }

    public final C0608rh e(long j2) {
        return (C0608rh) b(j.b, j2);
    }

    public final AppMetricaConfig.Builder f() {
        String string = this.a.getString(x.b, null);
        if (string == null) {
            return null;
        }
        return new C0740w4().a(string);
    }

    public final List<String> g() {
        String string = this.a.getString(i.b, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return Fc.c(string);
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

    public final C0608rh j(String str) {
        return (C0608rh) b(m.b, str);
    }

    @NonNull
    public final C0199db k() {
        String string = this.a.getString(w.b, null);
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                return new C0199db(JsonUtils.optBooleanOrNull(jSONObject, "libSslEnabled"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new C0199db(null, IdentifierStatus.UNKNOWN, null);
    }

    @NonNull
    public final IdentifiersResult l() {
        return h(q.b);
    }

    @NonNull
    public final IdentifiersResult m() {
        return h(r.b);
    }

    @NonNull
    public final long n() {
        return this.a.getLong(p.b, 0L);
    }

    @NonNull
    public final IdentifiersResult o() {
        return h(k.b);
    }

    public final ScreenInfo p() {
        return Fc.f(this.a.getString(u.b, null));
    }

    @NonNull
    public final IdentifiersResult q() {
        return h(d.b);
    }

    @NonNull
    public final IdentifiersResult r() {
        return h(s.b);
    }

    public final boolean s() {
        return this.a.getBoolean(n.b, false);
    }

    public final boolean t() {
        return this.a.getBoolean(v.b, false);
    }

    public final C0608rh u() {
        return (C0608rh) b(n.b, true);
    }

    public final void v() {
        b(v.b, true);
    }

    @NonNull
    public final C0608rh b(IdentifiersResult identifiersResult) {
        return a(h.b, identifiersResult);
    }

    @NonNull
    public final C0608rh c(IdentifiersResult identifiersResult) {
        return a(l.b, identifiersResult);
    }

    @NonNull
    public final C0608rh d(IdentifiersResult identifiersResult) {
        return a(f.b, identifiersResult);
    }

    @NonNull
    public final C0608rh e(IdentifiersResult identifiersResult) {
        return a(e.b, identifiersResult);
    }

    @NonNull
    public final C0608rh i(IdentifiersResult identifiersResult) {
        return a(d.b, identifiersResult);
    }

    @NonNull
    public final C0608rh j(IdentifiersResult identifiersResult) {
        return a(s.b, identifiersResult);
    }

    public final C0608rh b(boolean z) {
        return (C0608rh) b(t.b, z);
    }

    @NonNull
    public final IdentifiersResult d() {
        return h(g.b);
    }

    @NonNull
    public final IdentifiersResult e() {
        return h(h.b);
    }

    @NonNull
    public final IdentifiersResult i() {
        return h(f.b);
    }

    @NonNull
    public final IdentifiersResult j() {
        return h(e.b);
    }

    @NonNull
    public final C0608rh f(IdentifiersResult identifiersResult) {
        return a(q.b, identifiersResult);
    }

    @NonNull
    public final C0608rh g(IdentifiersResult identifiersResult) {
        return a(r.b, identifiersResult);
    }

    @Override // io.appmetrica.analytics.impl.Tf
    @NonNull
    public final String f(@NonNull String str) {
        return new C0695uh(str, null).b;
    }

    public final long a(long j2) {
        return this.a.getLong(o.b, j2);
    }

    @NonNull
    public final C0608rh a(IdentifiersResult identifiersResult) {
        return a(g.b, identifiersResult);
    }

    public final C0608rh a(List<String> list) {
        return (C0608rh) b(i.b, AbstractC0734vr.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
    }

    @NonNull
    public final IdentifiersResult h() {
        return h(l.b);
    }

    public final boolean a(boolean z) {
        return this.a.getBoolean(t.b, z);
    }

    @NonNull
    public final C0608rh h(IdentifiersResult identifiersResult) {
        return a(k.b, identifiersResult);
    }

    @Override // io.appmetrica.analytics.impl.Tf
    @NonNull
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final C0608rh g(@NonNull String str) {
        return (C0608rh) d(new C0695uh(str, null).b);
    }

    public final void a(ScreenInfo screenInfo) {
        b(u.b, Fc.a(screenInfo));
    }

    public final void a(@NonNull AppMetricaConfig appMetricaConfig) {
        b(x.b, appMetricaConfig.toJson());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0608rh a(String str, IdentifiersResult identifiersResult) {
        String jSONObject;
        if (identifiersResult != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("ID", identifiersResult.id).put("STATUS", identifiersResult.status.getIo.appmetrica.analytics.rtm.internal.Constants.KEY_VALUE java.lang.String()).put("ERROR_EXPLANATION", identifiersResult.errorExplanation);
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
