package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lypu;", "Lj530;", "Lzpu;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ypu extends j530 {
    public final so5 a;

    public ypu(so5 so5Var) {
        this.a = so5Var;
    }

    @Override // defpackage.j530
    public final e530 a() {
        zpu zpuVar = new zpu();
        zpuVar.a = this.a;
        return zpuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ypu ypuVar = obj instanceof ypu ? (ypu) obj : null;
        if (ypuVar == null) {
            return false;
        }
        return jl40.l(this.a, ypuVar.a);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        ((zpu) e530Var).a = this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a);
    }
}
