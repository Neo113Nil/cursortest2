package androidx.graphics.shapes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class Cubic {
    public final float[] points;

    public Cubic(float[] fArr) {
        this.points = fArr;
        if (fArr.length == 8) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Points array size should be 8");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cubic)) {
            return false;
        }
        return Arrays.equals(this.points, ((Cubic) obj).points);
    }

    public final float getAnchor1X() {
        return this.points[6];
    }

    public final float getAnchor1Y() {
        return this.points[7];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.points);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("anchor0: (");
        float[] fArr = this.points;
        sb.append(fArr[0]);
        sb.append(", ");
        sb.append(fArr[1]);
        sb.append(") control0: (");
        sb.append(fArr[2]);
        sb.append(", ");
        sb.append(fArr[3]);
        sb.append("), control1: (");
        sb.append(fArr[4]);
        sb.append(", ");
        sb.append(fArr[5]);
        sb.append("), anchor1: (");
        sb.append(getAnchor1X());
        sb.append(", ");
        sb.append(getAnchor1Y());
        sb.append(')');
        return sb.toString();
    }
}
