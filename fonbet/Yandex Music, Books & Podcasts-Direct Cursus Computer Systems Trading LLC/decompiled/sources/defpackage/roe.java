package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class roe extends c23 {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public roe(Object obj) {
        obj.getClass();
        this.b = obj;
    }

    @Override // defpackage.c23
    public final Object a(l13 l13Var) {
        int i = this.a;
        l13Var.getClass();
        switch (i) {
            case 0:
                return this.b;
            default:
                return ((Function1) this.b).invoke(l13Var);
        }
    }

    public roe(Function1 function1) {
        this.b = function1;
    }
}
