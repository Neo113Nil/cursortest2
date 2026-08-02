package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class x840 {
    public final String a;
    public final String b;

    public x840(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x840)) {
            return false;
        }
        x840 x840Var = (x840) obj;
        return this.a.equals(x840Var.a) && jl40.l(this.b, x840Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("MtTicketsRouteInformationPopupUiState(title=", this.a, ", description=", this.b, Extension.C_BRAKE);
    }
}
