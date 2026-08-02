package defpackage;

/* loaded from: classes.dex */
public final class psk {
    public final long a;
    public final long b;
    public final int c;

    public psk(int i, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = i;
        les[] lesVarArr = kes.b;
        if ((j & 1095216660480L) == 0) {
            tme.a("width cannot be TextUnit.Unspecified");
        }
        if ((j2 & 1095216660480L) == 0) {
            tme.a("height cannot be TextUnit.Unspecified");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psk)) {
            return false;
        }
        psk pskVar = (psk) obj;
        return kes.a(this.a, pskVar.a) && kes.a(this.b, pskVar.b) && this.c == pskVar.c;
    }

    public final int hashCode() {
        les[] lesVarArr = kes.b;
        return Integer.hashCode(this.c) + tlm.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Placeholder(width=");
        sb.append((Object) kes.d(this.a));
        sb.append(", height=");
        sb.append((Object) kes.d(this.b));
        sb.append(", placeholderVerticalAlign=");
        int i = this.c;
        sb.append((Object) (i == 1 ? "AboveBaseline" : i == 2 ? "Top" : i == 3 ? "Bottom" : i == 4 ? "Center" : i == 5 ? "TextTop" : i == 6 ? "TextBottom" : i == 7 ? "TextCenter" : "Invalid"));
        sb.append(')');
        return sb.toString();
    }
}
