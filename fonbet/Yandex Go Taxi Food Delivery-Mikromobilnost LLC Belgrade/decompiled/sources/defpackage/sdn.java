package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lsdn;", "Lvn11;", "Companion", "rdn", "qdn", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class sdn implements vn11 {
    public static final rdn Companion = new rdn();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new tvl(22))};
    public static final sdn e = new sdn(0);
    public final boolean b;
    public final List c;

    public /* synthetic */ sdn(int i, boolean z, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdn)) {
            return false;
        }
        sdn sdnVar = (sdn) obj;
        return this.b == sdnVar.b && jl40.l(this.c, sdnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "EatsKitSafeHostsExperiment(enabled=" + this.b + ", hosts=" + this.c + Extension.C_BRAKE;
    }

    public sdn(int i) {
        this.b = false;
        this.c = EmptyList.a;
    }

    public sdn() {
        this(0);
    }
}
