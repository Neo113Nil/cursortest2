package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vvz0 {
    public final Text.Constant a;
    public final Text b;
    public final rbv c;

    public vvz0(Text.Constant constant, Text.Constant constant2, rbv rbvVar) {
        this.a = constant;
        this.b = constant2;
        this.c = rbvVar;
    }

    public final rbv a() {
        return this.c;
    }

    public final Text b() {
        return this.b;
    }

    public final Text c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvz0)) {
            return false;
        }
        vvz0 vvz0Var = (vvz0) obj;
        return this.a.equals(vvz0Var.a) && jl40.l(this.b, vvz0Var.b) && jl40.l(this.c, vvz0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Text text = this.b;
        int hashCode2 = (hashCode + (text == null ? 0 : text.hashCode())) * 31;
        rbv rbvVar = this.c;
        return hashCode2 + (rbvVar != null ? rbvVar.hashCode() : 0);
    }

    public final String toString() {
        return "TooltipViewState(subtitle=" + this.a + ", linkText=" + this.b + ", linkImage=" + this.c + Extension.C_BRAKE;
    }
}
