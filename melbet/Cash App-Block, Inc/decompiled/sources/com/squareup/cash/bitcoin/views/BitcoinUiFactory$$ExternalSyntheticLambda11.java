package com.squareup.cash.bitcoin.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinLocationViewModel;
import com.squareup.cash.bitcoin.views.map.BitcoinLocationViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.bitcoin.views.map.BitcoinLocationViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetStateKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class BitcoinUiFactory$$ExternalSyntheticLambda11 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ BitcoinLocationViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ BitcoinUiFactory$$ExternalSyntheticLambda11(BitcoinLocationViewModel bitcoinLocationViewModel, Function1 function1) {
        this.f$0 = bitcoinLocationViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        BitcoinLocationViewModel bitcoinLocationViewModel = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    BitcoinMapViewKt.BitcoinLocationView(bitcoinLocationViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    RealSheetState rememberSheetState = SheetStateKt.rememberSheetState(null, gapComposer2, 0, 1);
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new BitcoinLocationViewKt$$ExternalSyntheticLambda1(28, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    SheetKt.Sheet((Function0) rememberedValue, null, rememberSheetState, null, null, false, null, Expect_jvmKt.rememberComposableLambda(1019494910, new BitcoinLocationViewKt$$ExternalSyntheticLambda4(bitcoinLocationViewModel, function1), gapComposer2), gapComposer2, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BitcoinUiFactory$$ExternalSyntheticLambda11(Function1 function1, BitcoinLocationViewModel bitcoinLocationViewModel) {
        this.f$1 = function1;
        this.f$0 = bitcoinLocationViewModel;
    }
}
