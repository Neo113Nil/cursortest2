package com.squareup.cash.bitcoin.views.map;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.ui.Modifier;
import coil3.size.SizeKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinLocationViewModel;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class BitcoinLocationViewKt$$ExternalSyntheticLambda4 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ BitcoinLocationViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ BitcoinLocationViewKt$$ExternalSyntheticLambda4(BitcoinLocationViewModel bitcoinLocationViewModel, Function1 function1) {
        this.f$0 = bitcoinLocationViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        BitcoinLocationViewModel bitcoinLocationViewModel = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    BitcoinMapViewKt.BitcoinLocationContent(bitcoinLocationViewModel, function1, SpacerKt.padding(companion, paddingValues), gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                    ButtonProminence buttonProminence = ButtonProminence.STANDARD;
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new BitcoinLocationViewKt$$ExternalSyntheticLambda1(26, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue, horizontalWeight, buttonProminence, false, false, null, BitcoinMapViewKt.f265lambda$1728610982, gapComposer2, 1573248, 56);
                    if (bitcoinLocationViewModel.showPayButton) {
                        gapComposer2.startReplaceGroup(-1837736183);
                        Modifier horizontalWeight2 = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                        ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                        boolean changed2 = gapComposer2.changed(function1);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new BitcoinLocationViewKt$$ExternalSyntheticLambda1(27, function1);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        SizeKt.ButtonCta((Function0) rememberedValue2, horizontalWeight2, buttonProminence2, false, false, null, BitcoinMapViewKt.lambda$604426399, gapComposer2, 1573248, 56);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1837518749);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BitcoinLocationViewKt$$ExternalSyntheticLambda4(Function1 function1, BitcoinLocationViewModel bitcoinLocationViewModel) {
        this.f$1 = function1;
        this.f$0 = bitcoinLocationViewModel;
    }
}
