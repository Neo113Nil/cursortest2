package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class f4g extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ g4g l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f4g(g4g g4gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = g4gVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new f4g(this.l, continuation, 0);
            case 1:
                return new f4g(this.l, continuation, 1);
            default:
                return new f4g(this.l, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((f4g) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                Object obj2 = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    g4g g4gVar = this.l;
                    l0g l0gVar = g4gVar.a;
                    int i2 = g4gVar.f;
                    this.k = 1;
                    dq7 dq7Var = ca8.a;
                    Object V = x97.V(mn7.d, new dv0(l0gVar, i2, continuation, 5), this);
                    if (V != obj2) {
                        V = Unit.a;
                    }
                    if (V == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                Object obj3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    l0g l0gVar2 = this.l.a;
                    this.k = 1;
                    dq7 dq7Var2 = ca8.a;
                    Object V2 = x97.V(mn7.d, new jmd(l0gVar2, continuation, 15), this);
                    if (V2 != obj3) {
                        V2 = Unit.a;
                    }
                    if (V2 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var = nm6.a;
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
                l0g l0gVar3 = this.l.a;
                this.k = 1;
                dq7 dq7Var3 = ca8.a;
                Object V3 = x97.V(mn7.d, new j0g(l0gVar3, null), this);
                return V3 == nm6Var ? nm6Var : V3;
        }
    }
}
