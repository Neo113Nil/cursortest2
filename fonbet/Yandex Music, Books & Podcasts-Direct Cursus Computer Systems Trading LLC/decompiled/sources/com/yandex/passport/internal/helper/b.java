package com.yandex.passport.internal.helper;

import android.content.Context;
import android.net.Uri;
import com.yandex.passport.common.analytics.k;
import com.yandex.passport.common.network.n;
import com.yandex.passport.common.network.p;
import com.yandex.passport.internal.l;
import defpackage.ouj;
import defpackage.r90;
import defpackage.vlv;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;

/* loaded from: classes4.dex */
public final class b {
    public final com.yandex.passport.internal.network.client.h a;
    public final com.yandex.passport.internal.core.accounts.e b;

    public b(Context context, com.yandex.passport.internal.network.client.h hVar, com.yandex.passport.internal.core.accounts.e eVar) {
        context.getClass();
        hVar.getClass();
        eVar.getClass();
        this.a = hVar;
        this.b = eVar;
    }

    public static String b(Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            return queryParameter;
        }
        throw new com.yandex.passport.api.exception.h(str.concat(" not found in uri"));
    }

    public final boolean a(com.yandex.passport.common.core.f fVar, Uri uri) {
        uri.getClass();
        l e = this.b.a().e(fVar);
        if (e == null) {
            throw new com.yandex.passport.api.exception.b(fVar);
        }
        com.yandex.passport.common.account.a aVar = e.d;
        com.yandex.passport.internal.network.client.g a = this.a.a(fVar.a);
        com.yandex.passport.internal.network.a aVar2 = a.d;
        com.yandex.passport.common.common.a aVar3 = a.h;
        k kVar = a.f;
        n nVar = a.b;
        String b = b(uri, "track_id");
        String b2 = b(uri, Constants.KEY_ACTION);
        if (b2.equals("accept")) {
            String b3 = b(uri, "secret");
            aVar.getClass();
            String d = aVar.d();
            String a2 = a.g.a();
            com.yandex.passport.internal.common.d dVar = (com.yandex.passport.internal.common.d) aVar3;
            Map c = kVar.c(dVar.a(), dVar.b());
            d.getClass();
            a2.getClass();
            c.getClass();
            a.c(nVar.N(new r90(d, c, b, a2, b3, 13)), new vlv(1, aVar2, com.yandex.passport.internal.network.a.class, "parseMultistepMagicLinkCommitResponse", "parseMultistepMagicLinkCommitResponse(Lokhttp3/Response;)V", 0, 11));
            return true;
        }
        if (!b2.equals("cancel")) {
            throw new com.yandex.passport.api.exception.h(ouj.k('\'', "Invalid action value in uri: '", b2));
        }
        aVar.getClass();
        String d2 = aVar.d();
        com.yandex.passport.internal.common.d dVar2 = (com.yandex.passport.internal.common.d) aVar3;
        Map c2 = kVar.c(dVar2.a(), dVar2.b());
        d2.getClass();
        c2.getClass();
        p k = com.appsflyer.internal.k.k((String) nVar.Q().b, "/1/bundle/auth/password/multi_step/magic_link/invalidate/");
        k.F("Ya-Consumer-Authorization", "OAuth ".concat(d2));
        k.P(c2);
        k.S("track_id", b);
        a.c(k.z(), new vlv(1, aVar2, com.yandex.passport.internal.network.a.class, "parseMultistepMagicLinkInvalidateResponse", "parseMultistepMagicLinkInvalidateResponse(Lokhttp3/Response;)V", 0, 14));
        return false;
    }
}
