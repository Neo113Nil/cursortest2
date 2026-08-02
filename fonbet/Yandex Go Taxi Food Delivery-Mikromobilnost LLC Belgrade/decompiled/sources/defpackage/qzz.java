package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class qzz implements szz {
    public final uzz a;

    public qzz(uzz uzzVar) {
        this.a = uzzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qzz) && jl40.l(this.a, ((qzz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Count(uiState=" + this.a + Extension.C_BRAKE;
    }
}
