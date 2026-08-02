package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.personalstate.api.network.objects.OptionType;

/* loaded from: classes6.dex */
public final class t3b0 {
    public final String a;
    public final OptionType b;
    public final String c;
    public final String d;

    public t3b0(String str, OptionType optionType, String str2, String str3) {
        this.a = str;
        this.b = optionType;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3b0)) {
            return false;
        }
        t3b0 t3b0Var = (t3b0) obj;
        return jl40.l(this.a, t3b0Var.a) && this.b == t3b0Var.b && jl40.l(this.c, t3b0Var.c) && jl40.l(this.d, t3b0Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(label=");
        sb.append(this.a);
        sb.append(", optionType=");
        sb.append(this.b);
        sb.append(", tariffClass=");
        return g8e.r(sb, this.c, ", requirement=", this.d, Extension.C_BRAKE);
    }
}
