package defpackage;

import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o18 {
    public final HashMap a = new HashMap();
    public final rp7 b = new rp7(this);
    public bdt c;

    public final void a(c23 c23Var) {
        bdt bdtVar = this.c;
        if (bdtVar != null) {
            this.a.put(bdtVar, c23Var);
        } else {
            Intrinsics.j("currentTypeSpec");
            throw null;
        }
    }

    public final rp7 b(bdt bdtVar) {
        this.c = bdtVar;
        rp7 rp7Var = this.b;
        rp7Var.getClass();
        return rp7Var;
    }

    public final void c(qec qecVar) {
        qecVar.getClass();
        ((Function1) qecVar.b).invoke(this);
    }
}
