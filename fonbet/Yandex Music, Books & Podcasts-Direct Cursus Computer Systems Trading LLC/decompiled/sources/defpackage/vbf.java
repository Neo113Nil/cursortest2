package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vbf extends fq5 {
    public final Object c;
    public final Boolean d;
    public final d85 e;

    public vbf(Object obj, Boolean bool, d85 d85Var, Function1 function1, sd5 sd5Var) {
        super(sd5Var, function1);
        this.c = obj;
        this.d = bool;
        this.e = d85Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vbf)) {
            return false;
        }
        vbf vbfVar = (vbf) obj;
        return Intrinsics.d(this.c, vbfVar.c) && this.d.equals(vbfVar.d) && this.e.equals(vbfVar.e);
    }

    public final int hashCode() {
        Object obj = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + (((-582345233) + (obj != null ? obj.hashCode() : 0)) * 31)) * 31);
    }
}
