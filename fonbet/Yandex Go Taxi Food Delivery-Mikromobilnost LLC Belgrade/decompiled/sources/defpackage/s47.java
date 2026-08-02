package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class s47 {
    public final String a;
    public final String b;

    public s47(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s47)) {
            return false;
        }
        s47 s47Var = (s47) obj;
        return this.a.equals(s47Var.a) && this.b.equals(s47Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Buttons(cancelButtonText=", this.a, ", doneButtonText=", this.b, Extension.C_BRAKE);
    }
}
