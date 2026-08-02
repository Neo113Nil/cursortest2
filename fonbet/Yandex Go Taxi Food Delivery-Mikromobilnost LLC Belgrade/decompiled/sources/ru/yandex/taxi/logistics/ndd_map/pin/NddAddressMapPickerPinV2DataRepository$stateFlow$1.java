package ru.yandex.taxi.logistics.ndd_map.pin;

import defpackage.e0c0;
import defpackage.f0c0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r0c0;
import defpackage.w511;
import defpackage.wh50;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isSource", "Lru/yandex/taxi/address/repository/AddressResolveRepository$State;", "addressState", "Lru/yandex/taxi/widget/map/SourceOnMapControl$a;", "<anonymous>", "(ZLru/yandex/taxi/address/repository/AddressResolveRepository$State;)Lru/yandex/taxi/widget/map/SourceOnMapControl$a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.ndd_map.pin.NddAddressMapPickerPinV2DataRepository$stateFlow$1", f = "NddAddressMapPickerPinV2DataRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class NddAddressMapPickerPinV2DataRepository$stateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NddAddressMapPickerPinV2DataRepository$stateFlow$1(g gVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = gVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        NddAddressMapPickerPinV2DataRepository$stateFlow$1 nddAddressMapPickerPinV2DataRepository$stateFlow$1 = new NddAddressMapPickerPinV2DataRepository$stateFlow$1(this.this$0, (Continuation) obj3);
        nddAddressMapPickerPinV2DataRepository$stateFlow$1.Z$0 = booleanValue;
        nddAddressMapPickerPinV2DataRepository$stateFlow$1.L$0 = (AddressResolveRepository.State) obj2;
        return nddAddressMapPickerPinV2DataRepository$stateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        f0c0 f0c0Var;
        boolean z = this.Z$0;
        AddressResolveRepository.State state = (AddressResolveRepository.State) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        int i = wh50.a[state.ordinal()];
        if (i == 1) {
            f0c0Var = e0c0.a;
        } else if (i == 2 || i == 3) {
            f0c0Var = this.this$0.a.d();
        } else {
            if (i != 4 && i != 5) {
                w511.b();
                return null;
            }
            r0c0 r0c0Var = this.this$0.a;
            f0c0Var = z ? r0c0Var.h() : r0c0Var.b();
        }
        return new SourceOnMapControl.a(f0c0Var, null, null, false, false, null, null, 2046);
    }
}
