package i8;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f38159a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38160b;

    /* renamed from: c, reason: collision with root package name */
    public final String f38161c;

    /* renamed from: d, reason: collision with root package name */
    public final String f38162d;

    /* renamed from: e, reason: collision with root package name */
    public final int f38163e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f38164f;

    /* renamed from: g, reason: collision with root package name */
    public final String f38165g;

    /* renamed from: h, reason: collision with root package name */
    public final String f38166h;

    public n(String str, String str2, String str3, String str4, int i, ArrayList arrayList, String str5, String str6) {
        this.f38159a = str;
        this.f38160b = str2;
        this.f38161c = str3;
        this.f38162d = str4;
        this.f38163e = i;
        this.f38164f = arrayList;
        this.f38165g = str5;
        this.f38166h = str6;
    }

    public final String a() {
        if (this.f38161c.length() == 0) {
            return "";
        }
        int length = this.f38159a.length() + 3;
        String str = this.f38166h;
        String substring = str.substring(Q7.j.Z(str, ':', length, 4) + 1, Q7.j.Z(str, '@', 0, 6));
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public final String b() {
        int length = this.f38159a.length() + 3;
        String str = this.f38166h;
        int Z8 = Q7.j.Z(str, '/', length, 4);
        String substring = str.substring(Z8, j8.c.b(Z8, str.length(), str, "?#"));
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f38159a.length() + 3;
        String str = this.f38166h;
        int Z8 = Q7.j.Z(str, '/', length, 4);
        int b9 = j8.c.b(Z8, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (Z8 < b9) {
            int i = Z8 + 1;
            int c9 = j8.c.c(str, i, b9, '/');
            String substring = str.substring(i, c9);
            kotlin.jvm.internal.h.d(substring, "substring(...)");
            arrayList.add(substring);
            Z8 = c9;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f38164f == null) {
            return null;
        }
        String str = this.f38166h;
        int Z8 = Q7.j.Z(str, '?', 0, 6) + 1;
        String substring = str.substring(Z8, j8.c.c(str, Z8, str.length(), '#'));
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public final String e() {
        if (this.f38160b.length() == 0) {
            return "";
        }
        int length = this.f38159a.length() + 3;
        String str = this.f38166h;
        String substring = str.substring(length, j8.c.b(length, str.length(), str, ":@"));
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n) && kotlin.jvm.internal.h.a(((n) obj).f38166h, this.f38166h);
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
        mVar.f38152b = x8.a.a(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
        mVar.f38153c = x8.a.a(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
        return mVar.a().f38166h;
    }

    public final URI g() {
        String substring;
        String str;
        m mVar = new m();
        String scheme = this.f38159a;
        mVar.f38151a = scheme;
        mVar.f38152b = e();
        mVar.f38153c = a();
        mVar.f38154d = this.f38162d;
        kotlin.jvm.internal.h.e(scheme, "scheme");
        int i = scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1;
        int i6 = this.f38163e;
        mVar.f38155e = i6 != i ? i6 : -1;
        ArrayList arrayList = mVar.f38156f;
        arrayList.clear();
        arrayList.addAll(c());
        String d2 = d();
        mVar.f38157g = d2 != null ? m.d(x8.a.a(0, 0, 83, d2, " \"'<>#")) : null;
        if (this.f38165g == null) {
            substring = null;
        } else {
            String str2 = this.f38166h;
            substring = str2.substring(Q7.j.Z(str2, '#', 0, 6) + 1);
            kotlin.jvm.internal.h.d(substring, "substring(...)");
        }
        mVar.f38158h = substring;
        String str3 = mVar.f38154d;
        if (str3 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            kotlin.jvm.internal.h.d(compile, "compile(...)");
            str = compile.matcher(str3).replaceAll("");
            kotlin.jvm.internal.h.d(str, "replaceAll(...)");
        } else {
            str = null;
        }
        mVar.f38154d = str;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.set(i9, x8.a.a(0, 0, 99, (String) arrayList.get(i9), "[]"));
        }
        ArrayList arrayList2 = mVar.f38157g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                String str4 = (String) arrayList2.get(i10);
                arrayList2.set(i10, str4 != null ? x8.a.a(0, 0, 67, str4, "\\^`{|}") : null);
            }
        }
        String str5 = mVar.f38158h;
        mVar.f38158h = str5 != null ? x8.a.a(0, 0, 35, str5, " \"#<>\\^`{|}") : null;
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
        return this.f38166h.hashCode();
    }

    public final String toString() {
        return this.f38166h;
    }
}
