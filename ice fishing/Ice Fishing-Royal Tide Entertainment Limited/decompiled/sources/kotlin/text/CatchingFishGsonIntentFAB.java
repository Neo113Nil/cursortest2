package kotlin.text;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishGsonIntentFAB implements CatchingFishToolbarOkHttp {
    public final float[] CatchingFishParcelableFAB;
    public final float[] CatchingFishSnackbar;

    public CatchingFishGsonIntentFAB(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.CatchingFishParcelableFAB = fArr;
        this.CatchingFishSnackbar = fArr2;
    }

    @Override // kotlin.text.CatchingFishToolbarOkHttp
    public final float CatchingFishParcelableFAB(float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float abs = Math.abs(f);
        float signum = Math.signum(f);
        float[] fArr = this.CatchingFishParcelableFAB;
        int binarySearch = Arrays.binarySearch(fArr, abs);
        float[] fArr2 = this.CatchingFishSnackbar;
        if (binarySearch >= 0) {
            f = fArr2[binarySearch];
        } else {
            int i = -(binarySearch + 1);
            int i2 = i - 1;
            if (i2 < fArr.length - 1) {
                if (i2 == -1) {
                    float f6 = fArr[0];
                    f4 = fArr2[0];
                    f5 = f6;
                    f3 = 0.0f;
                    f2 = 0.0f;
                } else {
                    float f7 = fArr[i2];
                    float f8 = fArr[i];
                    f2 = fArr2[i2];
                    f3 = f7;
                    f4 = fArr2[i];
                    f5 = f8;
                }
                return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (abs - f3) / (f5 - f3)))) + f2) * signum;
            }
            float f9 = fArr[fArr.length - 1];
            float f10 = fArr2[fArr.length - 1];
            if (f9 == 0.0f) {
                return 0.0f;
            }
            signum = f10 / f9;
        }
        return signum * f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CatchingFishGsonIntentFAB)) {
            return false;
        }
        CatchingFishGsonIntentFAB catchingFishGsonIntentFAB = (CatchingFishGsonIntentFAB) obj;
        return Arrays.equals(this.CatchingFishParcelableFAB, catchingFishGsonIntentFAB.CatchingFishParcelableFAB) && Arrays.equals(this.CatchingFishSnackbar, catchingFishGsonIntentFAB.CatchingFishSnackbar);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.CatchingFishSnackbar) + (Arrays.hashCode(this.CatchingFishParcelableFAB) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.CatchingFishParcelableFAB);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(arrays, "toString(...)");
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.CatchingFishSnackbar);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(arrays2, "toString(...)");
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
