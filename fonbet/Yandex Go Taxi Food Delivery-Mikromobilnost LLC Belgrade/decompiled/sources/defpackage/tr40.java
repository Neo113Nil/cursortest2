package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes10.dex */
public final class tr40 implements ex1 {
    public final pex0 a;
    public final String b;
    public final String c;
    public final FormattedText d;
    public final List e;
    public final zzs f;
    public final zzs g;

    public tr40(pex0 pex0Var, String str, String str2, FormattedText formattedText, List list, zzs zzsVar, zzs zzsVar2) {
        this.a = pex0Var;
        this.b = str;
        this.c = str2;
        this.d = formattedText;
        this.e = list;
        this.f = zzsVar;
        this.g = zzsVar2;
    }

    @Override // defpackage.ex1
    public final pex0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr40)) {
            return false;
        }
        tr40 tr40Var = (tr40) obj;
        return this.a.equals(tr40Var.a) && this.b.equals(tr40Var.b) && jl40.l(this.c, tr40Var.c) && jl40.l(this.d, tr40Var.d) && jl40.l(this.e, tr40Var.e) && jl40.l(this.f, tr40Var.f) && jl40.l(this.g, tr40Var.g);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d.a);
        List list = this.e;
        int hashCode = (c + (list == null ? 0 : list.hashCode())) * 31;
        zzs zzsVar = this.f;
        int hashCode2 = (hashCode + (zzsVar == null ? 0 : zzsVar.hashCode())) * 31;
        zzs zzsVar2 = this.g;
        return hashCode2 + (zzsVar2 != null ? zzsVar2.hashCode() : 0);
    }

    public final String toString() {
        return "MultimodalOption(tariff=" + this.a + ", routeUri=" + this.b + ", multimodalOfferId=" + this.c + ", buttonText=" + this.d + ", routeParts=" + this.e + ", pickupPoint=" + this.f + ", dropoffPoint=" + this.g + Extension.C_BRAKE;
    }
}
