package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wyk0 extends gc5 {
    public final String c;
    public final Text.Constant d;
    public final boolean e;

    public wyk0(String str, Text.Constant constant, boolean z) {
        super(str, 2);
        this.c = str;
        this.d = constant;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyk0)) {
            return false;
        }
        wyk0 wyk0Var = (wyk0) obj;
        return jl40.l(this.c, wyk0Var.c) && this.d.equals(wyk0Var.d) && this.e == wyk0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xvz.d(this.d, this.c.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundingOption(id=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append(this.d);
        sb.append(", selected=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
