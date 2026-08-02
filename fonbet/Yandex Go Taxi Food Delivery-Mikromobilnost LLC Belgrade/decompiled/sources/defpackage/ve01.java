package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ve01 {
    public final Text.Constant a;
    public final Text b;

    public ve01(Text.Constant constant, Text.Constant constant2) {
        this.a = constant;
        this.b = constant2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve01)) {
            return false;
        }
        ve01 ve01Var = (ve01) obj;
        return this.a.equals(ve01Var.a) && jl40.l(this.b, ve01Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Text text = this.b;
        return hashCode + (text == null ? 0 : text.hashCode());
    }

    public final String toString() {
        return "ToolbarData(title=" + this.a + ", subtitle=" + this.b + Extension.C_BRAKE;
    }
}
