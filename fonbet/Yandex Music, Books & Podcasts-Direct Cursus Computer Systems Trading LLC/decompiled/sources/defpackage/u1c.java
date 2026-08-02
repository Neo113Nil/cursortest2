package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class u1c extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ e6l k;
    public /* synthetic */ e6l l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1c(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        e6l e6lVar = (e6l) obj;
        e6l e6lVar2 = (e6l) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                u1c u1cVar = new u1c(3, 0, continuation);
                u1cVar.k = e6lVar;
                u1cVar.l = e6lVar2;
                return u1cVar.invokeSuspend(Unit.a);
            default:
                u1c u1cVar2 = new u1c(3, 1, continuation);
                u1cVar2.k = e6lVar;
                u1cVar2.l = e6lVar2;
                return u1cVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        n7q n7qVar;
        n7q n7qVar2;
        switch (this.j) {
            case 0:
                e6l e6lVar = this.k;
                e6l e6lVar2 = this.l;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                d6l x = p6g.x(e6lVar);
                return new Pair(Boolean.valueOf(p6g.C(e6lVar) || p6g.C(e6lVar2)), Boolean.valueOf((x == null || (n7qVar = x.a) == null) ? false : ((Boolean) wdg.A(n7qVar, hs4.i)).booleanValue()));
            default:
                e6l e6lVar3 = this.k;
                e6l e6lVar4 = this.l;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                d6l x2 = p6g.x(e6lVar4);
                if (x2 != null && (n7qVar2 = x2.a) != null) {
                    return n7qVar2;
                }
                d6l x3 = p6g.x(e6lVar3);
                if (x3 != null) {
                    return x3.a;
                }
                return null;
        }
    }
}
