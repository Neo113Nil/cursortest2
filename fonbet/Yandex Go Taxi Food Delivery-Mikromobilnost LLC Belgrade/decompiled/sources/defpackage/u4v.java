package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class u4v {
    public final String a;
    public final ArrayList b;

    public u4v(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4v)) {
            return false;
        }
        u4v u4vVar = (u4v) obj;
        return jl40.l(this.a, u4vVar.a) && this.b.equals(u4vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return n.k("IconMatches(iconTag=", this.a, ", matches=", Extension.C_BRAKE, this.b);
    }
}
