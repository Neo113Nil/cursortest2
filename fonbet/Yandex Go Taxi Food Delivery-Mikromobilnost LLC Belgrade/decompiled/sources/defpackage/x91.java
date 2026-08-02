package defpackage;

import com.yandex.go.summary.ui.model.expanded.content.tariffcard.header.AddressesTextStyleUiState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class x91 {
    public final CharSequence a;
    public final CharSequence b;
    public final wp2 c;
    public final AddressesTextStyleUiState d;
    public final String e;

    public x91(CharSequence charSequence, CharSequence charSequence2, wp2 wp2Var, AddressesTextStyleUiState addressesTextStyleUiState, String str) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = wp2Var;
        this.d = addressesTextStyleUiState;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x91)) {
            return false;
        }
        x91 x91Var = (x91) obj;
        return this.a.equals(x91Var.a) && this.b.equals(x91Var.b) && jl40.l(this.c, x91Var.c) && this.d == x91Var.d && this.e.equals(x91Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + n.b(this.c, smw0.b(this.a.hashCode() * 31, 31, this.b), 31)) * 31);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "AddressesUiState(sourceAddressText=", ", destinationAddressText=", ", textColor=");
        r.append(this.c);
        r.append(", textStyleUiState=");
        r.append(this.d);
        r.append(", contentDescription=");
        return oyr.t(r, this.e, Extension.C_BRAKE);
    }
}
