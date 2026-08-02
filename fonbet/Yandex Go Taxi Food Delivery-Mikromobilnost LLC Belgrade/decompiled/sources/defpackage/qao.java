package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class qao extends u0x implements s7u {
    public final Integer a;
    public final a6q0 b;

    public qao(Integer num, a6q0 a6q0Var) {
        this.a = num;
        this.b = a6q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qao)) {
            return false;
        }
        qao qaoVar = (qao) obj;
        return jl40.l(this.a, qaoVar.a) && jl40.l(this.b, qaoVar.b);
    }

    @Override // defpackage.s7u
    public final Object getItemId() {
        return this.a;
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "ErrorViewItem(itemId=" + this.a + ", onRetryTapped=" + this.b + Extension.C_BRAKE;
    }
}
