package ru.yandex.taxi.search.panorama;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.s8y0;
import defpackage.t8y0;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.search.panorama.TaxiPanoramaModalView$renderPickupPoints$4$data$1$1$1$1", f = "TaxiPanoramaModalView.kt", l = {373}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class TaxiPanoramaModalView$renderPickupPoints$4$data$1$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ t8y0 $selectedPickupPoint;
    int label;
    final /* synthetic */ TaxiPanoramaModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiPanoramaModalView$renderPickupPoints$4$data$1$1$1$1(TaxiPanoramaModalView taxiPanoramaModalView, t8y0 t8y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = taxiPanoramaModalView;
        this.$selectedPickupPoint = t8y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiPanoramaModalView$renderPickupPoints$4$data$1$1$1$1(this.this$0, this.$selectedPickupPoint, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiPanoramaModalView$renderPickupPoints$4$data$1$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s8y0 s8y0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.label = 1;
            if (kotlinx.coroutines.a.i(300L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        s8y0Var = this.this$0.payload;
        tls tlsVar = s8y0Var.n;
        if (tlsVar != null) {
            tlsVar.invoke(this.$selectedPickupPoint.d);
        }
        return zy11.a;
    }
}
