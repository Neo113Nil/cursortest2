package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class A8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f24415a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24416b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24417c;

    /* renamed from: d, reason: collision with root package name */
    public final DP[] f24418d;

    /* renamed from: e, reason: collision with root package name */
    public int f24419e;

    static {
        String str = AbstractC3182eu.f30782a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public A8(String str, DP... dpArr) {
        int length = dpArr.length;
        int i = 1;
        AbstractC2792Sd.i(length > 0);
        this.f24416b = str;
        this.f24418d = dpArr;
        this.f24415a = length;
        String str2 = dpArr[0].f25176o;
        this.f24417c = TextUtils.isEmpty(str2) ? H4.f(dpArr[0].f25175n) : H4.f(str2);
        DP dp = dpArr[0];
        String str3 = dp.f25166d;
        str3 = (str3 == null || str3.equals(com.anythink.basead.exoplayer.b.ar)) ? "" : str3;
        int i4 = dp.f25168f | 16384;
        while (true) {
            DP[] dpArr2 = this.f24418d;
            if (i >= dpArr2.length) {
                return;
            }
            DP dp2 = dpArr2[i];
            String str4 = dp2.f25166d;
            if (!str3.equals((str4 == null || str4.equals(com.anythink.basead.exoplayer.b.ar)) ? "" : str4)) {
                a("languages", dpArr2[0].f25166d, str4, i);
                return;
            } else {
                if (i4 != (dp2.f25168f | 16384)) {
                    a("role flags", Integer.toBinaryString(dpArr2[0].f25168f), Integer.toBinaryString(this.f24418d[i].f25168f), i);
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
        AbstractC5128c.h(sb, "Different ", str, " combined in one TrackGroup: '", str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i);
        sb.append(")");
        AbstractC2991bG.J("TrackGroup", "", new IllegalStateException(sb.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && A8.class == obj.getClass()) {
            A8 a82 = (A8) obj;
            if (this.f24416b.equals(a82.f24416b) && Arrays.equals(this.f24418d, a82.f24418d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f24419e;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f24418d) + ((this.f24416b.hashCode() + 527) * 31);
        this.f24419e = hashCode;
        return hashCode;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f24418d);
        String str = this.f24416b;
        return D.x.p(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(arrays).length()), str, ": ", arrays);
    }
}
