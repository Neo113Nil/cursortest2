package com.google.android.gms.internal.ads;

import java.util.Objects;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class X6 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f29265a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29266b;

    /* renamed from: c, reason: collision with root package name */
    public final C2977b2 f29267c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f29268d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29269e;

    /* renamed from: f, reason: collision with root package name */
    public final long f29270f;

    /* renamed from: g, reason: collision with root package name */
    public final long f29271g;

    /* renamed from: h, reason: collision with root package name */
    public final int f29272h;
    public final int i;

    static {
        String str = AbstractC3182eu.f30782a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public X6(Object obj, int i, C2977b2 c2977b2, Object obj2, int i4, long j6, long j9, int i6, int i9) {
        AbstractC2792Sd.i(i >= 0);
        AbstractC2792Sd.i(i4 >= 0);
        this.f29265a = obj;
        this.f29266b = i;
        this.f29267c = c2977b2;
        this.f29268d = obj2;
        this.f29269e = i4;
        this.f29270f = j6;
        this.f29271g = j9;
        this.f29272h = i6;
        this.i = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && X6.class == obj.getClass()) {
            X6 x62 = (X6) obj;
            if (this.f29266b == x62.f29266b && this.f29269e == x62.f29269e && this.f29270f == x62.f29270f && this.f29271g == x62.f29271g && this.f29272h == x62.f29272h && this.i == x62.i && Objects.equals(this.f29267c, x62.f29267c) && Objects.equals(this.f29265a, x62.f29265a) && Objects.equals(this.f29268d, x62.f29268d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f29265a, Integer.valueOf(this.f29266b), this.f29267c, this.f29268d, Integer.valueOf(this.f29269e), Long.valueOf(this.f29270f), Long.valueOf(this.f29271g), Integer.valueOf(this.f29272h), Integer.valueOf(this.i));
    }

    public final String toString() {
        int i = this.f29266b;
        int length = String.valueOf(i).length();
        int i4 = this.f29269e;
        int length2 = String.valueOf(i4).length();
        long j6 = this.f29270f;
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 6 + String.valueOf(j6).length());
        AbstractC5128c.g(sb, "mediaItem=", i, ", period=", i4);
        sb.append(", pos=");
        sb.append(j6);
        String sb2 = sb.toString();
        int i6 = this.f29272h;
        if (i6 == -1) {
            return sb2;
        }
        int length3 = sb2.length();
        long j9 = this.f29271g;
        int length4 = String.valueOf(i6).length() + length3 + 13 + String.valueOf(j9).length() + 10;
        int i9 = this.i;
        StringBuilder sb3 = new StringBuilder(length4 + 5 + String.valueOf(i9).length());
        sb3.append(sb2);
        sb3.append(", contentPos=");
        sb3.append(j9);
        return D.x.o(sb3, ", adGroup=", i6, ", ad=", i9);
    }
}
