package ru.yandex.taxi.plus.purchase;

import defpackage.fl8;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rid0;
import defpackage.sid0;
import defpackage.u0v0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.plus.purchase.domain.PurchaseStatus;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lu0v0;", "subscriptionInfo", "Lfl8;", "cardPayment", "Lzy11;", "<anonymous>", "(Lu0v0;Lfl8;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.plus.purchase.PlusPurchasePresenter$observerSubscriptionInfo$2", f = "PlusPurchasePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PlusPurchasePresenter$observerSubscriptionInfo$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusPurchasePresenter$observerSubscriptionInfo$2(d dVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlusPurchasePresenter$observerSubscriptionInfo$2 plusPurchasePresenter$observerSubscriptionInfo$2 = new PlusPurchasePresenter$observerSubscriptionInfo$2(this.this$0, (Continuation) obj3);
        plusPurchasePresenter$observerSubscriptionInfo$2.L$0 = (u0v0) obj;
        plusPurchasePresenter$observerSubscriptionInfo$2.L$1 = (fl8) obj2;
        zy11 zy11Var = zy11.a;
        plusPurchasePresenter$observerSubscriptionInfo$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        u0v0 u0v0Var = (u0v0) this.L$0;
        fl8 fl8Var = (fl8) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0;
        rid0 rid0Var = dVar.D;
        if (dVar.F != null) {
            boolean z = u0v0Var.f;
        }
        dVar.F = u0v0Var;
        sid0 sid0Var = (sid0) dVar.Dg();
        boolean z2 = u0v0Var.f;
        AvailableButtonAction availableButtonAction = u0v0Var.g;
        sid0Var.setVisibility(z2);
        if (u0v0Var.h == PurchaseStatus.SUCCESS && rid0Var != null) {
            rid0Var.h();
        }
        if (z2) {
            if (availableButtonAction == AvailableButtonAction.BUY) {
                ((sid0) dVar.Dg()).K8(PlusInfoTrailType.PAYMENT_METHOD, fl8Var);
            } else {
                ((sid0) dVar.Dg()).K8(PlusInfoTrailType.NAVIGATION, fl8Var);
            }
            ((sid0) dVar.Dg()).ze(availableButtonAction != AvailableButtonAction.NONE);
            ((sid0) dVar.Dg()).M8(u0v0Var.e);
            sid0 sid0Var2 = (sid0) dVar.Dg();
            String str = u0v0Var.c;
            String str2 = u0v0Var.d;
            if (str2 == null) {
                str2 = "";
            }
            sid0Var2.L4(str, str2);
            sid0 sid0Var3 = (sid0) dVar.Dg();
            String str3 = u0v0Var.a;
            String str4 = u0v0Var.b;
            sid0Var3.ja(str3, str4 != null ? str4 : "");
        }
        return zy11.a;
    }
}
