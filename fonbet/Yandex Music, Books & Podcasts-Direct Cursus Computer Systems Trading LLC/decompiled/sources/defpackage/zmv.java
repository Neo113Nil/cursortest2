package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class zmv implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ eps b;

    public /* synthetic */ zmv(eps epsVar, int i) {
        this.a = i;
        this.b = epsVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                j0q j0qVar = (j0q) this.b.d;
                Unit unit = Unit.a;
                Object emit = j0qVar.emit(unit, continuation);
                return emit == nm6.a ? emit : unit;
            default:
                j0q j0qVar2 = (j0q) this.b.d;
                Unit unit2 = Unit.a;
                Object emit2 = j0qVar2.emit(unit2, continuation);
                return emit2 == nm6.a ? emit2 : unit2;
        }
    }
}
