package com.squareup.cash.benefits.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda8;
import com.squareup.cash.benefits.viewmodels.PdsaBenefitsExplainerViewModel$Loaded;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class PdsaBenefitsExplainerViewKt$$ExternalSyntheticLambda4 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ PdsaBenefitsExplainerViewModel$Loaded f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ PdsaBenefitsExplainerViewKt$$ExternalSyntheticLambda4(PdsaBenefitsExplainerViewModel$Loaded pdsaBenefitsExplainerViewModel$Loaded, Function1 function1) {
        this.f$0 = pdsaBenefitsExplainerViewModel$Loaded;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        PdsaBenefitsExplainerViewModel$Loaded pdsaBenefitsExplainerViewModel$Loaded = this.f$0;
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
                if (!gapComposer.shouldExecute(1 & intValue, (intValue & 19) != 18)) {
                    gapComposer.skipToGroupEnd();
                } else {
                    if (!(pdsaBenefitsExplainerViewModel$Loaded instanceof PdsaBenefitsExplainerViewModel$Loaded)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -270236462, false);
                    }
                    gapComposer.startReplaceGroup(-270230270);
                    BenefitsHomeViewKt.PdsaBenefitsExplainerSheet(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, paddingValues.mo267calculateTopPaddingD9Ej5fM(), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), pdsaBenefitsExplainerViewModel$Loaded, function1, gapComposer, 0);
                    gapComposer.end(false);
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new BenefitsHubViewKt$$ExternalSyntheticLambda4(12, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(129025714, new BankingDialogKt$$ExternalSyntheticLambda8(pdsaBenefitsExplainerViewModel$Loaded, 21), gapComposer2), gapComposer2, 1573296, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ PdsaBenefitsExplainerViewKt$$ExternalSyntheticLambda4(Function1 function1, PdsaBenefitsExplainerViewModel$Loaded pdsaBenefitsExplainerViewModel$Loaded) {
        this.f$1 = function1;
        this.f$0 = pdsaBenefitsExplainerViewModel$Loaded;
    }
}
