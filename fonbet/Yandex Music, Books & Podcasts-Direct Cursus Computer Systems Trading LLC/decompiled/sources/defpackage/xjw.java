package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class xjw extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ s9p m;
    public final /* synthetic */ wab n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xjw(s9p s9pVar, wab wabVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = s9pVar;
        this.n = wabVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                xjw xjwVar = new xjw(this.m, this.n, continuation, 0);
                xjwVar.l = obj;
                return xjwVar;
            default:
                xjw xjwVar2 = new xjw(this.m, this.n, continuation, 1);
                xjwVar2.l = obj;
                return xjwVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((xjw) create((b9n) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((xjw) create((jkw) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                b9n b9nVar = (b9n) this.l;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i != 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                wab wabVar = this.n;
                this.l = null;
                this.k = 1;
                b9nVar.getClass();
                Object V = x97.V(dm6.c, new n71(this.m, wabVar.c, wabVar.e, (Continuation) null, 28), this);
                return V == nm6Var ? nm6Var : V;
            default:
                jkw jkwVar = (jkw) this.l;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                wab wabVar2 = this.n;
                o4q o4qVar = wabVar2.c;
                gxc gxcVar = wabVar2.e;
                this.l = null;
                this.k = 1;
                jkwVar.getClass();
                Object g = jkw.g(jkwVar, this.m, o4qVar, gxcVar, this);
                return g == nm6Var2 ? nm6Var2 : g;
        }
    }
}
