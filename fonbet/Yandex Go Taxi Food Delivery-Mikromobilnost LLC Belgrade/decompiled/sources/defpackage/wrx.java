package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class wrx implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ ebr0 b;

    public /* synthetic */ wrx(ebr0 ebr0Var, int i) {
        this.a = i;
        this.b = ebr0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ebr0 ebr0Var = this.b;
        switch (i) {
            case 0:
                ebr0Var.render((d6r0) obj);
                break;
            default:
                ebr0Var.render((d6r0) obj);
                break;
        }
        return zy11Var;
    }
}
