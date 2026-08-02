package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class rpn {
    public final String a;
    public final Object b;

    public rpn(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpn)) {
            return false;
        }
        rpn rpnVar = (rpn) obj;
        return jl40.l(this.a, rpnVar.a) && jl40.l(this.b, rpnVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "SetRequirement(requirementName=" + this.a + ", requirementValue=" + this.b + Extension.C_BRAKE;
    }
}
