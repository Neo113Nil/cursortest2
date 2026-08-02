package com.squareup.cash.recipients.data;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.graphics.drawable.DrawableCompat;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.badging.db.BadgeQueries$VersionQuery;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.formatter.RealBitcoinFormatter;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.bitcoin.presenters.investing.RealBitcoinSponsoredStateRepo;
import com.squareup.cash.bitcoin.presenters.map.RealBitcoinMapEligibilityManager;
import com.squareup.cash.bitcoin.presenters.payinusd.RealBitcoinPayInUsdPreferenceManager;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.crypto.address.RealCryptoInvoiceParser;
import com.squareup.cash.crypto.address.StablecoinNetwork;
import com.squareup.cash.crypto.address.StablecoinWithdrawalOption;
import com.squareup.cash.crypto.backend.idv.CryptoIdvStatusRepo;
import com.squareup.cash.crypto.backend.profile.RealBitcoinProfileRepo;
import com.squareup.cash.crypto.backend.stablecoin.StablecoinNetworkRepo;
import com.squareup.cash.crypto.backend.stablecoin.StablecoinNetworksResult;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.data.contacts.RealContactRepository;
import com.squareup.cash.data.contacts.RealContactRepository$contacts$$inlined$map$1;
import com.squareup.cash.data.contacts.RealContactRepository$recents$$inlined$mapItems$1;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.db.contacts.RecipientTokenizer;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.contacts.ContactQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.entities.LastTransactionDate;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.cash.db2.entities.PaymentQueries$lastTransactionDate$2;
import com.squareup.cash.favorites.data.RealFavoritesRepository;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileOsP2pRecipientMlSearchAndroid;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.cash.multiplatform.bitcoin.parsers.solana.SolanaAddress;
import com.squareup.cash.p2pblocking.presenters.RealAllowlistRepository;
import com.squareup.cash.recipients.backend.api.GenerationStrategy;
import com.squareup.cash.recipients.backend.api.RecipientSuggestionsProvider$RecipientAnalyticsData;
import com.squareup.cash.recipients.backend.api.RecipientSuggestionsProvider$RecipientWithAnalyticsData;
import com.squareup.cash.recipients.backend.api.SuggestionStrategy;
import com.squareup.cash.recipients.backend.real.RealRecipientSuggestionsProvider;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.recipients.data.Section;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.tabprovider.real.RealTabProvider$setup$1$5;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.work.presenters.providers.RealPasscodeProvider$getPasscode$1;
import com.squareup.moshi.LinkedHashTreeMap;
import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.protos.cash.blockstable.api.v1.InputSource;
import com.squareup.protos.cash.customersearch.api.ClientCandidate;
import com.squareup.protos.cash.customersearch.api.CustomerSearchClientService;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorSearchRequest;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.MerchantData;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealRecipientRepository {
    public final RealAllowlistRepository allowlistRepository;
    public final CustomerSearchClientService api;
    public final CashAccountDatabaseImpl cashDatabase;
    public final RealContactRepository contactRepository;
    public final RealCryptoInvoiceParser cryptoInvoiceParser;
    public final RealCustomerStore customerStore;
    public final RealFavoritesRepository favoritesRepository;
    public final FeatureFlagManager featureFlagManager;
    public final CoroutineContext ioDispatcher;
    public final boolean mlRecipientSearchEnabled;
    public final RealRecipientSuggestionsProvider recipientProvider;
    public final StablecoinNetworkRepo stablecoinNetworkRepo;
    public final SyncValueReader syncValueReader;

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider allowlistRepository;
        public final Provider api;
        public final Provider cashDatabase;
        public final Provider contactRepository;
        public final Provider cryptoInvoiceParser;
        public final Provider customerStore;
        public final Provider favoritesRepository;
        public final Provider featureFlagManager;
        public final Provider ioDispatcher;
        public final Provider recipientProvider;
        public final Provider stablecoinNetworkRepo;
        public final Provider syncValueReader;

        public /* synthetic */ MetroFactory(Factory factory, Provider provider, Factory factory2, Provider provider2, Factory factory3, DoubleCheck doubleCheck, Provider provider3, Object obj, Factory factory4, Factory factory5, Factory factory6, DoubleCheck doubleCheck2, int i) {
            this.$r8$classId = i;
            this.recipientProvider = factory;
            this.favoritesRepository = provider;
            this.customerStore = factory2;
            this.cashDatabase = provider2;
            this.contactRepository = factory3;
            this.api = doubleCheck;
            this.ioDispatcher = provider3;
            this.featureFlagManager = (Provider) obj;
            this.allowlistRepository = factory4;
            this.cryptoInvoiceParser = factory5;
            this.stablecoinNetworkRepo = factory6;
            this.syncValueReader = doubleCheck2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.syncValueReader;
            Provider provider2 = this.stablecoinNetworkRepo;
            Provider provider3 = this.cryptoInvoiceParser;
            Provider provider4 = this.allowlistRepository;
            Provider provider5 = this.featureFlagManager;
            Provider provider6 = this.ioDispatcher;
            Provider provider7 = this.api;
            Provider provider8 = this.contactRepository;
            Provider provider9 = this.cashDatabase;
            Provider provider10 = this.customerStore;
            Provider provider11 = this.favoritesRepository;
            Provider provider12 = this.recipientProvider;
            switch (i) {
                case 0:
                    RealRecipientSuggestionsProvider realRecipientSuggestionsProvider = (RealRecipientSuggestionsProvider) provider12.invoke();
                    RealFavoritesRepository realFavoritesRepository = (RealFavoritesRepository) provider11.invoke();
                    RealCustomerStore realCustomerStore = (RealCustomerStore) provider10.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider9.invoke();
                    RealContactRepository realContactRepository = (RealContactRepository) provider8.invoke();
                    CustomerSearchClientService customerSearchClientService = (CustomerSearchClientService) provider7.invoke();
                    CardProduct.Companion companion = new CardProduct.Companion(9);
                    CoroutineContext coroutineContext = (CoroutineContext) provider6.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider5.invoke();
                    RealAllowlistRepository realAllowlistRepository = (RealAllowlistRepository) provider4.invoke();
                    RealCryptoInvoiceParser realCryptoInvoiceParser = (RealCryptoInvoiceParser) provider3.invoke();
                    StablecoinNetworkRepo stablecoinNetworkRepo = (StablecoinNetworkRepo) provider2.invoke();
                    SyncValueReader syncValueReader = (SyncValueReader) provider.invoke();
                    realRecipientSuggestionsProvider.getClass();
                    realFavoritesRepository.getClass();
                    realCustomerStore.getClass();
                    cashAccountDatabaseImpl.getClass();
                    realContactRepository.getClass();
                    customerSearchClientService.getClass();
                    coroutineContext.getClass();
                    featureFlagManager.getClass();
                    realAllowlistRepository.getClass();
                    realCryptoInvoiceParser.getClass();
                    stablecoinNetworkRepo.getClass();
                    syncValueReader.getClass();
                    return new RealRecipientRepository(realRecipientSuggestionsProvider, realFavoritesRepository, realCustomerStore, cashAccountDatabaseImpl, realContactRepository, customerSearchClientService, companion, coroutineContext, featureFlagManager, realAllowlistRepository, realCryptoInvoiceParser, stablecoinNetworkRepo, syncValueReader);
                default:
                    CryptoFlowStarter cryptoFlowStarter = (CryptoFlowStarter) provider12.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider11.invoke();
                    CryptoIdvStatusRepo cryptoIdvStatusRepo = (CryptoIdvStatusRepo) provider10.invoke();
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider = (RealBitcoinCapabilityProvider) provider9.invoke();
                    RealBitcoinSponsoredStateRepo realBitcoinSponsoredStateRepo = (RealBitcoinSponsoredStateRepo) provider8.invoke();
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider7.invoke();
                    RealBitcoinPayInUsdPreferenceManager realBitcoinPayInUsdPreferenceManager = (RealBitcoinPayInUsdPreferenceManager) provider6.invoke();
                    RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl = (RealBitcoinInboundNavigator$Factory$Impl) provider5.invoke();
                    RealBitcoinMapEligibilityManager realBitcoinMapEligibilityManager = (RealBitcoinMapEligibilityManager) provider4.invoke();
                    RealBitcoinFormatter realBitcoinFormatter = (RealBitcoinFormatter) provider3.invoke();
                    RealBitcoinProfileRepo realBitcoinProfileRepo = (RealBitcoinProfileRepo) provider2.invoke();
                    SyncValueReader syncValueReader2 = (SyncValueReader) provider.invoke();
                    cryptoFlowStarter.getClass();
                    androidStringManager.getClass();
                    cryptoIdvStatusRepo.getClass();
                    realBitcoinCapabilityProvider.getClass();
                    realBitcoinSponsoredStateRepo.getClass();
                    featureFlagManager2.getClass();
                    realBitcoinPayInUsdPreferenceManager.getClass();
                    realBitcoinInboundNavigator$Factory$Impl.getClass();
                    realBitcoinMapEligibilityManager.getClass();
                    realBitcoinFormatter.getClass();
                    realBitcoinProfileRepo.getClass();
                    syncValueReader2.getClass();
                    return new RealBugReportSenderFactory(cryptoFlowStarter, androidStringManager, cryptoIdvStatusRepo, realBitcoinCapabilityProvider, realBitcoinSponsoredStateRepo, featureFlagManager2, realBitcoinPayInUsdPreferenceManager, realBitcoinInboundNavigator$Factory$Impl, realBitcoinMapEligibilityManager, realBitcoinFormatter, realBitcoinProfileRepo, syncValueReader2);
            }
        }
    }

    public RealRecipientRepository(RealRecipientSuggestionsProvider realRecipientSuggestionsProvider, RealFavoritesRepository realFavoritesRepository, RealCustomerStore realCustomerStore, CashAccountDatabaseImpl cashAccountDatabaseImpl, RealContactRepository realContactRepository, CustomerSearchClientService customerSearchClientService, CardProduct.Companion companion, CoroutineContext coroutineContext, FeatureFlagManager featureFlagManager, RealAllowlistRepository realAllowlistRepository, RealCryptoInvoiceParser realCryptoInvoiceParser, StablecoinNetworkRepo stablecoinNetworkRepo, SyncValueReader syncValueReader) {
        this.recipientProvider = realRecipientSuggestionsProvider;
        this.favoritesRepository = realFavoritesRepository;
        this.customerStore = realCustomerStore;
        this.cashDatabase = cashAccountDatabaseImpl;
        this.contactRepository = realContactRepository;
        this.api = customerSearchClientService;
        this.ioDispatcher = coroutineContext;
        this.featureFlagManager = featureFlagManager;
        this.allowlistRepository = realAllowlistRepository;
        this.cryptoInvoiceParser = realCryptoInvoiceParser;
        this.stablecoinNetworkRepo = stablecoinNetworkRepo;
        this.syncValueReader = syncValueReader;
        this.mlRecipientSearchEnabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$MobileOsP2pRecipientMlSearchAndroid.INSTANCE)).enabled();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$buildSuggestedSection(RealRecipientRepository realRecipientRepository, boolean z, List list, List list2, List list3, Set set, ContinuationImpl continuationImpl) {
        RealRecipientRepository$buildSuggestedSection$1 realRecipientRepository$buildSuggestedSection$1;
        int i;
        List list4;
        Object obj;
        Set set2;
        Iterator it;
        List list5 = list2;
        if (continuationImpl instanceof RealRecipientRepository$buildSuggestedSection$1) {
            realRecipientRepository$buildSuggestedSection$1 = (RealRecipientRepository$buildSuggestedSection$1) continuationImpl;
            int i2 = realRecipientRepository$buildSuggestedSection$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realRecipientRepository$buildSuggestedSection$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realRecipientRepository$buildSuggestedSection$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realRecipientRepository$buildSuggestedSection$1.label;
                Throwable th = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    if (!z) {
                        return filterBlockedIfNeeded(list5, true);
                    }
                    realRecipientRepository$buildSuggestedSection$1.L$1 = list5;
                    realRecipientRepository$buildSuggestedSection$1.L$2 = list3;
                    realRecipientRepository$buildSuggestedSection$1.L$3 = set;
                    realRecipientRepository$buildSuggestedSection$1.label = 1;
                    Serializable orderFavoriteRecipients$data_impl = realRecipientRepository.orderFavoriteRecipients$data_impl(list, realRecipientRepository$buildSuggestedSection$1);
                    if (orderFavoriteRecipients$data_impl == serializable) {
                        return serializable;
                    }
                    list4 = list3;
                    obj = orderFavoriteRecipients$data_impl;
                    set2 = set;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Set set3 = realRecipientRepository$buildSuggestedSection$1.L$3;
                    List list6 = realRecipientRepository$buildSuggestedSection$1.L$2;
                    List list7 = realRecipientRepository$buildSuggestedSection$1.L$1;
                    SafeTrace.throwOnFailure(obj2);
                    set2 = set3;
                    list4 = list6;
                    list5 = list7;
                    obj = obj2;
                }
                List list8 = (List) obj;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list5) {
                    Recipient recipient = (Recipient) obj3;
                    String str = recipient.customerId;
                    if (str == null && (str = recipient.lookupKey) == null) {
                        str = "";
                    }
                    if (!list4.contains(str)) {
                        arrayList.add(obj3);
                    }
                }
                int size = arrayList.size() + list8.size();
                List list9 = list8;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list9, 10));
                int i3 = 0;
                int i4 = 0;
                for (Object obj4 : list9) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        Throwable th2 = th;
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw th2;
                    }
                    Recipient recipient2 = (Recipient) obj4;
                    arrayList2.add(Recipient.copy$default(recipient2, null, null, null, null, null, null, new Recipient.Analytics(null, GenerationStrategy.FAVORITE, new Integer(i4), null, null, null, "SUGGESTED", new Integer(i4), new Integer(size), new Integer(0), null, SuggestionStrategy.FAVORITE, null, null, null, null, null, null, null, null, null, 16774201), true, CollectionsKt.contains(set2, recipient2.customerId), 1073741823, 2));
                    th = th;
                    i4 = i5;
                }
                Throwable th3 = th;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    int i6 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw th3;
                    }
                    Recipient recipient3 = (Recipient) next;
                    Recipient.Analytics analytics = recipient3.analytics;
                    arrayList3.add(Recipient.copy$default(recipient3, null, null, null, null, null, null, analytics != null ? Recipient.Analytics.copy$default(analytics, new Integer(arrayList2.size() + i3), null, new Integer(arrayList2.size() + i3), new Integer(size), 16776827) : th3, false, false, -1073741825, 3));
                    i3 = i6;
                }
                return filterBlockedIfNeeded(CollectionsKt.plus((Iterable) arrayList3, (Collection) arrayList2), true);
            }
        }
        realRecipientRepository$buildSuggestedSection$1 = new RealRecipientRepository$buildSuggestedSection$1(realRecipientRepository, continuationImpl);
        Object obj22 = realRecipientRepository$buildSuggestedSection$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realRecipientRepository$buildSuggestedSection$1.label;
        Throwable th4 = null;
        if (i != 0) {
        }
        List list82 = (List) obj;
        ArrayList arrayList4 = new ArrayList();
        while (r1.hasNext()) {
        }
        int size2 = arrayList4.size() + list82.size();
        List list92 = list82;
        ArrayList arrayList22 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list92, 10));
        int i32 = 0;
        int i42 = 0;
        while (r3.hasNext()) {
        }
        Throwable th32 = th4;
        ArrayList arrayList32 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
        it = arrayList4.iterator();
        while (it.hasNext()) {
        }
        return filterBlockedIfNeeded(CollectionsKt.plus((Iterable) arrayList32, (Collection) arrayList22), true);
    }

    public static final ArrayList access$enrichContactsWithAnalytics(RealRecipientRepository realRecipientRepository, List list, List list2, Set set, int i) {
        Section.Type type2 = Section.Type.SUGGESTED;
        List list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        int i2 = 0;
        for (Object obj : list3) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            RecipientSuggestionsProvider$RecipientWithAnalyticsData recipientSuggestionsProvider$RecipientWithAnalyticsData = (RecipientSuggestionsProvider$RecipientWithAnalyticsData) obj;
            List list4 = list2;
            com.squareup.cash.db.contacts.Recipient recipient = recipientSuggestionsProvider$RecipientWithAnalyticsData.recipient;
            String str = recipient.customerId;
            if (str == null) {
                str = recipient.lookupKey;
            }
            if (CollectionsKt.contains(list4, str)) {
                RecipientSuggestionsProvider$RecipientAnalyticsData recipientSuggestionsProvider$RecipientAnalyticsData = recipientSuggestionsProvider$RecipientWithAnalyticsData.analyticsData;
                GenerationStrategy generationStrategy = GenerationStrategy.RECENT;
                recipientSuggestionsProvider$RecipientWithAnalyticsData = RecipientSuggestionsProvider$RecipientWithAnalyticsData.copy$default(recipientSuggestionsProvider$RecipientWithAnalyticsData, RecipientSuggestionsProvider$RecipientAnalyticsData.copy$default(recipientSuggestionsProvider$RecipientAnalyticsData, null, null, null, null, null, null, null, null, SuggestionStrategy.FAVORITE, null, 1046525));
            }
            arrayList.add(RecipientSuggestionsProvider$RecipientWithAnalyticsData.copy$default(recipientSuggestionsProvider$RecipientWithAnalyticsData, RecipientSuggestionsProvider$RecipientAnalyticsData.copy$default(recipientSuggestionsProvider$RecipientWithAnalyticsData.analyticsData, null, Integer.valueOf(i + i2), null, "CONTACTS", Integer.valueOf(i2), Integer.valueOf(list.size()), null, null, null, null, 1048123)));
            i2 = i3;
        }
        return DrawableCompat.transform(arrayList, list2, set);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$getStablecoinClipboardRecipient(RealRecipientRepository realRecipientRepository, String str, BitcoinPayments.Stablecoin stablecoin, ContinuationImpl continuationImpl) {
        RealRecipientRepository$getStablecoinClipboardRecipient$1 realRecipientRepository$getStablecoinClipboardRecipient$1;
        int i;
        BitcoinPayments.Stablecoin stablecoin2;
        BitcoinPayments.Stablecoin stablecoin3;
        String str2 = str;
        if (continuationImpl instanceof RealRecipientRepository$getStablecoinClipboardRecipient$1) {
            realRecipientRepository$getStablecoinClipboardRecipient$1 = (RealRecipientRepository$getStablecoinClipboardRecipient$1) continuationImpl;
            int i2 = realRecipientRepository$getStablecoinClipboardRecipient$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realRecipientRepository$getStablecoinClipboardRecipient$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realRecipientRepository$getStablecoinClipboardRecipient$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realRecipientRepository$getStablecoinClipboardRecipient$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealCryptoInvoiceParser realCryptoInvoiceParser = realRecipientRepository.cryptoInvoiceParser;
                    realRecipientRepository$getStablecoinClipboardRecipient$1.L$0 = str2;
                    realRecipientRepository$getStablecoinClipboardRecipient$1.L$1 = stablecoin;
                    realRecipientRepository$getStablecoinClipboardRecipient$1.label = 1;
                    Object parse = realCryptoInvoiceParser.parse(str2, false, realRecipientRepository$getStablecoinClipboardRecipient$1);
                    if (parse == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = parse;
                    stablecoin2 = stablecoin;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    stablecoin2 = realRecipientRepository$getStablecoinClipboardRecipient$1.L$1;
                    str2 = realRecipientRepository$getStablecoinClipboardRecipient$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                stablecoin3 = !(obj instanceof BitcoinPayments.Stablecoin) ? (BitcoinPayments.Stablecoin) obj : null;
                if (stablecoin3 == null) {
                    stablecoin2 = stablecoin3;
                } else if (stablecoin2 == null || !StringsKt__StringsJVMKt.startsWith(stablecoin2.address.data, str2, false)) {
                    stablecoin2 = null;
                }
                if (stablecoin2 != null) {
                    return null;
                }
                SolanaAddress solanaAddress = stablecoin2.address;
                String str3 = solanaAddress.data;
                str3.getClass();
                return new Recipient(null, false, false, str3, null, null, false, false, false, null, null, null, null, null, null, false, 0L, null, null, false, null, null, null, null, null, str3.length() > 15 ? Recorder$$ExternalSyntheticOutline2.m(StringsKt___StringsKt.take(6, str3), "...", StringsKt___StringsKt.takeLast(6, str3)) : str3, null, null, false, null, null, false, false, new Recipient.CryptoRecipientPayment.Solana(solanaAddress), -33554441, 1);
            }
        }
        realRecipientRepository$getStablecoinClipboardRecipient$1 = new RealRecipientRepository$getStablecoinClipboardRecipient$1(realRecipientRepository, continuationImpl);
        Object obj2 = realRecipientRepository$getStablecoinClipboardRecipient$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realRecipientRepository$getStablecoinClipboardRecipient$1.label;
        if (i != 0) {
        }
        if (!(obj2 instanceof BitcoinPayments.Stablecoin)) {
        }
        if (stablecoin3 == null) {
        }
        if (stablecoin2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x004f, code lost:
    
        if (r1 == r3) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable access$getStablecoinRecipients(RealRecipientRepository realRecipientRepository, String str, ContinuationImpl continuationImpl) {
        RealRecipientRepository$getStablecoinRecipients$1 realRecipientRepository$getStablecoinRecipients$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        BitcoinPayments bitcoinPayments;
        Object withdrawalOptions;
        String str2;
        StablecoinNetworksResult stablecoinNetworksResult;
        if (continuationImpl instanceof RealRecipientRepository$getStablecoinRecipients$1) {
            realRecipientRepository$getStablecoinRecipients$1 = (RealRecipientRepository$getStablecoinRecipients$1) continuationImpl;
            int i2 = realRecipientRepository$getStablecoinRecipients$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realRecipientRepository$getStablecoinRecipients$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realRecipientRepository$getStablecoinRecipients$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realRecipientRepository$getStablecoinRecipients$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String obj2 = StringsKt.trim(str).toString();
                    RealCryptoInvoiceParser realCryptoInvoiceParser = realRecipientRepository.cryptoInvoiceParser;
                    realRecipientRepository$getStablecoinRecipients$1.label = 1;
                    obj = realCryptoInvoiceParser.parse(obj2, false, realRecipientRepository$getStablecoinRecipients$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str2 = realRecipientRepository$getStablecoinRecipients$1.L$3;
                        SafeTrace.throwOnFailure(obj);
                        stablecoinNetworksResult = (StablecoinNetworksResult) obj;
                        if (stablecoinNetworksResult instanceof StablecoinNetworksResult.Success) {
                            if (!(stablecoinNetworksResult instanceof StablecoinNetworksResult.NeedsPlasmaFlow) && !(stablecoinNetworksResult instanceof StablecoinNetworksResult.Error)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            return EmptyList.INSTANCE;
                        }
                        List<StablecoinWithdrawalOption> list = ((StablecoinNetworksResult.Success) stablecoinNetworksResult).options;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                        for (StablecoinWithdrawalOption stablecoinWithdrawalOption : list) {
                            StablecoinNetwork stablecoinNetwork = stablecoinWithdrawalOption.network;
                            String str3 = null;
                            boolean z = false;
                            boolean z2 = false;
                            String str4 = null;
                            String str5 = null;
                            boolean z3 = false;
                            boolean z4 = false;
                            boolean z5 = false;
                            String str6 = null;
                            String str7 = null;
                            Avatar avatar = null;
                            String str8 = null;
                            String str9 = null;
                            boolean z6 = false;
                            long j = 0;
                            BlockState blockState = null;
                            MerchantData merchantData = null;
                            boolean z7 = false;
                            String str10 = null;
                            Color color = null;
                            Region region = null;
                            String str11 = null;
                            Long l = null;
                            arrayList.add(new Recipient(str3, z, z2, Recorder$$ExternalSyntheticOutline2.m(str2, "_", stablecoinNetwork.chain), str4, str5, z3, z4, z5, str6, str7, avatar, new Image(stablecoinNetwork.chainIconLightUrl, stablecoinNetwork.chainIconDarkUrl, 4), str8, str9, z6, j, blockState, merchantData, z7, str10, color, region, str11, l, stablecoinNetwork.chainName, null, null, false, null, null, false, false, new Recipient.CryptoRecipientPayment.Stablecoin(str2, stablecoinWithdrawalOption), -33558537, 1));
                        }
                        return arrayList;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                bitcoinPayments = (BitcoinPayments) obj;
                if ((bitcoinPayments instanceof BitcoinPayments.Stablecoin) && !(bitcoinPayments instanceof BitcoinPayments.Ethereum)) {
                    return EmptyList.INSTANCE;
                }
                bitcoinPayments.getClass();
                String obj3 = StringsKt.trim(bitcoinPayments.getOriginalData()).toString();
                StablecoinNetworkRepo stablecoinNetworkRepo = realRecipientRepository.stablecoinNetworkRepo;
                InputSource inputSource = InputSource.INPUT_SOURCE_P2P_FLOW;
                realRecipientRepository$getStablecoinRecipients$1.L$3 = obj3;
                realRecipientRepository$getStablecoinRecipients$1.label = 2;
                withdrawalOptions = stablecoinNetworkRepo.getWithdrawalOptions(obj3, inputSource, realRecipientRepository$getStablecoinRecipients$1);
                if (withdrawalOptions != coroutineSingletons) {
                    obj = withdrawalOptions;
                    str2 = obj3;
                    stablecoinNetworksResult = (StablecoinNetworksResult) obj;
                    if (stablecoinNetworksResult instanceof StablecoinNetworksResult.Success) {
                    }
                }
                return coroutineSingletons;
            }
        }
        realRecipientRepository$getStablecoinRecipients$1 = new RealRecipientRepository$getStablecoinRecipients$1(realRecipientRepository, continuationImpl);
        Object obj4 = realRecipientRepository$getStablecoinRecipients$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realRecipientRepository$getStablecoinRecipients$1.label;
        if (i != 0) {
        }
        bitcoinPayments = (BitcoinPayments) obj4;
        if (bitcoinPayments instanceof BitcoinPayments.Stablecoin) {
        }
        bitcoinPayments.getClass();
        String obj32 = StringsKt.trim(bitcoinPayments.getOriginalData()).toString();
        StablecoinNetworkRepo stablecoinNetworkRepo2 = realRecipientRepository.stablecoinNetworkRepo;
        InputSource inputSource2 = InputSource.INPUT_SOURCE_P2P_FLOW;
        realRecipientRepository$getStablecoinRecipients$1.L$3 = obj32;
        realRecipientRepository$getStablecoinRecipients$1.label = 2;
        withdrawalOptions = stablecoinNetworkRepo2.getWithdrawalOptions(obj32, inputSource2, realRecipientRepository$getStablecoinRecipients$1);
        if (withdrawalOptions != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public static ArrayList appendAnalytics$default(RealRecipientRepository realRecipientRepository, List list, String str, SuggestionStrategy suggestionStrategy, String str2, String str3, int i) {
        String str4 = (i & 1) != 0 ? null : str;
        EmptyList emptyList = EmptyList.INSTANCE;
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            RecipientSuggestionsProvider$RecipientWithAnalyticsData recipientSuggestionsProvider$RecipientWithAnalyticsData = (RecipientSuggestionsProvider$RecipientWithAnalyticsData) obj;
            int i4 = i2;
            RecipientSuggestionsProvider$RecipientAnalyticsData recipientSuggestionsProvider$RecipientAnalyticsData = recipientSuggestionsProvider$RecipientWithAnalyticsData.analyticsData;
            Integer valueOf = str2 != null ? Integer.valueOf(str2.length()) : null;
            com.squareup.cash.db.contacts.Recipient recipient = recipientSuggestionsProvider$RecipientWithAnalyticsData.recipient;
            String str5 = recipient.customerId;
            if (str5 == null) {
                str5 = recipient.lookupKey;
            }
            List list3 = list;
            arrayList.add(RecipientSuggestionsProvider$RecipientWithAnalyticsData.copy$default(recipientSuggestionsProvider$RecipientWithAnalyticsData, RecipientSuggestionsProvider$RecipientAnalyticsData.copy$default(recipientSuggestionsProvider$RecipientAnalyticsData, null, Integer.valueOf(i4), Integer.valueOf(list3.size()), str4, Integer.valueOf(i4), Integer.valueOf(list3.size()), valueOf, null, CollectionsKt.contains(emptyList, str5) ? SuggestionStrategy.FAVORITE : suggestionStrategy, str3, 1037315)));
            i2 = i3;
        }
        return arrayList;
    }

    public static List filterBlockedIfNeeded(List list, boolean z) {
        if (!z) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Recipient) obj).blockState != BlockState.BLOCKED) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Flow search$default(RealRecipientRepository realRecipientRepository, String str, Orientation orientation, UUID uuid, Region region, RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1, int i) {
        RealRecipientSuggestionsProvider realRecipientSuggestionsProvider = realRecipientRepository.recipientProvider;
        Orientation orientation2 = (i & 2) != 0 ? Orientation.CASH : orientation;
        int i2 = 0;
        boolean z = (i & 4) != 0;
        boolean z2 = (i & 8) != 0;
        boolean z3 = (i & 32) != 0;
        boolean z4 = (i & 64) == 0;
        Continuation continuation = null;
        UUID uuid2 = (i & 128) != 0 ? null : uuid;
        Region region2 = (i & 256) != 0 ? null : region;
        boolean z5 = (i & 2048) != 0;
        boolean z6 = (i & 4096) == 0;
        RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$12 = (i & PKIFailureInfo.certRevoked) != 0 ? null : realBadger2$setup$lambda$0$$inlined$mapNotNull$1;
        CoroutineContext coroutineContext = realRecipientRepository.ioDispatcher;
        str.getClass();
        orientation2.getClass();
        int i3 = 19;
        if (str.length() == 0) {
            return FlowKt.flowOn(FlowKt.combine(new RealRecipientRepository$suggestions$$inlined$map$1(realRecipientRepository.syncValueReader.getSingleValue(AndroidSyncValueSpecs.RecipientSuggestions), i2), realRecipientRepository.favoritesRepository.getFavorites(), realRecipientRepository.allowlistRepository.getAllowlistedTokensIfActive(), new RealDrawerOpener$getDrawerScreen$$inlined$map$1(RealRecipientSuggestionsProvider.sections$default(realRecipientSuggestionsProvider, new AppLockMonitor$special$$inlined$map$2("", i3), Orientation.CASH, z2, null, true, new AppLockMonitor$special$$inlined$map$2(Long.MAX_VALUE, i3), 40), 21), new RealRecipientRepository$suggestions$3(realRecipientRepository, z3, null)), coroutineContext);
        }
        int i4 = 4;
        ChannelFlowTransformLatest transformLatest = FlowKt.transformLatest(RealRecipientSuggestionsProvider.sections$default(realRecipientSuggestionsProvider, new AppLockMonitor$special$$inlined$map$2(str, i3), orientation2, z2, EmptySet.INSTANCE, true, new AppLockMonitor$special$$inlined$map$2(15L, i3), 32), new RealPasscodeProvider$getPasscode$1(continuation, realRecipientRepository, i4));
        boolean z7 = z6 && orientation2 == Orientation.CASH;
        return FlowKt.flowOn(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(transformLatest, (!z7 || realBadger2$setup$lambda$0$$inlined$mapNotNull$12 == null) ? new AppLockMonitor$special$$inlined$map$2(continuation, i3) : new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new RealTabProvider$setup$1$5(2, continuation, i4), new FlowExtensionsKt$combine$$inlined$combine$1(i4, realBadger2$setup$lambda$0$$inlined$mapNotNull$12, realRecipientRepository)), new RealRecipientRepository$search$1(realRecipientRepository, str, region2, uuid2, z, z5, z2, z4, z3, z7, null), 0), coroutineContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0239 A[LOOP:2: B:43:0x0233->B:45:0x0239, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x026e A[LOOP:3: B:48:0x0268->B:50:0x026e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02cc A[LOOP:4: B:55:0x02c6->B:57:0x02cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011d A[LOOP:7: B:90:0x0117->B:92:0x011d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013a  */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v10, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v23, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable buildRecipientSelectorSearchRequest$data_impl(String str, String str2, ArrayList arrayList, List list, List list2, ContinuationImpl continuationImpl) {
        RealRecipientRepository$buildRecipientSelectorSearchRequest$1 realRecipientRepository$buildRecipientSelectorSearchRequest$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        List list3;
        String str3;
        ArrayList arrayList2;
        String str4;
        String str5;
        ArrayList arrayList3;
        List list4;
        String str6;
        String[] strArr;
        List list5;
        ?? r2;
        Iterator it;
        Iterator it2;
        Iterator it3;
        Object firstOrNull;
        List list6;
        String str7;
        String[] strArr2;
        ArrayList arrayList4;
        EmptyList emptyList;
        Iterator it4;
        List list7;
        Iterable iterable;
        int mapCapacity;
        if (continuationImpl instanceof RealRecipientRepository$buildRecipientSelectorSearchRequest$1) {
            realRecipientRepository$buildRecipientSelectorSearchRequest$1 = (RealRecipientRepository$buildRecipientSelectorSearchRequest$1) continuationImpl;
            int i2 = realRecipientRepository$buildRecipientSelectorSearchRequest$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realRecipientRepository$buildRecipientSelectorSearchRequest$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realRecipientRepository$buildRecipientSelectorSearchRequest$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realRecipientRepository$buildRecipientSelectorSearchRequest$1.label;
                RealContactRepository realContactRepository = this.contactRepository;
                boolean z = this.mlRecipientSearchEnabled;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!z) {
                        list3 = list2;
                        str3 = str2;
                        arrayList2 = arrayList;
                        str4 = str;
                        emptyList = EmptyList.INSTANCE;
                        EmptyList emptyList2 = emptyList;
                        List list8 = list3;
                        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list8, 10));
                        it4 = list8.iterator();
                        while (it4.hasNext()) {
                        }
                        return new RecipientSelectorSearchRequest(str4, str3, null, arrayList2, arrayList5, emptyList2, Boolean.valueOf(z), ByteString.EMPTY);
                    }
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    String[] strArr3 = RecipientTokenizer.tokenizeUniqueName(StringsKt.trim(lowerCase).toString());
                    RealContactRepository$recents$$inlined$mapItems$1 recents = realContactRepository.recents(Long.MAX_VALUE);
                    realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$0 = str;
                    str5 = str2;
                    realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$1 = str5;
                    arrayList3 = arrayList;
                    realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$2 = arrayList3;
                    realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$3 = list;
                    realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$4 = list2;
                    realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$5 = strArr3;
                    realRecipientRepository$buildRecipientSelectorSearchRequest$1.label = 1;
                    Object firstOrNull2 = FlowKt.firstOrNull(recents, realRecipientRepository$buildRecipientSelectorSearchRequest$1);
                    if (firstOrNull2 != coroutineSingletons) {
                        list4 = list;
                        str6 = str;
                        strArr = strArr3;
                        obj = firstOrNull2;
                        list3 = list2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList4 = realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$7;
                    list6 = (List) realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$6;
                    String[] strArr4 = realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$5;
                    List list9 = realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$4;
                    List list10 = realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$3;
                    List list11 = realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$2;
                    str7 = realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$1;
                    String str8 = realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    str6 = str8;
                    strArr2 = strArr4;
                    list3 = list9;
                    arrayList3 = list11;
                    list7 = (List) obj;
                    if (list7 == null) {
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj2 : list7) {
                            com.squareup.cash.db.contacts.Recipient recipient = (com.squareup.cash.db.contacts.Recipient) obj2;
                            if (recipient.matchesFilter(strArr2) && recipient.isCashCustomer) {
                                arrayList6.add(obj2);
                            }
                        }
                        iterable = new ArrayList();
                        Iterator it5 = arrayList6.iterator();
                        while (it5.hasNext()) {
                            String str9 = ((com.squareup.cash.db.contacts.Recipient) it5.next()).customerId;
                            if (str9 != null) {
                                iterable.add(str9);
                            }
                        }
                    } else {
                        iterable = EmptyList.INSTANCE;
                    }
                    arrayList4.getClass();
                    list6.getClass();
                    iterable.getClass();
                    Iterable iterable2 = iterable;
                    ArrayList plus = CollectionsKt.plus(iterable2, (Collection) CollectionsKt.plus((Iterable) arrayList4, (Collection) list6));
                    PaymentQueries paymentQueries = this.cashDatabase.paymentQueries;
                    paymentQueries.getClass();
                    PaymentQueries$lastTransactionDate$2 paymentQueries$lastTransactionDate$2 = PaymentQueries$lastTransactionDate$2.INSTANCE;
                    List<LastTransactionDate> executeAsList = new BadgeQueries$VersionQuery(paymentQueries, plus, plus, new ContactQueries$$ExternalSyntheticLambda1(25), 5).executeAsList();
                    mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(executeAsList, 10));
                    if (mapCapacity < 16) {
                        mapCapacity = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                    for (LastTransactionDate lastTransactionDate : executeAsList) {
                        linkedHashMap.put(lastTransactionDate.user_id, lastTransactionDate.last_transaction_date);
                    }
                    List<String> list12 = CollectionsKt.toList(CollectionsKt.toMutableSet(CollectionsKt.plus(iterable2, (Collection) CollectionsKt.plus((Iterable) list6, (Collection) arrayList4))));
                    ?? arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list12, 10));
                    for (String str10 : list12) {
                        arrayList7.add(new ClientCandidate(str10, Boolean.valueOf(arrayList4.contains(str10)), (Long) linkedHashMap.get(str10), Boolean.valueOf(iterable.contains(str10)), ByteString.EMPTY));
                    }
                    arrayList2 = arrayList3;
                    str4 = str6;
                    str3 = str7;
                    emptyList = arrayList7;
                    EmptyList emptyList22 = emptyList;
                    List list82 = list3;
                    ArrayList arrayList52 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list82, 10));
                    it4 = list82.iterator();
                    while (it4.hasNext()) {
                        String str11 = ((RecipientSuggestionsProvider$RecipientWithAnalyticsData) it4.next()).recipient.customerId;
                        str11.getClass();
                        arrayList52.add(str11);
                    }
                    return new RecipientSelectorSearchRequest(str4, str3, null, arrayList2, arrayList52, emptyList22, Boolean.valueOf(z), ByteString.EMPTY);
                }
                strArr = realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$5;
                list3 = realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$4;
                list4 = realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$3;
                List list13 = realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$2;
                String str12 = realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$1;
                str6 = realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$0;
                SafeTrace.throwOnFailure(obj);
                arrayList3 = list13;
                str5 = str12;
                list5 = (List) obj;
                if (list5 == null) {
                    ArrayList arrayList8 = new ArrayList();
                    for (Object obj3 : list5) {
                        if (((com.squareup.cash.db.contacts.Recipient) obj3).matchesFilter(strArr)) {
                            arrayList8.add(obj3);
                        }
                    }
                    r2 = new ArrayList();
                    Iterator it6 = arrayList8.iterator();
                    while (it6.hasNext()) {
                        String str13 = ((com.squareup.cash.db.contacts.Recipient) it6.next()).customerId;
                        if (str13 != null) {
                            r2.add(str13);
                        }
                    }
                } else {
                    r2 = EmptyList.INSTANCE;
                }
                List list14 = list4;
                ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list14, 10));
                it = list14.iterator();
                while (it.hasNext()) {
                    arrayList9.add(DrawableCompat.transform((Recipient) it.next()));
                }
                ArrayList arrayList10 = new ArrayList();
                it2 = arrayList9.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (((com.squareup.cash.db.contacts.Recipient) next).matchesFilter(strArr)) {
                        arrayList10.add(next);
                    }
                }
                ArrayList arrayList11 = new ArrayList();
                it3 = arrayList10.iterator();
                while (it3.hasNext()) {
                    String str14 = ((com.squareup.cash.db.contacts.Recipient) it3.next()).customerId;
                    if (str14 != null) {
                        arrayList11.add(str14);
                    }
                }
                RealContactRepository$contacts$$inlined$map$1 contacts = realContactRepository.contacts();
                realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$0 = str6;
                realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$1 = str5;
                realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$2 = arrayList3;
                realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$3 = null;
                realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$4 = list3;
                realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$5 = strArr;
                realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$6 = r2;
                realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$7 = arrayList11;
                realRecipientRepository$buildRecipientSelectorSearchRequest$1.label = 2;
                firstOrNull = FlowKt.firstOrNull(contacts, realRecipientRepository$buildRecipientSelectorSearchRequest$1);
                if (firstOrNull != coroutineSingletons) {
                    list6 = r2;
                    obj = firstOrNull;
                    str7 = str5;
                    strArr2 = strArr;
                    arrayList4 = arrayList11;
                    list7 = (List) obj;
                    if (list7 == null) {
                    }
                    arrayList4.getClass();
                    list6.getClass();
                    iterable.getClass();
                    Iterable iterable22 = iterable;
                    ArrayList plus2 = CollectionsKt.plus(iterable22, (Collection) CollectionsKt.plus((Iterable) arrayList4, (Collection) list6));
                    PaymentQueries paymentQueries2 = this.cashDatabase.paymentQueries;
                    paymentQueries2.getClass();
                    PaymentQueries$lastTransactionDate$2 paymentQueries$lastTransactionDate$22 = PaymentQueries$lastTransactionDate$2.INSTANCE;
                    List<LastTransactionDate> executeAsList2 = new BadgeQueries$VersionQuery(paymentQueries2, plus2, plus2, new ContactQueries$$ExternalSyntheticLambda1(25), 5).executeAsList();
                    mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(executeAsList2, 10));
                    if (mapCapacity < 16) {
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity);
                    while (r0.hasNext()) {
                    }
                    List<String> list122 = CollectionsKt.toList(CollectionsKt.toMutableSet(CollectionsKt.plus(iterable22, (Collection) CollectionsKt.plus((Iterable) list6, (Collection) arrayList4))));
                    ?? arrayList72 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list122, 10));
                    while (r0.hasNext()) {
                    }
                    arrayList2 = arrayList3;
                    str4 = str6;
                    str3 = str7;
                    emptyList = arrayList72;
                    EmptyList emptyList222 = emptyList;
                    List list822 = list3;
                    ArrayList arrayList522 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list822, 10));
                    it4 = list822.iterator();
                    while (it4.hasNext()) {
                    }
                    return new RecipientSelectorSearchRequest(str4, str3, null, arrayList2, arrayList522, emptyList222, Boolean.valueOf(z), ByteString.EMPTY);
                }
                return coroutineSingletons;
            }
        }
        realRecipientRepository$buildRecipientSelectorSearchRequest$1 = new RealRecipientRepository$buildRecipientSelectorSearchRequest$1(this, continuationImpl);
        Object obj4 = realRecipientRepository$buildRecipientSelectorSearchRequest$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realRecipientRepository$buildRecipientSelectorSearchRequest$1.label;
        RealContactRepository realContactRepository2 = this.contactRepository;
        boolean z2 = this.mlRecipientSearchEnabled;
        if (i != 0) {
        }
        list5 = (List) obj4;
        if (list5 == null) {
        }
        List list142 = list4;
        ArrayList arrayList92 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list142, 10));
        it = list142.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList102 = new ArrayList();
        it2 = arrayList92.iterator();
        while (it2.hasNext()) {
        }
        ArrayList arrayList112 = new ArrayList();
        it3 = arrayList102.iterator();
        while (it3.hasNext()) {
        }
        RealContactRepository$contacts$$inlined$map$1 contacts2 = realContactRepository2.contacts();
        realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$0 = str6;
        realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$1 = str5;
        realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$2 = arrayList3;
        realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$3 = null;
        realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$4 = list3;
        realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$5 = strArr;
        realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$6 = r2;
        realRecipientRepository$buildRecipientSelectorSearchRequest$1.L$7 = arrayList112;
        realRecipientRepository$buildRecipientSelectorSearchRequest$1.label = 2;
        firstOrNull = FlowKt.firstOrNull(contacts2, realRecipientRepository$buildRecipientSelectorSearchRequest$1);
        if (firstOrNull != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final Object getContactStatus(String str, ContinuationImpl continuationImpl) {
        return FlowKt.first(FlowKt.take(this.contactRepository.contactsStatusForCustomer(str), 1), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096 A[LOOP:1: B:27:0x0090->B:29:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable orderFavoriteRecipients$data_impl(List list, ContinuationImpl continuationImpl) {
        RealRecipientRepository$orderFavoriteRecipients$1 realRecipientRepository$orderFavoriteRecipients$1;
        int i;
        int mapCapacity;
        Iterator it;
        if (continuationImpl instanceof RealRecipientRepository$orderFavoriteRecipients$1) {
            realRecipientRepository$orderFavoriteRecipients$1 = (RealRecipientRepository$orderFavoriteRecipients$1) continuationImpl;
            int i2 = realRecipientRepository$orderFavoriteRecipients$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realRecipientRepository$orderFavoriteRecipients$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realRecipientRepository$orderFavoriteRecipients$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realRecipientRepository$orderFavoriteRecipients$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realRecipientRepository$orderFavoriteRecipients$1.L$0 = list;
                    realRecipientRepository$orderFavoriteRecipients$1.label = 1;
                    obj = JobKt.withContext(r4.ioDispatcher, new RealProfileManager$profileOrNull$2(this.favoritesRepository, null, 11), realRecipientRepository$orderFavoriteRecipients$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = realRecipientRepository$orderFavoriteRecipients$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (CollectionsKt.contains(list2, ((Recipient) obj2).customerId)) {
                        arrayList.add(obj2);
                    } else {
                        arrayList2.add(obj2);
                    }
                }
                int i3 = 10;
                mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                if (mapCapacity < 16) {
                    mapCapacity = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                for (Object obj3 : arrayList) {
                    linkedHashMap.put(((Recipient) obj3).customerId, obj3);
                }
                ArrayList arrayList3 = new ArrayList();
                it = list2.iterator();
                while (it.hasNext()) {
                    Recipient recipient = (Recipient) linkedHashMap.get((String) it.next());
                    if (recipient != null) {
                        arrayList3.add(recipient);
                    }
                }
                return CollectionsKt.plus((Iterable) CollectionsKt.sortedWith(arrayList2, new LinkedHashTreeMap.AnonymousClass1(i3)), (Collection) arrayList3);
            }
        }
        realRecipientRepository$orderFavoriteRecipients$1 = new RealRecipientRepository$orderFavoriteRecipients$1(this, continuationImpl);
        Object obj4 = realRecipientRepository$orderFavoriteRecipients$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realRecipientRepository$orderFavoriteRecipients$1.label;
        if (i != 0) {
        }
        List list22 = (List) obj4;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList22 = new ArrayList();
        while (r5.hasNext()) {
        }
        int i32 = 10;
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
        if (mapCapacity < 16) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity);
        while (r4.hasNext()) {
        }
        ArrayList arrayList32 = new ArrayList();
        it = list22.iterator();
        while (it.hasNext()) {
        }
        return CollectionsKt.plus((Iterable) CollectionsKt.sortedWith(arrayList22, new LinkedHashTreeMap.AnonymousClass1(i32)), (Collection) arrayList32);
    }
}
