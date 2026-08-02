package defpackage;

import com.ybsdk.core.common.domain.entities.ColoredTextEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class saf {
    public final String a;
    public final String b;
    public final String c;
    public final ColoredTextEntity d;
    public final ColoredTextEntity e;
    public final ColoredTextEntity f;
    public final rbv g;
    public final qaf h;
    public final raf i;

    public saf(String str, String str2, String str3, ColoredTextEntity coloredTextEntity, ColoredTextEntity coloredTextEntity2, ColoredTextEntity coloredTextEntity3, rbv rbvVar, qaf qafVar, raf rafVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = coloredTextEntity;
        this.e = coloredTextEntity2;
        this.f = coloredTextEntity3;
        this.g = rbvVar;
        this.h = qafVar;
        this.i = rafVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof saf)) {
            return false;
        }
        saf safVar = (saf) obj;
        return jl40.l(this.a, safVar.a) && jl40.l(this.b, safVar.b) && jl40.l(this.c, safVar.c) && this.d.equals(safVar.d) && jl40.l(this.e, safVar.e) && jl40.l(this.f, safVar.f) && jl40.l(this.g, safVar.g) && jl40.l(this.h, safVar.h) && jl40.l(this.i, safVar.i);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (this.d.hashCode() + unr0.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c)) * 31;
        ColoredTextEntity coloredTextEntity = this.e;
        int hashCode3 = (hashCode2 + (coloredTextEntity == null ? 0 : coloredTextEntity.hashCode())) * 31;
        ColoredTextEntity coloredTextEntity2 = this.f;
        int hashCode4 = (hashCode3 + (coloredTextEntity2 == null ? 0 : coloredTextEntity2.hashCode())) * 31;
        rbv rbvVar = this.g;
        int hashCode5 = (hashCode4 + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        qaf qafVar = this.h;
        int hashCode6 = (hashCode5 + (qafVar == null ? 0 : qafVar.a.hashCode())) * 31;
        raf rafVar = this.i;
        return hashCode6 + (rafVar != null ? rafVar.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CreditDepositPaymentMethodEntity(paymentMethodId=", this.a, ", clientSelectionId=", this.b, ", paymentMethodType=");
        v.append(this.c);
        v.append(", title=");
        v.append(this.d);
        v.append(", description=");
        v.append(this.e);
        v.append(", headerDescription=");
        v.append(this.f);
        v.append(", image=");
        v.append(this.g);
        v.append(", aftInfoEntity=");
        v.append(this.h);
        v.append(", walletInfoEntity=");
        v.append(this.i);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
