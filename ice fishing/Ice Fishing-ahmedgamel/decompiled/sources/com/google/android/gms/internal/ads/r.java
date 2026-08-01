package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class r implements InterfaceC3757q {

    /* renamed from: a, reason: collision with root package name */
    public final A8 f33448a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33449b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f33450c;

    /* renamed from: d, reason: collision with root package name */
    public final DP[] f33451d;

    /* renamed from: e, reason: collision with root package name */
    public int f33452e;

    public r(A8 a82, int[] iArr) {
        DP[] dpArr;
        int length = iArr.length;
        AbstractC2772Sd.H(length > 0);
        a82.getClass();
        this.f33448a = a82;
        this.f33449b = length;
        this.f33451d = new DP[length];
        int i = 0;
        while (true) {
            int length2 = iArr.length;
            dpArr = a82.f23638d;
            if (i >= length2) {
                break;
            }
            this.f33451d[i] = dpArr[iArr[i]];
            i++;
        }
        Arrays.sort(this.f33451d, C3004c.f29392K);
        this.f33450c = new int[this.f33449b];
        for (int i6 = 0; i6 < this.f33449b; i6++) {
            int[] iArr2 = this.f33450c;
            DP dp = this.f33451d[i6];
            int i9 = 0;
            while (true) {
                if (i9 >= dpArr.length) {
                    i9 = -1;
                    break;
                } else if (dp == dpArr[i9]) {
                    break;
                } else {
                    i9++;
                }
            }
            iArr2[i6] = i9;
        }
    }

    public static void a(ArrayList arrayList, long[] jArr) {
        long j6 = 0;
        for (int i = 0; i < 2; i++) {
            j6 += jArr[i];
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            OB ob = (OB) arrayList.get(i6);
            if (ob != null) {
                ob.a(new RQ(j6, jArr[i6]));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3757q
    public final A8 c() {
        return this.f33448a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3757q
    public final int d() {
        return this.f33450c.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f33448a.equals(rVar.f33448a) && Arrays.equals(this.f33450c, rVar.f33450c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3757q
    public final int g() {
        return this.f33450c[0];
    }

    public final int hashCode() {
        int i = this.f33452e;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f33450c) + (System.identityHashCode(this.f33448a) * 31);
        this.f33452e = hashCode;
        return hashCode;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3757q
    public final DP i() {
        return this.f33451d[0];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3757q
    public final int j0(int i) {
        for (int i6 = 0; i6 < this.f33449b; i6++) {
            if (this.f33450c[i6] == i) {
                return i6;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3757q
    public final int v(int i) {
        return this.f33450c[i];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3757q
    public final DP x(int i) {
        return this.f33451d[i];
    }
}
