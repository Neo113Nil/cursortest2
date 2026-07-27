package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class X6 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f28485a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28486b;

    /* renamed from: c, reason: collision with root package name */
    public final C2954b2 f28487c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f28488d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28489e;

    /* renamed from: f, reason: collision with root package name */
    public final long f28490f;

    /* renamed from: g, reason: collision with root package name */
    public final long f28491g;

    /* renamed from: h, reason: collision with root package name */
    public final int f28492h;
    public final int i;

    static {
        String str = AbstractC3159eu.f29993a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public X6(Object obj, int i, C2954b2 c2954b2, Object obj2, int i6, long j6, long j9, int i9, int i10) {
        AbstractC2772Sd.i(i >= 0);
        AbstractC2772Sd.i(i6 >= 0);
        this.f28485a = obj;
        this.f28486b = i;
        this.f28487c = c2954b2;
        this.f28488d = obj2;
        this.f28489e = i6;
        this.f28490f = j6;
        this.f28491g = j9;
        this.f28492h = i9;
        this.i = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && X6.class == obj.getClass()) {
            X6 x62 = (X6) obj;
            if (this.f28486b == x62.f28486b && this.f28489e == x62.f28489e && this.f28490f == x62.f28490f && this.f28491g == x62.f28491g && this.f28492h == x62.f28492h && this.i == x62.i && Objects.equals(this.f28487c, x62.f28487c) && Objects.equals(this.f28485a, x62.f28485a) && Objects.equals(this.f28488d, x62.f28488d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f28485a, Integer.valueOf(this.f28486b), this.f28487c, this.f28488d, Integer.valueOf(this.f28489e), Long.valueOf(this.f28490f), Long.valueOf(this.f28491g), Integer.valueOf(this.f28492h), Integer.valueOf(this.i));
    }

    public final String toString() {
        int i = this.f28486b;
        int length = String.valueOf(i).length();
        int i6 = this.f28489e;
        int length2 = String.valueOf(i6).length();
        long j6 = this.f28490f;
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 6 + String.valueOf(j6).length());
        u1.h.h(sb, "mediaItem=", i, ", period=", i6);
        sb.append(", pos=");
        sb.append(j6);
        String sb2 = sb.toString();
        int i9 = this.f28492h;
        if (i9 == -1) {
            return sb2;
        }
        int length3 = sb2.length();
        long j9 = this.f28491g;
        int length4 = String.valueOf(i9).length() + length3 + 13 + String.valueOf(j9).length() + 10;
        int i10 = this.i;
        StringBuilder sb3 = new StringBuilder(length4 + 5 + String.valueOf(i10).length());
        sb3.append(sb2);
        sb3.append(", contentPos=");
        sb3.append(j9);
        return D.y.r(sb3, ", adGroup=", i9, ", ad=", i10);
    }
}
