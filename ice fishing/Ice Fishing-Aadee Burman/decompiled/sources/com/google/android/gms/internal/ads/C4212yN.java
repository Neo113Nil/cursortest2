package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.yN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4212yN {

    /* renamed from: a, reason: collision with root package name */
    public final String f35152a;

    /* renamed from: b, reason: collision with root package name */
    public final DP f35153b;

    /* renamed from: c, reason: collision with root package name */
    public final DP f35154c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35155d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35156e;

    public C4212yN(String str, DP dp, DP dp2, int i, int i6) {
        boolean z3;
        if (i != 0) {
            z3 = false;
            i6 = i6 == 0 ? 0 : i6;
            AbstractC2772Sd.i(z3);
            AbstractC2772Sd.i(true ^ TextUtils.isEmpty(str));
            this.f35152a = str;
            this.f35153b = dp;
            dp2.getClass();
            this.f35154c = dp2;
            this.f35155d = i;
            this.f35156e = i6;
        }
        z3 = true;
        AbstractC2772Sd.i(z3);
        AbstractC2772Sd.i(true ^ TextUtils.isEmpty(str));
        this.f35152a = str;
        this.f35153b = dp;
        dp2.getClass();
        this.f35154c = dp2;
        this.f35155d = i;
        this.f35156e = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4212yN.class == obj.getClass()) {
            C4212yN c4212yN = (C4212yN) obj;
            if (this.f35155d == c4212yN.f35155d && this.f35156e == c4212yN.f35156e && this.f35152a.equals(c4212yN.f35152a) && this.f35153b.equals(c4212yN.f35153b) && this.f35154c.equals(c4212yN.f35154c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35154c.hashCode() + ((this.f35153b.hashCode() + ((this.f35152a.hashCode() + ((((this.f35155d + 527) * 31) + this.f35156e) * 31)) * 31)) * 31);
    }
}
