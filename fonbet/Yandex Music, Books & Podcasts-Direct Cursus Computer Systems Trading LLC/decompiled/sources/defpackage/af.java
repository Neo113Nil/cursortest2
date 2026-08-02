package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class af extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Function0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ af(Function0 function0, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = function0;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                af afVar = new af(this.m, continuation, 0);
                afVar.l = obj;
                return afVar;
            case 1:
                af afVar2 = new af(this.m, continuation, 1);
                afVar2.l = obj;
                return afVar2;
            case 2:
                af afVar3 = new af(this.m, continuation, 2);
                afVar3.l = obj;
                return afVar3;
            default:
                af afVar4 = new af(this.m, continuation, 3);
                afVar4.l = obj;
                return afVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((af) create((pfm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                rjc rjcVar = (rjc) this.l;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    Object invoke = this.m.invoke();
                    this.l = null;
                    this.k = 1;
                    if (rjcVar.emit(invoke, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    pfm pfmVar = (pfm) this.l;
                    lna lnaVar = new lna(2, this.m);
                    this.k = 1;
                    if (g6s.e(pfmVar, null, null, lnaVar, this, 7) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    pfm pfmVar2 = (pfm) this.l;
                    lna lnaVar2 = new lna(3, this.m);
                    this.k = 1;
                    if (g6s.e(pfmVar2, null, null, lnaVar2, this, 7) == nm6Var3) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                pfm pfmVar3 = (pfm) this.l;
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    ow1 ow1Var = new ow1(this.m, (Continuation) null, 6);
                    this.l = null;
                    this.k = 1;
                    if (g6s.e(pfmVar3, null, ow1Var, null, this, 11) == nm6Var4) {
                    }
                } else if (i4 != 1) {
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
