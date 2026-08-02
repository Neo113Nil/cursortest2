package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class sg4 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ tg4 l;
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sg4(tg4 tg4Var, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = tg4Var;
        this.m = z;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new sg4(this.l, this.m, continuation, 0);
            default:
                return new sg4(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((sg4) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                tg4 tg4Var = this.l;
                x0q x0qVar = tg4Var.b;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    yg4 yg4Var = tg4Var.a;
                    this.k = 1;
                    obj = yg4Var.a(this.m, this);
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
                rj6 rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    t2i t2iVar = new t2i(((qj6) rj6Var).a);
                    this.k = 2;
                    if (x0qVar.emit(t2iVar, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    t2i t2iVar2 = new t2i((Throwable) ((pj6) rj6Var).a());
                    this.k = 3;
                    if (x0qVar.emit(t2iVar2, this) == nm6Var) {
                        return nm6Var;
                    }
                }
                return Unit.a;
            default:
                tg4 tg4Var2 = this.l;
                x0q x0qVar2 = tg4Var2.d;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    yg4 yg4Var2 = tg4Var2.a;
                    this.k = 1;
                    obj = yg4Var2.c(this.m, this);
                    if (obj == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 == 2 || i2 == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6 rj6Var2 = (rj6) obj;
                if (rj6Var2 instanceof qj6) {
                    t2i t2iVar3 = new t2i(((qj6) rj6Var2).a);
                    this.k = 2;
                    if (x0qVar2.emit(t2iVar3, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (!(rj6Var2 instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    t2i t2iVar4 = new t2i((Throwable) ((pj6) rj6Var2).a());
                    this.k = 3;
                    if (x0qVar2.emit(t2iVar4, this) == nm6Var2) {
                        return nm6Var2;
                    }
                }
                return Unit.a;
        }
    }
}
