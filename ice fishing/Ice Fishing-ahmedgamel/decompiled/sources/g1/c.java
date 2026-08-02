package g1;

import a.AbstractC0426a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f37585a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f37586b;

    public c(float[] fArr, int[] iArr) {
        this.f37585a = fArr;
        this.f37586b = iArr;
    }

    public final void a(c cVar) {
        int i = 0;
        while (true) {
            int[] iArr = cVar.f37586b;
            if (i >= iArr.length) {
                return;
            }
            this.f37585a[i] = cVar.f37585a[i];
            this.f37586b[i] = iArr[i];
            i++;
        }
    }

    public final c b(float[] fArr) {
        int e9;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f2 = fArr[i];
            float[] fArr2 = this.f37585a;
            int binarySearch = Arrays.binarySearch(fArr2, f2);
            int[] iArr2 = this.f37586b;
            if (binarySearch >= 0) {
                e9 = iArr2[binarySearch];
            } else {
                int i4 = -(binarySearch + 1);
                if (i4 == 0) {
                    e9 = iArr2[0];
                } else if (i4 == iArr2.length - 1) {
                    e9 = iArr2[iArr2.length - 1];
                } else {
                    int i6 = i4 - 1;
                    float f9 = fArr2[i6];
                    e9 = AbstractC0426a.e(iArr2[i6], iArr2[i4], (f2 - f9) / (fArr2[i4] - f9));
                }
            }
            iArr[i] = e9;
        }
        return new c(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (Arrays.equals(this.f37585a, cVar.f37585a) && Arrays.equals(this.f37586b, cVar.f37586b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f37586b) + (Arrays.hashCode(this.f37585a) * 31);
    }
}
