package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ujw0 implements wjw0 {
    public final String a;
    public final String b;
    public final ArrayList c;

    public ujw0(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujw0)) {
            return false;
        }
        ujw0 ujw0Var = (ujw0) obj;
        return jl40.l(this.a, ujw0Var.a) && jl40.l(this.b, ujw0Var.b) && this.c.equals(ujw0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return b64.n(Extension.C_BRAKE, b64.v("Content(title=", this.a, ", subtitle=", this.b, ", items="), this.c);
    }
}
