package com.yandex.passport.sloth;

import android.net.Uri;
import defpackage.t75;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class x0 {
    public static final List a = t75.c("track_id");

    public static final String a(String str) {
        str.getClass();
        Set<String> queryParameterNames = Uri.parse(str).getQueryParameterNames();
        List list = a;
        if (Collections.disjoint(queryParameterNames, list)) {
            return str;
        }
        Uri.Builder clearQuery = Uri.parse(str).buildUpon().clearQuery();
        for (String str2 : queryParameterNames) {
            if (!list.contains(str2)) {
                clearQuery.appendQueryParameter(str2, Uri.parse(str).getQueryParameter(str2));
            }
        }
        com.yandex.passport.common.url.a aVar = com.yandex.passport.common.url.b.Companion;
        Uri build = clearQuery.build();
        build.getClass();
        aVar.getClass();
        String uri = build.toString();
        uri.getClass();
        return uri;
    }
}
