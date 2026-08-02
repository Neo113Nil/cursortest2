package defpackage;

import java.time.ZonedDateTime;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ri20 {
    public final String a;
    public final ZonedDateTime b;
    public final String c;

    public ri20(String str, ZonedDateTime zonedDateTime, String str2) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri20)) {
            return false;
        }
        ri20 ri20Var = (ri20) obj;
        return jl40.l(this.a, ri20Var.a) && this.b.equals(ri20Var.b) && jl40.l(this.c, ri20Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Minutes(value=");
        sb.append(this.a);
        sb.append(", finalDate=");
        sb.append(this.b);
        sb.append(", textForPattern=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
