package com.anythink.expressad.b.a;

import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f18275a;

    /* renamed from: b, reason: collision with root package name */
    public String f18276b;

    /* renamed from: c, reason: collision with root package name */
    public String f18277c;

    /* renamed from: d, reason: collision with root package name */
    public String f18278d;

    /* renamed from: e, reason: collision with root package name */
    public int f18279e;

    /* renamed from: f, reason: collision with root package name */
    public int f18280f;

    /* renamed from: g, reason: collision with root package name */
    public String f18281g;

    /* renamed from: h, reason: collision with root package name */
    public String f18282h;

    public final String a() {
        return "statusCode=" + this.f18280f + ", location=" + this.f18275a + ", contentType=" + this.f18276b + ", contentLength=" + this.f18279e + ", contentEncoding=" + this.f18277c + ", referer=" + this.f18278d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickResponseHeader{location='");
        sb.append(this.f18275a);
        sb.append("', contentType='");
        sb.append(this.f18276b);
        sb.append("', contentEncoding='");
        sb.append(this.f18277c);
        sb.append("', referer='");
        sb.append(this.f18278d);
        sb.append("', contentLength=");
        sb.append(this.f18279e);
        sb.append(", statusCode=");
        sb.append(this.f18280f);
        sb.append(", url='");
        sb.append(this.f18281g);
        sb.append("', exception='");
        return AbstractC5051n.g(sb, this.f18282h, "'}");
    }
}
