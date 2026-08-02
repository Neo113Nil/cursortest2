package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class vew implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ afw b;

    public /* synthetic */ vew(afw afwVar, int i) {
        this.a = i;
        this.b = afwVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                prw prwVar = (prw) this.b.e.getValue();
                prwVar.getClass();
                Object V = x97.V(dm6.b, new j9w(prwVar, (List) obj, null, 8), continuation);
                nm6 nm6Var = nm6.a;
                if (V != nm6Var) {
                    V = Unit.a;
                }
                if (V != nm6Var) {
                    break;
                }
                break;
            case 1:
                afw afwVar = this.b;
                ((qmg) afwVar.c()).n = (sqw) obj;
                ((qmg) afwVar.c()).j();
                break;
            default:
                afw afwVar2 = this.b;
                ((qmg) afwVar2.c()).n = (sqw) obj;
                ((qmg) afwVar2.c()).j();
                break;
        }
        return Unit.a;
    }
}
