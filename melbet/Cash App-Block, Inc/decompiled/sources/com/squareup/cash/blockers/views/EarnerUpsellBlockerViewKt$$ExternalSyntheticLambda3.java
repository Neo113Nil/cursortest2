package com.squareup.cash.blockers.views;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.blockers.viewmodels.EarnerUpsellBlockerViewModel;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes4.dex */
public final /* synthetic */ class EarnerUpsellBlockerViewKt$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ EarnerUpsellBlockerViewModel f$1;

    public /* synthetic */ EarnerUpsellBlockerViewKt$$ExternalSyntheticLambda3(int i, EarnerUpsellBlockerViewModel earnerUpsellBlockerViewModel, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = earnerUpsellBlockerViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        EarnerUpsellBlockerViewModel earnerUpsellBlockerViewModel = this.f$1;
        Function1 function1 = this.f$0;
        Object[] objArr = 0;
        int i2 = 1;
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
                    NavigationType navigationType = NavigationType.CLOSE;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new CashtagViewKt$$ExternalSyntheticLambda6(16, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    SsnViewKt.BlockerSheetScaffold(paddingValues, navigationType, (Function0) rememberedValue, 0.92f, Expect_jvmKt.rememberComposableLambda(649280850, new EarnerUpsellBlockerViewKt$$ExternalSyntheticLambda5(earnerUpsellBlockerViewModel, function1, i2, objArr == true ? 1 : 0), gapComposer), Expect_jvmKt.rememberComposableLambda(1708263971, new EarnerUpsellBlockerViewKt$$ExternalSyntheticLambda6(earnerUpsellBlockerViewModel, i2), gapComposer), gapComposer, (intValue & 14) | 224304, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new CashtagViewKt$$ExternalSyntheticLambda6(17, function1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(1458008350, new EarnerUpsellBlockerViewKt$$ExternalSyntheticLambda6(earnerUpsellBlockerViewModel, r2), gapComposer2), gapComposer2, 1573296, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
