package com.squareup.cash.afterpayapplet.views.homesection.v3;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerState$scrollToPage$2;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.Tap;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletHomeViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes5.dex */
public final /* synthetic */ class TileCarouselContentKt$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.CarouselTile f$1;
    public final /* synthetic */ CoroutineScope f$2;
    public final /* synthetic */ Function1 f$3;
    public final /* synthetic */ PagerState f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ TileCarouselContentKt$$ExternalSyntheticLambda4(boolean z, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.CarouselTile carouselTile, CoroutineScope coroutineScope, Function1 function1, PagerState pagerState, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = z;
        this.f$1 = carouselTile;
        this.f$2 = coroutineScope;
        this.f$3 = function1;
        this.f$4 = pagerState;
        this.f$5 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        int i2 = this.f$5;
        PagerState pagerState = this.f$4;
        Function1 function1 = this.f$3;
        CoroutineScope coroutineScope = this.f$2;
        AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.CarouselTile carouselTile = this.f$1;
        boolean z = this.f$0;
        switch (i) {
            case 0:
                if (z) {
                    Tap tap = carouselTile.tapAction;
                    if (tap != null) {
                        function1.invoke(new AfterpayAppletHomeViewEvent.CarouselTileTapped(tap, carouselTile.engagedItemToken, tap.getAnalyticsTapEventsSpec()));
                    }
                } else {
                    JobKt.launch$default(coroutineScope, null, null, new PagerState$scrollToPage$2(pagerState, i2, null, 2), 3);
                }
                return Unit.INSTANCE;
            default:
                if (z) {
                    Tap tap2 = carouselTile.tapAction;
                    if (tap2 != null) {
                        function1.invoke(new AfterpayAppletHomeViewEvent.CarouselTileTapped(tap2, carouselTile.engagedItemToken, tap2.getAnalyticsTapEventsSpec()));
                    }
                } else {
                    JobKt.launch$default(coroutineScope, null, null, new PagerState$scrollToPage$2(pagerState, i2, null, 1), 3);
                }
                return Boolean.TRUE;
        }
    }
}
