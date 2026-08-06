package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class kl {
    public final long GWasM1elztuh;
    public final long Yi7zF1RB1;

    public kl(long j, long j2) {
        this.GWasM1elztuh = j;
        this.Yi7zF1RB1 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl)) {
            return false;
        }
        kl klVar = (kl) obj;
        return b30.GWasM1elztuh(this.GWasM1elztuh, klVar.GWasM1elztuh) && this.Yi7zF1RB1 == klVar.Yi7zF1RB1;
    }

    public final int hashCode() {
        return Long.hashCode(this.Yi7zF1RB1) + (Long.hashCode(this.GWasM1elztuh) * 31);
    }
}
