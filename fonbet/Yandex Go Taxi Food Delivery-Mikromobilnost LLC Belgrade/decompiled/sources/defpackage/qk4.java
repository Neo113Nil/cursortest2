package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class qk4 {
    public final CharSequence a;
    public final kdc b;
    public final kdc c;
    public final CharSequence d;

    public qk4(CharSequence charSequence, kdc kdcVar, kdc kdcVar2, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = kdcVar;
        this.c = kdcVar2;
        this.d = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk4)) {
            return false;
        }
        qk4 qk4Var = (qk4) obj;
        return jl40.l(this.a, qk4Var.a) && this.b.equals(qk4Var.b) && jl40.l(this.c, qk4Var.c) && jl40.l(this.d, qk4Var.d);
    }

    public final int hashCode() {
        int d = smw0.d(this.b, this.a.hashCode() * 31, 31);
        kdc kdcVar = this.c;
        return this.d.hashCode() + ((d + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31);
    }

    public final String toString() {
        return "BadgeItemUiState(text=" + ((Object) this.a) + ", textColor=" + this.b + ", backgroundColor=" + this.c + ", contentDescription=" + ((Object) this.d) + Extension.C_BRAKE;
    }
}
