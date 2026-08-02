package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class tk4 implements fap {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public tk4(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
        } else {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        }
    }

    @Override // defpackage.fap
    public final eap e(long j) {
        long[] jArr = this.e;
        int e = dvt.e(jArr, j, true);
        long j2 = jArr[e];
        long[] jArr2 = this.c;
        iap iapVar = new iap(j2, jArr2[e]);
        if (j2 >= j || e == this.a - 1) {
            return new eap(iapVar, iapVar);
        }
        int i = e + 1;
        return new eap(iapVar, new iap(jArr[i], jArr2[i]));
    }

    @Override // defpackage.fap
    public final boolean g() {
        return true;
    }

    @Override // defpackage.fap
    public final long k() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
