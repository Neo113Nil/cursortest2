package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class yha {
    public final String a;
    public final CharSequence b;
    public final wha c;
    public final xha d;
    public final List e;
    public final boolean f;
    public final boolean g;

    public yha(String str, CharSequence charSequence, wha whaVar, xha xhaVar, List list, boolean z, boolean z2) {
        this.a = str;
        this.b = charSequence;
        this.c = whaVar;
        this.d = xhaVar;
        this.e = list;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yha)) {
            return false;
        }
        yha yhaVar = (yha) obj;
        return jl40.l(this.a, yhaVar.a) && jl40.l(this.b, yhaVar.b) && jl40.l(this.c, yhaVar.c) && jl40.l(this.d, yhaVar.d) && jl40.l(this.e, yhaVar.e) && this.f == yhaVar.f && this.g == yhaVar.g;
    }

    public final int hashCode() {
        int b = smw0.b(this.a.hashCode() * 31, 31, this.b);
        wha whaVar = this.c;
        int hashCode = (b + (whaVar == null ? 0 : whaVar.hashCode())) * 31;
        xha xhaVar = this.d;
        return Boolean.hashCode(this.g) + unr0.e(unr0.c((hashCode + (xhaVar != null ? xhaVar.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "ChargersPassesPaymentSettingsUiState(passId=", this.a, ", title=", ", paymentMethod=");
        t.append(this.c);
        t.append(", renewal=");
        t.append(this.d);
        t.append(", buttons=");
        nzs.p(t, this.e, ", isLoading=", this.f, ", isShimmered=");
        return x4e.i(t, this.g, Extension.C_BRAKE);
    }
}
