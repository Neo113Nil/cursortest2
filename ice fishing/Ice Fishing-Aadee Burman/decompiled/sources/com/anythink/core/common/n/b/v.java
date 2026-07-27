package com.anythink.core.common.n.b;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    static final String f15722a = " \"':;<=>@[]^`{}|/\\?#";

    /* renamed from: b, reason: collision with root package name */
    static final String f15723b = " \"':;<=>@[]^`{}|/\\?#";

    /* renamed from: c, reason: collision with root package name */
    static final String f15724c = " \"<>^`{}|/\\?#";

    /* renamed from: d, reason: collision with root package name */
    static final String f15725d = "[]";

    /* renamed from: e, reason: collision with root package name */
    static final String f15726e = " \"'<>#";

    /* renamed from: f, reason: collision with root package name */
    static final String f15727f = " \"'<>#&=";

    /* renamed from: g, reason: collision with root package name */
    static final String f15728g = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";

    /* renamed from: h, reason: collision with root package name */
    static final String f15729h = "\\^`{|}";
    static final String i = " \"':;<=>@[]^`{}|/\\?#&!$(),~";

    /* renamed from: j, reason: collision with root package name */
    static final String f15730j = "";

    /* renamed from: k, reason: collision with root package name */
    static final String f15731k = " \"#<>\\^`{|}";

    /* renamed from: o, reason: collision with root package name */
    private static final char[] f15732o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: l, reason: collision with root package name */
    final String f15733l;

    /* renamed from: m, reason: collision with root package name */
    final String f15734m;

    /* renamed from: n, reason: collision with root package name */
    final int f15735n;

    /* renamed from: p, reason: collision with root package name */
    private final String f15736p;

    /* renamed from: q, reason: collision with root package name */
    private final String f15737q;

    /* renamed from: r, reason: collision with root package name */
    private final List<String> f15738r;

    /* renamed from: s, reason: collision with root package name */
    private final List<String> f15739s;

    /* renamed from: t, reason: collision with root package name */
    private final String f15740t;

    /* renamed from: u, reason: collision with root package name */
    private final String f15741u;

    public static final class a {
        static final String i = "Invalid URL host";

        /* renamed from: a, reason: collision with root package name */
        String f15742a;

        /* renamed from: d, reason: collision with root package name */
        String f15745d;

        /* renamed from: f, reason: collision with root package name */
        final List<String> f15747f;

        /* renamed from: g, reason: collision with root package name */
        List<String> f15748g;

        /* renamed from: h, reason: collision with root package name */
        String f15749h;

        /* renamed from: b, reason: collision with root package name */
        String f15743b = "";

        /* renamed from: c, reason: collision with root package name */
        String f15744c = "";

        /* renamed from: e, reason: collision with root package name */
        int f15746e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f15747f = arrayList;
            arrayList.add("");
        }

        private a b(int i6, String str) {
            if (str == null) {
                throw new NullPointerException("encodedPathSegment == null");
            }
            String a9 = v.a(str, 0, str.length(), v.f15724c, true, false, false, true, null);
            this.f15747f.set(i6, a9);
            if (s(a9) || t(a9)) {
                throw new IllegalArgumentException("unexpected path segment: ".concat(str));
            }
            return this;
        }

        private a c(String str) {
            if (str.equalsIgnoreCase("http")) {
                this.f15742a = "http";
                return this;
            }
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            this.f15742a = "https";
            return this;
        }

        private a d(String str) {
            this.f15743b = v.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        private a e(String str) {
            if (str == null) {
                throw new NullPointerException("encodedUsername == null");
            }
            this.f15743b = v.a(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
            return this;
        }

        private a f(String str) {
            this.f15744c = v.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        private a g(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPassword == null");
            }
            this.f15744c = v.a(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
            return this;
        }

        private a h(String str) {
            if (str == null) {
                throw new NullPointerException("pathSegment == null");
            }
            a(str, 0, str.length(), false, false);
            return this;
        }

        private a i(String str) {
            if (str != null) {
                return a(str, false);
            }
            throw new NullPointerException("pathSegments == null");
        }

        private a j(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPathSegment == null");
            }
            a(str, 0, str.length(), false, true);
            return this;
        }

        private a k(String str) {
            if (str != null) {
                return a(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        private a l(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPath == null");
            }
            if (!str.startsWith("/")) {
                throw new IllegalArgumentException("unexpected encodedPath: ".concat(str));
            }
            a(str, 0, str.length());
            return this;
        }

        private a m(String str) {
            this.f15748g = str != null ? v.b(v.a(str, v.f15726e, false, false, true, true)) : null;
            return this;
        }

        private a n(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (this.f15748g == null) {
                return this;
            }
            p(v.a(str, v.f15728g, false, false, true, true));
            return this;
        }

        private a o(String str) {
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            }
            if (this.f15748g == null) {
                return this;
            }
            p(v.a(str, v.f15727f, true, false, true, true));
            return this;
        }

        private void p(String str) {
            for (int size = this.f15748g.size() - 2; size >= 0; size -= 2) {
                if (str.equals(this.f15748g.get(size))) {
                    this.f15748g.remove(size + 1);
                    this.f15748g.remove(size);
                    if (this.f15748g.isEmpty()) {
                        this.f15748g = null;
                        return;
                    }
                }
            }
        }

        private a q(String str) {
            this.f15749h = str != null ? v.a(str, "", false, false, false, false) : null;
            return this;
        }

        private a r(String str) {
            this.f15749h = str != null ? v.a(str, "", true, false, false, false) : null;
            return this;
        }

        private static boolean s(String str) {
            return str.equals(com.anythink.core.common.d.j.f12378z) || str.equalsIgnoreCase("%2e");
        }

        private static boolean t(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        public final a a(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String e9 = e(str, 0, str.length());
            if (e9 == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.f15745d = e9;
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f15742a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f15743b.isEmpty() || !this.f15744c.isEmpty()) {
                sb.append(this.f15743b);
                if (!this.f15744c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f15744c);
                }
                sb.append('@');
            }
            String str2 = this.f15745d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f15745d);
                    sb.append(']');
                } else {
                    sb.append(this.f15745d);
                }
            }
            if (this.f15746e != -1 || this.f15742a != null) {
                int a9 = a();
                String str3 = this.f15742a;
                if (str3 == null || a9 != v.a(str3)) {
                    sb.append(':');
                    sb.append(a9);
                }
            }
            v.a(sb, this.f15747f);
            if (this.f15748g != null) {
                sb.append('?');
                v.b(sb, this.f15748g);
            }
            if (this.f15749h != null) {
                sb.append('#');
                sb.append(this.f15749h);
            }
            return sb.toString();
        }

        private void d() {
            if (!this.f15747f.remove(r0.size() - 1).isEmpty() || this.f15747f.isEmpty()) {
                this.f15747f.add("");
            } else {
                this.f15747f.set(r0.size() - 1, "");
            }
        }

        private static int f(String str, int i6, int i9) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(v.a(str, i6, i9, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        private static String e(String str, int i6, int i9) {
            return com.anythink.core.common.n.b.a.c.a(v.a(str, i6, i9, false));
        }

        private a a(int i6) {
            if (i6 > 0 && i6 <= 65535) {
                this.f15746e = i6;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(i6)));
        }

        private a b(int i6) {
            this.f15747f.remove(i6);
            if (this.f15747f.isEmpty()) {
                this.f15747f.add("");
            }
            return this;
        }

        private a c() {
            int size = this.f15747f.size();
            for (int i6 = 0; i6 < size; i6++) {
                this.f15747f.set(i6, v.a(this.f15747f.get(i6), v.f15725d, true, true, false, true));
            }
            List<String> list = this.f15748g;
            if (list != null) {
                int size2 = list.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    String str = this.f15748g.get(i9);
                    if (str != null) {
                        this.f15748g.set(i9, v.a(str, v.f15729h, true, true, true, true));
                    }
                }
            }
            String str2 = this.f15749h;
            if (str2 != null) {
                this.f15749h = v.a(str2, v.f15731k, true, true, false, false);
            }
            return this;
        }

        private static int d(String str, int i6, int i9) {
            while (i6 < i9) {
                char charAt = str.charAt(i6);
                if (charAt == ':') {
                    return i6;
                }
                if (charAt == '[') {
                    do {
                        i6++;
                        if (i6 < i9) {
                        }
                    } while (str.charAt(i6) != ']');
                }
                i6++;
            }
            return i9;
        }

        public final int a() {
            int i6 = this.f15746e;
            return i6 != -1 ? i6 : v.a(this.f15742a);
        }

        private a a(String str, boolean z3) {
            boolean z6;
            a aVar;
            String str2;
            boolean z9;
            int i6 = 0;
            while (true) {
                int a9 = com.anythink.core.common.n.b.a.c.a(str, i6, str.length(), "/\\");
                if (a9 < str.length()) {
                    z6 = true;
                    str2 = str;
                    z9 = z3;
                    aVar = this;
                } else {
                    z6 = false;
                    aVar = this;
                    str2 = str;
                    z9 = z3;
                }
                aVar.a(str2, i6, a9, z6, z9);
                i6 = a9 + 1;
                if (i6 > str2.length()) {
                    return aVar;
                }
                str = str2;
                z3 = z9;
            }
        }

        private a d(String str, String str2) {
            String str3;
            if (str != null) {
                if (this.f15748g != null) {
                    str3 = str;
                    p(v.a(str, v.f15727f, true, false, true, true));
                } else {
                    str3 = str;
                }
                if (this.f15748g == null) {
                    this.f15748g = new ArrayList();
                }
                this.f15748g.add(v.a(str3, v.f15727f, true, false, true, true));
                this.f15748g.add(str2 != null ? v.a(str2, v.f15727f, true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public final a b(String str) {
            this.f15748g = str != null ? v.b(v.a(str, v.f15726e, true, false, true, true)) : null;
            return this;
        }

        private a a(int i6, String str) {
            if (str != null) {
                String a9 = v.a(str, 0, str.length(), v.f15724c, false, false, false, true, null);
                if (!s(a9) && !t(a9)) {
                    this.f15747f.set(i6, a9);
                    return this;
                }
                throw new IllegalArgumentException("unexpected path segment: ".concat(str));
            }
            throw new NullPointerException("pathSegment == null");
        }

        private a b(String str, String str2) {
            if (str != null) {
                if (this.f15748g == null) {
                    this.f15748g = new ArrayList();
                }
                this.f15748g.add(v.a(str, v.f15727f, true, false, true, true));
                this.f15748g.add(str2 != null ? v.a(str2, v.f15727f, true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        private a a(String str, String str2) {
            if (str != null) {
                if (this.f15748g == null) {
                    this.f15748g = new ArrayList();
                }
                this.f15748g.add(v.a(str, v.f15728g, false, false, true, true));
                this.f15748g.add(str2 != null ? v.a(str2, v.f15728g, false, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("name == null");
        }

        private static int c(String str, int i6, int i9) {
            int i10 = 0;
            while (i6 < i9) {
                char charAt = str.charAt(i6);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i10++;
                i6++;
            }
            return i10;
        }

        private a c(String str, String str2) {
            String str3;
            if (str != null) {
                if (this.f15748g != null) {
                    str3 = str;
                    p(v.a(str, v.f15728g, false, false, true, true));
                } else {
                    str3 = str;
                }
                if (this.f15748g == null) {
                    this.f15748g = new ArrayList();
                }
                this.f15748g.add(v.a(str3, v.f15728g, false, false, true, true));
                this.f15748g.add(str2 != null ? v.a(str2, v.f15728g, false, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("name == null");
        }

        public final v b() {
            if (this.f15742a != null) {
                if (this.f15745d != null) {
                    return new v(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        private static int b(String str, int i6, int i9) {
            if (i9 - i6 < 2) {
                return -1;
            }
            char charAt = str.charAt(i6);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i6++;
                    if (i6 >= i9) {
                        break;
                    }
                    char charAt2 = str.charAt(i6);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i6;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        public final a a(v vVar, String str) {
            int i6;
            int a9;
            String str2;
            int i9;
            String str3;
            char charAt;
            String str4 = str;
            int a10 = com.anythink.core.common.n.b.a.c.a(str4, 0, str4.length());
            int b9 = com.anythink.core.common.n.b.a.c.b(str4, a10, str4.length());
            char c9 = ':';
            if (b9 - a10 >= 2 && (((charAt = str4.charAt(a10)) >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z'))) {
                int i10 = a10 + 1;
                while (true) {
                    if (i10 >= b9) {
                        break;
                    }
                    char charAt2 = str4.charAt(i10);
                    if ((charAt2 >= 'a' && charAt2 <= 'z') || ((charAt2 >= 'A' && charAt2 <= 'Z') || ((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        i10++;
                    } else if (charAt2 == ':') {
                        i6 = i10;
                    }
                }
            }
            i6 = -1;
            if (i6 != -1) {
                if (str4.regionMatches(true, a10, "https:", 0, 6)) {
                    this.f15742a = "https";
                    a10 += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (str4.regionMatches(true, a10, "http:", 0, 5)) {
                        this.f15742a = "http";
                        a10 += 5;
                    } else {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str4.substring(0, i6) + "'");
                    }
                }
            } else if (vVar != null) {
                this.f15742a = vVar.f15733l;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int c10 = c(str4, a10, b9);
            if (c10 < 2 && vVar != null && vVar.f15733l.equals(this.f15742a)) {
                this.f15743b = vVar.d();
                this.f15744c = vVar.e();
                this.f15745d = vVar.f15734m;
                this.f15746e = vVar.f15735n;
                this.f15747f.clear();
                this.f15747f.addAll(vVar.i());
                if (a10 == b9 || str4.charAt(a10) == '#') {
                    b(vVar.j());
                }
                str2 = str4;
            } else {
                int i11 = a10 + c10;
                boolean z3 = false;
                boolean z6 = false;
                while (true) {
                    a9 = com.anythink.core.common.n.b.a.c.a(str4, i11, b9, "@/\\?#");
                    char charAt3 = a9 != b9 ? str4.charAt(a9) : (char) 65535;
                    if (charAt3 == 65535 || charAt3 == '#' || charAt3 == '/' || charAt3 == '\\' || charAt3 == '?') {
                        break;
                    }
                    if (charAt3 == '@') {
                        if (!z3) {
                            int a11 = com.anythink.core.common.n.b.a.c.a(str4, i11, a9, c9);
                            String a12 = v.a(str, i11, a11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z6) {
                                a12 = D.y.s(new StringBuilder(), this.f15743b, "%40", a12);
                            }
                            this.f15743b = a12;
                            if (a11 != a9) {
                                int i12 = a11 + 1;
                                i9 = a9;
                                this.f15744c = v.a(str, i12, i9, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z3 = true;
                            } else {
                                i9 = a9;
                            }
                            str3 = str;
                            z6 = true;
                        } else {
                            i9 = a9;
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.f15744c);
                            sb.append("%40");
                            str3 = str;
                            sb.append(v.a(str3, i11, i9, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.f15744c = sb.toString();
                        }
                        i11 = i9 + 1;
                        str4 = str3;
                        c9 = ':';
                    }
                }
                str2 = str4;
                int i13 = i11;
                int d2 = d(str2, i13, a9);
                int i14 = d2 + 1;
                if (i14 < a9) {
                    this.f15745d = e(str2, i13, d2);
                    int f3 = f(str2, i14, a9);
                    this.f15746e = f3;
                    if (f3 == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str2.substring(i14, a9) + '\"');
                    }
                } else {
                    this.f15745d = e(str2, i13, d2);
                    this.f15746e = v.a(this.f15742a);
                }
                if (this.f15745d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str2.substring(i13, d2) + '\"');
                }
                a10 = a9;
            }
            int a13 = com.anythink.core.common.n.b.a.c.a(str2, a10, b9, "?#");
            a(str2, a10, a13);
            if (a13 < b9 && str2.charAt(a13) == '?') {
                int a14 = com.anythink.core.common.n.b.a.c.a(str2, a13, b9, '#');
                this.f15748g = v.b(v.a(str2, a13 + 1, a14, v.f15726e, true, false, true, true, null));
                a13 = a14;
            }
            if (a13 < b9 && str2.charAt(a13) == '#') {
                this.f15749h = v.a(str2, a13 + 1, b9, "", true, false, false, false, null);
            }
            return this;
        }

        private void a(String str, int i6, int i9) {
            if (i6 == i9) {
                return;
            }
            char charAt = str.charAt(i6);
            if (charAt != '/' && charAt != '\\') {
                List<String> list = this.f15747f;
                list.set(list.size() - 1, "");
            } else {
                this.f15747f.clear();
                this.f15747f.add("");
                i6++;
            }
            int i10 = i6;
            while (i10 < i9) {
                int a9 = com.anythink.core.common.n.b.a.c.a(str, i10, i9, "/\\");
                boolean z3 = a9 < i9;
                String str2 = str;
                a(str2, i10, a9, z3, true);
                if (z3) {
                    a9++;
                }
                i10 = a9;
                str = str2;
            }
        }

        private void a(String str, int i6, int i9, boolean z3, boolean z6) {
            String a9 = v.a(str, i6, i9, v.f15724c, z6, false, false, true, null);
            if (s(a9)) {
                return;
            }
            if (t(a9)) {
                d();
                return;
            }
            if (this.f15747f.get(r11.size() - 1).isEmpty()) {
                this.f15747f.set(r11.size() - 1, a9);
            } else {
                this.f15747f.add(a9);
            }
            if (z3) {
                this.f15747f.add("");
            }
        }
    }

    public v(a aVar) {
        this.f15733l = aVar.f15742a;
        this.f15736p = a(aVar.f15743b, false);
        this.f15737q = a(aVar.f15744c, false);
        this.f15734m = aVar.f15745d;
        this.f15735n = aVar.a();
        this.f15738r = a(aVar.f15747f, false);
        List<String> list = aVar.f15748g;
        this.f15739s = list != null ? a(list, true) : null;
        String str = aVar.f15749h;
        this.f15740t = str != null ? a(str, false) : null;
        this.f15741u = aVar.toString();
    }

    public static int a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    private URL m() {
        try {
            return new URL(this.f15741u);
        } catch (MalformedURLException e9) {
            throw new RuntimeException(e9);
        }
    }

    private String n() {
        return this.f15736p;
    }

    private String o() {
        return this.f15737q;
    }

    private int p() {
        return this.f15738r.size();
    }

    private List<String> q() {
        return this.f15738r;
    }

    private int r() {
        List<String> list = this.f15739s;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    private Set<String> s() {
        if (this.f15739s == null) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.f15739s.size();
        for (int i6 = 0; i6 < size; i6 += 2) {
            linkedHashSet.add(this.f15739s.get(i6));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    private String t() {
        if (this.f15740t == null) {
            return null;
        }
        return this.f15741u.substring(this.f15741u.indexOf(35) + 1);
    }

    private String u() {
        return this.f15740t;
    }

    private a v() {
        a aVar = new a();
        aVar.f15742a = this.f15733l;
        aVar.f15743b = d();
        aVar.f15744c = e();
        aVar.f15745d = this.f15734m;
        aVar.f15746e = this.f15735n != a(this.f15733l) ? this.f15735n : -1;
        aVar.f15747f.clear();
        aVar.f15747f.addAll(i());
        aVar.b(j());
        aVar.f15749h = this.f15740t == null ? null : this.f15741u.substring(this.f15741u.indexOf(35) + 1);
        return aVar;
    }

    private String w() {
        if (com.anythink.core.common.n.b.a.c.c(this.f15734m)) {
            return null;
        }
        return com.anythink.core.common.n.b.a.i.a.a().a(this.f15734m);
    }

    public final String b() {
        return this.f15733l;
    }

    public final boolean c() {
        return this.f15733l.equals("https");
    }

    public final String d() {
        if (this.f15736p.isEmpty()) {
            return "";
        }
        int length = this.f15733l.length() + 3;
        String str = this.f15741u;
        return this.f15741u.substring(length, com.anythink.core.common.n.b.a.c.a(str, length, str.length(), ":@"));
    }

    public final String e() {
        if (this.f15737q.isEmpty()) {
            return "";
        }
        return this.f15741u.substring(this.f15741u.indexOf(58, this.f15733l.length() + 3) + 1, this.f15741u.indexOf(64));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof v) && ((v) obj).f15741u.equals(this.f15741u);
    }

    public final String f() {
        return this.f15734m;
    }

    public final int g() {
        return this.f15735n;
    }

    public final String h() {
        int indexOf = this.f15741u.indexOf(47, this.f15733l.length() + 3);
        String str = this.f15741u;
        return this.f15741u.substring(indexOf, com.anythink.core.common.n.b.a.c.a(str, indexOf, str.length(), "?#"));
    }

    public final int hashCode() {
        return this.f15741u.hashCode();
    }

    public final List<String> i() {
        int indexOf = this.f15741u.indexOf(47, this.f15733l.length() + 3);
        String str = this.f15741u;
        int a9 = com.anythink.core.common.n.b.a.c.a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a9) {
            int i6 = indexOf + 1;
            int a10 = com.anythink.core.common.n.b.a.c.a(this.f15741u, i6, a9, '/');
            arrayList.add(this.f15741u.substring(i6, a10));
            indexOf = a10;
        }
        return arrayList;
    }

    public final String j() {
        if (this.f15739s == null) {
            return null;
        }
        int indexOf = this.f15741u.indexOf(63) + 1;
        String str = this.f15741u;
        return this.f15741u.substring(indexOf, com.anythink.core.common.n.b.a.c.a(str, indexOf, str.length(), '#'));
    }

    public final String k() {
        if (this.f15739s == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        b(sb, this.f15739s);
        return sb.toString();
    }

    public final String l() {
        a g4 = g("/...");
        g4.f15743b = a("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        g4.f15744c = a("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return g4.b().toString();
    }

    public final String toString() {
        return this.f15741u;
    }

    public static void b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i6 = 0; i6 < size; i6 += 2) {
            String str = list.get(i6);
            String str2 = list.get(i6 + 1);
            if (i6 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    private List<String> f(String str) {
        if (this.f15739s == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int size = this.f15739s.size();
        for (int i6 = 0; i6 < size; i6 += 2) {
            if (str.equals(this.f15739s.get(i6))) {
                arrayList.add(this.f15739s.get(i6 + 1));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private a g(String str) {
        try {
            return new a().a(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final v c(String str) {
        a g4 = g(str);
        if (g4 != null) {
            return g4.b();
        }
        return null;
    }

    public static void a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            sb.append('/');
            sb.append(list.get(i6));
        }
    }

    private static v h(String str) {
        try {
            return d(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static v d(String str) {
        return new a().a((v) null, str).b();
    }

    private String e(String str) {
        List<String> list = this.f15739s;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6 += 2) {
            if (str.equals(this.f15739s.get(i6))) {
                return this.f15739s.get(i6 + 1);
            }
        }
        return null;
    }

    private String a(int i6) {
        List<String> list = this.f15739s;
        if (list != null) {
            return list.get(i6 * 2);
        }
        throw new IndexOutOfBoundsException();
    }

    private static v a(URL url) {
        return h(url.toString());
    }

    public static List<String> b(String str) {
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        while (i6 <= str.length()) {
            int indexOf = str.indexOf(38, i6);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i6);
            if (indexOf2 != -1 && indexOf2 <= indexOf) {
                arrayList.add(str.substring(i6, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            } else {
                arrayList.add(str.substring(i6, indexOf));
                arrayList.add(null);
            }
            i6 = indexOf + 1;
        }
        return arrayList;
    }

    private static v a(URI uri) {
        return h(uri.toString());
    }

    public static String a(String str, boolean z3) {
        return a(str, 0, str.length(), z3);
    }

    private static List<String> a(List<String> list, boolean z3) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i6 = 0; i6 < size; i6++) {
            String str = list.get(i6);
            arrayList.add(str != null ? a(str, z3) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static String a(String str, int i6, int i9, boolean z3) {
        for (int i10 = i6; i10 < i9; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '%' || (charAt == '+' && z3)) {
                com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
                cVar.b(str, i6, i10);
                a(cVar, str, i10, i9, z3);
                return cVar.u();
            }
        }
        return str.substring(i6, i9);
    }

    private String b(int i6) {
        List<String> list = this.f15739s;
        if (list != null) {
            return list.get((i6 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    private static void a(com.anythink.core.common.n.c.c cVar, String str, int i6, int i9, boolean z3) {
        int i10;
        while (i6 < i9) {
            int codePointAt = str.codePointAt(i6);
            if (codePointAt == 37 && (i10 = i6 + 2) < i9) {
                int a9 = com.anythink.core.common.n.b.a.c.a(str.charAt(i6 + 1));
                int a10 = com.anythink.core.common.n.b.a.c.a(str.charAt(i10));
                if (a9 != -1 && a10 != -1) {
                    cVar.l((a9 << 4) + a10);
                    i6 = i10;
                }
                cVar.m(codePointAt);
            } else {
                if (codePointAt == 43 && z3) {
                    cVar.l(32);
                }
                cVar.m(codePointAt);
            }
            i6 += Character.charCount(codePointAt);
        }
    }

    private static boolean a(String str, int i6, int i9) {
        int i10 = i6 + 2;
        return i10 < i9 && str.charAt(i6) == '%' && com.anythink.core.common.n.b.a.c.a(str.charAt(i6 + 1)) != -1 && com.anythink.core.common.n.b.a.c.a(str.charAt(i10)) != -1;
    }

    public static String a(String str, int i6, int i9, String str2, boolean z3, boolean z6, boolean z9, boolean z10, Charset charset) {
        int i10 = i6;
        while (i10 < i9) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z10) && str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z3 && (!z6 || a(str, i10, i9)))) && (codePointAt != 43 || !z9)))) {
                i10 += Character.charCount(codePointAt);
            } else {
                com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
                cVar.b(str, i6, i10);
                com.anythink.core.common.n.c.c cVar2 = null;
                while (i10 < i9) {
                    int codePointAt2 = str.codePointAt(i10);
                    if (!z3 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z9) {
                            cVar.b(z3 ? "+" : "%2B");
                        } else if (codePointAt2 >= 32 && codePointAt2 != 127 && ((codePointAt2 < 128 || !z10) && str2.indexOf(codePointAt2) == -1 && (codePointAt2 != 37 || (z3 && (!z6 || a(str, i10, i9)))))) {
                            cVar.m(codePointAt2);
                        } else {
                            if (cVar2 == null) {
                                cVar2 = new com.anythink.core.common.n.c.c();
                            }
                            if (charset != null && !charset.equals(StandardCharsets.UTF_8)) {
                                cVar2.b(str, i10, Character.charCount(codePointAt2) + i10, charset);
                            } else {
                                cVar2.m(codePointAt2);
                            }
                            while (!cVar2.g()) {
                                byte k9 = cVar2.k();
                                cVar.l(37);
                                char[] cArr = f15732o;
                                cVar.l((int) cArr[((k9 & 255) >> 4) & 15]);
                                cVar.l((int) cArr[k9 & 15]);
                            }
                        }
                    }
                    i10 += Character.charCount(codePointAt2);
                }
                return cVar.u();
            }
        }
        return str.substring(i6, i9);
    }

    private static void a(com.anythink.core.common.n.c.c cVar, String str, int i6, int i9, String str2, boolean z3, boolean z6, boolean z9, boolean z10, Charset charset) {
        com.anythink.core.common.n.c.c cVar2 = null;
        while (i6 < i9) {
            int codePointAt = str.codePointAt(i6);
            if (!z3 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z9) {
                    cVar.b(z3 ? "+" : "%2B");
                } else if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z10) && str2.indexOf(codePointAt) == -1 && (codePointAt != 37 || (z3 && (!z6 || a(str, i6, i9)))))) {
                    cVar.m(codePointAt);
                } else {
                    if (cVar2 == null) {
                        cVar2 = new com.anythink.core.common.n.c.c();
                    }
                    if (charset != null && !charset.equals(StandardCharsets.UTF_8)) {
                        cVar2.b(str, i6, Character.charCount(codePointAt) + i6, charset);
                    } else {
                        cVar2.m(codePointAt);
                    }
                    while (!cVar2.g()) {
                        byte k9 = cVar2.k();
                        cVar.l(37);
                        char[] cArr = f15732o;
                        cVar.l((int) cArr[((k9 & 255) >> 4) & 15]);
                        cVar.l((int) cArr[k9 & 15]);
                    }
                }
            }
            i6 += Character.charCount(codePointAt);
        }
    }

    public static String a(String str, String str2, boolean z3, Charset charset) {
        return a(str, 0, str.length(), str2, z3, false, true, true, charset);
    }

    public static String a(String str, String str2, boolean z3, boolean z6, boolean z9, boolean z10) {
        return a(str, 0, str.length(), str2, z3, z6, z9, z10, null);
    }

    public final URI a() {
        a aVar = new a();
        aVar.f15742a = this.f15733l;
        aVar.f15743b = d();
        aVar.f15744c = e();
        aVar.f15745d = this.f15734m;
        aVar.f15746e = this.f15735n != a(this.f15733l) ? this.f15735n : -1;
        aVar.f15747f.clear();
        aVar.f15747f.addAll(i());
        aVar.b(j());
        aVar.f15749h = this.f15740t == null ? null : this.f15741u.substring(this.f15741u.indexOf(35) + 1);
        int size = aVar.f15747f.size();
        for (int i6 = 0; i6 < size; i6++) {
            aVar.f15747f.set(i6, a(aVar.f15747f.get(i6), f15725d, true, true, false, true));
        }
        List<String> list = aVar.f15748g;
        if (list != null) {
            int size2 = list.size();
            for (int i9 = 0; i9 < size2; i9++) {
                String str = aVar.f15748g.get(i9);
                if (str != null) {
                    aVar.f15748g.set(i9, a(str, f15729h, true, true, true, true));
                }
            }
        }
        String str2 = aVar.f15749h;
        if (str2 != null) {
            aVar.f15749h = a(str2, f15731k, true, true, false, false);
        }
        String aVar2 = aVar.toString();
        try {
            return new URI(aVar2);
        } catch (URISyntaxException e9) {
            try {
                return URI.create(aVar2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e9);
            }
        }
    }
}
