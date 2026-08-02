package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class s1a0 implements w1a0 {
    public final Text a;
    public final Text b;

    public s1a0(Text.Constant constant, Text text) {
        this.a = text;
        this.b = constant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1a0)) {
            return false;
        }
        s1a0 s1a0Var = (s1a0) obj;
        return this.a.equals(s1a0Var.a) && jl40.l(this.b, s1a0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Text text = this.b;
        return hashCode + (text == null ? 0 : text.hashCode());
    }

    public final String toString() {
        return "Processing(title=" + this.a + ", description=" + this.b + Extension.C_BRAKE;
    }
}
