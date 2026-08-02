package defpackage;

import android.net.Uri;
import com.appsflyer.internal.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class zp3 {
    public static final Regex a = new Regex("label=\\d*p");

    public static String a(yp3 yp3Var, Map map) {
        String str;
        if (map == null || (str = (String) map.get(yp3Var.a)) == null) {
            return "path=" + yp3Var.a + "\nname=" + yp3Var.b;
        }
        return str + '/' + yp3Var.b;
    }

    public static void b(StringBuilder sb, nb7 nb7Var, LinkedHashMap linkedHashMap) {
        String value;
        sb.append("\nMissing key:");
        String str = e0s.b;
        sb.append(str);
        String str2 = nb7Var.h;
        if (str2 == null) {
            str2 = "";
        }
        yp3 c = c(str2);
        sb.append(a(c, linkedHashMap));
        sb.append(str);
        jch b = a.b(c.a);
        if (b == null || (value = b.getValue()) == null) {
            return;
        }
        sb.append("quality=".concat(value));
        sb.append(str);
    }

    public static yp3 c(String str) {
        if (str == null || StringsKt.U(str)) {
            return new yp3(str, "");
        }
        Uri parse = Uri.parse(str);
        StringBuilder sb = new StringBuilder();
        String scheme = parse.getScheme();
        String concat = scheme != null ? scheme.concat("/") : null;
        if (concat == null) {
            concat = "";
        }
        sb.append(concat);
        String host = parse.getHost();
        String concat2 = host != null ? host.concat("/") : null;
        if (concat2 == null) {
            concat2 = "";
        }
        sb.append(concat2);
        List<String> pathSegments = parse.getPathSegments();
        pathSegments.getClass();
        sb.append(CollectionsKt.X(CollectionsKt.M(pathSegments), "/", null, null, null, 62));
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        String lastPathSegment = parse.getLastPathSegment();
        sb3.append(lastPathSegment != null ? lastPathSegment : "");
        String query = parse.getQuery();
        sb3.append(query != null ? hlr.c(query, "?") : null);
        return new yp3(sb2, sb3.toString());
    }

    public static String d(so3 so3Var, nb7 nb7Var, boolean z) {
        String value;
        nb7Var.getClass();
        if (z || so3Var == null) {
            StringBuilder sb = new StringBuilder();
            b(sb, nb7Var, null);
            return sb.toString();
        }
        Set c = so3Var.c();
        c.getClass();
        List w0 = CollectionsKt.w0(c);
        ArrayList arrayList = new ArrayList(v75.o(w0, 10));
        Iterator it = w0.iterator();
        while (it.hasNext()) {
            arrayList.add(c((String) it.next()));
        }
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((yp3) it2.next()).a);
        }
        List w02 = CollectionsKt.w0(CollectionsKt.z0(arrayList2));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj : w02) {
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            String str = (String) obj;
            jch b = a.b(str);
            linkedHashMap.put(str, (b == null || (value = b.getValue()) == null) ? k5r.i(i, "PATH_") : "PATH_" + i + '(' + value + ')');
            i = i2;
        }
        StringBuilder k = dfi.k("Paths:");
        k.append(e0s.b);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            k.append(((String) entry.getValue()) + ": " + ((String) entry.getKey()));
            k.append(e0s.b);
        }
        k.append("\nSegments:");
        k.append(e0s.b);
        ArrayList arrayList3 = new ArrayList(v75.o(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(a((yp3) it3.next(), linkedHashMap));
        }
        Iterator it4 = CollectionsKt.n0(arrayList3).iterator();
        while (it4.hasNext()) {
            k.append((String) it4.next());
            k.append(e0s.b);
        }
        b(k, nb7Var, linkedHashMap);
        return k.toString();
    }

    public static String e(so3 so3Var, nb7 nb7Var) {
        so3Var.getClass();
        nb7Var.getClass();
        String str = nb7Var.h;
        Uri uri = nb7Var.a;
        if (str == null) {
            return k5r.k(uri, "it is empty key for ");
        }
        StringBuilder q = k.q("For ", qc6.a(so3Var.a(str)), str, " contain ");
        q.append(" bytes in cache from ");
        q.append(nb7Var.g);
        q.append(". URL: ");
        q.append(uri);
        return q.toString();
    }
}
