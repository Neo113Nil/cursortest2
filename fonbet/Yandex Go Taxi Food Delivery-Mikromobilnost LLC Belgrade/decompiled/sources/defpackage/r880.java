package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class r880 {
    public final String a;
    public final String b;
    public final s880 c;
    public final s880 d;

    public r880(String str, String str2, s880 s880Var, s880 s880Var2) {
        this.a = str;
        this.b = str2;
        this.c = s880Var;
        this.d = s880Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r880)) {
            return false;
        }
        r880 r880Var = (r880) obj;
        return jl40.l(this.a, r880Var.a) && jl40.l(this.b, r880Var.b) && this.c.equals(r880Var.c) && this.d.equals(r880Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.a.hashCode() + unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c.a);
    }

    public final String toString() {
        StringBuilder v = b64.v("OrderStepModal(title=", this.a, ", description=", this.b, ", confirmButton=");
        v.append(this.c);
        v.append(", cancelButton=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
