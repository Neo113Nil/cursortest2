package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vty0 {
    public final Text a;
    public final int b;

    public vty0(Text text, int i) {
        this.a = text;
        this.b = i;
    }

    public final Text a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vty0)) {
            return false;
        }
        vty0 vty0Var = (vty0) obj;
        return jl40.l(this.a, vty0Var.a) && this.b == vty0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TextViewDetails(text=" + this.a + ", textAppearance=" + this.b + Extension.C_BRAKE;
    }
}
