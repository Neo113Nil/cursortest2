package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class w14 implements y14 {
    public final stz0 a;
    public final vrc b;

    public w14(stz0 stz0Var, vrc vrcVar) {
        this.a = stz0Var;
        this.b = vrcVar;
    }

    public final vrc a() {
        return this.b;
    }

    public final stz0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w14)) {
            return false;
        }
        w14 w14Var = (w14) obj;
        return jl40.l(this.a, w14Var.a) && this.b.equals(w14Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Instruction(toolbar=" + this.a + ", state=" + this.b + Extension.C_BRAKE;
    }
}
