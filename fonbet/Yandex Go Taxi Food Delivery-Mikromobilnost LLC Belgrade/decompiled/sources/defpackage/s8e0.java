package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class s8e0 {
    public final String a;
    public final ayu0 b;
    public final String c;
    public final Integer d;

    public s8e0(String str, ayu0 ayu0Var, String str2, Integer num) {
        this.a = str;
        this.b = ayu0Var;
        this.c = str2;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8e0)) {
            return false;
        }
        s8e0 s8e0Var = (s8e0) obj;
        return jl40.l(this.a, s8e0Var.a) && this.b.equals(s8e0Var.b) && jl40.l(this.c, s8e0Var.c) && jl40.l(this.d, s8e0Var.d);
    }

    public final int hashCode() {
        int b = unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        Integer num = this.d;
        return b + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "PopupHint(id=" + this.a + ", title=" + this.b + ", backgroundColor=" + this.c + ", maxShownCount=" + this.d + Extension.C_BRAKE;
    }
}
