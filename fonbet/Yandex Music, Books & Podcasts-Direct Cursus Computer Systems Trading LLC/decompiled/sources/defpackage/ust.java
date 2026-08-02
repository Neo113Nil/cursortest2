package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class ust implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ mmo b;

    public /* synthetic */ ust(mmo mmoVar, int i) {
        this.a = i;
        this.b = mmoVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                ((oi) this.b.f).c(Boolean.FALSE);
                return Unit.a;
            default:
                oi oiVar = (oi) this.b.g;
                Unit unit = Unit.a;
                oiVar.c(unit);
                return unit;
        }
    }
}
