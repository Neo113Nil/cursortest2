package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class wx21 {
    public final Object a;
    public final Object b;

    public wx21(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx21)) {
            return false;
        }
        wx21 wx21Var = (wx21) obj;
        return jl40.l(this.a, wx21Var.a) && jl40.l(this.b, wx21Var.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "UtilsThemedParameterEntity(dark=" + this.a + ", light=" + this.b + Extension.C_BRAKE;
    }
}
