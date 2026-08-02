package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class syg {
    public final long a;
    public final String b;
    public final Map c;

    public syg(long j, String str, Map map) {
        this.a = j;
        this.b = str;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!syg.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        syg sygVar = (syg) obj;
        return this.a == sygVar.a && jl40.l(this.b, sygVar.b) && this.c.equals(sygVar.c);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder k = x4e.k("DecodingInfo(documentSizeByte=", this.a, ", pageToken=", this.b);
        k.append(", velocityInfo=");
        k.append(this.c);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
