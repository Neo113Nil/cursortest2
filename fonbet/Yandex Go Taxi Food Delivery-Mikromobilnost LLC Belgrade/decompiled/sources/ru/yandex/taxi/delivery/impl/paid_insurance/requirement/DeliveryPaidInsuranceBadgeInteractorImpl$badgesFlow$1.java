package ru.yandex.taxi.delivery.impl.paid_insurance.requirement;

import defpackage.bdc;
import defpackage.kbx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qgi;
import defpackage.wl4;
import defpackage.xng0;
import defpackage.zgi;
import defpackage.zls;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "isChosen", "Lzgi;", "paidInsuranceInfo", "", "Lwl4;", "<anonymous>", "(ZLzgi;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.impl.paid_insurance.requirement.DeliveryPaidInsuranceBadgeInteractorImpl$badgesFlow$1", f = "DeliveryPaidInsuranceBadgeInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryPaidInsuranceBadgeInteractorImpl$badgesFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryPaidInsuranceBadgeInteractorImpl$badgesFlow$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        DeliveryPaidInsuranceBadgeInteractorImpl$badgesFlow$1 deliveryPaidInsuranceBadgeInteractorImpl$badgesFlow$1 = new DeliveryPaidInsuranceBadgeInteractorImpl$badgesFlow$1(this.this$0, (Continuation) obj3);
        deliveryPaidInsuranceBadgeInteractorImpl$badgesFlow$1.Z$0 = booleanValue;
        deliveryPaidInsuranceBadgeInteractorImpl$badgesFlow$1.L$0 = (zgi) obj2;
        return deliveryPaidInsuranceBadgeInteractorImpl$badgesFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        zgi zgiVar = (zgi) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        aVar.getClass();
        if (zgiVar == null || !zgiVar.a) {
            return EmptyList.a;
        }
        qgi a = aVar.b.a(z, zgiVar);
        ru.yandex.taxi.common_models.net.b bVar = FormattedText.Companion;
        FormattedText c = bVar.c(a.a);
        kbx0 kbx0Var = new kbx0(a.c, a.d, a.e);
        String str = a.b;
        if (str == null) {
            str = "";
        }
        return Collections.singletonList(new wl4(null, c, null, 0, null, null, null, kbx0Var, ru.yandex.taxi.common_models.net.b.b(bVar, str, null, "textMain", null, null, 58), null, new bdc(xng0.textMain), null, null, 113917));
    }
}
