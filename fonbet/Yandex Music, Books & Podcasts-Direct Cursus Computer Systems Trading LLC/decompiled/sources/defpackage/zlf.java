package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class zlf implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ cmf b;

    public /* synthetic */ zlf(cmf cmfVar, int i) {
        this.a = i;
        this.b = cmfVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                cmf cmfVar = this.b;
                cmfVar.c.l(null);
                cmfVar.b((xxq) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                xdr xdrVar = this.b.c;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                break;
        }
        return Unit.a;
    }
}
