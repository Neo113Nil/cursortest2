package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class z9r0 {
    public final n7v a;
    public final String b;
    public final y9r0 c;
    public final List d;

    public z9r0(n7v n7vVar, String str, y9r0 y9r0Var, List list) {
        this.a = n7vVar;
        this.b = str;
        this.c = y9r0Var;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9r0)) {
            return false;
        }
        z9r0 z9r0Var = (z9r0) obj;
        return jl40.l(this.a, z9r0Var.a) && jl40.l(this.b, z9r0Var.b) && this.c.equals(z9r0Var.c) && jl40.l(this.d, z9r0Var.d);
    }

    public final int hashCode() {
        n7v n7vVar = this.a;
        return this.d.hashCode() + ((this.c.hashCode() + unr0.b((n7vVar == null ? 0 : n7vVar.hashCode()) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "SettingsModalParams(icon=" + this.a + ", title=" + this.b + ", button=" + this.c + ", contentDto=" + this.d + Extension.C_BRAKE;
    }
}
