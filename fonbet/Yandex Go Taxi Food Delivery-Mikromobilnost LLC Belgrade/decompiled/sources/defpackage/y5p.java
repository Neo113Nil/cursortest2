package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class y5p {
    public static final x5p Companion = new x5p();
    public final String a;
    public final String b;

    public /* synthetic */ y5p(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, w5p.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5p)) {
            return false;
        }
        y5p y5pVar = (y5p) obj;
        return jl40.l(this.a, y5pVar.a) && jl40.l(this.b, y5pVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("FTGenUUIDNode(template=", this.a, ", pattern=", this.b, Extension.C_BRAKE);
    }
}
