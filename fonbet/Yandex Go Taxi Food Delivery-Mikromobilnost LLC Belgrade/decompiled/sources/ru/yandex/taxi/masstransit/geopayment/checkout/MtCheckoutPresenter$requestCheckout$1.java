package ru.yandex.taxi.masstransit.geopayment.checkout;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutPresenter$requestCheckout$1", f = "MtCheckoutPresenter.kt", l = {265}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtCheckoutPresenter$requestCheckout$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $destinationStopId;
    final /* synthetic */ String $directionId;
    final /* synthetic */ boolean $isTicketsCountChanged;
    final /* synthetic */ Object $metaCheckoutInfo;
    final /* synthetic */ String $startingStopId;
    int label;
    final /* synthetic */ t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtCheckoutPresenter$requestCheckout$1(t tVar, String str, String str2, String str3, boolean z, Object obj, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tVar;
        this.$directionId = str;
        this.$startingStopId = str2;
        this.$destinationStopId = str3;
        this.$isTicketsCountChanged = z;
        this.$metaCheckoutInfo = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtCheckoutPresenter$requestCheckout$1(this.this$0, this.$directionId, this.$startingStopId, this.$destinationStopId, this.$isTicketsCountChanged, this.$metaCheckoutInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtCheckoutPresenter$requestCheckout$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            t tVar = this.this$0;
            k kVar = tVar.G;
            String str = tVar.x;
            String str2 = tVar.y;
            String str3 = this.$directionId;
            String str4 = this.$startingStopId;
            String str5 = this.$destinationStopId;
            boolean z = this.$isTicketsCountChanged;
            Object obj2 = this.$metaCheckoutInfo;
            this.label = 1;
            int i2 = k.p;
            if (kVar.d(str, str2, str3, str4, str5, z, false, obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
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
