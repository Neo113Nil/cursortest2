package defpackage;

import com.ybsdk.feature.autotopup.internal.domain.entities.regular.RegularAutotopupStatusEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class zri0 {
    public final RegularAutotopupStatusEntity a;
    public final String b;
    public final String c;
    public final h5a0 d;
    public final giq0 e;
    public final String f;

    public zri0(RegularAutotopupStatusEntity regularAutotopupStatusEntity, String str, String str2, h5a0 h5a0Var, giq0 giq0Var, String str3) {
        this.a = regularAutotopupStatusEntity;
        this.b = str;
        this.c = str2;
        this.d = h5a0Var;
        this.e = giq0Var;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zri0)) {
            return false;
        }
        zri0 zri0Var = (zri0) obj;
        return this.a == zri0Var.a && jl40.l(this.b, zri0Var.b) && jl40.l(this.c, zri0Var.c) && jl40.l(this.d, zri0Var.d) && this.e.equals(zri0Var.e) && jl40.l(this.f, zri0Var.f);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.f;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "RegularAutoTopupSettings(status=" + this.a + ", agreementId=" + this.b + ", operationId=" + this.c + ", paymentMethod=" + this.d + ", selectedOption=" + this.e + ", verificationToken=" + this.f + Extension.C_BRAKE;
    }
}
