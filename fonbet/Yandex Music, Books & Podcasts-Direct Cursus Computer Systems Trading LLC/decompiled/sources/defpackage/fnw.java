package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class fnw extends aur implements pyc {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ rjc l;
    public /* synthetic */ Object m;
    public final /* synthetic */ hnw n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fnw(Continuation continuation, hnw hnwVar, int i) {
        super(3, continuation);
        this.j = i;
        this.n = hnwVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rjc rjcVar = (rjc) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                fnw fnwVar = new fnw(continuation, this.n, 0);
                fnwVar.l = rjcVar;
                fnwVar.m = obj2;
                return fnwVar.invokeSuspend(Unit.a);
            default:
                fnw fnwVar2 = new fnw(continuation, this.n, 1);
                fnwVar2.l = rjcVar;
                fnwVar2.m = obj2;
                return fnwVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        pjc u21Var;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    rjc rjcVar = this.l;
                    sqw sqwVar = (sqw) this.m;
                    hnw hnwVar = this.n;
                    pjc C = zsd.C(zsd.M0(hnwVar.d.b(sqwVar), new fnw(null, hnwVar, 1)), 0);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar, C, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar2 = this.l;
                    vkw vkwVar = (vkw) this.m;
                    if (!Intrinsics.d(vkwVar, ukw.b)) {
                        boolean z = vkwVar instanceof rkw;
                        hnw hnwVar2 = this.n;
                        if (!z) {
                            if (!(vkwVar instanceof skw)) {
                                if (!(vkwVar instanceof tkw)) {
                                    b6e.s();
                                    break;
                                } else {
                                    u21Var = new u21(26, hnwVar2.f.b, hnwVar2, ((tkw) vkwVar).b);
                                }
                            } else {
                                u21Var = hnw.a(hnwVar2, ((skw) vkwVar).b);
                            }
                        } else {
                            u21Var = hnw.a(hnwVar2, ((rkw) vkwVar).b);
                        }
                    } else {
                        u21Var = z4b.a;
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar2, u21Var, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
