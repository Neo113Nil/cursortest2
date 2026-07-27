package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class A8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f23635a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23636b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23637c;

    /* renamed from: d, reason: collision with root package name */
    public final DP[] f23638d;

    /* renamed from: e, reason: collision with root package name */
    public int f23639e;

    static {
        String str = AbstractC3159eu.f29993a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public A8(String str, DP... dpArr) {
        int length = dpArr.length;
        int i = 1;
        AbstractC2772Sd.i(length > 0);
        this.f23636b = str;
        this.f23638d = dpArr;
        this.f23635a = length;
        String str2 = dpArr[0].f24431o;
        this.f23637c = TextUtils.isEmpty(str2) ? H4.f(dpArr[0].f24430n) : H4.f(str2);
        DP dp = dpArr[0];
        String str3 = dp.f24421d;
        str3 = (str3 == null || str3.equals(com.anythink.basead.exoplayer.b.ar)) ? "" : str3;
        int i6 = dp.f24423f | 16384;
        while (true) {
            DP[] dpArr2 = this.f23638d;
            if (i >= dpArr2.length) {
                return;
            }
            DP dp2 = dpArr2[i];
            String str4 = dp2.f24421d;
            if (!str3.equals((str4 == null || str4.equals(com.anythink.basead.exoplayer.b.ar)) ? "" : str4)) {
                a("languages", dpArr2[0].f24421d, str4, i);
                return;
            } else {
                if (i6 != (dp2.f24423f | 16384)) {
                    a("role flags", Integer.toBinaryString(dpArr2[0].f24423f), Integer.toBinaryString(this.f23638d[i].f24423f), i);
                    return;
                }
                i++;
            }
        }
    }

    public static void a(String str, String str2, String str3, int i) {
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(str.length() + 40 + length + 17 + length2 + 9 + String.valueOf(i).length() + 1);
        u1.h.i(sb, "Different ", str, " combined in one TrackGroup: '", str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i);
        sb.append(")");
        AbstractC2968bG.J("TrackGroup", "", new IllegalStateException(sb.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && A8.class == obj.getClass()) {
            A8 a82 = (A8) obj;
            if (this.f23636b.equals(a82.f23636b) && Arrays.equals(this.f23638d, a82.f23638d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f23639e;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f23638d) + ((this.f23636b.hashCode() + 527) * 31);
        this.f23639e = hashCode;
        return hashCode;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f23638d);
        String str = this.f23636b;
        return D.y.s(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(arrays).length()), str, ": ", arrays);
    }
}
