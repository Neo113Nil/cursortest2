package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class zk9 implements el9 {
    public final CharSequence a;
    public final CharSequence b;
    public final hba c;
    public final String d;
    public final Map e;

    public zk9(CharSequence charSequence, CharSequence charSequence2, hba hbaVar, String str, Map map) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = hbaVar;
        this.d = str;
        this.e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk9)) {
            return false;
        }
        zk9 zk9Var = (zk9) obj;
        return jl40.l(this.a, zk9Var.a) && jl40.l(this.b, zk9Var.b) && this.c.equals(zk9Var.c) && jl40.l(this.d, zk9Var.d) && jl40.l(this.e, zk9Var.e);
    }

    @Override // defpackage.el9
    public final hba getAction() {
        return this.c;
    }

    @Override // defpackage.el9
    public final CharSequence getTitle() {
        return this.a;
    }

    public final int hashCode() {
        int b = unr0.b((this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        Map map = this.e;
        return b + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "AnimatedBanner(title=", ", subtitle=", ", action=");
        r.append(this.c);
        r.append(", animationUrl=");
        r.append(this.d);
        r.append(", analyticsPayload=");
        return b64.r(r, this.e, Extension.C_BRAKE);
    }
}
