package defpackage;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes6.dex */
public final class gt7 implements eqt {
    public final ci1 b;

    public gt7(ci1 ci1Var, pa1 pa1Var) {
        this.b = ci1Var;
    }

    @Override // defpackage.eqt
    public final ou2 a(String str, boolean z) {
        str.getClass();
        Uri parse = Uri.parse(str);
        eqt.a.getClass();
        if (!CollectionsKt.I(dqt.b, parse.getScheme())) {
            Assertions.fail("parse(): invalid uri: ".concat(str));
        }
        im1 im1Var = new im1();
        im1Var.b = str;
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        queryParameterNames.getClass();
        Set<String> set = queryParameterNames;
        int a = tah.a(v75.o(set, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Object obj : set) {
            linkedHashMap.put(obj, parse.getQueryParameter((String) obj));
        }
        im1Var.d = linkedHashMap;
        im1Var.c = parse.getHost();
        im1Var.e = parse.getPathSegments();
        im1Var.f = z;
        return im1Var;
    }

    @Override // defpackage.eqt
    public final boolean b(String str) {
        Object t7oVar;
        str.getClass();
        try {
            r7o r7oVar = z7o.b;
            t7oVar = Uri.parse(str);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        Uri uri = (Uri) t7oVar;
        if (uri == null) {
            return false;
        }
        boolean booleanValue = ((Boolean) this.b.invoke(uri)).booleanValue();
        Pattern compile = Pattern.compile("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)");
        compile.getClass();
        return (Intrinsics.d(uri.getScheme(), "yandexmusic") || new Regex(compile).b(str) != null) && booleanValue;
    }
}
