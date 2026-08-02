package com.anythink.expressad.b.a;

import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f18904a;

    /* renamed from: b, reason: collision with root package name */
    public String f18905b;

    /* renamed from: c, reason: collision with root package name */
    public String f18906c;

    /* renamed from: d, reason: collision with root package name */
    public String f18907d;

    /* renamed from: e, reason: collision with root package name */
    public int f18908e;

    /* renamed from: f, reason: collision with root package name */
    public int f18909f;

    /* renamed from: g, reason: collision with root package name */
    public String f18910g;

    /* renamed from: h, reason: collision with root package name */
    public String f18911h;

    public final String a() {
        return "statusCode=" + this.f18909f + ", location=" + this.f18904a + ", contentType=" + this.f18905b + ", contentLength=" + this.f18908e + ", contentEncoding=" + this.f18906c + ", referer=" + this.f18907d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickResponseHeader{location='");
        sb.append(this.f18904a);
        sb.append("', contentType='");
        sb.append(this.f18905b);
        sb.append("', contentEncoding='");
        sb.append(this.f18906c);
        sb.append("', referer='");
        sb.append(this.f18907d);
        sb.append("', contentLength=");
        sb.append(this.f18908e);
        sb.append(", statusCode=");
        sb.append(this.f18909f);
        sb.append(", url='");
        sb.append(this.f18910g);
        sb.append("', exception='");
        return Wv.i(sb, this.f18911h, "'}");
    }
}
