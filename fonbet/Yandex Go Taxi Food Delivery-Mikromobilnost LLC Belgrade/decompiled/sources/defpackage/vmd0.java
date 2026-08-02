package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class vmd0 implements wu1 {
    public final String a;

    public vmd0(String str) {
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
        return (obj instanceof vmd0) && jl40.l(this.a, ((vmd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("PlusSubscriptionOptionGroup(alternativeType=", this.a, Extension.C_BRAKE);
    }
}
