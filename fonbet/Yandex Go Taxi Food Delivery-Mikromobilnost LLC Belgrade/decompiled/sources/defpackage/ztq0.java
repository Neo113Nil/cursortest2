package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ztq0 {
    public final Text a;
    public final Text b;
    public final xtq0 c;

    public ztq0(Text.Constant constant, Text.Constant constant2, xtq0 xtq0Var) {
        this.a = constant;
        this.b = constant2;
        this.c = xtq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztq0)) {
            return false;
        }
        ztq0 ztq0Var = (ztq0) obj;
        return jl40.l(this.a, ztq0Var.a) && jl40.l(this.b, ztq0Var.b) && jl40.l(this.c, ztq0Var.c);
    }

    public final int hashCode() {
        Text text = this.a;
        int hashCode = (text == null ? 0 : text.hashCode()) * 31;
        Text text2 = this.b;
        int hashCode2 = (hashCode + (text2 == null ? 0 : text2.hashCode())) * 31;
        xtq0 xtq0Var = this.c;
        return hashCode2 + (xtq0Var != null ? xtq0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder p = n.p("ServerTooltipContentEntity(title=", this.a, ", subtitle=", this.b, ", action=");
        p.append(this.c);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
