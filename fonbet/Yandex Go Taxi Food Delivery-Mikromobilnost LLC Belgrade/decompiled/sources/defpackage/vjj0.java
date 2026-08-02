package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvjj0;", "", "Companion", "tjj0", "ujj0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class vjj0 {
    public static final ujj0 Companion = new ujj0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new vci0(23))};
    public final Map a;

    public /* synthetic */ vjj0(int i, Map map) {
        if ((i & 1) == 0) {
            this.a = b.f();
        } else {
            this.a = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vjj0) && jl40.l(this.a, ((vjj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nnm.j("RequirementOverrides(verticals=", Extension.C_BRAKE, this.a);
    }

    public vjj0() {
        this(0);
    }

    public vjj0(int i) {
        this.a = b.f();
    }
}
