package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class wxo0 {
    public final CharSequence a;
    public final CharSequence b;
    public final vxo0 c;
    public final vxo0 d;

    public wxo0(CharSequence charSequence, CharSequence charSequence2, vxo0 vxo0Var, vxo0 vxo0Var2) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = vxo0Var;
        this.d = vxo0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxo0)) {
            return false;
        }
        wxo0 wxo0Var = (wxo0) obj;
        return jl40.l(this.a, wxo0Var.a) && jl40.l(this.b, wxo0Var.b) && this.c.equals(wxo0Var.c) && jl40.l(this.d, wxo0Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b)) * 31;
        vxo0 vxo0Var = this.d;
        return hashCode + (vxo0Var == null ? 0 : vxo0Var.hashCode());
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "ScootersSubscriptionPurchaseInfoUiState(title=", ", description=", ", confirmButton=");
        r.append(this.c);
        r.append(", rejectButton=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
