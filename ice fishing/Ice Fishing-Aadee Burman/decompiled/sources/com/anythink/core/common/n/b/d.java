package com.anythink.core.common.n.b;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f15583a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f15584b;

    /* renamed from: c, reason: collision with root package name */
    String f15585c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f15586d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f15587e;

    /* renamed from: f, reason: collision with root package name */
    private final int f15588f;

    /* renamed from: g, reason: collision with root package name */
    private final int f15589g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f15590h;
    private final boolean i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f15591j;

    /* renamed from: k, reason: collision with root package name */
    private final int f15592k;

    /* renamed from: l, reason: collision with root package name */
    private final int f15593l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f15594m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f15595n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f15596o;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f15597a;

        /* renamed from: b, reason: collision with root package name */
        boolean f15598b;

        /* renamed from: c, reason: collision with root package name */
        int f15599c = -1;

        /* renamed from: d, reason: collision with root package name */
        int f15600d = -1;

        /* renamed from: e, reason: collision with root package name */
        int f15601e = -1;

        /* renamed from: f, reason: collision with root package name */
        boolean f15602f;

        /* renamed from: g, reason: collision with root package name */
        boolean f15603g;

        /* renamed from: h, reason: collision with root package name */
        boolean f15604h;

        private a a(int i, TimeUnit timeUnit) {
            if (i < 0) {
                throw new IllegalArgumentException("maxAge < 0: ".concat(String.valueOf(i)));
            }
            long seconds = timeUnit.toSeconds(i);
            this.f15599c = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        private a b() {
            this.f15597a = true;
            return this;
        }

        private a c() {
            this.f15598b = true;
            return this;
        }

        private a d() {
            this.f15602f = true;
            return this;
        }

        private a e() {
            this.f15603g = true;
            return this;
        }

        private a f() {
            this.f15604h = true;
            return this;
        }

        private a b(int i, TimeUnit timeUnit) {
            if (i < 0) {
                throw new IllegalArgumentException("minFresh < 0: ".concat(String.valueOf(i)));
            }
            long seconds = timeUnit.toSeconds(i);
            this.f15601e = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        private a a(TimeUnit timeUnit) {
            long seconds = timeUnit.toSeconds(2147483647L);
            this.f15600d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        public final d a() {
            return new d(this);
        }
    }

    static {
        a aVar = new a();
        aVar.f15597a = true;
        f15583a = aVar.a();
        a aVar2 = new a();
        aVar2.f15602f = true;
        long seconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        aVar2.f15600d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
        f15584b = aVar2.a();
    }

    private d(boolean z3, boolean z6, int i, int i6, boolean z9, boolean z10, boolean z11, int i9, int i10, boolean z12, boolean z13, boolean z14, String str) {
        this.f15586d = z3;
        this.f15587e = z6;
        this.f15588f = i;
        this.f15589g = i6;
        this.f15590h = z9;
        this.i = z10;
        this.f15591j = z11;
        this.f15592k = i9;
        this.f15593l = i10;
        this.f15594m = z12;
        this.f15595n = z13;
        this.f15596o = z14;
        this.f15585c = str;
    }

    private int j() {
        return this.f15589g;
    }

    private boolean k() {
        return this.f15595n;
    }

    private boolean l() {
        return this.f15596o;
    }

    private String m() {
        StringBuilder sb = new StringBuilder();
        if (this.f15586d) {
            sb.append("no-cache, ");
        }
        if (this.f15587e) {
            sb.append("no-store, ");
        }
        if (this.f15588f != -1) {
            sb.append("max-age=");
            sb.append(this.f15588f);
            sb.append(", ");
        }
        if (this.f15589g != -1) {
            sb.append("s-maxage=");
            sb.append(this.f15589g);
            sb.append(", ");
        }
        if (this.f15590h) {
            sb.append("private, ");
        }
        if (this.i) {
            sb.append("public, ");
        }
        if (this.f15591j) {
            sb.append("must-revalidate, ");
        }
        if (this.f15592k != -1) {
            sb.append("max-stale=");
            sb.append(this.f15592k);
            sb.append(", ");
        }
        if (this.f15593l != -1) {
            sb.append("min-fresh=");
            sb.append(this.f15593l);
            sb.append(", ");
        }
        if (this.f15594m) {
            sb.append("only-if-cached, ");
        }
        if (this.f15595n) {
            sb.append("no-transform, ");
        }
        if (this.f15596o) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    public final boolean a() {
        return this.f15586d;
    }

    public final boolean b() {
        return this.f15587e;
    }

    public final int c() {
        return this.f15588f;
    }

    public final boolean d() {
        return this.f15590h;
    }

    public final boolean e() {
        return this.i;
    }

    public final boolean f() {
        return this.f15591j;
    }

    public final int g() {
        return this.f15592k;
    }

    public final int h() {
        return this.f15593l;
    }

    public final boolean i() {
        return this.f15594m;
    }

    public final String toString() {
        String sb;
        String str = this.f15585c;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f15586d) {
            sb2.append("no-cache, ");
        }
        if (this.f15587e) {
            sb2.append("no-store, ");
        }
        if (this.f15588f != -1) {
            sb2.append("max-age=");
            sb2.append(this.f15588f);
            sb2.append(", ");
        }
        if (this.f15589g != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f15589g);
            sb2.append(", ");
        }
        if (this.f15590h) {
            sb2.append("private, ");
        }
        if (this.i) {
            sb2.append("public, ");
        }
        if (this.f15591j) {
            sb2.append("must-revalidate, ");
        }
        if (this.f15592k != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f15592k);
            sb2.append(", ");
        }
        if (this.f15593l != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f15593l);
            sb2.append(", ");
        }
        if (this.f15594m) {
            sb2.append("only-if-cached, ");
        }
        if (this.f15595n) {
            sb2.append("no-transform, ");
        }
        if (this.f15596o) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            sb = "";
        } else {
            sb2.delete(sb2.length() - 2, sb2.length());
            sb = sb2.toString();
        }
        this.f15585c = sb;
        return sb;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d a(u uVar) {
        int i;
        int i6;
        String str;
        u uVar2 = uVar;
        int a9 = uVar2.a();
        int i9 = 0;
        boolean z3 = true;
        String str2 = null;
        boolean z6 = false;
        boolean z9 = false;
        int i10 = -1;
        int i11 = -1;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i12 = -1;
        int i13 = -1;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        while (i9 < a9) {
            String a10 = uVar2.a(i9);
            String b9 = uVar2.b(i9);
            if (a10.equalsIgnoreCase("Cache-Control")) {
                if (str2 == null) {
                    str2 = b9;
                    i = 0;
                    while (i < b9.length()) {
                        int a11 = com.anythink.core.common.n.b.a.c.e.a(b9, i, "=,;");
                        String trim = b9.substring(i, a11).trim();
                        if (a11 == b9.length() || b9.charAt(a11) == ',' || b9.charAt(a11) == ';') {
                            i6 = a11 + 1;
                            str = null;
                        } else {
                            int a12 = com.anythink.core.common.n.b.a.c.e.a(b9, a11 + 1);
                            if (a12 >= b9.length() || b9.charAt(a12) != '\"') {
                                i6 = com.anythink.core.common.n.b.a.c.e.a(b9, a12, ",;");
                                str = b9.substring(a12, i6).trim();
                            } else {
                                int i14 = a12 + 1;
                                int a13 = com.anythink.core.common.n.b.a.c.e.a(b9, i14, "\"");
                                str = b9.substring(i14, a13);
                                i6 = a13 + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(trim)) {
                            i = i6;
                            z6 = true;
                        } else if ("no-store".equalsIgnoreCase(trim)) {
                            i = i6;
                            z9 = true;
                        } else {
                            if ("max-age".equalsIgnoreCase(trim)) {
                                i10 = com.anythink.core.common.n.b.a.c.e.b(str, -1);
                            } else if ("s-maxage".equalsIgnoreCase(trim)) {
                                i11 = com.anythink.core.common.n.b.a.c.e.b(str, -1);
                            } else if ("private".equalsIgnoreCase(trim)) {
                                i = i6;
                                z10 = true;
                            } else if ("public".equalsIgnoreCase(trim)) {
                                i = i6;
                                z11 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(trim)) {
                                i = i6;
                                z12 = true;
                            } else if ("max-stale".equalsIgnoreCase(trim)) {
                                i12 = com.anythink.core.common.n.b.a.c.e.b(str, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(trim)) {
                                i13 = com.anythink.core.common.n.b.a.c.e.b(str, -1);
                            } else if ("only-if-cached".equalsIgnoreCase(trim)) {
                                i = i6;
                                z13 = true;
                            } else if ("no-transform".equalsIgnoreCase(trim)) {
                                i = i6;
                                z14 = true;
                            } else if ("immutable".equalsIgnoreCase(trim)) {
                                z15 = true;
                            }
                            i = i6;
                        }
                    }
                    i9++;
                    uVar2 = uVar;
                }
            } else if (!a10.equalsIgnoreCase("Pragma")) {
                i9++;
                uVar2 = uVar;
            }
            z3 = false;
            i = 0;
            while (i < b9.length()) {
            }
            i9++;
            uVar2 = uVar;
        }
        return new d(z6, z9, i10, i11, z10, z11, z12, i12, i13, z13, z14, z15, !z3 ? null : str2);
    }

    public d(a aVar) {
        this.f15586d = aVar.f15597a;
        this.f15587e = aVar.f15598b;
        this.f15588f = aVar.f15599c;
        this.f15589g = -1;
        this.f15590h = false;
        this.i = false;
        this.f15591j = false;
        this.f15592k = aVar.f15600d;
        this.f15593l = aVar.f15601e;
        this.f15594m = aVar.f15602f;
        this.f15595n = aVar.f15603g;
        this.f15596o = aVar.f15604h;
    }
}
