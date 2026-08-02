package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes2.dex */
public final class NQ {

    /* renamed from: a, reason: collision with root package name */
    public final Random f27273a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f27274b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f27275c;

    public NQ() {
        this(new Random());
    }

    public final NQ a(int i) {
        Random random;
        int[] iArr;
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        int i4 = 0;
        while (true) {
            random = this.f27273a;
            iArr = this.f27274b;
            if (i4 >= i) {
                break;
            }
            iArr2[i4] = random.nextInt(iArr.length + 1);
            int i6 = i4 + 1;
            int nextInt = random.nextInt(i6);
            iArr3[i4] = iArr3[nextInt];
            iArr3[nextInt] = i4;
            i4 = i6;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i];
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < iArr.length + i; i11++) {
            if (i9 >= i || i10 != iArr2[i9]) {
                int i12 = i10 + 1;
                int i13 = iArr[i10];
                iArr4[i11] = i13;
                if (i13 >= 0) {
                    iArr4[i11] = i13 + i;
                }
                i10 = i12;
            } else {
                iArr4[i11] = iArr3[i9];
                i9++;
            }
        }
        return new NQ(iArr4, new Random(random.nextLong()));
    }

    public NQ(Random random) {
        this(new int[0], random);
    }

    public NQ(int[] iArr, Random random) {
        this.f27274b = iArr;
        this.f27273a = random;
        this.f27275c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f27275c[iArr[i]] = i;
        }
    }
}
