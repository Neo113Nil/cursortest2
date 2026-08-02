package com.squareup.cash.db2;

import android.content.res.Resources;
import androidx.core.os.BundleKt;
import androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda1;
import app.cash.api.ApiResult;
import app.cash.molecule.PlatformKt;
import app.cash.onboarding.global.countries.CountryOnboardingConfig;
import app.cash.onboarding.global.countries.RealCountryOnboardingConfigRepo;
import app.cash.paraphrase.FormattedResource;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.DefaultRegisterAliasHelper$WhenMappings;
import com.squareup.cash.blockers.presenters.FormattedResources;
import com.squareup.cash.blockers.presenters.RegisterAliasHelper;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewModel;
import com.squareup.cash.cdf.AliasType;
import com.squareup.cash.cdf.deviceattestation.PlayIntegrityAttestationType;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.deviceintegrity.AttestationResult;
import com.squareup.cash.deviceintegrity.DeviceIntegrity$Result;
import com.squareup.cash.deviceintegrity.DeviceIntegrityAnalyticsTracker$CashApi;
import com.squareup.cash.deviceintegrity.IntegrityErrorType;
import com.squareup.cash.deviceintegrity.RealDeviceIntegrityAnalyticsTracker;
import com.squareup.cash.deviceintegrity.RealDeviceIntegrityBackend$WhenMappings;
import com.squareup.cash.deviceintegrity.RealDeviceIntegrityBackend$validateClassicAttestation$1;
import com.squareup.cash.deviceintegrity.RealDeviceIntegrityBackend$validateStandardAttestation$1;
import com.squareup.cash.eligibility.backend.api.SettingsEligibilityManager$AccountSettingsResult;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.gps.backend.real.RealGpsConfigStore$getConsentStatus$1;
import com.squareup.cash.gps.backend.real.RealGpsConfigStore$getLocationUpdatedAt$1;
import com.squareup.cash.gps.backend.real.RealGpsConfigStore$getPreciseEnabled$1;
import com.squareup.cash.gps.db.GpsConfig;
import com.squareup.cash.instruments.backend.real.RealAccountInstrumentsBadger$isLinkedBanksRowVisible$1;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.mri.android.RealExecutorServiceFactory;
import com.squareup.cash.mri.android.SafeSignalCollector$$ExternalSyntheticLambda0;
import com.squareup.cash.mri.android.SafeSignalCollector$InProgressException;
import com.squareup.cash.mri.android.SafeSignalCollector$SignalTimedOutException;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayment;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.cash.multiplatform.bitcoin.parsers.LightningInvoice;
import com.squareup.cash.multiplatform.bitcoin.parsers.RealBitcoinPaymentParser$parse$1;
import com.squareup.cash.multiplatform.bitcoin.parsers.RealLightningInvoiceParser;
import com.squareup.cash.multiplatform.bitcoin.parsers.ethereum.EthereumAddress;
import com.squareup.cash.multiplatform.bitcoin.parsers.ethereum.EthereumAddressParser;
import com.squareup.cash.multiplatform.bitcoin.parsers.ethereum.RealEthereumAddressParser;
import com.squareup.cash.multiplatform.bitcoin.parsers.solana.SolanaAddress;
import com.squareup.cash.multiplatform.bitcoin.parsers.solana.SolanaAddressParser;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.support.chat.backend.real.RealChatSession$reset$1;
import com.squareup.cash.util.country.CountryConfig;
import com.squareup.cash.util.country.UtilKt;
import com.squareup.cash.util.legal.LegalUrl;
import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.deviceintegritly.api.DeviceIntegritlyService;
import com.squareup.protos.cash.deviceintegritly.api.ValidateAttestationRequest;
import com.squareup.protos.cash.deviceintegritly.api.ValidateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.common.PlayIntegrityAttestation;
import com.squareup.util.android.PhoneNumbers;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.JobKt;
import okhttp3.ConnectionPool;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class Instrument$Adapter implements RegisterAliasHelper {
    public final Object balance_currencyAdapter;
    public final Object card_brandAdapter;
    public final Object cash_instrument_typeAdapter;

    public Instrument$Adapter(CashAccountDatabaseImpl cashAccountDatabaseImpl, CashAccountDatabaseImpl cashAccountDatabaseImpl2, CoroutineContext coroutineContext) {
        cashAccountDatabaseImpl.getClass();
        cashAccountDatabaseImpl2.getClass();
        coroutineContext.getClass();
        this.cash_instrument_typeAdapter = coroutineContext;
        this.card_brandAdapter = cashAccountDatabaseImpl.gpsConfigQueries;
        this.balance_currencyAdapter = cashAccountDatabaseImpl2.databaseQueries;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (((com.squareup.cash.eligibility.backend.api.SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) r6).cache.linkedBanks.getSettingState() != com.squareup.cash.eligibility.backend.api.SettingVisibility.HIDDEN) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$isLinkedBanksRowVisible(Instrument$Adapter instrument$Adapter, ContinuationImpl continuationImpl) {
        RealAccountInstrumentsBadger$isLinkedBanksRowVisible$1 realAccountInstrumentsBadger$isLinkedBanksRowVisible$1;
        int i;
        SettingsEligibilityManager$AccountSettingsResult settingsEligibilityManager$AccountSettingsResult;
        if (continuationImpl instanceof RealAccountInstrumentsBadger$isLinkedBanksRowVisible$1) {
            realAccountInstrumentsBadger$isLinkedBanksRowVisible$1 = (RealAccountInstrumentsBadger$isLinkedBanksRowVisible$1) continuationImpl;
            int i2 = realAccountInstrumentsBadger$isLinkedBanksRowVisible$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAccountInstrumentsBadger$isLinkedBanksRowVisible$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAccountInstrumentsBadger$isLinkedBanksRowVisible$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAccountInstrumentsBadger$isLinkedBanksRowVisible$1.label;
                boolean z = true;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealSettingsEligibilityManager realSettingsEligibilityManager = (RealSettingsEligibilityManager) instrument$Adapter.balance_currencyAdapter;
                    realAccountInstrumentsBadger$isLinkedBanksRowVisible$1.label = 1;
                    obj = realSettingsEligibilityManager.settings(realAccountInstrumentsBadger$isLinkedBanksRowVisible$1);
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
                settingsEligibilityManager$AccountSettingsResult = (SettingsEligibilityManager$AccountSettingsResult) obj;
                if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                    if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        realAccountInstrumentsBadger$isLinkedBanksRowVisible$1 = new RealAccountInstrumentsBadger$isLinkedBanksRowVisible$1(instrument$Adapter, continuationImpl);
        Object obj2 = realAccountInstrumentsBadger$isLinkedBanksRowVisible$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAccountInstrumentsBadger$isLinkedBanksRowVisible$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        settingsEligibilityManager$AccountSettingsResult = (SettingsEligibilityManager$AccountSettingsResult) obj2;
        if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }

    public static PlayIntegrityAttestation playIntegrityAttestation$default(Instrument$Adapter instrument$Adapter, String str, String str2, DeviceIntegrity$Result deviceIntegrity$Result, int i) {
        PlayIntegrityAttestation.IntegrityErrorCode integrityErrorCode;
        PlayIntegrityAttestation.Status status;
        String str3 = (i & 1) != 0 ? null : str;
        String str4 = (i & 2) != 0 ? null : str2;
        Integer num = deviceIntegrity$Result.playIntegrityErrorCode;
        if (num != null) {
            int intValue = num.intValue();
            ByteString.Companion companion = PlayIntegrityAttestation.IntegrityErrorCode.Companion;
            int abs = Math.abs(intValue);
            companion.getClass();
            integrityErrorCode = ByteString.Companion.m4340fromValue(abs);
        } else {
            integrityErrorCode = null;
        }
        PlayIntegrityAttestation.AttestationType attestationType = str3 != null ? PlayIntegrityAttestation.AttestationType.CLASSIC : PlayIntegrityAttestation.AttestationType.STANDARD;
        String str5 = deviceIntegrity$Result.token;
        IntegrityErrorType integrityErrorType = deviceIntegrity$Result.errorType;
        switch (integrityErrorType == null ? -1 : RealDeviceIntegrityBackend$WhenMappings.$EnumSwitchMapping$0[integrityErrorType.ordinal()]) {
            case -1:
                status = PlayIntegrityAttestation.Status.SUCCESSFUL;
                break;
            case 0:
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 1:
                status = PlayIntegrityAttestation.Status.INTEGRITY_CHECK_EXCEPTION;
                break;
            case 2:
                status = PlayIntegrityAttestation.Status.TOO_MANY_RETRIES;
                break;
            case 3:
                status = PlayIntegrityAttestation.Status.INTERRUPTED_EXCEPTION;
                break;
            case 4:
                status = PlayIntegrityAttestation.Status.TIMEOUT_EXCEPTION;
                break;
            case 5:
                status = PlayIntegrityAttestation.Status.PLAY_SERVICES_UNAVAILABLE;
                break;
            case 6:
                status = PlayIntegrityAttestation.Status.STANDARD_INTEGRITY_EXCEPTION;
                break;
            case 7:
                status = PlayIntegrityAttestation.Status.INTEGRITY_CHECK_EXCEPTION;
                break;
        }
        return new PlayIntegrityAttestation(str3, str5, status, integrityErrorCode, str4, attestationType, ByteString.EMPTY);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0065  */
    @Override // com.squareup.cash.blockers.presenters.RegisterAliasHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RegisterAliasViewModel buildInitialViewModel(BlockersScreens.RegisterAliasScreen registerAliasScreen) {
        AliasType aliasType;
        BlockersData blockersData = registerAliasScreen.blockersData;
        BlockersScreens.RegisterAliasScreen.Mode mode = registerAliasScreen.mode;
        Region region = blockersData.region;
        BlockersData.Flow flow = blockersData.flow;
        BlockersData.Flow flow2 = BlockersData.Flow.ONBOARDING;
        boolean z = flow == flow2;
        CountryOnboardingConfig config = ((RealCountryOnboardingConfigRepo) this.balance_currencyAdapter).getConfig(region);
        CountryOnboardingConfig.AliasRequirement aliasRequirement = config.getAliasRequirement();
        CountryConfig countryConfig = config.countryConfig;
        boolean z2 = aliasRequirement == CountryOnboardingConfig.AliasRequirement.SMS_ONLY;
        boolean z3 = z2 || config.getAliasRequirement() == CountryOnboardingConfig.AliasRequirement.SMS_ENCOURAGED;
        int ordinal = mode.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                aliasType = AliasType.EMAIL;
                String str = ((AndroidStringManager) this.cash_instrument_typeAdapter).get(R.string.blockers_next);
                RegisterAliasViewModel.Mode mode2 = mode != BlockersScreens.RegisterAliasScreen.Mode.REGISTER_EMAIL ? RegisterAliasViewModel.Mode.EMAIL : RegisterAliasViewModel.Mode.SMS;
                boolean isModeSwitchable = isModeSwitchable(registerAliasScreen, z2);
                String str2 = registerAliasScreen.headline;
                String titleText = getTitleText(registerAliasScreen, z2, z3, mode);
                String hintText = hintText(registerAliasScreen, z2, z3, mode);
                String termsText = termsText(registerAliasScreen, aliasType, config);
                ColorModel colorModel = blockersData.accentColor;
                boolean z4 = (z || blockersData.clientScenario == ClientScenario.RECOVER_ACCOUNT) ? false : true;
                boolean z5 = !isModeSwitchable(registerAliasScreen, z2) || registerAliasScreen.skippable;
                Country country = countryConfig.getCountry();
                boolean z6 = ((config instanceof CountryOnboardingConfig.SmsEditorV2FlagBypass) || (config instanceof CountryOnboardingConfig.CA)) ? blockersData.flow != flow2 && mode == BlockersScreens.RegisterAliasScreen.Mode.SIGN_IN : false;
                boolean z7 = z || registerAliasScreen.dismissButtonEnabled;
                Country country2 = countryConfig.getCountry();
                LinkedHashMap linkedHashMap = UtilKt.SUPPORTED_COUNTRY_MAP;
                country2.getClass();
                return new RegisterAliasViewModel(str2, titleText, hintText, mode2, isModeSwitchable, PhoneNumbers.getCountryCallingCode(country2.name()), termsText, str, colorModel, z4, z5, z6, country, z7, showUpdatedTerms(registerAliasScreen, aliasType, config));
            }
            if (ordinal != 2 && ordinal != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        aliasType = AliasType.SMS;
        String str3 = ((AndroidStringManager) this.cash_instrument_typeAdapter).get(R.string.blockers_next);
        RegisterAliasViewModel.Mode mode22 = mode != BlockersScreens.RegisterAliasScreen.Mode.REGISTER_EMAIL ? RegisterAliasViewModel.Mode.EMAIL : RegisterAliasViewModel.Mode.SMS;
        boolean isModeSwitchable2 = isModeSwitchable(registerAliasScreen, z2);
        String str22 = registerAliasScreen.headline;
        String titleText2 = getTitleText(registerAliasScreen, z2, z3, mode);
        String hintText2 = hintText(registerAliasScreen, z2, z3, mode);
        String termsText2 = termsText(registerAliasScreen, aliasType, config);
        ColorModel colorModel2 = blockersData.accentColor;
        if (z) {
        }
        if (isModeSwitchable(registerAliasScreen, z2)) {
        }
        Country country3 = countryConfig.getCountry();
        if (config instanceof CountryOnboardingConfig.SmsEditorV2FlagBypass) {
            if (z) {
            }
            Country country22 = countryConfig.getCountry();
            LinkedHashMap linkedHashMap2 = UtilKt.SUPPORTED_COUNTRY_MAP;
            country22.getClass();
            return new RegisterAliasViewModel(str22, titleText2, hintText2, mode22, isModeSwitchable2, PhoneNumbers.getCountryCallingCode(country22.name()), termsText2, str3, colorModel2, z4, z5, z6, country3, z7, showUpdatedTerms(registerAliasScreen, aliasType, config));
        }
        if (z) {
        }
        Country country222 = countryConfig.getCountry();
        LinkedHashMap linkedHashMap22 = UtilKt.SUPPORTED_COUNTRY_MAP;
        country222.getClass();
        return new RegisterAliasViewModel(str22, titleText2, hintText2, mode22, isModeSwitchable2, PhoneNumbers.getCountryCallingCode(country222.name()), termsText2, str3, colorModel2, z4, z5, z6, country3, z7, showUpdatedTerms(registerAliasScreen, aliasType, config));
    }

    public Object collect() {
        String str = (String) this.cash_instrument_typeAdapter;
        int i = 0;
        if (!((AtomicBoolean) this.balance_currencyAdapter).compareAndSet(false, true)) {
            throw new SafeSignalCollector$InProgressException(str);
        }
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ConcurrencyHelpers$$ExternalSyntheticLambda1("mri-collector-".concat(str), 1));
        try {
            try {
                return newSingleThreadExecutor.submit(new SafeSignalCollector$$ExternalSyntheticLambda0(this, i)).get(1000L, TimeUnit.MILLISECONDS);
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            } catch (TimeoutException unused) {
                throw new SafeSignalCollector$SignalTimedOutException(str);
            }
        } finally {
            newSingleThreadExecutor.shutdownNow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Enum getConsentStatus(ContinuationImpl continuationImpl) {
        RealGpsConfigStore$getConsentStatus$1 realGpsConfigStore$getConsentStatus$1;
        int i;
        GpsConfig gpsConfig;
        if (continuationImpl instanceof RealGpsConfigStore$getConsentStatus$1) {
            realGpsConfigStore$getConsentStatus$1 = (RealGpsConfigStore$getConsentStatus$1) continuationImpl;
            int i2 = realGpsConfigStore$getConsentStatus$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realGpsConfigStore$getConsentStatus$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realGpsConfigStore$getConsentStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realGpsConfigStore$getConsentStatus$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realGpsConfigStore$getConsentStatus$1.label = 1;
                    obj = JobKt.withContext((CoroutineContext) this.cash_instrument_typeAdapter, new RealProfileManager$profileOrNull$2(this, continuation, 18), realGpsConfigStore$getConsentStatus$1);
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
                gpsConfig = (GpsConfig) obj;
                if (gpsConfig == null) {
                    return gpsConfig.getConsent_status();
                }
                return null;
            }
        }
        realGpsConfigStore$getConsentStatus$1 = new RealGpsConfigStore$getConsentStatus$1(this, continuationImpl);
        Object obj2 = realGpsConfigStore$getConsentStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realGpsConfigStore$getConsentStatus$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        gpsConfig = (GpsConfig) obj2;
        if (gpsConfig == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getLocationUpdatedAt(ContinuationImpl continuationImpl) {
        RealGpsConfigStore$getLocationUpdatedAt$1 realGpsConfigStore$getLocationUpdatedAt$1;
        int i;
        GpsConfig gpsConfig;
        if (continuationImpl instanceof RealGpsConfigStore$getLocationUpdatedAt$1) {
            realGpsConfigStore$getLocationUpdatedAt$1 = (RealGpsConfigStore$getLocationUpdatedAt$1) continuationImpl;
            int i2 = realGpsConfigStore$getLocationUpdatedAt$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realGpsConfigStore$getLocationUpdatedAt$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realGpsConfigStore$getLocationUpdatedAt$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realGpsConfigStore$getLocationUpdatedAt$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realGpsConfigStore$getLocationUpdatedAt$1.label = 1;
                    obj = JobKt.withContext((CoroutineContext) this.cash_instrument_typeAdapter, new RealProfileManager$profileOrNull$2(this, continuation, 18), realGpsConfigStore$getLocationUpdatedAt$1);
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
                gpsConfig = (GpsConfig) obj;
                if (gpsConfig == null) {
                    return new Long(gpsConfig.getLocation_updated_at());
                }
                return null;
            }
        }
        realGpsConfigStore$getLocationUpdatedAt$1 = new RealGpsConfigStore$getLocationUpdatedAt$1(this, continuationImpl);
        Object obj2 = realGpsConfigStore$getLocationUpdatedAt$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realGpsConfigStore$getLocationUpdatedAt$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        gpsConfig = (GpsConfig) obj2;
        if (gpsConfig == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getPreciseEnabled(ContinuationImpl continuationImpl) {
        RealGpsConfigStore$getPreciseEnabled$1 realGpsConfigStore$getPreciseEnabled$1;
        int i;
        GpsConfig gpsConfig;
        if (continuationImpl instanceof RealGpsConfigStore$getPreciseEnabled$1) {
            realGpsConfigStore$getPreciseEnabled$1 = (RealGpsConfigStore$getPreciseEnabled$1) continuationImpl;
            int i2 = realGpsConfigStore$getPreciseEnabled$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realGpsConfigStore$getPreciseEnabled$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realGpsConfigStore$getPreciseEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realGpsConfigStore$getPreciseEnabled$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realGpsConfigStore$getPreciseEnabled$1.label = 1;
                    obj = JobKt.withContext((CoroutineContext) this.cash_instrument_typeAdapter, new RealProfileManager$profileOrNull$2(this, continuation, 18), realGpsConfigStore$getPreciseEnabled$1);
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
                gpsConfig = (GpsConfig) obj;
                if (gpsConfig == null) {
                    return gpsConfig.getPrecise_enabled();
                }
                return null;
            }
        }
        realGpsConfigStore$getPreciseEnabled$1 = new RealGpsConfigStore$getPreciseEnabled$1(this, continuationImpl);
        Object obj2 = realGpsConfigStore$getPreciseEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realGpsConfigStore$getPreciseEnabled$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        gpsConfig = (GpsConfig) obj2;
        if (gpsConfig == null) {
        }
    }

    @Override // com.squareup.cash.blockers.presenters.RegisterAliasHelper
    public String getTitleText(BlockersScreens.RegisterAliasScreen registerAliasScreen, boolean z, boolean z2, BlockersScreens.RegisterAliasScreen.Mode mode) {
        mode.getClass();
        return DimensionKt.resolveTitleText((AndroidStringManager) this.cash_instrument_typeAdapter, registerAliasScreen, z, z2, mode);
    }

    @Override // com.squareup.cash.blockers.presenters.RegisterAliasHelper
    public String hintText(BlockersScreens.RegisterAliasScreen registerAliasScreen, boolean z, boolean z2, BlockersScreens.RegisterAliasScreen.Mode mode) {
        mode.getClass();
        return DimensionKt.resolveHintText((AndroidStringManager) this.cash_instrument_typeAdapter, registerAliasScreen, z, z2, mode);
    }

    @Override // com.squareup.cash.blockers.presenters.RegisterAliasHelper
    public boolean isCountrySelectorEnabled() {
        return true;
    }

    @Override // com.squareup.cash.blockers.presenters.RegisterAliasHelper
    public boolean isModeSwitchable(BlockersScreens.RegisterAliasScreen registerAliasScreen, boolean z) {
        int ordinal = registerAliasScreen.mode.ordinal();
        return ordinal != 0 ? ordinal == 3 : !z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ac, code lost:
    
        if (r10 == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
    
        if (r10 == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x006e, code lost:
    
        if (r10 == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0059, code lost:
    
        if (r10 == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object parse(String str, ContinuationImpl continuationImpl) {
        RealBitcoinPaymentParser$parse$1 realBitcoinPaymentParser$parse$1;
        int i;
        BitcoinPayment bitcoinPayment;
        BitcoinPayments.Stablecoin stablecoin;
        if (continuationImpl instanceof RealBitcoinPaymentParser$parse$1) {
            realBitcoinPaymentParser$parse$1 = (RealBitcoinPaymentParser$parse$1) continuationImpl;
            int i2 = realBitcoinPaymentParser$parse$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBitcoinPaymentParser$parse$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realBitcoinPaymentParser$parse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBitcoinPaymentParser$parse$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ConnectionPool connectionPool = (ConnectionPool) this.cash_instrument_typeAdapter;
                    realBitcoinPaymentParser$parse$1.L$0 = str;
                    realBitcoinPaymentParser$parse$1.label = 1;
                    obj = connectionPool.parse(str, realBitcoinPaymentParser$parse$1);
                } else if (i == 1) {
                    str = realBitcoinPaymentParser$parse$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                } else if (i == 2) {
                    str = realBitcoinPaymentParser$parse$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    LightningInvoice lightningInvoice = (LightningInvoice) obj;
                    if (lightningInvoice != null) {
                        return new BitcoinPayments.Lightning(lightningInvoice);
                    }
                    SolanaAddressParser solanaAddressParser = (SolanaAddressParser) this.card_brandAdapter;
                    if (solanaAddressParser != null) {
                        realBitcoinPaymentParser$parse$1.L$0 = str;
                        realBitcoinPaymentParser$parse$1.label = 3;
                        obj = ((WorkCookieJar) solanaAddressParser).parse(str, realBitcoinPaymentParser$parse$1);
                    }
                    stablecoin = null;
                    if (stablecoin != null) {
                    }
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        EthereumAddress ethereumAddress = (EthereumAddress) obj;
                        if (ethereumAddress != null) {
                            return new BitcoinPayments.Ethereum(ethereumAddress);
                        }
                        return null;
                    }
                    str = realBitcoinPaymentParser$parse$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    SolanaAddress solanaAddress = (SolanaAddress) obj;
                    if (solanaAddress != null) {
                        stablecoin = new BitcoinPayments.Stablecoin(solanaAddress);
                        if (stablecoin != null) {
                            return stablecoin;
                        }
                        EthereumAddressParser ethereumAddressParser = (EthereumAddressParser) this.balance_currencyAdapter;
                        if (ethereumAddressParser != null) {
                            realBitcoinPaymentParser$parse$1.L$0 = null;
                            realBitcoinPaymentParser$parse$1.label = 4;
                            obj = ((RealEthereumAddressParser) ethereumAddressParser).parse(str);
                        }
                        return null;
                    }
                    stablecoin = null;
                    if (stablecoin != null) {
                    }
                }
                bitcoinPayment = (BitcoinPayment) obj;
                if (bitcoinPayment == null) {
                    return new BitcoinPayments.Bitcoin(bitcoinPayment);
                }
                realBitcoinPaymentParser$parse$1.L$0 = str;
                realBitcoinPaymentParser$parse$1.label = 2;
                obj = RealLightningInvoiceParser.parse(str);
            }
        }
        realBitcoinPaymentParser$parse$1 = new RealBitcoinPaymentParser$parse$1(this, continuationImpl);
        Object obj2 = realBitcoinPaymentParser$parse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBitcoinPaymentParser$parse$1.label;
        if (i != 0) {
        }
        bitcoinPayment = (BitcoinPayment) obj2;
        if (bitcoinPayment == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (r6.delete(r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (r7.delete(r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        if (r7.delete(r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object reset(ContinuationImpl continuationImpl) {
        RealChatSession$reset$1 realChatSession$reset$1;
        int i;
        if (continuationImpl instanceof RealChatSession$reset$1) {
            realChatSession$reset$1 = (RealChatSession$reset$1) continuationImpl;
            int i2 = realChatSession$reset$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realChatSession$reset$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realChatSession$reset$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realChatSession$reset$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    KeyValue keyValue = (KeyValue) this.cash_instrument_typeAdapter;
                    realChatSession$reset$1.label = 1;
                } else if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    KeyValue keyValue2 = (KeyValue) this.balance_currencyAdapter;
                    realChatSession$reset$1.label = 3;
                }
                KeyValue keyValue3 = (KeyValue) this.card_brandAdapter;
                realChatSession$reset$1.label = 2;
            }
        }
        realChatSession$reset$1 = new RealChatSession$reset$1(this, continuationImpl);
        Object obj2 = realChatSession$reset$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realChatSession$reset$1.label;
        if (i != 0) {
        }
        KeyValue keyValue32 = (KeyValue) this.card_brandAdapter;
        realChatSession$reset$1.label = 2;
    }

    @Override // com.squareup.cash.blockers.presenters.RegisterAliasHelper
    public boolean showUpdatedTerms(BlockersScreens.RegisterAliasScreen registerAliasScreen, AliasType aliasType, CountryOnboardingConfig countryOnboardingConfig) {
        aliasType.getClass();
        countryOnboardingConfig.getClass();
        if (countryOnboardingConfig.updatedTermsUrl(((AndroidStringManager) this.cash_instrument_typeAdapter).get(R.string.blockers_next)) == null && countryOnboardingConfig.getTermsPlain() == null) {
            return false;
        }
        return registerAliasScreen.mode != BlockersScreens.RegisterAliasScreen.Mode.SIGN_IN || aliasType == AliasType.SMS;
    }

    @Override // com.squareup.cash.blockers.presenters.RegisterAliasHelper
    public String termsText(BlockersScreens.RegisterAliasScreen registerAliasScreen, AliasType aliasType, CountryOnboardingConfig countryOnboardingConfig) {
        String string2;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.cash_instrument_typeAdapter;
        Resources resources = androidStringManager.resources;
        aliasType.getClass();
        countryOnboardingConfig.getClass();
        String str = registerAliasScreen.legalAgreementText;
        if (str != null) {
            return str;
        }
        boolean z = aliasType == AliasType.SMS;
        String str2 = androidStringManager.get(R.string.blockers_next);
        int i = DefaultRegisterAliasHelper$WhenMappings.$EnumSwitchMapping$0[registerAliasScreen.mode.ordinal()];
        if (i == 2 && countryOnboardingConfig.getTermsPlain() != null) {
            Integer termsPlain = countryOnboardingConfig.getTermsPlain();
            termsPlain.getClass();
            string2 = androidStringManager.get(termsPlain.intValue());
        } else if (i == 1 && z && countryOnboardingConfig.updatedTermsUrl(str2) != null) {
            FormattedResource updatedTermsUrl = countryOnboardingConfig.updatedTermsUrl(str2);
            if (updatedTermsUrl != null) {
                string2 = Countries.getString(resources, updatedTermsUrl);
            }
            string2 = null;
        } else if (i == 1 && z) {
            string2 = Countries.getString(resources, countryOnboardingConfig.termsUrl(str2));
        } else {
            if (i == 1 && aliasType == AliasType.EMAIL) {
                string2 = Countries.getString(resources, countryOnboardingConfig.termsUrl(str2));
            }
            string2 = null;
        }
        return (!BundleKt.isSpanish((Locale) ((RealLocaleManager) this.card_brandAdapter).resolvedLocale.$$delegate_0.getValue()) || string2 == null) ? string2 : Countries.getString(resources, FormattedResources.blockers_terms_spanish(LegalUrl.SpanishTermsOfService, string2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object validateClassicAttestation(String str, DeviceIntegrity$Result deviceIntegrity$Result, ContinuationImpl continuationImpl) {
        RealDeviceIntegrityBackend$validateClassicAttestation$1 realDeviceIntegrityBackend$validateClassicAttestation$1;
        int i;
        String str2;
        ApiResult apiResult;
        SessionManager sessionManager = (SessionManager) this.card_brandAdapter;
        if (continuationImpl instanceof RealDeviceIntegrityBackend$validateClassicAttestation$1) {
            realDeviceIntegrityBackend$validateClassicAttestation$1 = (RealDeviceIntegrityBackend$validateClassicAttestation$1) continuationImpl;
            int i2 = realDeviceIntegrityBackend$validateClassicAttestation$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realDeviceIntegrityBackend$validateClassicAttestation$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realDeviceIntegrityBackend$validateClassicAttestation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDeviceIntegrityBackend$validateClassicAttestation$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    DeviceIntegritlyService deviceIntegritlyService = (DeviceIntegritlyService) this.cash_instrument_typeAdapter;
                    ValidateAttestationRequest validateAttestationRequest = new ValidateAttestationRequest(PlatformKt.appTokenOrNull(sessionManager), PlatformKt.activeAccountTokenOrNull(sessionManager), str, new ValidateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation(playIntegrityAttestation$default(this, str, null, deviceIntegrity$Result, 2)), 440);
                    realDeviceIntegrityBackend$validateClassicAttestation$1.L$0 = str;
                    realDeviceIntegrityBackend$validateClassicAttestation$1.L$1 = deviceIntegrity$Result;
                    realDeviceIntegrityBackend$validateClassicAttestation$1.label = 1;
                    obj = deviceIntegritlyService.validatePlayIntegrityAttestation(validateAttestationRequest, realDeviceIntegrityBackend$validateClassicAttestation$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = str;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    deviceIntegrity$Result = realDeviceIntegrityBackend$validateClassicAttestation$1.L$1;
                    String str3 = realDeviceIntegrityBackend$validateClassicAttestation$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    str2 = str3;
                }
                DeviceIntegrity$Result deviceIntegrity$Result2 = deviceIntegrity$Result;
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Failure) {
                    if (apiResult instanceof ApiResult.Success) {
                        return AttestationResult.Success.INSTANCE;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                RealDeviceIntegrityAnalyticsTracker realDeviceIntegrityAnalyticsTracker = (RealDeviceIntegrityAnalyticsTracker) this.balance_currencyAdapter;
                DeviceIntegrityAnalyticsTracker$CashApi deviceIntegrityAnalyticsTracker$CashApi = DeviceIntegrityAnalyticsTracker$CashApi.VALIDATE_ATTESTATION;
                str2.getClass();
                deviceIntegrity$Result2.getClass();
                RealDeviceIntegrityAnalyticsTracker.trackAttestationAttestFailCashAPI$default(realDeviceIntegrityAnalyticsTracker, str2, null, (ApiResult.Failure) apiResult, deviceIntegrity$Result2, PlayIntegrityAttestationType.CLASSIC, 2);
                return AttestationResult.Failure.INSTANCE;
            }
        }
        realDeviceIntegrityBackend$validateClassicAttestation$1 = new RealDeviceIntegrityBackend$validateClassicAttestation$1(this, continuationImpl);
        Object obj2 = realDeviceIntegrityBackend$validateClassicAttestation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDeviceIntegrityBackend$validateClassicAttestation$1.label;
        if (i != 0) {
        }
        DeviceIntegrity$Result deviceIntegrity$Result22 = deviceIntegrity$Result;
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Failure) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object validateStandardAttestation(String str, DeviceIntegrity$Result deviceIntegrity$Result, ContinuationImpl continuationImpl) {
        RealDeviceIntegrityBackend$validateStandardAttestation$1 realDeviceIntegrityBackend$validateStandardAttestation$1;
        int i;
        ApiResult apiResult;
        SessionManager sessionManager = (SessionManager) this.card_brandAdapter;
        if (continuationImpl instanceof RealDeviceIntegrityBackend$validateStandardAttestation$1) {
            realDeviceIntegrityBackend$validateStandardAttestation$1 = (RealDeviceIntegrityBackend$validateStandardAttestation$1) continuationImpl;
            int i2 = realDeviceIntegrityBackend$validateStandardAttestation$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realDeviceIntegrityBackend$validateStandardAttestation$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realDeviceIntegrityBackend$validateStandardAttestation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDeviceIntegrityBackend$validateStandardAttestation$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    DeviceIntegritlyService deviceIntegritlyService = (DeviceIntegritlyService) this.cash_instrument_typeAdapter;
                    ValidateAttestationRequest validateAttestationRequest = new ValidateAttestationRequest(PlatformKt.appTokenOrNull(sessionManager), PlatformKt.activeAccountTokenOrNull(sessionManager), null, new ValidateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation(playIntegrityAttestation$default(this, null, str, deviceIntegrity$Result, 1)), 444);
                    realDeviceIntegrityBackend$validateStandardAttestation$1.L$0 = str;
                    realDeviceIntegrityBackend$validateStandardAttestation$1.L$1 = deviceIntegrity$Result;
                    realDeviceIntegrityBackend$validateStandardAttestation$1.label = 1;
                    obj = deviceIntegritlyService.validatePlayIntegrityAttestation(validateAttestationRequest, realDeviceIntegrityBackend$validateStandardAttestation$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    deviceIntegrity$Result = realDeviceIntegrityBackend$validateStandardAttestation$1.L$1;
                    str = realDeviceIntegrityBackend$validateStandardAttestation$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                String str2 = str;
                DeviceIntegrity$Result deviceIntegrity$Result2 = deviceIntegrity$Result;
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Failure) {
                    if (apiResult instanceof ApiResult.Success) {
                        return AttestationResult.Success.INSTANCE;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                str2.getClass();
                deviceIntegrity$Result2.getClass();
                RealDeviceIntegrityAnalyticsTracker.trackAttestationAttestFailCashAPI$default((RealDeviceIntegrityAnalyticsTracker) this.balance_currencyAdapter, null, str2, (ApiResult.Failure) apiResult, deviceIntegrity$Result2, PlayIntegrityAttestationType.STANDARD, 5);
                return AttestationResult.Failure.INSTANCE;
            }
        }
        realDeviceIntegrityBackend$validateStandardAttestation$1 = new RealDeviceIntegrityBackend$validateStandardAttestation$1(this, continuationImpl);
        Object obj2 = realDeviceIntegrityBackend$validateStandardAttestation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDeviceIntegrityBackend$validateStandardAttestation$1.label;
        if (i != 0) {
        }
        String str22 = str;
        DeviceIntegrity$Result deviceIntegrity$Result22 = deviceIntegrity$Result;
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Failure) {
        }
    }

    public Instrument$Adapter(RealLightningInvoiceParser realLightningInvoiceParser, ConnectionPool connectionPool, WorkCookieJar workCookieJar, RealEthereumAddressParser realEthereumAddressParser) {
        this.cash_instrument_typeAdapter = connectionPool;
        this.card_brandAdapter = workCookieJar;
        this.balance_currencyAdapter = realEthereumAddressParser;
    }

    public /* synthetic */ Instrument$Adapter(Object obj, Object obj2, Object obj3) {
        this.cash_instrument_typeAdapter = obj;
        this.card_brandAdapter = obj2;
        this.balance_currencyAdapter = obj3;
    }

    public Instrument$Adapter(String str, RealExecutorServiceFactory realExecutorServiceFactory, Function0 function0) {
        this.cash_instrument_typeAdapter = str;
        this.card_brandAdapter = function0;
        this.balance_currencyAdapter = new AtomicBoolean(false);
    }
}
