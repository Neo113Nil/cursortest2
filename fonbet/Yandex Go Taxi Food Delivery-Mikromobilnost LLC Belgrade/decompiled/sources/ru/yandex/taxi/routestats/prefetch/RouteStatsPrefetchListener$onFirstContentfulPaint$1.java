package ru.yandex.taxi.routestats.prefetch;

import defpackage.boe0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.nbl0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.obl0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.routestats.prefetch.RouteStatsPrefetchListener$onFirstContentfulPaint$1", f = "RouteStatsPrefetchListener.kt", l = {37, HProv.PP_SET_PIN}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class RouteStatsPrefetchListener$onFirstContentfulPaint$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteStatsPrefetchListener$onFirstContentfulPaint$1(l lVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RouteStatsPrefetchListener$onFirstContentfulPaint$1 routeStatsPrefetchListener$onFirstContentfulPaint$1 = new RouteStatsPrefetchListener$onFirstContentfulPaint$1(this.this$0, continuation);
        routeStatsPrefetchListener$onFirstContentfulPaint$1.L$0 = obj;
        return routeStatsPrefetchListener$onFirstContentfulPaint$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteStatsPrefetchListener$onFirstContentfulPaint$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0044, code lost:
    
        if (r10 == r1) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tpr fVar;
        tpr tprVar;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            nbl0 nbl0Var = this.this$0.f;
            this.L$0 = tseVar;
            this.label = 1;
            obj = ((noh) nbl0Var.d.getValue()).k(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        boe0 boe0Var = (boe0) obj;
        if (boe0Var != null) {
            int i2 = obl0.a[boe0Var.b.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    fVar = new h(kotlinx.coroutines.flow.e.T(new mth(this.this$0.c.a, 6), 2), boe0Var);
                    tprVar = fVar;
                } else if (i2 == 3) {
                    tprVar = new j(new mth(this.this$0.c.a, 6), boe0Var);
                } else if (i2 != 4) {
                    w511.b();
                    return null;
                }
            } else if (this.this$0.g.get()) {
                fVar = new f(kotlinx.coroutines.flow.e.T(new mth(this.this$0.c.a, 6), 1), boe0Var);
                tprVar = fVar;
            }
            this.this$0.g.set(false);
            l lVar = this.this$0;
            o oVar = new o(tprVar, new RouteStatsPrefetchListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$safeCollect$1());
            k kVar = new k(tseVar, lVar, boe0Var);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            if (oVar.collect(kVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
