package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class wdv0 {
    public final String a;
    public final n7v b;

    public wdv0(String str, n7v n7vVar) {
        this.a = str;
        this.b = n7vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdv0)) {
            return false;
        }
        wdv0 wdv0Var = (wdv0) obj;
        return jl40.l(this.a, wdv0Var.a) && jl40.l(this.b, wdv0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        n7v n7vVar = this.b;
        return hashCode + (n7vVar == null ? 0 : n7vVar.hashCode());
    }

    public final String toString() {
        return "SummaryBubble(text=" + this.a + ", image=" + this.b + Extension.C_BRAKE;
    }
}
