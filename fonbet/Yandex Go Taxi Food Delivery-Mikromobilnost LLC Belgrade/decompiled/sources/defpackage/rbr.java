package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class rbr {
    public static final qbr Companion = new qbr();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new v5r(8))};
    public final String a;
    public final c b;
    public final Map c;

    public /* synthetic */ rbr(int i, String str, Map map, c cVar) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, pbr.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = cVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbr)) {
            return false;
        }
        rbr rbrVar = (rbr) obj;
        return jl40.l(this.a, rbrVar.a) && jl40.l(this.b, rbrVar.b) && jl40.l(this.c, rbrVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c cVar = this.b;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.a.hashCode())) * 31;
        Map map = this.c;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FintechRemoteQuery(path=");
        sb.append(this.a);
        sb.append(", body=");
        sb.append(this.b);
        sb.append(", params=");
        return b64.r(sb, this.c, Extension.C_BRAKE);
    }
}
