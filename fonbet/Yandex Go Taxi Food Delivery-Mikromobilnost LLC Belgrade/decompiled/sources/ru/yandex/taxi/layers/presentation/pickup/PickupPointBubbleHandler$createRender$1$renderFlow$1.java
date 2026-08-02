package ru.yandex.taxi.layers.presentation.pickup;

import android.graphics.Bitmap;
import defpackage.aqb0;
import defpackage.dms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "title", "Landroid/graphics/Bitmap;", "bitmap", "", "<unused var>", "Laqb0;", "style", "Lkotlin/Triple;", "<anonymous>", "(Ljava/lang/String;Landroid/graphics/Bitmap;ZLaqb0;)Lkotlin/Triple;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.pickup.PickupPointBubbleHandler$createRender$1$renderFlow$1", f = "PickupPointBubbleHandler.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PickupPointBubbleHandler$createRender$1$renderFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Boolean) obj3).getClass();
        PickupPointBubbleHandler$createRender$1$renderFlow$1 pickupPointBubbleHandler$createRender$1$renderFlow$1 = new PickupPointBubbleHandler$createRender$1$renderFlow$1(5, (Continuation) obj5);
        pickupPointBubbleHandler$createRender$1$renderFlow$1.L$0 = (String) obj;
        pickupPointBubbleHandler$createRender$1$renderFlow$1.L$1 = (Bitmap) obj2;
        pickupPointBubbleHandler$createRender$1$renderFlow$1.L$2 = (aqb0) obj4;
        return pickupPointBubbleHandler$createRender$1$renderFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        Bitmap bitmap = (Bitmap) this.L$1;
        aqb0 aqb0Var = (aqb0) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Triple(str, bitmap, aqb0Var);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
