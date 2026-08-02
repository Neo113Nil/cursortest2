package com.squareup.cash.checks;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.local.primitives.CartEntryWithQuantity;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.RewardToken;
import app.cash.local.screens.app.LoyaltyRewardToApplyQuestion;
import app.cash.local.screens.app.MenuItemDetailsQuestion;
import app.cash.local.screens.app.MenuPickerQuestion;
import app.cash.local.screens.app.SchedulingDayTimeQuestion;
import app.cash.local.screens.app.VehicleDescription;
import app.cash.local.screens.app.VehicleDescriptionQuestion;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen;
import com.squareup.cash.bitcoin.screens.BitcoinAmountPickerQuestion;
import com.squareup.cash.bitcoin.screens.BitcoinMapErrorQuestion;
import com.squareup.cash.bitcoin.screens.BitcoinMapErrorSelectedAction;
import com.squareup.cash.bitcoin.screens.BitcoinNoteQuestion;
import com.squareup.cash.bitcoin.screens.ChangeNetworkQuestion;
import com.squareup.cash.bitcoin.viewmodels.BitcoinAmountPickerResult;
import com.squareup.cash.card.onboarding.CardStudioExitDialogResult;
import com.squareup.cash.card.onboarding.CardStudioMoreSheetResult;
import com.squareup.cash.card.onboarding.StampResult;
import com.squareup.cash.card.onboarding.screens.CardStudioExitQuestion;
import com.squareup.cash.card.onboarding.screens.CardStudioMoreSheetQuestion;
import com.squareup.cash.card.onboarding.screens.StampQuestion;
import com.squareup.cash.checks.screens.CheckCaptureAnswer;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;
import com.squareup.cash.crypto.address.StablecoinDepositOption;
import com.squareup.cash.deposits.physical.screens.AddressResult;
import com.squareup.cash.deposits.physical.screens.AddressSearchQuestion;
import com.squareup.cash.directdeposit.backend.api.PaycheckDepositAllocation;
import com.squareup.cash.directdeposit.screens.DirectDepositEditCompanyNameScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditFullNameScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditPaycheckAllocationScreen;
import com.squareup.cash.family.familyhub.screens.ControlDisablingConfirmationScreen;
import com.squareup.cash.family.familyhub.viewmodels.ControlDisablingConfirmationResult;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.transfers.screens.InstrumentLinkingOption;
import com.squareup.cash.transfers.screens.InstrumentLinkingOptionsQuestion;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;

/* loaded from: classes6.dex */
public final class VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1 implements Function1 {
    public final /* synthetic */ AnswerDispatcher $answerDispatcher;
    public final /* synthetic */ Function2 $block;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(Function2 function2, AnswerDispatcher answerDispatcher, int i) {
        this.$r8$classId = i;
        this.$block = function2;
        this.$answerDispatcher = answerDispatcher;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        final AnswerDispatcher answerDispatcher = this.$answerDispatcher;
        Function2 function2 = this.$block;
        switch (i) {
            case 0:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver = new AnswerDispatcher.AnswerReceiver(reflectionFactory.getOrCreateKotlinClass(CheckCaptureAnswer.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver);
                final int i2 = 0;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i3 = i2;
                        AnswerDispatcher.AnswerReceiver answerReceiver2 = answerReceiver;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i3) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver2);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver2);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver2);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver2);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver2);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver2);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver2);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver2);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver2);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver2);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver2);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver2);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver2);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver2);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver2);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver2);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver2);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver2);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver2);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver2);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver2);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver2);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver2);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver2);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver2);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver2);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver2);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver2);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver2);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver2);
                                break;
                        }
                    }
                };
            case 1:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory2 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver2 = new AnswerDispatcher.AnswerReceiver(reflectionFactory2.getOrCreateKotlinClass(FulfillmentConfiguration.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory2.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver2);
                final int i3 = 1;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i3;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver2;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 2:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory3 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver3 = new AnswerDispatcher.AnswerReceiver(reflectionFactory3.getOrCreateKotlinClass(RewardToken.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory3.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver3);
                final int i4 = 2;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i4;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver3;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 3:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory4 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver4 = new AnswerDispatcher.AnswerReceiver(reflectionFactory4.getOrCreateKotlinClass(VehicleDescription.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory4.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver4);
                final int i5 = 3;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i5;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver4;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 4:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory5 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver5 = new AnswerDispatcher.AnswerReceiver(reflectionFactory5.getOrCreateKotlinClass(LocationMenu.Menu.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory5.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver5);
                final int i6 = 4;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i6;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver5;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 5:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory6 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver6 = new AnswerDispatcher.AnswerReceiver(reflectionFactory6.getOrCreateKotlinClass(FulfillmentConfiguration.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory6.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver6);
                final int i7 = 5;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i7;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver6;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 6:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory7 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver7 = new AnswerDispatcher.AnswerReceiver(reflectionFactory7.getOrCreateKotlinClass(CartEntryWithQuantity.ClientCartEntryWithQuantity.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory7.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver7);
                final int i8 = 6;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i8;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver7;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 7:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory8 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver8 = new AnswerDispatcher.AnswerReceiver(reflectionFactory8.getOrCreateKotlinClass(FulfillmentConfiguration.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory8.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver8);
                final int i9 = 7;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i9;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver8;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 8:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory9 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver9 = new AnswerDispatcher.AnswerReceiver(reflectionFactory9.getOrCreateKotlinClass(FulfillmentConfiguration.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory9.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver9);
                final int i10 = 8;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i10;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver9;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 9:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory10 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver10 = new AnswerDispatcher.AnswerReceiver(reflectionFactory10.getOrCreateKotlinClass(LocationMenu.Menu.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory10.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver10);
                final int i11 = 9;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i11;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver10;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 10:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory11 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver11 = new AnswerDispatcher.AnswerReceiver(reflectionFactory11.getOrCreateKotlinClass(FulfillmentConfiguration.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory11.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver11);
                final int i12 = 10;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i12;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver11;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 11:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory12 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver12 = new AnswerDispatcher.AnswerReceiver(reflectionFactory12.getOrCreateKotlinClass(String.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory12.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver12);
                final int i13 = 11;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i13;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver12;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 12:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory13 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver13 = new AnswerDispatcher.AnswerReceiver(reflectionFactory13.getOrCreateKotlinClass(BitcoinAmountPickerResult.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory13.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver13);
                final int i14 = 12;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i14;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver13;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 13:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory14 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver14 = new AnswerDispatcher.AnswerReceiver(reflectionFactory14.getOrCreateKotlinClass(String.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory14.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver14);
                final int i15 = 13;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i15;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver14;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 14:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory15 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver15 = new AnswerDispatcher.AnswerReceiver(reflectionFactory15.getOrCreateKotlinClass(AddressResult.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory15.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver15);
                final int i16 = 14;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i16;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver15;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 15:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory16 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver16 = new AnswerDispatcher.AnswerReceiver(reflectionFactory16.getOrCreateKotlinClass(BitcoinMapErrorSelectedAction.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory16.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver16);
                final int i17 = 15;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i17;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver16;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 16:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory17 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver17 = new AnswerDispatcher.AnswerReceiver(reflectionFactory17.getOrCreateKotlinClass(StablecoinDepositOption.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory17.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver17);
                final int i18 = 16;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i18;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver17;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 17:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory18 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver18 = new AnswerDispatcher.AnswerReceiver(reflectionFactory18.getOrCreateKotlinClass(StampResult.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory18.getOrCreateKotlinClass(StampQuestion.class), answerReceiver18);
                final int i19 = 17;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i19;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver18;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 18:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory19 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver19 = new AnswerDispatcher.AnswerReceiver(reflectionFactory19.getOrCreateKotlinClass(CardStudioExitDialogResult.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory19.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver19);
                final int i20 = 18;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i20;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver19;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 19:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory20 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver20 = new AnswerDispatcher.AnswerReceiver(reflectionFactory20.getOrCreateKotlinClass(CardStudioMoreSheetResult.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory20.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver20);
                final int i21 = 19;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i21;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver20;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 20:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory21 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver21 = new AnswerDispatcher.AnswerReceiver(reflectionFactory21.getOrCreateKotlinClass(AddressResult.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory21.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver21);
                final int i22 = 20;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i22;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver21;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 21:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory22 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver22 = new AnswerDispatcher.AnswerReceiver(reflectionFactory22.getOrCreateKotlinClass(AddressResult.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory22.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver22);
                final int i23 = 21;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i23;
                        AnswerDispatcher.AnswerReceiver answerReceiver222 = answerReceiver22;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver222);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver222);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver222);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver222);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver222);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver222);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver222);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver222);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver222);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver222);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver222);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver222);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver222);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver222);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver222);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver222);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver222);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver222);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver222);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver222);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver222);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver222);
                                break;
                        }
                    }
                };
            case 22:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory23 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver23 = new AnswerDispatcher.AnswerReceiver(reflectionFactory23.getOrCreateKotlinClass(Redacted.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory23.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver23);
                final int i24 = 22;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i24;
                        AnswerDispatcher.AnswerReceiver answerReceiver222 = answerReceiver23;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver222);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver222);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver222);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver222);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver222);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver222);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver222);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver222);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver222);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver222);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver222);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver222);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver222);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver222);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver222);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver222);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver222);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver222);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver222);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver222);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver222);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver222);
                                break;
                        }
                    }
                };
            case 23:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory24 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver24 = new AnswerDispatcher.AnswerReceiver(reflectionFactory24.getOrCreateKotlinClass(Redacted.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory24.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver24);
                final int i25 = 23;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i25;
                        AnswerDispatcher.AnswerReceiver answerReceiver222 = answerReceiver24;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver222);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver222);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver222);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver222);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver222);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver222);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver222);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver222);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver222);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver222);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver222);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver222);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver222);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver222);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver222);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver222);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver222);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver222);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver222);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver222);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver222);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver222);
                                break;
                        }
                    }
                };
            case 24:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory25 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver25 = new AnswerDispatcher.AnswerReceiver(reflectionFactory25.getOrCreateKotlinClass(PaycheckDepositAllocation.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory25.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver25);
                final int i26 = 24;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i26;
                        AnswerDispatcher.AnswerReceiver answerReceiver222 = answerReceiver25;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver222);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver222);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver222);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver222);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver222);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver222);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver222);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver222);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver222);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver222);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver222);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver222);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver222);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver222);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver222);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver222);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver222);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver222);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver222);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver222);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver222);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver222);
                                break;
                        }
                    }
                };
            case 25:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory26 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver26 = new AnswerDispatcher.AnswerReceiver(reflectionFactory26.getOrCreateKotlinClass(Redacted.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory26.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver26);
                final int i27 = 25;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i27;
                        AnswerDispatcher.AnswerReceiver answerReceiver222 = answerReceiver26;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver222);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver222);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver222);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver222);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver222);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver222);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver222);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver222);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver222);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver222);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver222);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver222);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver222);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver222);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver222);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver222);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver222);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver222);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver222);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver222);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver222);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver222);
                                break;
                        }
                    }
                };
            case 26:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory27 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver27 = new AnswerDispatcher.AnswerReceiver(reflectionFactory27.getOrCreateKotlinClass(Redacted.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory27.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver27);
                final int i28 = 26;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i28;
                        AnswerDispatcher.AnswerReceiver answerReceiver222 = answerReceiver27;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver222);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver222);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver222);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver222);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver222);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver222);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver222);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver222);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver222);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver222);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver222);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver222);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver222);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver222);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver222);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver222);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver222);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver222);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver222);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver222);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver222);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver222);
                                break;
                        }
                    }
                };
            case 27:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory28 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver28 = new AnswerDispatcher.AnswerReceiver(reflectionFactory28.getOrCreateKotlinClass(PaycheckDepositAllocation.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory28.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver28);
                final int i29 = 27;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i29;
                        AnswerDispatcher.AnswerReceiver answerReceiver222 = answerReceiver28;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver222);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver222);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver222);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver222);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver222);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver222);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver222);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver222);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver222);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver222);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver222);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver222);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver222);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver222);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver222);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver222);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver222);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver222);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver222);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver222);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver222);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver222);
                                break;
                        }
                    }
                };
            case 28:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory29 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver29 = new AnswerDispatcher.AnswerReceiver(reflectionFactory29.getOrCreateKotlinClass(ControlDisablingConfirmationResult.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory29.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver29);
                final int i30 = 28;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i30;
                        AnswerDispatcher.AnswerReceiver answerReceiver222 = answerReceiver29;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver222);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver222);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver222);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver222);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver222);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver222);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver222);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver222);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver222);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver222);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver222);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver222);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver222);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver222);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver222);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver222);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver222);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver222);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver222);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver222);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver222);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver222);
                                break;
                        }
                    }
                };
            default:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory30 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver30 = new AnswerDispatcher.AnswerReceiver(reflectionFactory30.getOrCreateKotlinClass(InstrumentLinkingOption.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory30.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver30);
                final int i31 = 29;
                return new DisposableEffectResult() { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i31;
                        AnswerDispatcher.AnswerReceiver answerReceiver222 = answerReceiver30;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CheckCaptureQuestion.class), answerReceiver222);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(LoyaltyRewardToApplyQuestion.class), answerReceiver222);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(VehicleDescriptionQuestion.class), answerReceiver222);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver222);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuItemDetailsQuestion.class), answerReceiver222);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MenuPickerQuestion.class), answerReceiver222);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SchedulingDayTimeQuestion.class), answerReceiver222);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.class), answerReceiver222);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinAmountPickerQuestion.class), answerReceiver222);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinNoteQuestion.class), answerReceiver222);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(BitcoinMapErrorQuestion.class), answerReceiver222);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChangeNetworkQuestion.class), answerReceiver222);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(StampQuestion.class), answerReceiver222);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioExitQuestion.class), answerReceiver222);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CardStudioMoreSheetQuestion.class), answerReceiver222);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AddressSearchQuestion.class), answerReceiver222);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver222);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver222);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver222);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditFullNameScreen.FullNameQuestion.class), answerReceiver222);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.class), answerReceiver222);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class), answerReceiver222);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.class), answerReceiver222);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver222);
                                break;
                        }
                    }
                };
        }
    }
}
