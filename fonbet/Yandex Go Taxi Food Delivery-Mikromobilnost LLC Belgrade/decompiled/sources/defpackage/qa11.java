package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class qa11 {
    public final String a;
    public final CharSequence b;
    public final ovi0 c;
    public final boolean d;

    public qa11(String str, CharSequence charSequence, ovi0 ovi0Var, boolean z) {
        this.a = str;
        this.b = charSequence;
        this.c = ovi0Var;
        this.d = z;
    }

    public static qa11 a(qa11 qa11Var, boolean z) {
        String str = qa11Var.a;
        CharSequence charSequence = qa11Var.b;
        ovi0 ovi0Var = qa11Var.c;
        qa11Var.getClass();
        return new qa11(str, charSequence, ovi0Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa11)) {
            return false;
        }
        qa11 qa11Var = (qa11) obj;
        return jl40.l(this.a, qa11Var.a) && jl40.l(this.b, qa11Var.b) && this.c.equals(qa11Var.c) && this.d == qa11Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "TransportTypeOptionState(id=", this.a, ", text=", ", image=");
        t.append(this.c);
        t.append(", isSelected=");
        t.append(this.d);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
