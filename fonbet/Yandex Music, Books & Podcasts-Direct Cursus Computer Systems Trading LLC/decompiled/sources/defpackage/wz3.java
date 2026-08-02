package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class wz3 implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ pjc b;
    public final /* synthetic */ a04 c;

    public /* synthetic */ wz3(pjc pjcVar, a04 a04Var, int i) {
        this.a = i;
        this.b = pjcVar;
        this.c = a04Var;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new vz3(rjcVar, this.c, 0), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect2 = this.b.collect(new vz3(rjcVar, this.c, 1), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
