package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class u7m0 {
    public final Text a;
    public final Text b;
    public final List c;
    public final s7m0 d;

    public u7m0(Text text, Text text2, List list, s7m0 s7m0Var) {
        this.a = text;
        this.b = text2;
        this.c = list;
        this.d = s7m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7m0)) {
            return false;
        }
        u7m0 u7m0Var = (u7m0) obj;
        return jl40.l(this.a, u7m0Var.a) && jl40.l(this.b, u7m0Var.b) && jl40.l(this.c, u7m0Var.c) && jl40.l(this.d, u7m0Var.d);
    }

    public final int hashCode() {
        int c = unr0.c(n.c(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        s7m0 s7m0Var = this.d;
        return c + (s7m0Var == null ? 0 : s7m0Var.hashCode());
    }

    public final String toString() {
        StringBuilder p = n.p("State(title=", this.a, ", subtitle=", this.b, ", themes=");
        p.append(this.c);
        p.append(", selectedTheme=");
        p.append(this.d);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
