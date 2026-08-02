package com.anythink.basead.exoplayer.e.a;

import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7766a = 8192;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f7767a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f7768b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7769c;

        /* renamed from: d, reason: collision with root package name */
        public final long[] f7770d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f7771e;

        /* renamed from: f, reason: collision with root package name */
        public final long f7772f;

        public /* synthetic */ a(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j6, byte b9) {
            this(jArr, iArr, i, jArr2, iArr2, j6);
        }

        private a(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j6) {
            this.f7767a = jArr;
            this.f7768b = iArr;
            this.f7769c = i;
            this.f7770d = jArr2;
            this.f7771e = iArr2;
            this.f7772f = j6;
        }
    }

    private d() {
    }

    public static a a(int i, long[] jArr, int[] iArr, long j6) {
        int i4 = f7766a / i;
        int i6 = 0;
        for (int i9 : iArr) {
            i6 += af.a(i9, i4);
        }
        long[] jArr2 = new long[i6];
        int[] iArr2 = new int[i6];
        long[] jArr3 = new long[i6];
        int[] iArr3 = new int[i6];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            long j9 = jArr[i13];
            while (i14 > 0) {
                int min = Math.min(i4, i14);
                jArr2[i11] = j9;
                int i15 = i * min;
                iArr2[i11] = i15;
                i12 = Math.max(i12, i15);
                jArr3[i11] = i10 * j6;
                iArr3[i11] = 1;
                j9 += iArr2[i11];
                i10 += min;
                i14 -= min;
                i11++;
            }
        }
        return new a(jArr2, iArr2, i12, jArr3, iArr3, j6 * i10, (byte) 0);
    }
}
