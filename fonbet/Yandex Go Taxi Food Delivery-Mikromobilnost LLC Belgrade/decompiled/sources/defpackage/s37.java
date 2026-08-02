package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class s37 extends t4z0 {
    public final CharSequence a;
    public final ky b;
    public final p37 c;
    public final String d;

    public s37(CharSequence charSequence, ky kyVar, p37 p37Var, String str) {
        this.a = charSequence;
        this.b = kyVar;
        this.c = p37Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s37)) {
            return false;
        }
        s37 s37Var = (s37) obj;
        return this.a.equals(s37Var.a) && this.b.equals(s37Var.b) && jl40.l(this.c, s37Var.c) && jl40.l(this.d, s37Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        p37 p37Var = this.c;
        int hashCode2 = (hashCode + (p37Var == null ? 0 : p37Var.hashCode())) * 31;
        String str = this.d;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ButtonTileFooterState(title=" + ((Object) this.a) + ", action=" + this.b + ", buttonStyleState=" + this.c + ", metricaLabel=" + this.d + Extension.C_BRAKE;
    }
}
