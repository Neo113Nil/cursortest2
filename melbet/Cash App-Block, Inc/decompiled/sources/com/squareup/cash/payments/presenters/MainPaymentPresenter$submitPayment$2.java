package com.squareup.cash.payments.presenters;

import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahi;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.maps.android.compose.GoogleMapKt;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.asset.AssetRequestSubmitTransaction;
import com.squareup.cash.cdf.asset.AssetSendSubmitTransaction;
import com.squareup.cash.cdf.asset.ExperienceType;
import com.squareup.cash.cdf.asset.Origin;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.utils.SelectPaymentInstrumentOption;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.payments.common.PaymentRecipient;
import com.squareup.cash.payments.screens.InstrumentSelectionData;
import com.squareup.cash.payments.screens.PaymentInitiatorData;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import com.squareup.cash.recipients.analytics.RecipientAnalyticsKt;
import com.squareup.cash.recipients.backend.api.GenerationStrategy;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.securitysignals.api.SecuritySignalsAggregator;
import com.squareup.cash.session.backend.DbSessionManager$updateDb$2;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.app.AppCreationActivity;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.SignalsContext;
import com.squareup.util.Quadruple;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class MainPaymentPresenter$submitPayment$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ BalanceSnapshot $balanceSnapshot;
    public final /* synthetic */ boolean $hasConfirmedDuplicates;
    public final /* synthetic */ boolean $hasPassedIdv;
    public final /* synthetic */ InstrumentLinkingConfig $instrumentLinkingConfig;
    public final /* synthetic */ InstrumentSelection $instrumentSelection;
    public final /* synthetic */ List $instruments;
    public final /* synthetic */ String $note;
    public final /* synthetic */ Profile $profile;
    public final /* synthetic */ List $selectedRecipients;
    public final /* synthetic */ List $touchEvents;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ MainPaymentPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainPaymentPresenter$submitPayment$2(MainPaymentPresenter mainPaymentPresenter, List list, Profile profile, BalanceSnapshot balanceSnapshot, List list2, InstrumentLinkingConfig instrumentLinkingConfig, boolean z, InstrumentSelection instrumentSelection, String str, boolean z2, List list3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mainPaymentPresenter;
        this.$selectedRecipients = list;
        this.$profile = profile;
        this.$balanceSnapshot = balanceSnapshot;
        this.$instruments = list2;
        this.$instrumentLinkingConfig = instrumentLinkingConfig;
        this.$hasPassedIdv = z;
        this.$instrumentSelection = instrumentSelection;
        this.$note = str;
        this.$hasConfirmedDuplicates = z2;
        this.$touchEvents = list3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MainPaymentPresenter$submitPayment$2 mainPaymentPresenter$submitPayment$2 = new MainPaymentPresenter$submitPayment$2(this.this$0, this.$selectedRecipients, this.$profile, this.$balanceSnapshot, this.$instruments, this.$instrumentLinkingConfig, this.$hasPassedIdv, this.$instrumentSelection, this.$note, this.$hasConfirmedDuplicates, this.$touchEvents, continuation);
        mainPaymentPresenter$submitPayment$2.L$0 = obj;
        return mainPaymentPresenter$submitPayment$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MainPaymentPresenter$submitPayment$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Long, java.lang.Object, java.lang.String, kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        InstrumentSelectionData instrumentSelectionData;
        Redacted redacted;
        ExperienceType experienceType;
        Boolean bool;
        Event assetSendSubmitTransaction;
        GenerationStrategy generationStrategy;
        GenerationStrategy generationStrategy2;
        Recipient.Analytics analytics;
        Recipient.Analytics analytics2;
        Integer num;
        Quadruple quadruple;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        MainPaymentPresenter mainPaymentPresenter = this.this$0;
        PaymentScreens.MainPayment mainPayment = mainPaymentPresenter.args;
        SecuritySignalsAggregator securitySignalsAggregator = mainPaymentPresenter.securitySignalsAggregator;
        mainPayment.getClass();
        List list = this.$selectedRecipients;
        list.getClass();
        String str = this.$note;
        str.getClass();
        Money money = mainPayment.amountInProfileCurrency;
        Orientation orientation = mainPayment.orientation;
        CashInstrumentType cashInstrumentType = mainPayment.instrumentType;
        Profile profile = this.$profile;
        BalanceSnapshot balanceSnapshot = this.$balanceSnapshot;
        List list2 = this.$instruments;
        InstrumentLinkingConfig instrumentLinkingConfig = this.$instrumentLinkingConfig;
        SelectPaymentInstrumentOption.ExistingOption determineSelectedInstrument$default = GoogleMapKt.determineSelectedInstrument$default(list, profile, orientation, cashInstrumentType, money, balanceSnapshot, list2, instrumentLinkingConfig, this.$hasPassedIdv, this.$instrumentSelection);
        List list3 = this.$touchEvents;
        if (list3 == null) {
            list3 = EmptyList.INSTANCE;
        }
        SignalsContext buildSignalsContext = securitySignalsAggregator.buildSignalsContext(list3);
        UUID uuid = mainPayment.paymentToken;
        Orientation orientation2 = mainPayment.orientation;
        List list4 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(RecipientMapper.transform((Recipient) it.next()));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(zzahi.forPayment((com.squareup.cash.db.contacts.Recipient) it2.next()));
        }
        Money money2 = mainPayment.amountInSelectedCurrency;
        if (determineSelectedInstrument$default != null) {
            if (determineSelectedInstrument$default instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance) {
                quadruple = new Quadruple(((SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance) determineSelectedInstrument$default).balance.token, null, CashInstrumentType.CASH_BALANCE, null);
                obj2 = null;
            } else {
                if (!(determineSelectedInstrument$default instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument existingInstrument = (SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument) determineSelectedInstrument$default;
                Instrument instrument = existingInstrument.instrument;
                obj2 = null;
                quadruple = new Quadruple(instrument.token, instrument.cardBrand, instrument.cashInstrumentType, existingInstrument.creditCardFee);
            }
            instrumentSelectionData = new InstrumentSelectionData((String) quadruple.first, (InstrumentType) quadruple.second, (CashInstrumentType) quadruple.third, (Money) quadruple.fourth);
        } else {
            obj2 = null;
            instrumentSelectionData = null;
        }
        String str2 = mainPayment.referrer;
        String str3 = mainPayment.launchUrl;
        AppCreationActivity appCreationActivity = mainPayment.appCreationActivity;
        String str4 = mainPayment.exchangeRatesToken;
        ?? r2 = obj2;
        PaymentInitiatorData paymentInitiatorData = new PaymentInitiatorData(str, orientation2, arrayList2, money2, instrumentSelectionData, this.$hasConfirmedDuplicates, uuid, buildSignalsContext, str2, str3, appCreationActivity, str4, null, null, null, null, null, null, null, null, null, null, 16771072);
        JobKt.launch$default(coroutineScope, r2, r2, new MainPaymentView$Content$2$1(mainPaymentPresenter, list, r2, 11), 3);
        Analytics analytics3 = mainPaymentPresenter.analytics;
        ExperienceType experienceType2 = ExperienceType.LEGACY;
        Map map = RecipientAnalyticsKt.SEARCH_TYPES;
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            PaymentRecipient paymentRecipient = (PaymentRecipient) it3.next();
            int ordinal = paymentRecipient.recipientType.ordinal();
            if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
                if (ordinal != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return r2;
                }
                Timber.Forest.w("Unknown type for recipient " + paymentRecipient, new Object[0]);
            }
        }
        Recipient recipient = (Recipient) CollectionsKt.firstOrNull(list);
        if (((recipient == null || (analytics2 = recipient.analytics) == null || (num = analytics2.searchTextLength) == null) ? 0 : num.intValue()) == 0) {
            Recipient recipient2 = (Recipient) CollectionsKt.firstOrNull(list);
            Recipient.Analytics analytics4 = recipient2 != null ? recipient2.analytics : r2;
            Recipient recipient3 = (Recipient) CollectionsKt.firstOrNull(list);
            String str5 = (recipient3 == null || (analytics = recipient3.analytics) == null) ? r2 : analytics.section;
            int i = RecipientAnalyticsKt.WhenMappings.$EnumSwitchMapping$4[orientation2.ordinal()];
            UUID uuid2 = paymentInitiatorData.paymentToken;
            if (i == 1) {
                int size = arrayList2.size();
                String uuid3 = uuid2.toString();
                String str6 = analytics4 != null ? analytics4.entityToken : r2;
                if (analytics4 != null) {
                    experienceType = experienceType2;
                    bool = analytics4.useCashCustomerSearchServiceEnabled;
                } else {
                    experienceType = experienceType2;
                    bool = r2;
                }
                Boolean bool2 = analytics4 != null ? analytics4.mlSearchEnabled : r2;
                assetSendSubmitTransaction = new AssetSendSubmitTransaction(analytics4 != null ? analytics4.absoluteIndex : r2, str6, uuid3, null, Origin.AMOUNT_FIRST, null, null, Integer.valueOf(size), analytics4 != null ? analytics4.remoteSuggestionType : r2, null, null, str5, analytics4 != null ? analytics4.sectionIndex : r2, analytics4 != null ? analytics4.sectionTotal : r2, null, (analytics4 == null || (generationStrategy = analytics4.generationStrategy) == null) ? r2 : RecipientAnalyticsKt.toAssetSuggestionStrategy(generationStrategy, analytics4.entityToken), bool, bool2, experienceType, null, null, null, null, 128070578);
            } else {
                if (i != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return r2;
                }
                int size2 = arrayList2.size();
                String uuid4 = uuid2.toString();
                Boolean bool3 = analytics4 != null ? analytics4.useCashCustomerSearchServiceEnabled : r2;
                Boolean bool4 = analytics4 != null ? analytics4.mlSearchEnabled : r2;
                assetSendSubmitTransaction = new AssetRequestSubmitTransaction(analytics4 != null ? analytics4.absoluteIndex : r2, uuid4, null, Origin.AMOUNT_FIRST, null, Integer.valueOf(size2), analytics4 != null ? analytics4.remoteSuggestionType : r2, null, null, analytics4 != null ? analytics4.section : r2, analytics4 != null ? analytics4.sectionIndex : r2, analytics4 != null ? analytics4.sectionTotal : r2, null, (analytics4 == null || (generationStrategy2 = analytics4.generationStrategy) == null) ? r2 : RecipientAnalyticsKt.toAssetSuggestionStrategy(generationStrategy2, analytics4.entityToken), bool3, bool4, experienceType2, null, 5315034);
            }
            analytics3.track(assetSendSubmitTransaction, r2);
        }
        String appTokenOrNull = PlatformKt.appTokenOrNull(mainPaymentPresenter.sessionManager);
        if (appTokenOrNull == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
            return r2;
        }
        BetterNavigator.ScreenNavigator screenNavigator = mainPaymentPresenter.navigator;
        IntentLauncher intentLauncher = mainPaymentPresenter.launcher;
        Long l = paymentInitiatorData.amount.amount;
        l.getClass();
        if (l.longValue() == 8675309 && orientation2 == Orientation.BILL) {
            PaymentRecipient paymentRecipient2 = (PaymentRecipient) CollectionsKt.singleOrNull((List) arrayList2);
            if (StringsKt__StringsJVMKt.equals((paymentRecipient2 == null || (redacted = paymentRecipient2.displayName) == null) ? r2 : (String) redacted.getValue(), "jenny@example.com", false)) {
                String str7 = paymentInitiatorData.note;
                int hashCode = str7.hashCode();
                PaymentScreens$HomeScreens$Home paymentScreens$HomeScreens$Home = PaymentScreens$HomeScreens$Home.INSTANCE;
                switch (hashCode) {
                    case -1259466601:
                        if (str7.equals("Nonfatal Nonfatal Nonfatal")) {
                            TestReportedError testReportedError = new TestReportedError();
                            ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
                            if (errorReporter == null) {
                                WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                                return r2;
                            }
                            errorReporter.report(testReportedError, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                            screenNavigator.goTo(paymentScreens$HomeScreens$Home);
                            return Unit.INSTANCE;
                        }
                        break;
                    case -971104916:
                        if (str7.equals("Fatal Fatal Fatal")) {
                            throw new TestReportedError();
                        }
                        break;
                    case 358848779:
                        if (str7.equals("Token Token Token")) {
                            intentLauncher.shareText(appTokenOrNull, r2, r2);
                            screenNavigator.goTo(paymentScreens$HomeScreens$Home);
                            return Unit.INSTANCE;
                        }
                        break;
                    case 1045104277:
                        if (str7.equals("Crash Crash Crash")) {
                            OptionalProvider$$ExternalSyntheticLambda0.m$1("Exception handler test!");
                            return r2;
                        }
                        break;
                }
            }
        }
        JobKt.launch$default(coroutineScope, r2, r2, new DbSessionManager$updateDb$2(mainPaymentPresenter, paymentInitiatorData, this.$selectedRecipients, this.$balanceSnapshot, list2, instrumentLinkingConfig, this.$instrumentSelection, null, 20), 3);
        return Unit.INSTANCE;
    }
}
