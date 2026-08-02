package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class y5j extends a6j {
    public final String a;
    public final String b;

    public y5j(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5j)) {
            return false;
        }
        y5j y5jVar = (y5j) obj;
        return this.a.equals(y5jVar.a) && this.b.equals(y5jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("CarPlate(mainPart=", this.a, ", region=", this.b, Extension.C_BRAKE);
    }
}
