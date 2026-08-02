package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class i34 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ j34 b;

    public /* synthetic */ i34(j34 j34Var, int i) {
        this.a = i;
        this.b = j34Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object emit = this.b.g.emit((f24) obj, continuation);
                return emit == nm6.a ? emit : Unit.a;
            case 1:
                Object emit2 = this.b.g.emit((f24) obj, continuation);
                return emit2 == nm6.a ? emit2 : Unit.a;
            case 2:
                x0q x0qVar = this.b.h;
                Unit unit = Unit.a;
                Object emit3 = x0qVar.emit(unit, continuation);
                return emit3 == nm6.a ? emit3 : unit;
            default:
                x0q x0qVar2 = this.b.i;
                Unit unit2 = Unit.a;
                Object emit4 = x0qVar2.emit(unit2, continuation);
                return emit4 == nm6.a ? emit4 : unit2;
        }
    }
}
