package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class v3w {
    public final String a;
    public final kvm b;

    public v3w(String str, kvm kvmVar) {
        this.a = str;
        this.b = kvmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v3w) {
            v3w v3wVar = (v3w) obj;
            return jl40.l(this.a, v3wVar.a) && this.b == v3wVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InstructionButton(title=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
