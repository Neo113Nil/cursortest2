package com.squareup.cash.e2ee.trifle;

import androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt;
import androidx.glance.layout.PaddingKt;
import app.cash.badging.backend.Badger$collect$activityCount$2;
import app.cash.cdp.integration.CashCdpConfigProvider;
import app.cash.local.backend.MarkMarketingMessageAsViewed$MetroFactory;
import app.cash.onboarding.global.countries.RealCountryOnboardingConfigRepo;
import app.cash.passcode.backend.RealAppLockState;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import app.cash.trifle.Certificate;
import app.cash.trifle.KeyHandle;
import app.cash.trifle.Trifle;
import app.cash.trifle.TrifleErrors;
import app.cash.trifle.delegates.EndEntity$Factory;
import app.cash.trifle.extensions.CertificateExtensions;
import com.google.android.gms.internal.common.zzx;
import com.google.crypto.tink.KeysetHandle;
import com.squareup.cash.appmessages.AppMessageSyncer;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.banking.backend.real.RealConfirmCashOutVersionCodeProvider;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.braze.RealBrazeConfigurator;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticLambda9;
import com.squareup.cash.clientsync.persistence.SqlComponentMigrationStore;
import com.squareup.cash.clientsync.pipeline.SyncTracingObserver;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.telemetry.RealClientSyncTracer;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.crypto.backend.eligibility.RealBitcoinEligibilityRepo;
import com.squareup.cash.crypto.backend.idv.RealCryptoIdvStatusRepo;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.e2ee.signature.Signature;
import com.squareup.cash.e2ee.signature.local.RealLocalSignatureStore;
import com.squareup.cash.e2ee.trifle.TrifleError;
import com.squareup.cash.featureflags.RealLoginFeatureFlagsHandler;
import com.squareup.cash.fillr.real.FillrInitializer;
import com.squareup.cash.gcl.RealMarketAttributesProvider;
import com.squareup.cash.growtools.presenters.manager.state.RealGrowToolsManagerViewAppearanceTracker;
import com.squareup.cash.investing.backend.real.PersistentEntityPriceCache;
import com.squareup.cash.investing.backend.real.PersistentHistoricalDataCache;
import com.squareup.cash.keystore.AttestedKeyMetrics$MetroFactory;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.localization.RealLocaleAssetProvider$MetroFactory;
import com.squareup.cash.moneybot.backend.RealUserSessionPager;
import com.squareup.cash.moneybot.backend.api.managers.ChatManager;
import com.squareup.cash.moneybot.backend.real.managers.RealChatManager;
import com.squareup.cash.multiplatform.bitcoin.parsers.RealBitcoinAddressParser;
import com.squareup.cash.multiplatform.bitcoin.parsers.RealLightningInvoiceParser;
import com.squareup.cash.pdf.presenter.PdfPresenterFactory;
import com.squareup.cash.profile.views.ProfilePhotoInterceptor;
import com.squareup.cash.profile.views.ProfilePhotoResolver;
import com.squareup.cash.retro.views.RetroUiFactory;
import com.squareup.cash.score.views.ScoreUiFactory;
import com.squareup.cash.support.backend.real.RealSupportViewedArticlesStore;
import com.squareup.cash.ui.CashNavigationLogger;
import com.squareup.cash.ui.gcm.GcmModule$Companion$provideGcmOnSignOutAction$1;
import com.squareup.cash.work.applets.views.WorkApplet;
import com.squareup.preferences.KeyValue;
import com.squareup.scannerview.SizeMap;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.MapProviderFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import okhttp3.ConnectionPool;
import okio.Path;
import papa.SafeTrace;
import retrofit2.OkHttpCall;

/* loaded from: classes.dex */
public final class RealTrifleService implements TrifleService {
    public final Trifle trifle = new Trifle(0);
    public final RealTrifleLogger trifleLogger;

    public RealTrifleService(RealTrifleLogger realTrifleLogger) {
        this.trifleLogger = realTrifleLogger;
    }

    public final byte[] signData(byte[] bArr, Signature signature) {
        bArr.getClass();
        TrifleAction trifleAction = TrifleAction.Sign;
        RealTrifleLogger realTrifleLogger = this.trifleLogger;
        realTrifleLogger.logAction(trifleAction);
        try {
            Trifle trifle = this.trifle;
            KeyHandle keyHandle = zzx.toKeyHandle(signature.key);
            ArrayList mapToTrifleCertificates = zzx.mapToTrifleCertificates(signature.certs);
            trifle.getClass();
            return EndEntity$Factory.get(keyHandle.getKeyPair$trifle_release()).createSignedData(bArr, mapToTrifleCertificates).serialize();
        } catch (Exception e) {
            realTrifleLogger.logError(TrifleError.SigningFailed.INSTANCE, null);
            throw e;
        }
    }

    /* renamed from: verifyCerts-IoAF18A, reason: not valid java name */
    public final Object m3522verifyCertsIoAF18A(List list) {
        ArrayList mapToTrifleCertificates = zzx.mapToTrifleCertificates(list);
        this.trifle.getClass();
        Object m1426validate0E7RQCE = CertificateExtensions.m1426validate0E7RQCE((Certificate) CollectionsKt.last((List) mapToTrifleCertificates), mapToTrifleCertificates);
        return Result.m4120exceptionOrNullimpl(m1426validate0E7RQCE) instanceof TrifleErrors.NotValidYetCertificate ? SafeTrace.createFailure(TrifleError.NotValidYetCertificate.INSTANCE) : m1426validate0E7RQCE;
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Factory trifleLogger;

        public MetroFactory(Path.Companion companion, RealBrazeManager.MetroFactory metroFactory) {
            this.$r8$classId = 21;
            this.trifleLogger = metroFactory;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Continuation continuation = null;
            int i2 = 2;
            int i3 = 0;
            Provider provider = this.trifleLogger;
            switch (i) {
                case 0:
                    return new RealTrifleService((RealTrifleLogger) ((FillrInitializer.MetroFactory) provider).invoke());
                case 1:
                    return new RealConfirmCashOutVersionCodeProvider((KeyValue) ((ArcadeModule$ProvideHapticVibratorMetroFactory) provider).invoke());
                case 2:
                    return new GcmModule$Companion$provideGcmOnSignOutAction$1((SqlComponentMigrationStore) ((RealBrazeConfigurator.MetroFactory) provider).invoke(), i2);
                case 3:
                    return new SyncTracingObserver((RealClientSyncTracer) ((RealLocaleAssetProvider$MetroFactory) provider).invoke());
                case 4:
                    RealLightningInvoiceParser realLightningInvoiceParser = new RealLightningInvoiceParser();
                    return new Instrument$Adapter(realLightningInvoiceParser, new ConnectionPool((RealBitcoinAddressParser) ((RealClipboardManager.MetroFactory) provider).invoke(), realLightningInvoiceParser), null, null);
                case 5:
                    return new RealCryptoIdvStatusRepo((RealBitcoinEligibilityRepo) ((TreehouseFlows.MetroFactory) provider).invoke());
                case 6:
                    KeysetHandle keysetHandle = (KeysetHandle) ((RealAppLockState.MetroFactory) provider).invoke();
                    return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(((SyncValueReader) keysetHandle.annotationsMap).getSingleValueOrDefault(AndroidSyncValueSpecs.PersonalInfoCtaBanner, 0L, new Matcher$$ExternalSyntheticLambda9(25)), (Flow) keysetHandle.entries, new Badger$collect$activityCount$2(3, continuation, 1), i3);
                case 7:
                    Map map = ((MapProviderFactory) provider).contributingMap;
                    map.getClass();
                    return new SizeMap(map);
                case 8:
                    return new RealLocalSignatureStore((KeysetHandle) ((TemporaryStorage.MetroFactory) provider).invoke());
                case 9:
                    return (RealLoginFeatureFlagsHandler) ((AttestedKeyMetrics$MetroFactory) provider).invoke();
                case 10:
                    return new RealGrowToolsManagerViewAppearanceTracker((KeyValue) ((RealMarketAttributesProvider.MetroFactory) provider).invoke());
                case 11:
                    Provider provider2 = (AttestedKeyMetrics$MetroFactory) provider;
                    return (PersistentEntityPriceCache) (provider2 instanceof Lazy ? (Lazy) provider2 : new DoubleCheck(provider2)).getValue();
                case 12:
                    Provider provider3 = (RealKeyStoreProvider.MetroFactory) provider;
                    return (PersistentHistoricalDataCache) (provider3 instanceof Lazy ? (Lazy) provider3 : new DoubleCheck(provider3)).getValue();
                case 13:
                    return new PdfPresenterFactory((CashCdpConfigProvider.MetroFactory) provider, 15);
                case 14:
                    return new RealUserSessionPager((ChatManager) ((RealChatManager.MetroFactory) provider).invoke());
                case 15:
                    return new ProfilePhotoInterceptor((OkHttpCall.AnonymousClass1) ((RetroUiFactory.MetroFactory) provider).invoke(), i2);
                case 16:
                    return MeasureScopeWithLayoutNodeKt.provideOnboardableCountries((RealCountryOnboardingConfigRepo) ((RealPasscodeFlowStarter.MetroFactory) provider).invoke());
                case 17:
                    return new PdfPresenterFactory((ScoreUiFactory.MetroFactory) provider, 22);
                case 18:
                    return new ProfilePhotoInterceptor((ProfilePhotoResolver) ((AppMessageSyncer.MetroFactory) provider).invoke(), i3);
                case 19:
                    return new RealSupportViewedArticlesStore((KeyValue) ((CashNavigationLogger.MetroFactory) provider).invoke());
                case 20:
                    return PaddingKt.provideSupportSearchServiceFactory$jvm((MarkMarketingMessageAsViewed$MetroFactory) provider);
                default:
                    return ((WorkApplet) ((RealBrazeManager.MetroFactory) provider).invoke()).getApplet();
            }
        }

        public /* synthetic */ MetroFactory(Factory factory, int i) {
            this.$r8$classId = i;
            this.trifleLogger = factory;
        }
    }
}
