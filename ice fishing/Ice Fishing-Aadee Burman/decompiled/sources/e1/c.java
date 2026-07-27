package e1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f37109a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f37110b;

    public c(float[] fArr, int[] iArr) {
        this.f37109a = fArr;
        this.f37110b = iArr;
    }

    public final void a(c cVar) {
        int i = 0;
        while (true) {
            int[] iArr = cVar.f37110b;
            if (i >= iArr.length) {
                return;
            }
            this.f37109a[i] = cVar.f37109a[i];
            this.f37110b[i] = iArr[i];
            i++;
        }
    }

    public final c b(float[] fArr) {
        int l9;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f3 = fArr[i];
            float[] fArr2 = this.f37109a;
            int binarySearch = Arrays.binarySearch(fArr2, f3);
            int[] iArr2 = this.f37110b;
            if (binarySearch >= 0) {
                l9 = iArr2[binarySearch];
            } else {
                int i6 = -(binarySearch + 1);
                if (i6 == 0) {
                    l9 = iArr2[0];
                } else if (i6 == iArr2.length - 1) {
                    l9 = iArr2[iArr2.length - 1];
                } else {
                    int i9 = i6 - 1;
                    float f9 = fArr2[i9];
                    l9 = O3.b.l(iArr2[i9], iArr2[i6], (f3 - f9) / (fArr2[i6] - f9));
                }
            }
            iArr[i] = l9;
        }
        return new c(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (Arrays.equals(this.f37109a, cVar.f37109a) && Arrays.equals(this.f37110b, cVar.f37110b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f37110b) + (Arrays.hashCode(this.f37109a) * 31);
    }
}
