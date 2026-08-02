package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class ulc implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ xqn b;

    public /* synthetic */ ulc(xqn xqnVar, int i) {
        this.a = i;
        this.b = xqnVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.a = obj;
                throw new p2(this);
            case 1:
                this.b.a = obj;
                throw new p2(this);
            default:
                xqn xqnVar = this.b;
                if (xqnVar.a == ugj.a) {
                    xqnVar.a = obj;
                    return Unit.a;
                }
                xq0.x("Flow has more than one element");
                return null;
        }
    }
}
