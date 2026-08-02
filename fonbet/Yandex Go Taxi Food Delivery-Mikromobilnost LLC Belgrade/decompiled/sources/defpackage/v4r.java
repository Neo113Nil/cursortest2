package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class v4r {
    public final String a;
    public final CharSequence b;
    public final List c;

    public v4r(CharSequence charSequence, String str, List list) {
        this.a = str;
        this.b = charSequence;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4r)) {
            return false;
        }
        v4r v4rVar = (v4r) obj;
        return jl40.l(this.a, v4rVar.a) && jl40.l(this.b, v4rVar.b) && jl40.l(this.c, v4rVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        return this.c.hashCode() + ((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31);
    }

    public final String toString() {
        return ly3.s(ly3.t(this.b, "FilterModalBlock(id=", this.a, ", title=", ", chips="), this.c, Extension.C_BRAKE);
    }
}
