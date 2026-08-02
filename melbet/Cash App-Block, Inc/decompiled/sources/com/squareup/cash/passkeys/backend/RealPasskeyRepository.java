package com.squareup.cash.passkeys.backend;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.compose.ui.platform.DerivedSize;
import androidx.core.os.BundleKt;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.module.AppGlideModule;
import com.squareup.cash.cdf.passkey.PasskeyCreateCancelled;
import com.squareup.cash.cdf.passkey.PasskeyCreateResultSuccess;
import com.squareup.cash.cdf.passkey.PasskeyCreateStarted;
import com.squareup.cash.cdf.passkey.PasskeyDeleteResultFailed;
import com.squareup.cash.cdf.passkey.PasskeyDeleteResultSuccess;
import com.squareup.cash.cdf.passkey.PasskeyDeleteStarted;
import com.squareup.cash.cdf.passkey.PasskeyLoadPasskeysResultFailed;
import com.squareup.cash.cdf.passkey.PasskeyLoadPasskeysResultSuccess;
import com.squareup.cash.cdf.passkey.PasskeyLoadPasskeysStarted;
import com.squareup.cash.cdf.passkey.PasskeyLoginCancelled;
import com.squareup.cash.cdf.passkey.PasskeyLoginResultFailed;
import com.squareup.cash.cdf.passkey.PasskeyLoginResultSuccess;
import com.squareup.cash.cdf.passkey.PasskeyLoginStarted;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.passkeys.backend.PasskeyCredentialCreator$CredentialCreationResult;
import com.squareup.cash.passkeys.backend.PasskeyCredentialCreator$FetchCredentialResult;
import com.squareup.cash.passkeys.backend.PasskeyRepository$DeregisterPasskeyResult;
import com.squareup.cash.passkeys.backend.PasskeyRepository$FetchPasskeysResult;
import com.squareup.cash.passkeys.backend.PasskeyRepository$LoginIdentifier;
import com.squareup.cash.passkeys.backend.PasskeyRepository$PasskeyAuthenticationResult;
import com.squareup.cash.passkeys.backend.PasskeyRepository$PasskeyRegistrationResult;
import com.squareup.protos.cash.janus.api.DeregisterWebAuthnCredentialRequest;
import com.squareup.protos.cash.janus.api.FinishWebAuthnAuthenticationRequest;
import com.squareup.protos.cash.janus.api.FinishWebAuthnAuthenticationResponse;
import com.squareup.protos.cash.janus.api.FinishWebAuthnRegistrationRequest;
import com.squareup.protos.cash.janus.api.GetWebAuthnCredentialsRequest;
import com.squareup.protos.cash.janus.api.GetWebAuthnCredentialsResponse;
import com.squareup.protos.cash.janus.api.StartWebAuthnAuthenticationRequest;
import com.squareup.protos.cash.janus.api.StartWebAuthnAuthenticationRequest$LoginEntity$Customer;
import com.squareup.protos.cash.janus.api.StartWebAuthnAuthenticationRequest$LoginEntity$Email;
import com.squareup.protos.cash.janus.api.StartWebAuthnAuthenticationRequest$LoginEntity$SmsNumber;
import com.squareup.protos.cash.janus.api.StartWebAuthnAuthenticationResponse;
import com.squareup.protos.cash.janus.api.StartWebAuthnRegistrationRequest;
import com.squareup.protos.cash.janus.api.StartWebAuthnRegistrationResponse;
import com.squareup.protos.cash.janus.api.WebAuthnService;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.ResponseContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealPasskeyRepository {
    public final ErrorReporter errorReporter;
    public final RealPasskeyAnalytics passkeyAnalytics;
    public final CredentialManagerPasskeyCreator passkeyCreator;
    public final WebAuthnService webAuthnService;

    public RealPasskeyRepository(WebAuthnService webAuthnService, CredentialManagerPasskeyCreator credentialManagerPasskeyCreator, RealPasskeyAnalytics realPasskeyAnalytics, ErrorReporter errorReporter) {
        this.webAuthnService = webAuthnService;
        this.passkeyCreator = credentialManagerPasskeyCreator;
        this.passkeyAnalytics = realPasskeyAnalytics;
        this.errorReporter = errorReporter;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object authenticateWithPasskey(PasskeyRepository$LoginIdentifier passkeyRepository$LoginIdentifier, ClientScenario clientScenario, String str, ContinuationImpl continuationImpl) {
        RealPasskeyRepository$authenticateWithPasskey$1 realPasskeyRepository$authenticateWithPasskey$1;
        int i;
        String str2;
        String str3;
        PasskeyRepository$PasskeyAuthenticationResult result;
        Analytics analytics = this.passkeyAnalytics.analytics;
        if (continuationImpl instanceof RealPasskeyRepository$authenticateWithPasskey$1) {
            realPasskeyRepository$authenticateWithPasskey$1 = (RealPasskeyRepository$authenticateWithPasskey$1) continuationImpl;
            int i2 = realPasskeyRepository$authenticateWithPasskey$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPasskeyRepository$authenticateWithPasskey$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealPasskeyRepository$authenticateWithPasskey$1 realPasskeyRepository$authenticateWithPasskey$12 = realPasskeyRepository$authenticateWithPasskey$1;
                Object obj = realPasskeyRepository$authenticateWithPasskey$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPasskeyRepository$authenticateWithPasskey$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String name = clientScenario.name();
                    realPasskeyRepository$authenticateWithPasskey$12.L$2 = str;
                    realPasskeyRepository$authenticateWithPasskey$12.L$3 = name;
                    realPasskeyRepository$authenticateWithPasskey$12.label = 1;
                    obj = performPasskeyAuthentication(passkeyRepository$LoginIdentifier, clientScenario, str, name, realPasskeyRepository$authenticateWithPasskey$12);
                    if (obj == obj2) {
                        return obj2;
                    }
                    str2 = str;
                    str3 = name;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = realPasskeyRepository$authenticateWithPasskey$12.L$3;
                    str2 = realPasskeyRepository$authenticateWithPasskey$12.L$2;
                    SafeTrace.throwOnFailure(obj);
                }
                PasskeyAuthenticationAttempt passkeyAuthenticationAttempt = (PasskeyAuthenticationAttempt) obj;
                result = passkeyAuthenticationAttempt.getResult();
                if (!(result instanceof PasskeyRepository$PasskeyAuthenticationResult.Success)) {
                    str3.getClass();
                    str2.getClass();
                    analytics.track(new PasskeyLoginResultSuccess(str3, str2), null);
                    return result;
                }
                if (passkeyAuthenticationAttempt.getStarted()) {
                    if (passkeyAuthenticationAttempt.getCancelled()) {
                        str3.getClass();
                        str2.getClass();
                        analytics.track(new PasskeyLoginCancelled(str3, str2), null);
                        return result;
                    }
                    str3.getClass();
                    str2.getClass();
                    analytics.track(new PasskeyLoginResultFailed(str3, str2), null);
                }
                return result;
            }
        }
        realPasskeyRepository$authenticateWithPasskey$1 = new RealPasskeyRepository$authenticateWithPasskey$1(this, continuationImpl);
        RealPasskeyRepository$authenticateWithPasskey$1 realPasskeyRepository$authenticateWithPasskey$122 = realPasskeyRepository$authenticateWithPasskey$1;
        Object obj3 = realPasskeyRepository$authenticateWithPasskey$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPasskeyRepository$authenticateWithPasskey$122.label;
        if (i != 0) {
        }
        PasskeyAuthenticationAttempt passkeyAuthenticationAttempt2 = (PasskeyAuthenticationAttempt) obj3;
        result = passkeyAuthenticationAttempt2.getResult();
        if (!(result instanceof PasskeyRepository$PasskeyAuthenticationResult.Success)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deregisterPasskey(String str, ContinuationImpl continuationImpl) {
        RealPasskeyRepository$deregisterPasskey$1 realPasskeyRepository$deregisterPasskey$1;
        int i;
        ApiResult apiResult;
        Analytics analytics = this.passkeyAnalytics.analytics;
        if (continuationImpl instanceof RealPasskeyRepository$deregisterPasskey$1) {
            realPasskeyRepository$deregisterPasskey$1 = (RealPasskeyRepository$deregisterPasskey$1) continuationImpl;
            int i2 = realPasskeyRepository$deregisterPasskey$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPasskeyRepository$deregisterPasskey$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPasskeyRepository$deregisterPasskey$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPasskeyRepository$deregisterPasskey$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    analytics.track(new PasskeyDeleteStarted(), null);
                    DeregisterWebAuthnCredentialRequest deregisterWebAuthnCredentialRequest = new DeregisterWebAuthnCredentialRequest(null, str, ByteString.EMPTY);
                    realPasskeyRepository$deregisterPasskey$1.label = 1;
                    obj = this.webAuthnService.deregisterWebAuthnCredential(deregisterWebAuthnCredentialRequest, realPasskeyRepository$deregisterPasskey$1);
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
                if (!(apiResult instanceof ApiResult.Success)) {
                    analytics.track(new PasskeyDeleteResultSuccess(), null);
                    return PasskeyRepository$DeregisterPasskeyResult.Success.INSTANCE;
                }
                boolean z = apiResult instanceof ApiResult.Failure.NetworkFailure;
                PasskeyRepository$DeregisterPasskeyResult.Error error = PasskeyRepository$DeregisterPasskeyResult.Error.INSTANCE;
                if (z) {
                    analytics.track(new PasskeyDeleteResultFailed(null, ((ApiResult.Failure.NetworkFailure) apiResult).error.getMessage()), null);
                    return error;
                }
                if (!(apiResult instanceof ApiResult.Failure.HttpFailure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ApiResult.Failure.HttpFailure httpFailure = (ApiResult.Failure.HttpFailure) apiResult;
                analytics.track(new PasskeyDeleteResultFailed(new Integer(httpFailure.code), httpFailure.errorBody), null);
                return error;
            }
        }
        realPasskeyRepository$deregisterPasskey$1 = new RealPasskeyRepository$deregisterPasskey$1(this, continuationImpl);
        Object obj2 = realPasskeyRepository$deregisterPasskey$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPasskeyRepository$deregisterPasskey$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getRegisteredPasskeys(ContinuationImpl continuationImpl) {
        RealPasskeyRepository$getRegisteredPasskeys$1 realPasskeyRepository$getRegisteredPasskeys$1;
        int i;
        ApiResult apiResult;
        Passkey passkey;
        Analytics analytics = this.passkeyAnalytics.analytics;
        if (continuationImpl instanceof RealPasskeyRepository$getRegisteredPasskeys$1) {
            realPasskeyRepository$getRegisteredPasskeys$1 = (RealPasskeyRepository$getRegisteredPasskeys$1) continuationImpl;
            int i2 = realPasskeyRepository$getRegisteredPasskeys$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPasskeyRepository$getRegisteredPasskeys$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPasskeyRepository$getRegisteredPasskeys$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPasskeyRepository$getRegisteredPasskeys$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    analytics.track(new PasskeyLoadPasskeysStarted(), null);
                    GetWebAuthnCredentialsRequest getWebAuthnCredentialsRequest = new GetWebAuthnCredentialsRequest(ByteString.EMPTY);
                    realPasskeyRepository$getRegisteredPasskeys$1.label = 1;
                    obj = this.webAuthnService.getWebAuthnCredentials(getWebAuthnCredentialsRequest, realPasskeyRepository$getRegisteredPasskeys$1);
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
                if (apiResult instanceof ApiResult.Success) {
                    boolean z = apiResult instanceof ApiResult.Failure.HttpFailure;
                    PasskeyRepository$FetchPasskeysResult.Error error = PasskeyRepository$FetchPasskeysResult.Error.INSTANCE;
                    if (z) {
                        ApiResult.Failure.HttpFailure httpFailure = (ApiResult.Failure.HttpFailure) apiResult;
                        analytics.track(new PasskeyLoadPasskeysResultFailed(new Integer(httpFailure.code), httpFailure.errorBody), null);
                        return error;
                    }
                    if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
                        analytics.track(new PasskeyLoadPasskeysResultFailed(null, ((ApiResult.Failure.NetworkFailure) apiResult).error.getMessage()), null);
                        return error;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                List<GetWebAuthnCredentialsResponse.Credential> list = ((GetWebAuthnCredentialsResponse) ((ApiResult.Success) apiResult).response).credentials;
                ArrayList arrayList = new ArrayList();
                for (GetWebAuthnCredentialsResponse.Credential credential : list) {
                    String str = credential.credential_id;
                    if (str == null) {
                        BundleKt.logAndReturnNull("credential_id");
                    } else {
                        String str2 = credential.description;
                        if (str2 == null) {
                            BundleKt.logAndReturnNull("description");
                        } else {
                            Long l = credential.registered_at_millis;
                            if (l != null) {
                                passkey = new Passkey(str, str2, l.longValue(), credential.last_used_at_millis);
                                if (passkey == null) {
                                    arrayList.add(passkey);
                                }
                            } else {
                                BundleKt.logAndReturnNull("registered_at_millis");
                            }
                        }
                    }
                    passkey = null;
                    if (passkey == null) {
                    }
                }
                PasskeyRepository$FetchPasskeysResult.Success success = new PasskeyRepository$FetchPasskeysResult.Success(arrayList);
                analytics.track(new PasskeyLoadPasskeysResultSuccess(Integer.valueOf(arrayList.size())), null);
                return success;
            }
        }
        realPasskeyRepository$getRegisteredPasskeys$1 = new RealPasskeyRepository$getRegisteredPasskeys$1(this, continuationImpl);
        Object obj2 = realPasskeyRepository$getRegisteredPasskeys$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPasskeyRepository$getRegisteredPasskeys$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x00e3, code lost:
    
        if (r4 == r6) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0210, code lost:
    
        if (r4 == r6) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0160, code lost:
    
        if (r8.charAt(r1) != ']') goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0261  */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performPasskeyAuthentication(PasskeyRepository$LoginIdentifier passkeyRepository$LoginIdentifier, ClientScenario clientScenario, String str, String str2, ContinuationImpl continuationImpl) {
        RealPasskeyRepository$performPasskeyAuthentication$1 realPasskeyRepository$performPasskeyAuthentication$1;
        int i;
        StartWebAuthnAuthenticationRequest startWebAuthnAuthenticationRequest;
        String str3;
        ApiResult apiResult;
        PasskeyRepository$LoginIdentifier passkeyRepository$LoginIdentifier2;
        WebAuthnService webAuthnService;
        ClientScenario clientScenario2;
        StartWebAuthnAuthenticationResponse startWebAuthnAuthenticationResponse;
        PasskeyRepository$LoginIdentifier passkeyRepository$LoginIdentifier3;
        ?? r10;
        PasskeyCredentialCreator$FetchCredentialResult passkeyCredentialCreator$FetchCredentialResult;
        PasskeyRepository$LoginIdentifier passkeyRepository$LoginIdentifier4 = passkeyRepository$LoginIdentifier;
        ClientScenario clientScenario3 = clientScenario;
        String str4 = str;
        if (continuationImpl instanceof RealPasskeyRepository$performPasskeyAuthentication$1) {
            realPasskeyRepository$performPasskeyAuthentication$1 = (RealPasskeyRepository$performPasskeyAuthentication$1) continuationImpl;
            int i2 = realPasskeyRepository$performPasskeyAuthentication$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPasskeyRepository$performPasskeyAuthentication$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPasskeyRepository$performPasskeyAuthentication$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPasskeyRepository$performPasskeyAuthentication$1.label;
                WebAuthnService webAuthnService2 = this.webAuthnService;
                PasskeyRepository$PasskeyAuthenticationResult.NoCredentials noCredentials = PasskeyRepository$PasskeyAuthenticationResult.NoCredentials.INSTANCE;
                PasskeyRepository$PasskeyAuthenticationResult.Error error = PasskeyRepository$PasskeyAuthenticationResult.Error.INSTANCE;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (passkeyRepository$LoginIdentifier4 instanceof PasskeyRepository$LoginIdentifier.AccountToken) {
                        startWebAuthnAuthenticationRequest = new StartWebAuthnAuthenticationRequest(new StartWebAuthnAuthenticationRequest$LoginEntity$Customer(new StartWebAuthnAuthenticationRequest.Customer(((PasskeyRepository$LoginIdentifier.AccountToken) passkeyRepository$LoginIdentifier4).m3689unboximpl())), 2);
                    } else if (passkeyRepository$LoginIdentifier4 instanceof PasskeyRepository$LoginIdentifier.SmsNumber) {
                        startWebAuthnAuthenticationRequest = new StartWebAuthnAuthenticationRequest(new StartWebAuthnAuthenticationRequest$LoginEntity$SmsNumber(((PasskeyRepository$LoginIdentifier.SmsNumber) passkeyRepository$LoginIdentifier4).m3695unboximpl()), 2);
                    } else if (passkeyRepository$LoginIdentifier4 instanceof PasskeyRepository$LoginIdentifier.Email) {
                        startWebAuthnAuthenticationRequest = new StartWebAuthnAuthenticationRequest(new StartWebAuthnAuthenticationRequest$LoginEntity$Email(((PasskeyRepository$LoginIdentifier.Email) passkeyRepository$LoginIdentifier4).m3692unboximpl()), 2);
                    } else {
                        if (!Intrinsics.areEqual(passkeyRepository$LoginIdentifier4, PasskeyRepository$LoginIdentifier.Discoverable.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        startWebAuthnAuthenticationRequest = new StartWebAuthnAuthenticationRequest((AppGlideModule) null, 3);
                    }
                    realPasskeyRepository$performPasskeyAuthentication$1.L$0 = passkeyRepository$LoginIdentifier4;
                    realPasskeyRepository$performPasskeyAuthentication$1.L$1 = clientScenario3;
                    realPasskeyRepository$performPasskeyAuthentication$1.L$2 = str4;
                    str3 = str2;
                    realPasskeyRepository$performPasskeyAuthentication$1.L$3 = str3;
                    realPasskeyRepository$performPasskeyAuthentication$1.label = 1;
                    obj = webAuthnService2.startWebAuthnAuthentication(clientScenario3, str4, startWebAuthnAuthenticationRequest, realPasskeyRepository$performPasskeyAuthentication$1);
                } else if (i == 1) {
                    String str5 = realPasskeyRepository$performPasskeyAuthentication$1.L$3;
                    String str6 = realPasskeyRepository$performPasskeyAuthentication$1.L$2;
                    ClientScenario clientScenario4 = realPasskeyRepository$performPasskeyAuthentication$1.L$1;
                    PasskeyRepository$LoginIdentifier passkeyRepository$LoginIdentifier5 = realPasskeyRepository$performPasskeyAuthentication$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    str3 = str5;
                    passkeyRepository$LoginIdentifier4 = passkeyRepository$LoginIdentifier5;
                    str4 = str6;
                    clientScenario3 = clientScenario4;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        passkeyRepository$LoginIdentifier3 = realPasskeyRepository$performPasskeyAuthentication$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        ApiResult apiResult2 = (ApiResult) obj;
                        if (apiResult2 instanceof ApiResult.Success) {
                            ResponseContext responseContext = ((FinishWebAuthnAuthenticationResponse) ((ApiResult.Success) apiResult2).response).response_context;
                            if (responseContext != null) {
                                return new PasskeyAuthenticationAttempt(PasskeyRepository$PasskeyAuthenticationResult.Success.m3696boximpl(responseContext), 4);
                            }
                            reportAuthenticationFailure("missing_response_context", passkeyRepository$LoginIdentifier3);
                            return new PasskeyAuthenticationAttempt(error, 4);
                        }
                        int i3 = 4;
                        if (apiResult2 instanceof ApiResult.Failure.NetworkFailure) {
                            return new PasskeyAuthenticationAttempt(error, i3);
                        }
                        if (apiResult2 instanceof ApiResult.Failure.HttpFailure) {
                            reportAuthenticationFailure("finish_authentication", passkeyRepository$LoginIdentifier3);
                            return new PasskeyAuthenticationAttempt(error, i3);
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    int i4 = realPasskeyRepository$performPasskeyAuthentication$1.I$0;
                    startWebAuthnAuthenticationResponse = realPasskeyRepository$performPasskeyAuthentication$1.L$5;
                    str4 = realPasskeyRepository$performPasskeyAuthentication$1.L$2;
                    clientScenario2 = realPasskeyRepository$performPasskeyAuthentication$1.L$1;
                    PasskeyRepository$LoginIdentifier passkeyRepository$LoginIdentifier6 = realPasskeyRepository$performPasskeyAuthentication$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    r10 = i4;
                    webAuthnService = webAuthnService2;
                    passkeyRepository$LoginIdentifier3 = passkeyRepository$LoginIdentifier6;
                    passkeyCredentialCreator$FetchCredentialResult = (PasskeyCredentialCreator$FetchCredentialResult) obj;
                    if (!Intrinsics.areEqual(passkeyCredentialCreator$FetchCredentialResult, PasskeyCredentialCreator$FetchCredentialResult.NoCredentials.INSTANCE)) {
                        return new PasskeyAuthenticationAttempt(noCredentials, 4);
                    }
                    if (Intrinsics.areEqual(passkeyCredentialCreator$FetchCredentialResult, PasskeyCredentialCreator$FetchCredentialResult.Cancelled.INSTANCE)) {
                        return new PasskeyAuthenticationAttempt(noCredentials, true, true);
                    }
                    if (Intrinsics.areEqual(passkeyCredentialCreator$FetchCredentialResult, PasskeyCredentialCreator$FetchCredentialResult.Error.INSTANCE)) {
                        return new PasskeyAuthenticationAttempt(error, 4);
                    }
                    if (!(passkeyCredentialCreator$FetchCredentialResult instanceof PasskeyCredentialCreator$FetchCredentialResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    FinishWebAuthnAuthenticationRequest finishWebAuthnAuthenticationRequest = new FinishWebAuthnAuthenticationRequest(startWebAuthnAuthenticationResponse.request_id, ((PasskeyCredentialCreator$FetchCredentialResult.Success) passkeyCredentialCreator$FetchCredentialResult).m3688unboximpl(), null, null, null, null, null, null, null, ByteString.EMPTY);
                    realPasskeyRepository$performPasskeyAuthentication$1.L$0 = passkeyRepository$LoginIdentifier3;
                    realPasskeyRepository$performPasskeyAuthentication$1.L$1 = null;
                    realPasskeyRepository$performPasskeyAuthentication$1.L$2 = null;
                    realPasskeyRepository$performPasskeyAuthentication$1.L$3 = null;
                    realPasskeyRepository$performPasskeyAuthentication$1.L$5 = null;
                    realPasskeyRepository$performPasskeyAuthentication$1.I$0 = r10;
                    realPasskeyRepository$performPasskeyAuthentication$1.label = 3;
                    obj = webAuthnService.finishWebAuthnAuthentication(clientScenario2, str4, finishWebAuthnAuthenticationRequest, realPasskeyRepository$performPasskeyAuthentication$1);
                }
                apiResult = (ApiResult) obj;
                int i5 = 6;
                if (apiResult instanceof ApiResult.Success) {
                    PasskeyRepository$LoginIdentifier passkeyRepository$LoginIdentifier7 = passkeyRepository$LoginIdentifier4;
                    if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
                        return new PasskeyAuthenticationAttempt(error, 6);
                    }
                    int i6 = 6;
                    if (apiResult instanceof ApiResult.Failure.HttpFailure) {
                        reportAuthenticationFailure("start_authentication", passkeyRepository$LoginIdentifier7);
                        return new PasskeyAuthenticationAttempt(error, i6);
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                StartWebAuthnAuthenticationResponse startWebAuthnAuthenticationResponse2 = (StartWebAuthnAuthenticationResponse) ((ApiResult.Success) apiResult).response;
                String str7 = startWebAuthnAuthenticationResponse2.options;
                if (str7 == null) {
                    return new PasskeyAuthenticationAttempt(noCredentials, i5);
                }
                boolean z = passkeyRepository$LoginIdentifier4 instanceof PasskeyRepository$LoginIdentifier.Discoverable;
                if (!z) {
                    int indexOf$default = StringsKt.indexOf$default((CharSequence) str7, "\"allowCredentials\"", 0, false, 6);
                    if (indexOf$default != -1) {
                        passkeyRepository$LoginIdentifier2 = passkeyRepository$LoginIdentifier4;
                        webAuthnService = webAuthnService2;
                        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str7, ':', indexOf$default, false, 4);
                        if (indexOf$default2 != -1) {
                            int i7 = indexOf$default2 + 1;
                            int length = str7.length();
                            while (true) {
                                if (i7 >= length) {
                                    i7 = -1;
                                    break;
                                }
                                if (!CharsKt.isWhitespace(str7.charAt(i7))) {
                                    break;
                                }
                                i7++;
                            }
                            if (i7 != -1 && str7.charAt(i7) == '[') {
                                int i8 = i7 + 1;
                                int length2 = str7.length();
                                while (true) {
                                    if (i8 >= length2) {
                                        i8 = -1;
                                        break;
                                    }
                                    if (!CharsKt.isWhitespace(str7.charAt(i8))) {
                                        break;
                                    }
                                    i8++;
                                }
                                if (i8 != -1) {
                                }
                            }
                        }
                    }
                    return new PasskeyAuthenticationAttempt(noCredentials, 6);
                }
                passkeyRepository$LoginIdentifier2 = passkeyRepository$LoginIdentifier4;
                webAuthnService = webAuthnService2;
                str3.getClass();
                str4.getClass();
                this.passkeyAnalytics.analytics.track(new PasskeyLoginStarted(str3, str4), null);
                realPasskeyRepository$performPasskeyAuthentication$1.L$0 = passkeyRepository$LoginIdentifier2;
                realPasskeyRepository$performPasskeyAuthentication$1.L$1 = clientScenario3;
                realPasskeyRepository$performPasskeyAuthentication$1.L$2 = str4;
                realPasskeyRepository$performPasskeyAuthentication$1.L$3 = null;
                realPasskeyRepository$performPasskeyAuthentication$1.L$5 = startWebAuthnAuthenticationResponse2;
                realPasskeyRepository$performPasskeyAuthentication$1.I$0 = z ? 1 : 0;
                realPasskeyRepository$performPasskeyAuthentication$1.label = 2;
                Object credential = this.passkeyCreator.getCredential(str7, z, realPasskeyRepository$performPasskeyAuthentication$1);
                if (credential != coroutineSingletons) {
                    clientScenario2 = clientScenario3;
                    startWebAuthnAuthenticationResponse = startWebAuthnAuthenticationResponse2;
                    obj = credential;
                    passkeyRepository$LoginIdentifier3 = passkeyRepository$LoginIdentifier2;
                    r10 = z;
                    passkeyCredentialCreator$FetchCredentialResult = (PasskeyCredentialCreator$FetchCredentialResult) obj;
                    if (!Intrinsics.areEqual(passkeyCredentialCreator$FetchCredentialResult, PasskeyCredentialCreator$FetchCredentialResult.NoCredentials.INSTANCE)) {
                    }
                }
                return coroutineSingletons;
            }
        }
        realPasskeyRepository$performPasskeyAuthentication$1 = new RealPasskeyRepository$performPasskeyAuthentication$1(this, continuationImpl);
        Object obj2 = realPasskeyRepository$performPasskeyAuthentication$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPasskeyRepository$performPasskeyAuthentication$1.label;
        WebAuthnService webAuthnService22 = this.webAuthnService;
        PasskeyRepository$PasskeyAuthenticationResult.NoCredentials noCredentials2 = PasskeyRepository$PasskeyAuthenticationResult.NoCredentials.INSTANCE;
        PasskeyRepository$PasskeyAuthenticationResult.Error error2 = PasskeyRepository$PasskeyAuthenticationResult.Error.INSTANCE;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        int i52 = 6;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0124, code lost:
    
        if (r3 == r7) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0078, code lost:
    
        if (r3 == r7) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object registerPasskey(ClientScenario clientScenario, String str, ContinuationImpl continuationImpl) {
        RealPasskeyRepository$registerPasskey$1 realPasskeyRepository$registerPasskey$1;
        int i;
        ApiResult apiResult;
        StartWebAuthnRegistrationResponse startWebAuthnRegistrationResponse;
        ClientScenario clientScenario2;
        String str2;
        PasskeyCredentialCreator$CredentialCreationResult passkeyCredentialCreator$CredentialCreationResult;
        ClientScenario clientScenario3 = clientScenario;
        String str3 = str;
        RealPasskeyAnalytics realPasskeyAnalytics = this.passkeyAnalytics;
        Analytics analytics = realPasskeyAnalytics.analytics;
        if (continuationImpl instanceof RealPasskeyRepository$registerPasskey$1) {
            realPasskeyRepository$registerPasskey$1 = (RealPasskeyRepository$registerPasskey$1) continuationImpl;
            int i2 = realPasskeyRepository$registerPasskey$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPasskeyRepository$registerPasskey$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPasskeyRepository$registerPasskey$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPasskeyRepository$registerPasskey$1.label;
                WebAuthnService webAuthnService = this.webAuthnService;
                PasskeyRepository$PasskeyRegistrationResult.Error error = PasskeyRepository$PasskeyRegistrationResult.Error.INSTANCE;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    analytics.track(new PasskeyCreateStarted(), null);
                    StartWebAuthnRegistrationRequest startWebAuthnRegistrationRequest = new StartWebAuthnRegistrationRequest(ByteString.EMPTY);
                    realPasskeyRepository$registerPasskey$1.L$0 = clientScenario3;
                    realPasskeyRepository$registerPasskey$1.L$1 = str3;
                    realPasskeyRepository$registerPasskey$1.label = 1;
                    obj = webAuthnService.startWebAuthnRegistration(clientScenario3, str3, startWebAuthnRegistrationRequest, realPasskeyRepository$registerPasskey$1);
                } else if (i == 1) {
                    String str4 = realPasskeyRepository$registerPasskey$1.L$1;
                    ClientScenario clientScenario4 = realPasskeyRepository$registerPasskey$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    str3 = str4;
                    clientScenario3 = clientScenario4;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        ApiResult apiResult2 = (ApiResult) obj;
                        if (apiResult2 instanceof ApiResult.Success) {
                            analytics.track(new PasskeyCreateResultSuccess(), null);
                            return PasskeyRepository$PasskeyRegistrationResult.Success.INSTANCE;
                        }
                        if (apiResult2 instanceof ApiResult.Failure.NetworkFailure) {
                            realPasskeyAnalytics.trackCreatePasskeyFailed(PasskeyAnalytics$CreateFailureType.AUTH_FINISH_FAILED, DerivedSize.Companion.passkeyErrorMessage(((ApiResult.Failure.NetworkFailure) apiResult2).error), null);
                            return error;
                        }
                        if (!(apiResult2 instanceof ApiResult.Failure.HttpFailure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        ApiResult.Failure.HttpFailure httpFailure = (ApiResult.Failure.HttpFailure) apiResult2;
                        realPasskeyAnalytics.trackCreatePasskeyFailed(PasskeyAnalytics$CreateFailureType.AUTH_FINISH_FAILED, httpFailure.errorBody, new Integer(httpFailure.code));
                        return error;
                    }
                    startWebAuthnRegistrationResponse = realPasskeyRepository$registerPasskey$1.L$2;
                    str2 = realPasskeyRepository$registerPasskey$1.L$1;
                    clientScenario2 = realPasskeyRepository$registerPasskey$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    passkeyCredentialCreator$CredentialCreationResult = (PasskeyCredentialCreator$CredentialCreationResult) obj;
                    if (!Intrinsics.areEqual(passkeyCredentialCreator$CredentialCreationResult, PasskeyCredentialCreator$CredentialCreationResult.Cancelled.INSTANCE)) {
                        analytics.track(new PasskeyCreateCancelled(), null);
                        return PasskeyRepository$PasskeyRegistrationResult.Cancelled.INSTANCE;
                    }
                    if (passkeyCredentialCreator$CredentialCreationResult instanceof PasskeyCredentialCreator$CredentialCreationResult.DuplicateCredentialOnDevice) {
                        realPasskeyAnalytics.trackCreatePasskeyFailed(PasskeyAnalytics$CreateFailureType.DEVICE_CREDENTIAL_DUPLICATE, ((PasskeyCredentialCreator$CredentialCreationResult.DuplicateCredentialOnDevice) passkeyCredentialCreator$CredentialCreationResult).getErrorMessage(), null);
                        return PasskeyRepository$PasskeyRegistrationResult.DuplicateCredentialOnDevice.INSTANCE;
                    }
                    if (passkeyCredentialCreator$CredentialCreationResult instanceof PasskeyCredentialCreator$CredentialCreationResult.DeviceNotSupported) {
                        realPasskeyAnalytics.trackCreatePasskeyFailed(PasskeyAnalytics$CreateFailureType.DEVICE_NOT_SUPPORTED, ((PasskeyCredentialCreator$CredentialCreationResult.DeviceNotSupported) passkeyCredentialCreator$CredentialCreationResult).getErrorMessage(), null);
                        return PasskeyRepository$PasskeyRegistrationResult.DeviceNotSupported.INSTANCE;
                    }
                    if (passkeyCredentialCreator$CredentialCreationResult instanceof PasskeyCredentialCreator$CredentialCreationResult.Error) {
                        realPasskeyAnalytics.trackCreatePasskeyFailed(PasskeyAnalytics$CreateFailureType.DEVICE_CREDENTIAL_FAILED, ((PasskeyCredentialCreator$CredentialCreationResult.Error) passkeyCredentialCreator$CredentialCreationResult).getErrorMessage(), null);
                        return error;
                    }
                    if (!(passkeyCredentialCreator$CredentialCreationResult instanceof PasskeyCredentialCreator$CredentialCreationResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    FinishWebAuthnRegistrationRequest finishWebAuthnRegistrationRequest = new FinishWebAuthnRegistrationRequest(startWebAuthnRegistrationResponse.request_id, null, ((PasskeyCredentialCreator$CredentialCreationResult.Success) passkeyCredentialCreator$CredentialCreationResult).m3685unboximpl(), null, null, null, null, null, ByteString.EMPTY);
                    realPasskeyRepository$registerPasskey$1.L$0 = null;
                    realPasskeyRepository$registerPasskey$1.L$1 = null;
                    realPasskeyRepository$registerPasskey$1.L$2 = null;
                    realPasskeyRepository$registerPasskey$1.label = 3;
                    obj = webAuthnService.finishWebAuthnRegistration(clientScenario2, str2, finishWebAuthnRegistrationRequest, realPasskeyRepository$registerPasskey$1);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
                        realPasskeyAnalytics.trackCreatePasskeyFailed(PasskeyAnalytics$CreateFailureType.AUTH_START_FAILED, DerivedSize.Companion.passkeyErrorMessage(((ApiResult.Failure.NetworkFailure) apiResult).error), null);
                        return error;
                    }
                    if (!(apiResult instanceof ApiResult.Failure.HttpFailure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ApiResult.Failure.HttpFailure httpFailure2 = (ApiResult.Failure.HttpFailure) apiResult;
                    realPasskeyAnalytics.trackCreatePasskeyFailed(PasskeyAnalytics$CreateFailureType.AUTH_START_FAILED, httpFailure2.errorBody, new Integer(httpFailure2.code));
                    return error;
                }
                StartWebAuthnRegistrationResponse startWebAuthnRegistrationResponse2 = (StartWebAuthnRegistrationResponse) ((ApiResult.Success) apiResult).response;
                String str5 = startWebAuthnRegistrationResponse2.options;
                String str6 = startWebAuthnRegistrationResponse2.relying_party_identifier;
                if (str5 == null || str6 == null) {
                    String str7 = "Missing required fields from start WebAuthn registration response: options=" + (str5 != null) + ", relyingPartyId=" + (str6 != null);
                    Timber.Forest.e("[Passkey]: ".concat(str7), new Object[0]);
                    realPasskeyAnalytics.trackCreatePasskeyFailed(PasskeyAnalytics$CreateFailureType.AUTH_START_INVALID, str7, null);
                    return error;
                }
                realPasskeyRepository$registerPasskey$1.L$0 = clientScenario3;
                realPasskeyRepository$registerPasskey$1.L$1 = str3;
                realPasskeyRepository$registerPasskey$1.L$2 = startWebAuthnRegistrationResponse2;
                realPasskeyRepository$registerPasskey$1.label = 2;
                Object createCredential = this.passkeyCreator.createCredential(str5, realPasskeyRepository$registerPasskey$1);
                if (createCredential != coroutineSingletons) {
                    obj = createCredential;
                    startWebAuthnRegistrationResponse = startWebAuthnRegistrationResponse2;
                    String str8 = str3;
                    clientScenario2 = clientScenario3;
                    str2 = str8;
                    passkeyCredentialCreator$CredentialCreationResult = (PasskeyCredentialCreator$CredentialCreationResult) obj;
                    if (!Intrinsics.areEqual(passkeyCredentialCreator$CredentialCreationResult, PasskeyCredentialCreator$CredentialCreationResult.Cancelled.INSTANCE)) {
                    }
                }
                return coroutineSingletons;
            }
        }
        realPasskeyRepository$registerPasskey$1 = new RealPasskeyRepository$registerPasskey$1(this, continuationImpl);
        Object obj2 = realPasskeyRepository$registerPasskey$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPasskeyRepository$registerPasskey$1.label;
        WebAuthnService webAuthnService2 = this.webAuthnService;
        PasskeyRepository$PasskeyRegistrationResult.Error error2 = PasskeyRepository$PasskeyRegistrationResult.Error.INSTANCE;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    public final void reportAuthenticationFailure(String str, PasskeyRepository$LoginIdentifier passkeyRepository$LoginIdentifier) {
        String str2;
        if (passkeyRepository$LoginIdentifier instanceof PasskeyRepository$LoginIdentifier.AccountToken) {
            str2 = "AccountToken";
        } else if (passkeyRepository$LoginIdentifier instanceof PasskeyRepository$LoginIdentifier.SmsNumber) {
            str2 = "SmsNumber";
        } else if (passkeyRepository$LoginIdentifier instanceof PasskeyRepository$LoginIdentifier.Email) {
            str2 = "Email";
        } else {
            if (!Intrinsics.areEqual(passkeyRepository$LoginIdentifier, PasskeyRepository$LoginIdentifier.Discoverable.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            str2 = "Discoverable";
        }
        this.errorReporter.report(new PasskeyError(CameraSelector$$ExternalSyntheticOutline0.m("Passkey authentication failed at ", str, " for ", str2)), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
    }

    /* loaded from: classes6.dex */
    public final class PasskeyAuthenticationAttempt {
        public final boolean cancelled;
        public final PasskeyRepository$PasskeyAuthenticationResult result;
        public final boolean started;

        public /* synthetic */ PasskeyAuthenticationAttempt(PasskeyRepository$PasskeyAuthenticationResult passkeyRepository$PasskeyAuthenticationResult, int i) {
            this(passkeyRepository$PasskeyAuthenticationResult, (i & 2) == 0, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyAuthenticationAttempt)) {
                return false;
            }
            PasskeyAuthenticationAttempt passkeyAuthenticationAttempt = (PasskeyAuthenticationAttempt) obj;
            return Intrinsics.areEqual(this.result, passkeyAuthenticationAttempt.result) && this.started == passkeyAuthenticationAttempt.started && this.cancelled == passkeyAuthenticationAttempt.cancelled;
        }

        public final boolean getCancelled() {
            return this.cancelled;
        }

        public final PasskeyRepository$PasskeyAuthenticationResult getResult() {
            return this.result;
        }

        public final boolean getStarted() {
            return this.started;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.cancelled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.result.hashCode() * 31, 31, this.started);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PasskeyAuthenticationAttempt(result=");
            sb.append(this.result);
            sb.append(", started=");
            sb.append(this.started);
            sb.append(", cancelled=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.cancelled, ")");
        }

        public PasskeyAuthenticationAttempt(PasskeyRepository$PasskeyAuthenticationResult passkeyRepository$PasskeyAuthenticationResult, boolean z, boolean z2) {
            this.result = passkeyRepository$PasskeyAuthenticationResult;
            this.started = z;
            this.cancelled = z2;
        }
    }
}
