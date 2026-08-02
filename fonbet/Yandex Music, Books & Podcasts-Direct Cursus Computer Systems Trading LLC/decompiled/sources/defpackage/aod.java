package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class aod {
    public final float[] a;
    public final int[] b;

    public aod(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public final void a(aod aodVar) {
        int i = 0;
        while (true) {
            int[] iArr = aodVar.b;
            if (i >= iArr.length) {
                return;
            }
            this.a[i] = aodVar.a[i];
            this.b[i] = iArr[i];
            i++;
        }
    }

    public final aod b(float[] fArr) {
        int D;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.a;
            int binarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.b;
            if (binarySearch >= 0) {
                D = iArr2[binarySearch];
            } else {
                int i2 = -(binarySearch + 1);
                if (i2 == 0) {
                    D = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    D = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    D = u2x.D(iArr2[i3], (f - f2) / (fArr2[i2] - f2), iArr2[i2]);
                }
            }
            iArr[i] = D;
        }
        return new aod(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || aod.class != obj.getClass()) {
            return false;
        }
        aod aodVar = (aod) obj;
        return Arrays.equals(this.a, aodVar.a) && Arrays.equals(this.b, aodVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }
}
