package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class tul extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ bg5 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tul(bg5 bg5Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = bg5Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                tul tulVar = new tul(this.m, continuation, 0);
                tulVar.l = obj;
                return tulVar;
            default:
                tul tulVar2 = new tul(this.m, continuation, 1);
                tulVar2.l = obj;
                return tulVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        pfm pfmVar = (pfm) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((tul) create(pfmVar, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                pfm pfmVar = (pfm) this.l;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    final int i2 = 0;
                    final bg5 bg5Var = this.m;
                    Function1 function1 = new Function1() { // from class: sul
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i2) {
                                case 0:
                                    bg5Var.e();
                                    break;
                                default:
                                    bg5Var.e();
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    this.l = null;
                    this.k = 1;
                    if (g6s.e(pfmVar, function1, null, null, this, 13) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                pfm pfmVar2 = (pfm) this.l;
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    final int i4 = 1;
                    final bg5 bg5Var2 = this.m;
                    Function1 function12 = new Function1() { // from class: sul
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i4) {
                                case 0:
                                    bg5Var2.e();
                                    break;
                                default:
                                    bg5Var2.e();
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    this.l = null;
                    this.k = 1;
                    if (g6s.e(pfmVar2, function12, null, null, this, 13) == nm6Var2) {
                    }
                } else if (i3 != 1) {
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
