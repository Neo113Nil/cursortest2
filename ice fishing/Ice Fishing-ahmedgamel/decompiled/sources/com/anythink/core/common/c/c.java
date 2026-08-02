package com.anythink.core.common.c;

import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private String f13067a;

    /* renamed from: b, reason: collision with root package name */
    private long f13068b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13069c;

    /* renamed from: d, reason: collision with root package name */
    private String f13070d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13071e;

    /* renamed from: f, reason: collision with root package name */
    private String f13072f;

    public c(String str, String str2, boolean z6, long j6, boolean z9) {
        this(str, str2, z6, j6, z9, null);
    }

    private String f() {
        return this.f13067a;
    }

    public final long a() {
        return this.f13068b;
    }

    public final boolean b() {
        return this.f13069c;
    }

    public final String c() {
        return this.f13070d;
    }

    public final boolean d() {
        return this.f13071e;
    }

    public final String e() {
        return this.f13072f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApkInspectResult{pkgName='");
        sb.append(this.f13067a);
        sb.append("', inspectTime=");
        sb.append(this.f13068b);
        sb.append(", inspectResult=");
        sb.append(this.f13069c);
        sb.append(", appVersion='");
        sb.append(this.f13070d);
        sb.append("', isRealTimeInspect=");
        sb.append(this.f13071e);
        sb.append(", uploadKey='");
        return Wv.i(sb, this.f13072f, "'}");
    }

    public c(String str, String str2, boolean z6, long j6, boolean z9, String str3) {
        this.f13067a = str;
        this.f13072f = str2;
        this.f13071e = z6;
        this.f13068b = j6;
        this.f13069c = z9;
        this.f13070d = str3;
    }
}
