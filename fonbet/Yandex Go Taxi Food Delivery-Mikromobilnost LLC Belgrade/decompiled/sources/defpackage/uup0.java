package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class uup0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ vup0 b;

    public /* synthetic */ uup0(vup0 vup0Var, int i) {
        this.a = i;
        this.b = vup0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        vup0 vup0Var = this.b;
        switch (i) {
            case 0:
                ((tup0) vup0Var.Dg()).C8(((qo21) obj).b());
                break;
            default:
                ((tup0) vup0Var.Dg()).ie((uxp0) obj);
                break;
        }
        return zy11Var;
    }
}
