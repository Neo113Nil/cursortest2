package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class z6p {
    public static final y6p Companion = new y6p();
    public static final i3y[] d = {a.b(LazyThreadSafetyMode.PUBLICATION, new d6p(21)), null, null};
    public final List a;
    public final Boolean b;
    public final m5p c;

    public /* synthetic */ z6p(int i, List list, Boolean bool, m5p m5pVar) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, x6p.a.getDescriptor());
            throw null;
        }
        this.a = list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = m5pVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6p)) {
            return false;
        }
        z6p z6pVar = (z6p) obj;
        return jl40.l(this.a, z6pVar.a) && jl40.l(this.b, z6pVar.b) && jl40.l(this.c, z6pVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        m5p m5pVar = this.c;
        return hashCode2 + (m5pVar != null ? m5pVar.hashCode() : 0);
    }

    public final String toString() {
        return "FTVariableNode(path=" + this.a + ", optional=" + this.b + ", optionalDescriptor=" + this.c + Extension.C_BRAKE;
    }
}
