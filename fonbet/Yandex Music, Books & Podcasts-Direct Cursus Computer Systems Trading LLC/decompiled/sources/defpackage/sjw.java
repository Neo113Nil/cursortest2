package defpackage;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class sjw extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ String m;
    public final /* synthetic */ iow n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sjw(String str, iow iowVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = str;
        this.n = iowVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                sjw sjwVar = new sjw(this.m, this.n, continuation, 0);
                sjwVar.l = obj;
                return sjwVar;
            case 1:
                sjw sjwVar2 = new sjw(this.m, this.n, continuation, 1);
                sjwVar2.l = obj;
                return sjwVar2;
            case 2:
                sjw sjwVar3 = new sjw(this.m, this.n, continuation, 2);
                sjwVar3.l = obj;
                return sjwVar3;
            default:
                sjw sjwVar4 = new sjw(this.m, this.n, continuation, 3);
                sjwVar4.l = obj;
                return sjwVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((sjw) create((b9n) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((sjw) create((jkw) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((sjw) create((b9n) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((sjw) create((jkw) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
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
                Object V = x97.V(dm6.c, new ckg((Object) b9nVar, this.m, (Serializable) this.n, (Continuation) null, 21), this);
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
                this.l = null;
                this.k = 1;
                Object b = jkwVar.b(this.m, this.n, this);
                return b == nm6Var2 ? nm6Var2 : b;
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
                Object V2 = x97.V(dm6.c, new ckg((Object) b9nVar2, this.m, (Serializable) this.n, (Continuation) null, 20), this);
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
                this.l = null;
                this.k = 1;
                Object a = jkwVar2.a(this.m, this.n, this);
                return a == nm6Var4 ? nm6Var4 : a;
        }
    }
}
