package defpackage;

import java.time.ZonedDateTime;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ysu {
    public final String a;
    public final ZonedDateTime b;
    public final List c;
    public final String d;

    public ysu(String str, ZonedDateTime zonedDateTime, List list, String str2) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = list;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysu)) {
            return false;
        }
        ysu ysuVar = (ysu) obj;
        return jl40.l(this.a, ysuVar.a) && jl40.l(this.b, ysuVar.b) && jl40.l(this.c, ysuVar.c) && jl40.l(this.d, ysuVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ZonedDateTime zonedDateTime = this.b;
        int hashCode2 = (hashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        List list = this.c;
        return this.d.hashCode() + ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Hours(value=");
        sb.append(this.a);
        sb.append(", finalDate=");
        sb.append(this.b);
        sb.append(", minutes=");
        return n.l(", textForPattern=", this.d, Extension.C_BRAKE, sb, this.c);
    }
}
