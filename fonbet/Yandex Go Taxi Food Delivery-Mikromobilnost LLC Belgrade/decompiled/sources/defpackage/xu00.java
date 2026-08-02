package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class xu00 {
    public final Object a;
    public final wu00 b;

    public xu00(Object obj, wu00 wu00Var) {
        this.a = obj;
        this.b = wu00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!xu00.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        xu00 xu00Var = (xu00) obj;
        return jl40.l(this.a, xu00Var.a) && this.b.equals(xu00Var.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31);
    }

    public final String toString() {
        return "MapiRequestResult(data=" + this.a + ", details=" + this.b + Extension.C_BRAKE;
    }
}
