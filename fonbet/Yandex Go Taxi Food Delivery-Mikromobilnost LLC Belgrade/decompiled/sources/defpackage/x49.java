package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class x49 {
    public final Text.Constant a;
    public final Text.Constant b;
    public final rbv c;

    public x49(Text.Constant constant, Text.Constant constant2, rbv rbvVar) {
        this.a = constant;
        this.b = constant2;
        this.c = rbvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x49)) {
            return false;
        }
        x49 x49Var = (x49) obj;
        return this.a.equals(x49Var.a) && this.b.equals(x49Var.b) && this.c.equals(x49Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xvz.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder u = ly3.u("State(startText=", this.a, ", endText=", this.b, ", icon=");
        u.append(this.c);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
