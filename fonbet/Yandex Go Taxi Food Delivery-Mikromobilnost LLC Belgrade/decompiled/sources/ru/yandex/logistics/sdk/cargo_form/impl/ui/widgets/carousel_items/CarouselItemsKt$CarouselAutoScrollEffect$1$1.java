package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.carousel_items;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.carousel_items.CarouselItemsKt$CarouselAutoScrollEffect$1$1", f = "CarouselItems.kt", l = {357}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CarouselItemsKt$CarouselAutoScrollEffect$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $intervalMs;
    final /* synthetic */ int $itemCount;
    final /* synthetic */ androidx.compose.foundation.pager.d $pagerState;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselItemsKt$CarouselAutoScrollEffect$1$1(androidx.compose.foundation.pager.d dVar, long j, int i, Continuation continuation) {
        super(2, continuation);
        this.$pagerState = dVar;
        this.$intervalMs = j;
        this.$itemCount = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CarouselItemsKt$CarouselAutoScrollEffect$1$1 carouselItemsKt$CarouselAutoScrollEffect$1$1 = new CarouselItemsKt$CarouselAutoScrollEffect$1$1(this.$pagerState, this.$intervalMs, this.$itemCount, continuation);
        carouselItemsKt$CarouselAutoScrollEffect$1$1.L$0 = obj;
        return carouselItemsKt$CarouselAutoScrollEffect$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CarouselItemsKt$CarouselAutoScrollEffect$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, pzt0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            Ref$ObjectRef z = qv10.z(obj);
            androidx.compose.foundation.pager.d dVar = this.$pagerState;
            long j = this.$intervalMs;
            int i2 = this.$itemCount;
            int i3 = b.a;
            z.element = tje.N(tseVar, null, null, new CarouselItemsKt$CarouselAutoScrollEffect$launchScrollJob$1(dVar, j, i2, null), 3);
            androidx.compose.foundation.pager.d dVar2 = this.$pagerState;
            n0 n0Var = dVar2.p.a;
            a aVar = new a(z, tseVar, dVar2, this.$intervalMs, this.$itemCount);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            n0Var.getClass();
            if (n0.m(n0Var, aVar, this) == coroutineSingletons) {
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
