package com.squareup.cash.biometrics;

import android.app.Activity;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.intercept.EngineInterceptor$intercept$2;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadt;
import com.squareup.cash.benefits.presenters.BenefitsHubPresenter$models$1$1;
import com.squareup.cash.biometrics.Biometrics$AuthenticationStatus;
import com.squareup.cash.biometrics.Biometrics$Result;
import com.squareup.cash.biometrics.BiometricsStore$BiometricsResult;
import com.squareup.cash.cdf.account.AccountAuthenticateBiometricsComplete;
import com.squareup.cash.cdf.account.AccountAuthenticateBiometricsPrompt;
import com.squareup.cash.cdf.account.AccountAuthenticateStart;
import com.squareup.cash.cdf.account.BiometryType;
import com.squareup.cash.integration.analytics.Analytics;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__CollectionKt;
import kotlinx.coroutines.flow.SafeFlow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class AndroidBiometricsStore {
    public final Analytics analytics;
    public final AndroidBiometrics biometrics;
    public final AndroidSecureStore secureStore;

    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Biometrics$AuthenticatorClass.values().length];
            try {
                Biometrics$AuthenticatorClass biometrics$AuthenticatorClass = Biometrics$AuthenticatorClass.STRONG;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Biometrics$AuthenticatorClass biometrics$AuthenticatorClass2 = Biometrics$AuthenticatorClass.STRONG;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidBiometricsStore(AndroidSecureStore androidSecureStore, AndroidBiometrics androidBiometrics, Analytics analytics) {
        this.secureStore = androidSecureStore;
        this.biometrics = androidBiometrics;
        this.analytics = analytics;
    }

    public static /* synthetic */ Object read$default(AndroidBiometricsStore androidBiometricsStore, Activity activity, String str, Biometrics$Info biometrics$Info, BiometricsStore$AnalyticsPayload biometricsStore$AnalyticsPayload, ContinuationImpl continuationImpl) {
        return androidBiometricsStore.read(activity, str, biometrics$Info, biometricsStore$AnalyticsPayload, new BiometricsStore$read$1(), continuationImpl);
    }

    public final BiometricsStore$Status getStatus() {
        return new BiometricsStore$Status(this.secureStore.crypto instanceof AndroidSecureStore$Crypto$Ready, this.biometrics.getAuthenticationStatusForAuthenticator(15));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hasStoredValue(String str, ContinuationImpl continuationImpl) {
        AndroidBiometricsStore$hasStoredValue$1 androidBiometricsStore$hasStoredValue$1;
        int i;
        if (continuationImpl instanceof AndroidBiometricsStore$hasStoredValue$1) {
            androidBiometricsStore$hasStoredValue$1 = (AndroidBiometricsStore$hasStoredValue$1) continuationImpl;
            int i2 = androidBiometricsStore$hasStoredValue$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                androidBiometricsStore$hasStoredValue$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = androidBiometricsStore$hasStoredValue$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidBiometricsStore$hasStoredValue$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    androidBiometricsStore$hasStoredValue$1.label = 1;
                    AndroidSecureStore androidSecureStore = this.secureStore;
                    obj = JobKt.withContext(androidSecureStore.ioDispatcher, new AndroidSecureStore$read$2(androidSecureStore, str, null), androidBiometricsStore$hasStoredValue$1);
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
                return Boolean.valueOf(obj != null);
            }
        }
        androidBiometricsStore$hasStoredValue$1 = new AndroidBiometricsStore$hasStoredValue$1(this, continuationImpl);
        Object obj2 = androidBiometricsStore$hasStoredValue$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidBiometricsStore$hasStoredValue$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(obj2 != null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object read(Activity activity, String str, Biometrics$Info biometrics$Info, BiometricsStore$AnalyticsPayload biometricsStore$AnalyticsPayload, BiometricsStore$read$1 biometricsStore$read$1, ContinuationImpl continuationImpl) {
        AndroidBiometricsStore$read$1 androidBiometricsStore$read$1;
        int i;
        BiometricsStore$AnalyticsPayload biometricsStore$AnalyticsPayload2;
        BiometricsStore$read$1 biometricsStore$read$12;
        Object obj;
        Activity activity2;
        Biometrics$Info biometrics$Info2;
        AndroidSecureValue androidSecureValue;
        AndroidSecureValue androidSecureValue2;
        Object collection;
        Ref$IntRef ref$IntRef;
        BiometricsStore$AnalyticsPayload biometricsStore$AnalyticsPayload3;
        List list;
        Object failure;
        if (continuationImpl instanceof AndroidBiometricsStore$read$1) {
            androidBiometricsStore$read$1 = (AndroidBiometricsStore$read$1) continuationImpl;
            int i2 = androidBiometricsStore$read$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                androidBiometricsStore$read$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = androidBiometricsStore$read$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidBiometricsStore$read$1.label;
                Analytics analytics = this.analytics;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    androidBiometricsStore$read$1.L$0 = activity;
                    androidBiometricsStore$read$1.L$2 = biometrics$Info;
                    biometricsStore$AnalyticsPayload2 = biometricsStore$AnalyticsPayload;
                    androidBiometricsStore$read$1.L$3 = biometricsStore$AnalyticsPayload2;
                    biometricsStore$read$12 = biometricsStore$read$1;
                    androidBiometricsStore$read$1.L$4 = biometricsStore$read$12;
                    androidBiometricsStore$read$1.label = 1;
                    AndroidSecureStore androidSecureStore = this.secureStore;
                    obj = null;
                    Object withContext = JobKt.withContext(androidSecureStore.ioDispatcher, new AndroidSecureStore$read$2(androidSecureStore, str, null), androidBiometricsStore$read$1);
                    if (withContext != coroutineSingletons) {
                        activity2 = activity;
                        biometrics$Info2 = biometrics$Info;
                        obj2 = withContext;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$IntRef = androidBiometricsStore$read$1.L$6;
                    androidSecureValue2 = androidBiometricsStore$read$1.L$5;
                    biometricsStore$AnalyticsPayload3 = androidBiometricsStore$read$1.L$3;
                    SafeTrace.throwOnFailure(obj2);
                    obj = null;
                    list = (List) obj2;
                    if (!list.isEmpty()) {
                        a$$ExternalSyntheticBUOutline0.m$1("Invariant violation: no terminal biometrics result read");
                        return obj;
                    }
                    if (list.size() != 1) {
                        Handlers$$ExternalSyntheticBUOutline0.m(list, "Invariant violation: multiple terminal biometrics results read: ");
                        return obj;
                    }
                    Biometrics$Result biometrics$Result = (Biometrics$Result) list.get(0);
                    boolean z = biometrics$Result instanceof Biometrics$Result.Success;
                    analytics.track(new AccountAuthenticateBiometricsComplete(biometricsStore$AnalyticsPayload3.getClientScenario(), biometricsStore$AnalyticsPayload3.getFlowToken(), supportedBiometryType(), z ? AccountAuthenticateBiometricsComplete.BiometricAuthenticationResult.SUCCESS : biometrics$Result instanceof Biometrics$Result.Failure ? AccountAuthenticateBiometricsComplete.BiometricAuthenticationResult.AUTHENTICATION_FAILED : biometrics$Result instanceof Biometrics$Result.Error.SystemCanceled ? AccountAuthenticateBiometricsComplete.BiometricAuthenticationResult.SYSTEM_CANCELED : biometrics$Result instanceof Biometrics$Result.Error.UserCanceled ? AccountAuthenticateBiometricsComplete.BiometricAuthenticationResult.USER_CANCELED : biometrics$Result instanceof Biometrics$Result.Error.Lockout ? AccountAuthenticateBiometricsComplete.BiometricAuthenticationResult.BIOMETRY_LOCKOUT : biometrics$Result instanceof Biometrics$Result.Error.NegativeButton ? AccountAuthenticateBiometricsComplete.BiometricAuthenticationResult.USER_FALLBACK : biometrics$Result instanceof Biometrics$Result.Error.Timeout ? AccountAuthenticateBiometricsComplete.BiometricAuthenticationResult.AUTHENTICATION_TIMEOUT : AccountAuthenticateBiometricsComplete.BiometricAuthenticationResult.UNKNOWN_FAILURE, new Integer(ref$IntRef.element)), null);
                    if (biometrics$Result instanceof Biometrics$Result.Failure) {
                        a$$ExternalSyntheticBUOutline0.m$1("Invariant violation: Failure cannot be terminal result");
                        return obj;
                    }
                    if (!z) {
                        if (biometrics$Result instanceof Biometrics$Result.PlatformException) {
                            return new BiometricsStore$BiometricsResult.PlatformException(((Biometrics$Result.PlatformException) biometrics$Result).getThrowable());
                        }
                        if (biometrics$Result instanceof Biometrics$Result.Error) {
                            return new BiometricsStore$BiometricsResult.Error((Biometrics$Result.Error) biometrics$Result);
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return obj;
                    }
                    try {
                        Result.Companion companion = Result.Companion;
                        failure = new BiometricsStore$BiometricsResult.Success(androidSecureValue2.decryptThrowing().utf8());
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                    }
                    Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                    if (m4120exceptionOrNullimpl != null) {
                        failure = new BiometricsStore$BiometricsResult.DecryptionFailure(m4120exceptionOrNullimpl);
                    }
                    return (BiometricsStore$BiometricsResult) failure;
                }
                BiometricsStore$read$1 biometricsStore$read$13 = androidBiometricsStore$read$1.L$4;
                biometricsStore$AnalyticsPayload2 = androidBiometricsStore$read$1.L$3;
                Biometrics$Info biometrics$Info3 = androidBiometricsStore$read$1.L$2;
                Activity activity3 = androidBiometricsStore$read$1.L$0;
                SafeTrace.throwOnFailure(obj2);
                obj = null;
                biometrics$Info2 = biometrics$Info3;
                activity2 = activity3;
                biometricsStore$read$12 = biometricsStore$read$13;
                androidSecureValue = (AndroidSecureValue) obj2;
                trackAccountAuthenticateStartEvent(biometricsStore$AnalyticsPayload2, androidSecureValue == null);
                if (androidSecureValue != null) {
                    return null;
                }
                analytics.track(new AccountAuthenticateBiometricsPrompt(biometricsStore$AnalyticsPayload2.getClientScenario(), biometricsStore$AnalyticsPayload2.getFlowToken(), supportedBiometryType()), null);
                Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                ref$IntRef2.element = 1;
                activity2.getClass();
                biometrics$Info2.getClass();
                androidSecureValue2 = androidSecureValue;
                SafeFlow safeFlow = new SafeFlow(new BenefitsHubPresenter$models$1$1(FlowKt.callbackFlow(new AndroidSecureStore$read$2(this.biometrics, activity2, biometrics$Info2, androidSecureValue, (Continuation) null, 7)), continuation, ref$IntRef2, biometricsStore$read$12, 16));
                androidBiometricsStore$read$1.L$0 = null;
                androidBiometricsStore$read$1.L$2 = null;
                androidBiometricsStore$read$1.L$3 = biometricsStore$AnalyticsPayload2;
                androidBiometricsStore$read$1.L$4 = null;
                androidBiometricsStore$read$1.L$5 = androidSecureValue2;
                androidBiometricsStore$read$1.L$6 = ref$IntRef2;
                androidBiometricsStore$read$1.label = 2;
                collection = FlowKt__CollectionKt.toCollection(safeFlow, new ArrayList(), androidBiometricsStore$read$1);
                if (collection != coroutineSingletons) {
                    ref$IntRef = ref$IntRef2;
                    obj2 = collection;
                    biometricsStore$AnalyticsPayload3 = biometricsStore$AnalyticsPayload2;
                    list = (List) obj2;
                    if (!list.isEmpty()) {
                    }
                }
                return coroutineSingletons;
            }
        }
        androidBiometricsStore$read$1 = new AndroidBiometricsStore$read$1(this, continuationImpl);
        Object obj22 = androidBiometricsStore$read$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidBiometricsStore$read$1.label;
        Analytics analytics2 = this.analytics;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        androidSecureValue = (AndroidSecureValue) obj22;
        trackAccountAuthenticateStartEvent(biometricsStore$AnalyticsPayload2, androidSecureValue == null);
        if (androidSecureValue != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readIfCanAuthenticate(Activity activity, String str, Biometrics$Info biometrics$Info, BiometricsStore$AnalyticsPayload biometricsStore$AnalyticsPayload, ContinuationImpl continuationImpl) {
        AndroidBiometricsStore$readIfCanAuthenticate$1 androidBiometricsStore$readIfCanAuthenticate$1;
        Object obj;
        int i;
        if (continuationImpl instanceof AndroidBiometricsStore$readIfCanAuthenticate$1) {
            androidBiometricsStore$readIfCanAuthenticate$1 = (AndroidBiometricsStore$readIfCanAuthenticate$1) continuationImpl;
            int i2 = androidBiometricsStore$readIfCanAuthenticate$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                androidBiometricsStore$readIfCanAuthenticate$1.label = i2 - PKIFailureInfo.systemUnavail;
                AndroidBiometricsStore$readIfCanAuthenticate$1 androidBiometricsStore$readIfCanAuthenticate$12 = androidBiometricsStore$readIfCanAuthenticate$1;
                obj = androidBiometricsStore$readIfCanAuthenticate$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidBiometricsStore$readIfCanAuthenticate$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    BiometricsStore$Status status = getStatus();
                    BiometricsStore$Status biometricsStore$Status = BiometricsStore$Status.Ready;
                    if (!status.equals(zzadt.getReady())) {
                        trackAccountAuthenticateStartEvent(biometricsStore$AnalyticsPayload, false);
                        return null;
                    }
                    androidBiometricsStore$readIfCanAuthenticate$12.label = 1;
                    obj = read$default(this, activity, str, biometrics$Info, biometricsStore$AnalyticsPayload, androidBiometricsStore$readIfCanAuthenticate$12);
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
                if (obj instanceof BiometricsStore$BiometricsResult.Success) {
                    return null;
                }
                return (BiometricsStore$BiometricsResult.Success) obj;
            }
        }
        androidBiometricsStore$readIfCanAuthenticate$1 = new AndroidBiometricsStore$readIfCanAuthenticate$1(this, continuationImpl);
        AndroidBiometricsStore$readIfCanAuthenticate$1 androidBiometricsStore$readIfCanAuthenticate$122 = androidBiometricsStore$readIfCanAuthenticate$1;
        obj = androidBiometricsStore$readIfCanAuthenticate$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidBiometricsStore$readIfCanAuthenticate$122.label;
        if (i != 0) {
        }
        if (obj instanceof BiometricsStore$BiometricsResult.Success) {
        }
    }

    public final BiometryType supportedBiometryType() {
        AndroidBiometrics androidBiometrics = this.biometrics;
        Biometrics$AuthenticationStatus authenticationStatusForAuthenticator = androidBiometrics.getAuthenticationStatusForAuthenticator(15);
        Biometrics$AuthenticationStatus.HardwareNotSupported hardwareNotSupported = Biometrics$AuthenticationStatus.HardwareNotSupported.INSTANCE;
        Biometrics$AuthenticatorClass biometrics$AuthenticatorClass = !authenticationStatusForAuthenticator.equals(hardwareNotSupported) ? Biometrics$AuthenticatorClass.STRONG : !androidBiometrics.getAuthenticationStatusForAuthenticator(255).equals(hardwareNotSupported) ? Biometrics$AuthenticatorClass.WEAK : null;
        int i = biometrics$AuthenticatorClass == null ? -1 : WhenMappings.$EnumSwitchMapping$0[biometrics$AuthenticatorClass.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return BiometryType.STRONG;
        }
        if (i == 2) {
            return BiometryType.WEAK;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public final void trackAccountAuthenticateStartEvent(BiometricsStore$AnalyticsPayload biometricsStore$AnalyticsPayload, boolean z) {
        AccountAuthenticateStart.BiometryState biometryState;
        String clientScenario = biometricsStore$AnalyticsPayload.getClientScenario();
        String flowToken = biometricsStore$AnalyticsPayload.getFlowToken();
        BiometryType supportedBiometryType = supportedBiometryType();
        Biometrics$AuthenticationStatus authenticationStatusForAuthenticator = this.biometrics.getAuthenticationStatusForAuthenticator(15);
        if (authenticationStatusForAuthenticator.equals(Biometrics$AuthenticationStatus.BiometricsEnrolled.INSTANCE)) {
            biometryState = AccountAuthenticateStart.BiometryState.ENABLED;
        } else if (authenticationStatusForAuthenticator.equals(Biometrics$AuthenticationStatus.NoBiometricSignatures.INSTANCE)) {
            biometryState = AccountAuthenticateStart.BiometryState.NOT_ENROLLED;
        } else if (authenticationStatusForAuthenticator.equals(Biometrics$AuthenticationStatus.HardwareNotSupported.INSTANCE)) {
            biometryState = AccountAuthenticateStart.BiometryState.NOT_SUPPORTED;
        } else {
            if (!authenticationStatusForAuthenticator.equals(Biometrics$AuthenticationStatus.OsUpdateRequired.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            biometryState = AccountAuthenticateStart.BiometryState.OS_UPDATE_REQUIRED;
        }
        this.analytics.track(new AccountAuthenticateStart(clientScenario, flowToken, supportedBiometryType, biometryState, Boolean.valueOf(z)), null);
    }

    public final Object write(String str, String str2, Continuation continuation) {
        ByteString byteString;
        Continuation continuation2 = null;
        if (str2 != null) {
            ByteString.Companion companion = ByteString.Companion;
            byteString = ByteString.Companion.encodeUtf8(str2);
        } else {
            byteString = null;
        }
        AndroidSecureStore androidSecureStore = this.secureStore;
        return JobKt.withContext(androidSecureStore.ioDispatcher, new EngineInterceptor$intercept$2(androidSecureStore, byteString, str, continuation2, 14), continuation);
    }
}
