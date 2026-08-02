package defpackage;

import com.yx360.design.compose.atoms.DsButton$Size;
import com.yx360.design.compose.atoms.DsButton$Style;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class snm {
    public final kk2 a;
    public final DsButton$Style b;
    public final sls c;
    public final DsButton$Size d;
    public final boolean e;

    public snm(kk2 kk2Var, DsButton$Style dsButton$Style, sls slsVar, DsButton$Size dsButton$Size, boolean z, int i) {
        z = (i & 512) != 0 ? true : z;
        this.a = kk2Var;
        this.b = dsButton$Style;
        this.c = slsVar;
        this.d = dsButton$Size;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof snm)) {
            return false;
        }
        snm snmVar = (snm) obj;
        return jl40.l(this.a, snmVar.a) && this.b == snmVar.b && jl40.l(this.c, snmVar.c) && this.d == snmVar.d && this.e == snmVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.e((this.d.hashCode() + nnm.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 923521, 961, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ButtonConfig(title=");
        sb.append((Object) this.a);
        sb.append(", variant=");
        sb.append(this.b);
        sb.append(", onClick=");
        sb.append(this.c);
        sb.append(", size=");
        sb.append(this.d);
        sb.append(", leftIcon=null, rightIcon=null, description=null, loadingIndicator=false, loadingContentDescription=null, enabled=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
