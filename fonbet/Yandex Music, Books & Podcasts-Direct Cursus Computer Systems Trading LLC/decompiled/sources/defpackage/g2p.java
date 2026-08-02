package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class g2p implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ xqn b;
    public final /* synthetic */ mm6 c;
    public final /* synthetic */ i1r d;

    public /* synthetic */ g2p(xqn xqnVar, mm6 mm6Var, i1r i1rVar, int i) {
        this.a = i;
        this.b = xqnVar;
        this.c = mm6Var;
        this.d = i1rVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                xqn xqnVar = this.b;
                r2f r2fVar = (r2f) xqnVar.a;
                if (r2fVar != null) {
                    r2fVar.g(null);
                }
                xqnVar.a = x97.y(this.c, null, null, new f2p(this.d, str, null, 0), 3);
                break;
            default:
                String str2 = (String) obj;
                xqn xqnVar2 = this.b;
                r2f r2fVar2 = (r2f) xqnVar2.a;
                if (r2fVar2 != null) {
                    r2fVar2.g(null);
                }
                xqnVar2.a = x97.y(this.c, null, null, new f2p(this.d, str2, null, 1), 3);
                break;
        }
        return Unit.a;
    }
}
