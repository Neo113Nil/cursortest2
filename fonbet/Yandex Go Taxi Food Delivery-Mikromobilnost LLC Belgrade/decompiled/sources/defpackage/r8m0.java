package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class r8m0 {
    public final Text.Constant a;
    public final Text.Constant b;
    public final String c;

    public r8m0(Text.Constant constant, Text.Constant constant2, String str) {
        this.a = constant;
        this.b = constant2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8m0)) {
            return false;
        }
        r8m0 r8m0Var = (r8m0) obj;
        return this.a.equals(r8m0Var.a) && this.b.equals(r8m0Var.b) && this.c.equals(r8m0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xvz.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return oyr.t(ly3.u("Button(label=", this.a, ", value=", this.b, ", action="), this.c, Extension.C_BRAKE);
    }
}
