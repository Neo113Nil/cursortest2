package defpackage;

import com.ybsdk.feature.savings.internal.entities.SavingsAccountCreationStatusEntity$Status;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class u4m0 {
    public final String a;
    public final SavingsAccountCreationStatusEntity$Status b;
    public final String c;
    public final String d;
    public final fxy0 e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public u4m0(String str, SavingsAccountCreationStatusEntity$Status savingsAccountCreationStatusEntity$Status, String str2, String str3, fxy0 fxy0Var, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = savingsAccountCreationStatusEntity$Status;
        this.c = str2;
        this.d = str3;
        this.e = fxy0Var;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4m0)) {
            return false;
        }
        u4m0 u4m0Var = (u4m0) obj;
        return jl40.l(this.a, u4m0Var.a) && this.b == u4m0Var.b && jl40.l(this.c, u4m0Var.c) && jl40.l(this.d, u4m0Var.d) && jl40.l(this.e, u4m0Var.e) && jl40.l(this.f, u4m0Var.f) && jl40.l(this.g, u4m0Var.g) && jl40.l(this.h, u4m0Var.h) && jl40.l(this.i, u4m0Var.i);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        fxy0 fxy0Var = this.e;
        int hashCode4 = (hashCode3 + (fxy0Var == null ? 0 : fxy0Var.hashCode())) * 31;
        String str3 = this.f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        return hashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingsAccountCreationStatusEntity(requestId=");
        sb.append(this.a);
        sb.append(", requestStatus=");
        sb.append(this.b);
        sb.append(", statusTitle=");
        g8e.D(sb, this.c, ", statusSubtitle=", this.d, ", statusImage=");
        sb.append(this.e);
        sb.append(", processingStatusTitle=");
        sb.append(this.f);
        sb.append(", processingStatusSubtitle=");
        g8e.D(sb, this.g, ", supportUrl=", this.h, ", agreementId=");
        return oyr.t(sb, this.i, Extension.C_BRAKE);
    }
}
