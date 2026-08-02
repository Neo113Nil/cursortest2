package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class nxu implements qxu {
    public final List a;
    public final r3q b;
    public final v80 c;

    public nxu(List list, r3q r3qVar, v80 v80Var) {
        list.getClass();
        v80Var.getClass();
        this.a = list;
        this.b = r3qVar;
        this.c = v80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxu)) {
            return false;
        }
        nxu nxuVar = (nxu) obj;
        return Intrinsics.d(this.a, nxuVar.a) && this.b.equals(nxuVar.b) && Intrinsics.d(this.c, nxuVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LocallyProlonged(batch=" + this.a + ", sourceEntity=" + this.b + ", analyticsValues=" + this.c + ")";
    }
}
