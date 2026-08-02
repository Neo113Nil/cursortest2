package com.anythink.core.common.a;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private String f12954a;

    /* renamed from: b, reason: collision with root package name */
    private String f12955b;

    /* renamed from: c, reason: collision with root package name */
    private String f12956c;

    /* renamed from: d, reason: collision with root package name */
    private int f12957d;

    /* renamed from: e, reason: collision with root package name */
    private String f12958e;

    public final String a() {
        return TextUtils.isEmpty(this.f12954a) ? "" : this.f12954a;
    }

    public final String b() {
        return TextUtils.isEmpty(this.f12955b) ? "" : this.f12955b;
    }

    public final String c() {
        return TextUtils.isEmpty(this.f12956c) ? "" : this.f12956c;
    }

    public final int d() {
        return this.f12957d;
    }

    public final String e() {
        return TextUtils.isEmpty(this.f12958e) ? "" : this.f12958e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdxOfferTrackingRecordBean{placementId='");
        sb.append(this.f12954a);
        sb.append("', dspId='");
        sb.append(this.f12955b);
        sb.append("', offerId='");
        sb.append(this.f12956c);
        sb.append("', tkType=");
        sb.append(this.f12957d);
        sb.append(", extraInfo='");
        return Wv.i(sb, this.f12958e, "'}");
    }

    public final void d(String str) {
        this.f12958e = str;
    }

    public final void a(String str) {
        this.f12954a = str;
    }

    public final void b(String str) {
        this.f12955b = str;
    }

    public final void c(String str) {
        this.f12956c = str;
    }

    public final void a(int i) {
        this.f12957d = i;
    }
}
