package ru.yandex.taxi.summary.promotions.repository;

import defpackage.dbl0;
import defpackage.hnv0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.umv0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;", "Ldbl0;", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.promotions.repository.SummaryPromotionsRepository$listenNewPromotions$3", f = "SummaryPromotionsRepository.kt", l = {428}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class SummaryPromotionsRepository$listenNewPromotions$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryPromotionsRepository$listenNewPromotions$3(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SummaryPromotionsRepository$listenNewPromotions$3 summaryPromotionsRepository$listenNewPromotions$3 = new SummaryPromotionsRepository$listenNewPromotions$3(this.this$0, continuation);
        summaryPromotionsRepository$listenNewPromotions$3.L$0 = obj;
        return summaryPromotionsRepository$listenNewPromotions$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryPromotionsRepository$listenNewPromotions$3) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        umv0 umv0Var;
        e eVar;
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = (PriceUpdate$PriceLoadingState) pair.getFirst();
            dbl0 dbl0Var = (dbl0) pair.getSecond();
            int i2 = hnv0.a[priceUpdate$PriceLoadingState.ordinal()];
            if (i2 == 1) {
                r0 r0Var = this.this$0.p;
                do {
                    value = r0Var.getValue();
                    umv0Var = (umv0) value;
                    if (!umv0Var.b) {
                        umv0Var = umv0.a(umv0Var, null, 1);
                    }
                } while (!r0Var.k(value, umv0Var));
            } else if (i2 == 2) {
                e eVar2 = this.this$0;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = eVar2;
                this.label = 1;
                Object b = e.b(eVar2, dbl0Var, this);
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
                eVar = eVar2;
                obj = b;
            } else if (i2 != 3 && i2 != 4) {
                w511.b();
                return null;
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        eVar = (e) this.L$3;
        kotlin.b.b(obj);
        eVar.p.l((umv0) obj);
        return zy11.a;
    }
}
