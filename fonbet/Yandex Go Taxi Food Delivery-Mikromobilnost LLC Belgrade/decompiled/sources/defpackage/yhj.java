package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class yhj {
    public final Object a;
    public final Object b;

    public yhj(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhj)) {
            return false;
        }
        yhj yhjVar = (yhj) obj;
        return jl40.l(this.a, yhjVar.a) && jl40.l(this.b, yhjVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "DiffPayload(oldItem=" + this.a + ", newItem=" + this.b + Extension.C_BRAKE;
    }
}
