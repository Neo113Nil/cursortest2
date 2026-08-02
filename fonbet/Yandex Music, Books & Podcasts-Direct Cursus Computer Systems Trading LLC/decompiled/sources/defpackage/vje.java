package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vje implements tm0 {
    public final osa a;
    public final jyn b;
    public final long c;

    public vje(osa osaVar, jyn jynVar, long j) {
        this.a = osaVar;
        this.b = jynVar;
        this.c = j;
    }

    @Override // defpackage.tm0
    public final rzt a(oct octVar) {
        tzt a = this.a.a(octVar);
        yg3 yg3Var = new yg3();
        yg3Var.c = a;
        yg3Var.d = this.b;
        yg3Var.a = (a.u() + a.o()) * 1000000;
        yg3Var.b = this.c * 1000000;
        return yg3Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vje) {
            vje vjeVar = (vje) obj;
            if (Intrinsics.d(vjeVar.a, this.a) && vjeVar.b == this.b && vjeVar.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public vje(act actVar) {
        this(actVar, jyn.b, 0);
    }
}
