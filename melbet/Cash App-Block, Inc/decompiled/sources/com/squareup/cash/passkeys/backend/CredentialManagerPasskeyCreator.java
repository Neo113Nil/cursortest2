package com.squareup.cash.passkeys.backend;

import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.CreatePublicKeyCredentialResponse;
import androidx.credentials.Credential;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.PublicKeyCredential;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialNoCreateOptionException;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.exceptions.domerrors.InvalidStateError;
import androidx.credentials.exceptions.domerrors.NotAllowedError;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.room.RoomDatabase$performClear$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagk;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.passkeys.backend.PasskeyCredentialCreator$CredentialCreationResult;
import com.squareup.cash.passkeys.backend.PasskeyCredentialCreator$FetchCredentialResult;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONArray;
import org.json.JSONObject;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class CredentialManagerPasskeyCreator {
    public final CredentialManagerBindingContainer$provideCredentialManagerWrapper$1 credentialManagerWrapper;
    public final ErrorReporter errorReporter;

    public CredentialManagerPasskeyCreator(CredentialManagerBindingContainer$provideCredentialManagerWrapper$1 credentialManagerBindingContainer$provideCredentialManagerWrapper$1, ErrorReporter errorReporter) {
        this.credentialManagerWrapper = credentialManagerBindingContainer$provideCredentialManagerWrapper$1;
        this.errorReporter = errorReporter;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057 A[Catch: Exception -> 0x0031, CreateCredentialException -> 0x0033, CreatePublicKeyCredentialDomException -> 0x0035, CreateCredentialNoCreateOptionException -> 0x00d3, CreateCredentialUnsupportedException -> 0x00de, CreateCredentialCancellationException -> 0x00e8, TryCatch #2 {CreateCredentialCancellationException -> 0x00e8, CreateCredentialNoCreateOptionException -> 0x00d3, CreateCredentialUnsupportedException -> 0x00de, CreatePublicKeyCredentialDomException -> 0x0035, CreateCredentialException -> 0x0033, Exception -> 0x0031, blocks: (B:10:0x002d, B:11:0x0051, B:13:0x0057, B:16:0x0065, B:21:0x0041), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[Catch: Exception -> 0x0031, CreateCredentialException -> 0x0033, CreatePublicKeyCredentialDomException -> 0x0035, CreateCredentialNoCreateOptionException -> 0x00d3, CreateCredentialUnsupportedException -> 0x00de, CreateCredentialCancellationException -> 0x00e8, TRY_LEAVE, TryCatch #2 {CreateCredentialCancellationException -> 0x00e8, CreateCredentialNoCreateOptionException -> 0x00d3, CreateCredentialUnsupportedException -> 0x00de, CreatePublicKeyCredentialDomException -> 0x0035, CreateCredentialException -> 0x0033, Exception -> 0x0031, blocks: (B:10:0x002d, B:11:0x0051, B:13:0x0057, B:16:0x0065, B:21:0x0041), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createCredential(String str, ContinuationImpl continuationImpl) {
        CredentialManagerPasskeyCreator$createCredential$1 credentialManagerPasskeyCreator$createCredential$1;
        int i;
        ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy;
        PasskeyCredentialCreator$CredentialCreationResult.Cancelled cancelled;
        ErrorReporter errorReporter;
        String analyticsMessage;
        String analyticsMessage2;
        String analyticsMessage3;
        String analyticsMessage4;
        CreateCredentialResponse createCredentialResponse;
        try {
            if (continuationImpl instanceof CredentialManagerPasskeyCreator$createCredential$1) {
                credentialManagerPasskeyCreator$createCredential$1 = (CredentialManagerPasskeyCreator$createCredential$1) continuationImpl;
                int i2 = credentialManagerPasskeyCreator$createCredential$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    credentialManagerPasskeyCreator$createCredential$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = credentialManagerPasskeyCreator$createCredential$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = credentialManagerPasskeyCreator$createCredential$1.label;
                    defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                    cancelled = PasskeyCredentialCreator$CredentialCreationResult.Cancelled.INSTANCE;
                    errorReporter = this.errorReporter;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest = new CreatePublicKeyCredentialRequest(str);
                        CredentialManagerBindingContainer$provideCredentialManagerWrapper$1 credentialManagerBindingContainer$provideCredentialManagerWrapper$1 = this.credentialManagerWrapper;
                        credentialManagerPasskeyCreator$createCredential$1.label = 1;
                        obj = credentialManagerBindingContainer$provideCredentialManagerWrapper$1.createCredential(createPublicKeyCredentialRequest, credentialManagerPasskeyCreator$createCredential$1);
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
                    createCredentialResponse = (CreateCredentialResponse) obj;
                    if (createCredentialResponse instanceof CreatePublicKeyCredentialResponse) {
                        String concat = "Unexpected credential response type: ".concat(createCredentialResponse.getClass().getSimpleName());
                        Timber.Forest.w(concat, new Object[0]);
                        return new PasskeyCredentialCreator$CredentialCreationResult.Error(concat);
                    }
                    String registrationResponseJson = ((CreatePublicKeyCredentialResponse) createCredentialResponse).getRegistrationResponseJson();
                    PasskeyCredentialCreator$CredentialCreationResult.Success.m3684constructorimpl(registrationResponseJson);
                    return PasskeyCredentialCreator$CredentialCreationResult.Success.m3683boximpl(registrationResponseJson);
                }
            }
            if (i != 0) {
            }
            createCredentialResponse = (CreateCredentialResponse) obj;
            if (createCredentialResponse instanceof CreatePublicKeyCredentialResponse) {
            }
        } catch (CreateCredentialCancellationException unused) {
            return cancelled;
        } catch (CreateCredentialNoCreateOptionException e) {
            analyticsMessage4 = zzagk.analyticsMessage(e, true);
            return new PasskeyCredentialCreator$CredentialCreationResult.DeviceNotSupported(analyticsMessage4);
        } catch (CreateCredentialUnsupportedException e2) {
            analyticsMessage3 = zzagk.analyticsMessage(e2, true);
            return new PasskeyCredentialCreator$CredentialCreationResult.DeviceNotSupported(analyticsMessage3);
        } catch (CreatePublicKeyCredentialDomException e3) {
            if (e3.domError instanceof InvalidStateError) {
                return new PasskeyCredentialCreator$CredentialCreationResult.DuplicateCredentialOnDevice(zzagk.access$analyticsMessage(e3));
            }
            if (zzagk.access$isCancelledByUser(e3)) {
                return cancelled;
            }
            errorReporter.report(new PasskeyError("Error creating credential", e3), defaultSamplingStrategy);
            return new PasskeyCredentialCreator$CredentialCreationResult.Error(zzagk.access$analyticsMessage(e3));
        } catch (CreateCredentialException e4) {
            errorReporter.report(new PasskeyError("Error creating credential", e4), defaultSamplingStrategy);
            analyticsMessage2 = zzagk.analyticsMessage(e4, true);
            return new PasskeyCredentialCreator$CredentialCreationResult.Error(analyticsMessage2);
        } catch (Exception e5) {
            if (e5 instanceof CancellationException) {
                throw e5;
            }
            errorReporter.report(new PasskeyError("Unexpected error creating credential", e5), defaultSamplingStrategy);
            analyticsMessage = zzagk.analyticsMessage(e5, false);
            return new PasskeyCredentialCreator$CredentialCreationResult.Error(analyticsMessage);
        }
        credentialManagerPasskeyCreator$createCredential$1 = new CredentialManagerPasskeyCreator$createCredential$1(this, continuationImpl);
        Object obj2 = credentialManagerPasskeyCreator$createCredential$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = credentialManagerPasskeyCreator$createCredential$1.label;
        defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
        cancelled = PasskeyCredentialCreator$CredentialCreationResult.Cancelled.INSTANCE;
        errorReporter = this.errorReporter;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|8|(1:(2:11|12)(2:55|56))(7:57|(9:66|67|68|69|70|71|(1:73)|74|(1:78))(1:59)|60|61|62|63|(1:65))|13|15|(4:17|18|19|20)(2:44|(2:46|47)(3:48|30|31))))|94|6|7|8|(0)(0)|13|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ba, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bb, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b9, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b7, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0046, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0047, code lost:
    
        r1 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0042, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0043, code lost:
    
        r1 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x003e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x003f, code lost:
    
        r1 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a9 A[Catch: Exception -> 0x00bc, GetCredentialException -> 0x00c0, GetPublicKeyCredentialDomException -> 0x00c4, GetCredentialProviderConfigurationException | GetCredentialUnsupportedException | NoCredentialException -> 0x0127, GetCredentialProviderConfigurationException | GetCredentialUnsupportedException | NoCredentialException -> 0x0127, GetCredentialProviderConfigurationException | GetCredentialUnsupportedException | NoCredentialException -> 0x0127, GetCredentialCancellationException -> 0x0128, TRY_LEAVE, TryCatch #10 {GetCredentialProviderConfigurationException | GetCredentialUnsupportedException | NoCredentialException -> 0x0127, blocks: (B:11:0x0037, B:13:0x00a5, B:13:0x00a5, B:13:0x00a5, B:17:0x00a9, B:17:0x00a9, B:17:0x00a9, B:19:0x00b2, B:19:0x00b2, B:19:0x00b2, B:44:0x00c8, B:44:0x00c8, B:44:0x00c8, B:46:0x00d2, B:46:0x00d2, B:46:0x00d2, B:48:0x00e1, B:48:0x00e1, B:48:0x00e1, B:60:0x0086, B:60:0x0086, B:60:0x0086, B:63:0x008e, B:63:0x008e, B:63:0x008e), top: B:8:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8 A[Catch: Exception -> 0x00b6, GetCredentialException -> 0x00b8, GetPublicKeyCredentialDomException -> 0x00ba, GetCredentialProviderConfigurationException | GetCredentialUnsupportedException | NoCredentialException -> 0x0127, GetCredentialProviderConfigurationException | GetCredentialUnsupportedException | NoCredentialException -> 0x0127, GetCredentialProviderConfigurationException | GetCredentialUnsupportedException | NoCredentialException -> 0x0127, GetCredentialCancellationException -> 0x0128, TryCatch #10 {GetCredentialProviderConfigurationException | GetCredentialUnsupportedException | NoCredentialException -> 0x0127, blocks: (B:11:0x0037, B:13:0x00a5, B:13:0x00a5, B:13:0x00a5, B:17:0x00a9, B:17:0x00a9, B:17:0x00a9, B:19:0x00b2, B:19:0x00b2, B:19:0x00b2, B:44:0x00c8, B:44:0x00c8, B:44:0x00c8, B:46:0x00d2, B:46:0x00d2, B:46:0x00d2, B:48:0x00e1, B:48:0x00e1, B:48:0x00e1, B:60:0x0086, B:60:0x0086, B:60:0x0086, B:63:0x008e, B:63:0x008e, B:63:0x008e), top: B:8:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0078  */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getCredential(String str, boolean z, ContinuationImpl continuationImpl) {
        CredentialManagerPasskeyCreator$getCredential$1 credentialManagerPasskeyCreator$getCredential$1;
        int i;
        PasskeyCredentialCreator$FetchCredentialResult.Cancelled cancelled;
        PasskeyCredentialCreator$FetchCredentialResult.NoCredentials noCredentials;
        String str2;
        Object failure;
        JSONArray jSONArray;
        ErrorReporter errorReporter;
        ?? r1;
        GetCredentialResponse getCredentialResponse;
        CredentialManagerPasskeyCreator credentialManagerPasskeyCreator = this;
        try {
            try {
                if (continuationImpl instanceof CredentialManagerPasskeyCreator$getCredential$1) {
                    credentialManagerPasskeyCreator$getCredential$1 = (CredentialManagerPasskeyCreator$getCredential$1) continuationImpl;
                    int i2 = credentialManagerPasskeyCreator$getCredential$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        credentialManagerPasskeyCreator$getCredential$1.label = i2 - PKIFailureInfo.systemUnavail;
                        CredentialManagerPasskeyCreator$getCredential$1 credentialManagerPasskeyCreator$getCredential$12 = credentialManagerPasskeyCreator$getCredential$1;
                        Object obj = credentialManagerPasskeyCreator$getCredential$12.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = credentialManagerPasskeyCreator$getCredential$12.label;
                        ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                        cancelled = PasskeyCredentialCreator$FetchCredentialResult.Cancelled.INSTANCE;
                        ErrorReporter errorReporter2 = credentialManagerPasskeyCreator.errorReporter;
                        PasskeyCredentialCreator$FetchCredentialResult.Error error = PasskeyCredentialCreator$FetchCredentialResult.Error.INSTANCE;
                        noCredentials = PasskeyCredentialCreator$FetchCredentialResult.NoCredentials.INSTANCE;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            Continuation continuation = null;
                            if (z) {
                                str2 = str;
                            } else {
                                try {
                                    Result.Companion companion = Result.Companion;
                                    str2 = str;
                                    try {
                                        failure = new JSONObject(str2).optJSONArray("allowCredentials");
                                    } catch (Throwable th) {
                                        th = th;
                                        Result.Companion companion2 = Result.Companion;
                                        failure = new Result.Failure(th);
                                        if (failure instanceof Result.Failure) {
                                        }
                                        jSONArray = (JSONArray) failure;
                                        if (jSONArray != null) {
                                        }
                                        return noCredentials;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    str2 = str;
                                }
                                if (failure instanceof Result.Failure) {
                                    failure = null;
                                }
                                jSONArray = (JSONArray) failure;
                                if (jSONArray != null || jSONArray.length() == 0) {
                                    return noCredentials;
                                }
                            }
                            Duration.Companion companion3 = Duration.Companion;
                            errorReporter = errorReporter2;
                            try {
                                long duration = DurationKt.toDuration(60, DurationUnit.SECONDS);
                                RoomDatabase$performClear$1 roomDatabase$performClear$1 = new RoomDatabase$performClear$1(credentialManagerPasskeyCreator, str2, z, continuation, 11);
                                r1 = 1;
                                credentialManagerPasskeyCreator$getCredential$12.label = 1;
                                obj = JobKt.m4185withTimeoutOrNullKLykuaI(duration, roomDatabase$performClear$1, credentialManagerPasskeyCreator$getCredential$12);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } catch (GetPublicKeyCredentialDomException e) {
                                e = e;
                                ErrorReporter errorReporter3 = errorReporter;
                                if (!zzagk.access$isCancelledByUser(e)) {
                                    return cancelled;
                                }
                                if (!(e.domError instanceof NotAllowedError)) {
                                    errorReporter3.report(new PasskeyError("Error getting credential", e), defaultSamplingStrategy);
                                    return error;
                                }
                                return noCredentials;
                            } catch (GetCredentialException e2) {
                                e = e2;
                                ErrorReporter errorReporter4 = errorReporter;
                                errorReporter4.report(new PasskeyError("Error getting credential", e), defaultSamplingStrategy);
                                return error;
                            } catch (Exception e3) {
                                e = e3;
                                ErrorReporter errorReporter5 = errorReporter;
                                if (!(e instanceof CancellationException)) {
                                    throw e;
                                }
                                errorReporter5.report(new PasskeyError("Unexpected error getting credential", e), defaultSamplingStrategy);
                                return error;
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            errorReporter = errorReporter2;
                            r1 = credentialManagerPasskeyCreator;
                        }
                        getCredentialResponse = (GetCredentialResponse) obj;
                        if (getCredentialResponse != null) {
                            errorReporter.report(new PasskeyError("Timed out getting credential"), defaultSamplingStrategy);
                            return error;
                        }
                        Credential credential = getCredentialResponse.getCredential();
                        if (!(credential instanceof PublicKeyCredential)) {
                            Timber.Forest.w("Unexpected credential type: ".concat(credential.getClass().getSimpleName()), new Object[0]);
                            return error;
                        }
                        String authenticationResponseJson = ((PublicKeyCredential) credential).getAuthenticationResponseJson();
                        PasskeyCredentialCreator$FetchCredentialResult.Success.m3687constructorimpl(authenticationResponseJson);
                        return PasskeyCredentialCreator$FetchCredentialResult.Success.m3686boximpl(authenticationResponseJson);
                    }
                }
                if (i != 0) {
                }
                getCredentialResponse = (GetCredentialResponse) obj;
                if (getCredentialResponse != null) {
                }
            } catch (GetCredentialProviderConfigurationException | GetCredentialUnsupportedException | NoCredentialException unused) {
                return noCredentials;
            }
        } catch (GetCredentialCancellationException unused2) {
            return cancelled;
        }
        credentialManagerPasskeyCreator$getCredential$1 = new CredentialManagerPasskeyCreator$getCredential$1(credentialManagerPasskeyCreator, continuationImpl);
        CredentialManagerPasskeyCreator$getCredential$1 credentialManagerPasskeyCreator$getCredential$122 = credentialManagerPasskeyCreator$getCredential$1;
        Object obj2 = credentialManagerPasskeyCreator$getCredential$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = credentialManagerPasskeyCreator$getCredential$122.label;
        ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy2 = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
        cancelled = PasskeyCredentialCreator$FetchCredentialResult.Cancelled.INSTANCE;
        ErrorReporter errorReporter22 = credentialManagerPasskeyCreator.errorReporter;
        PasskeyCredentialCreator$FetchCredentialResult.Error error2 = PasskeyCredentialCreator$FetchCredentialResult.Error.INSTANCE;
        noCredentials = PasskeyCredentialCreator$FetchCredentialResult.NoCredentials.INSTANCE;
    }
}
