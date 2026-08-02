package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class tbg0 {
    public final Text.Constant a;
    public final Text.Constant b;
    public final rbv c;
    public final Text d;
    public final pdq0 e;

    public tbg0(Text.Constant constant, Text.Constant constant2, rbv rbvVar, Text text, pdq0 pdq0Var) {
        this.a = constant;
        this.b = constant2;
        this.c = rbvVar;
        this.d = text;
        this.e = pdq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbg0)) {
            return false;
        }
        tbg0 tbg0Var = (tbg0) obj;
        return this.a.equals(tbg0Var.a) && this.b.equals(tbg0Var.b) && this.c.equals(tbg0Var.c) && jl40.l(this.d, tbg0Var.d) && jl40.l(this.e, tbg0Var.e);
    }

    public final int hashCode() {
        int c = ly3.c(this.c, xvz.d(this.b, this.a.hashCode() * 31, 31), 31);
        Text text = this.d;
        int hashCode = (c + (text == null ? 0 : text.hashCode())) * 31;
        pdq0 pdq0Var = this.e;
        return hashCode + (pdq0Var != null ? pdq0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = ly3.u("State(title=", this.a, ", description=", this.b, ", logo=");
        u.append(this.c);
        u.append(", agreementsTitle=");
        u.append(this.d);
        u.append(", agreements=");
        u.append(this.e);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
