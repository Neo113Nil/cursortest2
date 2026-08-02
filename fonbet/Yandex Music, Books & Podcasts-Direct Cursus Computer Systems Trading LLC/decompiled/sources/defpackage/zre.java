package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class zre extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ ase l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zre(ase aseVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = aseVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new zre(this.l, continuation, 0);
            default:
                return new zre(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((zre) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    this.l.c();
                    ase aseVar = this.l;
                    this.k = 1;
                    zt3 zt3Var = new zt3(1, qxe.b(this));
                    zt3Var.s();
                    synchronized (aseVar.c) {
                        aseVar.d = 20;
                        aseVar.f = zt3Var;
                    }
                    zt3Var.u(new kma(21, aseVar));
                    if (zt3Var.q() == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    ase aseVar2 = this.l;
                    this.k = 1;
                    aseVar2.getClass();
                    if (tyf.L(5000L, new zre(aseVar2, null, 0), this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }
}
