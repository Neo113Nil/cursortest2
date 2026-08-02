package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes5.dex */
public final class s7e {
    public String a;
    public String d;
    public final ArrayList f;
    public ArrayList g;
    public String h;
    public String b = "";
    public String c = "";
    public int e = -1;

    public s7e() {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.add("");
    }

    public final void a(String str, String str2) {
        str.getClass();
        if (this.g == null) {
            this.g = new ArrayList();
        }
        ArrayList arrayList = this.g;
        arrayList.getClass();
        arrayList.add(ofc.g(str, true, " \"'<>#&=", 0, 0, 211));
        ArrayList arrayList2 = this.g;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? ofc.g(str2, true, " \"'<>#&=", 0, 0, 211) : null);
    }

    public final void b(String str) {
        str.getClass();
        j(0, str.length(), str, false, false);
    }

    public final void c(String str, boolean z) {
        boolean z2;
        s7e s7eVar;
        String str2;
        boolean z3;
        int i = 0;
        while (true) {
            int f = cvt.f(i, str.length(), str, "/\\");
            if (f < str.length()) {
                z2 = true;
                str2 = str;
                z3 = z;
                s7eVar = this;
            } else {
                z2 = false;
                s7eVar = this;
                str2 = str;
                z3 = z;
            }
            s7eVar.j(i, f, str2, z2, z3);
            i = f + 1;
            if (i > str2.length()) {
                return;
            }
            str = str2;
            z = z3;
        }
    }

    public final void d(String str, String str2) {
        str.getClass();
        if (this.g == null) {
            this.g = new ArrayList();
        }
        ArrayList arrayList = this.g;
        arrayList.getClass();
        arrayList.add(ofc.g(str, false, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 0, 0, 219));
        ArrayList arrayList2 = this.g;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? ofc.g(str2, false, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 0, 0, 219) : null);
    }

    public final u7e e() {
        ArrayList arrayList;
        String str = this.a;
        if (str == null) {
            xq0.q("scheme == null");
            return null;
        }
        String x = ofc.x(this.b, 0, 0, 7);
        String x2 = ofc.x(this.c, 0, 0, 7);
        String str2 = this.d;
        if (str2 == null) {
            xq0.q("host == null");
            return null;
        }
        int f = f();
        ArrayList arrayList2 = this.f;
        ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(ofc.x((String) it.next(), 0, 0, 7));
        }
        ArrayList<String> arrayList4 = this.g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(v75.o(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? ofc.x(str3, 0, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.h;
        return new u7e(str, x, x2, str2, f, arrayList3, arrayList, str4 != null ? ofc.x(str4, 0, 0, 7) : null, toString());
    }

    public final int f() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        String str = this.a;
        str.getClass();
        if (Intrinsics.d(str, "http")) {
            return 80;
        }
        return Intrinsics.d(str, "https") ? 443 : -1;
    }

    public final void g(String str) {
        str.getClass();
        String T = xv.T(ofc.x(str, 0, 0, 7));
        if (T != null) {
            this.d = T;
        } else {
            xq0.x("unexpected host: ".concat(str));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0212, code lost:
    
        if (r2 < 65536) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        if (r12 == ':') goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(u7e u7eVar, String str) {
        int i;
        char c;
        int i2;
        char c2;
        int f;
        String str2;
        char c3;
        int i3;
        int i4;
        char c4;
        int i5;
        String str3;
        char c5;
        char charAt;
        String str4 = str;
        str4.getClass();
        byte[] bArr = cvt.a;
        int n = cvt.n(0, str4.length(), str4);
        int o = cvt.o(n, str4.length(), str4);
        int i6 = -1;
        if (o - n >= 2) {
            char charAt2 = str4.charAt(n);
            if ((Intrinsics.e(charAt2, 97) >= 0 && Intrinsics.e(charAt2, 122) <= 0) || (Intrinsics.e(charAt2, 65) >= 0 && Intrinsics.e(charAt2, 90) <= 0)) {
                i = n + 1;
                while (true) {
                    if (i >= o) {
                        break;
                    }
                    char charAt3 = str4.charAt(i);
                    if (('a' <= charAt3 && charAt3 < '{') || (('A' <= charAt3 && charAt3 < '[') || (('0' <= charAt3 && charAt3 < ':') || charAt3 == '+' || charAt3 == '-' || charAt3 == '.'))) {
                        i++;
                    }
                }
            }
        }
        i = -1;
        int i7 = 1;
        if (i != -1) {
            if (c.u(n, str4, "https:", true)) {
                this.a = "https";
                n += 6;
            } else {
                if (!c.u(n, str4, "http:", true)) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str4.substring(0, i) + '\'');
                }
                this.a = "http";
                n += 5;
            }
        } else {
            if (u7eVar == null) {
                String str5 = str4;
                if (str5.length() > 6) {
                    str5 = mlr.K(6, str5).concat("...");
                }
                xq0.x("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str5));
                return;
            }
            this.a = u7eVar.a;
        }
        int i8 = n;
        int i9 = 0;
        while (true) {
            c = '/';
            i2 = i7;
            c2 = '\\';
            if (i8 >= o || !((charAt = str4.charAt(i8)) == '\\' || charAt == '/')) {
                break;
            }
            i9++;
            i8++;
            i7 = i2;
        }
        char c6 = '?';
        char c7 = '#';
        if (i9 >= 2 || u7eVar == null || !Intrinsics.d(u7eVar.a, this.a)) {
            int i10 = n + i9;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                f = cvt.f(i10, o, str4, "@/\\?#");
                char charAt4 = f != o ? str4.charAt(f) : (char) 65535;
                if (charAt4 == 65535 || charAt4 == c7 || charAt4 == c || charAt4 == c2 || charAt4 == c6) {
                    break;
                }
                if (charAt4 == '@') {
                    if (i12 == 0) {
                        int g = cvt.g(str4, ':', i10, f);
                        c4 = c6;
                        String g2 = ofc.g(str, true, " \"':;<=>@[]^`{}|/\\?#", i10, g, 240);
                        if (i11 != 0) {
                            g2 = vz1.s(new StringBuilder(), this.b, "%40", g2);
                        }
                        this.b = g2;
                        if (g != f) {
                            int i13 = g + 1;
                            i5 = f;
                            this.c = ofc.g(str, true, " \"':;<=>@[]^`{}|/\\?#", i13, i5, 240);
                            i12 = i2;
                        } else {
                            i5 = f;
                        }
                        str3 = str;
                        i11 = i2;
                    } else {
                        c4 = c6;
                        i5 = f;
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.c);
                        sb.append("%40");
                        str3 = str;
                        sb.append(ofc.g(str3, true, " \"':;<=>@[]^`{}|/\\?#", i10, i5, 240));
                        this.c = sb.toString();
                    }
                    i10 = i5 + 1;
                    str4 = str3;
                    c6 = c4;
                    c7 = '#';
                    c2 = '\\';
                    c = '/';
                }
            }
            str2 = str4;
            int i14 = i10;
            c3 = c6;
            int i15 = i14;
            while (true) {
                if (i15 >= f) {
                    i3 = f;
                    break;
                }
                char charAt5 = str2.charAt(i15);
                if (charAt5 == '[') {
                    do {
                        i15++;
                        if (i15 < f) {
                        }
                    } while (str2.charAt(i15) != ']');
                } else if (charAt5 == ':') {
                    i3 = i15;
                    break;
                }
                i15++;
            }
            int i16 = i3 + 1;
            if (i16 < f) {
                this.d = xv.T(ofc.x(str2, i14, i3, 4));
                try {
                    i4 = Integer.parseInt(ofc.g(str2, false, "", i16, f, 248));
                    if (i2 <= i4) {
                    }
                } catch (NumberFormatException unused) {
                }
                i4 = -1;
                this.e = i4;
                if (i4 == -1) {
                    b6e.j(34, "Invalid URL port: \"", str2.substring(i16, f));
                    return;
                }
            } else {
                this.d = xv.T(ofc.x(str2, i14, i3, 4));
                String str6 = this.a;
                str6.getClass();
                if (str6.equals("http")) {
                    i6 = 80;
                } else if (str6.equals("https")) {
                    i6 = 443;
                }
                this.e = i6;
            }
            if (this.d == null) {
                b6e.j(34, "Invalid URL host: \"", str2.substring(i14, i3));
                return;
            }
            n = f;
        } else {
            this.b = u7eVar.e();
            this.c = u7eVar.a();
            this.d = u7eVar.d;
            this.e = u7eVar.e;
            ArrayList arrayList = this.f;
            arrayList.clear();
            arrayList.addAll(u7eVar.c());
            if (n == o || str4.charAt(n) == '#') {
                String d = u7eVar.d();
                this.g = d != null ? ofc.G(ofc.g(d, true, " \"'<>#", 0, 0, 211)) : null;
            }
            str2 = str4;
            c3 = '?';
        }
        int f2 = cvt.f(n, o, str2, "?#");
        m(n, f2, str2);
        if (f2 >= o || str2.charAt(f2) != c3) {
            c5 = '#';
        } else {
            c5 = '#';
            int g3 = cvt.g(str2, '#', f2, o);
            this.g = ofc.G(ofc.g(str2, true, " \"'<>#", f2 + 1, g3, 208));
            f2 = g3;
        }
        if (f2 >= o || str2.charAt(f2) != c5) {
            return;
        }
        this.h = ofc.g(str2, true, "", f2 + 1, o, 176);
    }

    public final void i(int i) {
        if (1 > i || i >= 65536) {
            xq0.o(k5r.i(i, "unexpected port: "));
        } else {
            this.e = i;
        }
    }

    public final void j(int i, int i2, String str, boolean z, boolean z2) {
        String g = ofc.g(str, z2, " \"<>^`{}|/\\?#", i, i2, 240);
        if (g.equals(".") || g.equalsIgnoreCase("%2e")) {
            return;
        }
        boolean equals = g.equals("..");
        ArrayList arrayList = this.f;
        if (equals || g.equalsIgnoreCase("%2e.") || g.equalsIgnoreCase(".%2e") || g.equalsIgnoreCase("%2e%2e")) {
            if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                arrayList.add("");
                return;
            } else {
                arrayList.set(arrayList.size() - 1, "");
                return;
            }
        }
        if (((CharSequence) vz1.m(arrayList, 1)).length() == 0) {
            arrayList.set(arrayList.size() - 1, g);
        } else {
            arrayList.add(g);
        }
        if (z) {
            arrayList.add("");
        }
    }

    public final void k(String str) {
        ArrayList arrayList = this.g;
        arrayList.getClass();
        int size = arrayList.size() - 2;
        int s = hag.s(size, 0, -2);
        if (s > size) {
            return;
        }
        while (true) {
            ArrayList arrayList2 = this.g;
            arrayList2.getClass();
            if (str.equals(arrayList2.get(size))) {
                ArrayList arrayList3 = this.g;
                arrayList3.getClass();
                arrayList3.remove(size + 1);
                ArrayList arrayList4 = this.g;
                arrayList4.getClass();
                arrayList4.remove(size);
                ArrayList arrayList5 = this.g;
                arrayList5.getClass();
                if (arrayList5.isEmpty()) {
                    this.g = null;
                    return;
                }
            }
            if (size == s) {
                return;
            } else {
                size -= 2;
            }
        }
    }

    public final void l(String str) {
        str.getClass();
        if (this.g == null) {
            return;
        }
        k(ofc.g(str, false, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 0, 0, 219));
    }

    public final void m(int i, int i2, String str) {
        if (i == i2) {
            return;
        }
        char charAt = str.charAt(i);
        ArrayList arrayList = this.f;
        if (charAt == '/' || charAt == '\\') {
            arrayList.clear();
            arrayList.add("");
            i++;
        } else {
            arrayList.set(arrayList.size() - 1, "");
        }
        int i3 = i;
        while (i3 < i2) {
            int f = cvt.f(i3, i2, str, "/\\");
            boolean z = f < i2;
            String str2 = str;
            j(i3, f, str2, z, true);
            i3 = z ? f + 1 : f;
            str = str2;
        }
    }

    public final void n(String str) {
        if (str.equalsIgnoreCase("http")) {
            this.a = "http";
        } else if (str.equalsIgnoreCase("https")) {
            this.a = "https";
        } else {
            xq0.x("unexpected scheme: ".concat(str));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        if (r1 != r3) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.b.length() > 0 || this.c.length() > 0) {
            sb.append(this.b);
            if (this.c.length() > 0) {
                sb.append(':');
                sb.append(this.c);
            }
            sb.append('@');
        }
        String str2 = this.d;
        if (str2 != null) {
            if (StringsKt.N(str2, ':')) {
                sb.append('[');
                sb.append(this.d);
                sb.append(']');
            } else {
                sb.append(this.d);
            }
        }
        int i = -1;
        if (this.e != -1 || this.a != null) {
            int f = f();
            String str3 = this.a;
            if (str3 != null) {
                if (str3.equals("http")) {
                    i = 80;
                } else if (str3.equals("https")) {
                    i = 443;
                }
            }
            sb.append(':');
            sb.append(f);
        }
        ArrayList arrayList = this.f;
        arrayList.getClass();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append((String) arrayList.get(i2));
        }
        if (this.g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.g;
            arrayList2.getClass();
            ofc.I(arrayList2, sb);
        }
        if (this.h != null) {
            sb.append('#');
            sb.append(this.h);
        }
        return sb.toString();
    }
}
