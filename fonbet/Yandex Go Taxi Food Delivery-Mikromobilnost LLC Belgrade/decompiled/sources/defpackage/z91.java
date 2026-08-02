package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class z91 {
    public final y81 a;
    public final y81 b;

    public z91(y81 y81Var, y81 y81Var2) {
        this.a = y81Var;
        this.b = y81Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z91)) {
            return false;
        }
        z91 z91Var = (z91) obj;
        return this.a.equals(z91Var.a) && this.b.equals(z91Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AddressesUiState(sourceAddressUiState=" + this.a + ", destinationAddressUiState=" + this.b + Extension.C_BRAKE;
    }
}
