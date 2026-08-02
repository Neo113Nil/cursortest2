package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvfi;", "Lxn11;", "Companion", "ufi", "tfi", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class vfi implements xn11 {
    public static final ufi Companion = new ufi();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new n5h(26))};
    public static final vfi d = new vfi(0);
    public final List b;

    public /* synthetic */ vfi(int i, List list) {
        if ((i & 1) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vfi) && jl40.l(this.b, ((vfi) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return tse0.k("DeliveryOrderFlowOverridesDto(useTariffIfAny=", Extension.C_BRAKE, this.b);
    }

    public vfi(int i) {
        this.b = EmptyList.a;
    }

    public vfi() {
        this(0);
    }
}
