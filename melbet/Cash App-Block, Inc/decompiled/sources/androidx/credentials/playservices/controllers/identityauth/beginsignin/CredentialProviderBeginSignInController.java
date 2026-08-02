package androidx.credentials.playservices.controllers.identityauth.beginsignin;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.credentials.Credential;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.CredentialOption;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.GetPublicKeyCredentialOption;
import androidx.credentials.RestoreCredential;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.domerrors.DataError;
import androidx.credentials.exceptions.domerrors.DomError;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility;
import androidx.navigation.Navigator$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import com.fillr.n;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.internal.fido.zzgu;
import com.google.android.gms.internal.p000authapi.zbaq;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.zzw;
import com.google.android.libraries.identity.googleid.GoogleIdTokenCredential;
import com.google.android.play.core.review.zzc;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class CredentialProviderBeginSignInController extends CredentialProviderController {
    public CredentialManagerCallback callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final zzc resultReceiver;

    public CredentialProviderBeginSignInController(Context context) {
        context.getClass();
        this.context = context;
        this.resultReceiver = new zzc(this, new Handler(Looper.getMainLooper()), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final GetCredentialResponse convertResponseToCredentialManager(SignInCredential signInCredential) {
        Credential credential;
        AuthenticatorErrorResponse authenticatorErrorResponse;
        String jSONObject;
        String str = signInCredential.zbf;
        PublicKeyCredential publicKeyCredential = signInCredential.zbi;
        String str2 = signInCredential.zbg;
        String str3 = signInCredential.zba;
        if (str != null) {
            str3.getClass();
            str.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str3);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str);
            credential = new RestoreCredential(bundle, str);
        } else {
            JSONObject jSONObject2 = null;
            if (str2 != null) {
                str3.getClass();
                String str4 = signInCredential.zbb;
                if (str4 == null) {
                    str4 = null;
                }
                String str5 = signInCredential.zbc;
                if (str5 == null) {
                    str5 = null;
                }
                String str6 = signInCredential.zbd;
                if (str6 == null) {
                    str6 = null;
                }
                String str7 = signInCredential.zbh;
                if (str7 == null) {
                    str7 = null;
                }
                Uri uri = signInCredential.zbe;
                if (uri == null) {
                    uri = null;
                }
                str3.getClass();
                str2.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str3);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str2);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str4);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str6);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str7);
                bundle2.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
                Credential googleIdTokenCredential = new GoogleIdTokenCredential(bundle2, "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL");
                if (str3.length() <= 0) {
                    a$$ExternalSyntheticBUOutline0.m$3("id should not be empty");
                    throw null;
                }
                if (str2.length() <= 0) {
                    a$$ExternalSyntheticBUOutline0.m$3("idToken should not be empty");
                    throw null;
                }
                credential = googleIdTokenCredential;
            } else if (publicKeyCredential != null) {
                AuthenticatorErrorResponse authenticatorErrorResponse2 = publicKeyCredential.zzf;
                AuthenticatorAssertionResponse authenticatorAssertionResponse = publicKeyCredential.zze;
                AuthenticatorAttestationResponse authenticatorAttestationResponse = publicKeyCredential.zzd;
                LinkedHashMap linkedHashMap = PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
                JSONObject jSONObject3 = new JSONObject();
                if (authenticatorAttestationResponse != 0) {
                    authenticatorErrorResponse = authenticatorAttestationResponse;
                } else if (authenticatorAssertionResponse != 0) {
                    authenticatorErrorResponse = authenticatorAssertionResponse;
                } else {
                    if (authenticatorErrorResponse2 == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("No response set.");
                        return null;
                    }
                    authenticatorErrorResponse = authenticatorErrorResponse2;
                }
                boolean z = true;
                if (authenticatorErrorResponse instanceof AuthenticatorErrorResponse) {
                    AuthenticatorErrorResponse authenticatorErrorResponse3 = authenticatorErrorResponse;
                    ErrorCode errorCode = authenticatorErrorResponse3.zza;
                    errorCode.getClass();
                    String str8 = authenticatorErrorResponse3.zzb;
                    DomError domError = (DomError) PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions.get(errorCode);
                    if (domError == null) {
                        throw new GetPublicKeyCredentialDomException(new DataError(24), Recorder$$ExternalSyntheticOutline2.m("unknown fido gms exception - ", str8));
                    }
                    if (errorCode == ErrorCode.NOT_ALLOWED_ERR && str8 != null && StringsKt.contains((CharSequence) str8, (CharSequence) "Unable to get sync account", false)) {
                        throw new GetCredentialCancellationException("Passkey retrieval was cancelled by the user.");
                    }
                    throw new GetPublicKeyCredentialDomException(domError, str8);
                }
                if (authenticatorErrorResponse instanceof AuthenticatorAssertionResponse) {
                    try {
                        zzgu zzguVar = publicKeyCredential.zzc;
                        try {
                            JSONObject jSONObject4 = new JSONObject();
                            if (zzguVar != null && zzguVar.zzm().length > 0) {
                                jSONObject4.put("rawId", SizeKt.encodeUrlSafeNoPadding(zzguVar.zzm()));
                            }
                            String str9 = publicKeyCredential.zzh;
                            if (str9 != null) {
                                jSONObject4.put("authenticatorAttachment", str9);
                            }
                            String str10 = publicKeyCredential.zzb;
                            if (str10 != null && authenticatorErrorResponse2 == null) {
                                jSONObject4.put("type", str10);
                            }
                            String str11 = publicKeyCredential.zza;
                            if (str11 != null) {
                                jSONObject4.put("id", str11);
                            }
                            String str12 = "response";
                            if (authenticatorAssertionResponse != 0) {
                                jSONObject2 = authenticatorAssertionResponse.zza();
                            } else if (authenticatorAttestationResponse != 0) {
                                jSONObject2 = authenticatorAttestationResponse.zza();
                            } else {
                                if (authenticatorErrorResponse2 != null) {
                                    try {
                                        jSONObject2 = new JSONObject();
                                        jSONObject2.put("code", authenticatorErrorResponse2.zza.zzb);
                                        String str13 = authenticatorErrorResponse2.zzb;
                                        if (str13 != null) {
                                            jSONObject2.put("message", str13);
                                        }
                                        str12 = BreadcrumbHelper.Category.ERROR;
                                    } catch (JSONException e) {
                                        throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e);
                                    }
                                }
                                z = false;
                            }
                            if (jSONObject2 != null) {
                                jSONObject4.put(str12, jSONObject2);
                            }
                            AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = publicKeyCredential.zzg;
                            if (authenticationExtensionsClientOutputs != null) {
                                jSONObject4.put("clientExtensionResults", authenticationExtensionsClientOutputs.zza());
                            } else if (z) {
                                jSONObject4.put("clientExtensionResults", new JSONObject());
                            }
                            jSONObject = jSONObject4.toString();
                            jSONObject.getClass();
                        } catch (JSONException e2) {
                            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e2);
                        }
                    } catch (Throwable th) {
                        throw new GetCredentialUnknownException("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage());
                    }
                } else {
                    Log.e("PublicKeyUtility", "AuthenticatorResponse expected assertion response but got: ".concat(authenticatorErrorResponse.getClass().getName()));
                    jSONObject = jSONObject3.toString();
                    jSONObject.getClass();
                }
                Bundle bundle3 = new Bundle();
                bundle3.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", jSONObject);
                credential = new androidx.credentials.PublicKeyCredential(bundle3, jSONObject);
            } else {
                Log.w("BeginSignIn", "Credential returned but no google Id or password or passkey found");
                credential = null;
            }
        }
        if (credential != null) {
            return new GetCredentialResponse(credential);
        }
        throw new GetCredentialUnknownException("When attempting to convert get response, null credential found");
    }

    public final CredentialManagerCallback getCallback() {
        CredentialManagerCallback credentialManagerCallback = this.callback;
        if (credentialManagerCallback != null) {
            return credentialManagerCallback;
        }
        Intrinsics.throwUninitializedPropertyAccessException("callback");
        throw null;
    }

    public final Executor getExecutor() {
        Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("executor");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.android.gms.common.Feature[], java.io.Serializable] */
    public final void invokePlayServices(GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback) {
        getCredentialRequest.getClass();
        credentialManagerCallback.getClass();
        executor.getClass();
        this.cancellationSignal = cancellationSignal;
        this.callback = credentialManagerCallback;
        this.executor = executor;
        CredentialProviderPlayServicesImpl.INSTANCE.getClass();
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        Context context = this.context;
        context.getClass();
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = new BeginSignInRequest.PasswordRequestOptions(false);
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = new BeginSignInRequest.GoogleIdTokenRequestOptions(false, null, null, true, null, null, false);
        BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = new BeginSignInRequest.PasskeysRequestOptions(null, false, null);
        BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = new BeginSignInRequest.PasskeyJsonRequestOptions(false, null);
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        long j = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions2 = passkeysRequestOptions;
        BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions2 = passkeyJsonRequestOptions;
        boolean z = false;
        for (CredentialOption credentialOption : getCredentialRequest.credentialOptions) {
            if ((credentialOption instanceof GetPublicKeyCredentialOption) && !z) {
                if (j >= 231815000) {
                    LinkedHashMap linkedHashMap = PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
                    passkeyJsonRequestOptions2 = new BeginSignInRequest.PasskeyJsonRequestOptions(true, ((GetPublicKeyCredentialOption) credentialOption).requestJson);
                } else {
                    LinkedHashMap linkedHashMap2 = PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
                    JSONObject jSONObject = new JSONObject(((GetPublicKeyCredentialOption) credentialOption).requestJson);
                    String optString = jSONObject.optString("rpId", "");
                    optString.getClass();
                    if (optString.length() == 0) {
                        throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
                    }
                    passkeysRequestOptions2 = new BeginSignInRequest.PasskeysRequestOptions(optString, true, PublicKeyCredentialControllerUtility.Companion.getChallenge(jSONObject));
                }
                z = true;
            }
        }
        boolean z2 = j > 241217000 ? getCredentialRequest.preferImmediatelyAvailableCredentials : false;
        zbaq signInClient = Identity.getSignInClient(context);
        new BeginSignInRequest.GoogleIdTokenRequestOptions(false, null, null, true, null, null, false);
        BeginSignInRequest beginSignInRequest = new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, signInClient.zbd, false, 0, passkeysRequestOptions2, passkeyJsonRequestOptions2, z2);
        zacn builder = zacn.builder();
        builder.zaa$1 = new Feature[]{new Feature("auth_api_credentials_begin_sign_in", 8L)};
        builder.zaa = new n.b(signInClient, beginSignInRequest);
        builder.zab = false;
        builder.zac = 1553;
        zzw zae = signInClient.zae(0, builder.build());
        StreamSharing$$ExternalSyntheticLambda1 streamSharing$$ExternalSyntheticLambda1 = new StreamSharing$$ExternalSyntheticLambda1(new Navigator$$ExternalSyntheticLambda0(21, cancellationSignal, this), 23);
        zae.getClass();
        zae.addOnSuccessListener(TaskExecutors.MAIN_THREAD, streamSharing$$ExternalSyntheticLambda1);
        zae.addOnFailureListener(new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(9, this, cancellationSignal));
    }
}
