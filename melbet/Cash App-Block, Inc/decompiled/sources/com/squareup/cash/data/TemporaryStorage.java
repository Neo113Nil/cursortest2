package com.squareup.cash.data;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.GapPending$keyMap$2;
import androidx.room.Room;
import app.cash.cdp.integration.CdpConfigUpdateSetupTeardown;
import app.cash.local.views.internal.LocalMapKt$LocalMapUR9CgXA$$inlined$rememberCameraPositionState$1;
import coil3.RealImageLoader;
import com.google.crypto.tink.KeysetHandle;
import com.google.zxing.BinaryBitmap;
import com.squareup.cash.api.RealServiceContextManager;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.borrow.views.BorrowUiFactory;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientroutes.RealDeepLinkParser;
import com.squareup.cash.clientrouting.BTCxClientRouterLogger;
import com.squareup.cash.clientrouting.validation.BtcxValidator;
import com.squareup.cash.clientrouting.validation.ManagedAccountClientRouteValidator;
import com.squareup.cash.clientsync.flags.RealClientSyncFlags;
import com.squareup.cash.clientsync.logging.RealClientSyncLogger;
import com.squareup.cash.clientsync.network.SyncEntityTypeInterceptor;
import com.squareup.cash.clientsync.persistence.RealSyncEntityStore;
import com.squareup.cash.clientsync.persistence.SyncEntityStore;
import com.squareup.cash.clientsync.pipeline.DebugLoggingObserver;
import com.squareup.cash.clientsync.pipeline.MatchingIdsSyncEntityAuditor;
import com.squareup.cash.clientsync.pipeline.TaskIdGenerator;
import com.squareup.cash.clientsync.readers.RealSyncEntityReader;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.crypto.backend.autoinvest.RealCryptoAutoInvestRepo;
import com.squareup.cash.crypto.backend.balance.RealRestrictedBalanceStore;
import com.squareup.cash.crypto.backend.receiveasbitcoin.RealReceiveP2PAsBitcoinRepo;
import com.squareup.cash.crypto.backend.settings.RealBitcoinConfigRepo;
import com.squareup.cash.crypto.service.CryptoService;
import com.squareup.cash.crypto.service.RealCryptoService;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.contacts.ContactModifiablePermissions;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.deviceintegrity.RealDeviceIntegrity;
import com.squareup.cash.directdeposit.backend.real.RealFormPdfProvider;
import com.squareup.cash.e2ee.signature.RealSignatureRepo;
import com.squareup.cash.e2ee.signature.validator.SignatureValidator;
import com.squareup.cash.e2ee.trifle.RealTrifleLogger;
import com.squareup.cash.e2ee.trifle.TrifleService;
import com.squareup.cash.earnings.backend.real.RealEarningsSyncStateRepository;
import com.squareup.cash.earnings.backend.real.RealPayerRepository;
import com.squareup.cash.earnings.views.EarningsUiFactory;
import com.squareup.cash.education.stories.service.real.RealCashAppStoryService;
import com.squareup.cash.encryption.RealClientSyncEntityDecryptor;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.history.backend.real.LoyaltyAccountSyncEntityStorageObserver;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.storage.StorageLinkSerdeKt$StorageLinkKeyValue$$inlined$MoshiKeyValue$default$1;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.EnumPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.preferences.values.MoneyTabCardIntroState;
import com.squareup.preferences.values.RecentMoneybotSession;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAppService;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import java.util.List;
import kotlin.Lazy;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.internal.ResourceFileSystem;
import retrofit2.Retrofit;

/* loaded from: classes6.dex */
public final class TemporaryStorage {
    public final Context context;
    public final CoroutineContext ioDispatcher;

    public TemporaryStorage(Context context, CoroutineContext coroutineContext) {
        this.context = context;
        this.ioDispatcher = coroutineContext;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider context;
        public final Provider ioDispatcher;

        public MetroFactory(ResourceFileSystem.Companion companion, DoubleCheck doubleCheck, DoubleCheck doubleCheck2) {
            this.$r8$classId = 19;
            this.context = doubleCheck;
            this.ioDispatcher = doubleCheck2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            int i2 = 2;
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i3 = 0;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            final int i4 = 1;
            Provider provider = this.ioDispatcher;
            Provider provider2 = this.context;
            switch (i) {
                case 0:
                    Context context = (Context) provider2.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    context.getClass();
                    coroutineContext.getClass();
                    return new TemporaryStorage(context, coroutineContext);
                case 1:
                    RealImageLoader realImageLoader = (RealImageLoader) provider2.invoke();
                    RealCashVibrator realCashVibrator = (RealCashVibrator) provider.invoke();
                    realImageLoader.getClass();
                    realCashVibrator.getClass();
                    return new BorrowUiFactory(realImageLoader, realCashVibrator, i4);
                case 2:
                    BooleanPreference booleanPreference = (BooleanPreference) provider2.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider.invoke();
                    booleanPreference.getClass();
                    cashAccountDatabaseImpl.getClass();
                    return new LoyaltyAccountSyncEntityStorageObserver(booleanPreference, cashAccountDatabaseImpl);
                case 3:
                    RealClientRouteParser realClientRouteParser = (RealClientRouteParser) provider2.invoke();
                    RealDeepLinkParser realDeepLinkParser = (RealDeepLinkParser) provider.invoke();
                    realClientRouteParser.getClass();
                    realDeepLinkParser.getClass();
                    return new KeysetHandle(20, realClientRouteParser, realDeepLinkParser);
                case 4:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider = (RealBitcoinCapabilityProvider) provider2.invoke();
                    BTCxClientRouterLogger bTCxClientRouterLogger = (BTCxClientRouterLogger) provider.invoke();
                    List list = BtcxValidator.BTC_X_ALLOWED_CLIENT_ROUTES;
                    realBitcoinCapabilityProvider.getClass();
                    bTCxClientRouterLogger.getClass();
                    list.getClass();
                    return new BtcxValidator(realBitcoinCapabilityProvider, bTCxClientRouterLogger, list);
                case 5:
                    Analytics analytics = (Analytics) provider2.invoke();
                    RealFamilyProfileManager realFamilyProfileManager = (RealFamilyProfileManager) provider.invoke();
                    analytics.getClass();
                    realFamilyProfileManager.getClass();
                    return new ManagedAccountClientRouteValidator(analytics, realFamilyProfileManager);
                case 6:
                    RealClientSyncFlags realClientSyncFlags = (RealClientSyncFlags) provider2.invoke();
                    RealClientSyncLogger realClientSyncLogger = (RealClientSyncLogger) provider.invoke();
                    realClientSyncFlags.getClass();
                    realClientSyncLogger.getClass();
                    return new DebugLoggingObserver(realClientSyncFlags, realClientSyncLogger);
                case 7:
                    RealClientSyncEntityDecryptor realClientSyncEntityDecryptor = (RealClientSyncEntityDecryptor) provider2.invoke();
                    SyncEntityStore syncEntityStore = (SyncEntityStore) provider.invoke();
                    realClientSyncEntityDecryptor.getClass();
                    syncEntityStore.getClass();
                    return new RealSyncEntityReader(realClientSyncEntityDecryptor, syncEntityStore);
                case 8:
                    provider2.getClass();
                    Lazy doubleCheck = provider2 instanceof Lazy ? (Lazy) provider2 : new DoubleCheck(provider2);
                    TaskIdGenerator taskIdGenerator = (TaskIdGenerator) provider.invoke();
                    taskIdGenerator.getClass();
                    return new SyncEntityTypeInterceptor(doubleCheck, taskIdGenerator);
                case 9:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) provider2.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider.invoke();
                    cashAccountDatabaseImpl2.getClass();
                    coroutineContext2.getClass();
                    return new RealSyncEntityStore(cashAccountDatabaseImpl2, coroutineContext2);
                case 10:
                    ErrorReporter errorReporter = (ErrorReporter) provider2.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider.invoke();
                    errorReporter.getClass();
                    featureFlagManager.getClass();
                    return new MatchingIdsSyncEntityAuditor(errorReporter, featureFlagManager);
                case 11:
                    FlowStarter flowStarter = (FlowStarter) provider2.invoke();
                    PaymentManager paymentManager = (PaymentManager) provider.invoke();
                    flowStarter.getClass();
                    paymentManager.getClass();
                    return new KeysetHandle(26, flowStarter, paymentManager);
                case 12:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl3 = (CashAccountDatabaseImpl) provider2.invoke();
                    CoroutineContext coroutineContext3 = (CoroutineContext) provider.invoke();
                    cashAccountDatabaseImpl3.getClass();
                    coroutineContext3.getClass();
                    return new RealCryptoAutoInvestRepo(cashAccountDatabaseImpl3, coroutineContext3);
                case 13:
                    SyncValueReader syncValueReader = (SyncValueReader) provider2.invoke();
                    RealBalanceSnapshotManager realBalanceSnapshotManager = (RealBalanceSnapshotManager) provider.invoke();
                    syncValueReader.getClass();
                    realBalanceSnapshotManager.getClass();
                    return new RealRestrictedBalanceStore(syncValueReader, realBalanceSnapshotManager);
                case 14:
                    SyncValueReader syncValueReader2 = (SyncValueReader) provider2.invoke();
                    CryptoService cryptoService = (CryptoService) provider.invoke();
                    syncValueReader2.getClass();
                    cryptoService.getClass();
                    return new RealReceiveP2PAsBitcoinRepo(syncValueReader2, cryptoService);
                case 15:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl4 = (CashAccountDatabaseImpl) provider2.invoke();
                    CoroutineContext coroutineContext4 = (CoroutineContext) provider.invoke();
                    cashAccountDatabaseImpl4.getClass();
                    coroutineContext4.getClass();
                    return new RealBitcoinConfigRepo(cashAccountDatabaseImpl4, coroutineContext4);
                case 16:
                    Retrofit retrofit = (Retrofit) provider2.invoke();
                    RealServiceContextManager realServiceContextManager = (RealServiceContextManager) provider.invoke();
                    retrofit.getClass();
                    realServiceContextManager.getClass();
                    return new RealCryptoService(retrofit, realServiceContextManager);
                case 17:
                    SharedPreferences sharedPreferences = (SharedPreferences) provider2.invoke();
                    Moshi moshi = (Moshi) provider.invoke();
                    sharedPreferences.getClass();
                    moshi.getClass();
                    MoneyTabCardIntroState moneyTabCardIntroState = new MoneyTabCardIntroState(objArr == true ? 1 : 0, i4, defaultConstructorMarker);
                    KeyValue.OnDeserializationFailure onDeserializationFailure = KeyValue.OnDeserializationFailure.Delete;
                    JsonAdapter adapter = moshi.adapter(MoneyTabCardIntroState.class, Util.NO_ANNOTATIONS, null);
                    return Room.SerDeKeyValue(sharedPreferences, "money-tab-state", new StorageLinkSerdeKt$StorageLinkKeyValue$$inlined$MoshiKeyValue$default$1(adapter, i4), new StorageLinkSerdeKt$StorageLinkKeyValue$$inlined$MoshiKeyValue$default$1(adapter, i2), new GapPending$keyMap$2(moneyTabCardIntroState, i4), onDeserializationFailure, false);
                case 18:
                    SharedPreferences sharedPreferences2 = (SharedPreferences) provider2.invoke();
                    Moshi moshi2 = (Moshi) provider.invoke();
                    sharedPreferences2.getClass();
                    moshi2.getClass();
                    KeyValue.OnDeserializationFailure onDeserializationFailure2 = KeyValue.OnDeserializationFailure.Delete;
                    final JsonAdapter adapter2 = moshi2.adapter(RecentMoneybotSession.class, Util.NO_ANNOTATIONS, null);
                    final Object[] objArr3 = objArr2 == true ? 1 : 0;
                    return Room.SerDeKeyValue(sharedPreferences2, "recent-moneybot-session", new Function1() { // from class: com.squareup.cash.data.SandboxedDataModule$Companion$recentMoneybotSession$$inlined$MoshiKeyValue$default$1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i5 = objArr3;
                            JsonAdapter jsonAdapter = adapter2;
                            switch (i5) {
                                case 0:
                                    String str = (String) obj;
                                    str.getClass();
                                    Object fromJson = jsonAdapter.fromJson(str);
                                    fromJson.getClass();
                                    return fromJson;
                                default:
                                    obj.getClass();
                                    String json = jsonAdapter.toJson(obj);
                                    json.getClass();
                                    return json;
                            }
                        }
                    }, new Function1() { // from class: com.squareup.cash.data.SandboxedDataModule$Companion$recentMoneybotSession$$inlined$MoshiKeyValue$default$1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i5 = i4;
                            JsonAdapter jsonAdapter = adapter2;
                            switch (i5) {
                                case 0:
                                    String str = (String) obj;
                                    str.getClass();
                                    Object fromJson = jsonAdapter.fromJson(str);
                                    fromJson.getClass();
                                    return fromJson;
                                default:
                                    obj.getClass();
                                    String json = jsonAdapter.toJson(obj);
                                    json.getClass();
                                    return json;
                            }
                        }
                    }, new LocalMapKt$LocalMapUR9CgXA$$inlined$rememberCameraPositionState$1(i2), onDeserializationFailure2, false);
                case 19:
                    AndroidPermissionManager androidPermissionManager = (AndroidPermissionManager) provider2.invoke();
                    EnumPreference enumPreference = (EnumPreference) provider.invoke();
                    androidPermissionManager.getClass();
                    enumPreference.getClass();
                    return new ContactModifiablePermissions(androidPermissionManager.create("android.permission.READ_CONTACTS"), enumPreference);
                case 20:
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider2.invoke();
                    RealDeviceIntegrity realDeviceIntegrity = (RealDeviceIntegrity) provider.invoke();
                    featureFlagManager2.getClass();
                    realDeviceIntegrity.getClass();
                    return new CdpConfigUpdateSetupTeardown(i4, featureFlagManager2, realDeviceIntegrity);
                case 21:
                    RealFileDownloader realFileDownloader = (RealFileDownloader) provider2.invoke();
                    CoroutineContext coroutineContext5 = (CoroutineContext) provider.invoke();
                    realFileDownloader.getClass();
                    coroutineContext5.getClass();
                    return new RealFormPdfProvider(realFileDownloader, coroutineContext5);
                case 22:
                    SharedPreferences sharedPreferences3 = (SharedPreferences) provider2.invoke();
                    Moshi moshi3 = (Moshi) provider.invoke();
                    sharedPreferences3.getClass();
                    moshi3.getClass();
                    return new KeysetHandle(29, sharedPreferences3, moshi3);
                case 23:
                    TrifleService trifleService = (TrifleService) provider2.invoke();
                    RealTrifleLogger realTrifleLogger = (RealTrifleLogger) provider.invoke();
                    trifleService.getClass();
                    realTrifleLogger.getClass();
                    return new SignatureValidator(trifleService, realTrifleLogger);
                case 24:
                    RealSignatureRepo realSignatureRepo = (RealSignatureRepo) provider2.invoke();
                    TrifleService trifleService2 = (TrifleService) provider.invoke();
                    realSignatureRepo.getClass();
                    trifleService2.getClass();
                    return new BinaryBitmap(23, realSignatureRepo, trifleService2);
                case 25:
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) provider2.invoke();
                    RealEarningsSyncStateRepository realEarningsSyncStateRepository = (RealEarningsSyncStateRepository) provider.invoke();
                    featureFlagManager3.getClass();
                    realEarningsSyncStateRepository.getClass();
                    return new BinaryBitmap(24, featureFlagManager3, realEarningsSyncStateRepository);
                case 26:
                    PaychecksAppService paychecksAppService = (PaychecksAppService) provider2.invoke();
                    CoroutineContext coroutineContext6 = (CoroutineContext) provider.invoke();
                    paychecksAppService.getClass();
                    coroutineContext6.getClass();
                    return new RealPayerRepository(paychecksAppService, coroutineContext6);
                case 27:
                    RealImageLoader realImageLoader2 = (RealImageLoader) provider2.invoke();
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) provider.invoke();
                    realImageLoader2.getClass();
                    factory.getClass();
                    return new EarningsUiFactory(realImageLoader2, factory, i3);
                case 28:
                    RealImageLoader realImageLoader3 = (RealImageLoader) provider2.invoke();
                    LocalizedMoneyFormatter.Factory factory2 = (LocalizedMoneyFormatter.Factory) provider.invoke();
                    realImageLoader3.getClass();
                    factory2.getClass();
                    return new EarningsUiFactory(realImageLoader3, factory2, i4);
                default:
                    Retrofit retrofit3 = (Retrofit) provider2.invoke();
                    Moshi moshi4 = (Moshi) provider.invoke();
                    retrofit3.getClass();
                    moshi4.getClass();
                    return new RealCashAppStoryService(retrofit3, moshi4);
            }
        }

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, int i) {
            this.$r8$classId = i;
            this.context = provider;
            this.ioDispatcher = provider2;
        }
    }
}
