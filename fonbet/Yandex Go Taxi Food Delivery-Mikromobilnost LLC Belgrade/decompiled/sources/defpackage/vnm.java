package defpackage;

import com.yx360.design.compose.atoms.DsButton$Style;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class vnm {
    public final String a;
    public final DsButton$Style b;
    public final sls c;

    public vnm(sls slsVar, DsButton$Style dsButton$Style, String str) {
        this.a = str;
        this.b = dsButton$Style;
        this.c = slsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnm)) {
            return false;
        }
        vnm vnmVar = (vnm) obj;
        return jl40.l(this.a, vnmVar.a) && this.b == vnmVar.b && jl40.l(this.c, vnmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ButtonConfig(title=");
        sb.append(this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", onClick=");
        return ly3.r(sb, this.c, Extension.C_BRAKE);
    }
}
