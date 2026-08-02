package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class zx30 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx30 b;

    public /* synthetic */ zx30(yx30 yx30Var, int i) {
        this.a = i;
        this.b = yx30Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        yx30 yx30Var = this.b;
        switch (i) {
            case 0:
                yx30Var.render((dy30) obj);
                break;
            case 1:
                yx30Var.w0(((Boolean) obj).booleanValue());
                break;
            default:
                yx30Var.U7();
                break;
        }
        return zy11Var;
    }
}
