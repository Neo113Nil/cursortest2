package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.yN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4235yN {

    /* renamed from: a, reason: collision with root package name */
    public final String f35938a;

    /* renamed from: b, reason: collision with root package name */
    public final DP f35939b;

    /* renamed from: c, reason: collision with root package name */
    public final DP f35940c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35941d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35942e;

    public C4235yN(String str, DP dp, DP dp2, int i, int i4) {
        boolean z6;
        if (i != 0) {
            z6 = false;
            i4 = i4 == 0 ? 0 : i4;
            AbstractC2792Sd.i(z6);
            AbstractC2792Sd.i(true ^ TextUtils.isEmpty(str));
            this.f35938a = str;
            this.f35939b = dp;
            dp2.getClass();
            this.f35940c = dp2;
            this.f35941d = i;
            this.f35942e = i4;
        }
        z6 = true;
        AbstractC2792Sd.i(z6);
        AbstractC2792Sd.i(true ^ TextUtils.isEmpty(str));
        this.f35938a = str;
        this.f35939b = dp;
        dp2.getClass();
        this.f35940c = dp2;
        this.f35941d = i;
        this.f35942e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4235yN.class == obj.getClass()) {
            C4235yN c4235yN = (C4235yN) obj;
            if (this.f35941d == c4235yN.f35941d && this.f35942e == c4235yN.f35942e && this.f35938a.equals(c4235yN.f35938a) && this.f35939b.equals(c4235yN.f35939b) && this.f35940c.equals(c4235yN.f35940c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35940c.hashCode() + ((this.f35939b.hashCode() + ((this.f35938a.hashCode() + ((((this.f35941d + 527) * 31) + this.f35942e) * 31)) * 31)) * 31);
    }
}
