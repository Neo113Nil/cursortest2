package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class u8m0 extends e9m0 {
    public final String c;
    public final Text.Constant d;
    public final ArrayList e;

    public u8m0(String str, Text.Constant constant, ArrayList arrayList) {
        super(str, 2);
        this.c = str;
        this.d = constant;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8m0)) {
            return false;
        }
        u8m0 u8m0Var = (u8m0) obj;
        return jl40.l(this.c, u8m0Var.c) && this.d.equals(u8m0Var.d) && this.e.equals(u8m0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xvz.d(this.d, this.c.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Documents(id=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", buttons=");
        return b64.n(Extension.C_BRAKE, sb, this.e);
    }
}
