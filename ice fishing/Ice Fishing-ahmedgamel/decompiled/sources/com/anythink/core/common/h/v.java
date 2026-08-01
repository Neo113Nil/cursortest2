package com.anythink.core.common.h;

import java.util.Map;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final String f14098a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14099b;

    /* renamed from: c, reason: collision with root package name */
    private String f14100c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f14101d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14102e;

    public v(String str, String str2) {
        this.f14098a = str;
        this.f14099b = str2;
    }

    public final String a() {
        return this.f14098a;
    }

    public final String b() {
        return this.f14099b;
    }

    public final String c() {
        return this.f14100c;
    }

    public final Map<String, String> d() {
        return this.f14101d;
    }

    public final boolean e() {
        return this.f14102e;
    }

    public final void f() {
        this.f14102e = true;
    }

    public final void a(String str) {
        this.f14100c = str;
    }

    public final void a(Map<String, String> map) {
        this.f14101d = map;
    }
}
