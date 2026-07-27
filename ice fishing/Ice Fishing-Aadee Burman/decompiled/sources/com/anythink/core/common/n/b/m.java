package com.anythink.core.common.n.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f15679a = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f15680b = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f15681c = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f15682d = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: e, reason: collision with root package name */
    private final String f15683e;

    /* renamed from: f, reason: collision with root package name */
    private final String f15684f;

    /* renamed from: g, reason: collision with root package name */
    private final long f15685g;

    /* renamed from: h, reason: collision with root package name */
    private final String f15686h;
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f15687j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f15688k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f15689l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f15690m;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        String f15691a;

        /* renamed from: b, reason: collision with root package name */
        String f15692b;

        /* renamed from: d, reason: collision with root package name */
        String f15694d;

        /* renamed from: f, reason: collision with root package name */
        boolean f15696f;

        /* renamed from: g, reason: collision with root package name */
        boolean f15697g;

        /* renamed from: h, reason: collision with root package name */
        boolean f15698h;
        boolean i;

        /* renamed from: c, reason: collision with root package name */
        long f15693c = com.anythink.core.common.n.b.a.c.d.f15050a;

        /* renamed from: e, reason: collision with root package name */
        String f15695e = "/";

        private a a(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (!str.trim().equals(str)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.f15691a = str;
            return this;
        }

        private a b(String str) {
            if (str == null) {
                throw new NullPointerException("value == null");
            }
            if (!str.trim().equals(str)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.f15692b = str;
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
            this.f15695e = str;
            return this;
        }

        private m c() {
            return new m(this);
        }

        private a a(long j6) {
            if (j6 <= 0) {
                j6 = Long.MIN_VALUE;
            }
            if (j6 > com.anythink.core.common.n.b.a.c.d.f15050a) {
                j6 = 253402300799999L;
            }
            this.f15693c = j6;
            this.f15698h = true;
            return this;
        }

        private a b() {
            this.f15697g = true;
            return this;
        }

        private a a(String str, boolean z3) {
            if (str != null) {
                String a9 = com.anythink.core.common.n.b.a.c.a(str);
                if (a9 != null) {
                    this.f15694d = a9;
                    this.i = z3;
                    return this;
                }
                throw new IllegalArgumentException("unexpected domain: ".concat(str));
            }
            throw new NullPointerException("domain == null");
        }

        private a a() {
            this.f15696f = true;
            return this;
        }
    }

    private m(String str, String str2, long j6, String str3, String str4, boolean z3, boolean z6, boolean z9, boolean z10) {
        this.f15683e = str;
        this.f15684f = str2;
        this.f15685g = j6;
        this.f15686h = str3;
        this.i = str4;
        this.f15687j = z3;
        this.f15688k = z6;
        this.f15690m = z9;
        this.f15689l = z10;
    }

    private boolean c() {
        return this.f15689l;
    }

    private long d() {
        return this.f15685g;
    }

    private boolean e() {
        return this.f15690m;
    }

    private String f() {
        return this.f15686h;
    }

    private String g() {
        return this.i;
    }

    private boolean h() {
        return this.f15688k;
    }

    private boolean i() {
        return this.f15687j;
    }

    private String j() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15683e);
        sb.append('=');
        sb.append(this.f15684f);
        if (this.f15689l) {
            if (this.f15685g == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(com.anythink.core.common.n.b.a.c.d.a(new Date(this.f15685g)));
            }
        }
        if (!this.f15690m) {
            sb.append("; domain=");
            sb.append(this.f15686h);
        }
        sb.append("; path=");
        sb.append(this.i);
        if (this.f15687j) {
            sb.append("; secure");
        }
        if (this.f15688k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public final String a() {
        return this.f15683e;
    }

    public final String b() {
        return this.f15684f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.f15683e.equals(this.f15683e) && mVar.f15684f.equals(this.f15684f) && mVar.f15686h.equals(this.f15686h) && mVar.i.equals(this.i) && mVar.f15685g == this.f15685g && mVar.f15687j == this.f15687j && mVar.f15688k == this.f15688k && mVar.f15689l == this.f15689l && mVar.f15690m == this.f15690m;
    }

    public final int hashCode() {
        int k9 = u1.h.k(u1.h.k(u1.h.k(u1.h.k(527, 31, this.f15683e), 31, this.f15684f), 31, this.f15686h), 31, this.i);
        long j6 = this.f15685g;
        return ((((((((k9 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (!this.f15687j ? 1 : 0)) * 31) + (!this.f15688k ? 1 : 0)) * 31) + (!this.f15689l ? 1 : 0)) * 31) + (!this.f15690m ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15683e);
        sb.append('=');
        sb.append(this.f15684f);
        if (this.f15689l) {
            if (this.f15685g == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(com.anythink.core.common.n.b.a.c.d.a(new Date(this.f15685g)));
            }
        }
        if (!this.f15690m) {
            sb.append("; domain=");
            sb.append(this.f15686h);
        }
        sb.append("; path=");
        sb.append(this.i);
        if (this.f15687j) {
            sb.append("; secure");
        }
        if (this.f15688k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    private boolean a(v vVar) {
        if (!(this.f15690m ? vVar.f15734m.equals(this.f15686h) : a(vVar.f15734m, this.f15686h))) {
            return false;
        }
        String str = this.i;
        String h9 = vVar.h();
        if (h9.equals(str) || (h9.startsWith(str) && (str.endsWith("/") || h9.charAt(str.length()) == '/'))) {
            return !this.f15687j || vVar.c();
        }
        return false;
    }

    private static m b(v vVar, String str) {
        return a(System.currentTimeMillis(), vVar, str);
    }

    private static String b(String str) {
        if (!str.endsWith(com.anythink.core.common.d.j.f12378z)) {
            if (str.startsWith(com.anythink.core.common.d.j.f12378z)) {
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
        String str = aVar.f15691a;
        if (str != null) {
            String str2 = aVar.f15692b;
            if (str2 != null) {
                String str3 = aVar.f15694d;
                if (str3 != null) {
                    this.f15683e = str;
                    this.f15684f = str2;
                    this.f15685g = aVar.f15693c;
                    this.f15686h = str3;
                    this.i = aVar.f15695e;
                    this.f15687j = aVar.f15696f;
                    this.f15688k = aVar.f15697g;
                    this.f15689l = aVar.f15698h;
                    this.f15690m = aVar.i;
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
        String h9 = vVar.h();
        if (h9.equals(str)) {
            return true;
        }
        if (h9.startsWith(str)) {
            return str.endsWith("/") || h9.charAt(str.length()) == '/';
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
        boolean z3;
        int i6;
        int i9;
        int i10;
        int i11;
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
            int i12 = -1;
            if (com.anythink.core.common.n.b.a.c.b(c11) == -1) {
                boolean z6 = true;
                String c12 = com.anythink.core.common.n.b.a.c.c(str3, a10 + 1, a9);
                if (com.anythink.core.common.n.b.a.c.b(c12) != -1) {
                    return null;
                }
                int i13 = a9 + 1;
                boolean z9 = false;
                boolean z10 = false;
                boolean z11 = false;
                String str5 = null;
                boolean z12 = true;
                long j10 = -1;
                long j11 = com.anythink.core.common.n.b.a.c.d.f15050a;
                while (i13 < length) {
                    int a11 = com.anythink.core.common.n.b.a.c.a(str3, i13, length, c9);
                    int a12 = com.anythink.core.common.n.b.a.c.a(str3, i13, a11, c10);
                    String c13 = com.anythink.core.common.n.b.a.c.c(str3, i13, a12);
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
                                Matcher matcher = f15682d.matcher(str2);
                                int i14 = i12;
                                int i15 = i14;
                                int i16 = i15;
                                int i17 = i16;
                                int i18 = i17;
                                int i19 = i18;
                                while (a13 < length2) {
                                    int a14 = a(str2, a13 + 1, length2, z6);
                                    matcher.region(a13, a14);
                                    int i20 = i15;
                                    try {
                                        if (i20 != -1) {
                                            i6 = -1;
                                        } else if (matcher.usePattern(f15682d).matches()) {
                                            i20 = Integer.parseInt(matcher.group(1));
                                            i18 = Integer.parseInt(matcher.group(2));
                                            i19 = Integer.parseInt(matcher.group(3));
                                            i11 = i16;
                                            i = length;
                                            i15 = i20;
                                            a13 = a(str2, a14 + 1, length2, false);
                                            length = i;
                                            z6 = true;
                                            i16 = i11;
                                        } else {
                                            i6 = -1;
                                        }
                                        if (i9 != i6) {
                                            int i21 = length;
                                            i10 = i6;
                                            i11 = i16;
                                            i = i21;
                                        } else if (matcher.usePattern(f15681c).matches()) {
                                            i17 = Integer.parseInt(matcher.group(1));
                                            i11 = i16;
                                            i = length;
                                            i15 = i20;
                                            a13 = a(str2, a14 + 1, length2, false);
                                            length = i;
                                            z6 = true;
                                            i16 = i11;
                                        } else {
                                            i11 = i16;
                                            i = length;
                                            i10 = -1;
                                        }
                                        if (i11 == i10) {
                                            Pattern pattern = f15680b;
                                            if (matcher.usePattern(pattern).matches()) {
                                                i11 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                                                i17 = i9;
                                                i15 = i20;
                                                a13 = a(str2, a14 + 1, length2, false);
                                                length = i;
                                                z6 = true;
                                                i16 = i11;
                                            } else {
                                                i10 = -1;
                                            }
                                        }
                                        i15 = i20;
                                        a13 = a(str2, a14 + 1, length2, false);
                                        length = i;
                                        z6 = true;
                                        i16 = i11;
                                    } catch (IllegalArgumentException unused) {
                                        c9 = ';';
                                        z3 = true;
                                        i13 = a11 + 1;
                                        str3 = str;
                                        z6 = z3;
                                        length = i;
                                        r32 = 0;
                                        c10 = '=';
                                        i12 = -1;
                                    }
                                    i9 = i17;
                                    if (i14 == i10 && matcher.usePattern(f15679a).matches()) {
                                        i14 = Integer.parseInt(matcher.group(1));
                                    }
                                    i17 = i9;
                                }
                                int i22 = i15;
                                int i23 = i16;
                                int i24 = i17;
                                i = length;
                                if (i14 >= 70 && i14 <= 99) {
                                    i14 += 1900;
                                }
                                if (i14 >= 0 && i14 <= 69) {
                                    i14 += 2000;
                                }
                                if (i14 < 1601) {
                                    throw new IllegalArgumentException();
                                }
                                if (i23 == -1) {
                                    throw new IllegalArgumentException();
                                }
                                if (i24 <= 0 || i24 > 31) {
                                    throw new IllegalArgumentException();
                                }
                                if (i22 < 0 || i22 > 23) {
                                    throw new IllegalArgumentException();
                                }
                                int i25 = i18;
                                c9 = ';';
                                if (i25 < 0 || i25 > 59) {
                                    throw new IllegalArgumentException();
                                }
                                int i26 = i19;
                                if (i26 >= 0 && i26 <= 59) {
                                    try {
                                        GregorianCalendar gregorianCalendar = new GregorianCalendar(com.anythink.core.common.n.b.a.c.f15041f);
                                        gregorianCalendar.setLenient(false);
                                        gregorianCalendar.set(1, i14);
                                        gregorianCalendar.set(2, i23 - 1);
                                        gregorianCalendar.set(5, i24);
                                        gregorianCalendar.set(11, i22);
                                        gregorianCalendar.set(12, i25);
                                        gregorianCalendar.set(13, i26);
                                        gregorianCalendar.set(14, 0);
                                        j11 = gregorianCalendar.getTimeInMillis();
                                    } catch (NumberFormatException | IllegalArgumentException unused2) {
                                        z3 = true;
                                        i13 = a11 + 1;
                                        str3 = str;
                                        z6 = z3;
                                        length = i;
                                        r32 = 0;
                                        c10 = '=';
                                        i12 = -1;
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
                                if (!str2.endsWith(com.anythink.core.common.d.j.f12378z)) {
                                    if (str2.startsWith(com.anythink.core.common.d.j.f12378z)) {
                                        z3 = true;
                                        try {
                                            str2 = str2.substring(1);
                                        } catch (IllegalArgumentException unused5) {
                                            continue;
                                        }
                                    } else {
                                        z3 = true;
                                    }
                                    String a15 = com.anythink.core.common.n.b.a.c.a(str2);
                                    if (a15 == null) {
                                        throw new IllegalArgumentException();
                                    }
                                    str4 = a15;
                                    z12 = false;
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } else {
                                z3 = true;
                                if (c13.equalsIgnoreCase(com.anythink.expressad.a.f17603K)) {
                                    str5 = str2;
                                } else if (c13.equalsIgnoreCase("secure")) {
                                    z10 = true;
                                } else if (c13.equalsIgnoreCase("httponly")) {
                                    z11 = true;
                                }
                            }
                            i13 = a11 + 1;
                            str3 = str;
                            z6 = z3;
                            length = i;
                            r32 = 0;
                            c10 = '=';
                            i12 = -1;
                        }
                    }
                    z3 = true;
                    z9 = true;
                    i13 = a11 + 1;
                    str3 = str;
                    z6 = z3;
                    length = i;
                    r32 = 0;
                    c10 = '=';
                    i12 = -1;
                }
                if (j10 == Long.MIN_VALUE) {
                    j9 = Long.MIN_VALUE;
                    vVar2 = vVar;
                } else if (j10 != -1) {
                    long j12 = j6 + (j10 <= 9223372036854775L ? j10 * 1000 : Long.MAX_VALUE);
                    if (j12 < j6 || j12 > com.anythink.core.common.n.b.a.c.d.f15050a) {
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
                String str6 = vVar2.f15734m;
                if (str4 == null) {
                    str4 = str6;
                } else if (!a(str6, str4)) {
                    return null;
                }
                if (str6.length() != str4.length() && com.anythink.core.common.n.b.a.i.a.a().a(str4) == null) {
                    return null;
                }
                if (str5 == null || !str5.startsWith("/")) {
                    String h9 = vVar2.h();
                    int lastIndexOf = h9.lastIndexOf(47);
                    if (lastIndexOf == 0) {
                        str5 = "/";
                    } else {
                        str5 = h9.substring(0, lastIndexOf);
                    }
                }
                return new m(c11, c12, j9, str4, str5, z10, z11, z12, z9);
            }
        }
        return null;
    }

    private static long a(String str, int i) {
        int a9 = a(str, 0, i, false);
        Matcher matcher = f15682d.matcher(str);
        int i6 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        while (a9 < i) {
            int a10 = a(str, a9 + 1, i, true);
            matcher.region(a9, a10);
            if (i9 == -1 && matcher.usePattern(f15682d).matches()) {
                i9 = Integer.parseInt(matcher.group(1));
                i12 = Integer.parseInt(matcher.group(2));
                i13 = Integer.parseInt(matcher.group(3));
            } else if (i10 == -1 && matcher.usePattern(f15681c).matches()) {
                i10 = Integer.parseInt(matcher.group(1));
            } else {
                if (i11 == -1) {
                    Pattern pattern = f15680b;
                    if (matcher.usePattern(pattern).matches()) {
                        i11 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i6 == -1 && matcher.usePattern(f15679a).matches()) {
                    i6 = Integer.parseInt(matcher.group(1));
                }
            }
            a9 = a(str, a10 + 1, i, false);
        }
        if (i6 >= 70 && i6 <= 99) {
            i6 += 1900;
        }
        if (i6 >= 0 && i6 <= 69) {
            i6 += 2000;
        }
        if (i6 < 1601) {
            throw new IllegalArgumentException();
        }
        if (i11 == -1) {
            throw new IllegalArgumentException();
        }
        if (i10 <= 0 || i10 > 31) {
            throw new IllegalArgumentException();
        }
        if (i9 < 0 || i9 > 23) {
            throw new IllegalArgumentException();
        }
        if (i12 < 0 || i12 > 59) {
            throw new IllegalArgumentException();
        }
        if (i13 >= 0 && i13 <= 59) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(com.anythink.core.common.n.b.a.c.f15041f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i6);
            gregorianCalendar.set(2, i11 - 1);
            gregorianCalendar.set(5, i10);
            gregorianCalendar.set(11, i9);
            gregorianCalendar.set(12, i12);
            gregorianCalendar.set(13, i13);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
        throw new IllegalArgumentException();
    }

    private static int a(String str, int i, int i6, boolean z3) {
        while (i < i6) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z3)) {
                return i;
            }
            i++;
        }
        return i6;
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
