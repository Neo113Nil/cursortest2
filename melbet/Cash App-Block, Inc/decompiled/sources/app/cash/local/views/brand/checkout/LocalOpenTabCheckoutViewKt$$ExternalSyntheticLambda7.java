package app.cash.local.views.brand.checkout;

import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.viewmodels.LocalCheckoutSpecialInstructionsViewModel;
import com.squareup.cash.arcade.components.ModalKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalOpenTabCheckoutViewKt$$ExternalSyntheticLambda7 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocalCheckoutSpecialInstructionsViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ LocalOpenTabCheckoutViewKt$$ExternalSyntheticLambda7(LocalCheckoutSpecialInstructionsViewModel localCheckoutSpecialInstructionsViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = localCheckoutSpecialInstructionsViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    float f = LocalOpenTabCheckoutViewKt.OpenTabCheckoutCompensatedVerticalPadding;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    ModalKt.HorizontalDivider(6, 0, gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, f, 1));
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    PaddingValuesImpl paddingValuesImpl = LocalOpenTabCheckoutViewKt.OpenTabCheckoutSpecialInstructionsTouchTargetPadding;
                    float f2 = LocalOpenTabCheckoutViewKt.OpenTabCheckoutSpecialInstructionsInputTopPadding;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new GestureNodeKt$$ExternalSyntheticLambda0(20, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    CheckoutTipSectionKt.m1304CheckoutSpecialInstructionsSectionFJfuzF0(this.f$0, (Function1) rememberedValue, fillMaxWidth, paddingValuesImpl, f2, gapComposer, 28032, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Modifier modifier = LocalBrandLocationCheckoutViewKt.SectionItemModifier;
                    PaddingValuesImpl paddingValuesImpl2 = CheckoutExpandableReviewRowKt.CheckoutReviewCompactRowTouchTargetPadding;
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new GestureNodeKt$$ExternalSyntheticLambda0(19, function1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    CheckoutTipSectionKt.m1304CheckoutSpecialInstructionsSectionFJfuzF0(this.f$0, (Function1) rememberedValue2, modifier, paddingValuesImpl2, RecyclerView.DECELERATION_RATE, gapComposer2, 3456, 16);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
