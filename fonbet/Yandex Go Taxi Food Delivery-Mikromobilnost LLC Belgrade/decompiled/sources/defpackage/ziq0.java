package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ziq0 {
    public final String a;
    public final String b;

    public ziq0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ziq0)) {
            return false;
        }
        ziq0 ziq0Var = (ziq0) obj;
        return jl40.l(this.a, ziq0Var.a) && jl40.l(this.b, ziq0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("SelectedTip(choiceId=", this.a, ", decimalValue=", this.b, Extension.C_BRAKE);
    }
}
