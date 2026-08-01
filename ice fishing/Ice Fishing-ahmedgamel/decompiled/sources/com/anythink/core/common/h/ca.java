package com.anythink.core.common.h;

/* loaded from: classes.dex */
public class ca {

    /* renamed from: a, reason: collision with root package name */
    public String f13879a;

    /* renamed from: b, reason: collision with root package name */
    public String f13880b;

    /* renamed from: c, reason: collision with root package name */
    public int f13881c;

    /* renamed from: d, reason: collision with root package name */
    private final String f13882d;

    /* renamed from: e, reason: collision with root package name */
    private final double f13883e;

    public ca(int i, String str, String str2, double d2, String str3) {
        this.f13881c = i;
        this.f13879a = str;
        this.f13880b = str3;
        this.f13883e = d2;
        this.f13882d = str2;
    }

    private String c() {
        return this.f13879a;
    }

    private String d() {
        return this.f13880b;
    }

    private int e() {
        return this.f13881c;
    }

    public final double a() {
        return this.f13883e;
    }

    public final String b() {
        return this.f13882d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{channelId='");
        sb.append(this.f13879a);
        sb.append("', bidType='");
        sb.append(this.f13882d);
        sb.append("', price=");
        sb.append(this.f13883e);
        sb.append(", adnPlacementId='");
        sb.append(this.f13880b);
        sb.append("', filterType=");
        return D.y.q(sb, this.f13881c, '}');
    }
}
