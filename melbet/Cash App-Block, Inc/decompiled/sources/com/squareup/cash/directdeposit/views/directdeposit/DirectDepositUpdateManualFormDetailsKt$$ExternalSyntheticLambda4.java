package com.squareup.cash.directdeposit.views.directdeposit;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import coil3.size.SizeKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda2;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositUpdateManualFormDetailsViewModel;
import com.squareup.cash.earnings.views.home.EarningsHeaderKt$$ExternalSyntheticLambda2;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class DirectDepositUpdateManualFormDetailsKt$$ExternalSyntheticLambda4 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ DirectDepositUpdateManualFormDetailsViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ DirectDepositUpdateManualFormDetailsKt$$ExternalSyntheticLambda4(DirectDepositUpdateManualFormDetailsViewModel directDepositUpdateManualFormDetailsViewModel, Function1 function1) {
        this.f$0 = directDepositUpdateManualFormDetailsViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        DirectDepositUpdateManualFormDetailsViewModel directDepositUpdateManualFormDetailsViewModel = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                ColumnScope columnScope = (ColumnScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                columnScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(columnScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    Countries.PageHeader(Room.stringResource(gapComposer, R.string.direct_deposit_manual_form_update_details_title), (Modifier) null, (Function2) null, (String) null, gapComposer, 0, 14);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                    DirectDepositUpdateManualFormDetailsViewModel.Content content = (DirectDepositUpdateManualFormDetailsViewModel.Content) directDepositUpdateManualFormDetailsViewModel;
                    String str = content.name;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new EarningsHeaderKt$$ExternalSyntheticLambda2(20, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    DirectDepositFormErrorKt.FormField(R.string.direct_deposit_manual_form_title_name, str, (Function0) rememberedValue, gapComposer, 0);
                    String str2 = content.companyName;
                    boolean changed2 = gapComposer.changed(function1);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new EarningsHeaderKt$$ExternalSyntheticLambda2(21, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    DirectDepositFormErrorKt.FormField(R.string.direct_deposit_manual_form_title_company_name, str2, (Function0) rememberedValue2, gapComposer, 0);
                    String str3 = content.paycheckAmount;
                    boolean changed3 = gapComposer.changed(function1);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new EarningsHeaderKt$$ExternalSyntheticLambda2(22, function1);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    DirectDepositFormErrorKt.FormField(R.string.direct_deposit_manual_form_title_paycheck_amount, str3, (Function0) rememberedValue3, gapComposer, 0);
                    SpacerKt.Spacer(gapComposer, columnScope.weight(1.0f, companion, true));
                    CellDefaultAccessory.Checkbox checkbox = new CellDefaultAccessory.Checkbox(content.addSignature);
                    ComposableLambdaImpl composableLambdaImpl = DirectDepositFormErrorKt.f387lambda$212631560;
                    boolean changed4 = gapComposer.changed(function1) | gapComposer.changedInstance(directDepositUpdateManualFormDetailsViewModel);
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new ArcadeModal2Kt$$ExternalSyntheticLambda2(16, function1, directDepositUpdateManualFormDetailsViewModel);
                        gapComposer.updateRememberedValue(rememberedValue4);
                    }
                    CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(composableLambdaImpl, null, (Function0) rememberedValue4, false, false, null, null, 0L, checkbox, null, gapComposer, 6, 1530);
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
                    boolean changed5 = gapComposer2.changed(function1);
                    Object rememberedValue5 = gapComposer2.rememberedValue();
                    if (changed5 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new EarningsHeaderKt$$ExternalSyntheticLambda2(26, function1);
                        gapComposer2.updateRememberedValue(rememberedValue5);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue5, horizontalWeight, buttonProminence, false, false, null, DirectDepositFormErrorKt.f388lambda$619414746, gapComposer2, 1573248, 56);
                    Modifier horizontalWeight2 = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    boolean z = ((DirectDepositUpdateManualFormDetailsViewModel.Content) directDepositUpdateManualFormDetailsViewModel).submitEnabled;
                    boolean changed6 = gapComposer2.changed(function1);
                    Object rememberedValue6 = gapComposer2.rememberedValue();
                    if (changed6 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new EarningsHeaderKt$$ExternalSyntheticLambda2(19, function1);
                        gapComposer2.updateRememberedValue(rememberedValue6);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue6, horizontalWeight2, buttonProminence2, false, z, null, DirectDepositFormErrorKt.lambda$1712182415, gapComposer2, 1573248, 40);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DirectDepositUpdateManualFormDetailsKt$$ExternalSyntheticLambda4(Function1 function1, DirectDepositUpdateManualFormDetailsViewModel directDepositUpdateManualFormDetailsViewModel) {
        this.f$1 = function1;
        this.f$0 = directDepositUpdateManualFormDetailsViewModel;
    }
}
