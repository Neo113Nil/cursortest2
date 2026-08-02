package defpackage;

import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class vtl implements bnr0 {
    public final Map a;

    public vtl(Map map) {
        this.a = map;
    }

    @Override // defpackage.bnr0
    public final bnr0 a(bnr0 bnr0Var) {
        if (!(bnr0Var instanceof vtl)) {
            return this;
        }
        return new vtl(b.n(this.a, ((vtl) bnr0Var).a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vtl) && jl40.l(this.a, ((vtl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nnm.j("DivkitDivDataSharedData(divData=", Extension.C_BRAKE, this.a);
    }
}
