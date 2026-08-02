package com.squareup.cash.payments.views;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda31;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentStickersViewModel;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowSheetKt;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowSheetPeekPosition$FixedHeight;
import com.squareup.cash.payments.views.personalization.ActionMenuKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetPeekPosition$FixedHeight;
import com.squareup.cash.transfers.views.AddMoneyViewKt$$ExternalSyntheticLambda1;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class PaymentConfigurationViewKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ float f$4;

    public /* synthetic */ PaymentConfigurationViewKt$$ExternalSyntheticLambda3(Modifier modifier, Function1 function1, PaymentConfigurationViewModel paymentConfigurationViewModel, float f, float f2, int i) {
        this.$r8$classId = 1;
        this.f$2 = modifier;
        this.f$1 = function1;
        this.f$3 = paymentConfigurationViewModel;
        this.f$0 = f;
        this.f$4 = f2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj3 = this.f$3;
        Object obj4 = this.f$2;
        switch (i) {
            case 0:
                CoreFlowRealSheetState coreFlowRealSheetState = (CoreFlowRealSheetState) obj4;
                final PaymentConfigurationViewModel paymentConfigurationViewModel = (PaymentConfigurationViewModel) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
                    final float f = this.f$0;
                    CoreFlowSheetPeekPosition$FixedHeight coreFlowSheetPeekPosition$FixedHeight = new CoreFlowSheetPeekPosition$FixedHeight(f);
                    boolean changedInstance = gapComposer.changedInstance(view);
                    final Function1 function1 = this.f$1;
                    boolean changed = changedInstance | gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new AddMoneyViewKt$$ExternalSyntheticLambda1(view, function1, 1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    final float f2 = this.f$4;
                    CoreFlowSheetKt.CoreFlowSheet((Function0) rememberedValue, null, coreFlowRealSheetState, coreFlowSheetPeekPosition$FixedHeight, Expect_jvmKt.rememberComposableLambda(-143921427, new Function3() { // from class: com.squareup.cash.payments.views.PaymentConfigurationViewKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            PaddingValues paddingValues = (PaddingValues) obj5;
                            Composer composer2 = (Composer) obj6;
                            int intValue2 = ((Integer) obj7).intValue();
                            paddingValues.getClass();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((GapComposer) composer2).changed(paddingValues) ? 4 : 2;
                            }
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                Modifier padding = SpacerKt.padding(Modifier.Companion.$$INSTANCE, paddingValues);
                                WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                                QuickPayViewKt.m3704PaymentConfigurationContent6PoWaU8(OffsetKt.consumeWindowInsets(padding, Arrangement$End$1.current(gapComposer2).systemBars), Function1.this, paymentConfigurationViewModel, f, f2, gapComposer2, 0);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), gapComposer, 1769472);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                QuickPayViewKt.m3704PaymentConfigurationContent6PoWaU8((Modifier) obj4, this.f$1, (PaymentConfigurationViewModel) obj3, this.f$0, this.f$4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                PersonalizePaymentStickersViewModel personalizePaymentStickersViewModel = (PersonalizePaymentStickersViewModel) obj4;
                Context context = (Context) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    float f3 = this.f$0;
                    SheetPeekPosition$FixedHeight sheetPeekPosition$FixedHeight = new SheetPeekPosition$FixedHeight(6, f3, false);
                    Function1 function12 = this.f$1;
                    boolean changed2 = gapComposer2.changed(function12);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ActionMenuKt$$ExternalSyntheticLambda0(26, function12);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    SheetKt.Sheet((Function0) rememberedValue2, null, null, sheetPeekPosition$FixedHeight, null, false, null, Expect_jvmKt.rememberComposableLambda(-1732968999, new PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda31(f3, personalizePaymentStickersViewModel, context, this.f$4, function12), gapComposer2), gapComposer2, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PaymentConfigurationViewKt$$ExternalSyntheticLambda3(float f, Function1 function1, Object obj, Object obj2, float f2, int i) {
        this.$r8$classId = i;
        this.f$0 = f;
        this.f$1 = function1;
        this.f$2 = obj;
        this.f$3 = obj2;
        this.f$4 = f2;
    }
}
