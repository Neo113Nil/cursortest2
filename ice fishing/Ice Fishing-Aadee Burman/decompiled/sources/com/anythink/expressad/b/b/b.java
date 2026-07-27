package com.anythink.expressad.b.b;

import com.anythink.expressad.foundation.d.d;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f18170a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f18171b = 1;

    /* renamed from: c, reason: collision with root package name */
    private String f18172c;

    /* renamed from: d, reason: collision with root package name */
    private int f18173d;

    /* renamed from: e, reason: collision with root package name */
    private HashSet<String> f18174e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private long f18175f = System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    private d f18176g;

    /* renamed from: h, reason: collision with root package name */
    private String f18177h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18178j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18179k;

    /* renamed from: l, reason: collision with root package name */
    private int f18180l;

    public b(String str, String str2) {
        this.f18172c = str;
        b(str2);
    }

    private String i() {
        return this.f18172c;
    }

    private HashSet<String> j() {
        return this.f18174e;
    }

    public final boolean a() {
        return this.f18178j;
    }

    public final boolean b() {
        return this.f18179k;
    }

    public final int c() {
        return this.f18180l;
    }

    public final int d() {
        return this.i;
    }

    public final String e() {
        return this.f18177h;
    }

    public final d f() {
        return this.f18176g;
    }

    public final int g() {
        return this.f18173d;
    }

    public final long h() {
        return this.f18175f;
    }

    public final void a(boolean z3) {
        this.f18178j = z3;
    }

    public final void b(boolean z3) {
        this.f18179k = z3;
    }

    public final void a(int i) {
        this.f18180l = i;
    }

    public final void b(int i) {
        this.i = i;
    }

    public final void a(String str) {
        this.f18177h = str;
    }

    public final void b(String str) {
        this.f18173d++;
        this.f18174e.add(str);
    }

    public final void a(d dVar) {
        this.f18176g = dVar;
    }
}
