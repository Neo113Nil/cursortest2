package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class wfl0 extends xfl0 {
    public final String a;
    public final Map b;
    public final gbr c;

    public wfl0(String str, Map map, gbr gbrVar) {
        this.a = str;
        this.b = map;
        this.c = gbrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfl0)) {
            return false;
        }
        wfl0 wfl0Var = (wfl0) obj;
        return this.a.equals(wfl0Var.a) && this.b.equals(wfl0Var.b) && jl40.l(this.c, wfl0Var.c);
    }

    public final int hashCode() {
        int d = unr0.d(this.a.hashCode() * 31, 31, this.b);
        gbr gbrVar = this.c;
        return d + (gbrVar == null ? 0 : gbrVar.hashCode());
    }

    public final String toString() {
        return "ToScreen(route=" + this.a + ", args=" + this.b + ", navOptions=" + this.c + Extension.C_BRAKE;
    }
}
