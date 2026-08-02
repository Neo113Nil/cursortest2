package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class v6r0 implements e9r0 {
    public final String a;
    public final Text b;
    public final Text c;
    public final rbv d;
    public final String e;

    public v6r0(String str, Text text, Text text2, rbv rbvVar, String str2) {
        this.a = str;
        this.b = text;
        this.c = text2;
        this.d = rbvVar;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6r0)) {
            return false;
        }
        v6r0 v6r0Var = (v6r0) obj;
        return jl40.l(this.a, v6r0Var.a) && jl40.l(this.b, v6r0Var.b) && jl40.l(this.c, v6r0Var.c) && jl40.l(this.d, v6r0Var.d) && jl40.l(this.e, v6r0Var.e);
    }

    @Override // defpackage.e9r0
    public final String getKey() {
        return this.a;
    }

    public final int hashCode() {
        int c = n.c(this.c, n.c(this.b, this.a.hashCode() * 31, 31), 31);
        rbv rbvVar = this.d;
        int hashCode = (c + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        String str = this.e;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsAppIconViewItem(key=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", image=");
        sb.append(this.d);
        sb.append(", action=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
