package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class j4g extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ n4g l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j4g(n4g n4gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = n4gVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new j4g(this.l, continuation, 0);
            default:
                return new j4g(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((j4g) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((j4g) create((wzf) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                n4g n4gVar = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    g4g g4gVar = n4gVar.b;
                    this.k = 1;
                    obj = g4gVar.b(this);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2 || i == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                int ordinal = ((c4g) obj).ordinal();
                if (ordinal == 0) {
                    this.k = 2;
                    if (n4gVar.b(this) == nm6Var) {
                        return nm6Var;
                    }
                } else if (ordinal == 1) {
                    this.k = 3;
                    if (n4g.a(n4gVar, this) == nm6Var) {
                        return nm6Var;
                    }
                } else if (ordinal != 2) {
                    b6e.s();
                    return null;
                }
                return Unit.a;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    g4g g4gVar2 = this.l.b;
                    this.k = 1;
                    obj = g4gVar2.b(this);
                    if (obj == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Boolean.valueOf(obj == c4g.a);
        }
    }
}
