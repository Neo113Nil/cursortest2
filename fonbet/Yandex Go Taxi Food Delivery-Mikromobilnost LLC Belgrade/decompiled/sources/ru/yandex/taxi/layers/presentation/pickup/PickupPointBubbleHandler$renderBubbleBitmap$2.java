package ru.yandex.taxi.layers.presentation.pickup;

import android.graphics.Bitmap;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.xw31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Landroid/graphics/Bitmap;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.pickup.PickupPointBubbleHandler$renderBubbleBitmap$2", f = "PickupPointBubbleHandler.kt", l = {224}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PickupPointBubbleHandler$renderBubbleBitmap$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickupPointBubbleHandler$renderBubbleBitmap$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PickupPointBubbleHandler$renderBubbleBitmap$2 pickupPointBubbleHandler$renderBubbleBitmap$2 = new PickupPointBubbleHandler$renderBubbleBitmap$2(this.this$0, continuation);
        pickupPointBubbleHandler$renderBubbleBitmap$2.L$0 = obj;
        return pickupPointBubbleHandler$renderBubbleBitmap$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PickupPointBubbleHandler$renderBubbleBitmap$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Bitmap s = xw31.s(this.this$0.g);
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(s, this) == coroutineSingletons) {
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
