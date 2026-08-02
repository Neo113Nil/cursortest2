package defpackage;

import java.util.Locale;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes8.dex */
public final class qd41 {
    public final Locale a;
    public final boolean b;
    public final pd41 c;
    public final String d;
    public final ed41 e;
    public final String f;
    public final boolean g;

    public qd41(Locale locale, ed41 ed41Var, int i) {
        locale = (i & 1) != 0 ? Locale.getDefault() : locale;
        ed41Var = (i & 16) != 0 ? bd41.a : ed41Var;
        String str = (i & 32) != 0 ? null : "go";
        this.a = locale;
        this.b = false;
        this.c = null;
        this.d = null;
        this.e = ed41Var;
        this.f = str;
        this.g = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd41)) {
            return false;
        }
        qd41 qd41Var = (qd41) obj;
        return jl40.l(this.a, qd41Var.a) && this.b == qd41Var.b && jl40.l(this.c, qd41Var.c) && jl40.l(this.d, qd41Var.d) && jl40.l(this.e, qd41Var.e) && jl40.l(this.f, qd41Var.f) && this.g == qd41Var.g;
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        pd41 pd41Var = this.c;
        int hashCode = (e + (pd41Var == null ? 0 : pd41Var.hashCode())) * 31;
        String str = this.d;
        int hashCode2 = (this.e.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f;
        return Boolean.hashCode(this.g) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebChatInitialProperties(locale=");
        sb.append(this.a);
        sb.append(", listenOnStart=");
        sb.append(this.b);
        sb.append(", startAliceDeeplink=");
        sb.append(this.c);
        sb.append(", initialChatText=");
        sb.append(this.d);
        sb.append(", displayMode=");
        sb.append(this.e);
        sb.append(", appStyle=");
        sb.append(this.f);
        sb.append(", showRequestPartial=");
        return x4e.i(sb, this.g, Extension.C_BRAKE);
    }

    public qd41() {
        this(null, null, HProv.PP_VERSION_TIMESTAMP);
    }
}
