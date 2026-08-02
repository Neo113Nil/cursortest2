package defpackage;

/* loaded from: classes3.dex */
public final class sbh extends zdg {
    public final int b;
    public final boolean c;

    public sbh(int i, boolean z) {
        super(1);
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbh)) {
            return false;
        }
        sbh sbhVar = (sbh) obj;
        return this.b == sbhVar.b && this.c == sbhVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    @Override // defpackage.zdg
    public final String toString() {
        StringBuilder sb = new StringBuilder("Solid(color=");
        sb.append(this.b);
        sb.append(", isEnabled=");
        return dfi.j(sb, this.c, ')');
    }
}
