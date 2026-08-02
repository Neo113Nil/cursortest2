package com.anythink.core.c.a;

import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public double f12816a;

    /* renamed from: b, reason: collision with root package name */
    public String f12817b;

    public d() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentLoadedHighPriceInfo{price=");
        sb.append(this.f12816a);
        sb.append(", adSourceId='");
        return Wv.i(sb, this.f12817b, "'}");
    }

    public d(double d9, String str) {
        this.f12816a = d9;
        this.f12817b = str;
    }
}
