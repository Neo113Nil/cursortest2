package com.anythink.basead.exoplayer.h;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public interface aa {

    public static class a implements aa {

        /* renamed from: a, reason: collision with root package name */
        private final Random f7458a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f7459b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f7460c;

        public a() {
            this(0, new Random());
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int a() {
            return this.f7459b.length;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int b(int i) {
            int i6 = this.f7460c[i] - 1;
            if (i6 >= 0) {
                return this.f7459b[i6];
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int c() {
            int[] iArr = this.f7459b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa d() {
            return new a(0, new Random(this.f7458a.nextLong()));
        }

        private a(int i, long j6) {
            this(i, new Random(j6));
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int a(int i) {
            int i6 = this.f7460c[i] + 1;
            int[] iArr = this.f7459b;
            if (i6 < iArr.length) {
                return iArr[i6];
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa c(int i) {
            int[] iArr = new int[this.f7459b.length - 1];
            int i6 = 0;
            boolean z3 = false;
            while (true) {
                int[] iArr2 = this.f7459b;
                if (i6 >= iArr2.length) {
                    return new a(iArr, new Random(this.f7458a.nextLong()));
                }
                int i9 = iArr2[i6];
                if (i9 == i) {
                    z3 = true;
                } else {
                    int i10 = z3 ? i6 - 1 : i6;
                    if (i9 > i) {
                        i9--;
                    }
                    iArr[i10] = i9;
                }
                i6++;
            }
        }

        private a(int i, Random random) {
            this(a(i, random), random);
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int b() {
            int[] iArr = this.f7459b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        private a(int[] iArr, Random random) {
            this.f7459b = iArr;
            this.f7458a = random;
            this.f7460c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f7460c[iArr[i]] = i;
            }
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa a(int i, int i6) {
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            int i9 = 0;
            int i10 = 0;
            while (i10 < i6) {
                iArr[i10] = this.f7458a.nextInt(this.f7459b.length + 1);
                int i11 = i10 + 1;
                int nextInt = this.f7458a.nextInt(i11);
                iArr2[i10] = iArr2[nextInt];
                iArr2[nextInt] = i10 + i;
                i10 = i11;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f7459b.length + i6];
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int[] iArr4 = this.f7459b;
                if (i9 < iArr4.length + i6) {
                    if (i12 < i6 && i13 == iArr[i12]) {
                        iArr3[i9] = iArr2[i12];
                        i12++;
                    } else {
                        int i14 = i13 + 1;
                        int i15 = iArr4[i13];
                        iArr3[i9] = i15;
                        if (i15 >= i) {
                            iArr3[i9] = i15 + i6;
                        }
                        i13 = i14;
                    }
                    i9++;
                } else {
                    return new a(iArr3, new Random(this.f7458a.nextLong()));
                }
            }
        }

        private static int[] a(int i, Random random) {
            int[] iArr = new int[i];
            int i6 = 0;
            while (i6 < i) {
                int i9 = i6 + 1;
                int nextInt = random.nextInt(i9);
                iArr[i6] = iArr[nextInt];
                iArr[nextInt] = i6;
                i6 = i9;
            }
            return iArr;
        }
    }

    public static final class b implements aa {

        /* renamed from: a, reason: collision with root package name */
        private final int f7461a;

        public b(int i) {
            this.f7461a = i;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int a() {
            return this.f7461a;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int b(int i) {
            int i6 = i - 1;
            if (i6 >= 0) {
                return i6;
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int c() {
            return this.f7461a > 0 ? 0 : -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa d() {
            return new b(0);
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int a(int i) {
            int i6 = i + 1;
            if (i6 < this.f7461a) {
                return i6;
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int b() {
            int i = this.f7461a;
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa c(int i) {
            return new b(this.f7461a - 1);
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa a(int i, int i6) {
            return new b(this.f7461a + i6);
        }
    }

    int a();

    int a(int i);

    aa a(int i, int i6);

    int b();

    int b(int i);

    int c();

    aa c(int i);

    aa d();
}
