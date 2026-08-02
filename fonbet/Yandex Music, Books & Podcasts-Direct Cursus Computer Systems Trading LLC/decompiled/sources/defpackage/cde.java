package defpackage;

/* loaded from: classes.dex */
public final class cde {
    public final bde a;
    public final int b;

    public cde(bde bdeVar, int i) {
        this.a = bdeVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cde)) {
            return false;
        }
        cde cdeVar = (cde) obj;
        return this.a.equals(cdeVar.a) && this.b == cdeVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.a);
        sb.append(", configFlags=");
        return vz1.r(sb, this.b, ')');
    }
}
