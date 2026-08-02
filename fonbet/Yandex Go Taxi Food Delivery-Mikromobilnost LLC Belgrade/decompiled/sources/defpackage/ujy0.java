package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ujy0 implements u22 {
    public final String a;
    public final q0d0 b;
    public final String c;

    public ujy0(String str, q0d0 q0d0Var, String str2) {
        this.a = str;
        this.b = q0d0Var;
        this.c = str2;
    }

    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujy0)) {
            return false;
        }
        ujy0 ujy0Var = (ujy0) obj;
        return jl40.l(this.a, ujy0Var.a) && jl40.l(this.b, ujy0Var.b) && jl40.l(this.c, ujy0Var.c);
    }

    @Override // defpackage.h22
    public final q0d0 getAction() {
        return this.b;
    }

    @Override // defpackage.h22
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q0d0 q0d0Var = this.b;
        return this.c.hashCode() + ((hashCode + (q0d0Var == null ? 0 : q0d0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextAnalyticWidget(id=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", text=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
