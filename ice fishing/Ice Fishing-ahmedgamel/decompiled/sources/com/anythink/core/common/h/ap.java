package com.anythink.core.common.h;

import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public final class ap {

    /* renamed from: a, reason: collision with root package name */
    private String f14316a;

    /* renamed from: b, reason: collision with root package name */
    private String f14317b;

    /* renamed from: c, reason: collision with root package name */
    private String f14318c;

    /* renamed from: d, reason: collision with root package name */
    private int f14319d;

    /* renamed from: e, reason: collision with root package name */
    private int f14320e;

    /* renamed from: f, reason: collision with root package name */
    private String f14321f;

    private static ap g() {
        return new ap();
    }

    public final String a() {
        return this.f14316a;
    }

    public final String b() {
        return this.f14317b;
    }

    public final String c() {
        return this.f14318c;
    }

    public final int d() {
        return this.f14319d;
    }

    public final int e() {
        return this.f14320e;
    }

    public final String f() {
        return this.f14321f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EcpmEncDecInfo{uniqueId='");
        sb.append(this.f14316a);
        sb.append("', ecpmEncryptInfo='");
        sb.append(this.f14317b);
        sb.append("', ecpmEncPubKey='");
        sb.append(this.f14318c);
        sb.append("', ecpmDecPvtKeyServerId=");
        sb.append(this.f14319d);
        sb.append(", ecpmDecPvtKeyClientId=");
        sb.append(this.f14320e);
        sb.append(", ecpmRmbEncryptInfo='");
        return Wv.i(sb, this.f14321f, "'}");
    }

    public final void a(String str) {
        this.f14316a = str;
    }

    public final void b(String str) {
        this.f14317b = str;
    }

    public final void c(String str) {
        this.f14318c = str;
    }

    public final void d(String str) {
        this.f14321f = str;
    }

    public final void a(int i) {
        this.f14319d = i;
    }

    public final void b(int i) {
        this.f14320e = i;
    }
}
