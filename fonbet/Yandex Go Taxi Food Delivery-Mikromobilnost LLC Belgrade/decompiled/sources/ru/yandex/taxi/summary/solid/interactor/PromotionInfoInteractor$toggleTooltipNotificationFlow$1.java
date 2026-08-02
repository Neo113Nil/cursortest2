package ru.yandex.taxi.summary.solid.interactor;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.bvf0;
import defpackage.kb5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.u051;
import defpackage.wls;
import defpackage.zkv0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", BackendConfig.Restrictions.ENABLED, "Lgsc;", "Ldvz0;", "<anonymous>", "(Z)Lgsc;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.interactor.PromotionInfoInteractor$toggleTooltipNotificationFlow$1", f = "PromotionInfoInteractor.kt", l = {223}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PromotionInfoInteractor$toggleTooltipNotificationFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ kb5 $info;
    final /* synthetic */ zkv0 $promo;
    final /* synthetic */ u051 $widget;
    Object L$0;
    Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionInfoInteractor$toggleTooltipNotificationFlow$1(zkv0 zkv0Var, u051 u051Var, p pVar, kb5 kb5Var, Continuation continuation) {
        super(2, continuation);
        this.$promo = zkv0Var;
        this.$widget = u051Var;
        this.this$0 = pVar;
        this.$info = kb5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PromotionInfoInteractor$toggleTooltipNotificationFlow$1 promotionInfoInteractor$toggleTooltipNotificationFlow$1 = new PromotionInfoInteractor$toggleTooltipNotificationFlow$1(this.$promo, this.$widget, this.this$0, this.$info, continuation);
        promotionInfoInteractor$toggleTooltipNotificationFlow$1.Z$0 = ((Boolean) obj).booleanValue();
        return promotionInfoInteractor$toggleTooltipNotificationFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((PromotionInfoInteractor$toggleTooltipNotificationFlow$1) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        Pair g = this.$promo.g(this.$widget, z);
        FormattedText formattedText = (FormattedText) g.getFirst();
        FormattedText formattedText2 = (FormattedText) g.getSecond();
        p pVar = this.this$0;
        kb5 kb5Var = this.$info;
        zkv0 zkv0Var = this.$promo;
        this.L$0 = null;
        this.L$1 = null;
        this.Z$0 = z;
        this.label = 1;
        pVar.getClass();
        Object n = bvf0.n(new PromotionInfoInteractor$mapTooltipNotification$2(formattedText2, zkv0Var, kb5Var, pVar, formattedText, z, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
