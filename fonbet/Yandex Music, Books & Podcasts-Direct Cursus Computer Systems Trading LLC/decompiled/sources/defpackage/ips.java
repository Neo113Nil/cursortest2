package defpackage;

/* loaded from: classes4.dex */
public final class ips extends kps {
    public final saf b;
    public final yhm c;

    public ips(saf safVar, yhm yhmVar) {
        super(yhmVar);
        this.b = safVar;
        this.c = yhmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ips)) {
            return false;
        }
        ips ipsVar = (ips) obj;
        return this.b.equals(ipsVar.b) && this.c.equals(ipsVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "Chosen(coverComposition=" + this.b + ", chosenRectangle=" + this.c + ")";
    }
}
