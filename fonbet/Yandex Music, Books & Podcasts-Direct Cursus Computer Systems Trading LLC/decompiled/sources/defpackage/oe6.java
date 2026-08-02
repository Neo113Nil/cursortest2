package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class oe6 {
    public final qne a;
    public final qne b;
    public final qne c;

    public oe6(qne qneVar, qne qneVar2, qne qneVar3) {
        qneVar2.getClass();
        this.a = qneVar;
        this.b = qneVar2;
        this.c = qneVar3;
    }

    public final boolean a(o14 o14Var) {
        o14Var.getClass();
        Object obj = o14Var.a;
        qne qneVar = this.a;
        if (!Intrinsics.d(obj, qneVar != null ? qneVar.b : null) || !Intrinsics.d(o14Var.b, this.b.b)) {
            return false;
        }
        Object obj2 = o14Var.c;
        qne qneVar2 = this.c;
        return Intrinsics.d(obj2, qneVar2 != null ? qneVar2.b : null);
    }
}
