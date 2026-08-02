package ru.yandex.taxi.masstransit.geopayment.checkout;

import defpackage.e3n;
import defpackage.ke30;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutTimerInteractor$startTimer$1", f = "MtCheckoutTimerInteractor.kt", l = {61, HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtCheckoutTimerInteractor$startTimer$1 extends SuspendLambda implements wls {
    long J$0;
    long J$1;
    int label;
    final /* synthetic */ ke30 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtCheckoutTimerInteractor$startTimer$1(ke30 ke30Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ke30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtCheckoutTimerInteractor$startTimer$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtCheckoutTimerInteractor$startTimer$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        if (kotlinx.coroutines.a.j(r5, r12) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long U;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o430 o430Var = e3n.b;
            long U2 = kp50.U(1, DurationUnit.SECONDS);
            this.label = 1;
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        do {
            boolean p = kotlinx.coroutines.a.p(get_context());
            zy11 zy11Var = zy11.a;
            if (!p) {
                return zy11Var;
            }
            long uptimeMillis = this.this$0.b.uptimeMillis();
            ke30 ke30Var = this.this$0;
            long j = uptimeMillis - ke30Var.i;
            long j2 = ke30Var.j;
            o430 o430Var2 = e3n.b;
            long k = e3n.k(j2, e3n.q(kp50.V(j, DurationUnit.MILLISECONDS)));
            int c = e3n.c(k, 0L);
            ke30 ke30Var2 = this.this$0;
            if (c <= 0) {
                r0 r0Var = ke30Var2.d;
                e3n e3nVar = new e3n(0L);
                r0Var.getClass();
                r0Var.m(null, e3nVar);
                this.this$0.f.g(zy11Var);
                return zy11Var;
            }
            r0 r0Var2 = ke30Var2.d;
            e3n e3nVar2 = new e3n(k);
            r0Var2.getClass();
            r0Var2.m(null, e3nVar2);
            U = kp50.U(1, DurationUnit.SECONDS);
            this.J$0 = j;
            this.J$1 = k;
            this.label = 2;
        } while (kotlinx.coroutines.a.j(U, this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
