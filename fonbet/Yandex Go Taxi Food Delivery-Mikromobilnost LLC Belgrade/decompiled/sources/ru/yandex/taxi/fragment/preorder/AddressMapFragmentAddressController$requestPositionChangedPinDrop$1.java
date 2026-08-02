package ru.yandex.taxi.fragment.preorder;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpv0;", "addressInfo", "Lzy11;", "<anonymous>", "(Lpv0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.fragment.preorder.AddressMapFragmentAddressController$requestPositionChangedPinDrop$1", f = "AddressMapFragmentAddressController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AddressMapFragmentAddressController$requestPositionChangedPinDrop$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapFragmentAddressController$requestPositionChangedPinDrop$1(Continuation continuation, e eVar) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AddressMapFragmentAddressController$requestPositionChangedPinDrop$1 addressMapFragmentAddressController$requestPositionChangedPinDrop$1 = new AddressMapFragmentAddressController$requestPositionChangedPinDrop$1(continuation, this.this$0);
        addressMapFragmentAddressController$requestPositionChangedPinDrop$1.L$0 = obj;
        return addressMapFragmentAddressController$requestPositionChangedPinDrop$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AddressMapFragmentAddressController$requestPositionChangedPinDrop$1 addressMapFragmentAddressController$requestPositionChangedPinDrop$1 = (AddressMapFragmentAddressController$requestPositionChangedPinDrop$1) create((pv0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        addressMapFragmentAddressController$requestPositionChangedPinDrop$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pv0 pv0Var = (pv0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.f.a.processPickupPoints(pv0Var);
        return zy11.a;
    }
}
