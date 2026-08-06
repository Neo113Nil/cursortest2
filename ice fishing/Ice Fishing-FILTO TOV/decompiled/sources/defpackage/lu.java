package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class lu implements ju {
    public final float[] GWasM1elztuh;
    public final float[] Yi7zF1RB1;

    public lu(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            o4.mE4lRynR("Array lengths must match and be nonzero");
            throw null;
        }
        this.GWasM1elztuh = fArr;
        this.Yi7zF1RB1 = fArr2;
    }

    @Override // defpackage.ju
    public final float GWasM1elztuh(float f) {
        return vt.mOu10nynGul(f, this.Yi7zF1RB1, this.GWasM1elztuh);
    }

    @Override // defpackage.ju
    public final float Yi7zF1RB1(float f) {
        return vt.mOu10nynGul(f, this.GWasM1elztuh, this.Yi7zF1RB1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof lu)) {
            return false;
        }
        lu luVar = (lu) obj;
        return Arrays.equals(this.GWasM1elztuh, luVar.GWasM1elztuh) && Arrays.equals(this.Yi7zF1RB1, luVar.Yi7zF1RB1);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.Yi7zF1RB1) + (Arrays.hashCode(this.GWasM1elztuh) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.GWasM1elztuh);
        arrays.getClass();
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.Yi7zF1RB1);
        arrays2.getClass();
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
