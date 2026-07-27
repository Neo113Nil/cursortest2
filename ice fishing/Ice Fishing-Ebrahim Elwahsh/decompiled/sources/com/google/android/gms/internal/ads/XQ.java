package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes2.dex */
public final class XQ {

    /* renamed from: a, reason: collision with root package name */
    public final Random f28649a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f28650b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f28651c;

    public XQ() {
        this(new Random());
    }

    public final XQ a(int i) {
        Random random;
        int[] iArr;
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        int i4 = 0;
        while (true) {
            random = this.f28649a;
            iArr = this.f28650b;
            if (i4 >= i) {
                break;
            }
            iArr2[i4] = random.nextInt(iArr.length + 1);
            int i9 = i4 + 1;
            int nextInt = random.nextInt(i9);
            iArr3[i4] = iArr3[nextInt];
            iArr3[nextInt] = i4;
            i4 = i9;
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
        return new XQ(iArr4, new Random(random.nextLong()));
    }

    public XQ(Random random) {
        this(new int[0], random);
    }

    public XQ(int[] iArr, Random random) {
        this.f28650b = iArr;
        this.f28649a = random;
        this.f28651c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f28651c[iArr[i]] = i;
        }
    }
}
