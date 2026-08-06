package J1;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f903j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f904a;

    /* renamed from: b, reason: collision with root package name */
    public final String f905b;

    /* renamed from: c, reason: collision with root package name */
    public final String f906c;

    /* renamed from: d, reason: collision with root package name */
    public final String f907d;

    /* renamed from: e, reason: collision with root package name */
    public final int f908e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f909f;

    /* renamed from: g, reason: collision with root package name */
    public final String f910g;

    /* renamed from: h, reason: collision with root package name */
    public final String f911h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f912i;

    public o(String scheme, String str, String str2, String host, int i2, ArrayList arrayList, ArrayList arrayList2, String str3, String str4) {
        kotlin.jvm.internal.i.e(scheme, "scheme");
        kotlin.jvm.internal.i.e(host, "host");
        this.f904a = scheme;
        this.f905b = str;
        this.f906c = str2;
        this.f907d = host;
        this.f908e = i2;
        this.f909f = arrayList2;
        this.f910g = str3;
        this.f911h = str4;
        this.f912i = scheme.equals("https");
    }

    public final String a() {
        if (this.f906c.length() == 0) {
            return "";
        }
        int length = this.f904a.length() + 3;
        String str = this.f911h;
        String substring = str.substring(z1.g.X(str, ':', length, false, 4) + 1, z1.g.X(str, '@', 0, false, 6));
        kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int length = this.f904a.length() + 3;
        String str = this.f911h;
        int X2 = z1.g.X(str, '/', length, false, 4);
        String substring = str.substring(X2, K1.b.g(str, X2, str.length(), "?#"));
        kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f904a.length() + 3;
        String str = this.f911h;
        int X2 = z1.g.X(str, '/', length, false, 4);
        int g2 = K1.b.g(str, X2, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (X2 < g2) {
            int i2 = X2 + 1;
            int f2 = K1.b.f(str, '/', i2, g2);
            String substring = str.substring(i2, f2);
            kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            X2 = f2;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f909f == null) {
            return null;
        }
        String str = this.f911h;
        int X2 = z1.g.X(str, '?', 0, false, 6) + 1;
        String substring = str.substring(X2, K1.b.f(str, '#', X2, str.length()));
        kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f905b.length() == 0) {
            return "";
        }
        int length = this.f904a.length() + 3;
        String str = this.f911h;
        String substring = str.substring(length, K1.b.g(str, length, str.length(), ":@"));
        kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o) && kotlin.jvm.internal.i.a(((o) obj).f911h, this.f911h);
    }

    public final URI f() {
        String substring;
        String replaceAll;
        n nVar = new n();
        String scheme = this.f904a;
        nVar.f895a = scheme;
        nVar.f896b = e();
        nVar.f897c = a();
        nVar.f898d = this.f907d;
        kotlin.jvm.internal.i.e(scheme, "scheme");
        int i2 = scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1;
        int i3 = this.f908e;
        nVar.f899e = i3 != i2 ? i3 : -1;
        ArrayList arrayList = nVar.f900f;
        arrayList.clear();
        arrayList.addAll(c());
        String d2 = d();
        nVar.f901g = d2 == null ? null : C0051b.f(C0051b.b(d2, 0, 0, " \"'<>#", true, false, true, false, 211));
        int i4 = 0;
        if (this.f910g == null) {
            substring = null;
        } else {
            String str = this.f911h;
            substring = str.substring(z1.g.X(str, '#', 0, false, 6) + 1);
            kotlin.jvm.internal.i.d(substring, "this as java.lang.String).substring(startIndex)");
        }
        nVar.f902h = substring;
        String str2 = nVar.f898d;
        if (str2 == null) {
            replaceAll = null;
        } else {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            kotlin.jvm.internal.i.d(compile, "compile(...)");
            replaceAll = compile.matcher(str2).replaceAll("");
            kotlin.jvm.internal.i.d(replaceAll, "replaceAll(...)");
        }
        nVar.f898d = replaceAll;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.set(i5, C0051b.b((String) arrayList.get(i5), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = nVar.f901g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            while (i4 < size2) {
                int i6 = i4 + 1;
                String str3 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str3 == null ? null : C0051b.b(str3, 0, 0, "\\^`{|}", true, true, true, false, 195));
                i4 = i6;
            }
        }
        String str4 = nVar.f902h;
        nVar.f902h = str4 != null ? C0051b.b(str4, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
        String nVar2 = nVar.toString();
        try {
            return new URI(nVar2);
        } catch (URISyntaxException e2) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                kotlin.jvm.internal.i.d(compile2, "compile(...)");
                String replaceAll2 = compile2.matcher(nVar2).replaceAll("");
                kotlin.jvm.internal.i.d(replaceAll2, "replaceAll(...)");
                URI create = URI.create(replaceAll2);
                kotlin.jvm.internal.i.d(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final int hashCode() {
        return this.f911h.hashCode();
    }

    public final String toString() {
        return this.f911h;
    }
}
