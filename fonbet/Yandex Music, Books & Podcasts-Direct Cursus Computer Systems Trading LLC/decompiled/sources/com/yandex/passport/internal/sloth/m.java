package com.yandex.passport.internal.sloth;

import android.content.Context;
import android.net.Uri;
import com.yandex.passport.R;
import defpackage.ouj;
import defpackage.u75;
import defpackage.uah;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class m {
    public final Context a;
    public final boolean b;
    public final List c;
    public final Object d;

    public m(Context context, com.yandex.passport.internal.properties.x xVar) {
        context.getClass();
        xVar.getClass();
        this.a = context;
        this.b = "taxi".equalsIgnoreCase(context.getString(R.string.passport_use_eula_agreement));
        String c = com.yandex.passport.legacy.f.c(context, xVar, true);
        c.getClass();
        String d = com.yandex.passport.legacy.f.d(context, xVar, true);
        d.getClass();
        this.c = u75.h(c, d);
        this.d = uah.e(new Pair(l.e, com.yandex.passport.legacy.f.c(context, xVar, false)), new Pair(l.f, com.yandex.passport.legacy.f.d(context, xVar, false)), new Pair(l.g, context.getString(R.string.passport_eula_taxi_agreement_url_override)));
    }

    public static Uri a(Uri uri) {
        Locale locale = Locale.US;
        Uri.Builder builder = new Uri.Builder();
        String scheme = uri.getScheme();
        Uri.Builder scheme2 = builder.scheme(scheme != null ? ouj.s(locale, scheme, locale) : null);
        String authority = uri.getAuthority();
        Uri.Builder authority2 = scheme2.authority(authority != null ? ouj.s(locale, authority, locale) : null);
        String path = uri.getPath();
        Uri.Builder path2 = authority2.path(path != null ? ouj.s(locale, path, locale) : null);
        String query = uri.getQuery();
        Uri.Builder query2 = path2.query(query != null ? ouj.s(locale, query, locale) : null);
        String encodedQuery = uri.getEncodedQuery();
        Uri.Builder encodedQuery2 = query2.encodedQuery(encodedQuery != null ? ouj.s(locale, encodedQuery, locale) : null);
        String fragment = uri.getFragment();
        Uri build = encodedQuery2.fragment(fragment != null ? ouj.s(locale, fragment, locale) : null).build();
        build.getClass();
        return build;
    }
}
