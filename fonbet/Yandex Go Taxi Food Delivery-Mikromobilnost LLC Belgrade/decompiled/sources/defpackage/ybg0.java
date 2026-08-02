package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ybg0 {
    public final Text a;
    public final Text b;
    public final Text c;
    public final rbv d;

    public ybg0(rbv rbvVar, Text text, Text text2, Text text3) {
        this.a = text;
        this.b = text2;
        this.c = text3;
        this.d = rbvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybg0)) {
            return false;
        }
        ybg0 ybg0Var = (ybg0) obj;
        return jl40.l(this.a, ybg0Var.a) && jl40.l(this.b, ybg0Var.b) && jl40.l(this.c, ybg0Var.c) && jl40.l(this.d, ybg0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + n.c(this.c, n.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder p = n.p("State(title=", this.a, ", description=", this.b, ", buttonText=");
        p.append(this.c);
        p.append(", image=");
        p.append(this.d);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
