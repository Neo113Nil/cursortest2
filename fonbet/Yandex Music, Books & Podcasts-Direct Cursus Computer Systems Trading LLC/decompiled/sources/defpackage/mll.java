package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class mll implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ tll b;

    public /* synthetic */ mll(tll tllVar, int i) {
        this.a = i;
        this.b = tllVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                xdr xdrVar = this.b.d;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                break;
            default:
                this.b.e.l((yll) obj);
                break;
        }
        return Unit.a;
    }
}
