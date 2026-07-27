package com.anythink.core.common.a;

import android.text.TextUtils;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private String f12325a;

    /* renamed from: b, reason: collision with root package name */
    private String f12326b;

    /* renamed from: c, reason: collision with root package name */
    private String f12327c;

    /* renamed from: d, reason: collision with root package name */
    private int f12328d;

    /* renamed from: e, reason: collision with root package name */
    private String f12329e;

    public final String a() {
        return TextUtils.isEmpty(this.f12325a) ? "" : this.f12325a;
    }

    public final String b() {
        return TextUtils.isEmpty(this.f12326b) ? "" : this.f12326b;
    }

    public final String c() {
        return TextUtils.isEmpty(this.f12327c) ? "" : this.f12327c;
    }

    public final int d() {
        return this.f12328d;
    }

    public final String e() {
        return TextUtils.isEmpty(this.f12329e) ? "" : this.f12329e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdxOfferTrackingRecordBean{placementId='");
        sb.append(this.f12325a);
        sb.append("', dspId='");
        sb.append(this.f12326b);
        sb.append("', offerId='");
        sb.append(this.f12327c);
        sb.append("', tkType=");
        sb.append(this.f12328d);
        sb.append(", extraInfo='");
        return AbstractC5051n.g(sb, this.f12329e, "'}");
    }

    public final void d(String str) {
        this.f12329e = str;
    }

    public final void a(String str) {
        this.f12325a = str;
    }

    public final void b(String str) {
        this.f12326b = str;
    }

    public final void c(String str) {
        this.f12327c = str;
    }

    public final void a(int i) {
        this.f12328d = i;
    }
}
