package com.squareup.cash.arcade;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Vibrator;
import androidx.compose.foundation.pager.PagerMeasureKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.room.Room;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadx;
import com.google.mlkit.vision.text.internal.zzr;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.R;
import com.squareup.cash.appupdate.backend.real.RealPlayAppUpdateManager;
import com.squareup.cash.arcade.components.haptic.HapticVibratorKt;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.attribution.ConversionListener;
import com.squareup.cash.attribution.DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.banking.backend.real.BankingTabBadgeCounter;
import com.squareup.cash.biometrics.AndroidSecureStore;
import com.squareup.cash.biometrics.Biometrics$Info;
import com.squareup.cash.biometrics.CashBiometricsInfo;
import com.squareup.cash.bitcoin.backend.bitcoinautowithdraw.RealBitcoinAutoWithdrawRepo;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.navigation.RealBitcoinRefreshInvoiceManager;
import com.squareup.cash.bitcoin.presenters.applet.allowlist.CashAppLiteBitcoinWidgetAllowlistProvider;
import com.squareup.cash.bitcoin.presenters.deposits.RealLightningInvoiceGenerator;
import com.squareup.cash.bitcoin.presenters.featureavailability.CashAppLiteBitcoinFeatureAvailabilityProvider;
import com.squareup.cash.bitcoin.presenters.investing.RealBitcoinSponsoredStateRepo;
import com.squareup.cash.businessaccount.kybrestriction.presenters.KybRestrictionBannerPresenter$AssistedInjectionFactory$Impl;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.crypto.service.CryptoService;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalanceDetailLoggingManager;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.marketcapabilities.RealMarketCapabilitiesManager;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.ui.gcm.GcmModule$Companion$provideGcmOnSignOutAction$1;
import com.squareup.cash.webview.android.AndroidWebViewModule$Companion$provideCookieManagerOnAccountTeardownAction$1;
import com.squareup.preferences.StringPreference;
import com.squareup.protos.cash.cashliteflow.api.v1.CashLiteFlowClientService;
import com.squareup.scannerview.SizeMap;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import java.util.List;
import okhttp3.ConnectionPool;

/* loaded from: classes.dex */
public final class ArcadeModule$ProvideHapticVibratorMetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Provider context;

    public /* synthetic */ ArcadeModule$ProvideHapticVibratorMetroFactory(Provider provider, int i) {
        this.$r8$classId = i;
        this.context = provider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        int i2 = 1;
        int i3 = 0;
        Provider provider = this.context;
        switch (i) {
            case 0:
                Context context = (Context) provider.invoke();
                context.getClass();
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = HapticVibratorKt.LocalHapticVibrator;
                Object systemService = context.getSystemService((Class<Object>) Vibrator.class);
                if (systemService != null) {
                    return new RealHapticVibrator((Vibrator) systemService);
                }
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return null;
            case 1:
                Context context2 = (Context) provider.invoke();
                context2.getClass();
                return new RealPlayAppUpdateManager(context2);
            case 2:
                DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0 deferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0 = (DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0) provider.invoke();
                deferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0.getClass();
                return new AndroidWebViewModule$Companion$provideCookieManagerOnAccountTeardownAction$1(deferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0, i2);
            case 3:
                Application application = (Application) provider.invoke();
                application.getClass();
                return new WireAdapter(application);
            case 4:
                List list = (List) provider.invoke();
                list.getClass();
                return new ConnectionPool(list);
            case 5:
                RealObservabilityManager realObservabilityManager = (RealObservabilityManager) provider.invoke();
                realObservabilityManager.getClass();
                return new SizeMap(realObservabilityManager, 14);
            case 6:
                SharedPreferences sharedPreferences = (SharedPreferences) provider.invoke();
                sharedPreferences.getClass();
                return PagerMeasureKt.provideConfirmCashOutVersionCodeKeyValue(sharedPreferences);
            case 7:
                SharedPreferences sharedPreferences2 = (SharedPreferences) provider.invoke();
                sharedPreferences2.getClass();
                return PagerMeasureKt.provideRecurringDepositsHasSeenFirstTimeUserExperience(sharedPreferences2);
            case 8:
                SyncValueReader syncValueReader = (SyncValueReader) provider.invoke();
                syncValueReader.getClass();
                return new BankingTabBadgeCounter(syncValueReader);
            case 9:
                Analytics analytics = (Analytics) provider.invoke();
                analytics.getClass();
                return new ConversionListener(analytics);
            case 10:
                AndroidStringManager androidStringManager = (AndroidStringManager) provider.invoke();
                androidStringManager.getClass();
                return new CashBiometricsInfo(new Biometrics$Info(androidStringManager.get(R.string.confirm_prompt_title), 4, androidStringManager.get(R.string.confirm_prompt_subtitle), null, androidStringManager.get(R.string.prompt_negative_button)), new Biometrics$Info(androidStringManager.get(R.string.change_settings_prompt_title), 4, androidStringManager.get(R.string.change_settings_prompt_subtitle), null, androidStringManager.get(R.string.prompt_negative_button)), new Biometrics$Info(androidStringManager.get(R.string.unlock_prompt_title), 4, androidStringManager.get(R.string.unlock_prompt_subtitle), null, androidStringManager.get(R.string.prompt_negative_button)));
            case 11:
                Context context3 = (Context) provider.invoke();
                context3.getClass();
                SharedPreferences sharedPreferences3 = context3.getSharedPreferences("key-expirations", 0);
                sharedPreferences3.getClass();
                return new ConnectionPool(sharedPreferences3);
            case 12:
                Context context4 = (Context) provider.invoke();
                context4.getClass();
                SharedPreferences sharedPreferences4 = context4.getSharedPreferences("secure-tokens", 0);
                sharedPreferences4.getClass();
                return new ConnectionPool(sharedPreferences4);
            case 13:
                AndroidSecureStore androidSecureStore = (AndroidSecureStore) provider.invoke();
                androidSecureStore.getClass();
                return new GcmModule$Companion$provideGcmOnSignOutAction$1(androidSecureStore, i2);
            case 14:
                Context context5 = (Context) provider.invoke();
                context5.getClass();
                SharedPreferences sharedPreferences5 = context5.getSharedPreferences("password-enclaves", 0);
                sharedPreferences5.getClass();
                return new ConnectionPool(sharedPreferences5);
            case 15:
                CryptoService cryptoService = (CryptoService) provider.invoke();
                cryptoService.getClass();
                return new RealBitcoinAutoWithdrawRepo(cryptoService);
            case 16:
                RealMarketCapabilitiesManager realMarketCapabilitiesManager = (RealMarketCapabilitiesManager) provider.invoke();
                realMarketCapabilitiesManager.getClass();
                return new RealBitcoinCapabilityProvider(realMarketCapabilitiesManager);
            case 17:
                SharedPreferences sharedPreferences6 = (SharedPreferences) provider.invoke();
                sharedPreferences6.getClass();
                return Room.BooleanKeyValue(sharedPreferences6, "has_accepted_btc_map_onboarding_screen", false, false);
            case 18:
                SharedPreferences sharedPreferences7 = (SharedPreferences) provider.invoke();
                sharedPreferences7.getClass();
                return new RealBitcoinRefreshInvoiceManager(new StringPreference(sharedPreferences7, "refresh-invoice-invoice-id", 0));
            case 19:
                SharedPreferences sharedPreferences8 = (SharedPreferences) provider.invoke();
                sharedPreferences8.getClass();
                return zzadx.provideHasSeenStablecoinReceiveOnboarding(sharedPreferences8);
            case 20:
                SharedPreferences sharedPreferences9 = (SharedPreferences) provider.invoke();
                sharedPreferences9.getClass();
                return zzadx.provideHasSeenStablecoinWithdrawalOnboarding(sharedPreferences9);
            case 21:
                SharedPreferences sharedPreferences10 = (SharedPreferences) provider.invoke();
                sharedPreferences10.getClass();
                return zzadx.providePerformanceSummarySubtitle(sharedPreferences10);
            case 22:
                SharedPreferences sharedPreferences11 = (SharedPreferences) provider.invoke();
                sharedPreferences11.getClass();
                return zzadx.provideStackingToolsLearnMore(sharedPreferences11);
            case 23:
                RealDependentBalanceDetailLoggingManager realDependentBalanceDetailLoggingManager = (RealDependentBalanceDetailLoggingManager) provider.invoke();
                realDependentBalanceDetailLoggingManager.getClass();
                return new JCAContext(realDependentBalanceDetailLoggingManager, 16);
            case 24:
                AppConfigManager appConfigManager = (AppConfigManager) provider.invoke();
                appConfigManager.getClass();
                return new CashAppLiteBitcoinWidgetAllowlistProvider(appConfigManager);
            case 25:
                KybRestrictionBannerPresenter$AssistedInjectionFactory$Impl kybRestrictionBannerPresenter$AssistedInjectionFactory$Impl = (KybRestrictionBannerPresenter$AssistedInjectionFactory$Impl) provider.invoke();
                kybRestrictionBannerPresenter$AssistedInjectionFactory$Impl.getClass();
                return new zzr(kybRestrictionBannerPresenter$AssistedInjectionFactory$Impl, 17);
            case 26:
                CashLiteFlowClientService cashLiteFlowClientService = (CashLiteFlowClientService) provider.invoke();
                cashLiteFlowClientService.getClass();
                return new RealLightningInvoiceGenerator(cashLiteFlowClientService, i2);
            case 27:
                CryptoService cryptoService2 = (CryptoService) provider.invoke();
                cryptoService2.getClass();
                return new RealLightningInvoiceGenerator(cryptoService2, i3);
            case 28:
                RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) provider.invoke();
                realFeatureEligibilityRepository.getClass();
                return new CashAppLiteBitcoinFeatureAvailabilityProvider(realFeatureEligibilityRepository);
            default:
                RealFamilyAccountsManager realFamilyAccountsManager = (RealFamilyAccountsManager) provider.invoke();
                realFamilyAccountsManager.getClass();
                return new RealBitcoinSponsoredStateRepo(realFamilyAccountsManager);
        }
    }
}
