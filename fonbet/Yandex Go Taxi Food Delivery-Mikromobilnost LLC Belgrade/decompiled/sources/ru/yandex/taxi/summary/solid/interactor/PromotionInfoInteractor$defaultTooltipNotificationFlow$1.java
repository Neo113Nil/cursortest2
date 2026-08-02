package ru.yandex.taxi.summary.solid.interactor;

import defpackage.bvf0;
import defpackage.kb5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zkv0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "Lgsc;", "Ldvz0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.interactor.PromotionInfoInteractor$defaultTooltipNotificationFlow$1", f = "PromotionInfoInteractor.kt", l = {210, 210}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PromotionInfoInteractor$defaultTooltipNotificationFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ kb5 $info;
    final /* synthetic */ zkv0 $promo;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionInfoInteractor$defaultTooltipNotificationFlow$1(p pVar, kb5 kb5Var, zkv0 zkv0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pVar;
        this.$info = kb5Var;
        this.$promo = zkv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PromotionInfoInteractor$defaultTooltipNotificationFlow$1 promotionInfoInteractor$defaultTooltipNotificationFlow$1 = new PromotionInfoInteractor$defaultTooltipNotificationFlow$1(this.this$0, this.$info, this.$promo, continuation);
        promotionInfoInteractor$defaultTooltipNotificationFlow$1.L$0 = obj;
        return promotionInfoInteractor$defaultTooltipNotificationFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PromotionInfoInteractor$defaultTooltipNotificationFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r15 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            p pVar = this.this$0;
            kb5 kb5Var = this.$info;
            zkv0 zkv0Var = this.$promo;
            FormattedText formattedText = zkv0Var.c;
            FormattedText formattedText2 = zkv0Var.d;
            this.L$0 = null;
            this.L$1 = vprVar;
            this.label = 1;
            pVar.getClass();
            obj = bvf0.n(new PromotionInfoInteractor$mapTooltipNotification$2(formattedText2, zkv0Var, kb5Var, pVar, formattedText, false, null), this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$1;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
