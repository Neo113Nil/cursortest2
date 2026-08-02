package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class y8m0 {
    public final Text.Constant a;
    public final Text.Constant b;

    public y8m0(Text.Constant constant, Text.Constant constant2) {
        this.a = constant;
        this.b = constant2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8m0)) {
            return false;
        }
        y8m0 y8m0Var = (y8m0) obj;
        return this.a.equals(y8m0Var.a) && this.b.equals(y8m0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Date(text=" + this.a + ", amount=" + this.b + Extension.C_BRAKE;
    }
}
