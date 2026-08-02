package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class gcu implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ icu b;

    public /* synthetic */ gcu(icu icuVar, int i) {
        this.a = i;
        this.b = icuVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                xdr xdrVar = this.b.a;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                xdr xdrVar2 = this.b.a;
                xdrVar2.getClass();
                xdrVar2.m(null, bool2);
                break;
        }
        return Unit.a;
    }
}
