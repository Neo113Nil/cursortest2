package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class qb {
    public final int GWasM1elztuh;
    public final int Yi7zF1RB1;

    public qb(int i, int i2) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb)) {
            return false;
        }
        qb qbVar = (qb) obj;
        return this.GWasM1elztuh == qbVar.GWasM1elztuh && this.Yi7zF1RB1 == qbVar.Yi7zF1RB1;
    }

    public final int hashCode() {
        return Integer.hashCode(this.Yi7zF1RB1) + (Integer.hashCode(this.GWasM1elztuh) * 31);
    }

    public final String toString() {
        return "CollectionInfo(rowCount=" + this.GWasM1elztuh + ", columnCount=" + this.Yi7zF1RB1 + ')';
    }
}
