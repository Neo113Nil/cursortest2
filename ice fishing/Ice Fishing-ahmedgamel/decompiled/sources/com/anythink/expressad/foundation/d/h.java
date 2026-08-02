package com.anythink.expressad.foundation.d;

import java.util.Map;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: A, reason: collision with root package name */
    private static final String f19522A = "template download error";

    /* renamed from: B, reason: collision with root package name */
    private static final String f19523B = "endcard template download error";

    /* renamed from: C, reason: collision with root package name */
    private static final String f19524C = "big template render error";

    /* renamed from: D, reason: collision with root package name */
    private static final String f19525D = "template render error";

    /* renamed from: E, reason: collision with root package name */
    private static final String f19526E = " isready false error";

    /* renamed from: F, reason: collision with root package name */
    private static final String f19527F = " load time out error";

    /* renamed from: G, reason: collision with root package name */
    private static final String f19528G = " no fill";

    /* renamed from: H, reason: collision with root package name */
    private static final String f19529H = "current unit is loading";

    /* renamed from: I, reason: collision with root package name */
    private static final String f19530I = "app already install";
    private static final String J = "adn no offer fill";

    /* renamed from: K, reason: collision with root package name */
    private static final String f19531K = "ad over cap ";

    /* renamed from: L, reason: collision with root package name */
    private static final String f19532L = " unknown error";

    /* renamed from: M, reason: collision with root package name */
    private static final String f19533M = "load exception";

    /* renamed from: a, reason: collision with root package name */
    public static final int f19534a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f19535b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f19536c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f19537d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f19538e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f19539f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final int f19540g = 6;

    /* renamed from: h, reason: collision with root package name */
    public static final int f19541h = 7;
    public static final int i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final int f19542j = 9;

    /* renamed from: k, reason: collision with root package name */
    public static final int f19543k = 10;

    /* renamed from: l, reason: collision with root package name */
    public static final int f19544l = 11;

    /* renamed from: m, reason: collision with root package name */
    public static final int f19545m = 15;

    /* renamed from: n, reason: collision with root package name */
    public static final int f19546n = 16;

    /* renamed from: o, reason: collision with root package name */
    public static final int f19547o = 18;

    /* renamed from: p, reason: collision with root package name */
    public static final int f19548p = 17;

    /* renamed from: q, reason: collision with root package name */
    public static final int f19549q = 19;

    /* renamed from: r, reason: collision with root package name */
    public static final int f19550r = 20;

    /* renamed from: s, reason: collision with root package name */
    public static final int f19551s = 21;

    /* renamed from: t, reason: collision with root package name */
    private static final String f19552t = "candidate failed";

    /* renamed from: u, reason: collision with root package name */
    private static final String f19553u = "v3 params invalid";

    /* renamed from: v, reason: collision with root package name */
    private static final String f19554v = "v3 request error";

    /* renamed from: w, reason: collision with root package name */
    private static final String f19555w = "v3 time out";

    /* renamed from: x, reason: collision with root package name */
    private static final String f19556x = "v3 response error";

    /* renamed from: y, reason: collision with root package name */
    private static final String f19557y = "video download error";

    /* renamed from: z, reason: collision with root package name */
    private static final String f19558z = "big template download error";

    /* renamed from: N, reason: collision with root package name */
    private String f19559N;

    /* renamed from: O, reason: collision with root package name */
    private int f19560O;

    /* renamed from: P, reason: collision with root package name */
    private String f19561P;

    /* renamed from: Q, reason: collision with root package name */
    private int f19562Q;

    /* renamed from: R, reason: collision with root package name */
    private Map<String, String> f19563R;

    /* renamed from: S, reason: collision with root package name */
    private String f19564S;

    /* renamed from: T, reason: collision with root package name */
    private int f19565T = -1;

    private h(int i4, String str, Map<String, String> map) {
        this.f19560O = i4;
        this.f19561P = str;
        this.f19563R = map;
        b();
    }

    private void a(String str) {
        this.f19564S = str;
    }

    private void b() {
        try {
            switch (this.f19560O) {
                case 0:
                    this.f19559N = f19553u;
                    break;
                case 1:
                    this.f19559N = f19554v;
                    break;
                case 2:
                    this.f19559N = f19555w;
                    break;
                case 3:
                    this.f19559N = f19556x;
                    break;
                case 4:
                    this.f19559N = f19557y;
                    break;
                case 5:
                    this.f19559N = f19558z;
                    break;
                case 6:
                    this.f19559N = f19522A;
                    break;
                case 7:
                    this.f19559N = f19523B;
                    break;
                case 8:
                    this.f19559N = f19524C;
                    break;
                case 9:
                    this.f19559N = f19525D;
                    break;
                case 10:
                    this.f19559N = f19527F;
                    break;
                case 11:
                    this.f19559N = f19528G;
                    break;
                case 15:
                    this.f19559N = f19526E;
                    break;
                case 16:
                    this.f19559N = f19529H;
                    break;
                case 17:
                    this.f19559N = J;
                    break;
                case 18:
                    this.f19559N = f19530I;
                    break;
                case 19:
                    this.f19559N = f19531K;
                    break;
                case 20:
                    this.f19559N = f19533M;
                    break;
                case 21:
                    this.f19559N = f19552t;
                    break;
            }
        } catch (Exception unused) {
            this.f19559N = f19532L;
        }
    }

    private String c() {
        return this.f19564S;
    }

    private int d() {
        return this.f19565T;
    }

    private int e() {
        return this.f19560O;
    }

    private int f() {
        return this.f19562Q;
    }

    private Map<String, String> g() {
        return this.f19563R;
    }

    private void a(int i4) {
        this.f19565T = i4;
    }

    private void c(int i4) {
        this.f19562Q = i4;
    }

    public final String a() {
        return this.f19561P;
    }

    private h(int i4, String str, boolean z6) {
        this.f19560O = 0;
        if (z6) {
            if (i4 == 200) {
                this.f19560O = 4;
            } else if (i4 == 201) {
                this.f19560O = 7;
            } else if (i4 == 203) {
                this.f19560O = 6;
            } else if (i4 == 205) {
                this.f19560O = 5;
            }
        }
        this.f19561P = str;
        b();
    }

    private h(int i4, String str) {
        this.f19560O = i4;
        this.f19561P = str;
        b();
    }

    private void b(int i4) {
        this.f19560O = i4;
    }

    private void b(String str) {
        this.f19561P = str;
    }
}
