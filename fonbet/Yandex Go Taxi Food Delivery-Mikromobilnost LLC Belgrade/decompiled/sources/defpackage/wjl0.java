package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class wjl0 {
    public final mxd a;
    public final List b;

    public wjl0() {
        this(new mxd(0), EmptyList.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjl0)) {
            return false;
        }
        wjl0 wjl0Var = (wjl0) obj;
        return jl40.l(this.a, wjl0Var.a) && jl40.l(this.b, wjl0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Rule(condition=" + this.a + ", effects=" + this.b + Extension.C_BRAKE;
    }

    public wjl0(mxd mxdVar, List list) {
        this.a = mxdVar;
        this.b = list;
    }
}
