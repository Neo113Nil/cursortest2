package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class pvj extends aur implements Function2 {
    public final /* synthetic */ int j;
    public jtm k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ jtm n;
    public final /* synthetic */ tqn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pvj(jtm jtmVar, tqn tqnVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = jtmVar;
        this.o = tqnVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                pvj pvjVar = new pvj(this.n, this.o, continuation, 0);
                pvjVar.m = obj;
                return pvjVar;
            default:
                pvj pvjVar2 = new pvj(this.n, this.o, continuation, 1);
                pvjVar2.m = obj;
                return pvjVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((pvj) create((iwj) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((pvj) create((k3n) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        jtm jtmVar;
        jtm jtmVar2;
        jtm jtmVar3;
        jtm jtmVar4;
        switch (this.j) {
            case 0:
                iwj iwjVar = (iwj) this.m;
                nm6 nm6Var = nm6.a;
                int i = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    boolean d = Intrinsics.d(iwjVar, hwj.a);
                    jtmVar = this.n;
                    if (!d && !(iwjVar instanceof dwj)) {
                        boolean z = iwjVar instanceof ewj;
                        tqn tqnVar = this.o;
                        if (!z) {
                            if (!Intrinsics.d(iwjVar, gwj.a)) {
                                b6e.s();
                                break;
                            } else if (!tqnVar.a) {
                                this.m = iwjVar;
                                this.k = jtmVar;
                                this.l = 2;
                                if (y2x.o(500L, this) == nm6Var) {
                                }
                                jtmVar2 = jtmVar;
                            }
                        } else if (tqnVar.a) {
                            tqnVar.a = false;
                        } else if (jtmVar.b.getValue() instanceof gwj) {
                            this.m = iwjVar;
                            this.k = jtmVar;
                            this.l = 1;
                            if (y2x.o(500L, this) == nm6Var) {
                            }
                            jtmVar2 = jtmVar;
                        }
                        jtmVar = jtmVar2;
                    }
                } else if (i != 1 && i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    jtmVar2 = this.k;
                    qgg.h0(obj);
                    jtmVar = jtmVar2;
                }
                jtmVar.setValue(iwjVar);
                break;
            default:
                k3n k3nVar = (k3n) this.m;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.l;
                if (i2 == 0) {
                    qgg.h0(obj);
                    boolean z2 = k3nVar instanceof h3n;
                    tqn tqnVar2 = this.o;
                    jtmVar3 = this.n;
                    if (!z2) {
                        if (!(k3nVar instanceof e3n)) {
                            if (!Intrinsics.d(k3nVar, j3n.a)) {
                                b6e.s();
                                break;
                            } else if (!tqnVar2.a) {
                                this.m = k3nVar;
                                this.k = jtmVar3;
                                this.l = 2;
                                if (y2x.o(350L, this) == nm6Var2) {
                                }
                                jtmVar4 = jtmVar3;
                            }
                        } else {
                            tqnVar2.a = false;
                        }
                    } else if (tqnVar2.a) {
                        tqnVar2.a = false;
                    } else if (jtmVar3.b.getValue() instanceof j3n) {
                        this.m = k3nVar;
                        this.k = jtmVar3;
                        this.l = 1;
                        if (y2x.o(350L, this) == nm6Var2) {
                        }
                        jtmVar4 = jtmVar3;
                    }
                    jtmVar3 = jtmVar4;
                } else if (i2 != 1 && i2 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    jtmVar4 = this.k;
                    qgg.h0(obj);
                    jtmVar3 = jtmVar4;
                }
                jtmVar3.setValue(k3nVar);
                break;
        }
        return Unit.a;
    }
}
