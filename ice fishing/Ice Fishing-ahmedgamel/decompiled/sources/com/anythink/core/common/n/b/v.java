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
    static final String f16509a = " \"':;<=>@[]^`{}|/\\?#";

    /* renamed from: b, reason: collision with root package name */
    static final String f16510b = " \"':;<=>@[]^`{}|/\\?#";

    /* renamed from: c, reason: collision with root package name */
    static final String f16511c = " \"<>^`{}|/\\?#";

    /* renamed from: d, reason: collision with root package name */
    static final String f16512d = "[]";

    /* renamed from: e, reason: collision with root package name */
    static final String f16513e = " \"'<>#";

    /* renamed from: f, reason: collision with root package name */
    static final String f16514f = " \"'<>#&=";

    /* renamed from: g, reason: collision with root package name */
    static final String f16515g = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";

    /* renamed from: h, reason: collision with root package name */
    static final String f16516h = "\\^`{|}";
    static final String i = " \"':;<=>@[]^`{}|/\\?#&!$(),~";

    /* renamed from: j, reason: collision with root package name */
    static final String f16517j = "";

    /* renamed from: k, reason: collision with root package name */
    static final String f16518k = " \"#<>\\^`{|}";

    /* renamed from: o, reason: collision with root package name */
    private static final char[] f16519o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: l, reason: collision with root package name */
    final String f16520l;

    /* renamed from: m, reason: collision with root package name */
    final String f16521m;

    /* renamed from: n, reason: collision with root package name */
    final int f16522n;

    /* renamed from: p, reason: collision with root package name */
    private final String f16523p;

    /* renamed from: q, reason: collision with root package name */
    private final String f16524q;

    /* renamed from: r, reason: collision with root package name */
    private final List<String> f16525r;

    /* renamed from: s, reason: collision with root package name */
    private final List<String> f16526s;

    /* renamed from: t, reason: collision with root package name */
    private final String f16527t;

    /* renamed from: u, reason: collision with root package name */
    private final String f16528u;

    public static final class a {
        static final String i = "Invalid URL host";

        /* renamed from: a, reason: collision with root package name */
        String f16529a;

        /* renamed from: d, reason: collision with root package name */
        String f16532d;

        /* renamed from: f, reason: collision with root package name */
        final List<String> f16534f;

        /* renamed from: g, reason: collision with root package name */
        List<String> f16535g;

        /* renamed from: h, reason: collision with root package name */
        String f16536h;

        /* renamed from: b, reason: collision with root package name */
        String f16530b = "";

        /* renamed from: c, reason: collision with root package name */
        String f16531c = "";

        /* renamed from: e, reason: collision with root package name */
        int f16533e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f16534f = arrayList;
            arrayList.add("");
        }

        private a b(int i4, String str) {
            if (str == null) {
                throw new NullPointerException("encodedPathSegment == null");
            }
            String a9 = v.a(str, 0, str.length(), v.f16511c, true, false, false, true, null);
            this.f16534f.set(i4, a9);
            if (s(a9) || t(a9)) {
                throw new IllegalArgumentException("unexpected path segment: ".concat(str));
            }
            return this;
        }

        private a c(String str) {
            if (str.equalsIgnoreCase("http")) {
                this.f16529a = "http";
                return this;
            }
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            this.f16529a = "https";
            return this;
        }

        private a d(String str) {
            this.f16530b = v.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        private a e(String str) {
            if (str == null) {
                throw new NullPointerException("encodedUsername == null");
            }
            this.f16530b = v.a(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
            return this;
        }

        private a f(String str) {
            this.f16531c = v.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        private a g(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPassword == null");
            }
            this.f16531c = v.a(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
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
            this.f16535g = str != null ? v.b(v.a(str, v.f16513e, false, false, true, true)) : null;
            return this;
        }

        private a n(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (this.f16535g == null) {
                return this;
            }
            p(v.a(str, v.f16515g, false, false, true, true));
            return this;
        }

        private a o(String str) {
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            }
            if (this.f16535g == null) {
                return this;
            }
            p(v.a(str, v.f16514f, true, false, true, true));
            return this;
        }

        private void p(String str) {
            for (int size = this.f16535g.size() - 2; size >= 0; size -= 2) {
                if (str.equals(this.f16535g.get(size))) {
                    this.f16535g.remove(size + 1);
                    this.f16535g.remove(size);
                    if (this.f16535g.isEmpty()) {
                        this.f16535g = null;
                        return;
                    }
                }
            }
        }

        private a q(String str) {
            this.f16536h = str != null ? v.a(str, "", false, false, false, false) : null;
            return this;
        }

        private a r(String str) {
            this.f16536h = str != null ? v.a(str, "", true, false, false, false) : null;
            return this;
        }

        private static boolean s(String str) {
            return str.equals(com.anythink.core.common.d.j.f13164z) || str.equalsIgnoreCase("%2e");
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
            this.f16532d = e9;
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f16529a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f16530b.isEmpty() || !this.f16531c.isEmpty()) {
                sb.append(this.f16530b);
                if (!this.f16531c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f16531c);
                }
                sb.append('@');
            }
            String str2 = this.f16532d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f16532d);
                    sb.append(']');
                } else {
                    sb.append(this.f16532d);
                }
            }
            if (this.f16533e != -1 || this.f16529a != null) {
                int a9 = a();
                String str3 = this.f16529a;
                if (str3 == null || a9 != v.a(str3)) {
                    sb.append(':');
                    sb.append(a9);
                }
            }
            v.a(sb, this.f16534f);
            if (this.f16535g != null) {
                sb.append('?');
                v.b(sb, this.f16535g);
            }
            if (this.f16536h != null) {
                sb.append('#');
                sb.append(this.f16536h);
            }
            return sb.toString();
        }

        private void d() {
            if (!this.f16534f.remove(r0.size() - 1).isEmpty() || this.f16534f.isEmpty()) {
                this.f16534f.add("");
            } else {
                this.f16534f.set(r0.size() - 1, "");
            }
        }

        private static int f(String str, int i4, int i6) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(v.a(str, i4, i6, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        private static String e(String str, int i4, int i6) {
            return com.anythink.core.common.n.b.a.c.a(v.a(str, i4, i6, false));
        }

        private a a(int i4) {
            if (i4 > 0 && i4 <= 65535) {
                this.f16533e = i4;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(i4)));
        }

        private a b(int i4) {
            this.f16534f.remove(i4);
            if (this.f16534f.isEmpty()) {
                this.f16534f.add("");
            }
            return this;
        }

        private a c() {
            int size = this.f16534f.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f16534f.set(i4, v.a(this.f16534f.get(i4), v.f16512d, true, true, false, true));
            }
            List<String> list = this.f16535g;
            if (list != null) {
                int size2 = list.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    String str = this.f16535g.get(i6);
                    if (str != null) {
                        this.f16535g.set(i6, v.a(str, v.f16516h, true, true, true, true));
                    }
                }
            }
            String str2 = this.f16536h;
            if (str2 != null) {
                this.f16536h = v.a(str2, v.f16518k, true, true, false, false);
            }
            return this;
        }

        private static int d(String str, int i4, int i6) {
            while (i4 < i6) {
                char charAt = str.charAt(i4);
                if (charAt == ':') {
                    return i4;
                }
                if (charAt == '[') {
                    do {
                        i4++;
                        if (i4 < i6) {
                        }
                    } while (str.charAt(i4) != ']');
                }
                i4++;
            }
            return i6;
        }

        public final int a() {
            int i4 = this.f16533e;
            return i4 != -1 ? i4 : v.a(this.f16529a);
        }

        private a a(String str, boolean z6) {
            boolean z9;
            a aVar;
            String str2;
            boolean z10;
            int i4 = 0;
            while (true) {
                int a9 = com.anythink.core.common.n.b.a.c.a(str, i4, str.length(), "/\\");
                if (a9 < str.length()) {
                    z9 = true;
                    str2 = str;
                    z10 = z6;
                    aVar = this;
                } else {
                    z9 = false;
                    aVar = this;
                    str2 = str;
                    z10 = z6;
                }
                aVar.a(str2, i4, a9, z9, z10);
                i4 = a9 + 1;
                if (i4 > str2.length()) {
                    return aVar;
                }
                str = str2;
                z6 = z10;
            }
        }

        private a d(String str, String str2) {
            String str3;
            if (str != null) {
                if (this.f16535g != null) {
                    str3 = str;
                    p(v.a(str, v.f16514f, true, false, true, true));
                } else {
                    str3 = str;
                }
                if (this.f16535g == null) {
                    this.f16535g = new ArrayList();
                }
                this.f16535g.add(v.a(str3, v.f16514f, true, false, true, true));
                this.f16535g.add(str2 != null ? v.a(str2, v.f16514f, true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public final a b(String str) {
            this.f16535g = str != null ? v.b(v.a(str, v.f16513e, true, false, true, true)) : null;
            return this;
        }

        private a a(int i4, String str) {
            if (str != null) {
                String a9 = v.a(str, 0, str.length(), v.f16511c, false, false, false, true, null);
                if (!s(a9) && !t(a9)) {
                    this.f16534f.set(i4, a9);
                    return this;
                }
                throw new IllegalArgumentException("unexpected path segment: ".concat(str));
            }
            throw new NullPointerException("pathSegment == null");
        }

        private a b(String str, String str2) {
            if (str != null) {
                if (this.f16535g == null) {
                    this.f16535g = new ArrayList();
                }
                this.f16535g.add(v.a(str, v.f16514f, true, false, true, true));
                this.f16535g.add(str2 != null ? v.a(str2, v.f16514f, true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        private a a(String str, String str2) {
            if (str != null) {
                if (this.f16535g == null) {
                    this.f16535g = new ArrayList();
                }
                this.f16535g.add(v.a(str, v.f16515g, false, false, true, true));
                this.f16535g.add(str2 != null ? v.a(str2, v.f16515g, false, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("name == null");
        }

        private static int c(String str, int i4, int i6) {
            int i9 = 0;
            while (i4 < i6) {
                char charAt = str.charAt(i4);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i9++;
                i4++;
            }
            return i9;
        }

        private a c(String str, String str2) {
            String str3;
            if (str != null) {
                if (this.f16535g != null) {
                    str3 = str;
                    p(v.a(str, v.f16515g, false, false, true, true));
                } else {
                    str3 = str;
                }
                if (this.f16535g == null) {
                    this.f16535g = new ArrayList();
                }
                this.f16535g.add(v.a(str3, v.f16515g, false, false, true, true));
                this.f16535g.add(str2 != null ? v.a(str2, v.f16515g, false, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("name == null");
        }

        public final v b() {
            if (this.f16529a != null) {
                if (this.f16532d != null) {
                    return new v(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        private static int b(String str, int i4, int i6) {
            if (i6 - i4 < 2) {
                return -1;
            }
            char charAt = str.charAt(i4);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i4++;
                    if (i4 >= i6) {
                        break;
                    }
                    char charAt2 = str.charAt(i4);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i4;
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
            int i4;
            int a9;
            String str2;
            int i6;
            String str3;
            char charAt;
            String str4 = str;
            int a10 = com.anythink.core.common.n.b.a.c.a(str4, 0, str4.length());
            int b9 = com.anythink.core.common.n.b.a.c.b(str4, a10, str4.length());
            char c9 = ':';
            if (b9 - a10 >= 2 && (((charAt = str4.charAt(a10)) >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z'))) {
                int i9 = a10 + 1;
                while (true) {
                    if (i9 >= b9) {
                        break;
                    }
                    char charAt2 = str4.charAt(i9);
                    if ((charAt2 >= 'a' && charAt2 <= 'z') || ((charAt2 >= 'A' && charAt2 <= 'Z') || ((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        i9++;
                    } else if (charAt2 == ':') {
                        i4 = i9;
                    }
                }
            }
            i4 = -1;
            if (i4 != -1) {
                if (str4.regionMatches(true, a10, "https:", 0, 6)) {
                    this.f16529a = "https";
                    a10 += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (str4.regionMatches(true, a10, "http:", 0, 5)) {
                        this.f16529a = "http";
                        a10 += 5;
                    } else {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str4.substring(0, i4) + "'");
                    }
                }
            } else if (vVar != null) {
                this.f16529a = vVar.f16520l;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int c10 = c(str4, a10, b9);
            if (c10 < 2 && vVar != null && vVar.f16520l.equals(this.f16529a)) {
                this.f16530b = vVar.d();
                this.f16531c = vVar.e();
                this.f16532d = vVar.f16521m;
                this.f16533e = vVar.f16522n;
                this.f16534f.clear();
                this.f16534f.addAll(vVar.i());
                if (a10 == b9 || str4.charAt(a10) == '#') {
                    b(vVar.j());
                }
                str2 = str4;
            } else {
                int i10 = a10 + c10;
                boolean z6 = false;
                boolean z9 = false;
                while (true) {
                    a9 = com.anythink.core.common.n.b.a.c.a(str4, i10, b9, "@/\\?#");
                    char charAt3 = a9 != b9 ? str4.charAt(a9) : (char) 65535;
                    if (charAt3 == 65535 || charAt3 == '#' || charAt3 == '/' || charAt3 == '\\' || charAt3 == '?') {
                        break;
                    }
                    if (charAt3 == '@') {
                        if (!z6) {
                            int a11 = com.anythink.core.common.n.b.a.c.a(str4, i10, a9, c9);
                            String a12 = v.a(str, i10, a11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z9) {
                                a12 = D.x.p(new StringBuilder(), this.f16530b, "%40", a12);
                            }
                            this.f16530b = a12;
                            if (a11 != a9) {
                                int i11 = a11 + 1;
                                i6 = a9;
                                this.f16531c = v.a(str, i11, i6, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z6 = true;
                            } else {
                                i6 = a9;
                            }
                            str3 = str;
                            z9 = true;
                        } else {
                            i6 = a9;
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.f16531c);
                            sb.append("%40");
                            str3 = str;
                            sb.append(v.a(str3, i10, i6, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.f16531c = sb.toString();
                        }
                        i10 = i6 + 1;
                        str4 = str3;
                        c9 = ':';
                    }
                }
                str2 = str4;
                int i12 = i10;
                int d9 = d(str2, i12, a9);
                int i13 = d9 + 1;
                if (i13 < a9) {
                    this.f16532d = e(str2, i12, d9);
                    int f2 = f(str2, i13, a9);
                    this.f16533e = f2;
                    if (f2 == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str2.substring(i13, a9) + '\"');
                    }
                } else {
                    this.f16532d = e(str2, i12, d9);
                    this.f16533e = v.a(this.f16529a);
                }
                if (this.f16532d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str2.substring(i12, d9) + '\"');
                }
                a10 = a9;
            }
            int a13 = com.anythink.core.common.n.b.a.c.a(str2, a10, b9, "?#");
            a(str2, a10, a13);
            if (a13 < b9 && str2.charAt(a13) == '?') {
                int a14 = com.anythink.core.common.n.b.a.c.a(str2, a13, b9, '#');
                this.f16535g = v.b(v.a(str2, a13 + 1, a14, v.f16513e, true, false, true, true, null));
                a13 = a14;
            }
            if (a13 < b9 && str2.charAt(a13) == '#') {
                this.f16536h = v.a(str2, a13 + 1, b9, "", true, false, false, false, null);
            }
            return this;
        }

        private void a(String str, int i4, int i6) {
            if (i4 == i6) {
                return;
            }
            char charAt = str.charAt(i4);
            if (charAt != '/' && charAt != '\\') {
                List<String> list = this.f16534f;
                list.set(list.size() - 1, "");
            } else {
                this.f16534f.clear();
                this.f16534f.add("");
                i4++;
            }
            int i9 = i4;
            while (i9 < i6) {
                int a9 = com.anythink.core.common.n.b.a.c.a(str, i9, i6, "/\\");
                boolean z6 = a9 < i6;
                String str2 = str;
                a(str2, i9, a9, z6, true);
                if (z6) {
                    a9++;
                }
                i9 = a9;
                str = str2;
            }
        }

        private void a(String str, int i4, int i6, boolean z6, boolean z9) {
            String a9 = v.a(str, i4, i6, v.f16511c, z9, false, false, true, null);
            if (s(a9)) {
                return;
            }
            if (t(a9)) {
                d();
                return;
            }
            if (this.f16534f.get(r11.size() - 1).isEmpty()) {
                this.f16534f.set(r11.size() - 1, a9);
            } else {
                this.f16534f.add(a9);
            }
            if (z6) {
                this.f16534f.add("");
            }
        }
    }

    public v(a aVar) {
        this.f16520l = aVar.f16529a;
        this.f16523p = a(aVar.f16530b, false);
        this.f16524q = a(aVar.f16531c, false);
        this.f16521m = aVar.f16532d;
        this.f16522n = aVar.a();
        this.f16525r = a(aVar.f16534f, false);
        List<String> list = aVar.f16535g;
        this.f16526s = list != null ? a(list, true) : null;
        String str = aVar.f16536h;
        this.f16527t = str != null ? a(str, false) : null;
        this.f16528u = aVar.toString();
    }

    public static int a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    private URL m() {
        try {
            return new URL(this.f16528u);
        } catch (MalformedURLException e9) {
            throw new RuntimeException(e9);
        }
    }

    private String n() {
        return this.f16523p;
    }

    private String o() {
        return this.f16524q;
    }

    private int p() {
        return this.f16525r.size();
    }

    private List<String> q() {
        return this.f16525r;
    }

    private int r() {
        List<String> list = this.f16526s;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    private Set<String> s() {
        if (this.f16526s == null) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.f16526s.size();
        for (int i4 = 0; i4 < size; i4 += 2) {
            linkedHashSet.add(this.f16526s.get(i4));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    private String t() {
        if (this.f16527t == null) {
            return null;
        }
        return this.f16528u.substring(this.f16528u.indexOf(35) + 1);
    }

    private String u() {
        return this.f16527t;
    }

    private a v() {
        a aVar = new a();
        aVar.f16529a = this.f16520l;
        aVar.f16530b = d();
        aVar.f16531c = e();
        aVar.f16532d = this.f16521m;
        aVar.f16533e = this.f16522n != a(this.f16520l) ? this.f16522n : -1;
        aVar.f16534f.clear();
        aVar.f16534f.addAll(i());
        aVar.b(j());
        aVar.f16536h = this.f16527t == null ? null : this.f16528u.substring(this.f16528u.indexOf(35) + 1);
        return aVar;
    }

    private String w() {
        if (com.anythink.core.common.n.b.a.c.c(this.f16521m)) {
            return null;
        }
        return com.anythink.core.common.n.b.a.i.a.a().a(this.f16521m);
    }

    public final String b() {
        return this.f16520l;
    }

    public final boolean c() {
        return this.f16520l.equals("https");
    }

    public final String d() {
        if (this.f16523p.isEmpty()) {
            return "";
        }
        int length = this.f16520l.length() + 3;
        String str = this.f16528u;
        return this.f16528u.substring(length, com.anythink.core.common.n.b.a.c.a(str, length, str.length(), ":@"));
    }

    public final String e() {
        if (this.f16524q.isEmpty()) {
            return "";
        }
        return this.f16528u.substring(this.f16528u.indexOf(58, this.f16520l.length() + 3) + 1, this.f16528u.indexOf(64));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof v) && ((v) obj).f16528u.equals(this.f16528u);
    }

    public final String f() {
        return this.f16521m;
    }

    public final int g() {
        return this.f16522n;
    }

    public final String h() {
        int indexOf = this.f16528u.indexOf(47, this.f16520l.length() + 3);
        String str = this.f16528u;
        return this.f16528u.substring(indexOf, com.anythink.core.common.n.b.a.c.a(str, indexOf, str.length(), "?#"));
    }

    public final int hashCode() {
        return this.f16528u.hashCode();
    }

    public final List<String> i() {
        int indexOf = this.f16528u.indexOf(47, this.f16520l.length() + 3);
        String str = this.f16528u;
        int a9 = com.anythink.core.common.n.b.a.c.a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a9) {
            int i4 = indexOf + 1;
            int a10 = com.anythink.core.common.n.b.a.c.a(this.f16528u, i4, a9, '/');
            arrayList.add(this.f16528u.substring(i4, a10));
            indexOf = a10;
        }
        return arrayList;
    }

    public final String j() {
        if (this.f16526s == null) {
            return null;
        }
        int indexOf = this.f16528u.indexOf(63) + 1;
        String str = this.f16528u;
        return this.f16528u.substring(indexOf, com.anythink.core.common.n.b.a.c.a(str, indexOf, str.length(), '#'));
    }

    public final String k() {
        if (this.f16526s == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        b(sb, this.f16526s);
        return sb.toString();
    }

    public final String l() {
        a g9 = g("/...");
        g9.f16530b = a("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        g9.f16531c = a("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return g9.b().toString();
    }

    public final String toString() {
        return this.f16528u;
    }

    public static void b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4 += 2) {
            String str = list.get(i4);
            String str2 = list.get(i4 + 1);
            if (i4 > 0) {
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
        if (this.f16526s == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int size = this.f16526s.size();
        for (int i4 = 0; i4 < size; i4 += 2) {
            if (str.equals(this.f16526s.get(i4))) {
                arrayList.add(this.f16526s.get(i4 + 1));
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
        a g9 = g(str);
        if (g9 != null) {
            return g9.b();
        }
        return null;
    }

    public static void a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            sb.append('/');
            sb.append(list.get(i4));
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
        List<String> list = this.f16526s;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4 += 2) {
            if (str.equals(this.f16526s.get(i4))) {
                return this.f16526s.get(i4 + 1);
            }
        }
        return null;
    }

    private String a(int i4) {
        List<String> list = this.f16526s;
        if (list != null) {
            return list.get(i4 * 2);
        }
        throw new IndexOutOfBoundsException();
    }

    private static v a(URL url) {
        return h(url.toString());
    }

    public static List<String> b(String str) {
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (i4 <= str.length()) {
            int indexOf = str.indexOf(38, i4);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i4);
            if (indexOf2 != -1 && indexOf2 <= indexOf) {
                arrayList.add(str.substring(i4, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            } else {
                arrayList.add(str.substring(i4, indexOf));
                arrayList.add(null);
            }
            i4 = indexOf + 1;
        }
        return arrayList;
    }

    private static v a(URI uri) {
        return h(uri.toString());
    }

    public static String a(String str, boolean z6) {
        return a(str, 0, str.length(), z6);
    }

    private static List<String> a(List<String> list, boolean z6) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            String str = list.get(i4);
            arrayList.add(str != null ? a(str, z6) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static String a(String str, int i4, int i6, boolean z6) {
        for (int i9 = i4; i9 < i6; i9++) {
            char charAt = str.charAt(i9);
            if (charAt == '%' || (charAt == '+' && z6)) {
                com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
                cVar.b(str, i4, i9);
                a(cVar, str, i9, i6, z6);
                return cVar.u();
            }
        }
        return str.substring(i4, i6);
    }

    private String b(int i4) {
        List<String> list = this.f16526s;
        if (list != null) {
            return list.get((i4 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    private static void a(com.anythink.core.common.n.c.c cVar, String str, int i4, int i6, boolean z6) {
        int i9;
        while (i4 < i6) {
            int codePointAt = str.codePointAt(i4);
            if (codePointAt == 37 && (i9 = i4 + 2) < i6) {
                int a9 = com.anythink.core.common.n.b.a.c.a(str.charAt(i4 + 1));
                int a10 = com.anythink.core.common.n.b.a.c.a(str.charAt(i9));
                if (a9 != -1 && a10 != -1) {
                    cVar.l((a9 << 4) + a10);
                    i4 = i9;
                }
                cVar.m(codePointAt);
            } else {
                if (codePointAt == 43 && z6) {
                    cVar.l(32);
                }
                cVar.m(codePointAt);
            }
            i4 += Character.charCount(codePointAt);
        }
    }

    private static boolean a(String str, int i4, int i6) {
        int i9 = i4 + 2;
        return i9 < i6 && str.charAt(i4) == '%' && com.anythink.core.common.n.b.a.c.a(str.charAt(i4 + 1)) != -1 && com.anythink.core.common.n.b.a.c.a(str.charAt(i9)) != -1;
    }

    public static String a(String str, int i4, int i6, String str2, boolean z6, boolean z9, boolean z10, boolean z11, Charset charset) {
        int i9 = i4;
        while (i9 < i6) {
            int codePointAt = str.codePointAt(i9);
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z11) && str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z6 && (!z9 || a(str, i9, i6)))) && (codePointAt != 43 || !z10)))) {
                i9 += Character.charCount(codePointAt);
            } else {
                com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
                cVar.b(str, i4, i9);
                com.anythink.core.common.n.c.c cVar2 = null;
                while (i9 < i6) {
                    int codePointAt2 = str.codePointAt(i9);
                    if (!z6 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z10) {
                            cVar.b(z6 ? "+" : "%2B");
                        } else if (codePointAt2 >= 32 && codePointAt2 != 127 && ((codePointAt2 < 128 || !z11) && str2.indexOf(codePointAt2) == -1 && (codePointAt2 != 37 || (z6 && (!z9 || a(str, i9, i6)))))) {
                            cVar.m(codePointAt2);
                        } else {
                            if (cVar2 == null) {
                                cVar2 = new com.anythink.core.common.n.c.c();
                            }
                            if (charset != null && !charset.equals(StandardCharsets.UTF_8)) {
                                cVar2.b(str, i9, Character.charCount(codePointAt2) + i9, charset);
                            } else {
                                cVar2.m(codePointAt2);
                            }
                            while (!cVar2.g()) {
                                byte k9 = cVar2.k();
                                cVar.l(37);
                                char[] cArr = f16519o;
                                cVar.l((int) cArr[((k9 & 255) >> 4) & 15]);
                                cVar.l((int) cArr[k9 & 15]);
                            }
                        }
                    }
                    i9 += Character.charCount(codePointAt2);
                }
                return cVar.u();
            }
        }
        return str.substring(i4, i6);
    }

    private static void a(com.anythink.core.common.n.c.c cVar, String str, int i4, int i6, String str2, boolean z6, boolean z9, boolean z10, boolean z11, Charset charset) {
        com.anythink.core.common.n.c.c cVar2 = null;
        while (i4 < i6) {
            int codePointAt = str.codePointAt(i4);
            if (!z6 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z10) {
                    cVar.b(z6 ? "+" : "%2B");
                } else if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z11) && str2.indexOf(codePointAt) == -1 && (codePointAt != 37 || (z6 && (!z9 || a(str, i4, i6)))))) {
                    cVar.m(codePointAt);
                } else {
                    if (cVar2 == null) {
                        cVar2 = new com.anythink.core.common.n.c.c();
                    }
                    if (charset != null && !charset.equals(StandardCharsets.UTF_8)) {
                        cVar2.b(str, i4, Character.charCount(codePointAt) + i4, charset);
                    } else {
                        cVar2.m(codePointAt);
                    }
                    while (!cVar2.g()) {
                        byte k9 = cVar2.k();
                        cVar.l(37);
                        char[] cArr = f16519o;
                        cVar.l((int) cArr[((k9 & 255) >> 4) & 15]);
                        cVar.l((int) cArr[k9 & 15]);
                    }
                }
            }
            i4 += Character.charCount(codePointAt);
        }
    }

    public static String a(String str, String str2, boolean z6, Charset charset) {
        return a(str, 0, str.length(), str2, z6, false, true, true, charset);
    }

    public static String a(String str, String str2, boolean z6, boolean z9, boolean z10, boolean z11) {
        return a(str, 0, str.length(), str2, z6, z9, z10, z11, null);
    }

    public final URI a() {
        a aVar = new a();
        aVar.f16529a = this.f16520l;
        aVar.f16530b = d();
        aVar.f16531c = e();
        aVar.f16532d = this.f16521m;
        aVar.f16533e = this.f16522n != a(this.f16520l) ? this.f16522n : -1;
        aVar.f16534f.clear();
        aVar.f16534f.addAll(i());
        aVar.b(j());
        aVar.f16536h = this.f16527t == null ? null : this.f16528u.substring(this.f16528u.indexOf(35) + 1);
        int size = aVar.f16534f.size();
        for (int i4 = 0; i4 < size; i4++) {
            aVar.f16534f.set(i4, a(aVar.f16534f.get(i4), f16512d, true, true, false, true));
        }
        List<String> list = aVar.f16535g;
        if (list != null) {
            int size2 = list.size();
            for (int i6 = 0; i6 < size2; i6++) {
                String str = aVar.f16535g.get(i6);
                if (str != null) {
                    aVar.f16535g.set(i6, a(str, f16516h, true, true, true, true));
                }
            }
        }
        String str2 = aVar.f16536h;
        if (str2 != null) {
            aVar.f16536h = a(str2, f16518k, true, true, false, false);
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
