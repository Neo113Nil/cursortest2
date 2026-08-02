package ru.yandex.taxi.logistics.ndd_map.router;

import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.ndd_map.router.NddAddressMapPickerInteractor$zoomToUserLocation$1", f = "NddAddressMapPickerInteractor.kt", l = {227}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class NddAddressMapPickerInteractor$zoomToUserLocation$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NddAddressMapPickerInteractor$zoomToUserLocation$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NddAddressMapPickerInteractor$zoomToUserLocation$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NddAddressMapPickerInteractor$zoomToUserLocation$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            po21 po21Var = this.this$0.J;
            this.label = 1;
            obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).h(this);
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
        zzs a = ((mo21) obj).a();
        this.this$0.i(a, e.S);
        if (this.this$0.H.a().a) {
            this.this$0.f(a);
        }
        return zy11.a;
    }
}
