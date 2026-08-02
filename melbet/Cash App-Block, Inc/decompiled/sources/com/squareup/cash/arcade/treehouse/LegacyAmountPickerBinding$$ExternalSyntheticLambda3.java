package com.squareup.cash.arcade.treehouse;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.paging.PageFetcher$generateNewPagingSource$3;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda3;
import coil3.network.NetworkFetcher$fetch$2;
import com.squareup.cash.amountslider.TickersAmountCaptionKt;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* loaded from: classes5.dex */
public final /* synthetic */ class LegacyAmountPickerBinding$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ LegacyAmountPickerBinding f$0;

    public /* synthetic */ LegacyAmountPickerBinding$$ExternalSyntheticLambda3(LegacyAmountPickerBinding legacyAmountPickerBinding) {
        this.f$0 = legacyAmountPickerBinding;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ComposableLambdaImpl composableLambdaImpl;
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i = LegacyAmountPickerBinding.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    LegacyAmountPickerBinding legacyAmountPickerBinding = this.f$0;
                    PageFetcher$generateNewPagingSource$3 pageFetcher$generateNewPagingSource$3 = legacyAmountPickerBinding.onPrimaryAmountToggled;
                    if (pageFetcher$generateNewPagingSource$3 != null) {
                        gapComposer.startReplaceGroup(346680441);
                        composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-949229351, new DismissableToastKt$$ExternalSyntheticLambda3(8, pageFetcher$generateNewPagingSource$3), gapComposer);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(346899766);
                        gapComposer.end(false);
                        composableLambdaImpl = ColorBindingsKt.lambda$1453973218;
                    }
                    ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
                    AmountPickerViewModel amountPickerViewModel = (AmountPickerViewModel) legacyAmountPickerBinding.model$delegate.getValue();
                    AmountConfig.MoneyConfig moneyConfig = (AmountConfig.MoneyConfig) legacyAmountPickerBinding.moneyConfig$delegate.getValue();
                    boolean changed = gapComposer.changed(legacyAmountPickerBinding);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        NetworkFetcher$fetch$2 networkFetcher$fetch$2 = new NetworkFetcher$fetch$2(1, legacyAmountPickerBinding, LegacyAmountPickerBinding.class, "onEvent", "onEvent(Lcom/squareup/cash/amountslider/viewmodels/AmountPickerViewEvent;)V", 0, 22);
                        gapComposer.updateRememberedValue(networkFetcher$fetch$2);
                        rememberedValue = networkFetcher$fetch$2;
                    }
                    TickersAmountCaptionKt.FullscreenAmountPicker(amountPickerViewModel, moneyConfig, (Function1) ((KFunction) rememberedValue), null, composableLambdaImpl2, gapComposer, 64, 8);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                int i2 = LegacyAmountPickerBinding.$r8$clinit;
                this.f$0.Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LegacyAmountPickerBinding$$ExternalSyntheticLambda3(LegacyAmountPickerBinding legacyAmountPickerBinding, int i) {
        this.f$0 = legacyAmountPickerBinding;
    }
}
