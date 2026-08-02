package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class w3k {
    public final Map a;
    public final String b;

    public w3k(Map map, String str) {
        this.a = map;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3k)) {
            return false;
        }
        w3k w3kVar = (w3k) obj;
        return jl40.l(this.a, w3kVar.a) && jl40.l(this.b, w3kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DivAction(payload=" + this.a + ", type=" + this.b + Extension.C_BRAKE;
    }
}
