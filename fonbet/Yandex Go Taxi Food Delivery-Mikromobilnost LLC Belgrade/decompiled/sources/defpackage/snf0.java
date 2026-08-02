package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class snf0 {
    public final Text.Constant a;
    public final rbv b;

    public snf0(Text.Constant constant, rbv rbvVar) {
        this.a = constant;
        this.b = rbvVar;
    }

    public final rbv a() {
        return this.b;
    }

    public final Text b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof snf0)) {
            return false;
        }
        snf0 snf0Var = (snf0) obj;
        return this.a.equals(snf0Var.a) && jl40.l(this.b, snf0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rbv rbvVar = this.b;
        return hashCode + (rbvVar == null ? 0 : rbvVar.hashCode());
    }

    public final String toString() {
        return "PromoInfoPoint(text=" + this.a + ", image=" + this.b + Extension.C_BRAKE;
    }
}
