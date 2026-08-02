package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class vj11 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public vj11(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj11)) {
            return false;
        }
        vj11 vj11Var = (vj11) obj;
        return jl40.l(this.a, vj11Var.a) && jl40.l(this.b, vj11Var.b) && jl40.l(this.c, vj11Var.c) && jl40.l(this.d, vj11Var.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.c;
        int hashCode3 = (hashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.d;
        return hashCode3 + (obj4 != null ? obj4.hashCode() : 0);
    }

    public final String toString() {
        return "Tuple4(first=" + this.a + ", second=" + this.b + ", third=" + this.c + ", fourth=" + this.d + Extension.C_BRAKE;
    }
}
