package e8;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f37437a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37438b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37439c;

    /* renamed from: d, reason: collision with root package name */
    public final String f37440d;

    /* renamed from: e, reason: collision with root package name */
    public final int f37441e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f37442f;

    /* renamed from: g, reason: collision with root package name */
    public final String f37443g;

    /* renamed from: h, reason: collision with root package name */
    public final String f37444h;

    public o(String str, String str2, String str3, String str4, int i, ArrayList arrayList, String str5, String str6) {
        this.f37437a = str;
        this.f37438b = str2;
        this.f37439c = str3;
        this.f37440d = str4;
        this.f37441e = i;
        this.f37442f = arrayList;
        this.f37443g = str5;
        this.f37444h = str6;
    }

    public final String a() {
        if (this.f37439c.length() == 0) {
            return "";
        }
        int length = this.f37437a.length() + 3;
        String str = this.f37444h;
        String substring = str.substring(M7.j.Q(str, ':', length, 4) + 1, M7.j.Q(str, '@', 0, 6));
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public final String b() {
        int length = this.f37437a.length() + 3;
        String str = this.f37444h;
        int Q3 = M7.j.Q(str, '/', length, 4);
        String substring = str.substring(Q3, f8.c.b(Q3, str.length(), str, "?#"));
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f37437a.length() + 3;
        String str = this.f37444h;
        int Q3 = M7.j.Q(str, '/', length, 4);
        int b9 = f8.c.b(Q3, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (Q3 < b9) {
            int i = Q3 + 1;
            int c4 = f8.c.c(str, i, b9, '/');
            String substring = str.substring(i, c4);
            kotlin.jvm.internal.h.d(substring, "substring(...)");
            arrayList.add(substring);
            Q3 = c4;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f37442f == null) {
            return null;
        }
        String str = this.f37444h;
        int Q3 = M7.j.Q(str, '?', 0, 6) + 1;
        String substring = str.substring(Q3, f8.c.c(str, Q3, str.length(), '#'));
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public final String e() {
        if (this.f37438b.length() == 0) {
            return "";
        }
        int length = this.f37437a.length() + 3;
        String str = this.f37444h;
        String substring = str.substring(length, f8.c.b(length, str.length(), str, ":@"));
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o) && kotlin.jvm.internal.h.a(((o) obj).f37444h, this.f37444h);
    }

    public final String f() {
        n nVar;
        try {
            nVar = new n();
            nVar.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            nVar = null;
        }
        kotlin.jvm.internal.h.b(nVar);
        nVar.f37430b = t8.a.a(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
        nVar.f37431c = t8.a.a(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
        return nVar.a().f37444h;
    }

    public final URI g() {
        String substring;
        String str;
        n nVar = new n();
        String scheme = this.f37437a;
        nVar.f37429a = scheme;
        nVar.f37430b = e();
        nVar.f37431c = a();
        nVar.f37432d = this.f37440d;
        kotlin.jvm.internal.h.e(scheme, "scheme");
        int i = scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1;
        int i4 = this.f37441e;
        nVar.f37433e = i4 != i ? i4 : -1;
        ArrayList arrayList = nVar.f37434f;
        arrayList.clear();
        arrayList.addAll(c());
        String d2 = d();
        nVar.f37435g = d2 != null ? n.d(t8.a.a(0, 0, 83, d2, " \"'<>#")) : null;
        if (this.f37443g == null) {
            substring = null;
        } else {
            String str2 = this.f37444h;
            substring = str2.substring(M7.j.Q(str2, '#', 0, 6) + 1);
            kotlin.jvm.internal.h.d(substring, "substring(...)");
        }
        nVar.f37436h = substring;
        String str3 = nVar.f37432d;
        if (str3 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            kotlin.jvm.internal.h.d(compile, "compile(...)");
            str = compile.matcher(str3).replaceAll("");
            kotlin.jvm.internal.h.d(str, "replaceAll(...)");
        } else {
            str = null;
        }
        nVar.f37432d = str;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.set(i9, t8.a.a(0, 0, 99, (String) arrayList.get(i9), "[]"));
        }
        ArrayList arrayList2 = nVar.f37435g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                String str4 = (String) arrayList2.get(i10);
                arrayList2.set(i10, str4 != null ? t8.a.a(0, 0, 67, str4, "\\^`{|}") : null);
            }
        }
        String str5 = nVar.f37436h;
        nVar.f37436h = str5 != null ? t8.a.a(0, 0, 35, str5, " \"#<>\\^`{|}") : null;
        String input = nVar.toString();
        try {
            return new URI(input);
        } catch (URISyntaxException e6) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                kotlin.jvm.internal.h.d(compile2, "compile(...)");
                kotlin.jvm.internal.h.e(input, "input");
                String replaceAll = compile2.matcher(input).replaceAll("");
                kotlin.jvm.internal.h.d(replaceAll, "replaceAll(...)");
                URI create = URI.create(replaceAll);
                kotlin.jvm.internal.h.b(create);
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e6);
            }
        }
    }

    public final int hashCode() {
        return this.f37444h.hashCode();
    }

    public final String toString() {
        return this.f37444h;
    }
}
