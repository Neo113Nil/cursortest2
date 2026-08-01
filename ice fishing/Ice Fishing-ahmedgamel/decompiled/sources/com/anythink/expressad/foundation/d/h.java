package com.anythink.expressad.foundation.d;

import java.util.Map;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: A, reason: collision with root package name */
    private static final String f18735A = "template download error";

    /* renamed from: B, reason: collision with root package name */
    private static final String f18736B = "endcard template download error";

    /* renamed from: C, reason: collision with root package name */
    private static final String f18737C = "big template render error";

    /* renamed from: D, reason: collision with root package name */
    private static final String f18738D = "template render error";

    /* renamed from: E, reason: collision with root package name */
    private static final String f18739E = " isready false error";

    /* renamed from: F, reason: collision with root package name */
    private static final String f18740F = " load time out error";

    /* renamed from: G, reason: collision with root package name */
    private static final String f18741G = " no fill";

    /* renamed from: H, reason: collision with root package name */
    private static final String f18742H = "current unit is loading";

    /* renamed from: I, reason: collision with root package name */
    private static final String f18743I = "app already install";
    private static final String J = "adn no offer fill";

    /* renamed from: K, reason: collision with root package name */
    private static final String f18744K = "ad over cap ";

    /* renamed from: L, reason: collision with root package name */
    private static final String f18745L = " unknown error";

    /* renamed from: M, reason: collision with root package name */
    private static final String f18746M = "load exception";

    /* renamed from: a, reason: collision with root package name */
    public static final int f18747a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f18748b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f18749c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f18750d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f18751e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f18752f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final int f18753g = 6;

    /* renamed from: h, reason: collision with root package name */
    public static final int f18754h = 7;
    public static final int i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final int f18755j = 9;

    /* renamed from: k, reason: collision with root package name */
    public static final int f18756k = 10;

    /* renamed from: l, reason: collision with root package name */
    public static final int f18757l = 11;

    /* renamed from: m, reason: collision with root package name */
    public static final int f18758m = 15;

    /* renamed from: n, reason: collision with root package name */
    public static final int f18759n = 16;

    /* renamed from: o, reason: collision with root package name */
    public static final int f18760o = 18;

    /* renamed from: p, reason: collision with root package name */
    public static final int f18761p = 17;

    /* renamed from: q, reason: collision with root package name */
    public static final int f18762q = 19;

    /* renamed from: r, reason: collision with root package name */
    public static final int f18763r = 20;

    /* renamed from: s, reason: collision with root package name */
    public static final int f18764s = 21;

    /* renamed from: t, reason: collision with root package name */
    private static final String f18765t = "candidate failed";

    /* renamed from: u, reason: collision with root package name */
    private static final String f18766u = "v3 params invalid";

    /* renamed from: v, reason: collision with root package name */
    private static final String f18767v = "v3 request error";

    /* renamed from: w, reason: collision with root package name */
    private static final String f18768w = "v3 time out";

    /* renamed from: x, reason: collision with root package name */
    private static final String f18769x = "v3 response error";

    /* renamed from: y, reason: collision with root package name */
    private static final String f18770y = "video download error";

    /* renamed from: z, reason: collision with root package name */
    private static final String f18771z = "big template download error";

    /* renamed from: N, reason: collision with root package name */
    private String f18772N;

    /* renamed from: O, reason: collision with root package name */
    private int f18773O;

    /* renamed from: P, reason: collision with root package name */
    private String f18774P;

    /* renamed from: Q, reason: collision with root package name */
    private int f18775Q;

    /* renamed from: R, reason: collision with root package name */
    private Map<String, String> f18776R;

    /* renamed from: S, reason: collision with root package name */
    private String f18777S;

    /* renamed from: T, reason: collision with root package name */
    private int f18778T = -1;

    private h(int i6, String str, Map<String, String> map) {
        this.f18773O = i6;
        this.f18774P = str;
        this.f18776R = map;
        b();
    }

    private void a(String str) {
        this.f18777S = str;
    }

    private void b() {
        try {
            switch (this.f18773O) {
                case 0:
                    this.f18772N = f18766u;
                    break;
                case 1:
                    this.f18772N = f18767v;
                    break;
                case 2:
                    this.f18772N = f18768w;
                    break;
                case 3:
                    this.f18772N = f18769x;
                    break;
                case 4:
                    this.f18772N = f18770y;
                    break;
                case 5:
                    this.f18772N = f18771z;
                    break;
                case 6:
                    this.f18772N = f18735A;
                    break;
                case 7:
                    this.f18772N = f18736B;
                    break;
                case 8:
                    this.f18772N = f18737C;
                    break;
                case 9:
                    this.f18772N = f18738D;
                    break;
                case 10:
                    this.f18772N = f18740F;
                    break;
                case 11:
                    this.f18772N = f18741G;
                    break;
                case 15:
                    this.f18772N = f18739E;
                    break;
                case 16:
                    this.f18772N = f18742H;
                    break;
                case 17:
                    this.f18772N = J;
                    break;
                case 18:
                    this.f18772N = f18743I;
                    break;
                case 19:
                    this.f18772N = f18744K;
                    break;
                case 20:
                    this.f18772N = f18746M;
                    break;
                case 21:
                    this.f18772N = f18765t;
                    break;
            }
        } catch (Exception unused) {
            this.f18772N = f18745L;
        }
    }

    private String c() {
        return this.f18777S;
    }

    private int d() {
        return this.f18778T;
    }

    private int e() {
        return this.f18773O;
    }

    private int f() {
        return this.f18775Q;
    }

    private Map<String, String> g() {
        return this.f18776R;
    }

    private void a(int i6) {
        this.f18778T = i6;
    }

    private void c(int i6) {
        this.f18775Q = i6;
    }

    public final String a() {
        return this.f18774P;
    }

    private h(int i6, String str, boolean z3) {
        this.f18773O = 0;
        if (z3) {
            if (i6 == 200) {
                this.f18773O = 4;
            } else if (i6 == 201) {
                this.f18773O = 7;
            } else if (i6 == 203) {
                this.f18773O = 6;
            } else if (i6 == 205) {
                this.f18773O = 5;
            }
        }
        this.f18774P = str;
        b();
    }

    private h(int i6, String str) {
        this.f18773O = i6;
        this.f18774P = str;
        b();
    }

    private void b(int i6) {
        this.f18773O = i6;
    }

    private void b(String str) {
        this.f18774P = str;
    }
}
