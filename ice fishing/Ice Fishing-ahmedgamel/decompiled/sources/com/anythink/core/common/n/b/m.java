package com.anythink.core.common.n.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f16466a = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f16467b = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f16468c = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f16469d = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: e, reason: collision with root package name */
    private final String f16470e;

    /* renamed from: f, reason: collision with root package name */
    private final String f16471f;

    /* renamed from: g, reason: collision with root package name */
    private final long f16472g;

    /* renamed from: h, reason: collision with root package name */
    private final String f16473h;
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f16474j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f16475k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f16476l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f16477m;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        String f16478a;

        /* renamed from: b, reason: collision with root package name */
        String f16479b;

        /* renamed from: d, reason: collision with root package name */
        String f16481d;

        /* renamed from: f, reason: collision with root package name */
        boolean f16483f;

        /* renamed from: g, reason: collision with root package name */
        boolean f16484g;

        /* renamed from: h, reason: collision with root package name */
        boolean f16485h;
        boolean i;

        /* renamed from: c, reason: collision with root package name */
        long f16480c = com.anythink.core.common.n.b.a.c.d.f15837a;

        /* renamed from: e, reason: collision with root package name */
        String f16482e = "/";

        private a a(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (!str.trim().equals(str)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.f16478a = str;
            return this;
        }

        private a b(String str) {
            if (str == null) {
                throw new NullPointerException("value == null");
            }
            if (!str.trim().equals(str)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.f16479b = str;
            return this;
        }

        private a c(String str) {
            return a(str, false);
        }

        private a d(String str) {
            return a(str, true);
        }

        private a e(String str) {
            if (!str.startsWith("/")) {
                throw new IllegalArgumentException("path must start with '/'");
            }
            this.f16482e = str;
            return this;
        }

        private m c() {
            return new m(this);
        }

        private a a(long j6) {
            if (j6 <= 0) {
                j6 = Long.MIN_VALUE;
            }
            if (j6 > com.anythink.core.common.n.b.a.c.d.f15837a) {
                j6 = 253402300799999L;
            }
            this.f16480c = j6;
            this.f16485h = true;
            return this;
        }

        private a b() {
            this.f16484g = true;
            return this;
        }

        private a a(String str, boolean z6) {
            if (str != null) {
                String a9 = com.anythink.core.common.n.b.a.c.a(str);
                if (a9 != null) {
                    this.f16481d = a9;
                    this.i = z6;
                    return this;
                }
                throw new IllegalArgumentException("unexpected domain: ".concat(str));
            }
            throw new NullPointerException("domain == null");
        }

        private a a() {
            this.f16483f = true;
            return this;
        }
    }

    private m(String str, String str2, long j6, String str3, String str4, boolean z6, boolean z9, boolean z10, boolean z11) {
        this.f16470e = str;
        this.f16471f = str2;
        this.f16472g = j6;
        this.f16473h = str3;
        this.i = str4;
        this.f16474j = z6;
        this.f16475k = z9;
        this.f16477m = z10;
        this.f16476l = z11;
    }

    private boolean c() {
        return this.f16476l;
    }

    private long d() {
        return this.f16472g;
    }

    private boolean e() {
        return this.f16477m;
    }

    private String f() {
        return this.f16473h;
    }

    private String g() {
        return this.i;
    }

    private boolean h() {
        return this.f16475k;
    }

    private boolean i() {
        return this.f16474j;
    }

    private String j() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16470e);
        sb.append('=');
        sb.append(this.f16471f);
        if (this.f16476l) {
            if (this.f16472g == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(com.anythink.core.common.n.b.a.c.d.a(new Date(this.f16472g)));
            }
        }
        if (!this.f16477m) {
            sb.append("; domain=");
            sb.append(this.f16473h);
        }
        sb.append("; path=");
        sb.append(this.i);
        if (this.f16474j) {
            sb.append("; secure");
        }
        if (this.f16475k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public final String a() {
        return this.f16470e;
    }

    public final String b() {
        return this.f16471f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.f16470e.equals(this.f16470e) && mVar.f16471f.equals(this.f16471f) && mVar.f16473h.equals(this.f16473h) && mVar.i.equals(this.i) && mVar.f16472g == this.f16472g && mVar.f16474j == this.f16474j && mVar.f16475k == this.f16475k && mVar.f16476l == this.f16476l && mVar.f16477m == this.f16477m;
    }

    public final int hashCode() {
        int a9 = AbstractC5128c.a(AbstractC5128c.a(AbstractC5128c.a(AbstractC5128c.a(527, 31, this.f16470e), 31, this.f16471f), 31, this.f16473h), 31, this.i);
        long j6 = this.f16472g;
        return ((((((((a9 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (!this.f16474j ? 1 : 0)) * 31) + (!this.f16475k ? 1 : 0)) * 31) + (!this.f16476l ? 1 : 0)) * 31) + (!this.f16477m ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16470e);
        sb.append('=');
        sb.append(this.f16471f);
        if (this.f16476l) {
            if (this.f16472g == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(com.anythink.core.common.n.b.a.c.d.a(new Date(this.f16472g)));
            }
        }
        if (!this.f16477m) {
            sb.append("; domain=");
            sb.append(this.f16473h);
        }
        sb.append("; path=");
        sb.append(this.i);
        if (this.f16474j) {
            sb.append("; secure");
        }
        if (this.f16475k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    private boolean a(v vVar) {
        if (!(this.f16477m ? vVar.f16521m.equals(this.f16473h) : a(vVar.f16521m, this.f16473h))) {
            return false;
        }
        String str = this.i;
        String h3 = vVar.h();
        if (h3.equals(str) || (h3.startsWith(str) && (str.endsWith("/") || h3.charAt(str.length()) == '/'))) {
            return !this.f16474j || vVar.c();
        }
        return false;
    }

    private static m b(v vVar, String str) {
        return a(System.currentTimeMillis(), vVar, str);
    }

    private static String b(String str) {
        if (!str.endsWith(com.anythink.core.common.d.j.f13164z)) {
            if (str.startsWith(com.anythink.core.common.d.j.f13164z)) {
                str = str.substring(1);
            }
            String a9 = com.anythink.core.common.n.b.a.c.a(str);
            if (a9 != null) {
                return a9;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public m(a aVar) {
        String str = aVar.f16478a;
        if (str != null) {
            String str2 = aVar.f16479b;
            if (str2 != null) {
                String str3 = aVar.f16481d;
                if (str3 != null) {
                    this.f16470e = str;
                    this.f16471f = str2;
                    this.f16472g = aVar.f16480c;
                    this.f16473h = str3;
                    this.i = aVar.f16482e;
                    this.f16474j = aVar.f16483f;
                    this.f16475k = aVar.f16484g;
                    this.f16476l = aVar.f16485h;
                    this.f16477m = aVar.i;
                    return;
                }
                throw new NullPointerException("builder.domain == null");
            }
            throw new NullPointerException("builder.value == null");
        }
        throw new NullPointerException("builder.name == null");
    }

    private static boolean a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !com.anythink.core.common.n.b.a.c.c(str);
    }

    private static boolean a(v vVar, String str) {
        String h3 = vVar.h();
        if (h3.equals(str)) {
            return true;
        }
        if (h3.startsWith(str)) {
            return str.endsWith("/") || h3.charAt(str.length()) == '/';
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    private static m a(long j6, v vVar, String str) {
        v vVar2;
        long j9;
        String str2;
        int i;
        boolean z6;
        int i4;
        int i6;
        int i9;
        int i10;
        String str3 = str;
        int length = str3.length();
        ?? r32 = 0;
        char c9 = ';';
        int a9 = com.anythink.core.common.n.b.a.c.a(str3, 0, length, ';');
        char c10 = '=';
        int a10 = com.anythink.core.common.n.b.a.c.a(str3, 0, a9, '=');
        String str4 = null;
        if (a10 == a9) {
            return null;
        }
        String c11 = com.anythink.core.common.n.b.a.c.c(str3, 0, a10);
        if (!c11.isEmpty()) {
            int i11 = -1;
            if (com.anythink.core.common.n.b.a.c.b(c11) == -1) {
                boolean z9 = true;
                String c12 = com.anythink.core.common.n.b.a.c.c(str3, a10 + 1, a9);
                if (com.anythink.core.common.n.b.a.c.b(c12) != -1) {
                    return null;
                }
                int i12 = a9 + 1;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                String str5 = null;
                boolean z13 = true;
                long j10 = -1;
                long j11 = com.anythink.core.common.n.b.a.c.d.f15837a;
                while (i12 < length) {
                    int a11 = com.anythink.core.common.n.b.a.c.a(str3, i12, length, c9);
                    int a12 = com.anythink.core.common.n.b.a.c.a(str3, i12, a11, c10);
                    String c13 = com.anythink.core.common.n.b.a.c.c(str3, i12, a12);
                    if (a12 < a11) {
                        str2 = com.anythink.core.common.n.b.a.c.c(str3, a12 + 1, a11);
                    } else {
                        str2 = "";
                    }
                    if (c13.equalsIgnoreCase("expires")) {
                        try {
                            int length2 = str2.length();
                            int a13 = a(str2, r32, length2, r32);
                            try {
                                Matcher matcher = f16469d.matcher(str2);
                                int i13 = i11;
                                int i14 = i13;
                                int i15 = i14;
                                int i16 = i15;
                                int i17 = i16;
                                int i18 = i17;
                                while (a13 < length2) {
                                    int a14 = a(str2, a13 + 1, length2, z9);
                                    matcher.region(a13, a14);
                                    int i19 = i14;
                                    try {
                                        if (i19 != -1) {
                                            i4 = -1;
                                        } else if (matcher.usePattern(f16469d).matches()) {
                                            i19 = Integer.parseInt(matcher.group(1));
                                            i17 = Integer.parseInt(matcher.group(2));
                                            i18 = Integer.parseInt(matcher.group(3));
                                            i10 = i15;
                                            i = length;
                                            i14 = i19;
                                            a13 = a(str2, a14 + 1, length2, false);
                                            length = i;
                                            z9 = true;
                                            i15 = i10;
                                        } else {
                                            i4 = -1;
                                        }
                                        if (i6 != i4) {
                                            int i20 = length;
                                            i9 = i4;
                                            i10 = i15;
                                            i = i20;
                                        } else if (matcher.usePattern(f16468c).matches()) {
                                            i16 = Integer.parseInt(matcher.group(1));
                                            i10 = i15;
                                            i = length;
                                            i14 = i19;
                                            a13 = a(str2, a14 + 1, length2, false);
                                            length = i;
                                            z9 = true;
                                            i15 = i10;
                                        } else {
                                            i10 = i15;
                                            i = length;
                                            i9 = -1;
                                        }
                                        if (i10 == i9) {
                                            Pattern pattern = f16467b;
                                            if (matcher.usePattern(pattern).matches()) {
                                                i10 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                                                i16 = i6;
                                                i14 = i19;
                                                a13 = a(str2, a14 + 1, length2, false);
                                                length = i;
                                                z9 = true;
                                                i15 = i10;
                                            } else {
                                                i9 = -1;
                                            }
                                        }
                                        i14 = i19;
                                        a13 = a(str2, a14 + 1, length2, false);
                                        length = i;
                                        z9 = true;
                                        i15 = i10;
                                    } catch (IllegalArgumentException unused) {
                                        c9 = ';';
                                        z6 = true;
                                        i12 = a11 + 1;
                                        str3 = str;
                                        z9 = z6;
                                        length = i;
                                        r32 = 0;
                                        c10 = '=';
                                        i11 = -1;
                                    }
                                    i6 = i16;
                                    if (i13 == i9 && matcher.usePattern(f16466a).matches()) {
                                        i13 = Integer.parseInt(matcher.group(1));
                                    }
                                    i16 = i6;
                                }
                                int i21 = i14;
                                int i22 = i15;
                                int i23 = i16;
                                i = length;
                                if (i13 >= 70 && i13 <= 99) {
                                    i13 += 1900;
                                }
                                if (i13 >= 0 && i13 <= 69) {
                                    i13 += 2000;
                                }
                                if (i13 < 1601) {
                                    throw new IllegalArgumentException();
                                }
                                if (i22 == -1) {
                                    throw new IllegalArgumentException();
                                }
                                if (i23 <= 0 || i23 > 31) {
                                    throw new IllegalArgumentException();
                                }
                                if (i21 < 0 || i21 > 23) {
                                    throw new IllegalArgumentException();
                                }
                                int i24 = i17;
                                c9 = ';';
                                if (i24 < 0 || i24 > 59) {
                                    throw new IllegalArgumentException();
                                }
                                int i25 = i18;
                                if (i25 >= 0 && i25 <= 59) {
                                    try {
                                        GregorianCalendar gregorianCalendar = new GregorianCalendar(com.anythink.core.common.n.b.a.c.f15828f);
                                        gregorianCalendar.setLenient(false);
                                        gregorianCalendar.set(1, i13);
                                        gregorianCalendar.set(2, i22 - 1);
                                        gregorianCalendar.set(5, i23);
                                        gregorianCalendar.set(11, i21);
                                        gregorianCalendar.set(12, i24);
                                        gregorianCalendar.set(13, i25);
                                        gregorianCalendar.set(14, 0);
                                        j11 = gregorianCalendar.getTimeInMillis();
                                    } catch (NumberFormatException | IllegalArgumentException unused2) {
                                        z6 = true;
                                        i12 = a11 + 1;
                                        str3 = str;
                                        z9 = z6;
                                        length = i;
                                        r32 = 0;
                                        c10 = '=';
                                        i11 = -1;
                                    }
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } catch (IllegalArgumentException unused3) {
                                i = length;
                            }
                        } catch (IllegalArgumentException unused4) {
                            i = length;
                        }
                    } else {
                        i = length;
                        if (c13.equalsIgnoreCase("max-age")) {
                            j10 = a(str2);
                        } else {
                            if (c13.equalsIgnoreCase("domain")) {
                                if (!str2.endsWith(com.anythink.core.common.d.j.f13164z)) {
                                    if (str2.startsWith(com.anythink.core.common.d.j.f13164z)) {
                                        z6 = true;
                                        try {
                                            str2 = str2.substring(1);
                                        } catch (IllegalArgumentException unused5) {
                                            continue;
                                        }
                                    } else {
                                        z6 = true;
                                    }
                                    String a15 = com.anythink.core.common.n.b.a.c.a(str2);
                                    if (a15 == null) {
                                        throw new IllegalArgumentException();
                                    }
                                    str4 = a15;
                                    z13 = false;
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } else {
                                z6 = true;
                                if (c13.equalsIgnoreCase(com.anythink.expressad.a.f18390K)) {
                                    str5 = str2;
                                } else if (c13.equalsIgnoreCase("secure")) {
                                    z11 = true;
                                } else if (c13.equalsIgnoreCase("httponly")) {
                                    z12 = true;
                                }
                            }
                            i12 = a11 + 1;
                            str3 = str;
                            z9 = z6;
                            length = i;
                            r32 = 0;
                            c10 = '=';
                            i11 = -1;
                        }
                    }
                    z6 = true;
                    z10 = true;
                    i12 = a11 + 1;
                    str3 = str;
                    z9 = z6;
                    length = i;
                    r32 = 0;
                    c10 = '=';
                    i11 = -1;
                }
                if (j10 == Long.MIN_VALUE) {
                    j9 = Long.MIN_VALUE;
                    vVar2 = vVar;
                } else if (j10 != -1) {
                    long j12 = j6 + (j10 <= 9223372036854775L ? j10 * 1000 : Long.MAX_VALUE);
                    if (j12 < j6 || j12 > com.anythink.core.common.n.b.a.c.d.f15837a) {
                        vVar2 = vVar;
                        j9 = 253402300799999L;
                    } else {
                        vVar2 = vVar;
                        j9 = j12;
                    }
                } else {
                    vVar2 = vVar;
                    j9 = j11;
                }
                String str6 = vVar2.f16521m;
                if (str4 == null) {
                    str4 = str6;
                } else if (!a(str6, str4)) {
                    return null;
                }
                if (str6.length() != str4.length() && com.anythink.core.common.n.b.a.i.a.a().a(str4) == null) {
                    return null;
                }
                if (str5 == null || !str5.startsWith("/")) {
                    String h3 = vVar2.h();
                    int lastIndexOf = h3.lastIndexOf(47);
                    if (lastIndexOf == 0) {
                        str5 = "/";
                    } else {
                        str5 = h3.substring(0, lastIndexOf);
                    }
                }
                return new m(c11, c12, j9, str4, str5, z11, z12, z13, z10);
            }
        }
        return null;
    }

    private static long a(String str, int i) {
        int a9 = a(str, 0, i, false);
        Matcher matcher = f16469d.matcher(str);
        int i4 = -1;
        int i6 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        while (a9 < i) {
            int a10 = a(str, a9 + 1, i, true);
            matcher.region(a9, a10);
            if (i6 == -1 && matcher.usePattern(f16469d).matches()) {
                i6 = Integer.parseInt(matcher.group(1));
                i11 = Integer.parseInt(matcher.group(2));
                i12 = Integer.parseInt(matcher.group(3));
            } else if (i9 == -1 && matcher.usePattern(f16468c).matches()) {
                i9 = Integer.parseInt(matcher.group(1));
            } else {
                if (i10 == -1) {
                    Pattern pattern = f16467b;
                    if (matcher.usePattern(pattern).matches()) {
                        i10 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i4 == -1 && matcher.usePattern(f16466a).matches()) {
                    i4 = Integer.parseInt(matcher.group(1));
                }
            }
            a9 = a(str, a10 + 1, i, false);
        }
        if (i4 >= 70 && i4 <= 99) {
            i4 += 1900;
        }
        if (i4 >= 0 && i4 <= 69) {
            i4 += 2000;
        }
        if (i4 < 1601) {
            throw new IllegalArgumentException();
        }
        if (i10 == -1) {
            throw new IllegalArgumentException();
        }
        if (i9 <= 0 || i9 > 31) {
            throw new IllegalArgumentException();
        }
        if (i6 < 0 || i6 > 23) {
            throw new IllegalArgumentException();
        }
        if (i11 < 0 || i11 > 59) {
            throw new IllegalArgumentException();
        }
        if (i12 >= 0 && i12 <= 59) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(com.anythink.core.common.n.b.a.c.f15828f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i4);
            gregorianCalendar.set(2, i10 - 1);
            gregorianCalendar.set(5, i9);
            gregorianCalendar.set(11, i6);
            gregorianCalendar.set(12, i11);
            gregorianCalendar.set(13, i12);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
        throw new IllegalArgumentException();
    }

    private static int a(String str, int i, int i4, boolean z6) {
        while (i < i4) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z6)) {
                return i;
            }
            i++;
        }
        return i4;
    }

    private static long a(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e9) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e9;
        }
    }

    public static List<m> a(v vVar, u uVar) {
        List<String> b9 = uVar.b("Set-Cookie");
        int size = b9.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            m a9 = a(System.currentTimeMillis(), vVar, b9.get(i));
            if (a9 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(a9);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.EMPTY_LIST;
    }
}
