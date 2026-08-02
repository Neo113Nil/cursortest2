package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class rp80 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public boolean d;

    public rp80(CharSequence charSequence, CharSequence charSequence2, String str, boolean z) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp80)) {
            return false;
        }
        rp80 rp80Var = (rp80) obj;
        return jl40.l(this.a, rp80Var.a) && jl40.l(this.b, rp80Var.b) && jl40.l(this.c, rp80Var.c) && this.d == rp80Var.d;
    }

    public final int hashCode() {
        int b = smw0.b(this.a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        return Boolean.hashCode(this.d) + ((b + (charSequence == null ? 0 : charSequence.hashCode())) * 31);
    }

    public final String toString() {
        boolean z = this.d;
        StringBuilder t = ly3.t(this.b, "OrganizationsSortingItem(id=", this.a, ", title=", ", description=");
        t.append((Object) this.c);
        t.append(", isSelected=");
        t.append(z);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
