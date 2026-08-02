package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class r implements InterfaceC3780q {

    /* renamed from: a, reason: collision with root package name */
    public final A8 f34215a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34216b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f34217c;

    /* renamed from: d, reason: collision with root package name */
    public final DP[] f34218d;

    /* renamed from: e, reason: collision with root package name */
    public int f34219e;

    public r(A8 a82, int[] iArr) {
        DP[] dpArr;
        int length = iArr.length;
        AbstractC2792Sd.H(length > 0);
        a82.getClass();
        this.f34215a = a82;
        this.f34216b = length;
        this.f34218d = new DP[length];
        int i = 0;
        while (true) {
            int length2 = iArr.length;
            dpArr = a82.f24418d;
            if (i >= length2) {
                break;
            }
            this.f34218d[i] = dpArr[iArr[i]];
            i++;
        }
        Arrays.sort(this.f34218d, C3027c.f30175K);
        this.f34217c = new int[this.f34216b];
        for (int i4 = 0; i4 < this.f34216b; i4++) {
            int[] iArr2 = this.f34217c;
            DP dp = this.f34218d[i4];
            int i6 = 0;
            while (true) {
                if (i6 >= dpArr.length) {
                    i6 = -1;
                    break;
                } else if (dp == dpArr[i6]) {
                    break;
                } else {
                    i6++;
                }
            }
            iArr2[i4] = i6;
        }
    }

    public static void a(ArrayList arrayList, long[] jArr) {
        long j6 = 0;
        for (int i = 0; i < 2; i++) {
            j6 += jArr[i];
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            OB ob = (OB) arrayList.get(i4);
            if (ob != null) {
                ob.a(new UQ(j6, jArr[i4]));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3780q
    public final A8 c() {
        return this.f34215a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3780q
    public final int d() {
        return this.f34217c.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f34215a.equals(rVar.f34215a) && Arrays.equals(this.f34217c, rVar.f34217c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3780q
    public final int g() {
        return this.f34217c[0];
    }

    public final int hashCode() {
        int i = this.f34219e;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f34217c) + (System.identityHashCode(this.f34215a) * 31);
        this.f34219e = hashCode;
        return hashCode;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3780q
    public final DP i() {
        return this.f34218d[0];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3780q
    public final int j0(int i) {
        for (int i4 = 0; i4 < this.f34216b; i4++) {
            if (this.f34217c[i4] == i) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3780q
    public final int v(int i) {
        return this.f34217c[i];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3780q
    public final DP x(int i) {
        return this.f34218d[i];
    }
}
