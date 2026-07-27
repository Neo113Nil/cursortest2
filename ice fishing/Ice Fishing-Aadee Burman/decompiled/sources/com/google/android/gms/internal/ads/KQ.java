package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes2.dex */
public final class KQ {

    /* renamed from: a, reason: collision with root package name */
    public final Random f25923a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f25924b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f25925c;

    public KQ() {
        this(new Random());
    }

    public final KQ a(int i) {
        Random random;
        int[] iArr;
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        int i6 = 0;
        while (true) {
            random = this.f25923a;
            iArr = this.f25924b;
            if (i6 >= i) {
                break;
            }
            iArr2[i6] = random.nextInt(iArr.length + 1);
            int i9 = i6 + 1;
            int nextInt = random.nextInt(i9);
            iArr3[i6] = iArr3[nextInt];
            iArr3[nextInt] = i6;
            i6 = i9;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < iArr.length + i; i12++) {
            if (i10 >= i || i11 != iArr2[i10]) {
                int i13 = i11 + 1;
                int i14 = iArr[i11];
                iArr4[i12] = i14;
                if (i14 >= 0) {
                    iArr4[i12] = i14 + i;
                }
                i11 = i13;
            } else {
                iArr4[i12] = iArr3[i10];
                i10++;
            }
        }
        return new KQ(iArr4, new Random(random.nextLong()));
    }

    public KQ(Random random) {
        this(new int[0], random);
    }

    public KQ(int[] iArr, Random random) {
        this.f25924b = iArr;
        this.f25923a = random;
        this.f25925c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f25925c[iArr[i]] = i;
        }
    }
}
