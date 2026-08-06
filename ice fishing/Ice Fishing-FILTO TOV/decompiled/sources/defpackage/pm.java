package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class pm {
    public final String GWasM1elztuh;
    public final int X1lG3V04pd;
    public final int Yi7zF1RB1;

    public pm(int i, int i2, String str) {
        this.GWasM1elztuh = str;
        this.Yi7zF1RB1 = i;
        this.X1lG3V04pd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm)) {
            return false;
        }
        pm pmVar = (pm) obj;
        return this.GWasM1elztuh.equals(pmVar.GWasM1elztuh) && this.Yi7zF1RB1 == pmVar.Yi7zF1RB1 && this.X1lG3V04pd == pmVar.X1lG3V04pd;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.Yi7zF1RB1);
        Integer valueOf2 = Integer.valueOf(this.X1lG3V04pd);
        Float valueOf3 = Float.valueOf(1.0f);
        return Objects.hash(this.GWasM1elztuh, valueOf, valueOf2, valueOf3, 0, 0, 0, valueOf3);
    }

    public final String toString() {
        return "DisplayShapeCompat{ spec=" + Integer.valueOf(this.GWasM1elztuh.hashCode()) + " displayWidth=" + this.Yi7zF1RB1 + " displayHeight=" + this.X1lG3V04pd + " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}";
    }
}
