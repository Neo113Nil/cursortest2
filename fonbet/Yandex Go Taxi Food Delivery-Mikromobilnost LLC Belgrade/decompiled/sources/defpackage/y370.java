package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class y370 implements ig5 {
    public static final x370 Companion = new x370();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new oi60(25)), null};
    public final Map a;
    public final String b;

    public /* synthetic */ y370(int i, String str, Map map) {
        if (2 != (i & 2)) {
            qje.Z(i, 2, w370.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = map;
        }
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y370)) {
            return false;
        }
        y370 y370Var = (y370) obj;
        return jl40.l(this.a, y370Var.a) && jl40.l(this.b, y370Var.b);
    }

    public final int hashCode() {
        Map map = this.a;
        return this.b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    public final String toString() {
        return "OpenBrowserAction(params=" + this.a + ", url=" + this.b + Extension.C_BRAKE;
    }

    public y370(Map map, String str) {
        this.a = map;
        this.b = str;
    }
}
