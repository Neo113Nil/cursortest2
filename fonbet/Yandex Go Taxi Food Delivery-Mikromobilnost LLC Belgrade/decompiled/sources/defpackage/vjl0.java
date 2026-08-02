package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvjl0;", "", "Companion", "tjl0", "ujl0", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class vjl0 {
    public static final ujl0 Companion = new ujl0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new ibl0(13))};
    public final kxd a;
    public final List b;

    public /* synthetic */ vjl0(int i, kxd kxdVar, List list) {
        this.a = (i & 1) == 0 ? new kxd(0) : kxdVar;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjl0)) {
            return false;
        }
        vjl0 vjl0Var = (vjl0) obj;
        return jl40.l(this.a, vjl0Var.a) && jl40.l(this.b, vjl0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Rule(condition=" + this.a + ", effects=" + this.b + Extension.C_BRAKE;
    }

    public vjl0() {
        this.a = new kxd(0);
        this.b = EmptyList.a;
    }
}
