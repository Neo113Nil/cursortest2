package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class z5u0 implements vbz {
    public final wzv a;
    public final wzv b;
    public final zic c;

    public z5u0(wzv wzvVar, wzv wzvVar2, zic zicVar) {
        this.a = wzvVar;
        this.b = wzvVar2;
        this.c = zicVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5u0)) {
            return false;
        }
        z5u0 z5u0Var = (z5u0) obj;
        return jl40.l(this.a, z5u0Var.a) && this.b.equals(z5u0Var.b) && jl40.l(this.c, z5u0Var.c);
    }

    public final int hashCode() {
        wzv wzvVar = this.a;
        int hashCode = wzvVar == null ? 0 : wzvVar.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "StateUpdate(previousSelectResult=" + this.a + ", selectResult=" + this.b + ", state=" + this.c + Extension.C_BRAKE;
    }
}
