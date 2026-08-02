package defpackage;

import defpackage.vb40;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class wh40 {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final vb40.m d;
    public final String e;

    public /* synthetic */ wh40(CharSequence charSequence, CharSequence charSequence2, vb40.m mVar, String str, int i) {
        this((CharSequence) null, (i & 2) != 0 ? null : charSequence, (i & 4) != 0 ? null : charSequence2, (i & 8) != 0 ? null : mVar, (i & 16) != 0 ? null : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh40)) {
            return false;
        }
        wh40 wh40Var = (wh40) obj;
        return jl40.l(this.a, wh40Var.a) && jl40.l(this.b, wh40Var.b) && jl40.l(this.c, wh40Var.c) && jl40.l(this.d, wh40Var.d) && jl40.l(this.e, wh40Var.e);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.c;
        int hashCode3 = (hashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        vb40.m mVar = this.d;
        int hashCode4 = (hashCode3 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        String str = this.e;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "MtTrainTariffState(tariffTitle=", ", tariff=", ", tariffDescription=");
        r.append((Object) this.c);
        r.append(", tariffInfoDialog=");
        r.append(this.d);
        r.append(", selectedTariffId=");
        return oyr.t(r, this.e, Extension.C_BRAKE);
    }

    public wh40(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, vb40.m mVar, String str) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = mVar;
        this.e = str;
    }

    public wh40() {
        this((CharSequence) null, (CharSequence) null, (vb40.m) null, (String) null, 31);
    }
}
