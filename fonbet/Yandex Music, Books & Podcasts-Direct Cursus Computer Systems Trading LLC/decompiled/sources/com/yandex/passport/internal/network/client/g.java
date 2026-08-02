package com.yandex.passport.internal.network.client;

import android.util.Log;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.common.analytics.k;
import com.yandex.passport.common.network.n;
import com.yandex.passport.common.network.p;
import com.yandex.passport.internal.analytics.a0;
import com.yandex.passport.internal.analytics.m;
import com.yandex.passport.internal.analytics.z;
import com.yandex.passport.internal.entities.l;
import defpackage.d0o;
import defpackage.dvk;
import defpackage.mkn;
import defpackage.vlv;
import defpackage.xy0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class g {
    public final OkHttpClient a;
    public final n b;
    public final com.yandex.passport.internal.credentials.f c;
    public final com.yandex.passport.internal.network.a d;
    public final z e;
    public final k f;
    public final com.yandex.passport.internal.f g;
    public final com.yandex.passport.common.common.a h;

    public g(OkHttpClient okHttpClient, n nVar, com.yandex.passport.internal.credentials.f fVar, com.yandex.passport.internal.network.a aVar, z zVar, k kVar, com.yandex.passport.internal.f fVar2, com.yandex.passport.common.common.a aVar2) {
        this.a = okHttpClient;
        this.b = nVar;
        this.c = fVar;
        this.d = aVar;
        this.e = zVar;
        this.f = kVar;
        this.g = fVar2;
        this.h = aVar2;
    }

    public final com.yandex.passport.internal.network.response.h a(com.yandex.passport.common.account.a aVar, String str) {
        aVar.getClass();
        str.getClass();
        String d = aVar.d();
        d.getClass();
        p k = com.appsflyer.internal.k.k((String) this.b.Q().b, "/2/authorize/commit");
        k.F("Ya-Consumer-Authorization", "OAuth ".concat(d));
        k.S(CommonUrlParts.REQUEST_ID, str);
        Object c = c(k.z(), new vlv(1, this.d, com.yandex.passport.internal.network.a.class, "parseLoginSdkTokenResponse", "parseLoginSdkTokenResponse(Lokhttp3/Response;)Lcom/yandex/passport/internal/network/response/LoginSdkResult;", 0, 12));
        c.getClass();
        return (com.yandex.passport.internal.network.response.h) c;
    }

    public final void b(com.yandex.passport.common.account.a aVar, com.yandex.passport.common.account.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        String d = aVar.d();
        String d2 = aVar2.d();
        String str = this.c.c;
        com.yandex.passport.internal.common.d dVar = (com.yandex.passport.internal.common.d) this.h;
        Map c = this.f.c(dVar.a(), dVar.b());
        d.getClass();
        d2.getClass();
        str.getClass();
        c.getClass();
        p k = com.appsflyer.internal.k.k((String) this.b.Q().b, "/1/bind_yandex_by_token");
        k.F("Authorization", "Bearer ".concat(d));
        k.P(c);
        k.S("token", d2);
        k.S("client_id", str);
        ((Boolean) c(k.z(), new vlv(1, this.d, com.yandex.passport.internal.network.a.class, "parseLinkageCreationResponse", "parseLinkageCreationResponse(Lokhttp3/Response;)Z", 0, 13))).getClass();
    }

    public final Object c(d0o d0oVar, Function1 function1) {
        int i = 0;
        do {
            try {
                return function1.invoke(new mkn(this.a, d0oVar, false).execute());
            } catch (com.yandex.passport.data.exceptions.h e) {
                boolean z = true;
                i++;
                String message = e.getMessage();
                if (message == null) {
                    Pattern pattern = com.yandex.passport.internal.ui.e.d;
                    z = false;
                } else if (!com.yandex.passport.internal.ui.e.d.matcher(message).find()) {
                    z = "backend.failed".equals(message);
                }
                if (!z) {
                    throw e;
                }
                a0 a0Var = (a0) this.e;
                xy0 xy0Var = new xy0(0);
                xy0Var.put("error", Log.getStackTraceString(e));
                a0Var.a.b(m.q, xy0Var);
                Thread.sleep(300L);
            }
        } while (i < 3);
        throw e;
    }

    public final l d(com.yandex.passport.common.account.a aVar, String str, String str2) {
        aVar.getClass();
        str.getClass();
        str2.getClass();
        String d = aVar.d();
        d.getClass();
        n nVar = new n((String) this.b.Q().b, 0);
        nVar.J("/1/user_info/anonymized");
        nVar.F("Ya-Consumer-Authorization", "OAuth ".concat(d));
        nVar.O("client_id", str);
        nVar.O("redirect_uri", str2);
        Object c = c(nVar.z(), new vlv(1, this.d, com.yandex.passport.internal.network.a.class, "parseAnonymizedUserInfo", "parseAnonymizedUserInfo(Lokhttp3/Response;)Lcom/yandex/passport/internal/entities/JwtToken;", 0, 16));
        c.getClass();
        return (l) c;
    }

    public final com.yandex.passport.internal.network.response.g e(com.yandex.passport.common.account.a aVar, String str, List list, String str2, String str3, String str4, String str5, String str6) {
        aVar.getClass();
        str.getClass();
        list.getClass();
        str2.getClass();
        str3.getClass();
        String d = aVar.d();
        com.yandex.passport.internal.common.d dVar = (com.yandex.passport.internal.common.d) this.h;
        Map c = this.f.c(dVar.a(), dVar.b());
        d.getClass();
        c.getClass();
        Object c2 = c(this.b.N(new dvk(d, str, str2, str3, str4, str5, list, str6, c, 1)), new vlv(1, this.d, com.yandex.passport.internal.network.a.class, "parseExternalApplicationPermissionsResponse", "parseExternalApplicationPermissionsResponse(Lokhttp3/Response;)Lcom/yandex/passport/internal/network/response/ExternalApplicationPermissionsResult;", 0, 17));
        c2.getClass();
        return (com.yandex.passport.internal.network.response.g) c2;
    }

    public final l f(String str) {
        str.getClass();
        n nVar = new n((String) this.b.Q().b, 0);
        nVar.J("/1/yandex_login/info");
        nVar.F("Ya-Consumer-Authorization", "OAuth ".concat(str));
        nVar.O("format", "jwt");
        Object c = c(nVar.z(), new vlv(1, this.d, com.yandex.passport.internal.network.a.class, "parseJwtToken", "parseJwtToken(Lokhttp3/Response;)Lcom/yandex/passport/internal/entities/JwtToken;", 0, 18));
        c.getClass();
        return (l) c;
    }

    public final com.yandex.passport.common.account.a g(String str, String str2) {
        str.getClass();
        str2.getClass();
        com.yandex.passport.internal.credentials.f fVar = this.c;
        String str3 = fVar.c;
        String str4 = fVar.d;
        com.yandex.passport.internal.common.d dVar = (com.yandex.passport.internal.common.d) this.h;
        Map c = this.f.c(dVar.a(), dVar.b());
        str3.getClass();
        str4.getClass();
        c.getClass();
        p pVar = new p((String) this.b.Q().b);
        pVar.J("/1/external_auth_by_password");
        pVar.S("client_id", str3);
        pVar.S("client_secret", str4);
        pVar.S("password", str2);
        pVar.S("email", str);
        pVar.P(c);
        Object c2 = c(pVar.z(), b.a);
        c2.getClass();
        return (com.yandex.passport.common.account.a) c2;
    }

    public final com.yandex.passport.common.core.g h(com.yandex.passport.common.account.a aVar) {
        String d = aVar.d();
        com.yandex.passport.internal.common.d dVar = (com.yandex.passport.internal.common.d) this.h;
        Map c = this.f.c(dVar.a(), dVar.b());
        d.getClass();
        c.getClass();
        n nVar = new n((String) this.b.Q().b, 0);
        nVar.J("/1/bundle/account/short_info/");
        nVar.F("Authorization", "OAuth ".concat(d));
        nVar.O("avatar_size", "islands-300");
        nVar.P(c);
        com.yandex.passport.common.core.g gVar = (com.yandex.passport.common.core.g) c(nVar.z(), new vlv(1, this.d, com.yandex.passport.internal.network.a.class, "parseUserInfoResponse", "parseUserInfoResponse(Lokhttp3/Response;)Lcom/yandex/passport/common/core/UserInfo;", 0, 19));
        if (gVar != null) {
            return gVar;
        }
        throw new RuntimeException();
    }

    public final com.yandex.passport.internal.network.response.d i(final String str, final boolean z, final boolean z2, com.yandex.passport.internal.credentials.f fVar, final String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        com.yandex.passport.internal.credentials.f fVar2 = this.c;
        final String str5 = fVar2.c;
        final String str6 = fVar2.d;
        final String str7 = fVar != null ? fVar.c : null;
        final String str8 = fVar != null ? fVar.d : null;
        final Map c = this.f.c(str3, str4);
        str5.getClass();
        str6.getClass();
        c.getClass();
        Object c2 = c(this.b.N(new Function1() { // from class: com.yandex.passport.internal.network.requester.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                p pVar = (p) obj;
                pVar.getClass();
                pVar.J("/2/bundle/mobile/start/");
                pVar.S(LegacyAccountType.STRING_LOGIN, str);
                pVar.S("force_register", Boolean.toString(z));
                pVar.S("is_phone_number", Boolean.toString(z2));
                pVar.S("x_token_client_id", str5);
                pVar.S("x_token_client_secret", str6);
                pVar.S("client_id", str7);
                pVar.S("client_secret", str8);
                pVar.S("display_language", str2);
                pVar.P(c);
                return Unit.a;
            }
        }), new vlv(1, this.d, com.yandex.passport.internal.network.a.class, "parseAuthorizationStartResponse", "parseAuthorizationStartResponse(Lokhttp3/Response;)Lcom/yandex/passport/internal/network/response/AuthorizationStartResult;", 0, 20));
        c2.getClass();
        return (com.yandex.passport.internal.network.response.d) c2;
    }
}
