package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.ranges.a;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class u7e {
    public static final char[] k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final List g;
    public final String h;
    public final String i;
    public final boolean j;

    public u7e(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        str.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = str5;
        this.i = str6;
        this.j = str.equals("https");
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(StringsKt.S(str, ':', length, 4) + 1, StringsKt.S(str, '@', 0, 6));
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.i;
        int S = StringsKt.S(str, '/', length, 4);
        return str.substring(S, cvt.f(S, str.length(), str, "?#"));
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.i;
        int S = StringsKt.S(str, '/', length, 4);
        int f = cvt.f(S, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (S < f) {
            int i = S + 1;
            int g = cvt.g(str, '/', i, f);
            arrayList.add(str.substring(i, g));
            S = g;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int S = StringsKt.S(str, '?', 0, 6) + 1;
        return str.substring(S, cvt.g(str, '#', S, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(length, cvt.f(length, str.length(), str, ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof u7e) && ((u7e) obj).i.equals(this.i);
    }

    public final s7e f() {
        s7e s7eVar = new s7e();
        String str = this.a;
        s7eVar.a = str;
        s7eVar.b = e();
        s7eVar.c = a();
        s7eVar.d = this.d;
        str.getClass();
        int i = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i2 = this.e;
        s7eVar.e = i2 != i ? i2 : -1;
        ArrayList arrayList = s7eVar.f;
        arrayList.clear();
        arrayList.addAll(c());
        String d = d();
        String str2 = null;
        s7eVar.g = d != null ? ofc.G(ofc.g(d, true, " \"'<>#", 0, 0, 211)) : null;
        if (this.h != null) {
            String str3 = this.i;
            str2 = str3.substring(StringsKt.S(str3, '#', 0, 6) + 1);
        }
        s7eVar.h = str2;
        return s7eVar;
    }

    public final String g(String str) {
        List list = this.g;
        if (list == null) {
            return null;
        }
        a l = yhn.l(2, yhn.m(0, list.size()));
        int i = l.a;
        int i2 = l.b;
        int i3 = l.c;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return null;
        }
        while (!str.equals(list.get(i))) {
            if (i == i2) {
                return null;
            }
            i += i3;
        }
        return (String) list.get(i + 1);
    }

    public final Set h() {
        List list = this.g;
        if (list == null) {
            return q5b.a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        a l = yhn.l(2, yhn.m(0, list.size()));
        int i = l.a;
        int i2 = l.b;
        int i3 = l.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                Object obj = list.get(i);
                obj.getClass();
                linkedHashSet.add(obj);
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        Set unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        unmodifiableSet.getClass();
        return unmodifiableSet;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String i() {
        s7e s7eVar;
        try {
            s7eVar = new s7e();
            s7eVar.h(this, "/...");
        } catch (IllegalArgumentException unused) {
            s7eVar = null;
        }
        s7eVar.getClass();
        s7eVar.b = ofc.g("", false, " \"':;<=>@[]^`{}|/\\?#", 0, 0, 251);
        s7eVar.c = ofc.g("", false, " \"':;<=>@[]^`{}|/\\?#", 0, 0, 251);
        return s7eVar.e().i;
    }

    public final URI j() {
        s7e f = f();
        ArrayList arrayList = f.f;
        String str = f.d;
        f.d = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, ofc.g((String) arrayList.get(i), true, "[]", 0, 0, 227));
        }
        ArrayList arrayList2 = f.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? ofc.g(str2, true, "\\^`{|}", 0, 0, 195) : null);
            }
        }
        String str3 = f.h;
        f.h = str3 != null ? ofc.g(str3, true, " \"#<>\\^`{|}", 0, 0, 163) : null;
        String s7eVar = f.toString();
        try {
            return new URI(s7eVar);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(s7eVar, ""));
                create.getClass();
                return create;
            } catch (Exception unused) {
                b6e.q(e);
                return null;
            }
        }
    }

    public final String toString() {
        return this.i;
    }
}
