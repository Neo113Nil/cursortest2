package app.cash.local.views;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.viewmodels.LocalCheckoutPaymentSectionViewModel;
import app.cash.local.viewmodels.LocalOpenTabCheckoutViewModel;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import app.cash.local.views.brand.checkout.LocalOpenTabCheckoutViewKt;
import com.squareup.cash.borrow.views.BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class ComposableSingletons$LocalViewFactoryKt$$ExternalSyntheticLambda28 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocalOpenTabCheckoutViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ ComposableSingletons$LocalViewFactoryKt$$ExternalSyntheticLambda28(LocalOpenTabCheckoutViewModel localOpenTabCheckoutViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = localOpenTabCheckoutViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        LocalOpenTabCheckoutViewModel localOpenTabCheckoutViewModel = this.f$0;
        switch (i) {
            case 0:
                Modifier modifier = (Modifier) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                modifier.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(modifier) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    LocalOpenTabCheckoutViewKt.LocalOpenTabCheckoutView(modifier, localOpenTabCheckoutViewModel, function1, gapComposer, intValue & 14);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 8.0f, 5);
                    LocalCheckoutPaymentSectionViewModel localCheckoutPaymentSectionViewModel = localOpenTabCheckoutViewModel.paymentSection;
                    PaddingValuesImpl paddingValuesImpl = LocalOpenTabCheckoutViewKt.OpenTabCheckoutInfoTouchTargetPadding;
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3(3, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    CheckoutTipSectionKt.m1303CheckoutPaymentSectionPfoAEA0(localCheckoutPaymentSectionViewModel, (Function1) rememberedValue, m302paddingqDBjuR0$default, null, true, RecyclerView.DECELERATION_RATE, paddingValuesImpl, gapComposer2, 1794432);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    LocalOpenTabCheckoutViewKt.PaymentTimingSection(localOpenTabCheckoutViewModel.paymentTiming, function1, gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
