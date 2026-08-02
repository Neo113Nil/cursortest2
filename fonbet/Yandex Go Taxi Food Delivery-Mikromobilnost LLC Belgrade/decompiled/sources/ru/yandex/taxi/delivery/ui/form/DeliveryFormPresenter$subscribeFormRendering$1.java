package ru.yandex.taxi.delivery.ui.form;

import defpackage.bms;
import defpackage.mvg;
import defpackage.nvi;
import defpackage.ny61;
import defpackage.pbi;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lnvi;", ClidProvider.STATE, "", "isButtonVisible", "isAnyImageUploading", "Lpbi;", "<anonymous>", "(Lnvi;ZZ)Lpbi;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.ui.form.DeliveryFormPresenter$subscribeFormRendering$1", f = "DeliveryFormPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryFormPresenter$subscribeFormRendering$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        DeliveryFormPresenter$subscribeFormRendering$1 deliveryFormPresenter$subscribeFormRendering$1 = new DeliveryFormPresenter$subscribeFormRendering$1(4, (Continuation) obj4);
        deliveryFormPresenter$subscribeFormRendering$1.L$0 = (nvi) obj;
        deliveryFormPresenter$subscribeFormRendering$1.Z$0 = booleanValue;
        deliveryFormPresenter$subscribeFormRendering$1.Z$1 = booleanValue2;
        return deliveryFormPresenter$subscribeFormRendering$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        nvi nviVar = (nvi) this.L$0;
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return new pbi(nviVar.d, !nviVar.h && nviVar.g && z && !z2, nviVar.f, nviVar.c);
    }
}
