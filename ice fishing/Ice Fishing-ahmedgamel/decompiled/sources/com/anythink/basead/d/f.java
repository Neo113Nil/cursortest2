package com.anythink.basead.d;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    protected String f6144a;

    /* renamed from: b, reason: collision with root package name */
    protected String f6145b;

    public f(String str, String str2) {
        this.f6144a = str;
        this.f6145b = str2;
    }

    public final String a() {
        return this.f6144a;
    }

    public final String b() {
        return this.f6145b;
    }

    public final String c() {
        StringBuilder sb = new StringBuilder("code[ ");
        sb.append(this.f6144a);
        sb.append(" ],desc[ ");
        return u1.h.g(sb, this.f6145b, " ]");
    }
}
