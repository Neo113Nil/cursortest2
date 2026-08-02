package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class s9l0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ t9l0 b;

    public /* synthetic */ s9l0(t9l0 t9l0Var, int i) {
        this.a = i;
        this.b = t9l0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        t9l0 t9l0Var = this.b;
        switch (i) {
            case 0:
                t9l0Var.Lg((lgl0) obj);
                break;
            default:
                t9l0Var.W.d((d0l0) obj);
                break;
        }
        return zy11Var;
    }
}
