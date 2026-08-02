package com.squareup.cash.benefits.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draw.RotateKt;
import androidx.core.text.TextUtilsCompat;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.banking.DisclosureForScreen;
import com.squareup.cash.banking.observability.DefaultProtoParsingExceptionFactory;
import com.squareup.cash.banking.real.RealDisclosureProvider;
import com.squareup.cash.bankingbenefits.api.v1_0.app.RefreshCashGreenSyncValuesRequest;
import com.squareup.cash.benefits.components.presenters.BenefitsComparisonTablePresenter;
import com.squareup.cash.benefits.components.presenters.BenefitsComparisonTablePresenter$Factory$Impl;
import com.squareup.cash.benefits.components.viewmodels.BenefitsComparisonTableViewModel;
import com.squareup.cash.benefits.utils.BankingBenefitsProtoParsingErrorFactory;
import com.squareup.cash.benefits.viewmodels.BankingBenefitsBookletViewModel;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$special$$inlined$filter$1;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.booklet.DisclosureSectionKt;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.bankingbenefits.api.v1_0.BankingBenefitsAppService;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.money.elements.BookletTile;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.RequestContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.EmptyFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1$Benefit$Element$Savings;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1$Benefit$Element$WeeklyOffers;
import squareup.cash.bankingbenefits.ui.GreenBookletV1;
import squareup.cash.bankingbenefits.ui.VersionedGreenBenefits;
import squareup.cash.bankingbenefits.ui.VersionedGreenBooklet;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class BankingBenefitsBookletPresenter implements MoleculePresenter, HasObservability {
    public final Analytics analytics;
    public final BankingBenefitsAppService benefitsAppService;
    public final BenefitsComparisonTablePresenter$Factory$Impl benefitsTablePresenterFactory;
    public final RealDisclosureProvider disclosureProvider;
    public final ErrorReporter errorReporter;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final RealRouter router;
    public final AndroidStringManager stringManager;
    public final SyncValueReader syncValueReader;

    public BankingBenefitsBookletPresenter(BetterNavigator.ScreenNavigator screenNavigator, ErrorReporter errorReporter, SampleStrategy sampleStrategy, Analytics analytics, BankingBenefitsAppService bankingBenefitsAppService, BenefitsComparisonTablePresenter$Factory$Impl benefitsComparisonTablePresenter$Factory$Impl, RealDisclosureProvider realDisclosureProvider, AndroidStringManager androidStringManager, SyncValueReader syncValueReader, LocalizedMoneyFormatter.Factory factory, RealRouter$Factory$Impl realRouter$Factory$Impl) {
        this.navigator = screenNavigator;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        this.analytics = analytics;
        this.benefitsAppService = bankingBenefitsAppService;
        this.benefitsTablePresenterFactory = benefitsComparisonTablePresenter$Factory$Impl;
        this.disclosureProvider = realDisclosureProvider;
        this.stringManager = androidStringManager;
        this.syncValueReader = syncValueReader;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$refreshCashGreenSyncValues(BankingBenefitsBookletPresenter bankingBenefitsBookletPresenter, ContinuationImpl continuationImpl) {
        BankingBenefitsBookletPresenter$refreshCashGreenSyncValues$1 bankingBenefitsBookletPresenter$refreshCashGreenSyncValues$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof BankingBenefitsBookletPresenter$refreshCashGreenSyncValues$1) {
            bankingBenefitsBookletPresenter$refreshCashGreenSyncValues$1 = (BankingBenefitsBookletPresenter$refreshCashGreenSyncValues$1) continuationImpl;
            int i2 = bankingBenefitsBookletPresenter$refreshCashGreenSyncValues$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                bankingBenefitsBookletPresenter$refreshCashGreenSyncValues$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = bankingBenefitsBookletPresenter$refreshCashGreenSyncValues$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bankingBenefitsBookletPresenter$refreshCashGreenSyncValues$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RefreshCashGreenSyncValuesRequest refreshCashGreenSyncValuesRequest = new RefreshCashGreenSyncValuesRequest(6, (RequestContext) null, CollectionsKt__CollectionsKt.listOf((Object[]) new RefreshCashGreenSyncValuesRequest.RefreshTarget[]{RefreshCashGreenSyncValuesRequest.RefreshTarget.GREEN_BENEFITS, RefreshCashGreenSyncValuesRequest.RefreshTarget.GREEN_BOOKLET}));
                    BankingBenefitsAppService bankingBenefitsAppService = bankingBenefitsBookletPresenter.benefitsAppService;
                    bankingBenefitsBookletPresenter$refreshCashGreenSyncValues$1.label = 1;
                    obj = bankingBenefitsAppService.refreshCashGreenSyncValues(refreshCashGreenSyncValuesRequest, bankingBenefitsBookletPresenter$refreshCashGreenSyncValues$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    Timber.Forest.w("Failed to refresh Cash Green Sync Values: %s", TextUtilsCompat.errorMessaging(bankingBenefitsBookletPresenter.stringManager, (ApiResult.Failure) apiResult, null).message);
                } else {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest.d("Successfully refreshed Cash Green Sync Values", new Object[0]);
                }
                return Unit.INSTANCE;
            }
        }
        bankingBenefitsBookletPresenter$refreshCashGreenSyncValues$1 = new BankingBenefitsBookletPresenter$refreshCashGreenSyncValues$1(bankingBenefitsBookletPresenter, continuationImpl);
        Object obj2 = bankingBenefitsBookletPresenter$refreshCashGreenSyncValues$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bankingBenefitsBookletPresenter$refreshCashGreenSyncValues$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0198 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x027d A[EDGE_INSN: B:148:0x027d->B:149:0x027d BREAK  A[LOOP:0: B:137:0x025a->B:205:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02f2 A[EDGE_INSN: B:174:0x02f2->B:175:0x02f2 BREAK  A[LOOP:1: B:163:0x02cf->B:196:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x036d A[LOOP:2: B:191:0x0367->B:193:0x036d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[LOOP:1: B:163:0x02cf->B:196:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[LOOP:0: B:137:0x025a->B:205:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03cd  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.squareup.cash.benefits.viewmodels.BankingBenefitsBookletViewModel$Loaded$BookletIconItem] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.squareup.cash.benefits.viewmodels.BankingBenefitsBookletViewModel$Loaded$BookletIconItem] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.String] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        String str;
        GreenBookletV1 greenBookletV1;
        GreenBenefitsV1 greenBenefitsV1;
        Object obj;
        BankingBenefitsBookletViewModel.Loaded.BookletIconItem bookletIconItem;
        Iterator it;
        Object obj2;
        GreenBenefitsV1.Benefit benefit;
        DisclosureSectionKt disclosureSectionKt;
        GreenBenefitsV1.Benefit.SavingsBenefit savingsBenefit;
        Integer num;
        GreenBenefitsV1.Benefit.SavingsBenefit savingsBenefit2;
        DisclosureSectionKt disclosureSectionKt2;
        Integer num2;
        GreenBenefitsV1.Benefit.WeeklyOffersBenefit weeklyOffersBenefit;
        GreenBenefitsV1 greenBenefitsV12;
        GreenBenefitsV1 greenBenefitsV13;
        String str2;
        GreenBookletV1.BookletFooterButton bookletFooterButton;
        LocalizedString localizedString;
        Money money;
        GreenBookletV1 greenBookletV12;
        Money money2;
        Resources resources = this.stringManager.resources;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1773734297);
        Object rememberedValue = gapComposer.rememberedValue();
        SyncValueReader syncValueReader = this.syncValueReader;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj3 = rememberedValue;
        if (rememberedValue == neverEqualPolicy) {
            StateFlow singleValue = syncValueReader.getSingleValue(AndroidSyncValueSpecs.GreenBooklet);
            gapComposer.updateRememberedValue(singleValue);
            obj3 = singleValue;
        }
        ?? r5 = 0;
        boolean z = false;
        MutableState collectAsState = Updater.collectAsState((StateFlow) obj3, null, gapComposer, 1);
        Object rememberedValue2 = gapComposer.rememberedValue();
        Object obj4 = rememberedValue2;
        if (rememberedValue2 == neverEqualPolicy) {
            StateFlow singleValue2 = syncValueReader.getSingleValue(AndroidSyncValueSpecs.GreenBenefits);
            gapComposer.updateRememberedValue(singleValue2);
            obj4 = singleValue2;
        }
        MutableState collectAsState2 = Updater.collectAsState((StateFlow) obj4, null, gapComposer, 1);
        Object rememberedValue3 = gapComposer.rememberedValue();
        int i2 = 13;
        if (rememberedValue3 == neverEqualPolicy) {
            BitcoinDepositsPresenter$special$$inlined$filter$1 bitcoinDepositsPresenter$special$$inlined$filter$1 = new BitcoinDepositsPresenter$special$$inlined$filter$1(this.disclosureProvider.disclosure(DisclosureForScreen.BENEFITS_BOOKLET, ""), i2);
            gapComposer.updateRememberedValue(bitcoinDepositsPresenter$special$$inlined$filter$1);
            rememberedValue3 = bitcoinDepositsPresenter$special$$inlined$filter$1;
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue3, "", null, gapComposer, 48, 2);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue4 = gapComposer.rememberedValue();
        Object obj5 = rememberedValue4;
        if (changedInstance || rememberedValue4 == neverEqualPolicy) {
            AmountPickerCondensedView.AnonymousClass14 anonymousClass14 = new AmountPickerCondensedView.AnonymousClass14(this, z ? 1 : 0, i2);
            gapComposer.updateRememberedValue(anonymousClass14);
            obj5 = anonymousClass14;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) obj5);
        VersionedGreenBooklet versionedGreenBooklet = (VersionedGreenBooklet) collectAsState.getValue();
        MoneyFormatter moneyFormatter = this.moneyFormatter;
        if (versionedGreenBooklet == null || (greenBookletV12 = versionedGreenBooklet.green_booklet_v1) == null || (money2 = greenBookletV12.threshold_amount) == null) {
            str = null;
        } else {
            String format2 = moneyFormatter.format(money2);
            format2.getClass();
            ArrayMap arrayMap = new ArrayMap(1);
            arrayMap.put("spendThreshold", format2);
            resources.getClass();
            str = new MessageFormat(resources.getString(R.string.green_booklet_table_title)).format(arrayMap);
            str.getClass();
        }
        String str3 = str != null ? str : "";
        boolean changed = gapComposer.changed(str3);
        Object rememberedValue5 = gapComposer.rememberedValue();
        Object obj6 = rememberedValue5;
        if (changed || rememberedValue5 == neverEqualPolicy) {
            BenefitsComparisonTablePresenter create = this.benefitsTablePresenterFactory.create(str3);
            gapComposer.updateRememberedValue(create);
            obj6 = create;
        }
        BenefitsComparisonTableViewModel models = ((BenefitsComparisonTablePresenter) obj6).models(EmptyFlow.INSTANCE, gapComposer);
        VersionedGreenBooklet versionedGreenBooklet2 = (VersionedGreenBooklet) collectAsState.getValue();
        SampleStrategy sampleStrategy = this.oneErrorPerAppSessionStrategy;
        ErrorReporter errorReporter = this.errorReporter;
        Object obj7 = BankingBenefitsBookletViewModel.Loading.INSTANCE;
        if (versionedGreenBooklet2 != null) {
            GreenBookletV1 greenBookletV13 = versionedGreenBooklet2.green_booklet_v1;
            Money money3 = greenBookletV13 != null ? greenBookletV13.threshold_amount : null;
            BankingBenefitsProtoParsingErrorFactory bankingBenefitsProtoParsingErrorFactory = BankingBenefitsProtoParsingErrorFactory.INSTANCE;
            if (money3 == null) {
                if (greenBookletV13 != null) {
                    try {
                        money = greenBookletV13.threshold_amount;
                    } catch (Exception e) {
                        throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(VersionedGreenBooklet.class), bankingBenefitsProtoParsingErrorFactory, null);
                    }
                } else {
                    money = null;
                }
                if (money == null) {
                    try {
                        throw new IllegalArgumentException("threshold_amount");
                    } catch (Exception e2) {
                        errorReporter.report(RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(VersionedGreenBooklet.class), bankingBenefitsProtoParsingErrorFactory, null), sampleStrategy);
                    }
                }
            } else if ((greenBookletV13 != null ? greenBookletV13.title : null) == null) {
                if (greenBookletV13 != null) {
                    try {
                        localizedString = greenBookletV13.title;
                    } catch (Exception e3) {
                        throw RotateKt.toProtoParsingExceptionFor(e3, Reflection.factory.getOrCreateKotlinClass(VersionedGreenBooklet.class), bankingBenefitsProtoParsingErrorFactory, null);
                    }
                } else {
                    localizedString = null;
                }
                try {
                    ProtoValidationScope.required(localizedString, "title");
                    "title".concat(" translated_value");
                } catch (Exception e4) {
                    getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e4, Reflection.factory.getOrCreateKotlinClass(versionedGreenBooklet2.getClass()), bankingBenefitsProtoParsingErrorFactory, null), getOneErrorPerAppSessionStrategy());
                }
            } else if (((greenBookletV13 == null || (bookletFooterButton = greenBookletV13.primary_footer_button) == null) ? null : bookletFooterButton.client_route) == null) {
                if (greenBookletV13 != null) {
                    try {
                        GreenBookletV1.BookletFooterButton bookletFooterButton2 = greenBookletV13.primary_footer_button;
                        if (bookletFooterButton2 != null) {
                            str2 = bookletFooterButton2.client_route;
                            if (str2 == null) {
                                try {
                                    throw new IllegalArgumentException("primary_footer_button.client_route");
                                } catch (Exception e5) {
                                    errorReporter.report(RotateKt.toProtoParsingExceptionFor(e5, Reflection.factory.getOrCreateKotlinClass(VersionedGreenBooklet.class), bankingBenefitsProtoParsingErrorFactory, null), sampleStrategy);
                                }
                            }
                        }
                    } catch (Exception e6) {
                        throw RotateKt.toProtoParsingExceptionFor(e6, Reflection.factory.getOrCreateKotlinClass(VersionedGreenBooklet.class), bankingBenefitsProtoParsingErrorFactory, null);
                    }
                }
                str2 = null;
                if (str2 == null) {
                }
            } else {
                r5 = 0;
            }
            r5 = 0;
            if (((VersionedGreenBenefits) collectAsState2.getValue()) != null) {
                DefaultProtoParsingExceptionFactory defaultProtoParsingExceptionFactory = DefaultProtoParsingExceptionFactory.INSTANCE;
                try {
                    VersionedGreenBenefits versionedGreenBenefits = (VersionedGreenBenefits) collectAsState2.getValue();
                    if (((versionedGreenBenefits == null || (greenBenefitsV13 = versionedGreenBenefits.green_benefits_v1) == null) ? r5 : greenBenefitsV13.card_holder_benefits) == null) {
                        try {
                            throw new IllegalArgumentException("card_holder_benefits");
                        } catch (Exception e7) {
                            errorReporter.report(RotateKt.toProtoParsingExceptionFor(e7, Reflection.factory.getOrCreateKotlinClass(VersionedGreenBenefits.class), defaultProtoParsingExceptionFactory, r5), sampleStrategy);
                        }
                    }
                } catch (Exception e8) {
                    throw RotateKt.toProtoParsingExceptionFor(e8, Reflection.factory.getOrCreateKotlinClass(VersionedGreenBenefits.class), defaultProtoParsingExceptionFactory, r5);
                }
            }
            gapComposer.end(false);
            return obj7;
        }
        VersionedGreenBenefits versionedGreenBenefits2 = (VersionedGreenBenefits) collectAsState2.getValue();
        if (((versionedGreenBenefits2 == null || (greenBenefitsV12 = versionedGreenBenefits2.green_benefits_v1) == null) ? r5 : greenBenefitsV12.card_holder_benefits) != null && !models.equals(obj7)) {
            Updater.LaunchedEffect(gapComposer, flow, new BenefitsHubPresenter$models$1$1(14, collectAsState, flow, this, (Continuation) r5));
            VersionedGreenBooklet versionedGreenBooklet3 = (VersionedGreenBooklet) collectAsState.getValue();
            if (versionedGreenBooklet3 != null && (greenBookletV1 = versionedGreenBooklet3.green_booklet_v1) != null) {
                VersionedGreenBenefits versionedGreenBenefits3 = (VersionedGreenBenefits) collectAsState2.getValue();
                if (versionedGreenBenefits3 == null || (greenBenefitsV1 = versionedGreenBenefits3.green_benefits_v1) == null) {
                    EmptyList emptyList = EmptyList.INSTANCE;
                    greenBenefitsV1 = new GreenBenefitsV1(emptyList, emptyList, ByteString.EMPTY);
                }
                List list = greenBenefitsV1.green_status_benefits;
                String str4 = (String) collectAsState3.getValue();
                LocalizedString localizedString2 = greenBookletV1.title;
                localizedString2.getClass();
                String str5 = localizedString2.translated_value;
                str5.getClass();
                Money money4 = greenBookletV1.threshold_amount;
                money4.getClass();
                zzd zzdVar = Icons.Companion;
                Icon icon = new Icon("JBpEJg");
                String format3 = moneyFormatter.format(money4);
                format3.getClass();
                ArrayMap arrayMap2 = new ArrayMap(1);
                arrayMap2.put("spendThreshold", format3);
                resources.getClass();
                String format4 = new MessageFormat(resources.getString(R.string.benefits_table_threshold_list_item)).format(arrayMap2);
                format4.getClass();
                BankingBenefitsBookletViewModel.Loaded.BookletIconItem bookletIconItem2 = new BankingBenefitsBookletViewModel.Loaded.BookletIconItem(icon, format4);
                List list2 = list;
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = r5;
                        break;
                    }
                    obj = it2.next();
                    DisclosureSectionKt disclosureSectionKt3 = ((GreenBenefitsV1.Benefit) obj).element;
                    if (disclosureSectionKt3 != null) {
                        GreenBenefitsV1$Benefit$Element$WeeklyOffers greenBenefitsV1$Benefit$Element$WeeklyOffers = disclosureSectionKt3 instanceof GreenBenefitsV1$Benefit$Element$WeeklyOffers ? (GreenBenefitsV1$Benefit$Element$WeeklyOffers) disclosureSectionKt3 : r5;
                        if (greenBenefitsV1$Benefit$Element$WeeklyOffers != null) {
                            weeklyOffersBenefit = greenBenefitsV1$Benefit$Element$WeeklyOffers.value;
                            if (weeklyOffersBenefit == null) {
                                break;
                            }
                        }
                    }
                    weeklyOffersBenefit = r5;
                    if (weeklyOffersBenefit == null) {
                    }
                }
                GreenBenefitsV1.Benefit benefit2 = (GreenBenefitsV1.Benefit) obj;
                if (benefit2 != null && (disclosureSectionKt2 = benefit2.element) != null) {
                    GreenBenefitsV1$Benefit$Element$WeeklyOffers greenBenefitsV1$Benefit$Element$WeeklyOffers2 = disclosureSectionKt2 instanceof GreenBenefitsV1$Benefit$Element$WeeklyOffers ? (GreenBenefitsV1$Benefit$Element$WeeklyOffers) disclosureSectionKt2 : r5;
                    GreenBenefitsV1.Benefit.WeeklyOffersBenefit weeklyOffersBenefit2 = greenBenefitsV1$Benefit$Element$WeeklyOffers2 != null ? greenBenefitsV1$Benefit$Element$WeeklyOffers2.value : r5;
                    if (weeklyOffersBenefit2 != null && (num2 = weeklyOffersBenefit2.limit) != null) {
                        int intValue = num2.intValue();
                        zzd zzdVar2 = Icons.Companion;
                        Icon icon2 = new Icon("yd6Bf6");
                        String format5 = new MessageFormat(resources.getString(R.string.benefits_table_shopping_offers_list_item)).format(NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(intValue), "offers"));
                        format5.getClass();
                        bookletIconItem = new BankingBenefitsBookletViewModel.Loaded.BookletIconItem(icon2, format5);
                        it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = r5;
                                break;
                            }
                            obj2 = it.next();
                            DisclosureSectionKt disclosureSectionKt4 = ((GreenBenefitsV1.Benefit) obj2).element;
                            if (disclosureSectionKt4 != null) {
                                GreenBenefitsV1$Benefit$Element$Savings greenBenefitsV1$Benefit$Element$Savings = disclosureSectionKt4 instanceof GreenBenefitsV1$Benefit$Element$Savings ? (GreenBenefitsV1$Benefit$Element$Savings) disclosureSectionKt4 : r5;
                                if (greenBenefitsV1$Benefit$Element$Savings != null) {
                                    savingsBenefit2 = greenBenefitsV1$Benefit$Element$Savings.value;
                                    if (savingsBenefit2 == null) {
                                        break;
                                    }
                                }
                            }
                            savingsBenefit2 = r5;
                            if (savingsBenefit2 == null) {
                            }
                        }
                        benefit = (GreenBenefitsV1.Benefit) obj2;
                        if (benefit != null && (disclosureSectionKt = benefit.element) != null) {
                            GreenBenefitsV1$Benefit$Element$Savings greenBenefitsV1$Benefit$Element$Savings2 = !(disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$Savings) ? (GreenBenefitsV1$Benefit$Element$Savings) disclosureSectionKt : r5;
                            savingsBenefit = greenBenefitsV1$Benefit$Element$Savings2 == null ? greenBenefitsV1$Benefit$Element$Savings2.value : r5;
                            if (savingsBenefit != null && (num = savingsBenefit.apy_bips) != null) {
                                int intValue2 = num.intValue();
                                zzd zzdVar3 = Icons.Companion;
                                Icon icon3 = new Icon("Yt8kA8");
                                String format6 = new DecimalFormat("##.##").format(intValue2 / 100.0d);
                                format6.getClass();
                                String format7 = new MessageFormat(resources.getString(R.string.benefits_table_benefits_list_item)).format(zzel$EnumUnboxingLocalUtility.m(1, "savingsPercent", format6));
                                format7.getClass();
                                r5 = new BankingBenefitsBookletViewModel.Loaded.BookletIconItem(icon3, format7);
                            }
                        }
                        List filterNotNull = ArraysKt___ArraysKt.filterNotNull(new BankingBenefitsBookletViewModel.Loaded.BookletIconItem[]{bookletIconItem2, bookletIconItem, r5});
                        List<BookletTile> list3 = greenBookletV1.tiles;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                        for (BookletTile bookletTile : list3) {
                            BookletTile.StaticContent staticContent = bookletTile.static_content;
                            staticContent.getClass();
                            Image image = staticContent.hero_image;
                            image.getClass();
                            BookletTile.StaticContent staticContent2 = bookletTile.static_content;
                            staticContent2.getClass();
                            LocalizedString localizedString3 = staticContent2.title_text;
                            localizedString3.getClass();
                            String str6 = localizedString3.translated_value;
                            str6.getClass();
                            BookletTile.StaticContent staticContent3 = bookletTile.static_content;
                            staticContent3.getClass();
                            LocalizedString localizedString4 = staticContent3.detail_text;
                            localizedString4.getClass();
                            String str7 = localizedString4.translated_value;
                            str7.getClass();
                            arrayList.add(new BankingBenefitsBookletViewModel.Loaded.BookletTile(image, str6, str7));
                        }
                        GreenBookletV1.BookletFooterButton bookletFooterButton3 = greenBookletV1.primary_footer_button;
                        bookletFooterButton3.getClass();
                        LocalizedString localizedString5 = bookletFooterButton3.text;
                        localizedString5.getClass();
                        String str8 = localizedString5.translated_value;
                        str8.getClass();
                        obj7 = new BankingBenefitsBookletViewModel.Loaded(str5, filterNotNull, models, arrayList, str8, str4);
                    }
                }
                bookletIconItem = r5;
                it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                benefit = (GreenBenefitsV1.Benefit) obj2;
                if (benefit != null) {
                    if (!(disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$Savings)) {
                    }
                    if (greenBenefitsV1$Benefit$Element$Savings2 == null) {
                    }
                    if (savingsBenefit != null) {
                        int intValue22 = num.intValue();
                        zzd zzdVar32 = Icons.Companion;
                        Icon icon32 = new Icon("Yt8kA8");
                        String format62 = new DecimalFormat("##.##").format(intValue22 / 100.0d);
                        format62.getClass();
                        String format72 = new MessageFormat(resources.getString(R.string.benefits_table_benefits_list_item)).format(zzel$EnumUnboxingLocalUtility.m(1, "savingsPercent", format62));
                        format72.getClass();
                        r5 = new BankingBenefitsBookletViewModel.Loaded.BookletIconItem(icon32, format72);
                    }
                }
                List filterNotNull2 = ArraysKt___ArraysKt.filterNotNull(new BankingBenefitsBookletViewModel.Loaded.BookletIconItem[]{bookletIconItem2, bookletIconItem, r5});
                List<BookletTile> list32 = greenBookletV1.tiles;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list32, 10));
                while (r1.hasNext()) {
                }
                GreenBookletV1.BookletFooterButton bookletFooterButton32 = greenBookletV1.primary_footer_button;
                bookletFooterButton32.getClass();
                LocalizedString localizedString52 = bookletFooterButton32.text;
                localizedString52.getClass();
                String str82 = localizedString52.translated_value;
                str82.getClass();
                obj7 = new BankingBenefitsBookletViewModel.Loaded(str5, filterNotNull2, models, arrayList2, str82, str4);
            }
            gapComposer.end(false);
            return obj7;
        }
        if (((VersionedGreenBenefits) collectAsState2.getValue()) != null) {
        }
        gapComposer.end(false);
        return obj7;
    }
}
