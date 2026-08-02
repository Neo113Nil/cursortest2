package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class te1 extends kr {
    public static final re1 Companion = new re1();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new pn0(19))};
    public final String a;
    public final Boolean b;
    public final Map c;

    public /* synthetic */ te1(int i, Boolean bool, String str, Map map) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, pe1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = bool;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te1)) {
            return false;
        }
        te1 te1Var = (te1) obj;
        return jl40.l(this.a, te1Var.a) && jl40.l(this.b, te1Var.b) && jl40.l(this.c, te1Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Map map = this.c;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdvertisementPixelBillingAction(impression=");
        sb.append(this.a);
        sb.append(", sendYaCookies=");
        sb.append(this.b);
        sb.append(", headers=");
        return b64.r(sb, this.c, Extension.C_BRAKE);
    }
}
