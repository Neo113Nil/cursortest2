package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class fi {
    public long GWasM1elztuh;
    public float Yi7zF1RB1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi)) {
            return false;
        }
        fi fiVar = (fi) obj;
        return this.GWasM1elztuh == fiVar.GWasM1elztuh && Float.compare(this.Yi7zF1RB1, fiVar.Yi7zF1RB1) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.Yi7zF1RB1) + (Long.hashCode(this.GWasM1elztuh) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.GWasM1elztuh);
        sb.append(", dataPoint=");
        return mr0.JFJ3QoxA(sb, this.Yi7zF1RB1, ')');
    }
}
