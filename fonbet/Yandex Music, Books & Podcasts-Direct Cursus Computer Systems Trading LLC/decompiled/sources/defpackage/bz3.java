package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class bz3 implements dz3 {
    public final o04 a;
    public final q91 b;
    public final jyr c;
    public final int d;

    public bz3(o04 o04Var) {
        o04Var.getClass();
        this.a = o04Var;
        this.b = o04Var.b;
        this.c = btf.b(new r93(9, this));
        this.d = o04Var.c;
    }

    @Override // defpackage.dz3
    public final q91 c() {
        return this.b;
    }

    @Override // defpackage.dz3
    public final u51 d() {
        return (u51) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bz3) && Intrinsics.d(this.a, ((bz3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.dz3
    public final int t() {
        return this.d;
    }

    public final String toString() {
        return "FromCollection(artist=" + this.a + ")";
    }
}
