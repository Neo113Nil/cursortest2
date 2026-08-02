package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.b40;
import yads.c40;

@gsq0
/* loaded from: classes7.dex */
public final class s271 {
    public static final nz61 Companion = new nz61();
    public static final i3y[] c;
    public final List a;
    public final List b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, b40.w), a.b(lazyThreadSafetyMode, c40.w)};
    }

    public s271(List list, List list2, int i) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, rg61.b);
            throw null;
        }
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s271)) {
            return false;
        }
        s271 s271Var = (s271) obj;
        return jl40.l(this.a, s271Var.a) && jl40.l(this.b, s271Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.l("DebugPanelAdUnitMediation(waterfall=", this.a, ", bidding=", this.b, Extension.C_BRAKE);
    }
}
