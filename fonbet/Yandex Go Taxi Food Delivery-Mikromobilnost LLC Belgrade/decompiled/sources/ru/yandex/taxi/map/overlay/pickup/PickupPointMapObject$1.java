package ru.yandex.taxi.map.overlay.pickup;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.geo.XYPoint;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map.overlay.pickup.PickupPointMapObject$1", f = "PickupPointMapObject.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PickupPointMapObject$1 extends SuspendLambda implements wls {
    final /* synthetic */ Point $center;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickupPointMapObject$1(a aVar, Point point, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$center = point;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PickupPointMapObject$1(this.this$0, this.$center, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PickupPointMapObject$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar2 = this.this$0;
            ru.yandex.taxi.map_common.map.utils.a aVar3 = aVar2.b;
            Point point = this.$center;
            this.L$0 = aVar2;
            this.label = 1;
            Object b = aVar3.b(point, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = b;
            aVar = aVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = (a) this.L$0;
            kotlin.b.b(obj);
        }
        aVar.k = (XYPoint) obj;
        return zy11.a;
    }
}
