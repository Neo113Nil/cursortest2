package com.squareup.cash.payments.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.text.font.FontWeightKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahh;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahj;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.address.StablecoinNetwork;
import com.squareup.cash.crypto.address.StablecoinWithdrawalOption;
import com.squareup.cash.featureflags.AmplitudeExperiments$CoreFlowQrScanSearchbar;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobilePayLinksAddRecipientAsPrimaryCta;
import com.squareup.cash.featureflags.AmplitudeExperiments$P2pCoreFlowRecurringPayments;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.payments.screens.PaymentConfigurationFlow;
import com.squareup.cash.payments.screens.PaymentConfigurationStep;
import com.squareup.cash.payments.screens.PaymentConfigurationStep$TransientStep$Loading;
import com.squareup.cash.payments.screens.PaymentScheduleSelection;
import com.squareup.cash.payments.screens.SkippableStep;
import com.squareup.cash.payments.viewmodels.LabeledDetailRow;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationTitleViewModel;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.payments.viewmodels.RecurringDisabledInstrument;
import com.squareup.cash.payments.viewmodels.RecurringDisabledInstrumentKt$WhenMappings;
import com.squareup.cash.payments.viewmodels.StablecoinWithdrawalOptionRow;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.wire.GrpcStatus;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealPaymentConfigurationRouter {
    public final StateFlowImpl _currentModel;
    public final StateFlowImpl _currentStep;
    public final PaymentRouterData args;
    public final AndroidClock clock;
    public final ReadonlyStateFlow currentModel;
    public final ReadonlyStateFlow currentStep;
    public final AndroidDateFormatManager dateFormatManager;
    public final FeatureFlagManager featureFlagManager;
    public final MoneyFormatter keypadMoneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final MoneyFormatter previewMoneyFormatter;
    public final AndroidStringManager stringManager;
    public final ToolbarTuckTargets titleBuilder;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.CASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.BILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealPaymentConfigurationRouter(FeatureFlagManager featureFlagManager, PaymentRouterData paymentRouterData, BetterNavigator.ScreenNavigator screenNavigator, PaymentConfigurationStep paymentConfigurationStep, AndroidStringManager androidStringManager, AndroidClock androidClock, AndroidDateFormatManager androidDateFormatManager, ToolbarTuckTargets toolbarTuckTargets, LocalizedMoneyFormatter.Factory factory) {
        paymentRouterData.getClass();
        this.featureFlagManager = featureFlagManager;
        this.args = paymentRouterData;
        this.navigator = screenNavigator;
        this.stringManager = androidStringManager;
        this.clock = androidClock;
        this.dateFormatManager = androidDateFormatManager;
        this.titleBuilder = toolbarTuckTargets;
        this.keypadMoneyFormatter = factory.createNoSymbolCompact();
        this.previewMoneyFormatter = factory.create(MoneyFormatterConfig.STANDARD);
        if (paymentConfigurationStep == null) {
            for (PaymentConfigurationStep paymentConfigurationStep2 : paymentRouterData.paymentConfigurationFlow.getSteps()) {
                PaymentRouterData paymentRouterData2 = this.args;
                if (!FontWeightKt.access$shouldSkip(paymentConfigurationStep2, paymentRouterData2)) {
                    if (Intrinsics.areEqual(paymentConfigurationStep2, PaymentConfigurationStep.NavigableStep.SelectRecipient.INSTANCE)) {
                        if (paymentRouterData2.recipient != null) {
                        }
                    } else if (Intrinsics.areEqual(paymentConfigurationStep2, SkippableStep.InputAmount.INSTANCE)) {
                        Long l = paymentRouterData2.amount.amount;
                        long longValue = l != null ? l.longValue() : 0L;
                        CurrencyCode currencyCode = paymentRouterData2.amount.currency_code;
                        if (longValue >= ((long) Moneys.displayDivisor(currencyCode == null ? CurrencyCode.USD : currencyCode))) {
                        }
                    } else if (Intrinsics.areEqual(paymentConfigurationStep2, SkippableStep.InputNote.INSTANCE)) {
                        String str = paymentRouterData2.note;
                        if (str != null && !StringsKt.isBlank(str)) {
                        }
                    } else if (Intrinsics.areEqual(paymentConfigurationStep2, SkippableStep.SelectStablecoinWithdrawalOption.INSTANCE)) {
                        if (paymentRouterData2.recipient != null) {
                        }
                    } else if (!Intrinsics.areEqual(paymentConfigurationStep2, PaymentConfigurationStep$TransientStep$Loading.INSTANCE) && !Intrinsics.areEqual(paymentConfigurationStep2, PaymentConfigurationStep.NavigableStep.ReviewPayment.INSTANCE) && !Intrinsics.areEqual(paymentConfigurationStep2, PaymentConfigurationStep.NavigableStep.RequestShareOption.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        throw null;
                    }
                }
            }
            OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
            throw null;
        }
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(paymentConfigurationStep2);
        this._currentStep = MutableStateFlow;
        this.currentStep = FlowKt.asStateFlow(MutableStateFlow);
        StateFlowImpl MutableStateFlow2 = FlowKt.MutableStateFlow(toViewModel((PaymentConfigurationStep) MutableStateFlow.getValue(), this.args));
        this._currentModel = MutableStateFlow2;
        this.currentModel = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final PaymentConfigurationTitleViewModel buildTitle(PaymentConfigurationStep paymentConfigurationStep, PaymentRouterData paymentRouterData) {
        List list;
        ToolbarTuckTargets toolbarTuckTargets = this.titleBuilder;
        AndroidStringManager androidStringManager = (AndroidStringManager) toolbarTuckTargets.startCornerCenterX$delegate;
        paymentRouterData.getClass();
        Money money = paymentRouterData.amount;
        paymentConfigurationStep.getClass();
        PaymentConfigurationFlow paymentConfigurationFlow = paymentRouterData.paymentConfigurationFlow;
        String str = paymentRouterData.note;
        RecipientViewModel recipientViewModel = paymentRouterData.recipient;
        boolean z = paymentConfigurationFlow instanceof PaymentConfigurationFlow.Lite;
        PaymentConfigurationStep.NavigableStep.SelectRecipient selectRecipient = PaymentConfigurationStep.NavigableStep.SelectRecipient.INSTANCE;
        if (z) {
            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            createListBuilder.add(toolbarTuckTargets.getAmountTitle(paymentRouterData, toolbarTuckTargets.preposition(selectRecipient, paymentRouterData), money, false));
            if (!paymentConfigurationStep.equals(selectRecipient)) {
                recipientViewModel.getClass();
                createListBuilder.add(toolbarTuckTargets.getRecipientTitle(recipientViewModel, null));
            }
            list = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
        } else {
            boolean z2 = paymentConfigurationFlow instanceof PaymentConfigurationFlow.Default;
            SkippableStep.InputNote inputNote = SkippableStep.InputNote.INSTANCE;
            Object obj = PaymentConfigurationStep.NavigableStep.ReviewPayment.INSTANCE;
            if (!z2) {
                boolean z3 = paymentConfigurationFlow instanceof PaymentConfigurationFlow.PersonFirst;
                Object obj2 = SkippableStep.InputAmount.INSTANCE;
                if (z3) {
                    ListBuilder createListBuilder2 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    boolean equals = paymentConfigurationStep.equals(obj2);
                    boolean z4 = !equals;
                    String preposition = toolbarTuckTargets.preposition(selectRecipient, paymentRouterData);
                    if (equals) {
                        money = null;
                    }
                    createListBuilder2.add(toolbarTuckTargets.getAmountTitle(paymentRouterData, preposition, money, z4));
                    String preposition2 = paymentConfigurationStep.equals(obj2) ? null : toolbarTuckTargets.preposition(inputNote, paymentRouterData);
                    recipientViewModel.getClass();
                    createListBuilder2.add(toolbarTuckTargets.getRecipientTitle(recipientViewModel, preposition2));
                    if (paymentConfigurationStep.equals(obj) && str != null) {
                        createListBuilder2.add(ToolbarTuckTargets.getNoteTitle(str, null));
                    }
                    list = CollectionsKt__CollectionsJVMKt.build(createListBuilder2);
                } else if (paymentConfigurationFlow instanceof PaymentConfigurationFlow.PayLink) {
                    ListBuilder createListBuilder3 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    createListBuilder3.add(toolbarTuckTargets.getAmountTitle(paymentRouterData, toolbarTuckTargets.preposition(inputNote, paymentRouterData), money, false));
                    if (paymentConfigurationStep.equals(PaymentConfigurationStep.NavigableStep.RequestShareOption.INSTANCE)) {
                        if (str != null) {
                            createListBuilder3.add(ToolbarTuckTargets.getNoteTitle(str, null));
                        }
                    } else if (paymentConfigurationStep.equals(selectRecipient)) {
                        if (str != null) {
                            createListBuilder3.add(ToolbarTuckTargets.getNoteTitle(str, toolbarTuckTargets.preposition(selectRecipient, paymentRouterData)));
                        }
                    } else if (paymentConfigurationStep.equals(obj)) {
                        if (str != null) {
                            createListBuilder3.add(ToolbarTuckTargets.getNoteTitle(str, toolbarTuckTargets.preposition(selectRecipient, paymentRouterData)));
                        }
                        if (recipientViewModel != null) {
                            createListBuilder3.add(toolbarTuckTargets.getRecipientTitle(recipientViewModel, null));
                        }
                    }
                    list = CollectionsKt__CollectionsJVMKt.build(createListBuilder3);
                } else if (paymentConfigurationFlow instanceof PaymentConfigurationFlow.PayLinkReview) {
                    if (paymentConfigurationStep instanceof PaymentConfigurationStep.NavigableStep.ReviewPayment) {
                        ListBuilder createListBuilder4 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                        createListBuilder4.add(toolbarTuckTargets.getAmountTitle(paymentRouterData, toolbarTuckTargets.preposition(selectRecipient, paymentRouterData), money, false));
                        if (recipientViewModel != null) {
                            createListBuilder4.add(toolbarTuckTargets.getRecipientTitle(recipientViewModel, toolbarTuckTargets.preposition(inputNote, paymentRouterData)));
                        }
                        if (str != null) {
                            createListBuilder4.add(ToolbarTuckTargets.getNoteTitle(str, null));
                        }
                        list = CollectionsKt__CollectionsJVMKt.build(createListBuilder4);
                    } else {
                        list = EmptyList.INSTANCE;
                    }
                } else {
                    if (!(paymentConfigurationFlow instanceof PaymentConfigurationFlow.StablecoinQrScanFlow)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (paymentConfigurationStep.equals(PaymentConfigurationStep$TransientStep$Loading.INSTANCE)) {
                        list = EmptyList.INSTANCE;
                    } else if (paymentConfigurationStep.equals(obj2)) {
                        list = EmptyList.INSTANCE;
                    } else if (paymentConfigurationStep.equals(SkippableStep.SelectStablecoinWithdrawalOption.INSTANCE)) {
                        ListBuilder createListBuilder5 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                        createListBuilder5.add(toolbarTuckTargets.getAmountTitle(paymentRouterData, toolbarTuckTargets.preposition(selectRecipient, paymentRouterData), money, false));
                        StablecoinWithdrawalOption stablecoinWithdrawalOption = (StablecoinWithdrawalOption) CollectionsKt.firstOrNull(paymentRouterData.stablecoinWithdrawalOptions);
                        if (stablecoinWithdrawalOption != null) {
                            createListBuilder5.add(ToolbarTuckTargets.getStablecoinRecipientTitle(stablecoinWithdrawalOption, androidStringManager.get(R.string.composer_amount_on_title), false));
                        }
                        list = CollectionsKt__CollectionsJVMKt.build(createListBuilder5);
                    } else if (paymentConfigurationStep.equals(obj)) {
                        recipientViewModel.getClass();
                        StablecoinWithdrawalOption stablecoinOptionOrNull = zzahh.stablecoinOptionOrNull(recipientViewModel);
                        stablecoinOptionOrNull.getClass();
                        list = CollectionsKt__CollectionsKt.listOf((Object[]) new PaymentConfigurationTitleViewModel.TitleViewModel[]{toolbarTuckTargets.getAmountTitle(paymentRouterData, toolbarTuckTargets.preposition(selectRecipient, paymentRouterData), money, false), ToolbarTuckTargets.getStablecoinRecipientTitle(stablecoinOptionOrNull, androidStringManager.get(R.string.composer_amount_in_title), true), ToolbarTuckTargets.getAssetTitle(stablecoinOptionOrNull)});
                    } else {
                        list = EmptyList.INSTANCE;
                    }
                }
            } else if (zzahh.isStablecoinWithdrawalRecipient(recipientViewModel)) {
                recipientViewModel.getClass();
                StablecoinWithdrawalOption stablecoinOptionOrNull2 = zzahh.stablecoinOptionOrNull(recipientViewModel);
                stablecoinOptionOrNull2.getClass();
                ListBuilder createListBuilder6 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                createListBuilder6.add(toolbarTuckTargets.getAmountTitle(paymentRouterData, toolbarTuckTargets.preposition(selectRecipient, paymentRouterData), money, false));
                if (paymentConfigurationStep.equals(obj)) {
                    createListBuilder6.add(ToolbarTuckTargets.getStablecoinRecipientTitle(stablecoinOptionOrNull2, androidStringManager.get(R.string.composer_amount_in_title), true));
                    createListBuilder6.add(ToolbarTuckTargets.getAssetTitle(stablecoinOptionOrNull2));
                }
                list = CollectionsKt__CollectionsJVMKt.build(createListBuilder6);
            } else {
                ListBuilder createListBuilder7 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                createListBuilder7.add(toolbarTuckTargets.getAmountTitle(paymentRouterData, toolbarTuckTargets.preposition(selectRecipient, paymentRouterData), money, false));
                if (!paymentConfigurationStep.equals(selectRecipient)) {
                    recipientViewModel.getClass();
                    createListBuilder7.add(toolbarTuckTargets.getRecipientTitle(recipientViewModel, toolbarTuckTargets.preposition(inputNote, paymentRouterData)));
                }
                if (paymentConfigurationStep.equals(obj) && str != null) {
                    createListBuilder7.add(ToolbarTuckTargets.getNoteTitle(str, null));
                }
                list = CollectionsKt__CollectionsJVMKt.build(createListBuilder7);
            }
        }
        return new PaymentConfigurationTitleViewModel(list, paymentConfigurationFlow instanceof PaymentConfigurationFlow.PersonFirst);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0097, code lost:
    
        if (kotlin.Unit.INSTANCE != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object nextStep(PaymentRouterData paymentRouterData, ContinuationImpl continuationImpl) {
        RealPaymentConfigurationRouter$nextStep$1 realPaymentConfigurationRouter$nextStep$1;
        int i;
        int indexOf;
        PaymentConfigurationStep paymentConfigurationStep;
        if (continuationImpl instanceof RealPaymentConfigurationRouter$nextStep$1) {
            realPaymentConfigurationRouter$nextStep$1 = (RealPaymentConfigurationRouter$nextStep$1) continuationImpl;
            int i2 = realPaymentConfigurationRouter$nextStep$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPaymentConfigurationRouter$nextStep$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPaymentConfigurationRouter$nextStep$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPaymentConfigurationRouter$nextStep$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    List steps = this.args.paymentConfigurationFlow.getSteps();
                    StateFlowImpl stateFlowImpl = this._currentStep;
                    indexOf = steps.indexOf(stateFlowImpl.getValue()) + 1;
                    PaymentConfigurationStep paymentConfigurationStep2 = (PaymentConfigurationStep) CollectionsKt.getOrNull(indexOf, steps);
                    while (paymentConfigurationStep2 != null && FontWeightKt.access$shouldSkip(paymentConfigurationStep2, paymentRouterData)) {
                        indexOf++;
                        paymentConfigurationStep2 = (PaymentConfigurationStep) CollectionsKt.getOrNull(indexOf, steps);
                    }
                    if (paymentConfigurationStep2 == null) {
                        return Unit.INSTANCE;
                    }
                    realPaymentConfigurationRouter$nextStep$1.L$0 = paymentRouterData;
                    realPaymentConfigurationRouter$nextStep$1.L$2 = paymentConfigurationStep2;
                    realPaymentConfigurationRouter$nextStep$1.I$0 = indexOf;
                    realPaymentConfigurationRouter$nextStep$1.label = 1;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, paymentConfigurationStep2);
                    if (Unit.INSTANCE != coroutineSingletons) {
                        paymentConfigurationStep = paymentConfigurationStep2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i3 = realPaymentConfigurationRouter$nextStep$1.I$0;
                paymentConfigurationStep = realPaymentConfigurationRouter$nextStep$1.L$2;
                PaymentRouterData paymentRouterData2 = realPaymentConfigurationRouter$nextStep$1.L$0;
                SafeTrace.throwOnFailure(obj);
                indexOf = i3;
                paymentRouterData = paymentRouterData2;
                PaymentConfigurationViewModel viewModel = toViewModel(paymentConfigurationStep, paymentRouterData);
                realPaymentConfigurationRouter$nextStep$1.L$0 = null;
                realPaymentConfigurationRouter$nextStep$1.L$2 = null;
                realPaymentConfigurationRouter$nextStep$1.I$0 = indexOf;
                realPaymentConfigurationRouter$nextStep$1.label = 2;
                StateFlowImpl stateFlowImpl2 = this._currentModel;
                stateFlowImpl2.getClass();
                stateFlowImpl2.updateState(null, viewModel);
            }
        }
        realPaymentConfigurationRouter$nextStep$1 = new RealPaymentConfigurationRouter$nextStep$1(this, continuationImpl);
        Object obj2 = realPaymentConfigurationRouter$nextStep$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPaymentConfigurationRouter$nextStep$1.label;
        if (i != 0) {
        }
        PaymentConfigurationViewModel viewModel2 = toViewModel(paymentConfigurationStep, paymentRouterData);
        realPaymentConfigurationRouter$nextStep$1.L$0 = null;
        realPaymentConfigurationRouter$nextStep$1.L$2 = null;
        realPaymentConfigurationRouter$nextStep$1.I$0 = indexOf;
        realPaymentConfigurationRouter$nextStep$1.label = 2;
        StateFlowImpl stateFlowImpl22 = this._currentModel;
        stateFlowImpl22.getClass();
        stateFlowImpl22.updateState(null, viewModel2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00dc, code lost:
    
        if (kotlin.Unit.INSTANCE != r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object previousStep(PaymentRouterData paymentRouterData, ContinuationImpl continuationImpl) {
        RealPaymentConfigurationRouter$previousStep$1 realPaymentConfigurationRouter$previousStep$1;
        int i;
        PaymentRouterData paymentRouterData2;
        PaymentConfigurationStep.NavigableStep navigableStep;
        if (continuationImpl instanceof RealPaymentConfigurationRouter$previousStep$1) {
            realPaymentConfigurationRouter$previousStep$1 = (RealPaymentConfigurationRouter$previousStep$1) continuationImpl;
            int i2 = realPaymentConfigurationRouter$previousStep$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPaymentConfigurationRouter$previousStep$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPaymentConfigurationRouter$previousStep$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPaymentConfigurationRouter$previousStep$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlowImpl stateFlowImpl = this._currentStep;
                    PaymentConfigurationStep paymentConfigurationStep = (PaymentConfigurationStep) stateFlowImpl.getValue();
                    List steps = this.args.paymentConfigurationFlow.getSteps();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : steps) {
                        if (Intrinsics.areEqual((PaymentConfigurationStep) obj2, paymentConfigurationStep)) {
                            break;
                        }
                        arrayList.add(obj2);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof PaymentConfigurationStep.NavigableStep) {
                            arrayList2.add(next);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (!FontWeightKt.access$shouldSkip((PaymentConfigurationStep.NavigableStep) next2, paymentRouterData)) {
                            arrayList3.add(next2);
                        }
                    }
                    PaymentConfigurationStep.NavigableStep navigableStep2 = (PaymentConfigurationStep.NavigableStep) CollectionsKt.lastOrNull((List) arrayList3);
                    if (navigableStep2 == null) {
                        this.navigator.goTo(Back.INSTANCE);
                        return Unit.INSTANCE;
                    }
                    realPaymentConfigurationRouter$previousStep$1.L$0 = paymentRouterData;
                    realPaymentConfigurationRouter$previousStep$1.L$2 = navigableStep2;
                    realPaymentConfigurationRouter$previousStep$1.label = 1;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, navigableStep2);
                    if (Unit.INSTANCE != coroutineSingletons) {
                        paymentRouterData2 = paymentRouterData;
                        navigableStep = navigableStep2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                navigableStep = realPaymentConfigurationRouter$previousStep$1.L$2;
                paymentRouterData2 = realPaymentConfigurationRouter$previousStep$1.L$0;
                SafeTrace.throwOnFailure(obj);
                PaymentConfigurationViewModel viewModel = toViewModel(navigableStep, paymentRouterData2);
                realPaymentConfigurationRouter$previousStep$1.L$0 = null;
                realPaymentConfigurationRouter$previousStep$1.L$2 = null;
                realPaymentConfigurationRouter$previousStep$1.label = 2;
                StateFlowImpl stateFlowImpl2 = this._currentModel;
                stateFlowImpl2.getClass();
                stateFlowImpl2.updateState(null, viewModel);
            }
        }
        realPaymentConfigurationRouter$previousStep$1 = new RealPaymentConfigurationRouter$previousStep$1(this, continuationImpl);
        Object obj3 = realPaymentConfigurationRouter$previousStep$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPaymentConfigurationRouter$previousStep$1.label;
        if (i != 0) {
        }
        PaymentConfigurationViewModel viewModel2 = toViewModel(navigableStep, paymentRouterData2);
        realPaymentConfigurationRouter$previousStep$1.L$0 = null;
        realPaymentConfigurationRouter$previousStep$1.L$2 = null;
        realPaymentConfigurationRouter$previousStep$1.label = 2;
        StateFlowImpl stateFlowImpl22 = this._currentModel;
        stateFlowImpl22.getClass();
        stateFlowImpl22.updateState(null, viewModel2);
    }

    public final boolean showClose(PaymentConfigurationStep paymentConfigurationStep) {
        List steps = this.args.paymentConfigurationFlow.getSteps();
        ArrayList arrayList = new ArrayList();
        for (Object obj : steps) {
            if (Intrinsics.areEqual((PaymentConfigurationStep) obj, paymentConfigurationStep)) {
                break;
            }
            arrayList.add(obj);
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((PaymentConfigurationStep) it.next()) instanceof PaymentConfigurationStep.NavigableStep) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0309 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PaymentConfigurationViewModel toViewModel(PaymentConfigurationStep paymentConfigurationStep, PaymentRouterData paymentRouterData) {
        boolean z;
        PaymentScheduleSelection paymentScheduleSelection;
        boolean z2;
        MoneyFormatter moneyFormatter;
        RecipientViewModel recipientViewModel;
        String str;
        PaymentScheduleSelection paymentScheduleSelection2;
        Orientation orientation;
        List listOf;
        String str2;
        PaymentScheduleSelection paymentScheduleSelection3;
        boolean z3;
        int i;
        String str3;
        String str4;
        InstrumentSelectionRowViewModel instrumentSelectionRowViewModel;
        RecurringDisabledInstrument recurringDisabledInstrument;
        CashInstrumentType cashInstrumentType;
        int i2;
        Recipient recipient;
        Recipient recipient2;
        boolean areEqual = Intrinsics.areEqual(paymentConfigurationStep, PaymentConfigurationStep.NavigableStep.SelectRecipient.INSTANCE);
        FeatureFlagManager featureFlagManager = this.featureFlagManager;
        if (areEqual) {
            return new PaymentConfigurationViewModel.SelectRecipientMenu(buildTitle(paymentConfigurationStep, paymentRouterData), showClose(paymentConfigurationStep), paymentRouterData.expandedSheet, paymentRouterData.sections, paymentRouterData.searchQuery, paymentRouterData.showContactPermissionPrompt, paymentRouterData.showSyncContactsRow, paymentRouterData.showNoContactsFoundCard, paymentRouterData.loading, ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$CoreFlowQrScanSearchbar.INSTANCE)).enabled(), paymentRouterData.showSearchTooltip);
        }
        boolean areEqual2 = Intrinsics.areEqual(paymentConfigurationStep, SkippableStep.InputNote.INSTANCE);
        PaymentRouterData paymentRouterData2 = this.args;
        AndroidStringManager androidStringManager = this.stringManager;
        if (areEqual2) {
            PaymentConfigurationTitleViewModel buildTitle = buildTitle(paymentConfigurationStep, paymentRouterData);
            boolean showClose = showClose(paymentConfigurationStep);
            RecipientViewModel recipientViewModel2 = paymentRouterData.recipient;
            String str5 = paymentRouterData.note;
            return new PaymentConfigurationViewModel.InputNote(buildTitle, showClose, recipientViewModel2, str5 == null ? "" : str5, !(str5 == null || StringsKt.isBlank(str5)), paymentRouterData2.paymentConfigurationFlow instanceof PaymentConfigurationFlow.PayLink ? androidStringManager.get(R.string.send_payment_continue_button) : androidStringManager.get(R.string.review_payment_button));
        }
        if (Intrinsics.areEqual(paymentConfigurationStep, SkippableStep.InputAmount.INSTANCE)) {
            Money money = paymentRouterData.amount;
            CurrencyCode currencyCode = money.currency_code;
            CurrencyCode currencyCode2 = currencyCode == null ? CurrencyCode.USD : currencyCode;
            if (currencyCode == null) {
                Long l = paymentRouterData.amount.amount;
                money = new Money(Long.valueOf(l != null ? l.longValue() : 0L), currencyCode2, 4);
            }
            PaymentConfigurationTitleViewModel buildTitle2 = buildTitle(paymentConfigurationStep, paymentRouterData);
            boolean showClose2 = showClose(paymentConfigurationStep);
            RecipientViewModel recipientViewModel3 = paymentRouterData.recipient;
            String format2 = this.keypadMoneyFormatter.format(money);
            Long l2 = money.amount;
            return new PaymentConfigurationViewModel.InputAmount(buildTitle2, showClose2, recipientViewModel3, format2, currencyCode2, (l2 != null ? l2.longValue() : 0L) >= ((long) Moneys.displayDivisor(currencyCode2)), androidStringManager.get(R.string.send_payment_continue_button));
        }
        if (Intrinsics.areEqual(paymentConfigurationStep, SkippableStep.SelectStablecoinWithdrawalOption.INSTANCE)) {
            PaymentConfigurationTitleViewModel buildTitle3 = buildTitle(paymentConfigurationStep, paymentRouterData);
            boolean showClose3 = showClose(paymentConfigurationStep);
            List<StablecoinWithdrawalOption> list = paymentRouterData.stablecoinWithdrawalOptions;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (StablecoinWithdrawalOption stablecoinWithdrawalOption : list) {
                StablecoinNetwork stablecoinNetwork = stablecoinWithdrawalOption.network;
                Image image = new Image(stablecoinNetwork.chainIconLightUrl, stablecoinNetwork.chainIconDarkUrl, 4);
                StablecoinNetwork stablecoinNetwork2 = stablecoinWithdrawalOption.network;
                Character monogram = GrpcStatus.Companion.monogram(stablecoinNetwork2.chainName);
                arrayList.add(new StablecoinWithdrawalOptionRow(stablecoinWithdrawalOption, new PaymentConfigurationTitleViewModel.TitleViewModel.AvatarViewModel(null, image, monogram != null ? String.valueOf(monogram.charValue()) : null), stablecoinNetwork2.chainName, stablecoinNetwork2.truncatedAddress));
            }
            return new PaymentConfigurationViewModel.SelectStablecoinWithdrawalOption(buildTitle3, showClose3, arrayList, androidStringManager.get(R.string.composer_stablecoin_withdrawal_option_disclaimer));
        }
        if (!Intrinsics.areEqual(paymentConfigurationStep, PaymentConfigurationStep.NavigableStep.ReviewPayment.INSTANCE)) {
            if (Intrinsics.areEqual(paymentConfigurationStep, PaymentConfigurationStep.NavigableStep.RequestShareOption.INSTANCE)) {
                PaymentConfigurationTitleViewModel buildTitle4 = buildTitle(paymentConfigurationStep, paymentRouterData);
                boolean showClose4 = showClose(paymentConfigurationStep);
                String str6 = paymentRouterData.note;
                return new PaymentConfigurationViewModel.RequestShareOption(buildTitle4, showClose4, str6 == null ? "" : str6, paymentRouterData.createLinkInProgress, paymentRouterData.createLinkErrored, ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$MobilePayLinksAddRecipientAsPrimaryCta.INSTANCE)).enabled());
            }
            if (Intrinsics.areEqual(paymentConfigurationStep, PaymentConfigurationStep$TransientStep$Loading.INSTANCE)) {
                return new PaymentConfigurationViewModel.Loading(buildTitle(paymentConfigurationStep, paymentRouterData), showClose(paymentConfigurationStep), paymentRouterData.loadingStatus);
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        Orientation orientation2 = paymentRouterData.orientation;
        ExpressivePreviewData expressivePreviewData = paymentRouterData.expressivePreview;
        Money money2 = paymentRouterData.amount;
        RecipientViewModel recipientViewModel4 = paymentRouterData.recipient;
        Orientation orientation3 = Orientation.CASH;
        if (orientation2 == orientation3) {
            if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$P2pCoreFlowRecurringPayments.INSTANCE)).enabled() && paymentRouterData.recurringP2pEligible) {
                z = true;
                paymentScheduleSelection = paymentRouterData.scheduleSelection;
                if (!z) {
                    paymentScheduleSelection = null;
                }
                PaymentConfigurationFlow paymentConfigurationFlow = paymentRouterData2.paymentConfigurationFlow;
                boolean z4 = !(!(paymentConfigurationFlow instanceof PaymentConfigurationFlow.Default) ? ((PaymentConfigurationFlow.Default) paymentConfigurationFlow).personalization : paymentConfigurationFlow instanceof PaymentConfigurationFlow.PersonFirst ? ((PaymentConfigurationFlow.PersonFirst) paymentConfigurationFlow).personalization : paymentConfigurationFlow instanceof PaymentConfigurationFlow.Lite) && orientation2 == orientation3 && recipientViewModel4 != null && (recipient2 = recipientViewModel4.recipient) != null && recipient2.isCashCustomer && paymentScheduleSelection == null;
                z2 = paymentRouterData.paymentConfigurationFlow instanceof PaymentConfigurationFlow.Lite;
                moneyFormatter = this.previewMoneyFormatter;
                if (z2 || (recipientViewModel4 != null && (recipient = recipientViewModel4.recipient) != null && orientation2 == orientation3 && money2.currency_code == CurrencyCode.USD && recipient.isCashCustomer && recipient.region == Region.MEX)) {
                    money2.getClass();
                    moneyFormatter.getClass();
                    String format3 = moneyFormatter.format(money2);
                    recipientViewModel = recipientViewModel4;
                    str = "";
                    paymentScheduleSelection2 = paymentScheduleSelection;
                    orientation = orientation2;
                    listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new LabeledDetailRow[]{new LabeledDetailRow(androidStringManager.get(R.string.lite_amount_label), format3), new LabeledDetailRow(androidStringManager.get(R.string.lite_rate_label), androidStringManager.get(R.string.lite_rate_value)), new LabeledDetailRow(androidStringManager.get(R.string.lite_fees_label), moneyFormatter.format(new Money((Long) 0L, money2.currency_code, 4))), new LabeledDetailRow(androidStringManager.get(R.string.lite_recipient_gets_label), format3), new LabeledDetailRow(androidStringManager.get(R.string.lite_speed_label), androidStringManager.get(R.string.lite_speed_value))});
                } else {
                    orientation = orientation2;
                    paymentScheduleSelection2 = paymentScheduleSelection;
                    recipientViewModel = recipientViewModel4;
                    str = "";
                    if (zzahh.isStablecoinWithdrawalRecipient(recipientViewModel)) {
                        listOf = EmptyList.INSTANCE;
                    } else {
                        recipientViewModel.getClass();
                        StablecoinWithdrawalOption stablecoinOptionOrNull = zzahh.stablecoinOptionOrNull(recipientViewModel);
                        stablecoinOptionOrNull.getClass();
                        money2.getClass();
                        moneyFormatter.getClass();
                        StablecoinNetwork stablecoinNetwork3 = stablecoinOptionOrNull.network;
                        String str7 = stablecoinNetwork3.assetName;
                        String str8 = stablecoinNetwork3.chainName;
                        String str9 = androidStringManager.get(R.string.stablecoin_transaction_type_label);
                        str7.getClass();
                        str8.getClass();
                        Resources resources = androidStringManager.resources;
                        resources.getClass();
                        String format4 = new MessageFormat(resources.getString(R.string.stablecoin_transaction_type_value_format)).format(new Object[]{str7, str8});
                        format4.getClass();
                        LabeledDetailRow labeledDetailRow = new LabeledDetailRow(str9, format4);
                        String str10 = androidStringManager.get(R.string.stablecoin_exchange_rate_label);
                        String format5 = new MessageFormat(resources.getString(R.string.stablecoin_exchange_rate_value_format)).format(new Object[]{str7});
                        format5.getClass();
                        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new LabeledDetailRow[]{labeledDetailRow, new LabeledDetailRow(str10, format5), new LabeledDetailRow(androidStringManager.get(R.string.stablecoin_total_amount_label), moneyFormatter.format(money2))});
                    }
                }
                List list2 = listOf;
                PaymentConfigurationTitleViewModel buildTitle5 = buildTitle(paymentConfigurationStep, paymentRouterData);
                str2 = str;
                boolean showClose5 = showClose(paymentConfigurationStep);
                RecipientViewModel recipientViewModel5 = paymentRouterData.recipient;
                paymentScheduleSelection3 = paymentScheduleSelection2;
                boolean z5 = paymentScheduleSelection2 != null;
                if (z && paymentScheduleSelection3 == null) {
                    instrumentSelectionRowViewModel = paymentRouterData.instrumentRowModel;
                    if (instrumentSelectionRowViewModel != null && (cashInstrumentType = instrumentSelectionRowViewModel.cashInstrumentType) != null) {
                        i2 = RecurringDisabledInstrumentKt$WhenMappings.$EnumSwitchMapping$0[cashInstrumentType.ordinal()];
                        if (i2 != 1) {
                            recurringDisabledInstrument = RecurringDisabledInstrument.CREDIT_CARD;
                        } else if (i2 == 2) {
                            recurringDisabledInstrument = RecurringDisabledInstrument.GOOGLE_PAY;
                        }
                        if (recurringDisabledInstrument != null) {
                            z3 = true;
                            RecurringDisabledInstrument recurringDisabledInstrument2 = paymentRouterData.recurringDisabledToast;
                            Image image2 = expressivePreviewData == null ? expressivePreviewData.backgroundImage : null;
                            Color color = expressivePreviewData == null ? expressivePreviewData.backgroundColor : null;
                            if (expressivePreviewData != null || (r7 = expressivePreviewData.backgroundEffects) == null) {
                                List list3 = EmptyList.INSTANCE;
                            }
                            List list4 = list3;
                            String format6 = expressivePreviewData == null ? moneyFormatter.format(money2) : null;
                            Color color2 = expressivePreviewData == null ? expressivePreviewData.textColor : null;
                            List list5 = expressivePreviewData == null ? expressivePreviewData.stickers : EmptyList.INSTANCE;
                            InstrumentSelectionRowViewModel instrumentSelectionRowViewModel2 = paymentRouterData.instrumentRowModel;
                            String str11 = paymentRouterData.note;
                            String str12 = str11 != null ? str2 : str11;
                            if (paymentScheduleSelection3 == null) {
                                str3 = androidStringManager.get(R.string.payment_schedule_pay_on_schedule_button);
                            } else if (zzahh.isStablecoinWithdrawalRecipient(recipientViewModel)) {
                                str3 = androidStringManager.get(R.string.stablecoin_send_button);
                            } else {
                                int i3 = WhenMappings.$EnumSwitchMapping$0[paymentRouterData2.orientation.ordinal()];
                                if (i3 == 1) {
                                    i = R.string.payment_send;
                                } else {
                                    if (i3 != 2) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    i = R.string.payment_send_request;
                                }
                                str3 = androidStringManager.get(i);
                            }
                            String str13 = str3;
                            String str14 = !zzahh.isStablecoinWithdrawalRecipient(recipientViewModel) ? androidStringManager.get(R.string.send_payment_confirmation_disclaimer_stablecoin) : orientation == orientation3 ? androidStringManager.get(R.string.send_payment_confirmation_disclaimer) : null;
                            if (paymentScheduleSelection3 != null) {
                                String disclaimerText = zzahj.disclaimerText(paymentScheduleSelection3, androidStringManager, zzahj.startDateText(paymentScheduleSelection3, DimensionKt.nowLocalDate(this.clock), androidStringManager, this.dateFormatManager));
                                if (str14 == null || str14.length() == 0) {
                                    str4 = disclaimerText;
                                    return new PaymentConfigurationViewModel.ReviewPayment(buildTitle5, recipientViewModel5, showClose5, z4, z, z5, z3, recurringDisabledInstrument2, image2, color, list4, format6, color2, list5, instrumentSelectionRowViewModel2, str12, str13, str4, list2);
                                }
                                str14 = Recorder$$ExternalSyntheticOutline2.m(str14, "\n", disclaimerText);
                            }
                            str4 = str14;
                            return new PaymentConfigurationViewModel.ReviewPayment(buildTitle5, recipientViewModel5, showClose5, z4, z, z5, z3, recurringDisabledInstrument2, image2, color, list4, format6, color2, list5, instrumentSelectionRowViewModel2, str12, str13, str4, list2);
                        }
                    }
                    recurringDisabledInstrument = null;
                    if (recurringDisabledInstrument != null) {
                    }
                }
                z3 = false;
                RecurringDisabledInstrument recurringDisabledInstrument22 = paymentRouterData.recurringDisabledToast;
                if (expressivePreviewData == null) {
                }
                if (expressivePreviewData == null) {
                }
                if (expressivePreviewData != null) {
                }
                List list32 = EmptyList.INSTANCE;
                List list42 = list32;
                if (expressivePreviewData == null) {
                }
                if (expressivePreviewData == null) {
                }
                List list52 = expressivePreviewData == null ? expressivePreviewData.stickers : EmptyList.INSTANCE;
                InstrumentSelectionRowViewModel instrumentSelectionRowViewModel22 = paymentRouterData.instrumentRowModel;
                String str112 = paymentRouterData.note;
                if (str112 != null) {
                }
                if (paymentScheduleSelection3 == null) {
                }
                String str132 = str3;
                if (!zzahh.isStablecoinWithdrawalRecipient(recipientViewModel)) {
                }
                if (paymentScheduleSelection3 != null) {
                }
                str4 = str14;
                return new PaymentConfigurationViewModel.ReviewPayment(buildTitle5, recipientViewModel5, showClose5, z4, z, z5, z3, recurringDisabledInstrument22, image2, color, list42, format6, color2, list52, instrumentSelectionRowViewModel22, str12, str132, str4, list2);
            }
        }
        z = false;
        paymentScheduleSelection = paymentRouterData.scheduleSelection;
        if (!z) {
        }
        PaymentConfigurationFlow paymentConfigurationFlow2 = paymentRouterData2.paymentConfigurationFlow;
        if (!(paymentConfigurationFlow2 instanceof PaymentConfigurationFlow.Default) ? ((PaymentConfigurationFlow.Default) paymentConfigurationFlow2).personalization : paymentConfigurationFlow2 instanceof PaymentConfigurationFlow.PersonFirst ? ((PaymentConfigurationFlow.PersonFirst) paymentConfigurationFlow2).personalization : paymentConfigurationFlow2 instanceof PaymentConfigurationFlow.Lite) {
        }
        z2 = paymentRouterData.paymentConfigurationFlow instanceof PaymentConfigurationFlow.Lite;
        moneyFormatter = this.previewMoneyFormatter;
        if (z2) {
            orientation = orientation2;
            paymentScheduleSelection2 = paymentScheduleSelection;
            recipientViewModel = recipientViewModel4;
            str = "";
            if (zzahh.isStablecoinWithdrawalRecipient(recipientViewModel)) {
            }
            List list22 = listOf;
            PaymentConfigurationTitleViewModel buildTitle52 = buildTitle(paymentConfigurationStep, paymentRouterData);
            str2 = str;
            boolean showClose52 = showClose(paymentConfigurationStep);
            RecipientViewModel recipientViewModel52 = paymentRouterData.recipient;
            paymentScheduleSelection3 = paymentScheduleSelection2;
            if (paymentScheduleSelection2 != null) {
            }
            if (z) {
                instrumentSelectionRowViewModel = paymentRouterData.instrumentRowModel;
                if (instrumentSelectionRowViewModel != null) {
                    i2 = RecurringDisabledInstrumentKt$WhenMappings.$EnumSwitchMapping$0[cashInstrumentType.ordinal()];
                    if (i2 != 1) {
                    }
                    if (recurringDisabledInstrument != null) {
                    }
                }
                recurringDisabledInstrument = null;
                if (recurringDisabledInstrument != null) {
                }
            }
            z3 = false;
            RecurringDisabledInstrument recurringDisabledInstrument222 = paymentRouterData.recurringDisabledToast;
            if (expressivePreviewData == null) {
            }
            if (expressivePreviewData == null) {
            }
            if (expressivePreviewData != null) {
            }
            List list322 = EmptyList.INSTANCE;
            List list422 = list322;
            if (expressivePreviewData == null) {
            }
            if (expressivePreviewData == null) {
            }
            List list522 = expressivePreviewData == null ? expressivePreviewData.stickers : EmptyList.INSTANCE;
            InstrumentSelectionRowViewModel instrumentSelectionRowViewModel222 = paymentRouterData.instrumentRowModel;
            String str1122 = paymentRouterData.note;
            if (str1122 != null) {
            }
            if (paymentScheduleSelection3 == null) {
            }
            String str1322 = str3;
            if (!zzahh.isStablecoinWithdrawalRecipient(recipientViewModel)) {
            }
            if (paymentScheduleSelection3 != null) {
            }
            str4 = str14;
            return new PaymentConfigurationViewModel.ReviewPayment(buildTitle52, recipientViewModel52, showClose52, z4, z, z5, z3, recurringDisabledInstrument222, image2, color, list422, format6, color2, list522, instrumentSelectionRowViewModel222, str12, str1322, str4, list22);
        }
        money2.getClass();
        moneyFormatter.getClass();
        String format32 = moneyFormatter.format(money2);
        recipientViewModel = recipientViewModel4;
        str = "";
        paymentScheduleSelection2 = paymentScheduleSelection;
        orientation = orientation2;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new LabeledDetailRow[]{new LabeledDetailRow(androidStringManager.get(R.string.lite_amount_label), format32), new LabeledDetailRow(androidStringManager.get(R.string.lite_rate_label), androidStringManager.get(R.string.lite_rate_value)), new LabeledDetailRow(androidStringManager.get(R.string.lite_fees_label), moneyFormatter.format(new Money((Long) 0L, money2.currency_code, 4))), new LabeledDetailRow(androidStringManager.get(R.string.lite_recipient_gets_label), format32), new LabeledDetailRow(androidStringManager.get(R.string.lite_speed_label), androidStringManager.get(R.string.lite_speed_value))});
        List list222 = listOf;
        PaymentConfigurationTitleViewModel buildTitle522 = buildTitle(paymentConfigurationStep, paymentRouterData);
        str2 = str;
        boolean showClose522 = showClose(paymentConfigurationStep);
        RecipientViewModel recipientViewModel522 = paymentRouterData.recipient;
        paymentScheduleSelection3 = paymentScheduleSelection2;
        if (paymentScheduleSelection2 != null) {
        }
        if (z) {
        }
        z3 = false;
        RecurringDisabledInstrument recurringDisabledInstrument2222 = paymentRouterData.recurringDisabledToast;
        if (expressivePreviewData == null) {
        }
        if (expressivePreviewData == null) {
        }
        if (expressivePreviewData != null) {
        }
        List list3222 = EmptyList.INSTANCE;
        List list4222 = list3222;
        if (expressivePreviewData == null) {
        }
        if (expressivePreviewData == null) {
        }
        List list5222 = expressivePreviewData == null ? expressivePreviewData.stickers : EmptyList.INSTANCE;
        InstrumentSelectionRowViewModel instrumentSelectionRowViewModel2222 = paymentRouterData.instrumentRowModel;
        String str11222 = paymentRouterData.note;
        if (str11222 != null) {
        }
        if (paymentScheduleSelection3 == null) {
        }
        String str13222 = str3;
        if (!zzahh.isStablecoinWithdrawalRecipient(recipientViewModel)) {
        }
        if (paymentScheduleSelection3 != null) {
        }
        str4 = str14;
        return new PaymentConfigurationViewModel.ReviewPayment(buildTitle522, recipientViewModel522, showClose522, z4, z, z5, z3, recurringDisabledInstrument2222, image2, color, list4222, format6, color2, list5222, instrumentSelectionRowViewModel2222, str12, str13222, str4, list222);
    }
}
