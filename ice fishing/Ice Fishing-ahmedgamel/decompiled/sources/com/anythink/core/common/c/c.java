package com.anythink.core.common.c;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private String f12281a;

    /* renamed from: b, reason: collision with root package name */
    private long f12282b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12283c;

    /* renamed from: d, reason: collision with root package name */
    private String f12284d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f12285e;

    /* renamed from: f, reason: collision with root package name */
    private String f12286f;

    public c(String str, String str2, boolean z3, long j6, boolean z6) {
        this(str, str2, z3, j6, z6, null);
    }

    private String f() {
        return this.f12281a;
    }

    public final long a() {
        return this.f12282b;
    }

    public final boolean b() {
        return this.f12283c;
    }

    public final String c() {
        return this.f12284d;
    }

    public final boolean d() {
        return this.f12285e;
    }

    public final String e() {
        return this.f12286f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApkInspectResult{pkgName='");
        sb.append(this.f12281a);
        sb.append("', inspectTime=");
        sb.append(this.f12282b);
        sb.append(", inspectResult=");
        sb.append(this.f12283c);
        sb.append(", appVersion='");
        sb.append(this.f12284d);
        sb.append("', isRealTimeInspect=");
        sb.append(this.f12285e);
        sb.append(", uploadKey='");
        return u1.h.g(sb, this.f12286f, "'}");
    }

    public c(String str, String str2, boolean z3, long j6, boolean z6, String str3) {
        this.f12281a = str;
        this.f12286f = str2;
        this.f12285e = z3;
        this.f12282b = j6;
        this.f12283c = z6;
        this.f12284d = str3;
    }
}
