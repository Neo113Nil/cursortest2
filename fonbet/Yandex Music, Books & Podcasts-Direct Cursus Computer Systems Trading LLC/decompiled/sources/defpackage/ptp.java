package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ptp {
    public final float[] a;
    public final float b;

    public ptp(float f, float[] fArr) {
        this.a = fArr;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ptp)) {
            return false;
        }
        ptp ptpVar = (ptp) obj;
        return this.b == ptpVar.b && Arrays.equals(this.a, ptpVar.a);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }
}
