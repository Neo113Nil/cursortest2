package com.squareup.cash.merchant.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.blockers.viewmodels.SavingsTransferOptionSelectionViewModel;
import com.squareup.cash.blockers.views.SsnViewKt;
import com.squareup.cash.loadable.Loadable;
import com.squareup.cash.merchant.viewmodels.MerchantInfoFeedbackViewModel;
import com.squareup.cash.offers.viewmodels.OffersDetailsSheetViewModelV2;
import com.squareup.cash.offers.views.details.OfferDetailsSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* loaded from: classes6.dex */
public final /* synthetic */ class MerchantInfoFeedbackViewKt$$ExternalSyntheticLambda5 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PaddingValues f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ MerchantInfoFeedbackViewKt$$ExternalSyntheticLambda5(PaddingValues paddingValues, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = paddingValues;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        PaddingValues paddingValues = this.f$0;
        AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj;
        switch (i) {
            case 0:
                MerchantInfoFeedbackViewModel merchantInfoFeedbackViewModel = (MerchantInfoFeedbackViewModel) obj2;
                Composer composer = (Composer) obj3;
                ((Integer) obj4).getClass();
                animatedContentScopeImpl.getClass();
                merchantInfoFeedbackViewModel.getClass();
                Loadable loadable = merchantInfoFeedbackViewModel.content;
                if (loadable instanceof Loadable.Loaded) {
                    GapComposer gapComposer = (GapComposer) composer;
                    gapComposer.startReplaceGroup(232485730);
                    MerchantProfileViewKt.MerchantInfoFeedbackLoaded((MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel) ((Loadable.Loaded) loadable).value, SpacerKt.padding(companion, paddingValues), function1, gapComposer, 0);
                    gapComposer.end(false);
                    return Unit.INSTANCE;
                }
                if (loadable.equals(Loadable.Loading.INSTANCE)) {
                    throw NavAction$$ExternalSyntheticOutline0.m((GapComposer) composer, 232492493, false, "Loading should be handled by the LoadableFullScreenContent");
                }
                if (loadable instanceof Loadable.Failed) {
                    throw NavAction$$ExternalSyntheticOutline0.m((GapComposer) composer, 232497133, false, "Failed should never happen");
                }
                throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, 232483412, false);
            case 1:
                SavingsTransferOptionSelectionViewModel savingsTransferOptionSelectionViewModel = (SavingsTransferOptionSelectionViewModel) obj2;
                Composer composer2 = (Composer) obj3;
                int intValue = ((Integer) obj4).intValue();
                animatedContentScopeImpl.getClass();
                savingsTransferOptionSelectionViewModel.getClass();
                SsnViewKt.Content((SavingsTransferOptionSelectionViewModel.Content) savingsTransferOptionSelectionViewModel, this.f$1, SpacerKt.padding(companion, paddingValues), composer2, (intValue >> 3) & 14, 0);
                return Unit.INSTANCE;
            default:
                OffersDetailsSheetViewModelV2 offersDetailsSheetViewModelV2 = (OffersDetailsSheetViewModelV2) obj2;
                Composer composer3 = (Composer) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                animatedContentScopeImpl.getClass();
                offersDetailsSheetViewModelV2.getClass();
                if (!(offersDetailsSheetViewModelV2 instanceof OffersDetailsSheetViewModelV2.Loaded)) {
                    if (offersDetailsSheetViewModelV2.equals(OffersDetailsSheetViewModelV2.Loading.INSTANCE)) {
                        throw NavAction$$ExternalSyntheticOutline0.m((GapComposer) composer3, -1140197807, false, "Loading should be handled by the LoadableSheetContent");
                    }
                    throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer3, -1140205855, false);
                }
                GapComposer gapComposer2 = (GapComposer) composer3;
                gapComposer2.startReplaceGroup(-1140204316);
                OfferDetailsSheetKt.OfferDetailsSheetLoaded((OffersDetailsSheetViewModelV2.Loaded) offersDetailsSheetViewModelV2, SpacerKt.padding(companion, paddingValues), function1, gapComposer2, (intValue2 >> 3) & 14);
                gapComposer2.end(false);
                return Unit.INSTANCE;
        }
    }
}
