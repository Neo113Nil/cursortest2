package defpackage;

/* loaded from: classes.dex */
public final class ayj extends ocg {
    public final ynn j;

    public ayj(ynn ynnVar) {
        this.j = ynnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ayj) {
            return this.j.equals(((ayj) obj).j);
        }
        return false;
    }

    public final int hashCode() {
        return this.j.hashCode();
    }
}
