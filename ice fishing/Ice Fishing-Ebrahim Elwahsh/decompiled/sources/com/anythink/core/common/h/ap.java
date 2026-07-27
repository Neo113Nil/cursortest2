package com.anythink.core.common.h;

import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class ap {

    /* renamed from: a, reason: collision with root package name */
    private String f13687a;

    /* renamed from: b, reason: collision with root package name */
    private String f13688b;

    /* renamed from: c, reason: collision with root package name */
    private String f13689c;

    /* renamed from: d, reason: collision with root package name */
    private int f13690d;

    /* renamed from: e, reason: collision with root package name */
    private int f13691e;

    /* renamed from: f, reason: collision with root package name */
    private String f13692f;

    private static ap g() {
        return new ap();
    }

    public final String a() {
        return this.f13687a;
    }

    public final String b() {
        return this.f13688b;
    }

    public final String c() {
        return this.f13689c;
    }

    public final int d() {
        return this.f13690d;
    }

    public final int e() {
        return this.f13691e;
    }

    public final String f() {
        return this.f13692f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EcpmEncDecInfo{uniqueId='");
        sb.append(this.f13687a);
        sb.append("', ecpmEncryptInfo='");
        sb.append(this.f13688b);
        sb.append("', ecpmEncPubKey='");
        sb.append(this.f13689c);
        sb.append("', ecpmDecPvtKeyServerId=");
        sb.append(this.f13690d);
        sb.append(", ecpmDecPvtKeyClientId=");
        sb.append(this.f13691e);
        sb.append(", ecpmRmbEncryptInfo='");
        return AbstractC5051n.g(sb, this.f13692f, "'}");
    }

    public final void a(String str) {
        this.f13687a = str;
    }

    public final void b(String str) {
        this.f13688b = str;
    }

    public final void c(String str) {
        this.f13689c = str;
    }

    public final void d(String str) {
        this.f13692f = str;
    }

    public final void a(int i) {
        this.f13690d = i;
    }

    public final void b(int i) {
        this.f13691e = i;
    }
}
