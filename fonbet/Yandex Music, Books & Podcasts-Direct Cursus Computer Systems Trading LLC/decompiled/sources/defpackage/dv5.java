package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class dv5 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs1 b;

    public /* synthetic */ dv5(hs1 hs1Var, int i) {
        this.a = i;
        this.b = hs1Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                u6k u6kVar = this.b.a;
                u6kVar.i(u6kVar.h() + 1);
                break;
            case 1:
                u6k u6kVar2 = this.b.a;
                u6kVar2.i(u6kVar2.h() + 1);
                break;
            case 2:
                u6k u6kVar3 = this.b.a;
                u6kVar3.i(u6kVar3.h() + 1);
                break;
            default:
                u6k u6kVar4 = this.b.a;
                u6kVar4.i(u6kVar4.h() + 1);
                break;
        }
        return Unit.a;
    }
}
