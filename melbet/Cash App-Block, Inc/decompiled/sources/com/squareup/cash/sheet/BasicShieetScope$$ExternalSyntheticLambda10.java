package com.squareup.cash.sheet;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.unit.Density;
import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel;
import com.squareup.cash.account.settings.viewmodels.SearchPrivacySectionViewEvent;
import com.squareup.cash.amountchooser.views.AmountKeypadState;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.common.web.WebAppBridge;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$2$1;
import com.squareup.cash.moneybot.viewmodels.MoneybotChatHistoryViewEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotChatHistoryViewModel;
import com.squareup.cash.moneybot.viewmodels.SuggestionViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.InChatPromptViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import com.squareup.cash.mooncake.compose_ui.components.KeyPadChar;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.viewmodels.viewevents.SearchViewAction;
import com.squareup.cash.paychecks.presenters.PaychecksActivityItemHandler$Factory$Impl;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewEvent;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.profile.presenters.notifications.NotificationSectionPresenter;
import com.squareup.cash.profile.viewmodels.Accessory;
import com.squareup.cash.profile.viewmodels.AliasItem;
import com.squareup.cash.profile.viewmodels.Category;
import com.squareup.cash.profile.viewmodels.Channel;
import com.squareup.cash.profile.viewmodels.ChannelListViewEvent;
import com.squareup.cash.profile.viewmodels.ContactMethodSectionViewEvent;
import com.squareup.cash.savings.backend.api.GeneralSavingsError;
import com.squareup.cash.savings.backend.api.model.SavingsFolder;
import com.squareup.cash.savings.backend.api.model.SavingsScreen;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.shopping.viewmodels.ShoppingBridgeCommand$RefreshCommand;
import com.squareup.cash.shopping.viewmodels.ShoppingViewModel;
import com.squareup.cash.shopping.viewmodels.ShoppingWebViewEvent;
import com.squareup.cash.shopping.views.KeyboardState;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$ImageBodyViewModel;
import com.squareup.cash.support.viewmodels.ContactSupportEmailInputViewEvent;
import com.squareup.cash.support.viewmodels.ContactSupportEmailMessageViewEvent;
import com.squareup.cash.transfers.backend.api.CashOutCapabilityManager$CashOutCapabilities;
import com.squareup.cash.transfers.presenters.UtilsKt;
import com.squareup.cash.transfers.presenters.WithdrawPresenter;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewEvent;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import com.squareup.cash.transfers.viewmodels.WithdrawViewEvent;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.cash.upsell.viewmodels.NullStateViewEvent$SwipeViewEvent;
import com.squareup.cash.upsell.viewmodels.NullStateViewEvent$TapActionButton;
import com.squareup.cash.upsell.viewmodels.NullStateViewModel$SwipeViewModel$Content;
import com.squareup.cash.upsell.viewmodels.UiGroupElementViewModel;
import com.squareup.cash.upsell.viewmodels.UiGroupViewModel;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.cash.wallet.viewmodels.SpendingInsightsListItemViewModel;
import com.squareup.protos.cash.janus.syncvalues.FullAccount;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import com.squareup.protos.common.Money;
import com.squareup.util.android.Keyboards;
import com.squareup.workflow1.internal.WorkflowNode$tick$1$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import net.oneformapp.schema.Schema;

/* loaded from: classes7.dex */
public final /* synthetic */ class BasicShieetScope$$ExternalSyntheticLambda10 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ BasicShieetScope$$ExternalSyntheticLambda10(RealHapticVibrator realHapticVibrator, Haptics haptics, Function1 function1, SuggestionViewModel.SuggestionPillViewModel suggestionPillViewModel) {
        this.$r8$classId = 4;
        this.f$0 = realHapticVibrator;
        this.f$1 = haptics;
        this.f$2 = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Pair pair;
        Pair pair2;
        Long l;
        Object obj;
        Object obj2;
        int i = this.$r8$classId;
        boolean z = false;
        ShoppingBridgeCommand$RefreshCommand shoppingBridgeCommand$RefreshCommand = ShoppingBridgeCommand$RefreshCommand.INSTANCE;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj3 = this.f$2;
        Object obj4 = this.f$0;
        Object obj5 = this.f$1;
        switch (i) {
            case 0:
                return BasicShieetScope.$r8$lambda$K2BZHpBj_ElAgx1dLnSHGb4jBpI((View) obj4, (CoroutineScope) obj5, (BasicShieetScope) obj3);
            case 1:
                Function1 function1 = (Function1) obj5;
                FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) obj3;
                MoneybotChatViewEvent moneybotChatViewEvent = ((InChatPromptViewModel) obj4).clickAction;
                if (moneybotChatViewEvent != null) {
                    function1.invoke(moneybotChatViewEvent);
                }
                focusOwnerImpl.clearFocus(false);
                return Unit.INSTANCE;
            case 2:
                Function0 function0 = (Function0) obj4;
                CoroutineScope coroutineScope = (CoroutineScope) obj5;
                LazyListState lazyListState = (LazyListState) obj3;
                if (function0 != null) {
                    function0.invoke();
                } else {
                    JobKt.launch$default(coroutineScope, null, null, new MoneyTabUIKt$MoneyTabLoaded$2$1(lazyListState, objArr == true ? 1 : 0, 5), 3);
                }
                return Unit.INSTANCE;
            case 3:
                ((Function1) obj4).invoke(((SuggestionViewModel.SuggestionsRowViewModel) obj5).action);
                ((FocusOwnerImpl) obj3).clearFocus(false);
                return Unit.INSTANCE;
            case 4:
                ((RealHapticVibrator) obj4).vibrate(((Haptics) obj5).input.standard);
                throw null;
            case 5:
                MoneybotChatHistoryViewModel.Content content = (MoneybotChatHistoryViewModel.Content) obj4;
                Function1 function12 = (Function1) obj5;
                MutableState mutableState = (MutableState) obj3;
                if (((Boolean) mutableState.getValue()).booleanValue() || content.loadingNextPage || !content.hasMoreSessions) {
                    return Unit.INSTANCE;
                }
                mutableState.setValue(Boolean.TRUE);
                function12.invoke(MoneybotChatHistoryViewEvent.LoadNextPage.INSTANCE);
                return Unit.INSTANCE;
            case 6:
                Function0 function02 = (Function0) obj3;
                if (Intrinsics.areEqual(((KeyPadChar) obj4).key, (String) obj5)) {
                    function02.invoke();
                }
                return Unit.INSTANCE;
            case 7:
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj3;
                ((MutableState) obj5).setValue(SearchViewAction.Reset.INSTANCE);
                parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
                ((Function0) obj4).invoke();
                return Unit.INSTANCE;
            case 8:
                return ((PaychecksActivityItemHandler$Factory$Impl) obj4).create((Navigator) obj5, (Function1) obj3);
            case 9:
                View view = (View) obj4;
                Function1 function13 = (Function1) obj3;
                Object systemService = ((Context) obj5).getSystemService("input_method");
                InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
                function13.invoke(PaymentConfigurationViewEvent.NoteInputContinueTapped.INSTANCE);
                return Unit.INSTANCE;
            case 10:
                Function0 function03 = (Function0) obj5;
                AmountKeypadState amountKeypadState = (AmountKeypadState) obj3;
                if (((PaymentConfigurationViewModel.InputAmount) obj4).enableContinue) {
                    function03.invoke();
                } else {
                    amountKeypadState.shake();
                }
                return Unit.INSTANCE;
            case 11:
                String str = ((FullAccount) obj3).account_id;
                str.getClass();
                ((NotificationSectionPresenter) obj4).openCategory((Category) obj5, str);
                return Unit.INSTANCE;
            case 12:
                ((Function1) obj4).invoke(new SearchPrivacySectionViewEvent.SettingToggled((SearchPrivacySectionViewEvent.SearchSettingType) obj5, !((ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel.Content.PrivacySetting) obj3).isChecked));
                return Unit.INSTANCE;
            case 13:
                Category.AdjustableThreshold adjustableThreshold = (Category.AdjustableThreshold) obj5;
                ((Function1) obj4).invoke(new ChannelListViewEvent.AdjustableThresholdClicked(adjustableThreshold.currentValue, adjustableThreshold.minValue, adjustableThreshold.maxValue, (NotificationCategory) obj3));
                return Unit.INSTANCE;
            case 14:
                ((Function1) obj4).invoke(new ChannelListViewEvent.ToggleClicked(((Channel) obj5).channelType, !r6.isToggledOn, ((Accessory.Toggle) obj3).hasNoEnabledAlias));
                return Unit.INSTANCE;
            case 15:
                ((Function1) obj4).invoke(new ContactMethodSectionViewEvent.ReviewAliasesClicked((List) obj5, (AliasItem) obj3));
                return Unit.INSTANCE;
            case 16:
                SavingsScreenPresenter savingsScreenPresenter = (SavingsScreenPresenter) obj4;
                MutableState mutableState2 = (MutableState) obj5;
                MutableState mutableState3 = (MutableState) obj3;
                List list = (List) mutableState2.getValue();
                if (list == null || !list.isEmpty()) {
                    SavingsScreen savingsScreen = (SavingsScreen) mutableState3.getValue();
                    if (savingsScreen == null || !savingsScreen.useSingleGoalRules) {
                        z = true;
                    } else {
                        List list2 = (List) mutableState2.getValue();
                        String str2 = "SavingsScreen: " + ((SavingsScreen.ScreenType) savingsScreenPresenter.screenType);
                        if (list2 == null) {
                            pair = new Pair(Boolean.TRUE, null);
                        } else {
                            List list3 = list2;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj6 : list3) {
                                if (obj6 instanceof SavingsFolder.GoalFolder) {
                                    arrayList.add(obj6);
                                }
                            }
                            boolean isEmpty = arrayList.isEmpty();
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj7 : list3) {
                                if (obj7 instanceof SavingsFolder.GeneralFolder) {
                                    arrayList2.add(obj7);
                                }
                            }
                            SavingsFolder.GeneralFolder generalFolder = (SavingsFolder.GeneralFolder) CollectionsKt.singleOrNull((List) arrayList2);
                            Money money = generalFolder != null ? generalFolder.balance : null;
                            if (arrayList2.isEmpty()) {
                                pair2 = new Pair(Boolean.FALSE, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error displaying ", str2, " with V2 goals: Missing general savings folder"));
                            } else if (isEmpty && arrayList2.size() > 1) {
                                pair2 = new Pair(Boolean.FALSE, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error displaying ", str2, " with V2 goals: Multiple general savings folders"));
                            } else if (!isEmpty && (money == null || (l = money.amount) == null || l.longValue() != 0)) {
                                pair2 = new Pair(Boolean.FALSE, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error displaying ", str2, " with V2 goals: Savings has goals but general folder balance is not 0"));
                            } else if (isEmpty || arrayList.size() <= 1) {
                                pair = new Pair(Boolean.TRUE, null);
                            } else {
                                pair2 = new Pair(Boolean.FALSE, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error displaying ", str2, " with V2 goals: Multiple goal folders"));
                            }
                            pair = pair2;
                        }
                        z = ((Boolean) pair.first).booleanValue();
                        String str3 = (String) pair.second;
                        if (!z && str3 != null) {
                            ((ErrorReporter) savingsScreenPresenter.errorReporter).report(new GeneralSavingsError(str3, null), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 17:
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) obj3;
                int bottom = ((WindowInsets) obj4).getBottom((Density) obj5);
                KeyboardState keyboardState = bottom == 0 ? KeyboardState.Closed : bottom < parcelableSnapshotMutableIntState2.getIntValue() ? KeyboardState.Closing : KeyboardState.Open;
                parcelableSnapshotMutableIntState2.setIntValue(bottom);
                return keyboardState;
            case 18:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj5;
                ((Function1) obj4).invoke(new ShoppingWebViewEvent.RefreshButtonPressed((String) ref$ObjectRef.element));
                WebAppBridge webAppBridge = (WebAppBridge) ((MutableState) obj3).getValue();
                if (webAppBridge != null) {
                    webAppBridge.sendWebCommand(shoppingBridgeCommand$RefreshCommand);
                }
                ref$ObjectRef.element = "";
                return Unit.INSTANCE;
            case 19:
                Function1 function14 = (Function1) obj5;
                MutableState mutableState4 = (MutableState) obj3;
                int ordinal = ((ShoppingViewModel.ErrorUrl) ((ShoppingViewModel) obj4)).action.ordinal();
                if (ordinal == 0) {
                    WebAppBridge webAppBridge2 = (WebAppBridge) mutableState4.getValue();
                    if (webAppBridge2 != null) {
                        webAppBridge2.sendWebCommand(shoppingBridgeCommand$RefreshCommand);
                    }
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    function14.invoke(ShoppingWebViewEvent.Close.INSTANCE);
                }
                return Unit.INSTANCE;
            case 20:
                ((Function0) obj4).invoke();
                ((Function1) obj5).invoke(((SupportActivityItemLoader.State.Success) obj3).activityItem);
                return Unit.INSTANCE;
            case 21:
                ((MutableState) obj3).setValue(Boolean.valueOf(!((Boolean) r6.getValue()).booleanValue()));
                ((Function1) obj4).invoke(((BodyViewModel$ImageBodyViewModel) obj5).imageUrl);
                return Unit.INSTANCE;
            case 22:
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj4;
                Function1 function15 = (Function1) obj5;
                String str4 = (String) obj3;
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function15.invoke(new ContactSupportEmailInputViewEvent.ConfirmEmail(str4));
                return Unit.INSTANCE;
            case 23:
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2 = (DelegatingSoftwareKeyboardController) obj4;
                Function1 function16 = (Function1) obj5;
                TextFieldState textFieldState = (TextFieldState) obj3;
                if (delegatingSoftwareKeyboardController2 != null) {
                    delegatingSoftwareKeyboardController2.hide();
                }
                function16.invoke(new ContactSupportEmailMessageViewEvent.SubmitMessage(textFieldState.getValue$foundation().text.toString()));
                return Unit.INSTANCE;
            case 24:
                State state = (State) obj4;
                WithdrawPresenter withdrawPresenter = (WithdrawPresenter) obj5;
                State state2 = (State) obj3;
                if (((List) state.getValue()).isEmpty()) {
                    return null;
                }
                Iterator it = ((List) state.getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.areEqual(((Instrument) obj).token, withdrawPresenter.args.instrumentToken)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                Instrument instrument = (Instrument) obj;
                if (instrument != null) {
                    return instrument;
                }
                if (((CashOutCapabilityManager$CashOutCapabilities) state2.getValue()) == null) {
                    return null;
                }
                CashOutCapabilityManager$CashOutCapabilities cashOutCapabilityManager$CashOutCapabilities = (CashOutCapabilityManager$CashOutCapabilities) state2.getValue();
                cashOutCapabilityManager$CashOutCapabilities.getClass();
                for (CashOutCapabilityManager$CashOutCapabilities.PreselectionPriorityItem preselectionPriorityItem : cashOutCapabilityManager$CashOutCapabilities.preselectionPriority) {
                    List list4 = (List) state.getValue();
                    preselectionPriorityItem.getClass();
                    list4.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj8 : list4) {
                        if (((Instrument) obj8).cashInstrumentType == preselectionPriorityItem.instrumentType) {
                            arrayList3.add(obj8);
                        }
                    }
                    Iterator it2 = arrayList3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (UtilsKt.isMatch(preselectionPriorityItem.instrumentQualifier, (Instrument) obj2)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    Instrument instrument2 = (Instrument) obj2;
                    if (instrument2 != null) {
                        return instrument2;
                    }
                }
                return null;
            case 25:
                Function0 function04 = (Function0) obj3;
                ((Function1) obj4).invoke(new AddMoneyViewEvent.AmountPickerItemSelected((AddMoneyViewModel.AtmPicker.AmountPickerItem) obj5));
                if (function04 != null) {
                    function04.invoke();
                }
                return Boolean.TRUE;
            case 26:
                Keyboards.hideKeyboard((View) obj4);
                ((Function1) obj5).invoke(WithdrawViewEvent.DismissChangeAmountClick.INSTANCE);
                ((Function0) obj3).invoke();
                return Unit.INSTANCE;
            case 27:
                ((Function1) obj4).invoke(new WithdrawViewEvent.DepositPreferenceClick((WithdrawViewModel.DepositPreferenceOption) obj5, ((TouchRecorder) obj3).getSignalsContext()));
                return Unit.INSTANCE;
            case 28:
                NullStateViewModel$SwipeViewModel$Content nullStateViewModel$SwipeViewModel$Content = (NullStateViewModel$SwipeViewModel$Content) obj5;
                UiGroupElementViewModel.ButtonViewModel buttonViewModel = nullStateViewModel$SwipeViewModel$Content.button;
                Schema schema = ((DefaultPagerState) obj3).scrollPosition;
                int intValue = ((ParcelableSnapshotMutableIntState) schema.elementTypes).getIntValue();
                ((UiGroupViewModel) nullStateViewModel$SwipeViewModel$Content.pages.get(((ParcelableSnapshotMutableIntState) schema.elementTypes).getIntValue())).getClass();
                ((Function1) obj4).invoke(new NullStateViewEvent$SwipeViewEvent.TapSwipeViewButton(new NullStateViewEvent$TapActionButton(intValue)));
                return Unit.INSTANCE;
            default:
                JobKt.launch$default((CoroutineScope) obj5, null, null, new WorkflowNode$tick$1$1((CardSchemePresenter) obj4, (SpendingInsightsListItemViewModel) obj3, objArr2 == true ? 1 : 0, 14), 3);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BasicShieetScope$$ExternalSyntheticLambda10(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ BasicShieetScope$$ExternalSyntheticLambda10(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = obj2;
        this.f$2 = obj3;
    }
}
