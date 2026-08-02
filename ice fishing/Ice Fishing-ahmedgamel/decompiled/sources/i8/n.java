package i8;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f38278a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38279b;

    /* renamed from: c, reason: collision with root package name */
    public final String f38280c;

    /* renamed from: d, reason: collision with root package name */
    public final String f38281d;

    /* renamed from: e, reason: collision with root package name */
    public final int f38282e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f38283f;

    /* renamed from: g, reason: collision with root package name */
    public final String f38284g;

    /* renamed from: h, reason: collision with root package name */
    public final String f38285h;

    public n(String str, String str2, String str3, String str4, int i, ArrayList arrayList, String str5, String str6) {
        this.f38278a = str;
        this.f38279b = str2;
        this.f38280c = str3;
        this.f38281d = str4;
        this.f38282e = i;
        this.f38283f = arrayList;
        this.f38284g = str5;
        this.f38285h = str6;
    }

    public final String a() {
        if (this.f38280c.length() == 0) {
            return "";
        }
        int length = this.f38278a.length() + 3;
        String str = this.f38285h;
        String substring = str.substring(Q7.j.p0(str, ':', length, 4) + 1, Q7.j.p0(str, '@', 0, 6));
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public final String b() {
        int length = this.f38278a.length() + 3;
        String str = this.f38285h;
        int p02 = Q7.j.p0(str, '/', length, 4);
        String substring = str.substring(p02, j8.c.b(p02, str.length(), str, "?#"));
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f38278a.length() + 3;
        String str = this.f38285h;
        int p02 = Q7.j.p0(str, '/', length, 4);
        int b9 = j8.c.b(p02, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (p02 < b9) {
            int i = p02 + 1;
            int c9 = j8.c.c(str, i, b9, '/');
            String substring = str.substring(i, c9);
            kotlin.jvm.internal.h.d(substring, "substring(...)");
            arrayList.add(substring);
            p02 = c9;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f38283f == null) {
            return null;
        }
        String str = this.f38285h;
        int p02 = Q7.j.p0(str, '?', 0, 6) + 1;
        String substring = str.substring(p02, j8.c.c(str, p02, str.length(), '#'));
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public final String e() {
        if (this.f38279b.length() == 0) {
            return "";
        }
        int length = this.f38278a.length() + 3;
        String str = this.f38285h;
        String substring = str.substring(length, j8.c.b(length, str.length(), str, ":@"));
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n) && kotlin.jvm.internal.h.a(((n) obj).f38285h, this.f38285h);
    }

    public final String f() {
        m mVar;
        try {
            mVar = new m();
            mVar.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            mVar = null;
        }
        kotlin.jvm.internal.h.b(mVar);
        mVar.f38271b = x8.a.a(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
        mVar.f38272c = x8.a.a(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
        return mVar.a().f38285h;
    }

    public final URI g() {
        String substring;
        String str;
        m mVar = new m();
        String scheme = this.f38278a;
        mVar.f38270a = scheme;
        mVar.f38271b = e();
        mVar.f38272c = a();
        mVar.f38273d = this.f38281d;
        kotlin.jvm.internal.h.e(scheme, "scheme");
        int i = scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1;
        int i4 = this.f38282e;
        mVar.f38274e = i4 != i ? i4 : -1;
        ArrayList arrayList = mVar.f38275f;
        arrayList.clear();
        arrayList.addAll(c());
        String d9 = d();
        mVar.f38276g = d9 != null ? m.d(x8.a.a(0, 0, 83, d9, " \"'<>#")) : null;
        if (this.f38284g == null) {
            substring = null;
        } else {
            String str2 = this.f38285h;
            substring = str2.substring(Q7.j.p0(str2, '#', 0, 6) + 1);
            kotlin.jvm.internal.h.d(substring, "substring(...)");
        }
        mVar.f38277h = substring;
        String str3 = mVar.f38273d;
        if (str3 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            kotlin.jvm.internal.h.d(compile, "compile(...)");
            str = compile.matcher(str3).replaceAll("");
            kotlin.jvm.internal.h.d(str, "replaceAll(...)");
        } else {
            str = null;
        }
        mVar.f38273d = str;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.set(i6, x8.a.a(0, 0, 99, (String) arrayList.get(i6), "[]"));
        }
        ArrayList arrayList2 = mVar.f38276g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                String str4 = (String) arrayList2.get(i9);
                arrayList2.set(i9, str4 != null ? x8.a.a(0, 0, 67, str4, "\\^`{|}") : null);
            }
        }
        String str5 = mVar.f38277h;
        mVar.f38277h = str5 != null ? x8.a.a(0, 0, 35, str5, " \"#<>\\^`{|}") : null;
        String input = mVar.toString();
        try {
            return new URI(input);
        } catch (URISyntaxException e9) {
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
                throw new RuntimeException(e9);
            }
        }
    }

    public final int hashCode() {
        return this.f38285h.hashCode();
    }

    public final String toString() {
        return this.f38285h;
    }
}
