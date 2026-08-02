package com.anythink.core.common.n.b;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f16370a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f16371b;

    /* renamed from: c, reason: collision with root package name */
    String f16372c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16373d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f16374e;

    /* renamed from: f, reason: collision with root package name */
    private final int f16375f;

    /* renamed from: g, reason: collision with root package name */
    private final int f16376g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f16377h;
    private final boolean i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f16378j;

    /* renamed from: k, reason: collision with root package name */
    private final int f16379k;

    /* renamed from: l, reason: collision with root package name */
    private final int f16380l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f16381m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f16382n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f16383o;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f16384a;

        /* renamed from: b, reason: collision with root package name */
        boolean f16385b;

        /* renamed from: c, reason: collision with root package name */
        int f16386c = -1;

        /* renamed from: d, reason: collision with root package name */
        int f16387d = -1;

        /* renamed from: e, reason: collision with root package name */
        int f16388e = -1;

        /* renamed from: f, reason: collision with root package name */
        boolean f16389f;

        /* renamed from: g, reason: collision with root package name */
        boolean f16390g;

        /* renamed from: h, reason: collision with root package name */
        boolean f16391h;

        private a a(int i, TimeUnit timeUnit) {
            if (i < 0) {
                throw new IllegalArgumentException("maxAge < 0: ".concat(String.valueOf(i)));
            }
            long seconds = timeUnit.toSeconds(i);
            this.f16386c = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        private a b() {
            this.f16384a = true;
            return this;
        }

        private a c() {
            this.f16385b = true;
            return this;
        }

        private a d() {
            this.f16389f = true;
            return this;
        }

        private a e() {
            this.f16390g = true;
            return this;
        }

        private a f() {
            this.f16391h = true;
            return this;
        }

        private a b(int i, TimeUnit timeUnit) {
            if (i < 0) {
                throw new IllegalArgumentException("minFresh < 0: ".concat(String.valueOf(i)));
            }
            long seconds = timeUnit.toSeconds(i);
            this.f16388e = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        private a a(TimeUnit timeUnit) {
            long seconds = timeUnit.toSeconds(2147483647L);
            this.f16387d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        public final d a() {
            return new d(this);
        }
    }

    static {
        a aVar = new a();
        aVar.f16384a = true;
        f16370a = aVar.a();
        a aVar2 = new a();
        aVar2.f16389f = true;
        long seconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        aVar2.f16387d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
        f16371b = aVar2.a();
    }

    private d(boolean z6, boolean z9, int i, int i4, boolean z10, boolean z11, boolean z12, int i6, int i9, boolean z13, boolean z14, boolean z15, String str) {
        this.f16373d = z6;
        this.f16374e = z9;
        this.f16375f = i;
        this.f16376g = i4;
        this.f16377h = z10;
        this.i = z11;
        this.f16378j = z12;
        this.f16379k = i6;
        this.f16380l = i9;
        this.f16381m = z13;
        this.f16382n = z14;
        this.f16383o = z15;
        this.f16372c = str;
    }

    private int j() {
        return this.f16376g;
    }

    private boolean k() {
        return this.f16382n;
    }

    private boolean l() {
        return this.f16383o;
    }

    private String m() {
        StringBuilder sb = new StringBuilder();
        if (this.f16373d) {
            sb.append("no-cache, ");
        }
        if (this.f16374e) {
            sb.append("no-store, ");
        }
        if (this.f16375f != -1) {
            sb.append("max-age=");
            sb.append(this.f16375f);
            sb.append(", ");
        }
        if (this.f16376g != -1) {
            sb.append("s-maxage=");
            sb.append(this.f16376g);
            sb.append(", ");
        }
        if (this.f16377h) {
            sb.append("private, ");
        }
        if (this.i) {
            sb.append("public, ");
        }
        if (this.f16378j) {
            sb.append("must-revalidate, ");
        }
        if (this.f16379k != -1) {
            sb.append("max-stale=");
            sb.append(this.f16379k);
            sb.append(", ");
        }
        if (this.f16380l != -1) {
            sb.append("min-fresh=");
            sb.append(this.f16380l);
            sb.append(", ");
        }
        if (this.f16381m) {
            sb.append("only-if-cached, ");
        }
        if (this.f16382n) {
            sb.append("no-transform, ");
        }
        if (this.f16383o) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    public final boolean a() {
        return this.f16373d;
    }

    public final boolean b() {
        return this.f16374e;
    }

    public final int c() {
        return this.f16375f;
    }

    public final boolean d() {
        return this.f16377h;
    }

    public final boolean e() {
        return this.i;
    }

    public final boolean f() {
        return this.f16378j;
    }

    public final int g() {
        return this.f16379k;
    }

    public final int h() {
        return this.f16380l;
    }

    public final boolean i() {
        return this.f16381m;
    }

    public final String toString() {
        String sb;
        String str = this.f16372c;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f16373d) {
            sb2.append("no-cache, ");
        }
        if (this.f16374e) {
            sb2.append("no-store, ");
        }
        if (this.f16375f != -1) {
            sb2.append("max-age=");
            sb2.append(this.f16375f);
            sb2.append(", ");
        }
        if (this.f16376g != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f16376g);
            sb2.append(", ");
        }
        if (this.f16377h) {
            sb2.append("private, ");
        }
        if (this.i) {
            sb2.append("public, ");
        }
        if (this.f16378j) {
            sb2.append("must-revalidate, ");
        }
        if (this.f16379k != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f16379k);
            sb2.append(", ");
        }
        if (this.f16380l != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f16380l);
            sb2.append(", ");
        }
        if (this.f16381m) {
            sb2.append("only-if-cached, ");
        }
        if (this.f16382n) {
            sb2.append("no-transform, ");
        }
        if (this.f16383o) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            sb = "";
        } else {
            sb2.delete(sb2.length() - 2, sb2.length());
            sb = sb2.toString();
        }
        this.f16372c = sb;
        return sb;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d a(u uVar) {
        int i;
        int i4;
        String str;
        u uVar2 = uVar;
        int a9 = uVar2.a();
        int i6 = 0;
        boolean z6 = true;
        String str2 = null;
        boolean z9 = false;
        boolean z10 = false;
        int i9 = -1;
        int i10 = -1;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        int i11 = -1;
        int i12 = -1;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        while (i6 < a9) {
            String a10 = uVar2.a(i6);
            String b9 = uVar2.b(i6);
            if (a10.equalsIgnoreCase("Cache-Control")) {
                if (str2 == null) {
                    str2 = b9;
                    i = 0;
                    while (i < b9.length()) {
                        int a11 = com.anythink.core.common.n.b.a.c.e.a(b9, i, "=,;");
                        String trim = b9.substring(i, a11).trim();
                        if (a11 == b9.length() || b9.charAt(a11) == ',' || b9.charAt(a11) == ';') {
                            i4 = a11 + 1;
                            str = null;
                        } else {
                            int a12 = com.anythink.core.common.n.b.a.c.e.a(b9, a11 + 1);
                            if (a12 >= b9.length() || b9.charAt(a12) != '\"') {
                                i4 = com.anythink.core.common.n.b.a.c.e.a(b9, a12, ",;");
                                str = b9.substring(a12, i4).trim();
                            } else {
                                int i13 = a12 + 1;
                                int a13 = com.anythink.core.common.n.b.a.c.e.a(b9, i13, "\"");
                                str = b9.substring(i13, a13);
                                i4 = a13 + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(trim)) {
                            i = i4;
                            z9 = true;
                        } else if ("no-store".equalsIgnoreCase(trim)) {
                            i = i4;
                            z10 = true;
                        } else {
                            if ("max-age".equalsIgnoreCase(trim)) {
                                i9 = com.anythink.core.common.n.b.a.c.e.b(str, -1);
                            } else if ("s-maxage".equalsIgnoreCase(trim)) {
                                i10 = com.anythink.core.common.n.b.a.c.e.b(str, -1);
                            } else if ("private".equalsIgnoreCase(trim)) {
                                i = i4;
                                z11 = true;
                            } else if ("public".equalsIgnoreCase(trim)) {
                                i = i4;
                                z12 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(trim)) {
                                i = i4;
                                z13 = true;
                            } else if ("max-stale".equalsIgnoreCase(trim)) {
                                i11 = com.anythink.core.common.n.b.a.c.e.b(str, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(trim)) {
                                i12 = com.anythink.core.common.n.b.a.c.e.b(str, -1);
                            } else if ("only-if-cached".equalsIgnoreCase(trim)) {
                                i = i4;
                                z14 = true;
                            } else if ("no-transform".equalsIgnoreCase(trim)) {
                                i = i4;
                                z15 = true;
                            } else if ("immutable".equalsIgnoreCase(trim)) {
                                z16 = true;
                            }
                            i = i4;
                        }
                    }
                    i6++;
                    uVar2 = uVar;
                }
            } else if (!a10.equalsIgnoreCase("Pragma")) {
                i6++;
                uVar2 = uVar;
            }
            z6 = false;
            i = 0;
            while (i < b9.length()) {
            }
            i6++;
            uVar2 = uVar;
        }
        return new d(z9, z10, i9, i10, z11, z12, z13, i11, i12, z14, z15, z16, !z6 ? null : str2);
    }

    public d(a aVar) {
        this.f16373d = aVar.f16384a;
        this.f16374e = aVar.f16385b;
        this.f16375f = aVar.f16386c;
        this.f16376g = -1;
        this.f16377h = false;
        this.i = false;
        this.f16378j = false;
        this.f16379k = aVar.f16387d;
        this.f16380l = aVar.f16388e;
        this.f16381m = aVar.f16389f;
        this.f16382n = aVar.f16390g;
        this.f16383o = aVar.f16391h;
    }
}
