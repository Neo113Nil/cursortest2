package com.squareup.cash.bitcoin.views;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositOptionsViewModel;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.bitcoin.views.stablecoin.SendStablecoinViewKt;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.SheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class BitcoinUiFactory$$ExternalSyntheticLambda13 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ StablecoinDepositOptionsViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ BitcoinUiFactory$$ExternalSyntheticLambda13(StablecoinDepositOptionsViewModel stablecoinDepositOptionsViewModel, Function1 function1) {
        this.f$0 = stablecoinDepositOptionsViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        StablecoinDepositOptionsViewModel stablecoinDepositOptionsViewModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    SendStablecoinViewKt.StablecoinDepositOptionsView(stablecoinDepositOptionsViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new BitcoinMapViewKt$$ExternalSyntheticLambda6(21, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    SheetKt.Sheet((Function0) rememberedValue, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-155741415, new BorrowHomeKt$$ExternalSyntheticLambda0(7, stablecoinDepositOptionsViewModel, function1), gapComposer2), gapComposer2, 100663344, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                SendStablecoinViewKt.StablecoinDepositOptionsView(stablecoinDepositOptionsViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BitcoinUiFactory$$ExternalSyntheticLambda13(StablecoinDepositOptionsViewModel stablecoinDepositOptionsViewModel, Function1 function1, int i) {
        this.f$0 = stablecoinDepositOptionsViewModel;
        this.f$1 = function1;
    }

    public /* synthetic */ BitcoinUiFactory$$ExternalSyntheticLambda13(Function1 function1, StablecoinDepositOptionsViewModel stablecoinDepositOptionsViewModel) {
        this.f$1 = function1;
        this.f$0 = stablecoinDepositOptionsViewModel;
    }
}
