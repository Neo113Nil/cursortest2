package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class y4v {
    public final v4v a;
    public final b5v b;
    public final y7m c;

    public y4v(v4v v4vVar, b5v b5vVar, y7m y7mVar) {
        this.a = v4vVar;
        this.b = b5vVar;
        this.c = y7mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4v)) {
            return false;
        }
        y4v y4vVar = (y4v) obj;
        return jl40.l(this.a, y4vVar.a) && jl40.l(this.b, y4vVar.b) && jl40.l(this.c, y4vVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b5v b5vVar = this.b;
        int hashCode2 = (hashCode + (b5vVar == null ? 0 : b5vVar.hashCode())) * 31;
        y7m y7mVar = this.c;
        return hashCode2 + (y7mVar != null ? Float.hashCode(y7mVar.a) : 0);
    }

    public final String toString() {
        return "IconSpot(icon=" + this.a + ", background=" + this.b + ", cornerRadius=" + this.c + Extension.C_BRAKE;
    }
}
