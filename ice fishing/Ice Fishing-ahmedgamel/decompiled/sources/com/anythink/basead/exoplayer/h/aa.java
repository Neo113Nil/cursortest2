package com.anythink.basead.exoplayer.h;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public interface aa {

    public static class a implements aa {

        /* renamed from: a, reason: collision with root package name */
        private final Random f8244a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f8245b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f8246c;

        public a() {
            this(0, new Random());
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int a() {
            return this.f8245b.length;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int b(int i) {
            int i4 = this.f8246c[i] - 1;
            if (i4 >= 0) {
                return this.f8245b[i4];
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int c() {
            int[] iArr = this.f8245b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa d() {
            return new a(0, new Random(this.f8244a.nextLong()));
        }

        private a(int i, long j6) {
            this(i, new Random(j6));
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int a(int i) {
            int i4 = this.f8246c[i] + 1;
            int[] iArr = this.f8245b;
            if (i4 < iArr.length) {
                return iArr[i4];
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa c(int i) {
            int[] iArr = new int[this.f8245b.length - 1];
            int i4 = 0;
            boolean z6 = false;
            while (true) {
                int[] iArr2 = this.f8245b;
                if (i4 >= iArr2.length) {
                    return new a(iArr, new Random(this.f8244a.nextLong()));
                }
                int i6 = iArr2[i4];
                if (i6 == i) {
                    z6 = true;
                } else {
                    int i9 = z6 ? i4 - 1 : i4;
                    if (i6 > i) {
                        i6--;
                    }
                    iArr[i9] = i6;
                }
                i4++;
            }
        }

        private a(int i, Random random) {
            this(a(i, random), random);
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int b() {
            int[] iArr = this.f8245b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        private a(int[] iArr, Random random) {
            this.f8245b = iArr;
            this.f8244a = random;
            this.f8246c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f8246c[iArr[i]] = i;
            }
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa a(int i, int i4) {
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int i6 = 0;
            int i9 = 0;
            while (i9 < i4) {
                iArr[i9] = this.f8244a.nextInt(this.f8245b.length + 1);
                int i10 = i9 + 1;
                int nextInt = this.f8244a.nextInt(i10);
                iArr2[i9] = iArr2[nextInt];
                iArr2[nextInt] = i9 + i;
                i9 = i10;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f8245b.length + i4];
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int[] iArr4 = this.f8245b;
                if (i6 < iArr4.length + i4) {
                    if (i11 < i4 && i12 == iArr[i11]) {
                        iArr3[i6] = iArr2[i11];
                        i11++;
                    } else {
                        int i13 = i12 + 1;
                        int i14 = iArr4[i12];
                        iArr3[i6] = i14;
                        if (i14 >= i) {
                            iArr3[i6] = i14 + i4;
                        }
                        i12 = i13;
                    }
                    i6++;
                } else {
                    return new a(iArr3, new Random(this.f8244a.nextLong()));
                }
            }
        }

        private static int[] a(int i, Random random) {
            int[] iArr = new int[i];
            int i4 = 0;
            while (i4 < i) {
                int i6 = i4 + 1;
                int nextInt = random.nextInt(i6);
                iArr[i4] = iArr[nextInt];
                iArr[nextInt] = i4;
                i4 = i6;
            }
            return iArr;
        }
    }

    public static final class b implements aa {

        /* renamed from: a, reason: collision with root package name */
        private final int f8247a;

        public b(int i) {
            this.f8247a = i;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int a() {
            return this.f8247a;
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
            return this.f8247a > 0 ? 0 : -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa d() {
            return new b(0);
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int a(int i) {
            int i4 = i + 1;
            if (i4 < this.f8247a) {
                return i4;
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int b() {
            int i = this.f8247a;
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa c(int i) {
            return new b(this.f8247a - 1);
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa a(int i, int i4) {
            return new b(this.f8247a + i4);
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
