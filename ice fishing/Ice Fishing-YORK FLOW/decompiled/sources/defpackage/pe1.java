package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class pe1 {
    public int[] JhCgjQRTAOCT;
    public int WDYagTQQm9ns;
    public int ZpBGe2uQfcn8;
    public int[] fWTAfUmVKrZq;
    public long[] giKS3J6vZuNy;

    public final int ZpBGe2uQfcn8(long j) {
        int i = this.ZpBGe2uQfcn8 + 1;
        long[] jArr = this.giKS3J6vZuNy;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            defpackage.y7.omM9cAlgeGXx(jArr, jArr2, 0, 0, jArr.length);
            defpackage.y7.m6iZQUu7XjoL(this.fWTAfUmVKrZq, iArr, 0, 0, 14);
            this.giKS3J6vZuNy = jArr2;
            this.fWTAfUmVKrZq = iArr;
        }
        int i3 = this.ZpBGe2uQfcn8;
        this.ZpBGe2uQfcn8 = i3 + 1;
        int length2 = this.JhCgjQRTAOCT.length;
        if (this.WDYagTQQm9ns >= length2) {
            int i4 = length2 * 2;
            int[] iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            defpackage.y7.m6iZQUu7XjoL(this.JhCgjQRTAOCT, iArr2, 0, 0, 14);
            this.JhCgjQRTAOCT = iArr2;
        }
        int i7 = this.WDYagTQQm9ns;
        int[] iArr3 = this.JhCgjQRTAOCT;
        this.WDYagTQQm9ns = iArr3[i7];
        long[] jArr3 = this.giKS3J6vZuNy;
        jArr3[i3] = j;
        this.fWTAfUmVKrZq[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (defpackage.ma0.h3m55N1URyyK(jArr3[i8], j) <= 0) {
                break;
            }
            giKS3J6vZuNy(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    public final void giKS3J6vZuNy(int i, int i2) {
        long[] jArr = this.giKS3J6vZuNy;
        int[] iArr = this.fWTAfUmVKrZq;
        int[] iArr2 = this.JhCgjQRTAOCT;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }
}
