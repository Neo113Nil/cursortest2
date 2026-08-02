package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.screens.registration.domain.OtpValidationResultEntity$Error$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ur80 implements wr80 {
    public final Text a;
    public final Text b;
    public final String c;
    public final OtpValidationResultEntity$Error$Type d;
    public final boolean e;

    public ur80(Text text, Text text2, String str, OtpValidationResultEntity$Error$Type otpValidationResultEntity$Error$Type, boolean z) {
        this.a = text;
        this.b = text2;
        this.c = str;
        this.d = otpValidationResultEntity$Error$Type;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur80)) {
            return false;
        }
        ur80 ur80Var = (ur80) obj;
        return jl40.l(this.a, ur80Var.a) && jl40.l(this.b, ur80Var.b) && jl40.l(this.c, ur80Var.c) && this.d == ur80Var.d && this.e == ur80Var.e;
    }

    public final int hashCode() {
        Text text = this.a;
        int hashCode = (text == null ? 0 : text.hashCode()) * 31;
        Text text2 = this.b;
        int hashCode2 = (hashCode + (text2 == null ? 0 : text2.hashCode())) * 31;
        String str = this.c;
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder p = n.p("Error(hint=", this.a, ", deprecatedHint=", this.b, ", supportUrl=");
        p.append(this.c);
        p.append(", type=");
        p.append(this.d);
        p.append(", noAttemptsLeft=");
        return x4e.i(p, this.e, Extension.C_BRAKE);
    }
}
