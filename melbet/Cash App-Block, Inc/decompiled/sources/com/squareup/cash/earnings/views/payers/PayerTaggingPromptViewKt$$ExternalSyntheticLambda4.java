package com.squareup.cash.earnings.views.payers;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import coil3.size.SizeKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.earnings.viewmodels.payers.PayerTaggingPromptViewModel;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda7;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class PayerTaggingPromptViewKt$$ExternalSyntheticLambda4 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ PayerTaggingPromptViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ PayerTaggingPromptViewKt$$ExternalSyntheticLambda4(PayerTaggingPromptViewModel payerTaggingPromptViewModel, Function1 function1) {
        this.f$0 = payerTaggingPromptViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z = false;
        final int i = 1;
        switch (this.$r8$classId) {
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
                    AddPayerCustomersViewKt.PayerTaggingPromptContent(this.f$0, this.f$1, paddingValues, null, gapComposer, (intValue << 6) & 896);
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
                    ButtonProminence buttonProminence = ButtonProminence.STANDARD;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                    Function1 function1 = this.f$1;
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    Object obj4 = rememberedValue;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        EarningsHomeKt$$ExternalSyntheticLambda7 earningsHomeKt$$ExternalSyntheticLambda7 = new EarningsHomeKt$$ExternalSyntheticLambda7(11, function1);
                        gapComposer2.updateRememberedValue(earningsHomeKt$$ExternalSyntheticLambda7);
                        obj4 = earningsHomeKt$$ExternalSyntheticLambda7;
                    }
                    final PayerTaggingPromptViewModel payerTaggingPromptViewModel = this.f$0;
                    final boolean z2 = z ? 1 : 0;
                    SizeKt.ButtonCta((Function0) obj4, horizontalWeight, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(1488307579, new Function3() { // from class: com.squareup.cash.earnings.views.payers.PayerTaggingPromptViewKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i2 = z2;
                            PayerTaggingPromptViewModel payerTaggingPromptViewModel2 = payerTaggingPromptViewModel;
                            switch (i2) {
                                case 0:
                                    Composer composer3 = (Composer) obj6;
                                    int intValue3 = ((Integer) obj7).intValue();
                                    ((RowScope) obj5).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, payerTaggingPromptViewModel2.notNowLabel, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj6;
                                    int intValue4 = ((Integer) obj7).intValue();
                                    ((RowScope) obj5).getClass();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, payerTaggingPromptViewModel2.confirmLabel, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), gapComposer2, 1573248, 56);
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    Modifier horizontalWeight2 = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    Object obj5 = rememberedValue2;
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        EarningsHomeKt$$ExternalSyntheticLambda7 earningsHomeKt$$ExternalSyntheticLambda72 = new EarningsHomeKt$$ExternalSyntheticLambda7(9, function1);
                        gapComposer2.updateRememberedValue(earningsHomeKt$$ExternalSyntheticLambda72);
                        obj5 = earningsHomeKt$$ExternalSyntheticLambda72;
                    }
                    SizeKt.ButtonCta((Function0) obj5, horizontalWeight2, buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(1150415346, new Function3() { // from class: com.squareup.cash.earnings.views.payers.PayerTaggingPromptViewKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj52, Object obj6, Object obj7) {
                            int i2 = i;
                            PayerTaggingPromptViewModel payerTaggingPromptViewModel2 = payerTaggingPromptViewModel;
                            switch (i2) {
                                case 0:
                                    Composer composer3 = (Composer) obj6;
                                    int intValue3 = ((Integer) obj7).intValue();
                                    ((RowScope) obj52).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, payerTaggingPromptViewModel2.notNowLabel, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj6;
                                    int intValue4 = ((Integer) obj7).intValue();
                                    ((RowScope) obj52).getClass();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, payerTaggingPromptViewModel2.confirmLabel, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), gapComposer2, 1573248, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PayerTaggingPromptViewKt$$ExternalSyntheticLambda4(Function1 function1, PayerTaggingPromptViewModel payerTaggingPromptViewModel) {
        this.f$1 = function1;
        this.f$0 = payerTaggingPromptViewModel;
    }
}
