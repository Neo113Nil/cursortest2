package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class zyy0 extends bzy0 {
    public final hj40 a;
    public final List b;

    public zyy0(hj40 hj40Var, List list) {
        this.a = hj40Var;
        this.b = list;
    }

    @Override // defpackage.bzy0
    public final hj40 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyy0)) {
            return false;
        }
        zyy0 zyy0Var = (zyy0) obj;
        return jl40.l(this.a, zyy0Var.a) && jl40.l(this.b, zyy0Var.b);
    }

    public final int hashCode() {
        hj40 hj40Var = this.a;
        return this.b.hashCode() + ((hj40Var == null ? 0 : hj40Var.hashCode()) * 31);
    }

    public final String toString() {
        return "GroundThreadsState(stop=" + this.a + ", threads=" + this.b + Extension.C_BRAKE;
    }
}
