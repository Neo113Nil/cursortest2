package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nvf extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ CoroutineContext l;
    public final /* synthetic */ lvf m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nvf(CoroutineContext coroutineContext, lvf lvfVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = coroutineContext;
        this.m = lvfVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new nvf(this.l, this.m, continuation, 0);
            default:
                return new nvf(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((nvf) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                Object obj2 = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    g gVar = g.a;
                    CoroutineContext coroutineContext = this.l;
                    boolean d = Intrinsics.d(coroutineContext, gVar);
                    Continuation continuation = null;
                    lvf lvfVar = this.m;
                    if (d) {
                        this.k = 1;
                        Object O = zsd.O(lvfVar.a, new ptd(lvfVar, continuation, 20), this);
                        if (O != obj2) {
                            O = Unit.a;
                        }
                        if (O == obj2) {
                        }
                    } else {
                        mvf mvfVar = new mvf(lvfVar, continuation, 0);
                        this.k = 2;
                        if (x97.V(coroutineContext, mvfVar, this) == obj2) {
                        }
                    }
                } else if (i != 1 && i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    g gVar2 = g.a;
                    CoroutineContext coroutineContext2 = this.l;
                    boolean d2 = Intrinsics.d(coroutineContext2, gVar2);
                    lvf lvfVar2 = this.m;
                    if (d2) {
                        this.k = 1;
                        if (lvfVar2.b(this) == nm6Var) {
                        }
                    } else {
                        mvf mvfVar2 = new mvf(lvfVar2, null, 1);
                        this.k = 2;
                        if (x97.V(coroutineContext2, mvfVar2, this) == nm6Var) {
                        }
                    }
                } else if (i2 != 1 && i2 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
