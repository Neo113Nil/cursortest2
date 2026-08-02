package com.anythink.core.common.h;

/* loaded from: classes.dex */
public class ca {

    /* renamed from: a, reason: collision with root package name */
    public String f14665a;

    /* renamed from: b, reason: collision with root package name */
    public String f14666b;

    /* renamed from: c, reason: collision with root package name */
    public int f14667c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14668d;

    /* renamed from: e, reason: collision with root package name */
    private final double f14669e;

    public ca(int i, String str, String str2, double d9, String str3) {
        this.f14667c = i;
        this.f14665a = str;
        this.f14666b = str3;
        this.f14669e = d9;
        this.f14668d = str2;
    }

    private String c() {
        return this.f14665a;
    }

    private String d() {
        return this.f14666b;
    }

    private int e() {
        return this.f14667c;
    }

    public final double a() {
        return this.f14669e;
    }

    public final String b() {
        return this.f14668d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{channelId='");
        sb.append(this.f14665a);
        sb.append("', bidType='");
        sb.append(this.f14668d);
        sb.append("', price=");
        sb.append(this.f14669e);
        sb.append(", adnPlacementId='");
        sb.append(this.f14666b);
        sb.append("', filterType=");
        return D.x.n(sb, this.f14667c, '}');
    }
}
