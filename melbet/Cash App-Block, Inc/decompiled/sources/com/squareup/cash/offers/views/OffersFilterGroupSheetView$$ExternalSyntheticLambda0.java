package com.squareup.cash.offers.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.merchant.views.SquareLoyaltySheetView;
import com.squareup.cash.offers.viewmodels.OffersFilterGroupSheetViewModel;
import com.squareup.cash.overlays.FakeOverlayLayerKt$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class OffersFilterGroupSheetView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ SquareLoyaltySheetView f$0;
    public final /* synthetic */ OffersFilterGroupSheetViewModel f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ OffersFilterGroupSheetView$$ExternalSyntheticLambda0(SquareLoyaltySheetView squareLoyaltySheetView, OffersFilterGroupSheetViewModel offersFilterGroupSheetViewModel, Function1 function1) {
        this.f$0 = squareLoyaltySheetView;
        this.f$1 = offersFilterGroupSheetViewModel;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        OffersFilterGroupSheetViewModel offersFilterGroupSheetViewModel = this.f$1;
        SquareLoyaltySheetView squareLoyaltySheetView = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(squareLoyaltySheetView.imageLoader), Expect_jvmKt.rememberComposableLambda(-58971613, new FakeOverlayLayerKt$$ExternalSyntheticLambda0(17, offersFilterGroupSheetViewModel, function1), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                squareLoyaltySheetView.Content(offersFilterGroupSheetViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ OffersFilterGroupSheetView$$ExternalSyntheticLambda0(SquareLoyaltySheetView squareLoyaltySheetView, OffersFilterGroupSheetViewModel offersFilterGroupSheetViewModel, Function1 function1, int i) {
        this.f$0 = squareLoyaltySheetView;
        this.f$1 = offersFilterGroupSheetViewModel;
        this.f$2 = function1;
    }
}
