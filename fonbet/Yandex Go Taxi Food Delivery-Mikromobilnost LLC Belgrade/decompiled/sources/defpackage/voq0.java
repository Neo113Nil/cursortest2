package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class voq0 implements ig5 {
    public static final toq0 Companion = new toq0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new xiq0(7))};
    public final String a;
    public final Map b;

    public /* synthetic */ voq0(int i, String str, Map map) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, roq0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof voq0)) {
            return false;
        }
        voq0 voq0Var = (voq0) obj;
        return jl40.l(this.a, voq0Var.a) && jl40.l(this.b, voq0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return xvz.j("SendExternalEventAction(event=", this.a, ", params=", Extension.C_BRAKE, this.b);
    }
}
