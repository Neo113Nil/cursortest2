package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qri extends uri {
    public final String a;
    public final kus0 b;
    public final boolean c;

    public qri(String str, kus0 kus0Var, boolean z) {
        this.a = str;
        this.b = kus0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qri)) {
            return false;
        }
        qri qriVar = (qri) obj;
        return jl40.l(this.a, qriVar.a) && this.b.equals(qriVar.b) && this.c == qriVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Slot(id=");
        sb.append(this.a);
        sb.append(", slotState=");
        sb.append(this.b);
        sb.append(", isShimmering=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
