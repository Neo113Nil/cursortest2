package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class U1 extends Y1 implements L1 {

    /* renamed from: b, reason: collision with root package name */
    public final String f27911b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27912c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27913d;

    /* renamed from: e, reason: collision with root package name */
    public final long f27914e;

    /* renamed from: f, reason: collision with root package name */
    public final long f27915f;

    /* renamed from: g, reason: collision with root package name */
    public final Y1[] f27916g;

    public U1(String str, int i, int i4, long j9, long j10, Y1[] y1Arr) {
        super(com.anythink.basead.exoplayer.g.b.c.f7442a);
        String str2;
        PA.n(i <= i4);
        this.f27911b = str;
        this.f27912c = i;
        this.f27913d = i4;
        int length = y1Arr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                str2 = null;
                break;
            }
            Y1 y12 = y1Arr[i9];
            if (y12 instanceof C3071d2) {
                C3071d2 c3071d2 = (C3071d2) y12;
                if (c3071d2.f28771a.equals("TIT2")) {
                    UB ub = c3071d2.f29777c;
                    if (!ub.isEmpty()) {
                        str2 = (String) ub.get(0);
                        break;
                    }
                } else {
                    continue;
                }
            }
            i9++;
        }
        if (str2 != null) {
            new C3904sQ(null, str2);
        }
        this.f27914e = j9;
        this.f27915f = j10;
        this.f27916g = y1Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && U1.class == obj.getClass()) {
            U1 u12 = (U1) obj;
            if (this.f27912c == u12.f27912c && this.f27913d == u12.f27913d && this.f27914e == u12.f27914e && this.f27915f == u12.f27915f && Objects.equals(this.f27911b, u12.f27911b) && Arrays.equals(this.f27916g, u12.f27916g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f27911b.hashCode() + ((((((((this.f27912c + 527) * 31) + this.f27913d) * 31) + ((int) this.f27914e)) * 31) + ((int) this.f27915f)) * 31);
    }
}
