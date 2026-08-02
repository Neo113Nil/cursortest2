package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class v3f0 {
    public final String a;
    public final Integer b;

    public v3f0(String str, Integer num) {
        this.a = str;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3f0)) {
            return false;
        }
        v3f0 v3f0Var = (v3f0) obj;
        return jl40.l(this.a, v3f0Var.a) && jl40.l(this.b, v3f0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "PrivacyEntity(fieldName=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
    }
}
