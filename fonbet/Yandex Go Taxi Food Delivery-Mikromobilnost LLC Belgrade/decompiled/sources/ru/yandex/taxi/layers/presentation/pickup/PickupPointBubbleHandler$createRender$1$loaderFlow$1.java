package ru.yandex.taxi.layers.presentation.pickup;

import android.graphics.Bitmap;
import defpackage.evu0;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sxx;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "it", "Lkotlin/Pair;", "Lru/yandex/taxi/layers/presentation/pickup/PickupPointBubbleHandler$ImageType;", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.layers.presentation.pickup.PickupPointBubbleHandler$createRender$1$loaderFlow$1", f = "PickupPointBubbleHandler.kt", l = {169}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PickupPointBubbleHandler$createRender$1$loaderFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickupPointBubbleHandler$createRender$1$loaderFlow$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PickupPointBubbleHandler$createRender$1$loaderFlow$1 pickupPointBubbleHandler$createRender$1$loaderFlow$1 = new PickupPointBubbleHandler$createRender$1$loaderFlow$1(this.this$0, continuation);
        pickupPointBubbleHandler$createRender$1$loaderFlow$1.L$0 = obj;
        return pickupPointBubbleHandler$createRender$1$loaderFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PickupPointBubbleHandler$createRender$1$loaderFlow$1) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj2 = null;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        this.L$0 = null;
        this.label = 1;
        sxx sxxVar = bVar.b;
        if (pair.c() == PickupPointBubbleHandler$ImageType.UNKNOWN || evu0.J((CharSequence) pair.f())) {
            pair = null;
        }
        if (pair != null) {
            int i2 = a.a[((PickupPointBubbleHandler$ImageType) pair.c()).ordinal()];
            if (i2 == 1 || i2 == 2) {
                obj2 = sxxVar.a(((m7x0) sxxVar.b).a((String) pair.f()), this);
                if (obj2 != coroutineSingletons) {
                    obj2 = (Bitmap) obj2;
                }
            } else if (i2 == 3 && (obj2 = sxxVar.a((String) pair.f(), this)) != coroutineSingletons) {
                obj2 = (Bitmap) obj2;
            }
        }
        return obj2 == coroutineSingletons ? coroutineSingletons : obj2;
    }
}
