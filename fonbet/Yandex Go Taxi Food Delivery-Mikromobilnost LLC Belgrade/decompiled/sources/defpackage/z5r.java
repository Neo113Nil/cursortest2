package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class z5r implements b6r {
    public final String a;
    public final CharSequence b;
    public final ArrayList c;

    public z5r(String str, CharSequence charSequence, ArrayList arrayList) {
        this.a = str;
        this.b = charSequence;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5r)) {
            return false;
        }
        z5r z5rVar = (z5r) obj;
        return jl40.l(this.a, z5rVar.a) && jl40.l(this.b, z5rVar.b) && this.c.equals(z5rVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        return this.c.hashCode() + ((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31);
    }

    public final String toString() {
        return b64.n(Extension.C_BRAKE, ly3.t(this.b, "FilterBlock(id=", this.a, ", title=", ", chips="), this.c);
    }
}
