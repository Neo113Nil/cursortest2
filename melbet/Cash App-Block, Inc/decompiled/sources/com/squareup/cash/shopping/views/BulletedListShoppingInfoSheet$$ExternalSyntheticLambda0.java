package com.squareup.cash.shopping.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.merchant.views.SquareLoyaltyDetailsView;
import com.squareup.cash.shopping.viewmodels.ShoppingInfoSheetViewModel$BulletedListInfoSheetViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class BulletedListShoppingInfoSheet$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ SquareLoyaltyDetailsView f$0;
    public final /* synthetic */ ShoppingInfoSheetViewModel$BulletedListInfoSheetViewModel f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ BulletedListShoppingInfoSheet$$ExternalSyntheticLambda0(SquareLoyaltyDetailsView squareLoyaltyDetailsView, ShoppingInfoSheetViewModel$BulletedListInfoSheetViewModel shoppingInfoSheetViewModel$BulletedListInfoSheetViewModel, Function1 function1) {
        this.f$0 = squareLoyaltyDetailsView;
        this.f$1 = shoppingInfoSheetViewModel$BulletedListInfoSheetViewModel;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        SquareLoyaltyDetailsView squareLoyaltyDetailsView = this.f$0;
        ShoppingInfoSheetViewModel$BulletedListInfoSheetViewModel shoppingInfoSheetViewModel$BulletedListInfoSheetViewModel = this.f$1;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime((RealImageLoader) squareLoyaltyDetailsView.imageLoader), Expect_jvmKt.rememberComposableLambda(657473693, new BulletedListShoppingInfoSheet$$ExternalSyntheticLambda0(shoppingInfoSheetViewModel$BulletedListInfoSheetViewModel, squareLoyaltyDetailsView, function1), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                num.getClass();
                squareLoyaltyDetailsView.Content(shoppingInfoSheetViewModel$BulletedListInfoSheetViewModel, function1, composer, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                int intValue2 = num.intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (!gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    gapComposer2.skipToGroupEnd();
                } else if (shoppingInfoSheetViewModel$BulletedListInfoSheetViewModel instanceof ShoppingInfoSheetViewModel$BulletedListInfoSheetViewModel.Loaded) {
                    gapComposer2.startReplaceGroup(472028025);
                    squareLoyaltyDetailsView.SheetContent((ShoppingInfoSheetViewModel$BulletedListInfoSheetViewModel.Loaded) shoppingInfoSheetViewModel$BulletedListInfoSheetViewModel, function1, gapComposer2, 0);
                    gapComposer2.end(false);
                } else {
                    if (!Intrinsics.areEqual(shoppingInfoSheetViewModel$BulletedListInfoSheetViewModel, ShoppingInfoSheetViewModel$BulletedListInfoSheetViewModel.Loading.INSTANCE)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 472026895, false);
                    }
                    gapComposer2.startReplaceGroup(472029613);
                    squareLoyaltyDetailsView.LoadingContent(gapComposer2, 0);
                    gapComposer2.end(false);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BulletedListShoppingInfoSheet$$ExternalSyntheticLambda0(SquareLoyaltyDetailsView squareLoyaltyDetailsView, ShoppingInfoSheetViewModel$BulletedListInfoSheetViewModel shoppingInfoSheetViewModel$BulletedListInfoSheetViewModel, Function1 function1, int i) {
        this.f$0 = squareLoyaltyDetailsView;
        this.f$1 = shoppingInfoSheetViewModel$BulletedListInfoSheetViewModel;
        this.f$2 = function1;
    }

    public /* synthetic */ BulletedListShoppingInfoSheet$$ExternalSyntheticLambda0(ShoppingInfoSheetViewModel$BulletedListInfoSheetViewModel shoppingInfoSheetViewModel$BulletedListInfoSheetViewModel, SquareLoyaltyDetailsView squareLoyaltyDetailsView, Function1 function1) {
        this.f$1 = shoppingInfoSheetViewModel$BulletedListInfoSheetViewModel;
        this.f$0 = squareLoyaltyDetailsView;
        this.f$2 = function1;
    }
}
