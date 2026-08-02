package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class pe6 {
    public final nnk a;
    public final nnk b;
    public final nnk c;

    public pe6(nnk nnkVar, nnk nnkVar2, nnk nnkVar3) {
        nnkVar2.getClass();
        this.a = nnkVar;
        this.b = nnkVar2;
        this.c = nnkVar3;
    }

    public final boolean a(p14 p14Var) {
        p14Var.getClass();
        Object obj = p14Var.a;
        nnk nnkVar = this.a;
        if (!Intrinsics.d(obj, nnkVar != null ? nnkVar.a : null) || !Intrinsics.d(p14Var.b, this.b.a)) {
            return false;
        }
        Object obj2 = p14Var.c;
        nnk nnkVar2 = this.c;
        return Intrinsics.d(obj2, nnkVar2 != null ? nnkVar2.a : null);
    }
}
