package app.cash.local.views.brand.checkout;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.viewmodels.LocalCheckoutTipSectionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class CheckoutTipSectionKt$$ExternalSyntheticLambda8 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocalCheckoutTipSectionViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ CheckoutTipSectionKt$$ExternalSyntheticLambda8(LocalCheckoutTipSectionViewModel localCheckoutTipSectionViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = localCheckoutTipSectionViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                String str = this.f$0.overrideTip;
                if (str == null) {
                    str = "";
                }
                CheckoutTipSectionKt.CustomAmountInput(6, composer, m302paddingqDBjuR0$default, str, function1);
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer2;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Modifier modifier = LocalBrandLocationCheckoutViewKt.SectionItemModifier;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new GestureNodeKt$$ExternalSyntheticLambda0(8, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Function1 function12 = (Function1) rememberedValue;
                    boolean changed2 = gapComposer.changed(function1);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new GestureNodeKt$$ExternalSyntheticLambda0(9, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Function1 function13 = (Function1) rememberedValue2;
                    boolean changed3 = gapComposer.changed(function1);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new GestureNodeKt$$ExternalSyntheticLambda0(10, function1);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    CheckoutTipSectionKt.CheckoutTipSection(modifier, this.f$0, function12, function13, (Function1) rememberedValue3, gapComposer, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
