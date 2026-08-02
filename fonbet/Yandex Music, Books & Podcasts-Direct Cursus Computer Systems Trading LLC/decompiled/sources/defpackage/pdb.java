package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pdb extends j5m {
    public final thp m;
    public final jyr n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdb(String str, int i) {
        super(str, null, i);
        str.getClass();
        this.m = thp.b;
        this.n = btf.b(new de(i, 16, this, str));
    }

    @Override // defpackage.j5m, defpackage.mhp
    public final ivf a() {
        return this.m;
    }

    @Override // defpackage.j5m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof mhp)) {
            return false;
        }
        mhp mhpVar = (mhp) obj;
        return mhpVar.a() == thp.b && Intrinsics.d(this.a, mhpVar.i()) && Intrinsics.d(gld.J(this), gld.J(mhpVar));
    }

    @Override // defpackage.j5m, defpackage.mhp
    public final mhp h(int i) {
        return ((mhp[]) this.n.getValue())[i];
    }

    @Override // defpackage.j5m
    public final int hashCode() {
        int hashCode = this.a.hashCode();
        c7 c7Var = new c7(this);
        int i = 1;
        while (c7Var.hasNext()) {
            int i2 = i * 31;
            String str = (String) c7Var.next();
            i = i2 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i;
    }

    @Override // defpackage.j5m
    public final String toString() {
        return CollectionsKt.X(new vz0(5, this), ", ", dfi.i(new StringBuilder(), this.a, '('), ")", null, 56);
    }
}
