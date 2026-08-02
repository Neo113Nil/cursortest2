package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class s610 {
    public static final r610 Companion = new r610();
    public static final i3y[] c;
    public final List a;
    public final List b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, new g110(7)), a.b(lazyThreadSafetyMode, new g110(8))};
    }

    public /* synthetic */ s610(List list, List list2, int i) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, q610.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s610)) {
            return false;
        }
        s610 s610Var = (s610) obj;
        return jl40.l(this.a, s610Var.a) && jl40.l(this.b, s610Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.l("MatchFields(queryParamsKeys=", this.a, ", appStateKeys=", this.b, Extension.C_BRAKE);
    }

    public s610(List list, List list2) {
        this.a = list;
        this.b = list2;
    }
}
