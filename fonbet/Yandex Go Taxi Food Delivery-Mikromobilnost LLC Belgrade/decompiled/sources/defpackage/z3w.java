package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class z3w {
    public final String a;
    public final CharSequence b;

    public z3w(CharSequence charSequence, String str) {
        this.a = str;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3w)) {
            return false;
        }
        z3w z3wVar = (z3w) obj;
        return jl40.l(this.a, z3wVar.a) && jl40.l(this.b, z3wVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "InstructionItem(iconTag=" + this.a + ", body=" + ((Object) this.b) + Extension.C_BRAKE;
    }
}
