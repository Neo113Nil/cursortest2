package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class y1q implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ z1q b;

    public /* synthetic */ y1q(z1q z1qVar, int i) {
        this.a = i;
        this.b = z1qVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                t1q t1qVar = (t1q) obj;
                if (!t1qVar.g) {
                    xdr xdrVar = this.b.j;
                    q7q q7qVar = new q7q(t1qVar);
                    xdrVar.getClass();
                    xdrVar.m(null, q7qVar);
                }
                break;
            default:
                tid tidVar = (tid) obj;
                z1q z1qVar = this.b;
                tid tidVar2 = z1qVar.i;
                if (tidVar2 != null) {
                    tidVar2.b();
                }
                z1qVar.i = tidVar;
                if (tidVar != null) {
                    tidVar.a(z1qVar.e.c.r.k);
                }
                break;
        }
        return Unit.a;
    }
}
