package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wzb0 {
    public final Text.Constant a;
    public final Text b;
    public final rbv c;

    public wzb0(Text.Constant constant, Text text, rbv rbvVar) {
        this.a = constant;
        this.b = text;
        this.c = rbvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzb0)) {
            return false;
        }
        wzb0 wzb0Var = (wzb0) obj;
        return this.a.equals(wzb0Var.a) && jl40.l(this.b, wzb0Var.b) && this.c.equals(wzb0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Text text = this.b;
        return this.c.hashCode() + ((hashCode + (text == null ? 0 : text.hashCode())) * 31);
    }

    public final String toString() {
        return "PinSignOutState(userName=" + this.a + ", shortUserName=" + this.b + ", avatar=" + this.c + Extension.C_BRAKE;
    }
}
