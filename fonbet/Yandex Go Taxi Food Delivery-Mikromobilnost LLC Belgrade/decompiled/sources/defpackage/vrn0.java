package defpackage;

import com.yandex.go.scooters.ignition.panel.ScootersIgnitionPanelUiState$Banner$Action;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class vrn0 {
    public final String a;
    public final String b;
    public final CharSequence c;
    public final String d;
    public final ScootersIgnitionPanelUiState$Banner$Action e;
    public final urn0 f;

    public vrn0(String str, String str2, CharSequence charSequence, String str3, ScootersIgnitionPanelUiState$Banner$Action scootersIgnitionPanelUiState$Banner$Action, urn0 urn0Var) {
        this.a = str;
        this.b = str2;
        this.c = charSequence;
        this.d = str3;
        this.e = scootersIgnitionPanelUiState$Banner$Action;
        this.f = urn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrn0)) {
            return false;
        }
        vrn0 vrn0Var = (vrn0) obj;
        return jl40.l(this.a, vrn0Var.a) && jl40.l(this.b, vrn0Var.b) && jl40.l(this.c, vrn0Var.c) && jl40.l(this.d, vrn0Var.d) && this.e == vrn0Var.e && jl40.l(this.f, vrn0Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + unr0.b(smw0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        urn0 urn0Var = this.f;
        return hashCode + (urn0Var == null ? 0 : urn0Var.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("Banner(id=", this.a, ", imageTag=", this.b, ", title=");
        v.append((Object) this.c);
        v.append(", promotionId=");
        v.append(this.d);
        v.append(", action=");
        v.append(this.e);
        v.append(", badge=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
