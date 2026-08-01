package f0;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: b, reason: collision with root package name */
    public static final F f2878b;

    /* renamed from: c, reason: collision with root package name */
    public static final F f2879c;

    /* renamed from: d, reason: collision with root package name */
    public static final E f2880d;
    public static final E e;

    /* renamed from: f, reason: collision with root package name */
    public static final F f2881f;

    /* renamed from: g, reason: collision with root package name */
    public static final E f2882g;

    /* renamed from: h, reason: collision with root package name */
    public static final E f2883h;
    public static final F i;
    public static final E j;

    /* renamed from: k, reason: collision with root package name */
    public static final E f2884k;

    /* renamed from: l, reason: collision with root package name */
    public static final F f2885l;

    /* renamed from: m, reason: collision with root package name */
    public static final E f2886m;

    /* renamed from: n, reason: collision with root package name */
    public static final E f2887n;

    /* renamed from: o, reason: collision with root package name */
    public static final F f2888o;

    /* renamed from: p, reason: collision with root package name */
    public static final E f2889p;

    /* renamed from: q, reason: collision with root package name */
    public static final E f2890q;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2891a;

    static {
        boolean z2 = false;
        f2878b = new F(2, z2);
        f2879c = new F(4, z2);
        boolean z3 = true;
        f2880d = new E(4, z3);
        e = new E(5, z3);
        f2881f = new F(3, z2);
        f2882g = new E(6, z3);
        f2883h = new E(7, z3);
        i = new F(1, z2);
        j = new E(2, z3);
        f2884k = new E(3, z3);
        f2885l = new F(0, z2);
        f2886m = new E(0, z3);
        f2887n = new E(1, z3);
        f2888o = new F(5, z3);
        f2889p = new E(8, z3);
        f2890q = new E(9, z3);
    }

    public L(boolean z2) {
        this.f2891a = z2;
    }

    public abstract Object a(Bundle bundle, String str);

    public abstract String b();

    public Object c(Object obj, String str) {
        return d(str);
    }

    public abstract Object d(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public final String toString() {
        return b();
    }
}
