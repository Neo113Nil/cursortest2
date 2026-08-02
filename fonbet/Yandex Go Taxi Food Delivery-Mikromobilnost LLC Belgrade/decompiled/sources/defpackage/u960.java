package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class u960 {
    public static final u960 c = new u960(null, null);
    public final v77 a;
    public final v77 b;

    public u960(v77 v77Var, v77 v77Var2) {
        this.a = v77Var;
        this.b = v77Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u960)) {
            return false;
        }
        u960 u960Var = (u960) obj;
        return jl40.l(this.a, u960Var.a) && jl40.l(this.b, u960Var.b);
    }

    public final int hashCode() {
        v77 v77Var = this.a;
        int hashCode = (v77Var == null ? 0 : Arrays.hashCode(v77Var.a)) * 31;
        v77 v77Var2 = this.b;
        return hashCode + (v77Var2 != null ? Arrays.hashCode(v77Var2.a) : 0);
    }

    public final String toString() {
        return "NfcServiceData(deviceId=null, ticketData=" + this.a + ", pdfData=" + this.b + Extension.C_BRAKE;
    }

    public u960() {
        this(null, null);
    }
}
