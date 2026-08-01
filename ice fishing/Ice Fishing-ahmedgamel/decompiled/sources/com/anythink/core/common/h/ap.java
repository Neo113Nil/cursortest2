package com.anythink.core.common.h;

/* loaded from: classes.dex */
public final class ap {

    /* renamed from: a, reason: collision with root package name */
    private String f13530a;

    /* renamed from: b, reason: collision with root package name */
    private String f13531b;

    /* renamed from: c, reason: collision with root package name */
    private String f13532c;

    /* renamed from: d, reason: collision with root package name */
    private int f13533d;

    /* renamed from: e, reason: collision with root package name */
    private int f13534e;

    /* renamed from: f, reason: collision with root package name */
    private String f13535f;

    private static ap g() {
        return new ap();
    }

    public final String a() {
        return this.f13530a;
    }

    public final String b() {
        return this.f13531b;
    }

    public final String c() {
        return this.f13532c;
    }

    public final int d() {
        return this.f13533d;
    }

    public final int e() {
        return this.f13534e;
    }

    public final String f() {
        return this.f13535f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EcpmEncDecInfo{uniqueId='");
        sb.append(this.f13530a);
        sb.append("', ecpmEncryptInfo='");
        sb.append(this.f13531b);
        sb.append("', ecpmEncPubKey='");
        sb.append(this.f13532c);
        sb.append("', ecpmDecPvtKeyServerId=");
        sb.append(this.f13533d);
        sb.append(", ecpmDecPvtKeyClientId=");
        sb.append(this.f13534e);
        sb.append(", ecpmRmbEncryptInfo='");
        return u1.h.g(sb, this.f13535f, "'}");
    }

    public final void a(String str) {
        this.f13530a = str;
    }

    public final void b(String str) {
        this.f13531b = str;
    }

    public final void c(String str) {
        this.f13532c = str;
    }

    public final void d(String str) {
        this.f13535f = str;
    }

    public final void a(int i) {
        this.f13533d = i;
    }

    public final void b(int i) {
        this.f13534e = i;
    }
}
