package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class saj0 {
    public final String a;
    public final List b;
    public final fef c;
    public final String d;
    public final String e;
    public final kci f;

    public saj0(String str, List list, fef fefVar, String str2, String str3, kci kciVar) {
        this.a = str;
        this.b = list;
        this.c = fefVar;
        this.d = str2;
        this.e = str3;
        this.f = kciVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof saj0)) {
            return false;
        }
        saj0 saj0Var = (saj0) obj;
        return jl40.l(this.a, saj0Var.a) && this.b.equals(saj0Var.b) && jl40.l(this.c, saj0Var.c) && jl40.l(this.d, saj0Var.d) && jl40.l(this.e, saj0Var.e) && jl40.l(this.f, saj0Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int c = unr0.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        fef fefVar = this.c;
        int b = unr0.b(unr0.b((c + (fefVar == null ? 0 : fefVar.hashCode())) * 31, 31, this.d), 31, this.e);
        kci kciVar = this.f;
        return b + (kciVar != null ? kciVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = xvz.r("RequiredAltChoiceUiState(caption=", this.a, ", options=", this.b, ", currencyRules=");
        r.append(this.c);
        r.append(", tariffClass=");
        r.append(this.d);
        r.append(", verticalId=");
        r.append(this.e);
        r.append(", deliveryIntervals=");
        r.append(this.f);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
