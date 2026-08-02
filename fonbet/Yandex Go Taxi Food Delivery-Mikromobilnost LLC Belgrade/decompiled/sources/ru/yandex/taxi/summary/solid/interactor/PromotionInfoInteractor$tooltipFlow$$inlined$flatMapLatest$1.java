package ru.yandex.taxi.summary.solid.interactor;

import defpackage.g92;
import defpackage.gsc;
import defpackage.kb5;
import defpackage.mvg;
import defpackage.nmv0;
import defpackage.nnv0;
import defpackage.ny61;
import defpackage.r0e;
import defpackage.rol0;
import defpackage.tls;
import defpackage.tpr;
import defpackage.u051;
import defpackage.vpr;
import defpackage.ykz0;
import defpackage.z051;
import defpackage.zkv0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.interactor.PromotionInfoInteractor$tooltipFlow$$inlined$flatMapLatest$1", f = "PromotionInfoInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class PromotionInfoInteractor$tooltipFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ tls $tariffFlowFactory$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionInfoInteractor$tooltipFlow$$inlined$flatMapLatest$1(Continuation continuation, p pVar, tls tlsVar) {
        super(3, continuation);
        this.this$0 = pVar;
        this.$tariffFlowFactory$inlined = tlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PromotionInfoInteractor$tooltipFlow$$inlined$flatMapLatest$1 promotionInfoInteractor$tooltipFlow$$inlined$flatMapLatest$1 = new PromotionInfoInteractor$tooltipFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$tariffFlowFactory$inlined);
        promotionInfoInteractor$tooltipFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        promotionInfoInteractor$tooltipFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return promotionInfoInteractor$tooltipFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0090 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tpr g92Var;
        tpr tprVar;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            gsc gscVar = (gsc) obj2;
            kb5 kb5Var = gscVar.a;
            nmv0 nmv0Var = ((nnv0) gscVar.b).a;
            if (nmv0Var == null || !(nmv0Var.a.j instanceof r0e)) {
                nmv0Var = null;
            }
            if (nmv0Var == null || nmv0Var.b) {
                g92Var = new g92(2, new gsc(kb5Var, null));
            } else {
                zkv0 zkv0Var = nmv0Var.a;
                z051 z051Var = zkv0Var.f;
                boolean z = z051Var instanceof u051;
                p pVar = this.this$0;
                if (z) {
                    tls tlsVar = this.$tariffFlowFactory$inlined;
                    u051 u051Var = (u051) z051Var;
                    ykz0 ykz0Var = pVar.d;
                    tpr tprVar2 = (tpr) tlsVar.invoke(kb5Var);
                    ykz0Var.getClass();
                    tprVar = kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.t(new ru.yandex.taxi.summary.promotions.interactor.c(tprVar2, ykz0Var, u051Var)), new PromotionInfoInteractor$toggleTooltipNotificationFlow$1(zkv0Var, u051Var, pVar, kb5Var, null));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (kotlinx.coroutines.flow.e.u(tprVar, vprVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    pVar.getClass();
                    g92Var = new rol0(new PromotionInfoInteractor$defaultTooltipNotificationFlow$1(pVar, kb5Var, zkv0Var, null));
                }
            }
            tprVar = g92Var;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(tprVar, vprVar, this) == coroutineSingletons) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
