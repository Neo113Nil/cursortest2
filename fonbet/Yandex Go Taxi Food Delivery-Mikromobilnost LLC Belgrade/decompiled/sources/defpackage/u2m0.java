package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class u2m0 {
    public final rbv a;
    public final Text.Constant b;
    public final String c;

    public u2m0(rbv rbvVar, Text.Constant constant, String str) {
        this.a = rbvVar;
        this.b = constant;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2m0)) {
            return false;
        }
        u2m0 u2m0Var = (u2m0) obj;
        return jl40.l(this.a, u2m0Var.a) && this.b.equals(u2m0Var.b) && jl40.l(this.c, u2m0Var.c);
    }

    public final int hashCode() {
        rbv rbvVar = this.a;
        return this.c.hashCode() + xvz.d(this.b, (rbvVar == null ? 0 : rbvVar.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingAccountWidgetDocumentButton(icon=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", clickAction=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
