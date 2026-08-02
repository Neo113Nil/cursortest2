package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class twa {
    public final uwa a;
    public final List b;

    public twa(uwa uwaVar, List list) {
        this.a = uwaVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twa)) {
            return false;
        }
        twa twaVar = (twa) obj;
        return jl40.l(this.a, twaVar.a) && jl40.l(this.b, twaVar.b);
    }

    public final int hashCode() {
        uwa uwaVar = this.a;
        return this.b.hashCode() + ((uwaVar == null ? 0 : uwaVar.hashCode()) * 31);
    }

    public final String toString() {
        return "ChargersTariffBlock(header=" + this.a + ", items=" + this.b + Extension.C_BRAKE;
    }
}
