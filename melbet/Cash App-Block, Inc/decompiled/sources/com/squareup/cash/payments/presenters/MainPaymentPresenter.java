package com.squareup.cash.payments.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.core.net.UriKt;
import androidx.navigation.compose.NavHostKt$NavHost$33$1;
import androidx.paging.PageFetcher$flow$1;
import app.cash.badging.backend.RealBadger2;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.versioned.Versioned;
import app.cash.versioned.VersionedKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.NavigationSideEffects;
import com.squareup.cash.R;
import com.squareup.cash.cdf.ContactStatus;
import com.squareup.cash.cdf.asset.ExperienceType;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.contacts.ContactsStatus;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$SponsorDrivenBlockingPhase_4;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentSelectorManager;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentResult;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.invitations.InviteErrorPresenter$models$1$1;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.payments.RealPaymentInitiator;
import com.squareup.cash.payments.backend.real.RealStatusAndLimitsManager;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.viewmodels.MainPaymentViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentEntrypointButtonViewModel;
import com.squareup.cash.payments.viewmodels.RecipientsInputViewConfig;
import com.squareup.cash.payments.viewmodels.ToolbarViewModel;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.cash.recipients.analytics.PaymentType;
import com.squareup.cash.recipients.analytics.RecipientAnalyticsKt;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.cash.recipients.viewmodels.SectionViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.securitysignals.api.SecuritySignalsAggregator;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.util.network.impl.RealNetworkInfo;
import com.squareup.kotterknife.Lazy;
import com.squareup.preferences.BooleanPreference;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.util.cash.Cashtags;
import com.squareup.util.coroutines.DerivedStateFlow;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes6.dex */
public final class MainPaymentPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final AppConfigManager appConfigManager;
    public final PaymentScreens.MainPayment args;
    public final BooleanPreference askedContactsPaymentPreference;
    public CashInstrumentType autoSelectedInstrumentType;
    public final RealBalanceSnapshotManager balanceSnapshotManager;
    public final AndroidClock clock;
    public final ModifiablePermissions contactsPermission;
    public final CryptoPaymentManager cryptoPaymentManager;
    public CashInstrumentType currentSelectedInstrumentType;
    public final FeatureFlagManager featureFlagManager;
    public final FlowStarter flowStarter;
    public final StateFlowImpl hideSections;
    public final RealInstrumentManager instrumentManager;
    public final RealInstrumentSelectorManager instrumentSelectorManager;
    public Long instrumentsSheetDisplayStartDate;
    public boolean isRestoreState;
    public final RealJurisdictionConfigManager jurisdictionConfigManager;
    public final IntentLauncher launcher;
    public final ToolbarTuckTargets mainPaymentSettings;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealNetworkInfo networkInfo;
    public final RealPaymentInitiator paymentInitiator;
    public final RealPersonalizePaymentManager personalizePaymentManager;
    public final String personalizedPaymentFlowToken;
    public final RealProfileManager profileManager;
    public final StateFlowImpl query;
    public final ArrayList recipientsSelectedFromSearchResult;
    public final RealRecipientRepository repository;
    public String searchFlowToken;
    public Long searchQueryStartTimestamp;
    public final SecuritySignalsAggregator securitySignalsAggregator;
    public final SessionManager sessionManager;
    public final RealStatusAndLimitsManager statusAndLimitsManager;
    public final AndroidStringManager stringManager;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[SelectPaymentInstrumentResult.Status.values().length];
            try {
                SelectPaymentInstrumentResult.Status status = SelectPaymentInstrumentResult.Status.SUCCESS;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                SelectPaymentInstrumentResult.Status status2 = SelectPaymentInstrumentResult.Status.SUCCESS;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public MainPaymentPresenter(FlowStarter flowStarter, Analytics analytics, RealRecipientRepository realRecipientRepository, AndroidStringManager androidStringManager, RealProfileManager realProfileManager, RealJurisdictionConfigManager realJurisdictionConfigManager, FeatureFlagManager featureFlagManager, AppConfigManager appConfigManager, RealStatusAndLimitsManager realStatusAndLimitsManager, RealBalanceSnapshotManager realBalanceSnapshotManager, RealInstrumentManager realInstrumentManager, AndroidClock androidClock, IntentLauncher intentLauncher, RealUuidGenerator realUuidGenerator, SessionManager sessionManager, BooleanPreference booleanPreference, RealPaymentInitiator realPaymentInitiator, Lazy lazy, LocalizedMoneyFormatter.Factory factory, RealNetworkInfo realNetworkInfo, RealPersonalizePaymentManager realPersonalizePaymentManager, RealInstrumentSelectorManager realInstrumentSelectorManager, ToolbarTuckTargets toolbarTuckTargets, SecuritySignalsAggregator securitySignalsAggregator, ModifiablePermissions modifiablePermissions, PaymentScreens.MainPayment mainPayment, BetterNavigator.ScreenNavigator screenNavigator) {
        CryptoPaymentManager cryptoPaymentManager;
        mainPayment.getClass();
        this.flowStarter = flowStarter;
        this.analytics = analytics;
        this.repository = realRecipientRepository;
        this.stringManager = androidStringManager;
        this.profileManager = realProfileManager;
        this.jurisdictionConfigManager = realJurisdictionConfigManager;
        this.featureFlagManager = featureFlagManager;
        this.appConfigManager = appConfigManager;
        this.statusAndLimitsManager = realStatusAndLimitsManager;
        this.balanceSnapshotManager = realBalanceSnapshotManager;
        this.instrumentManager = realInstrumentManager;
        this.clock = androidClock;
        this.launcher = intentLauncher;
        this.sessionManager = sessionManager;
        this.askedContactsPaymentPreference = booleanPreference;
        this.paymentInitiator = realPaymentInitiator;
        this.networkInfo = realNetworkInfo;
        this.personalizePaymentManager = realPersonalizePaymentManager;
        this.instrumentSelectorManager = realInstrumentSelectorManager;
        this.mainPaymentSettings = toolbarTuckTargets;
        this.securitySignalsAggregator = securitySignalsAggregator;
        this.contactsPermission = modifiablePermissions;
        this.args = mainPayment;
        this.navigator = screenNavigator;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
        PaymentScreens.MainPayment.SendCryptoCurrencyType sendCryptoCurrencyType = mainPayment.sendCryptoCurrencyType;
        int ordinal = (sendCryptoCurrencyType == null ? PaymentScreens.MainPayment.SendCryptoCurrencyType.BTC : sendCryptoCurrencyType).ordinal();
        if (ordinal == 0) {
            cryptoPaymentManager = (CryptoPaymentManager) ((RealBadger2.MetroFactory) lazy.initializer).invoke();
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
            cryptoPaymentManager = (CryptoPaymentManager) ((NavigationSideEffects.MetroFactory) lazy.value).invoke();
        }
        this.cryptoPaymentManager = cryptoPaymentManager;
        this.query = FlowKt.MutableStateFlow("");
        this.hideSections = FlowKt.MutableStateFlow(Boolean.FALSE);
        this.recipientsSelectedFromSearchResult = new ArrayList();
        this.personalizedPaymentFlowToken = re$$ExternalSyntheticOutline0.m();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object models$addRecipient(MainPaymentPresenter mainPaymentPresenter, MutableState mutableState, MutableState mutableState2, State state, String str, Recipient recipient, ContinuationImpl continuationImpl) {
        MainPaymentPresenter$models$addRecipient$1 mainPaymentPresenter$models$addRecipient$1;
        int i;
        MutableState mutableState3;
        MutableState mutableState4;
        State state2;
        Recipient recipient2;
        MainPaymentPresenter mainPaymentPresenter2 = mainPaymentPresenter;
        String str2 = str;
        if (continuationImpl instanceof MainPaymentPresenter$models$addRecipient$1) {
            mainPaymentPresenter$models$addRecipient$1 = (MainPaymentPresenter$models$addRecipient$1) continuationImpl;
            int i2 = mainPaymentPresenter$models$addRecipient$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                mainPaymentPresenter$models$addRecipient$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = mainPaymentPresenter$models$addRecipient$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainPaymentPresenter$models$addRecipient$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((CharSequence) mainPaymentPresenter2.query.getValue()).length() > 0) {
                        mainPaymentPresenter2.recipientsSelectedFromSearchResult.add(str2);
                    }
                    RealRecipientRepository realRecipientRepository = mainPaymentPresenter2.repository;
                    mainPaymentPresenter$models$addRecipient$1.L$0 = mainPaymentPresenter2;
                    mutableState3 = mutableState;
                    mainPaymentPresenter$models$addRecipient$1.L$1 = mutableState3;
                    mutableState4 = mutableState2;
                    mainPaymentPresenter$models$addRecipient$1.L$2 = mutableState4;
                    mainPaymentPresenter$models$addRecipient$1.L$3 = state;
                    mainPaymentPresenter$models$addRecipient$1.L$4 = str2;
                    mainPaymentPresenter$models$addRecipient$1.L$5 = recipient;
                    mainPaymentPresenter$models$addRecipient$1.label = 1;
                    obj = realRecipientRepository.getContactStatus(str2, mainPaymentPresenter$models$addRecipient$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    state2 = state;
                    recipient2 = recipient;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Recipient recipient3 = mainPaymentPresenter$models$addRecipient$1.L$5;
                    str2 = mainPaymentPresenter$models$addRecipient$1.L$4;
                    state2 = mainPaymentPresenter$models$addRecipient$1.L$3;
                    MutableState mutableState5 = mainPaymentPresenter$models$addRecipient$1.L$2;
                    MutableState mutableState6 = mainPaymentPresenter$models$addRecipient$1.L$1;
                    MainPaymentPresenter mainPaymentPresenter3 = mainPaymentPresenter$models$addRecipient$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    recipient2 = recipient3;
                    mainPaymentPresenter2 = mainPaymentPresenter3;
                    mutableState4 = mutableState5;
                    mutableState3 = mutableState6;
                }
                ContactsStatus contactsStatus = (ContactsStatus) obj;
                mutableState3.setValue(MapsKt__MapsKt.mutableMapOf(new Pair(str2, Recipient.copy$default(recipient2, null, null, null, null, null, contactsStatus, null, false, false, -536870913, 3))));
                if (mainPaymentPresenter2.args.isFiatPayment) {
                    mutableState4.setValue(VersionedKt.update((Versioned) mutableState4.getValue(), Boolean.TRUE));
                }
                Analytics analytics = mainPaymentPresenter2.analytics;
                PaymentScreens.MainPayment mainPayment = mainPaymentPresenter2.args;
                String str3 = mainPaymentPresenter2.searchFlowToken;
                Recipient.Analytics analytics2 = recipient2.analytics;
                ExperienceType experienceType = ExperienceType.LEGACY;
                mainPayment.getClass();
                String uuid = mainPayment.paymentToken.toString();
                uuid.getClass();
                Orientation orientation = mainPayment.orientation;
                orientation.getClass();
                RecipientAnalyticsKt.logRecipientSelected(analytics, uuid, str3, analytics2, orientation != Orientation.BILL ? PaymentType.REQUEST : PaymentType.SEND, contactsStatus == null ? RecipientAnalyticsKt.toAnalyticsContactStatus(contactsStatus) : ContactStatus.IN_CONTACTS, experienceType, null);
                models$updateSections(state2, mutableState3);
                return Unit.INSTANCE;
            }
        }
        mainPaymentPresenter$models$addRecipient$1 = new MainPaymentPresenter$models$addRecipient$1(continuationImpl);
        Object obj2 = mainPaymentPresenter$models$addRecipient$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainPaymentPresenter$models$addRecipient$1.label;
        if (i != 0) {
        }
        ContactsStatus contactsStatus2 = (ContactsStatus) obj2;
        mutableState3.setValue(MapsKt__MapsKt.mutableMapOf(new Pair(str2, Recipient.copy$default(recipient2, null, null, null, null, null, contactsStatus2, null, false, false, -536870913, 3))));
        if (mainPaymentPresenter2.args.isFiatPayment) {
        }
        Analytics analytics3 = mainPaymentPresenter2.analytics;
        PaymentScreens.MainPayment mainPayment2 = mainPaymentPresenter2.args;
        String str32 = mainPaymentPresenter2.searchFlowToken;
        Recipient.Analytics analytics22 = recipient2.analytics;
        ExperienceType experienceType2 = ExperienceType.LEGACY;
        mainPayment2.getClass();
        String uuid2 = mainPayment2.paymentToken.toString();
        uuid2.getClass();
        Orientation orientation2 = mainPayment2.orientation;
        orientation2.getClass();
        RecipientAnalyticsKt.logRecipientSelected(analytics3, uuid2, str32, analytics22, orientation2 != Orientation.BILL ? PaymentType.REQUEST : PaymentType.SEND, contactsStatus2 == null ? RecipientAnalyticsKt.toAnalyticsContactStatus(contactsStatus2) : ContactStatus.IN_CONTACTS, experienceType2, null);
        models$updateSections(state2, mutableState3);
        return Unit.INSTANCE;
    }

    public static final void models$updateSections(State state, MutableState mutableState) {
        List list = (List) state.getValue();
        List list2 = CollectionsKt.toList(((Map) mutableState.getValue()).keySet());
        list.getClass();
        list2.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (RecipientViewModel recipientViewModel : ((SectionViewModel) it.next()).recipients) {
                recipientViewModel.isSelected = list2.contains(UriKt.getCustomerId(recipientViewModel.recipient));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0657  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        MutableState mutableState2;
        MainPaymentPresenter mainPaymentPresenter;
        Continuation continuation;
        MainPaymentPresenter mainPaymentPresenter2;
        MutableState mutableState3;
        MutableState mutableState4;
        Continuation continuation2;
        Object navHostKt$NavHost$33$1;
        MutableState mutableState5;
        Collection collection;
        GapComposer gapComposer;
        MutableState mutableState6;
        MutableState mutableState7;
        Boolean bool;
        MutableState mutableState8;
        NeverEqualPolicy neverEqualPolicy;
        String str;
        MutableState mutableState9;
        MutableState mutableState10;
        Object[] objArr;
        String str2;
        MutableState mutableState11;
        List list;
        MutableState mutableState12;
        MutableState mutableState13;
        Region region;
        PaymentScreens.MainPayment mainPayment;
        boolean z;
        boolean z2;
        String str3;
        String format2;
        flow.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(399572723);
        Object rememberedValue = gapComposer2.rememberedValue();
        ToolbarTuckTargets toolbarTuckTargets = this.mainPaymentSettings;
        NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy2) {
            rememberedValue = (DerivedStateFlow) toolbarTuckTargets.startCornerCenterX$delegate;
            gapComposer2.updateRememberedValue(rememberedValue);
        }
        Boolean bool2 = Boolean.FALSE;
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, bool2, null, gapComposer2, 48, 2);
        Object rememberedValue2 = gapComposer2.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy2) {
            rememberedValue2 = (DerivedStateFlow) toolbarTuckTargets.endCornerCenterX$delegate;
            gapComposer2.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, bool2, null, gapComposer2, 48, 2);
        boolean changed = gapComposer2.changed(((Boolean) collectAsState.getValue()).booleanValue()) | gapComposer2.changed(((Boolean) collectAsState2.getValue()).booleanValue());
        Object rememberedValue3 = gapComposer2.rememberedValue();
        if (changed || rememberedValue3 == neverEqualPolicy2) {
            rememberedValue3 = Recorder$$ExternalSyntheticOutline1.m(((Boolean) collectAsState.getValue()).booleanValue() && !((Boolean) collectAsState2.getValue()).booleanValue(), gapComposer2);
        }
        MutableState mutableState14 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer2.rememberedValue();
        CryptoPaymentManager cryptoPaymentManager = this.cryptoPaymentManager;
        if (rememberedValue4 == neverEqualPolicy2) {
            rememberedValue4 = cryptoPaymentManager.getDisplayUnits();
            gapComposer2.updateRememberedValue(rememberedValue4);
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue4, BitcoinDisplayUnits.SATOSHIS, null, gapComposer2, 48, 2);
        Object rememberedValue5 = gapComposer2.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy2) {
            rememberedValue5 = cryptoPaymentManager.getInputHint();
            gapComposer2.updateRememberedValue(rememberedValue5);
        }
        MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue5, "", null, gapComposer2, 48, 2);
        Object rememberedValue6 = gapComposer2.rememberedValue();
        if (rememberedValue6 == neverEqualPolicy2) {
            rememberedValue6 = Updater.mutableStateOf$default(EmptyList.INSTANCE);
            gapComposer2.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState15 = (MutableState) rememberedValue6;
        Object rememberedValue7 = gapComposer2.rememberedValue();
        int i2 = 16;
        PaymentScreens.MainPayment mainPayment2 = this.args;
        if (rememberedValue7 == neverEqualPolicy2) {
            List<com.squareup.cash.db.contacts.Recipient> list2 = mainPayment2.recipients;
            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            if (mapCapacity < 16) {
                mapCapacity = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
            for (com.squareup.cash.db.contacts.Recipient recipient : list2) {
                linkedHashMap.put(UriKt.getCustomerId(RecipientMapper.transform(recipient)), RecipientMapper.transform(recipient));
            }
            rememberedValue7 = Updater.mutableStateOf$default(linkedHashMap);
            gapComposer2.updateRememberedValue(rememberedValue7);
        }
        MutableState mutableState16 = (MutableState) rememberedValue7;
        Object rememberedValue8 = gapComposer2.rememberedValue();
        if (rememberedValue8 == neverEqualPolicy2) {
            rememberedValue8 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer2.updateRememberedValue(rememberedValue8);
        }
        MutableState mutableState17 = (MutableState) rememberedValue8;
        Object rememberedValue9 = gapComposer2.rememberedValue();
        if (rememberedValue9 == neverEqualPolicy2) {
            rememberedValue9 = Updater.mutableStateOf$default(mainPayment2.instrumentSelection);
            gapComposer2.updateRememberedValue(rememberedValue9);
        }
        MutableState mutableState18 = (MutableState) rememberedValue9;
        Object rememberedValue10 = gapComposer2.rememberedValue();
        if (rememberedValue10 == neverEqualPolicy2) {
            rememberedValue10 = Updater.mutableStateOf$default(Boolean.TRUE);
            gapComposer2.updateRememberedValue(rememberedValue10);
        }
        MutableState mutableState19 = (MutableState) rememberedValue10;
        Object rememberedValue11 = gapComposer2.rememberedValue();
        if (rememberedValue11 == neverEqualPolicy2) {
            rememberedValue11 = Updater.mutableStateOf$default(new Versioned(Boolean.FALSE, 0));
            gapComposer2.updateRememberedValue(rememberedValue11);
        }
        MutableState mutableState20 = (MutableState) rememberedValue11;
        Object rememberedValue12 = gapComposer2.rememberedValue();
        if (rememberedValue12 == neverEqualPolicy2) {
            rememberedValue12 = Updater.mutableStateOf$default(new Versioned(Boolean.FALSE, 0));
            gapComposer2.updateRememberedValue(rememberedValue12);
        }
        MutableState mutableState21 = (MutableState) rememberedValue12;
        Object rememberedValue13 = gapComposer2.rememberedValue();
        Continuation continuation3 = null;
        if (rememberedValue13 == neverEqualPolicy2) {
            rememberedValue13 = Updater.mutableStateOf$default(null);
            gapComposer2.updateRememberedValue(rememberedValue13);
        }
        MutableState mutableState22 = (MutableState) rememberedValue13;
        Object rememberedValue14 = gapComposer2.rememberedValue();
        if (rememberedValue14 == neverEqualPolicy2) {
            rememberedValue14 = Updater.mutableStateOf$default(mainPayment2.note);
            gapComposer2.updateRememberedValue(rememberedValue14);
        }
        MutableState mutableState23 = (MutableState) rememberedValue14;
        Object[] objArr2 = new Object[0];
        Object rememberedValue15 = gapComposer2.rememberedValue();
        if (rememberedValue15 == neverEqualPolicy2) {
            rememberedValue15 = new MainPaymentViewKt$$ExternalSyntheticLambda0(7);
            gapComposer2.updateRememberedValue(rememberedValue15);
        }
        MutableState mutableState24 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue15, gapComposer2, 48);
        Object[] objArr3 = new Object[0];
        Object rememberedValue16 = gapComposer2.rememberedValue();
        if (rememberedValue16 == neverEqualPolicy2) {
            rememberedValue16 = new MainPaymentViewKt$$ExternalSyntheticLambda0(8);
            gapComposer2.updateRememberedValue(rememberedValue16);
        }
        MutableState mutableState25 = (MutableState) SaverKt.rememberSaveable(objArr3, (Function0) rememberedValue16, gapComposer2, 48);
        Object rememberedValue17 = gapComposer2.rememberedValue();
        if (rememberedValue17 == neverEqualPolicy2) {
            Orientation orientation = mainPayment2.orientation;
            boolean z3 = mainPayment2.isFiatPaymentPadEntryPoint;
            orientation.getClass();
            rememberedValue17 = Updater.mutableStateOf$default(new PersonalizePaymentEntrypointButtonViewModel(orientation == Orientation.CASH && z3, (this.personalizePaymentManager.context.getResources().getConfiguration().uiMode & 48) == 32 ? R.raw.personalization_anim_dark : R.raw.personalization_anim_light));
            gapComposer2.updateRememberedValue(rememberedValue17);
        }
        MutableState mutableState26 = (MutableState) rememberedValue17;
        Object rememberedValue18 = gapComposer2.rememberedValue();
        if (rememberedValue18 == neverEqualPolicy2) {
            rememberedValue18 = this.profileManager.profile();
            gapComposer2.updateRememberedValue(rememberedValue18);
        }
        MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue18, null, null, gapComposer2, 48, 2);
        Object rememberedValue19 = gapComposer2.rememberedValue();
        if (rememberedValue19 == neverEqualPolicy2) {
            RealDrawerOpener$getDrawerScreen$$inlined$map$1 realDrawerOpener$getDrawerScreen$$inlined$map$1 = new RealDrawerOpener$getDrawerScreen$$inlined$map$1(this.jurisdictionConfigManager.select(), 15);
            gapComposer2.updateRememberedValue(realDrawerOpener$getDrawerScreen$$inlined$map$1);
            rememberedValue19 = realDrawerOpener$getDrawerScreen$$inlined$map$1;
        }
        MutableState collectAsState6 = Updater.collectAsState((Flow) rememberedValue19, null, null, gapComposer2, 48, 2);
        Object rememberedValue20 = gapComposer2.rememberedValue();
        if (rememberedValue20 == neverEqualPolicy2) {
            rememberedValue20 = this.balanceSnapshotManager.select();
            gapComposer2.updateRememberedValue(rememberedValue20);
        }
        MutableState collectAsState7 = Updater.collectAsState((Flow) rememberedValue20, null, null, gapComposer2, 48, 2);
        Object rememberedValue21 = gapComposer2.rememberedValue();
        if (rememberedValue21 == neverEqualPolicy2) {
            EnumEntries entries = CashInstrumentType.getEntries();
            ArrayList arrayList = new ArrayList();
            for (Object obj : entries) {
                CashInstrumentType cashInstrumentType = (CashInstrumentType) obj;
                if (cashInstrumentType != CashInstrumentType.CASH_BALANCE && cashInstrumentType != CashInstrumentType.BANK_ACCOUNT) {
                    arrayList.add(obj);
                }
            }
            CashInstrumentType[] cashInstrumentTypeArr = (CashInstrumentType[]) arrayList.toArray(new CashInstrumentType[0]);
            rememberedValue21 = this.instrumentManager.forTypes((CashInstrumentType[]) Arrays.copyOf(cashInstrumentTypeArr, cashInstrumentTypeArr.length));
            gapComposer2.updateRememberedValue(rememberedValue21);
        }
        MutableState collectAsState8 = Updater.collectAsState((Flow) rememberedValue21, null, null, gapComposer2, 48, 2);
        Object rememberedValue22 = gapComposer2.rememberedValue();
        if (rememberedValue22 == neverEqualPolicy2) {
            rememberedValue22 = ((RealAppConfigManager) this.appConfigManager).instrumentLinkingConfig();
            gapComposer2.updateRememberedValue(rememberedValue22);
        }
        MutableState collectAsState9 = Updater.collectAsState((Flow) rememberedValue22, null, null, gapComposer2, 48, 2);
        Object rememberedValue23 = gapComposer2.rememberedValue();
        if (rememberedValue23 == neverEqualPolicy2) {
            rememberedValue23 = this.statusAndLimitsManager.hasPassedIdv();
            gapComposer2.updateRememberedValue(rememberedValue23);
        }
        MutableState collectAsState10 = Updater.collectAsState((Flow) rememberedValue23, null, null, gapComposer2, 48, 2);
        Object rememberedValue24 = gapComposer2.rememberedValue();
        ModifiablePermissions modifiablePermissions = this.contactsPermission;
        if (rememberedValue24 == neverEqualPolicy2) {
            rememberedValue24 = modifiablePermissions.granted();
            gapComposer2.updateRememberedValue(rememberedValue24);
        }
        Boolean bool3 = Boolean.FALSE;
        MutableState collectAsState11 = Updater.collectAsState((Flow) rememberedValue24, bool3, null, gapComposer2, 48, 2);
        Object rememberedValue25 = gapComposer2.rememberedValue();
        if (rememberedValue25 == neverEqualPolicy2) {
            InviteContactsPresenter$special$$inlined$map$1 inviteContactsPresenter$special$$inlined$map$1 = new InviteContactsPresenter$special$$inlined$map$1(modifiablePermissions.granted(), this, 25);
            gapComposer2.updateRememberedValue(inviteContactsPresenter$special$$inlined$map$1);
            rememberedValue25 = inviteContactsPresenter$special$$inlined$map$1;
        }
        MutableState collectAsState12 = Updater.collectAsState((Flow) rememberedValue25, bool3, null, gapComposer2, 48, 2);
        Unit unit = Unit.INSTANCE;
        boolean changed2 = gapComposer2.changed(mutableState25) | gapComposer2.changedInstance(this) | gapComposer2.changed(collectAsState12);
        Object rememberedValue26 = gapComposer2.rememberedValue();
        if (changed2 || rememberedValue26 == neverEqualPolicy2) {
            mutableState = mutableState24;
            RealKeyStoreProvider$setEntry$2 realKeyStoreProvider$setEntry$2 = new RealKeyStoreProvider$setEntry$2(this, mutableState25, collectAsState12, continuation3, 27);
            mutableState2 = collectAsState12;
            mainPaymentPresenter = this;
            continuation = null;
            gapComposer2.updateRememberedValue(realKeyStoreProvider$setEntry$2);
            rememberedValue26 = realKeyStoreProvider$setEntry$2;
        } else {
            mainPaymentPresenter = this;
            continuation = null;
            mutableState2 = collectAsState12;
            mutableState = mutableState24;
        }
        Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue26);
        boolean changedInstance = gapComposer2.changedInstance(mainPaymentPresenter);
        Object rememberedValue27 = gapComposer2.rememberedValue();
        if (changedInstance || rememberedValue27 == neverEqualPolicy2) {
            rememberedValue27 = new InviteErrorPresenter$models$1$1(mainPaymentPresenter, continuation, i2);
            gapComposer2.updateRememberedValue(rememberedValue27);
        }
        Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue27);
        Object rememberedValue28 = gapComposer2.rememberedValue();
        StateFlowImpl stateFlowImpl = mainPaymentPresenter.query;
        if (rememberedValue28 == neverEqualPolicy2) {
            FlowKt__MergeKt$flatMapMerge$$inlined$map$1 combine = FlowKt.combine(stateFlowImpl, modifiablePermissions.granted(), cryptoPaymentManager.getClipboardRecipient(mainPayment2.cryptoPaymentOrigin), mainPaymentPresenter.hideSections, new MainPaymentPresenter$models$sections$2$1(5, continuation));
            continuation2 = continuation;
            MainPaymentPresenter mainPaymentPresenter3 = mainPaymentPresenter;
            mutableState3 = collectAsState5;
            mainPaymentPresenter2 = mainPaymentPresenter3;
            mutableState4 = mutableState19;
            rememberedValue28 = FlowKt.transformLatest(combine, new PageFetcher$flow$1.AnonymousClass2(mainPaymentPresenter3, mutableState19, mutableState3, mutableState16, null, 2));
            gapComposer2.updateRememberedValue(rememberedValue28);
        } else {
            mainPaymentPresenter2 = mainPaymentPresenter;
            mutableState3 = collectAsState5;
            mutableState4 = mutableState19;
            continuation2 = continuation;
        }
        MutableState mutableState27 = mutableState3;
        MutableState collectAsState13 = Updater.collectAsState((Flow) rememberedValue28, EmptyList.INSTANCE, null, gapComposer2, 48, 2);
        gapComposer2.startReplaceGroup(-1968599467);
        Collection values = ((Map) mutableState16.getValue()).values();
        Boolean valueOf = Boolean.valueOf(mainPaymentPresenter2.networkInfo.isNetworkAvailable());
        String str4 = (String) mutableState23.getValue();
        boolean changedInstance2 = gapComposer2.changedInstance(mainPaymentPresenter2) | gapComposer2.changed(mutableState27) | gapComposer2.changed(mutableState);
        Object rememberedValue29 = gapComposer2.rememberedValue();
        if (changedInstance2 || rememberedValue29 == neverEqualPolicy2) {
            mutableState5 = mutableState27;
            collection = values;
            MainPaymentPresenter mainPaymentPresenter4 = mainPaymentPresenter2;
            MutableState mutableState28 = mutableState;
            gapComposer = gapComposer2;
            mutableState6 = mutableState23;
            mutableState7 = collectAsState13;
            bool = valueOf;
            mutableState8 = mutableState16;
            neverEqualPolicy = neverEqualPolicy2;
            str = str4;
            mutableState9 = mutableState14;
            navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1(mainPaymentPresenter4, mutableState8, mutableState5, mutableState26, mutableState6, mutableState28, (Continuation) null);
            mutableState10 = mutableState26;
            gapComposer.updateRememberedValue(navHostKt$NavHost$33$1);
        } else {
            gapComposer = gapComposer2;
            navHostKt$NavHost$33$1 = rememberedValue29;
            mutableState6 = mutableState23;
            mutableState10 = mutableState26;
            mutableState7 = collectAsState13;
            mutableState9 = mutableState14;
            bool = valueOf;
            str = str4;
            mutableState5 = mutableState27;
            mutableState8 = mutableState16;
            neverEqualPolicy = neverEqualPolicy2;
            collection = values;
        }
        Updater.LaunchedEffect(collection, bool, str, (Function2) navHostKt$NavHost$33$1, gapComposer);
        gapComposer.end(false);
        MutableState mutableState29 = mutableState8;
        MutableState mutableState30 = mutableState5;
        MutableState mutableState31 = mutableState6;
        GapComposer gapComposer3 = gapComposer;
        NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy;
        MutableState mutableState32 = mutableState9;
        MutableState mutableState33 = mutableState30;
        Updater.LaunchedEffect(gapComposer3, flow, new MainPaymentPresenter$models$$inlined$CollectEffect$1(flow, null, this, collectAsState9, mutableState29, mutableState7, mutableState30, collectAsState6, mutableState20, mutableState31, mutableState15, collectAsState8, collectAsState10, mutableState18, collectAsState7, mutableState17, mutableState21));
        List list3 = CollectionsKt.toList(((Map) mutableState29.getValue()).values());
        Object rememberedValue30 = gapComposer3.rememberedValue();
        if (rememberedValue30 == neverEqualPolicy3) {
            rememberedValue30 = Updater.mutableStateOf$default("");
            gapComposer3.updateRememberedValue(rememberedValue30);
        }
        MutableState mutableState34 = (MutableState) rememberedValue30;
        Object rememberedValue31 = gapComposer3.rememberedValue();
        if (rememberedValue31 == neverEqualPolicy3) {
            rememberedValue31 = Updater.mutableStateOf$default(continuation2);
            gapComposer3.updateRememberedValue(rememberedValue31);
        }
        MutableState mutableState35 = (MutableState) rememberedValue31;
        Object[] objArr4 = {list3, (Profile) mutableState33.getValue(), (List) collectAsState8.getValue(), (BalanceSnapshot) collectAsState7.getValue(), collectAsState9.getValue(), collectAsState10.getValue(), (InstrumentSelection) mutableState18.getValue()};
        boolean changedInstance3 = gapComposer3.changedInstance(this) | gapComposer3.changedInstance(list3) | gapComposer3.changed(mutableState33) | gapComposer3.changed(collectAsState7) | gapComposer3.changed(collectAsState8) | gapComposer3.changed(collectAsState9) | gapComposer3.changed(collectAsState10) | gapComposer3.changed(mutableState32);
        Object rememberedValue32 = gapComposer3.rememberedValue();
        if (changedInstance3 || rememberedValue32 == neverEqualPolicy3) {
            objArr = objArr4;
            str2 = "";
            mutableState11 = mutableState31;
            list = list3;
            mutableState12 = mutableState22;
            mutableState13 = mutableState35;
            rememberedValue32 = new MainPaymentPresenter$models$5$1(this, list, collectAsState9, collectAsState10, mutableState18, mutableState33, collectAsState7, collectAsState8, mutableState32, mutableState34, mutableState17, mutableState12, mutableState13, null);
            mutableState33 = mutableState33;
            gapComposer3.updateRememberedValue(rememberedValue32);
        } else {
            mutableState13 = mutableState35;
            objArr = objArr4;
            mutableState11 = mutableState31;
            str2 = "";
            list = list3;
            mutableState12 = mutableState22;
        }
        Updater.LaunchedEffect(objArr, (Function2) rememberedValue32, gapComposer3);
        String str5 = (String) stateFlowImpl.getValue();
        Map map = (Map) mutableState29.getValue();
        List list4 = (List) mutableState7.getValue();
        Profile profile = (Profile) mutableState33.getValue();
        if (profile == null || (region = profile.region) == null) {
            region = Region.USA;
        }
        Region region2 = region;
        if (((Boolean) collectAsState11.getValue()).booleanValue()) {
            mainPayment = mainPayment2;
        } else {
            mainPayment = mainPayment2;
            if (mainPayment.isFiatPayment) {
                z = false;
                Money money = mainPayment.amountInSelectedCurrency;
                z2 = mainPayment.isFiatPayment;
                ToolbarViewModel toolbarViewModel = new ToolbarViewModel(cryptoPaymentManager.getFormattedAmount(money, this.moneyFormatter, (BitcoinDisplayUnits) collectAsState3.getValue()), (String) mutableState12.getValue(), ((Boolean) mutableState17.getValue()).booleanValue(), !list.isEmpty());
                if (!z2) {
                    List list5 = list;
                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                        Iterator it = list5.iterator();
                        while (it.hasNext()) {
                            if (((Recipient) it.next()).invoice != null) {
                                String str6 = str2;
                                mutableState11.setValue(str6);
                                str3 = str6;
                                break;
                            }
                        }
                    }
                }
                str3 = (String) mutableState11.getValue();
                boolean z4 = !((Boolean) mutableState2.getValue()).booleanValue() && z2;
                boolean booleanValue = ((Boolean) mutableState4.getValue()).booleanValue();
                boolean z5 = this.isRestoreState;
                this.isRestoreState = false;
                AndroidStringManager androidStringManager = this.stringManager;
                if (z2) {
                    format2 = (String) collectAsState4.getValue();
                } else {
                    Set set = Cashtags.SUPPORTED_SYMBOLS;
                    Profile profile2 = (Profile) mutableState33.getValue();
                    Object[] objArr5 = {Moneys.symbol(Cashtags.guessCashtagCurrency(profile2 != null ? profile2.region : continuation2))};
                    Resources resources = androidStringManager.resources;
                    resources.getClass();
                    format2 = new MessageFormat(resources.getString(R.string.send_payment_to_hint)).format(objArr5);
                    format2.getClass();
                }
                MainPaymentViewModel mainPaymentViewModel = new MainPaymentViewModel(str5, list4, region2, map, booleanValue, z, toolbarViewModel, str3, z4, z5, z2 && !((Map) mutableState29.getValue()).isEmpty(), format2, z2 ? cryptoPaymentManager.getNoteHint() : z2 ? androidStringManager.get(R.string.send_payment_required_note_hint) : androidStringManager.get(R.string.send_payment_note_hint), mainPayment.isFiatPayment, (PersonalizePaymentEntrypointButtonViewModel) mutableState10.getValue(), (Versioned) mutableState20.getValue(), (InstrumentSelectionRowViewModel) mutableState13.getValue(), (Versioned) mutableState21.getValue(), ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$SponsorDrivenBlockingPhase_4.INSTANCE)).enabled(), z2 ? androidStringManager.get(R.string.bitcoin_lightning_no_matching_result_message) : continuation2, z2 ? new RecipientsInputViewConfig(Integer.MAX_VALUE, true) : new RecipientsInputViewConfig(100, false), !z2);
                gapComposer3.end(false);
                return mainPaymentViewModel;
            }
        }
        z = true;
        Money money2 = mainPayment.amountInSelectedCurrency;
        z2 = mainPayment.isFiatPayment;
        ToolbarViewModel toolbarViewModel2 = new ToolbarViewModel(cryptoPaymentManager.getFormattedAmount(money2, this.moneyFormatter, (BitcoinDisplayUnits) collectAsState3.getValue()), (String) mutableState12.getValue(), ((Boolean) mutableState17.getValue()).booleanValue(), !list.isEmpty());
        if (!z2) {
        }
        str3 = (String) mutableState11.getValue();
        if (((Boolean) mutableState2.getValue()).booleanValue()) {
        }
        boolean booleanValue2 = ((Boolean) mutableState4.getValue()).booleanValue();
        boolean z52 = this.isRestoreState;
        this.isRestoreState = false;
        AndroidStringManager androidStringManager2 = this.stringManager;
        if (z2) {
        }
        MainPaymentViewModel mainPaymentViewModel2 = new MainPaymentViewModel(str5, list4, region2, map, booleanValue2, z, toolbarViewModel2, str3, z4, z52, z2 && !((Map) mutableState29.getValue()).isEmpty(), format2, z2 ? cryptoPaymentManager.getNoteHint() : z2 ? androidStringManager2.get(R.string.send_payment_required_note_hint) : androidStringManager2.get(R.string.send_payment_note_hint), mainPayment.isFiatPayment, (PersonalizePaymentEntrypointButtonViewModel) mutableState10.getValue(), (Versioned) mutableState20.getValue(), (InstrumentSelectionRowViewModel) mutableState13.getValue(), (Versioned) mutableState21.getValue(), ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$SponsorDrivenBlockingPhase_4.INSTANCE)).enabled(), z2 ? androidStringManager2.get(R.string.bitcoin_lightning_no_matching_result_message) : continuation2, z2 ? new RecipientsInputViewConfig(Integer.MAX_VALUE, true) : new RecipientsInputViewConfig(100, false), !z2);
        gapComposer3.end(false);
        return mainPaymentViewModel2;
    }
}
