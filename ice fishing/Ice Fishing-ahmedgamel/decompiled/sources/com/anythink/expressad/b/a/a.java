package com.anythink.expressad.b.a;

import u1.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f18117a;

    /* renamed from: b, reason: collision with root package name */
    public String f18118b;

    /* renamed from: c, reason: collision with root package name */
    public String f18119c;

    /* renamed from: d, reason: collision with root package name */
    public String f18120d;

    /* renamed from: e, reason: collision with root package name */
    public int f18121e;

    /* renamed from: f, reason: collision with root package name */
    public int f18122f;

    /* renamed from: g, reason: collision with root package name */
    public String f18123g;

    /* renamed from: h, reason: collision with root package name */
    public String f18124h;

    public final String a() {
        return "statusCode=" + this.f18122f + ", location=" + this.f18117a + ", contentType=" + this.f18118b + ", contentLength=" + this.f18121e + ", contentEncoding=" + this.f18119c + ", referer=" + this.f18120d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickResponseHeader{location='");
        sb.append(this.f18117a);
        sb.append("', contentType='");
        sb.append(this.f18118b);
        sb.append("', contentEncoding='");
        sb.append(this.f18119c);
        sb.append("', referer='");
        sb.append(this.f18120d);
        sb.append("', contentLength=");
        sb.append(this.f18121e);
        sb.append(", statusCode=");
        sb.append(this.f18122f);
        sb.append(", url='");
        sb.append(this.f18123g);
        sb.append("', exception='");
        return h.g(sb, this.f18124h, "'}");
    }
}
