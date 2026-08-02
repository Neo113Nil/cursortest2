package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class uee0 {
    public static final tee0 Companion = new tee0();
    public static final i3y[] e = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new jee0(1)), null};
    public final String a;
    public final xpq0 b;
    public final List c;
    public final String d;

    public /* synthetic */ uee0(int i, String str, xpq0 xpq0Var, List list, String str2) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, see0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = xpq0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uee0)) {
            return false;
        }
        uee0 uee0Var = (uee0) obj;
        return jl40.l(this.a, uee0Var.a) && jl40.l(this.b, uee0Var.b) && jl40.l(this.c, uee0Var.c) && jl40.l(this.d, uee0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        xpq0 xpq0Var = this.b;
        int hashCode2 = (hashCode + (xpq0Var == null ? 0 : xpq0Var.hashCode())) * 31;
        List list = this.c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.d;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostMessageParameterMapping(path=");
        sb.append(this.a);
        sb.append(", sendToBackend=");
        sb.append(this.b);
        sb.append(", sendToBackendPath=");
        return n.l(", variableName=", this.d, Extension.C_BRAKE, sb, this.c);
    }
}
