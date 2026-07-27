package com.anythink.core.common.m.b;

import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private String f14665a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f14666b = "";

    private d() {
    }

    public static d a(String str) {
        d dVar = new d();
        dVar.f14665a = str;
        return dVar;
    }

    private static d c() {
        return new d();
    }

    public final String b() {
        return this.f14665a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpReqEntity{urlType='");
        sb.append(this.f14665a);
        sb.append("', interceptKey='");
        return AbstractC5051n.g(sb, this.f14666b, "'}");
    }

    private void b(String str) {
        this.f14666b = str;
    }

    public static d a(String str, String str2) {
        d dVar = new d();
        dVar.f14665a = str;
        dVar.f14666b = str2;
        return dVar;
    }

    public final String a() {
        return this.f14666b;
    }
}
