package ru.yandex.taxi.summary.solid.modal_on_order.domain;

import defpackage.cys0;
import defpackage.emv0;
import defpackage.hmv0;
import defpackage.imv0;
import defpackage.kmv0;
import defpackage.mdh;
import defpackage.mmv0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.x880;
import defpackage.zkv0;
import defpackage.zxs0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.summary.solid.modal_on_order.ui.mvp.SummaryPromotionOnOrderModalView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.modal_on_order.domain.SummaryPromotionsOrderPart$promotionPart$1$1", f = "SummaryPromotionsOrderPart.kt", l = {101}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryPromotionsOrderPart$promotionPart$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ x880 $chainCallback;
    final /* synthetic */ zkv0 $promotion;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryPromotionsOrderPart$promotionPart$1$1(c cVar, zkv0 zkv0Var, x880 x880Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$promotion = zkv0Var;
        this.$chainCallback = x880Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryPromotionsOrderPart$promotionPart$1$1(this.this$0, this.$promotion, this.$chainCallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryPromotionsOrderPart$promotionPart$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            imv0 imv0Var = this.this$0.f;
            zkv0 zkv0Var = this.$promotion;
            x880 x880Var = this.$chainCallback;
            this.label = 1;
            imv0Var.a.getClass();
            sjh sjhVar = uyj.a;
            obj = tje.k0(mdh.b, new SummaryPromotionOnOrderModelMapper$toDomainModel$2(zkv0Var, imv0Var, x880Var, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        hmv0 hmv0Var = (hmv0) obj;
        emv0 emv0Var = this.this$0.d;
        kmv0 kmv0Var = new kmv0(hmv0Var.b, hmv0Var.c, hmv0Var.a, (zxs0) ((cys0) emv0Var.b.a.a).get());
        mmv0 mmv0Var = emv0Var.a;
        mmv0Var.getClass();
        emv0Var.c.a().d(new SummaryPromotionOnOrderModalView(mmv0Var.a, mmv0Var.b, kmv0Var));
        this.this$0.c.b(this.$promotion.a);
        return zy11.a;
    }
}
