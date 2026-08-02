package com.anythink.expressad.b.b;

import com.anythink.expressad.foundation.d.d;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f18957a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f18958b = 1;

    /* renamed from: c, reason: collision with root package name */
    private String f18959c;

    /* renamed from: d, reason: collision with root package name */
    private int f18960d;

    /* renamed from: e, reason: collision with root package name */
    private HashSet<String> f18961e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private long f18962f = System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    private d f18963g;

    /* renamed from: h, reason: collision with root package name */
    private String f18964h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18965j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18966k;

    /* renamed from: l, reason: collision with root package name */
    private int f18967l;

    public b(String str, String str2) {
        this.f18959c = str;
        b(str2);
    }

    private String i() {
        return this.f18959c;
    }

    private HashSet<String> j() {
        return this.f18961e;
    }

    public final boolean a() {
        return this.f18965j;
    }

    public final boolean b() {
        return this.f18966k;
    }

    public final int c() {
        return this.f18967l;
    }

    public final int d() {
        return this.i;
    }

    public final String e() {
        return this.f18964h;
    }

    public final d f() {
        return this.f18963g;
    }

    public final int g() {
        return this.f18960d;
    }

    public final long h() {
        return this.f18962f;
    }

    public final void a(boolean z6) {
        this.f18965j = z6;
    }

    public final void b(boolean z6) {
        this.f18966k = z6;
    }

    public final void a(int i) {
        this.f18967l = i;
    }

    public final void b(int i) {
        this.i = i;
    }

    public final void a(String str) {
        this.f18964h = str;
    }

    public final void b(String str) {
        this.f18960d++;
        this.f18961e.add(str);
    }

    public final void a(d dVar) {
        this.f18963g = dVar;
    }
}
