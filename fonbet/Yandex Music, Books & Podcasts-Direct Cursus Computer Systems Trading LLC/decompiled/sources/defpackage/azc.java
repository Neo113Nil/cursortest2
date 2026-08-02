package defpackage;

/* loaded from: classes3.dex */
public final class azc {
    public final mhb a;
    public final boolean b;

    public azc(mhb mhbVar) {
        this.a = mhbVar;
        this.b = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azc)) {
            return false;
        }
        azc azcVar = (azc) obj;
        return this.a == azcVar.a && this.b == azcVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FunctionArgument(type=");
        sb.append(this.a);
        sb.append(", isVariadic=");
        return dfi.j(sb, this.b, ')');
    }

    public azc(mhb mhbVar, boolean z) {
        this.a = mhbVar;
        this.b = z;
    }
}
