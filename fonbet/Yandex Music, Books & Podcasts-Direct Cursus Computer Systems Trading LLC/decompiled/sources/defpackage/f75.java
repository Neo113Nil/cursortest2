package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f75 implements wfm {
    public final nrf a;
    public final f73 b;

    public f75(nrf nrfVar) {
        f73 f73Var = f73.d;
        nrfVar.getClass();
        this.a = nrfVar;
        this.b = f73Var;
    }

    @Override // defpackage.drf
    public final nrf a() {
        return this.a;
    }

    @Override // defpackage.wfm
    public final f73 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f75)) {
            return false;
        }
        f75 f75Var = (f75) obj;
        return Intrinsics.d(this.a, f75Var.a) && this.b == f75Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CollectionWaveBlock(meta=" + this.a + ", showPolicy=" + this.b + ")";
    }
}
