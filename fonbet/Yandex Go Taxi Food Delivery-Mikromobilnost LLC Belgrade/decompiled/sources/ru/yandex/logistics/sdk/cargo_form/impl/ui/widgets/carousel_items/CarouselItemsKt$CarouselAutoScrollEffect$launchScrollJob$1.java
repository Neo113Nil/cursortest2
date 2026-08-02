package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.carousel_items;

import defpackage.mvg;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.carousel_items.CarouselItemsKt$CarouselAutoScrollEffect$launchScrollJob$1", f = "CarouselItems.kt", l = {335, 340}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CarouselItemsKt$CarouselAutoScrollEffect$launchScrollJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $intervalMs;
    final /* synthetic */ int $itemCount;
    final /* synthetic */ androidx.compose.foundation.pager.d $pagerState;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselItemsKt$CarouselAutoScrollEffect$launchScrollJob$1(androidx.compose.foundation.pager.d dVar, long j, int i, Continuation continuation) {
        super(2, continuation);
        this.$pagerState = dVar;
        this.$intervalMs = j;
        this.$itemCount = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CarouselItemsKt$CarouselAutoScrollEffect$launchScrollJob$1 carouselItemsKt$CarouselAutoScrollEffect$launchScrollJob$1 = new CarouselItemsKt$CarouselAutoScrollEffect$launchScrollJob$1(this.$pagerState, this.$intervalMs, this.$itemCount, continuation);
        carouselItemsKt$CarouselAutoScrollEffect$launchScrollJob$1.L$0 = obj;
        return carouselItemsKt$CarouselAutoScrollEffect$launchScrollJob$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CarouselItemsKt$CarouselAutoScrollEffect$launchScrollJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:14:0x0022
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046 A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:6:0x0010, B:12:0x0030, B:20:0x003d, B:22:0x0046, B:23:0x0052, B:32:0x001b), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0069 -> B:7:0x0022). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.L$0
            tse r0 = (defpackage.tse) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r9.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L14
            kotlin.b.b(r10)     // Catch: java.lang.Exception -> L22
            goto L22
        L14:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ny61.r(r9)
            r9 = 0
            return r9
        L1b:
            kotlin.b.b(r10)     // Catch: java.lang.Exception -> L22
            goto L3d
        L1f:
            kotlin.b.b(r10)
        L22:
            boolean r10 = defpackage.bvf0.D(r0)
            if (r10 == 0) goto L6c
            androidx.compose.foundation.pager.d r10 = r9.$pagerState
            int r10 = r10.o()
            if (r10 <= r4) goto L6c
            long r5 = r9.$intervalMs     // Catch: java.lang.Exception -> L22
            r9.L$0 = r0     // Catch: java.lang.Exception -> L22
            r9.label = r4     // Catch: java.lang.Exception -> L22
            java.lang.Object r10 = kotlinx.coroutines.a.i(r5, r9)     // Catch: java.lang.Exception -> L22
            if (r10 != r1) goto L3d
            goto L6b
        L3d:
            androidx.compose.foundation.pager.d r10 = r9.$pagerState     // Catch: java.lang.Exception -> L22
            int r10 = r10.k()     // Catch: java.lang.Exception -> L22
            int r10 = r10 + r4
            if (r10 >= 0) goto L51
            int r2 = r9.$itemCount     // Catch: java.lang.Exception -> L22
            int r5 = ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.carousel_items.b.a     // Catch: java.lang.Exception -> L22
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            int r2 = r5 % r2
            int r5 = r5 - r2
            goto L52
        L51:
            r5 = r10
        L52:
            androidx.compose.foundation.pager.d r2 = r9.$pagerState     // Catch: java.lang.Exception -> L22
            ldf r6 = defpackage.sbn.a     // Catch: java.lang.Exception -> L22
            r7 = 800(0x320, float:1.121E-42)
            r8 = 0
            ck11 r6 = defpackage.sb2.K(r7, r8, r6, r3)     // Catch: java.lang.Exception -> L22
            r9.L$0 = r0     // Catch: java.lang.Exception -> L22
            r9.I$0 = r10     // Catch: java.lang.Exception -> L22
            r9.I$1 = r5     // Catch: java.lang.Exception -> L22
            r9.label = r3     // Catch: java.lang.Exception -> L22
            java.lang.Object r10 = androidx.compose.foundation.pager.d.g(r2, r5, r6, r9, r3)     // Catch: java.lang.Exception -> L22
            if (r10 != r1) goto L22
        L6b:
            return r1
        L6c:
            zy11 r9 = defpackage.zy11.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.carousel_items.CarouselItemsKt$CarouselAutoScrollEffect$launchScrollJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
