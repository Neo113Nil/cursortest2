package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vhk {
    public final String a;
    public final String b;
    public final Map c;

    public vhk(String str, String str2, Map map) {
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhk)) {
            return false;
        }
        vhk vhkVar = (vhk) obj;
        return this.a.equals(vhkVar.a) && this.b.equals(vhkVar.b) && jl40.l(this.c, vhkVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Map map = this.c;
        return b + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return b64.r(b64.v("DivCallbackAction(logId=", this.a, ", url=", this.b, ", payload="), this.c, Extension.C_BRAKE);
    }
}
