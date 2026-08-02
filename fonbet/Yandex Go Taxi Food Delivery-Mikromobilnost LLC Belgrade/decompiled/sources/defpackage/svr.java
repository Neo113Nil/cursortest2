package defpackage;

import androidx.compose.foundation.g;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lsvr;", "Lj530;", "Landroidx/compose/foundation/g;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class svr extends j530 {
    public final zx40 a;

    public svr(zx40 zx40Var) {
        this.a = zx40Var;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new g(this.a, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof svr) {
            return jl40.l(this.a, ((svr) obj).a);
        }
        return false;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        ((g) e530Var).I0(this.a);
    }

    public final int hashCode() {
        zx40 zx40Var = this.a;
        if (zx40Var != null) {
            return zx40Var.hashCode();
        }
        return 0;
    }
}
