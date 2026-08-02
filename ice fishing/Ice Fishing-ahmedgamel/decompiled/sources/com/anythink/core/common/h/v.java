package com.anythink.core.common.h;

import java.util.Map;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final String f14884a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14885b;

    /* renamed from: c, reason: collision with root package name */
    private String f14886c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f14887d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14888e;

    public v(String str, String str2) {
        this.f14884a = str;
        this.f14885b = str2;
    }

    public final String a() {
        return this.f14884a;
    }

    public final String b() {
        return this.f14885b;
    }

    public final String c() {
        return this.f14886c;
    }

    public final Map<String, String> d() {
        return this.f14887d;
    }

    public final boolean e() {
        return this.f14888e;
    }

    public final void f() {
        this.f14888e = true;
    }

    public final void a(String str) {
        this.f14886c = str;
    }

    public final void a(Map<String, String> map) {
        this.f14887d = map;
    }
}
