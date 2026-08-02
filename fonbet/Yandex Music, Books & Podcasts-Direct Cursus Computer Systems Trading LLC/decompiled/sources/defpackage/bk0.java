package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class bk0 extends aur implements Function1 {
    public vm0 j;
    public tqn k;
    public int l;
    public final /* synthetic */ fk0 m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ cm0 o;
    public final /* synthetic */ long p;
    public final /* synthetic */ Function1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk0(fk0 fk0Var, Object obj, cm0 cm0Var, long j, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.m = fk0Var;
        this.n = obj;
        this.o = cm0Var;
        this.p = j;
        this.q = function1;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new bk0(this.m, this.n, this.o, this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((bk0) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        vm0 vm0Var;
        tqn tqnVar;
        cm0 cm0Var = this.o;
        fk0 fk0Var = this.m;
        vm0 vm0Var2 = fk0Var.c;
        nm6 nm6Var = nm6.a;
        int i = this.l;
        try {
            if (i == 0) {
                qgg.h0(obj);
                vm0Var2.c = (cn0) fk0Var.a.a.invoke(this.n);
                fk0Var.e.setValue(cm0Var.g());
                fk0Var.d.setValue(Boolean.TRUE);
                vm0 vm0Var3 = new vm0(vm0Var2.a, vm0Var2.b.getValue(), qwp.H(vm0Var2.c), vm0Var2.d, Long.MIN_VALUE, vm0Var2.f);
                tqn tqnVar2 = new tqn();
                long j = this.p;
                ak0 ak0Var = new ak0(fk0Var, vm0Var3, this.q, tqnVar2, 0);
                this.j = vm0Var3;
                this.k = tqnVar2;
                this.l = 1;
                if (v5g.n(vm0Var3, cm0Var, j, ak0Var, this) == nm6Var) {
                    return nm6Var;
                }
                vm0Var = vm0Var3;
                tqnVar = tqnVar2;
            } else {
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tqnVar = this.k;
                vm0Var = this.j;
                qgg.h0(obj);
            }
            dm0 dm0Var = tqnVar.a ? dm0.a : dm0.b;
            fk0.a(fk0Var);
            return new rm0(vm0Var, dm0Var);
        } catch (CancellationException e) {
            fk0.a(fk0Var);
            throw e;
        }
    }
}
