package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class ujw extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ xab m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ujw(xab xabVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = xabVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                ujw ujwVar = new ujw(this.m, continuation, 0);
                ujwVar.l = obj;
                return ujwVar;
            case 1:
                ujw ujwVar2 = new ujw(this.m, continuation, 1);
                ujwVar2.l = obj;
                return ujwVar2;
            case 2:
                ujw ujwVar3 = new ujw(this.m, continuation, 2);
                ujwVar3.l = obj;
                return ujwVar3;
            default:
                ujw ujwVar4 = new ujw(this.m, continuation, 3);
                ujwVar4.l = obj;
                return ujwVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((ujw) create((b9n) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((ujw) create((jkw) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((ujw) create((b9n) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((ujw) create((jkw) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
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
                this.l = null;
                this.k = 1;
                b9nVar.getClass();
                Object V = x97.V(dm6.c, new c5l(b9nVar, ((vab) this.m).a, (Continuation) null, 21), this);
                return V == nm6Var ? nm6Var : V;
            case 1:
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
                String str = ((vab) this.m).a;
                this.l = null;
                this.k = 1;
                jkwVar.getClass();
                qj6 qj6Var = new qj6(new taq(str));
                return qj6Var == nm6Var2 ? nm6Var2 : qj6Var;
            case 2:
                b9n b9nVar2 = (b9n) this.l;
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                this.l = null;
                this.k = 1;
                b9nVar2.getClass();
                Object V2 = x97.V(dm6.c, new rfg(b9nVar2, ((tab) this.m).a, (Continuation) null, 23), this);
                return V2 == nm6Var3 ? nm6Var3 : V2;
            default:
                jkw jkwVar2 = (jkw) this.l;
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 != 0) {
                    if (i4 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                String str2 = ((tab) this.m).a;
                this.l = null;
                this.k = 1;
                Object c = jkwVar2.c(str2, this);
                return c == nm6Var4 ? nm6Var4 : c;
        }
    }
}
