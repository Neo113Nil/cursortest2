package defpackage;

/* loaded from: classes6.dex */
public final class rdr {
    public final boolean a;
    public final boolean b;

    public rdr(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdr)) {
            return false;
        }
        rdr rdrVar = (rdr) obj;
        return this.a == rdrVar.a && this.b == rdrVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(willPlayWhenReady=");
        sb.append(this.a);
        sb.append(", isLoading=");
        return dfi.j(sb, this.b, ')');
    }
}
