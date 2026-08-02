package com.yandex.passport.internal.network.client;

import android.net.Uri;
import com.yandex.passport.api.b2;
import com.yandex.passport.common.analytics.k;
import com.yandex.passport.internal.common.l;
import com.yandex.passport.internal.flags.n;
import defpackage.b6e;
import defpackage.xq0;
import java.util.Arrays;
import java.util.Map;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class j {
    public final com.yandex.passport.internal.credentials.f a;
    public final com.yandex.passport.common.core.b b;
    public final com.yandex.passport.internal.network.d c;
    public final com.yandex.passport.common.ui.lang.b d;
    public final k e;
    public final com.yandex.passport.common.common.a f;

    public j(com.yandex.passport.internal.credentials.f fVar, com.yandex.passport.common.core.b bVar, com.yandex.passport.internal.network.d dVar, com.yandex.passport.common.ui.lang.b bVar2, k kVar, l lVar, com.yandex.passport.common.common.a aVar) {
        this.a = fVar;
        this.b = bVar;
        this.c = dVar;
        this.d = bVar2;
        this.e = kVar;
        this.f = aVar;
    }

    public final String a() {
        return ((com.yandex.passport.internal.network.h) this.c).g(this.b, 0L, null);
    }

    public final String b(String str, String str2, String str3, Map map) {
        str2.getClass();
        Uri.Builder appendQueryParameter = Uri.parse(e()).buildUpon().appendEncodedPath("broker2/start").appendQueryParameter("consumer", ((com.yandex.passport.internal.common.d) this.f).a()).appendQueryParameter("provider", str).appendQueryParameter("retpath", str2).appendQueryParameter("place", "query").appendQueryParameter("display", "touch").appendQueryParameter("scope", str3).appendQueryParameter("passthrough_errors", "UserDeniedError");
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                appendQueryParameter.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        String builder = appendQueryParameter.toString();
        builder.getClass();
        return builder;
    }

    public final byte[] c(String str) {
        str.getClass();
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("provider_token", str);
        com.yandex.passport.internal.credentials.f fVar = this.a;
        String query = appendQueryParameter.appendQueryParameter("client_id", fVar.c).appendQueryParameter("client_secret", fVar.d).build().getQuery();
        if (query == null) {
            xq0.q("empty query");
            return null;
        }
        byte[] bytes = query.getBytes(Charsets.UTF_8);
        bytes.getClass();
        return bytes;
    }

    public final Uri d() {
        Uri build = Uri.parse(a()).buildUpon().appendEncodedPath("closewebview").build();
        build.getClass();
        return build;
    }

    public final String e() {
        com.yandex.passport.internal.network.h hVar = (com.yandex.passport.internal.network.h) this.c;
        b2 b2Var = b2.d;
        com.yandex.passport.internal.flags.k kVar = n.d;
        com.yandex.passport.common.core.b bVar = this.b;
        String i = hVar.i(bVar, b2Var, kVar);
        if (i != null) {
            return i;
        }
        int ordinal = bVar.ordinal();
        String str = "https://social.yandex.%s";
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    str = "https://social-test.yandex.%s";
                } else if (ordinal != 3) {
                    if (ordinal != 4) {
                        b6e.l(bVar, "Unknown environment ");
                        return null;
                    }
                }
            }
            str = "";
        }
        return String.format(str, Arrays.copyOf(new Object[]{"ru"}, 1));
    }
}
