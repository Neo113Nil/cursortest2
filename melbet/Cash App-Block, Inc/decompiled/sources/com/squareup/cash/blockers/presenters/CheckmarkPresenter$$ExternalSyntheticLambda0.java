package com.squareup.cash.blockers.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DistanceAndFlags;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.coroutines.ConnectionPoolKt;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.passcode.presenters.EndAppLockPresenter;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmh;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.amountslider.viewmodels.AmountSelection;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.bitcoin.presenters.RealBitcoinKeypadStateStore$models$2$1;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferPresenter;
import com.squareup.cash.bitcoin.viewmodels.BitcoinPayInUsdSettingsViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.education.BitcoinStoriesWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.sendreceive.BitcoinSendRestrictionViewModel;
import com.squareup.cash.bitcoin.viewmodels.autowithdraw.BitcoinAutoWithdrawUpsellViewModel;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinLocationViewModel;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapOnboardingViewModel;
import com.squareup.cash.bitcoin.viewmodels.performance.details.BitcoinPerformanceDetailsContentViewModel;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositCopyViewModel;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinInstrumentRecommendationViewModel;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel;
import com.squareup.cash.bitcoin.viewmodels.welcome.BitcoinWelcomeViewModel;
import com.squareup.cash.bitcoin.views.BitcoinInvoiceEntryViewKt;
import com.squareup.cash.bitcoin.views.applet.education.BitcoinStoriesWidgetViewKt;
import com.squareup.cash.bitcoin.views.applet.sendreceive.BitcoinSendRestrictionViewKt;
import com.squareup.cash.bitcoin.views.applet.welcome.BitcoinWelcomeWidgetViewKt;
import com.squareup.cash.bitcoin.views.autowithdraw.BitcoinAutoWithdrawUpsellViewKt;
import com.squareup.cash.bitcoin.views.exchange.BitcoinExchangeViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.bitcoin.views.exchange.BitcoinExchangeViewKt$BitcoinExchangeContent$1$1$3$1;
import com.squareup.cash.bitcoin.views.map.BitcoinLocationViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt;
import com.squareup.cash.bitcoin.views.performance.details.BitcoinPerformanceDetailsViewKt;
import com.squareup.cash.bitcoin.views.stablecoin.SendStablecoinViewKt;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.CardStudioViewV2Kt$$ExternalSyntheticLambda6;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.investing.components.exchange.InvestingExchangeView$Content$1$1$1;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetPeekPosition$FixedHeight;
import com.squareup.cash.sheet.SheetPosition;
import com.squareup.cash.sheet.SheetStateKt;
import com.squareup.cash.transfers.views.shared.TransferSheetKt$TransferSheet$4$1;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.protos.common.Money;
import com.squareup.util.compose.SharedViewEventsKt;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public final /* synthetic */ class CheckmarkPresenter$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ CheckmarkPresenter$$ExternalSyntheticLambda0(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x03d4, code lost:
    
        if (r1 != null) goto L109;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Function1 function1;
        Object bitcoinExchangeViewKt$$ExternalSyntheticLambda3;
        Object obj3;
        Shaker shaker;
        MutableState mutableState;
        Continuation continuation;
        boolean z;
        Object zzmhVar;
        Continuation continuation2;
        AmountDisplayState amountDisplayState;
        MutableState mutableState2;
        List list;
        Function1 function12;
        MutableState mutableState3;
        boolean z2;
        Object bitcoinExchangeViewKt$BitcoinExchangeContent$1$1$3$1;
        AmountDisplayState amountDisplayState2;
        MutableState mutableState4;
        MutableState mutableState5;
        MutableState mutableState6;
        Object amountBlockerPresenter$models$1$2;
        Boolean bool;
        State state;
        RealSheetState realSheetState;
        MutableFloatState mutableFloatState;
        KClass kClass;
        MutableState mutableState7;
        Object realBitcoinKeypadStateStore$models$2$1;
        Boolean bool2;
        MutableState mutableState8;
        Object obj4;
        Float f;
        MutableFloatState mutableFloatState2;
        MutableFloatState mutableFloatState3;
        AmountDisplayState amountDisplayState3;
        Function1 function13;
        MutableState mutableState9;
        int i = this.$r8$classId;
        final int i2 = this.f$2;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((EndAppLockPresenter) obj6).m1348models((Flow) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((ErrorPresenter) obj6).m3423models((Flow) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((BitcoinTransferPresenter) obj6).ShowErrorIfNoBitcoinOwned((BigDecimal) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                BitcoinInvoiceEntryViewKt.BitcoinPayInUsdSettings((BitcoinPayInUsdSettingsViewModel) obj6, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                BitcoinStoriesWidgetViewKt.LoadingContent((Modifier) obj6, (BitcoinStoriesWidgetViewModel.Loading) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                BitcoinSendRestrictionViewKt.BitcoinSendRestrictionView((BitcoinSendRestrictionViewModel) obj6, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                BitcoinWelcomeWidgetViewKt.BitcoinWelcomeWidgetView((BitcoinWelcomeViewModel) obj6, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                BitcoinAutoWithdrawUpsellViewKt.BitcoinAutoWithdrawUpsellView((BitcoinAutoWithdrawUpsellViewModel) obj6, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                BitcoinTransferViewModel bitcoinTransferViewModel = (BitcoinTransferViewModel) obj6;
                Function1 function14 = (Function1) obj5;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    RealSheetState rememberSheetState = SheetStateKt.rememberSheetState(null, gapComposer, 0, 1);
                    MutableState rememberUpdatedState = Updater.rememberUpdatedState(bitcoinTransferViewModel != null ? Reflection.factory.getOrCreateKotlinClass(bitcoinTransferViewModel.getClass()) : null, gapComposer);
                    boolean z3 = bitcoinTransferViewModel instanceof BitcoinTransferViewModel.Content.BottomSheetContent;
                    MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(z3 ? ((BitcoinTransferViewModel.Content.BottomSheetContent) bitcoinTransferViewModel).amountSelections : null, gapComposer);
                    Object rememberedValue = gapComposer.rememberedValue();
                    Object obj7 = Composer.Companion.Empty;
                    if (rememberedValue == obj7) {
                        rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    MutableState mutableState10 = (MutableState) rememberedValue;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == obj7) {
                        rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    MutableState mutableState11 = (MutableState) rememberedValue2;
                    RealCashVibrator realCashVibrator = (RealCashVibrator) gapComposer.consume(LocalCashVibratorKt.LocalCashVibrator);
                    Shaker rememberShaker = SharedViewEventsKt.rememberShaker(true, gapComposer, 0);
                    boolean changed = gapComposer.changed(function14) | gapComposer.changedInstance(realCashVibrator) | gapComposer.changedInstance(rememberShaker);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed || rememberedValue3 == obj7) {
                        function1 = function14;
                        obj3 = obj7;
                        bitcoinExchangeViewKt$$ExternalSyntheticLambda3 = new BitcoinExchangeViewKt$$ExternalSyntheticLambda3(function1, realCashVibrator, rememberShaker, mutableState11, 0);
                        shaker = rememberShaker;
                        mutableState = mutableState11;
                        gapComposer.updateRememberedValue(bitcoinExchangeViewKt$$ExternalSyntheticLambda3);
                    } else {
                        function1 = function14;
                        bitcoinExchangeViewKt$$ExternalSyntheticLambda3 = rememberedValue3;
                        obj3 = obj7;
                        shaker = rememberShaker;
                        mutableState = mutableState11;
                    }
                    AmountDisplayState rememberAmountDisplayState = ConnectionPoolKt.rememberAmountDisplayState(null, null, (Function1) bitcoinExchangeViewKt$$ExternalSyntheticLambda3, gapComposer, 3);
                    boolean z4 = bitcoinTransferViewModel instanceof BitcoinTransferViewModel.Content.FullScreenContent;
                    BitcoinTransferViewModel.Content.FullScreenContent fullScreenContent = z4 ? (BitcoinTransferViewModel.Content.FullScreenContent) bitcoinTransferViewModel : null;
                    Money money = fullScreenContent != null ? fullScreenContent.maxAmount : null;
                    boolean changedInstance = gapComposer.changedInstance(money) | gapComposer.changed(rememberAmountDisplayState);
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue4 == obj3) {
                        continuation = null;
                        rememberedValue4 = new InvestingExchangeView$Content$1$1$1(money, rememberAmountDisplayState, null, 1);
                        gapComposer.updateRememberedValue(rememberedValue4);
                    } else {
                        continuation = null;
                    }
                    Updater.LaunchedEffect(gapComposer, money, (Function2) rememberedValue4);
                    KClass kClass2 = (KClass) rememberUpdatedState.getValue();
                    List list2 = (List) rememberUpdatedState2.getValue();
                    boolean changedInstance2 = gapComposer.changedInstance(bitcoinTransferViewModel) | gapComposer.changed(function1) | gapComposer.changed(rememberAmountDisplayState);
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    if (changedInstance2 || rememberedValue5 == obj3) {
                        z = z4;
                        continuation2 = continuation;
                        Function1 function15 = function1;
                        amountDisplayState = rememberAmountDisplayState;
                        mutableState2 = rememberUpdatedState;
                        list = list2;
                        zzmhVar = new zzmh(bitcoinTransferViewModel, function15, amountDisplayState, mutableState10, null, 25);
                        function12 = function15;
                        mutableState3 = mutableState10;
                        gapComposer.updateRememberedValue(zzmhVar);
                    } else {
                        mutableState2 = rememberUpdatedState;
                        mutableState3 = mutableState10;
                        list = list2;
                        continuation2 = continuation;
                        zzmhVar = rememberedValue5;
                        function12 = function1;
                        z = z4;
                        amountDisplayState = rememberAmountDisplayState;
                    }
                    Updater.LaunchedEffect(kClass2, list, (Function2) zzmhVar, gapComposer);
                    boolean changed2 = gapComposer.changed((KClass) mutableState2.getValue()) | gapComposer.changed((List) rememberUpdatedState2.getValue());
                    Object rememberedValue6 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue6 == obj3) {
                        if (z3) {
                            if (!((Boolean) mutableState3.getValue()).booleanValue()) {
                                List list3 = ((BitcoinTransferViewModel.Content.BottomSheetContent) bitcoinTransferViewModel).amountSelections;
                                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                    Iterator it = list3.iterator();
                                    while (it.hasNext()) {
                                        if (((AmountSelection) it.next()).isSelected()) {
                                        }
                                    }
                                }
                                z2 = false;
                            }
                            z2 = true;
                        } else {
                            if (z) {
                                String str = ((BitcoinTransferViewModel.Content.FullScreenContent) bitcoinTransferViewModel).restoreKeypadAmount;
                                if (!Intrinsics.areEqual(str, "0")) {
                                }
                            }
                            z2 = false;
                        }
                        rememberedValue6 = Recorder$$ExternalSyntheticOutline1.m(z2, gapComposer);
                    }
                    MutableState mutableState12 = (MutableState) rememberedValue6;
                    Boolean bool3 = (Boolean) mutableState.getValue();
                    bool3.getClass();
                    boolean changedInstance3 = gapComposer.changedInstance(bitcoinTransferViewModel) | gapComposer.changed(mutableState12);
                    Object rememberedValue7 = gapComposer.rememberedValue();
                    if (changedInstance3 || rememberedValue7 == obj3) {
                        amountDisplayState2 = amountDisplayState;
                        bitcoinExchangeViewKt$BitcoinExchangeContent$1$1$3$1 = new BitcoinExchangeViewKt$BitcoinExchangeContent$1$1$3$1(bitcoinTransferViewModel, mutableState, mutableState12, continuation2, 0);
                        mutableState4 = mutableState12;
                        gapComposer.updateRememberedValue(bitcoinExchangeViewKt$BitcoinExchangeContent$1$1$3$1);
                    } else {
                        bitcoinExchangeViewKt$BitcoinExchangeContent$1$1$3$1 = rememberedValue7;
                        mutableState4 = mutableState12;
                        amountDisplayState2 = amountDisplayState;
                    }
                    Updater.LaunchedEffect(gapComposer, bool3, (Function2) bitcoinExchangeViewKt$BitcoinExchangeContent$1$1$3$1);
                    Object rememberedValue8 = gapComposer.rememberedValue();
                    if (rememberedValue8 == obj3) {
                        rememberedValue8 = Recorder$$ExternalSyntheticOutline2.m(1.0f, gapComposer);
                    }
                    MutableFloatState mutableFloatState4 = (MutableFloatState) rememberedValue8;
                    Object rememberedValue9 = gapComposer.rememberedValue();
                    if (rememberedValue9 == obj3) {
                        rememberedValue9 = Recorder$$ExternalSyntheticOutline2.m(RecyclerView.DECELERATION_RATE, gapComposer);
                    }
                    MutableFloatState mutableFloatState5 = (MutableFloatState) rememberedValue9;
                    Object rememberedValue10 = gapComposer.rememberedValue();
                    if (rememberedValue10 == obj3) {
                        rememberedValue10 = Updater.mutableStateOf$default(continuation2);
                        gapComposer.updateRememberedValue(rememberedValue10);
                    }
                    MutableState mutableState13 = (MutableState) rememberedValue10;
                    Object rememberedValue11 = gapComposer.rememberedValue();
                    if (rememberedValue11 == obj3) {
                        rememberedValue11 = Updater.mutableStateOf$default(continuation2);
                        gapComposer.updateRememberedValue(rememberedValue11);
                    }
                    MutableState mutableState14 = (MutableState) rememberedValue11;
                    boolean changedInstance4 = gapComposer.changedInstance(bitcoinTransferViewModel);
                    Object rememberedValue12 = gapComposer.rememberedValue();
                    if (changedInstance4 || rememberedValue12 == obj3) {
                        Object bitcoinExchangeViewKt$BitcoinExchangeContent$1$1$3$12 = new BitcoinExchangeViewKt$BitcoinExchangeContent$1$1$3$1(bitcoinTransferViewModel, mutableState13, mutableState14, continuation2, 1);
                        mutableState5 = mutableState13;
                        mutableState6 = mutableState14;
                        gapComposer.updateRememberedValue(bitcoinExchangeViewKt$BitcoinExchangeContent$1$1$3$12);
                        rememberedValue12 = bitcoinExchangeViewKt$BitcoinExchangeContent$1$1$3$12;
                    } else {
                        mutableState5 = mutableState13;
                        mutableState6 = mutableState14;
                    }
                    Updater.LaunchedEffect(gapComposer, bitcoinTransferViewModel, (Function2) rememberedValue12);
                    Object rememberedValue13 = gapComposer.rememberedValue();
                    if (rememberedValue13 == obj3) {
                        rememberedValue13 = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer.updateRememberedValue(rememberedValue13);
                    }
                    MutableState mutableState15 = (MutableState) rememberedValue13;
                    Object rememberedValue14 = gapComposer.rememberedValue();
                    if (rememberedValue14 == obj3) {
                        rememberedValue14 = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer.updateRememberedValue(rememberedValue14);
                    }
                    MutableState mutableState16 = (MutableState) rememberedValue14;
                    boolean changed3 = gapComposer.changed((KClass) mutableState2.getValue());
                    Object rememberedValue15 = gapComposer.rememberedValue();
                    if (changed3 || rememberedValue15 == obj3) {
                        rememberedValue15 = Updater.derivedStateOf(new CopyCodeKt$$ExternalSyntheticLambda4(11, bitcoinTransferViewModel, mutableState16, mutableState15));
                        gapComposer.updateRememberedValue(rememberedValue15);
                    }
                    State state2 = (State) rememberedValue15;
                    Boolean bool4 = (Boolean) mutableState16.getValue();
                    bool4.getClass();
                    KClass kClass3 = (KClass) mutableState2.getValue();
                    boolean changedInstance5 = gapComposer.changedInstance(bitcoinTransferViewModel) | gapComposer.changed(rememberSheetState);
                    Object rememberedValue16 = gapComposer.rememberedValue();
                    if (changedInstance5 || rememberedValue16 == obj3) {
                        bool = bool4;
                        state = state2;
                        realSheetState = rememberSheetState;
                        mutableFloatState = mutableFloatState5;
                        kClass = kClass3;
                        amountBlockerPresenter$models$1$2 = new AmountBlockerPresenter$models$1$2(bitcoinTransferViewModel, realSheetState, mutableState16, continuation2, 22);
                        mutableState7 = mutableState16;
                        gapComposer.updateRememberedValue(amountBlockerPresenter$models$1$2);
                    } else {
                        amountBlockerPresenter$models$1$2 = rememberedValue16;
                        state = state2;
                        realSheetState = rememberSheetState;
                        bool = bool4;
                        mutableState7 = mutableState16;
                        mutableFloatState = mutableFloatState5;
                        kClass = kClass3;
                    }
                    Updater.LaunchedEffect(bool, kClass, (Function2) amountBlockerPresenter$models$1$2, gapComposer);
                    SheetPosition settledPosition = realSheetState.getSettledPosition();
                    boolean changed4 = gapComposer.changed(realSheetState);
                    Object rememberedValue17 = gapComposer.rememberedValue();
                    if (changed4 || rememberedValue17 == obj3) {
                        Object transferSheetKt$TransferSheet$4$1 = new TransferSheetKt$TransferSheet$4$1(realSheetState, mutableState15, mutableState7, continuation2, 1);
                        gapComposer.updateRememberedValue(transferSheetKt$TransferSheet$4$1);
                        rememberedValue17 = transferSheetKt$TransferSheet$4$1;
                    }
                    Updater.LaunchedEffect(gapComposer, settledPosition, (Function2) rememberedValue17);
                    Float valueOf = Float.valueOf(realSheetState.getExpandProgress());
                    Boolean bool5 = (Boolean) state.getValue();
                    bool5.getClass();
                    boolean changed5 = gapComposer.changed(realSheetState) | gapComposer.changed(state) | gapComposer.changedInstance(bitcoinTransferViewModel) | gapComposer.changed(amountDisplayState2) | gapComposer.changed(mutableState4) | gapComposer.changed(function12);
                    Object rememberedValue18 = gapComposer.rememberedValue();
                    if (changed5 || rememberedValue18 == obj3) {
                        AmountDisplayState amountDisplayState4 = amountDisplayState2;
                        bool2 = bool5;
                        Object obj8 = obj3;
                        mutableState8 = mutableState4;
                        obj4 = obj8;
                        RealSheetState realSheetState2 = realSheetState;
                        State state3 = state;
                        f = valueOf;
                        Function1 function16 = function12;
                        MutableState mutableState17 = mutableState3;
                        MutableFloatState mutableFloatState6 = mutableFloatState;
                        realBitcoinKeypadStateStore$models$2$1 = new RealBitcoinKeypadStateStore$models$2$1(realSheetState2, bitcoinTransferViewModel, amountDisplayState4, function16, mutableFloatState4, mutableFloatState6, state3, mutableState8, mutableState17, (Continuation) null);
                        realSheetState = realSheetState2;
                        bitcoinTransferViewModel = bitcoinTransferViewModel;
                        mutableFloatState2 = mutableFloatState6;
                        mutableFloatState3 = mutableFloatState4;
                        amountDisplayState3 = amountDisplayState4;
                        function13 = function16;
                        mutableState9 = mutableState17;
                        gapComposer.updateRememberedValue(realBitcoinKeypadStateStore$models$2$1);
                    } else {
                        Object obj9 = obj3;
                        mutableState8 = mutableState4;
                        obj4 = obj9;
                        mutableFloatState2 = mutableFloatState;
                        f = valueOf;
                        realBitcoinKeypadStateStore$models$2$1 = rememberedValue18;
                        mutableState9 = mutableState3;
                        amountDisplayState3 = amountDisplayState2;
                        bool2 = bool5;
                        function13 = function12;
                        mutableFloatState3 = mutableFloatState4;
                    }
                    Updater.LaunchedEffect(f, bool2, (Function2) realBitcoinKeypadStateStore$models$2$1, gapComposer);
                    final boolean z5 = (bitcoinTransferViewModel instanceof BitcoinTransferViewModel.Content) && ((BitcoinTransferViewModel.Content) bitcoinTransferViewModel).getInstrumentCellViewModel() != null;
                    boolean changed6 = gapComposer.changed(z5);
                    Object rememberedValue19 = gapComposer.rememberedValue();
                    if (changed6 || rememberedValue19 == obj4) {
                        rememberedValue19 = Updater.derivedStateOf(new Function0() { // from class: com.squareup.cash.bitcoin.views.exchange.BitcoinExchangeViewKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(i2 + (z5 ? 36 : 0));
                            }
                        });
                        gapComposer.updateRememberedValue(rememberedValue19);
                    }
                    State state4 = (State) rememberedValue19;
                    Object rememberedValue20 = gapComposer.rememberedValue();
                    if (rememberedValue20 == obj4) {
                        rememberedValue20 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                        gapComposer.updateRememberedValue(rememberedValue20);
                    }
                    CoroutineScope coroutineScope = (CoroutineScope) rememberedValue20;
                    SheetPeekPosition$FixedHeight sheetPeekPosition$FixedHeight = new SheetPeekPosition$FixedHeight(6, ((Number) state4.getValue()).intValue(), false);
                    boolean changed7 = gapComposer.changed(function13);
                    Object rememberedValue21 = gapComposer.rememberedValue();
                    if (changed7 || rememberedValue21 == obj4) {
                        rememberedValue21 = new BitcoinLocationViewKt$$ExternalSyntheticLambda1(19, function13);
                        gapComposer.updateRememberedValue(rememberedValue21);
                    }
                    RealSheetState realSheetState3 = realSheetState;
                    SheetKt.Sheet((Function0) rememberedValue21, null, realSheetState3, sheetPeekPosition$FixedHeight, null, false, null, Expect_jvmKt.rememberComposableLambda(1203555570, new CardStudioViewV2Kt$$ExternalSyntheticLambda6(bitcoinTransferViewModel, realSheetState3, function13, mutableState8, amountDisplayState3, coroutineScope, shaker, mutableFloatState3, mutableState5, mutableState9, mutableFloatState2, mutableState6), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                BitcoinMapViewKt.BitcoinLocationView((BitcoinLocationViewModel) obj6, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                BitcoinMapViewKt.BitcoinMapOnboardingView((BitcoinMapOnboardingViewModel) obj6, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                BitcoinPerformanceDetailsViewKt.InfoItemBottomSheetContent((BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem) obj6, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                SendStablecoinViewKt.StablecoinDepositCopyView((StablecoinDepositCopyViewModel) obj6, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                DistanceAndFlags.BitcoinInstrumentRecommendationView((BitcoinInstrumentRecommendationViewModel) obj6, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                ((ErrorPresenter) obj6).m3423models((Flow) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                ((AddAliasPresenter) obj6).m3724models((Flow) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                ((LocalPosCheckInPresenter) obj6).m1222models((Flow) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                ((AddAliasPresenter) obj6).m3724models((Flow) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                ((AddAliasPresenter) obj6).m3724models((Flow) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                ((CameraPermissionPresenter) obj6).m3422models((Flow) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                ((CardStudioPresenter) obj6).m3429models((Flow) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                ((DisclosurePresenter) obj6).m3435models((Flow) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                ((ErrorPresenter) obj6).m3423models((Flow) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                ((LocalPosCheckInPresenter) obj6).m1222models((Flow) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                ((AddAliasPresenter) obj6).m3724models((Flow) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                ((AddAliasPresenter) obj6).m3724models((Flow) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                ((LocalPosCheckInPresenter) obj6).m1222models((Flow) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                ((AddAliasPresenter) obj6).m3724models((Flow) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                ((CameraPermissionPresenter) obj6).m3422models((Flow) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((EndAppLockPresenter) obj6).m1348models((Flow) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
