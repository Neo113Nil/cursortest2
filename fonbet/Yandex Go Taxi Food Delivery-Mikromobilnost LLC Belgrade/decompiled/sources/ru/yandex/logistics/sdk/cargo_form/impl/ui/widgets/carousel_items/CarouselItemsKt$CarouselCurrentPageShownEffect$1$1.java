package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.carousel_items;

import androidx.compose.runtime.f;
import defpackage.cy8;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ny8;
import defpackage.oy8;
import defpackage.rol0;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.carousel_items.CarouselItemsKt$CarouselCurrentPageShownEffect$1$1", f = "CarouselItems.kt", l = {316}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CarouselItemsKt$CarouselCurrentPageShownEffect$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $itemCount;
    final /* synthetic */ List<cy8> $items;
    final /* synthetic */ tls $onShown;
    final /* synthetic */ androidx.compose.foundation.pager.d $pagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselItemsKt$CarouselCurrentPageShownEffect$1$1(androidx.compose.foundation.pager.d dVar, tls tlsVar, List list, int i, Continuation continuation) {
        super(2, continuation);
        this.$pagerState = dVar;
        this.$onShown = tlsVar;
        this.$items = list;
        this.$itemCount = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CarouselItemsKt$CarouselCurrentPageShownEffect$1$1(this.$pagerState, this.$onShown, this.$items, this.$itemCount, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CarouselItemsKt$CarouselCurrentPageShownEffect$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            rol0 o = f.o(new ny8(this.$pagerState, 0));
            oy8 oy8Var = new oy8(this.$onShown, this.$items, this.$itemCount, 0);
            this.label = 1;
            if (o.collect(oy8Var, this) == coroutineSingletons) {
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
