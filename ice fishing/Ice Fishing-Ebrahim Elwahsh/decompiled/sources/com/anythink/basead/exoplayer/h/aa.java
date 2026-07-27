package com.anythink.basead.exoplayer.h;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public interface aa {

    public static class a implements aa {

        /* renamed from: a, reason: collision with root package name */
        private final Random f7615a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f7616b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f7617c;

        public a() {
            this(0, new Random());
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int a() {
            return this.f7616b.length;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int b(int i) {
            int i4 = this.f7617c[i] - 1;
            if (i4 >= 0) {
                return this.f7616b[i4];
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int c() {
            int[] iArr = this.f7616b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa d() {
            return new a(0, new Random(this.f7615a.nextLong()));
        }

        private a(int i, long j9) {
            this(i, new Random(j9));
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int a(int i) {
            int i4 = this.f7617c[i] + 1;
            int[] iArr = this.f7616b;
            if (i4 < iArr.length) {
                return iArr[i4];
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa c(int i) {
            int[] iArr = new int[this.f7616b.length - 1];
            int i4 = 0;
            boolean z8 = false;
            while (true) {
                int[] iArr2 = this.f7616b;
                if (i4 >= iArr2.length) {
                    return new a(iArr, new Random(this.f7615a.nextLong()));
                }
                int i9 = iArr2[i4];
                if (i9 == i) {
                    z8 = true;
                } else {
                    int i10 = z8 ? i4 - 1 : i4;
                    if (i9 > i) {
                        i9--;
                    }
                    iArr[i10] = i9;
                }
                i4++;
            }
        }

        private a(int i, Random random) {
            this(a(i, random), random);
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int b() {
            int[] iArr = this.f7616b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        private a(int[] iArr, Random random) {
            this.f7616b = iArr;
            this.f7615a = random;
            this.f7617c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f7617c[iArr[i]] = i;
            }
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa a(int i, int i4) {
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int i9 = 0;
            int i10 = 0;
            while (i10 < i4) {
                iArr[i10] = this.f7615a.nextInt(this.f7616b.length + 1);
                int i11 = i10 + 1;
                int nextInt = this.f7615a.nextInt(i11);
                iArr2[i10] = iArr2[nextInt];
                iArr2[nextInt] = i10 + i;
                i10 = i11;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f7616b.length + i4];
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int[] iArr4 = this.f7616b;
                if (i9 < iArr4.length + i4) {
                    if (i12 < i4 && i13 == iArr[i12]) {
                        iArr3[i9] = iArr2[i12];
                        i12++;
                    } else {
                        int i14 = i13 + 1;
                        int i15 = iArr4[i13];
                        iArr3[i9] = i15;
                        if (i15 >= i) {
                            iArr3[i9] = i15 + i4;
                        }
                        i13 = i14;
                    }
                    i9++;
                } else {
                    return new a(iArr3, new Random(this.f7615a.nextLong()));
                }
            }
        }

        private static int[] a(int i, Random random) {
            int[] iArr = new int[i];
            int i4 = 0;
            while (i4 < i) {
                int i9 = i4 + 1;
                int nextInt = random.nextInt(i9);
                iArr[i4] = iArr[nextInt];
                iArr[nextInt] = i4;
                i4 = i9;
            }
            return iArr;
        }
    }

    public static final class b implements aa {

        /* renamed from: a, reason: collision with root package name */
        private final int f7618a;

        public b(int i) {
            this.f7618a = i;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int a() {
            return this.f7618a;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int b(int i) {
            int i4 = i - 1;
            if (i4 >= 0) {
                return i4;
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int c() {
            return this.f7618a > 0 ? 0 : -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa d() {
            return new b(0);
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int a(int i) {
            int i4 = i + 1;
            if (i4 < this.f7618a) {
                return i4;
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int b() {
            int i = this.f7618a;
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa c(int i) {
            return new b(this.f7618a - 1);
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa a(int i, int i4) {
            return new b(this.f7618a + i4);
        }
    }

    int a();

    int a(int i);

    aa a(int i, int i4);

    int b();

    int b(int i);

    int c();

    aa c(int i);

    aa d();
}
