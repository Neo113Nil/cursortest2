package com.anythink.core.common.a;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private String f12168a;

    /* renamed from: b, reason: collision with root package name */
    private String f12169b;

    /* renamed from: c, reason: collision with root package name */
    private String f12170c;

    /* renamed from: d, reason: collision with root package name */
    private int f12171d;

    /* renamed from: e, reason: collision with root package name */
    private String f12172e;

    public final String a() {
        return TextUtils.isEmpty(this.f12168a) ? "" : this.f12168a;
    }

    public final String b() {
        return TextUtils.isEmpty(this.f12169b) ? "" : this.f12169b;
    }

    public final String c() {
        return TextUtils.isEmpty(this.f12170c) ? "" : this.f12170c;
    }

    public final int d() {
        return this.f12171d;
    }

    public final String e() {
        return TextUtils.isEmpty(this.f12172e) ? "" : this.f12172e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdxOfferTrackingRecordBean{placementId='");
        sb.append(this.f12168a);
        sb.append("', dspId='");
        sb.append(this.f12169b);
        sb.append("', offerId='");
        sb.append(this.f12170c);
        sb.append("', tkType=");
        sb.append(this.f12171d);
        sb.append(", extraInfo='");
        return u1.h.g(sb, this.f12172e, "'}");
    }

    public final void d(String str) {
        this.f12172e = str;
    }

    public final void a(String str) {
        this.f12168a = str;
    }

    public final void b(String str) {
        this.f12169b = str;
    }

    public final void c(String str) {
        this.f12170c = str;
    }

    public final void a(int i) {
        this.f12171d = i;
    }
}
