package com.squareup.cash.savings.views;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.components.InlineMessageButtonScope;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.savings.viewmodels.UpsellCardModel$Loaded;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda1;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class SavingsUpsellCardKt$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ UpsellCardModel$Loaded f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ SavingsUpsellCardKt$$ExternalSyntheticLambda3(UpsellCardModel$Loaded upsellCardModel$Loaded, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = upsellCardModel$Loaded;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        final UpsellCardModel$Loaded upsellCardModel$Loaded = this.f$0;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i2 = 4;
        final Function1 function1 = this.f$1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = true;
        switch (i) {
            case 0:
                InlineMessageButtonScope inlineMessageButtonScope = (InlineMessageButtonScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                inlineMessageButtonScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(inlineMessageButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    boolean changedInstance = gapComposer.changedInstance(upsellCardModel$Loaded) | gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        final boolean z5 = z2 ? 1 : 0;
                        rememberedValue = new Function0() { // from class: com.squareup.cash.savings.views.SavingsUpsellCardKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i3 = z5;
                                Function1 function12 = function1;
                                UpsellCardModel$Loaded upsellCardModel$Loaded2 = upsellCardModel$Loaded;
                                switch (i3) {
                                    case 0:
                                        function12.invoke(upsellCardModel$Loaded2.primaryButton.action);
                                        break;
                                    default:
                                        function12.invoke(upsellCardModel$Loaded2.primaryButton.action);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    inlineMessageButtonScope.PrimaryButton(((intValue << 12) & 57344) | 3072, 6, gapComposer, Expect_jvmKt.rememberComposableLambda(-2040217244, new SavingsUpsellCardKt$$ExternalSyntheticLambda1(upsellCardModel$Loaded, 3), gapComposer), null, (Function0) rememberedValue, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    Strings.m3984LoadableSheetContentosbwsH8(this.f$0, false, 200.0f, SpacerKt.padding(companion, paddingValues), null, Expect_jvmKt.rememberComposableLambda(-176518479, new HeroCardViewKt$$ExternalSyntheticLambda1(function1, z, 23), gapComposer2), gapComposer2, 196992, 16);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    UpsellCardModel$Loaded.Button button = upsellCardModel$Loaded.secondaryButton;
                    if (button == null) {
                        gapComposer3.startReplaceGroup(-933745470);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(-933745469);
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                        boolean changedInstance2 = gapComposer3.changedInstance(button) | gapComposer3.changed(function1);
                        Object rememberedValue2 = gapComposer3.rememberedValue();
                        Object obj4 = rememberedValue2;
                        if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                            SavingsUpsellCardKt$$ExternalSyntheticLambda6 savingsUpsellCardKt$$ExternalSyntheticLambda6 = new SavingsUpsellCardKt$$ExternalSyntheticLambda6(button, function1, 1);
                            gapComposer3.updateRememberedValue(savingsUpsellCardKt$$ExternalSyntheticLambda6);
                            obj4 = savingsUpsellCardKt$$ExternalSyntheticLambda6;
                        }
                        coil3.size.SizeKt.Button((Function0) obj4, fillMaxWidth, null, false, false, null, Expect_jvmKt.rememberComposableLambda(1806440668, new SavingsUpsellCardKt$$ExternalSyntheticLambda7(button, z3 ? 1 : 0), gapComposer3), gapComposer3, 1572912, 60);
                        gapComposer3.end(false);
                    }
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changedInstance3 = gapComposer3.changedInstance(upsellCardModel$Loaded) | gapComposer3.changed(function1);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    Object obj5 = rememberedValue3;
                    if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                        final boolean z6 = z4 ? 1 : 0;
                        Function0 function0 = new Function0() { // from class: com.squareup.cash.savings.views.SavingsUpsellCardKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i3 = z6;
                                Function1 function12 = function1;
                                UpsellCardModel$Loaded upsellCardModel$Loaded2 = upsellCardModel$Loaded;
                                switch (i3) {
                                    case 0:
                                        function12.invoke(upsellCardModel$Loaded2.primaryButton.action);
                                        break;
                                    default:
                                        function12.invoke(upsellCardModel$Loaded2.primaryButton.action);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer3.updateRememberedValue(function0);
                        obj5 = function0;
                    }
                    coil3.size.SizeKt.Button((Function0) obj5, fillMaxWidth2, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-849641741, new SavingsUpsellCardKt$$ExternalSyntheticLambda1(upsellCardModel$Loaded, i2), gapComposer3), gapComposer3, 1573296, 56);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
