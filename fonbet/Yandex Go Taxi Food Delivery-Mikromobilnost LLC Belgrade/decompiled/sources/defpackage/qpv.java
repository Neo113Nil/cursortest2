package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class qpv {
    public static final ppv Companion = new ppv();
    public static final i3y[] d = {a.b(LazyThreadSafetyMode.PUBLICATION, new smv(20)), null, null};
    public final Map a;
    public final ik7 b;
    public final String c;

    public /* synthetic */ qpv(int i, Map map, ik7 ik7Var, String str) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, opv.a.getDescriptor());
            throw null;
        }
        this.a = map;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ik7Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpv)) {
            return false;
        }
        qpv qpvVar = (qpv) obj;
        return jl40.l(this.a, qpvVar.a) && jl40.l(this.b, qpvVar.b) && jl40.l(this.c, qpvVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ik7 ik7Var = this.b;
        int hashCode2 = (hashCode + (ik7Var == null ? 0 : ik7Var.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncomingCallArgs(push=");
        sb.append(this.a);
        sb.append(", callToCar=");
        sb.append(this.b);
        sb.append(", callToAvatarUrl=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public qpv(Map map, ik7 ik7Var, String str) {
        this.a = map;
        this.b = ik7Var;
        this.c = str;
    }
}
