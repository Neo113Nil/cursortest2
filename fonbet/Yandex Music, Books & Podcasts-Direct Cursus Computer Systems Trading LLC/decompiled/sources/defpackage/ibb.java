package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class ibb implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ pjc b;
    public final /* synthetic */ aab c;

    public /* synthetic */ ibb(xdr xdrVar, aab aabVar, int i) {
        this.a = i;
        this.b = xdrVar;
        this.c = aabVar;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new hbb(rjcVar, this.c, 0), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect2 = this.b.collect(new hbb(rjcVar, this.c, 1), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
