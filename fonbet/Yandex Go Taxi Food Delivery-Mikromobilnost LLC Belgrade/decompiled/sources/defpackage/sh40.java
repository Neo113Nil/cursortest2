package defpackage;

import defpackage.vb40;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class sh40 {
    public final vb40.m a;
    public final String b;
    public final fef c;

    public sh40(vb40.m mVar, String str, fef fefVar) {
        this.a = mVar;
        this.b = str;
        this.c = fefVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh40)) {
            return false;
        }
        sh40 sh40Var = (sh40) obj;
        return jl40.l(this.a, sh40Var.a) && jl40.l(this.b, sh40Var.b) && jl40.l(this.c, sh40Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        fef fefVar = this.c;
        return hashCode2 + (fefVar != null ? fefVar.hashCode() : 0);
    }

    public final String toString() {
        return "MtTrainTariffPayload(tariffInfoDialogDto=" + this.a + ", selectedTariffId=" + this.b + ", currencyRules=" + this.c + Extension.C_BRAKE;
    }
}
