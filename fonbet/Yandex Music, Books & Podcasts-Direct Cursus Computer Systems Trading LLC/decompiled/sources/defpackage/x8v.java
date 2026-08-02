package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class x8v implements rjc {
    public final /* synthetic */ fk0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ act d;

    public x8v(fk0 fk0Var, long j, long j2, act actVar) {
        this.a = fk0Var;
        this.b = j;
        this.c = j2;
        this.d = actVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        tre treVar = (tre) obj;
        if (treVar instanceof rqm) {
            Object f = this.a.f(new d85(this.b), continuation);
            return f == nm6.a ? f : Unit.a;
        }
        if ((treVar instanceof sqm) || (treVar instanceof qqm)) {
            Object c = fk0.c(this.a, new d85(this.c), this.d, null, continuation, 12);
            if (c == nm6.a) {
                return c;
            }
        }
        return Unit.a;
    }
}
