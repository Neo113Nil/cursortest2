package defpackage;

import android.net.Uri;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes6.dex */
public abstract class vpt {
    public static Uri a(Uri uri, String str, String str2) {
        uri.getClass();
        str2.getClass();
        Uri.Builder buildUpon = uri.buildUpon();
        if (uri.getQueryParameter(str) != null) {
            buildUpon.clearQuery();
            for (String str3 : uri.getQueryParameterNames()) {
                if (!Intrinsics.d(str3, str)) {
                    buildUpon.appendQueryParameter(str3, uri.getQueryParameter(str3));
                }
            }
        }
        buildUpon.appendQueryParameter(str, str2);
        Uri build = buildUpon.build();
        build.getClass();
        return build;
    }

    public static String b(String str, String str2, String str3) {
        Uri uri;
        str.getClass();
        str3.getClass();
        try {
            uri = Uri.parse(str);
        } catch (Throwable th) {
            Timber.INSTANCE.e(th, "url parsing error ".concat(str), new Object[0]);
            uri = null;
        }
        if (uri == null) {
            return str;
        }
        String uri2 = a(uri, str2, str3).toString();
        uri2.getClass();
        return uri2;
    }

    public static String c(String str, String str2) {
        Pair pair;
        str.getClass();
        str2.getClass();
        try {
            Uri parse = Uri.parse(str);
            pair = new Pair(parse, parse.getQueryParameter("vsid"));
        } catch (Throwable th) {
            Timber.INSTANCE.e(th, "vsid parsing error", new Object[0]);
            pair = null;
        }
        if (pair == null) {
            return str;
        }
        Uri uri = (Uri) pair.a;
        if (((String) pair.b) != null) {
            return d(uri, str2, null);
        }
        String builder = uri.buildUpon().appendQueryParameter("vsid", str2).toString();
        builder.getClass();
        return builder;
    }

    public static String d(Uri uri, String str, ybr ybrVar) {
        String queryParameter = uri.getQueryParameter("vsid");
        if (queryParameter == null) {
            String uri2 = uri.toString();
            uri2.getClass();
            return uri2;
        }
        if (!queryParameter.equals(str) && ybrVar != null) {
            str.getClass();
            chs chsVar = ybrVar.m;
            chsVar.getClass();
            chsVar.a("StartFromCacheHelper", "onVsidChanged", "preloaderVsid=" + queryParameter + " newVsid = " + str, new Object[0]);
            ybrVar.h = queryParameter;
        }
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str2 : uri.getQueryParameterNames()) {
            if (Intrinsics.d(str2, "vsid")) {
                clearQuery.appendQueryParameter("vsid", str);
            } else {
                clearQuery.appendQueryParameter(str2, uri.getQueryParameter(str2));
            }
        }
        String builder = clearQuery.toString();
        builder.getClass();
        return builder;
    }

    public static Uri e(Uri uri, String str) {
        uri.getClass();
        Uri.Builder buildUpon = uri.buildUpon();
        if (uri.getQueryParameter(str) != null) {
            buildUpon.clearQuery();
            for (String str2 : uri.getQueryParameterNames()) {
                if (!Intrinsics.d(str2, str)) {
                    buildUpon.appendQueryParameter(str2, uri.getQueryParameter(str2));
                }
            }
        }
        Uri build = buildUpon.build();
        build.getClass();
        return build;
    }
}
