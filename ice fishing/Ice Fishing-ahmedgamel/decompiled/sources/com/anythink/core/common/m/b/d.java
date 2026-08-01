package com.anythink.core.common.m.b;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private String f14508a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f14509b = "";

    private d() {
    }

    public static d a(String str) {
        d dVar = new d();
        dVar.f14508a = str;
        return dVar;
    }

    private static d c() {
        return new d();
    }

    public final String b() {
        return this.f14508a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpReqEntity{urlType='");
        sb.append(this.f14508a);
        sb.append("', interceptKey='");
        return u1.h.g(sb, this.f14509b, "'}");
    }

    private void b(String str) {
        this.f14509b = str;
    }

    public static d a(String str, String str2) {
        d dVar = new d();
        dVar.f14508a = str;
        dVar.f14509b = str2;
        return dVar;
    }

    public final String a() {
        return this.f14509b;
    }
}
