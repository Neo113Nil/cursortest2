package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class qnx0 implements wu1 {
    public final String a;

    public qnx0(String str) {
        this.a = str;
    }

    @Override // defpackage.wu1
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qnx0) && jl40.l(this.a, ((qnx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("TariffSelectorOptionGroup(alternativeType=", this.a, Extension.C_BRAKE);
    }
}
