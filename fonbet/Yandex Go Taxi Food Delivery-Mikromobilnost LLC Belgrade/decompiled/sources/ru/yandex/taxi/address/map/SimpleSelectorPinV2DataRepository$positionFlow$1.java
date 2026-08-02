package ru.yandex.taxi.address.map;

import com.yandex.go.pin.api.v2.PinV2Component;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/yandex/go/pin/api/v2/PinV2Component$Position;", "move", "", "anchored"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.address.map.SimpleSelectorPinV2DataRepository$positionFlow$1", f = "SimpleSelectorPinV2DataRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SimpleSelectorPinV2DataRepository$positionFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        SimpleSelectorPinV2DataRepository$positionFlow$1 simpleSelectorPinV2DataRepository$positionFlow$1 = new SimpleSelectorPinV2DataRepository$positionFlow$1(3, (Continuation) obj3);
        simpleSelectorPinV2DataRepository$positionFlow$1.Z$0 = booleanValue;
        simpleSelectorPinV2DataRepository$positionFlow$1.Z$1 = booleanValue2;
        return simpleSelectorPinV2DataRepository$positionFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return z ? PinV2Component.Position.MOVE : z2 ? PinV2Component.Position.ANCHORED : PinV2Component.Position.DEFAULT;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
