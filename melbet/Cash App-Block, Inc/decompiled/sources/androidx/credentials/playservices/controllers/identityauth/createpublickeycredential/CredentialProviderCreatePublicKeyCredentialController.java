package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.CreatePublicKeyCredentialResponse;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.domerrors.DataError;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility;
import androidx.navigation.Navigator$$ExternalSyntheticLambda0;
import app.cash.trifle.Trifle;
import coil3.size.SizeKt;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.Fido2ApiClient;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.internal.fido.zzgu;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.zzb;
import com.google.android.gms.tasks.zzw;
import com.google.android.play.core.review.zzc;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class CredentialProviderCreatePublicKeyCredentialController extends CredentialProviderController {
    public CredentialManagerCallback callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final zzc resultReceiver;

    public CredentialProviderCreatePublicKeyCredentialController(Context context) {
        context.getClass();
        this.context = context;
        this.resultReceiver = new zzc(this, new Handler(Looper.getMainLooper()), 2);
    }

    public static CreatePublicKeyCredentialResponse convertResponseToCredentialManager(PublicKeyCredential publicKeyCredential) {
        JSONObject jSONObject;
        try {
            AuthenticatorErrorResponse authenticatorErrorResponse = publicKeyCredential.zzf;
            zzgu zzguVar = publicKeyCredential.zzc;
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (zzguVar != null && zzguVar.zzm().length > 0) {
                    jSONObject2.put("rawId", SizeKt.encodeUrlSafeNoPadding(zzguVar.zzm()));
                }
                String str = publicKeyCredential.zzh;
                if (str != null) {
                    jSONObject2.put("authenticatorAttachment", str);
                }
                String str2 = publicKeyCredential.zzb;
                if (str2 != null && authenticatorErrorResponse == null) {
                    jSONObject2.put("type", str2);
                }
                String str3 = publicKeyCredential.zza;
                if (str3 != null) {
                    jSONObject2.put("id", str3);
                }
                String str4 = "response";
                AuthenticatorAssertionResponse authenticatorAssertionResponse = publicKeyCredential.zze;
                boolean z = true;
                if (authenticatorAssertionResponse != null) {
                    jSONObject = authenticatorAssertionResponse.zza();
                } else {
                    AuthenticatorAttestationResponse authenticatorAttestationResponse = publicKeyCredential.zzd;
                    if (authenticatorAttestationResponse != null) {
                        jSONObject = authenticatorAttestationResponse.zza();
                    } else {
                        z = false;
                        if (authenticatorErrorResponse != null) {
                            try {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("code", authenticatorErrorResponse.zza.zzb);
                                String str5 = authenticatorErrorResponse.zzb;
                                if (str5 != null) {
                                    jSONObject3.put("message", str5);
                                }
                                str4 = BreadcrumbHelper.Category.ERROR;
                                jSONObject = jSONObject3;
                            } catch (JSONException e) {
                                throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e);
                            }
                        } else {
                            jSONObject = null;
                        }
                    }
                }
                if (jSONObject != null) {
                    jSONObject2.put(str4, jSONObject);
                }
                AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = publicKeyCredential.zzg;
                if (authenticationExtensionsClientOutputs != null) {
                    jSONObject2.put("clientExtensionResults", authenticationExtensionsClientOutputs.zza());
                } else if (z) {
                    jSONObject2.put("clientExtensionResults", new JSONObject());
                }
                String jSONObject4 = jSONObject2.toString();
                jSONObject4.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", jSONObject4);
                return new CreatePublicKeyCredentialResponse(bundle, jSONObject4);
            } catch (JSONException e2) {
                throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e2);
            }
        } catch (Throwable th) {
            throw new CreateCredentialUnknownException("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PublicKeyCredentialCreationOptions convertRequestToPlayServices(CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest) {
        AuthenticationExtensions authenticationExtensions;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria;
        AuthenticationExtensions authenticationExtensions2;
        JSONArray jSONArray;
        String str;
        ArrayList arrayList;
        createPublicKeyCredentialRequest.getClass();
        LinkedHashMap linkedHashMap = PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
        String str2 = createPublicKeyCredentialRequest.requestJson;
        Context context = this.context;
        context.getClass();
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
            packageInfo.getClass();
            if (packageInfo.getLongVersionCode() > 241217000) {
                return new PublicKeyCredentialCreationOptions(str2);
            }
        }
        JSONObject jSONObject = new JSONObject(str2);
        byte[] challenge = PublicKeyCredentialControllerUtility.Companion.getChallenge(jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("user");
        String str3 = "id";
        String string2 = jSONObject2.getString("id");
        string2.getClass();
        int i = 11;
        byte[] decode = Base64.decode(string2, 11);
        decode.getClass();
        String string3 = jSONObject2.getString("name");
        String string4 = jSONObject2.getString("displayName");
        String optString = jSONObject2.optString("icon", "");
        string4.getClass();
        if (string4.length() == 0) {
            throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
        }
        if (decode.length == 0) {
            throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
        }
        string3.getClass();
        if (string3.length() == 0) {
            throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = new PublicKeyCredentialUserEntity(string3, optString, string4, decode);
        JSONObject jSONObject3 = jSONObject.getJSONObject("rp");
        String string5 = jSONObject3.getString("id");
        String optString2 = jSONObject3.optString("name", "");
        String optString3 = jSONObject3.optString("icon", "");
        optString3.getClass();
        if (optString3.length() == 0) {
            optString3 = null;
        }
        optString2.getClass();
        if (optString2.length() == 0) {
            throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
        }
        string5.getClass();
        if (string5.length() == 0) {
            throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = new PublicKeyCredentialRpEntity(string5, optString2, optString3);
        JSONArray jSONArray2 = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList2 = new ArrayList();
        int length = jSONArray2.length();
        int i2 = 0;
        while (i2 < length) {
            JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
            LinkedHashMap linkedHashMap2 = PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
            int i3 = i2;
            int i4 = (int) jSONObject4.getLong("alg");
            String optString4 = jSONObject4.optString("type", "");
            optString4.getClass();
            if (optString4.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
            }
            try {
                COSEAlgorithmIdentifier.fromCoseValue(i4);
                arrayList2.add(new PublicKeyCredentialParameters(optString4, i4));
            } catch (Throwable unused) {
            }
            i2 = i3 + 1;
        }
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap3 = PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("excludeCredentials");
            int length2 = jSONArray3.length();
            int i5 = 0;
            while (i5 < length2) {
                JSONObject jSONObject5 = jSONArray3.getJSONObject(i5);
                LinkedHashMap linkedHashMap4 = PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
                String string6 = jSONObject5.getString(str3);
                string6.getClass();
                byte[] decode2 = Base64.decode(string6, i);
                decode2.getClass();
                String string7 = jSONObject5.getString("type");
                string7.getClass();
                if (string7.length() == 0) {
                    throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                }
                if (decode2.length == 0) {
                    throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                }
                if (jSONObject5.has("transports")) {
                    jSONArray = jSONArray3;
                    arrayList = new ArrayList();
                    JSONArray jSONArray4 = jSONObject5.getJSONArray("transports");
                    int length3 = jSONArray4.length();
                    str = str3;
                    int i6 = 0;
                    while (i6 < length3) {
                        try {
                            int i7 = i6;
                            arrayList.add(Transport.fromString(jSONArray4.getString(i6)));
                            i6 = i7 + 1;
                        } catch (Transport.UnsupportedTransportException e) {
                            throw new CreatePublicKeyCredentialDomException(new DataError(4), e.getMessage());
                        }
                    }
                } else {
                    jSONArray = jSONArray3;
                    str = str3;
                    arrayList = null;
                }
                arrayList3.add(new PublicKeyCredentialDescriptor(string7, decode2, arrayList));
                i5++;
                jSONArray3 = jSONArray;
                str3 = str;
                i = 11;
            }
        }
        LinkedHashMap linkedHashMap5 = PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
        String optString5 = jSONObject.optString("attestation", "none");
        optString5.getClass();
        AttestationConveyancePreference fromString = AttestationConveyancePreference.fromString(optString5.length() != 0 ? optString5 : "none");
        Double valueOf = jSONObject.has("timeout") ? Double.valueOf(jSONObject.getLong("timeout") / 1000.0d) : null;
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject6 = jSONObject.getJSONObject("authenticatorSelection");
            boolean optBoolean = jSONObject6.optBoolean("requireResidentKey", false);
            String optString6 = jSONObject6.optString("residentKey", "");
            optString6.getClass();
            ResidentKeyRequirement fromString2 = optString6.length() > 0 ? ResidentKeyRequirement.fromString(optString6) : null;
            Boolean valueOf2 = Boolean.valueOf(optBoolean);
            String optString7 = jSONObject6.optString("authenticatorAttachment", "");
            optString7.getClass();
            Attachment fromString3 = optString7.length() > 0 ? Attachment.fromString(optString7) : null;
            authenticationExtensions = null;
            authenticatorSelectionCriteria = new AuthenticatorSelectionCriteria(valueOf2, fromString3 == null ? null : fromString3.zzb, null, fromString2 == null ? null : fromString2.zzb);
        } else {
            authenticationExtensions = null;
            authenticatorSelectionCriteria = null;
        }
        if (jSONObject.has("extensions")) {
            JSONObject jSONObject7 = jSONObject.getJSONObject("extensions");
            String optString8 = jSONObject7.optString(AppsFlyerProperties.APP_ID, "");
            optString8.getClass();
            authenticationExtensions2 = new AuthenticationExtensions(optString8.length() > 0 ? new FidoAppIdExtension(optString8) : authenticationExtensions, null, jSONObject7.optBoolean("uvm", false) ? new UserVerificationMethodExtension(true) : authenticationExtensions, null, null, null, null, null, jSONObject7.optBoolean("thirdPartyPayment", false) ? new GoogleThirdPartyPaymentExtension(true) : authenticationExtensions, null, null, null);
        } else {
            authenticationExtensions2 = authenticationExtensions;
        }
        return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, challenge, arrayList2, valueOf, arrayList3, authenticatorSelectionCriteria, null, null, fromString.zzb, authenticationExtensions2, null, null);
    }

    public final void invokePlayServices(CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest, CredentialManagerCallback credentialManagerCallback, Executor executor, CancellationSignal cancellationSignal) {
        createPublicKeyCredentialRequest.getClass();
        credentialManagerCallback.getClass();
        executor.getClass();
        this.cancellationSignal = cancellationSignal;
        this.callback = credentialManagerCallback;
        this.executor = executor;
        try {
            PublicKeyCredentialCreationOptions convertRequestToPlayServices = convertRequestToPlayServices(createPublicKeyCredentialRequest);
            CredentialProviderPlayServicesImpl.INSTANCE.getClass();
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
                return;
            }
            Fido2ApiClient fido2ApiClient = new Fido2ApiClient(this.context, null, Fido2ApiClient.zzb, Api.ApiOptions.NO_OPTIONS, new GoogleApi.Settings(new Trifle(10), Looper.getMainLooper()));
            zacn builder = zacn.builder();
            builder.zaa = new zzb(fido2ApiClient, convertRequestToPlayServices);
            builder.zac = 5407;
            zzw zae = fido2ApiClient.zae(0, builder.build());
            StreamSharing$$ExternalSyntheticLambda1 streamSharing$$ExternalSyntheticLambda1 = new StreamSharing$$ExternalSyntheticLambda1(new Navigator$$ExternalSyntheticLambda0(22, cancellationSignal, this), 24);
            zae.getClass();
            zae.addOnSuccessListener(TaskExecutors.MAIN_THREAD, streamSharing$$ExternalSyntheticLambda1);
            zae.addOnFailureListener(new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(10, this, cancellationSignal));
        } catch (JSONException e) {
            CredentialProviderPlayServicesImpl.INSTANCE.getClass();
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
                return;
            }
            Executor executor2 = this.executor;
            if (executor2 != null) {
                executor2.execute(new CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda5(this, e, 1));
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("executor");
                throw null;
            }
        } catch (Throwable th) {
            CredentialProviderPlayServicesImpl.INSTANCE.getClass();
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
                return;
            }
            Executor executor3 = this.executor;
            if (executor3 != null) {
                executor3.execute(new CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda7(this, th, 0));
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("executor");
                throw null;
            }
        }
    }
}
