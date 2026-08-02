package ru.yandex.taxi.summary.promotions.repository;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.jnv0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", BackendConfig.Restrictions.ENABLED, "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.promotions.repository.SummaryPromotionsRepository$listenPromotions$2", f = "SummaryPromotionsRepository.kt", l = {408}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class SummaryPromotionsRepository$listenPromotions$2 extends SuspendLambda implements wls {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryPromotionsRepository$listenPromotions$2(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SummaryPromotionsRepository$listenPromotions$2 summaryPromotionsRepository$listenPromotions$2 = new SummaryPromotionsRepository$listenPromotions$2(this.this$0, continuation);
        summaryPromotionsRepository$listenPromotions$2.Z$0 = ((Boolean) obj).booleanValue();
        return summaryPromotionsRepository$listenPromotions$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((SummaryPromotionsRepository$listenPromotions$2) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            if (z) {
                this.Z$0 = z;
                this.label = 1;
                if (kotlinx.coroutines.flow.e.k(new m0(((k) eVar.c).j.a(), new mth(eVar.d.b, 6), new SummaryPromotionsRepository$listenNewPromotions$2(3, null)), new SummaryPromotionsRepository$listenNewPromotions$3(eVar, null), this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                eVar.p.l(jnv0.b);
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
