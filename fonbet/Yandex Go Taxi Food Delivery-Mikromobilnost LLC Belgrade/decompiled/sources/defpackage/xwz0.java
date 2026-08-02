package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class xwz0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ wwz0 b;

    public /* synthetic */ xwz0(wwz0 wwz0Var, int i) {
        this.a = i;
        this.b = wwz0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        wwz0 wwz0Var = this.b;
        switch (i) {
            case 0:
                wwz0Var.render((zwz0) obj);
                break;
            case 1:
                wwz0Var.render((zwz0) obj);
                break;
            default:
                wwz0Var.render((zwz0) obj);
                break;
        }
        return zy11Var;
    }
}
