package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class t8w implements vp3 {
    public static final ArrayList d;
    public final Regex a = new Regex("ysign[^/]*/");
    public final Regex b = new Regex("ysign[^,]*,");
    public final Pattern c = new Regex(",ts=[^,/]*(?=[,/])").a;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    static {
        xz0.Y(new String[]{"vsid", "vpuid", "video_content_id", "video_width", "video_height", "initial_bandwidth", "mburl", "bufsize"});
        List w0 = CollectionsKt.w0(jpt.a.values());
        ArrayList arrayList = new ArrayList();
        for (Object obj : w0) {
            if (!((v6n) obj).b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((v6n) it.next()).a);
        }
        d = arrayList2;
    }

    @Override // defpackage.vp3
    public final String f(nb7 nb7Var) {
        IntRange b;
        nb7Var.getClass();
        Uri uri = nb7Var.a;
        uri.getClass();
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str : uri.getQueryParameterNames()) {
            if (!d.contains(str)) {
                clearQuery.appendQueryParameter(str, uri.getQueryParameter(str));
            }
        }
        Uri build = clearQuery.build();
        build.getClass();
        Uri.Builder clearQuery2 = build.buildUpon().clearQuery();
        Set<String> queryParameterNames = build.getQueryParameterNames();
        queryParameterNames.getClass();
        for (String str2 : CollectionsKt.n0(queryParameterNames)) {
            clearQuery2.appendQueryParameter(str2, build.getQueryParameter(str2));
        }
        Uri build2 = clearQuery2.build();
        build2.getClass();
        String uri2 = build2.toString();
        uri2.getClass();
        if (!StringsKt.M(uri2, "mpd", false) && !StringsKt.M(uri2, "m3u8", false)) {
            for (MatchResult matchResult : CollectionsKt.j0(jhp.k(Regex.c(this.a, uri2)))) {
                if (StringsKt.M(matchResult.getValue(), "lid", false)) {
                    uri2 = StringsKt.Z(uri2, matchResult.b()).toString();
                } else {
                    String value = matchResult.getValue();
                    jch b2 = this.b.b(value);
                    if (b2 != null && (b = b2.b()) != null) {
                        value = StringsKt.Z(value, b).toString();
                    }
                    IntRange b3 = matchResult.b();
                    uri2.getClass();
                    b3.getClass();
                    value.getClass();
                    uri2 = StringsKt.c0(uri2, b3.a, b3.b + 1, value).toString();
                }
            }
            uri2 = StringsKt.Y(uri2, build2.getScheme() + "://" + build2.getHost());
        }
        String replaceAll = this.c.matcher(uri2).replaceAll("");
        replaceAll.getClass();
        return replaceAll;
    }
}
