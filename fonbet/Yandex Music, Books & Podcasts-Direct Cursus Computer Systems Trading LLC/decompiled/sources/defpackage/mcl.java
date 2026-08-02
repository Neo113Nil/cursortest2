package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class mcl implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ ncl b;

    public /* synthetic */ mcl(ncl nclVar, int i) {
        this.a = i;
        this.b = nclVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        ncl nclVar = this.b;
        switch (i) {
            case 0:
                nclVar.m.c(((Number) obj).floatValue());
                break;
            case 1:
                uzc uzcVar = nclVar.l;
                uzcVar.getClass();
                ((g6q) obj).getClass();
                msa msaVar = nsa.b;
                ssa ssaVar = ssa.SECONDS;
                uzcVar.b(yd5.M(1, ssaVar), yd5.M(0, ssaVar));
                break;
            case 2:
                h6q h6qVar = (h6q) obj;
                uzc uzcVar2 = nclVar.l;
                uzcVar2.getClass();
                h6qVar.getClass();
                uzcVar2.d = h6qVar;
                msa msaVar2 = nsa.b;
                ssa ssaVar2 = ssa.SECONDS;
                uzcVar2.b(yd5.M(1, ssaVar2), yd5.M(0, ssaVar2));
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                xdr xdrVar = nclVar.e;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                break;
        }
        return Unit.a;
    }
}
