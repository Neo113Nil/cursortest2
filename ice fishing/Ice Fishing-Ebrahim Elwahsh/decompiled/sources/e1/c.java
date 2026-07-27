package e1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f37240a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f37241b;

    public c(float[] fArr, int[] iArr) {
        this.f37240a = fArr;
        this.f37241b = iArr;
    }

    public final void a(c cVar) {
        int i = 0;
        while (true) {
            int[] iArr = cVar.f37241b;
            if (i >= iArr.length) {
                return;
            }
            this.f37240a[i] = cVar.f37240a[i];
            this.f37241b[i] = iArr[i];
            i++;
        }
    }

    public final c b(float[] fArr) {
        int L8;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f6 = fArr[i];
            float[] fArr2 = this.f37240a;
            int binarySearch = Arrays.binarySearch(fArr2, f6);
            int[] iArr2 = this.f37241b;
            if (binarySearch >= 0) {
                L8 = iArr2[binarySearch];
            } else {
                int i4 = -(binarySearch + 1);
                if (i4 == 0) {
                    L8 = iArr2[0];
                } else if (i4 == iArr2.length - 1) {
                    L8 = iArr2[iArr2.length - 1];
                } else {
                    int i9 = i4 - 1;
                    float f9 = fArr2[i9];
                    L8 = com.bumptech.glide.g.L(iArr2[i9], iArr2[i4], (f6 - f9) / (fArr2[i4] - f9));
                }
            }
            iArr[i] = L8;
        }
        return new c(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (Arrays.equals(this.f37240a, cVar.f37240a) && Arrays.equals(this.f37241b, cVar.f37241b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f37241b) + (Arrays.hashCode(this.f37240a) * 31);
    }
}
