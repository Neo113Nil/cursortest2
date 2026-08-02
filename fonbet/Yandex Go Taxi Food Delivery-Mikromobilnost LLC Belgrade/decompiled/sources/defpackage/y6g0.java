package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class y6g0 {
    public final List a;
    public final Text.Constant b;
    public final Text.Constant c;
    public final rbv d;
    public final Text e;
    public final String f;

    public y6g0(List list, Text.Constant constant, Text.Constant constant2, rbv rbvVar, Text.Constant constant3, String str) {
        this.a = list;
        this.b = constant;
        this.c = constant2;
        this.d = rbvVar;
        this.e = constant3;
        this.f = str;
    }

    public final String a() {
        return this.f;
    }

    public final Text b() {
        return this.e;
    }

    public final Text c() {
        return this.c;
    }

    public final Text d() {
        return this.b;
    }

    public final rbv e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6g0)) {
            return false;
        }
        y6g0 y6g0Var = (y6g0) obj;
        return jl40.l(this.a, y6g0Var.a) && this.b.equals(y6g0Var.b) && this.c.equals(y6g0Var.c) && jl40.l(this.d, y6g0Var.d) && jl40.l(this.e, y6g0Var.e) && jl40.l(this.f, y6g0Var.f);
    }

    public final int hashCode() {
        int d = xvz.d(this.c, xvz.d(this.b, this.a.hashCode() * 31, 31), 31);
        rbv rbvVar = this.d;
        int hashCode = (d + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        Text text = this.e;
        int hashCode2 = (hashCode + (text == null ? 0 : text.hashCode())) * 31;
        String str = this.f;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "QrErrorMessage(categories=" + this.a + ", errorTitle=" + this.b + ", errorDescription=" + this.c + ", image=" + this.d + ", buttonText=" + this.e + ", buttonAction=" + this.f + Extension.C_BRAKE;
    }
}
