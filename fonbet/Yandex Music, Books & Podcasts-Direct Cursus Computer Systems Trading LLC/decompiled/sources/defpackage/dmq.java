package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class dmq extends c23 {
    public final Function1 a;
    public l13 b;
    public final jyr c = btf.b(new oxo(25, this));

    public dmq(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.c23
    public final Object a(l13 l13Var) {
        l13Var.getClass();
        this.b = l13Var;
        return this.c.getValue();
    }
}
