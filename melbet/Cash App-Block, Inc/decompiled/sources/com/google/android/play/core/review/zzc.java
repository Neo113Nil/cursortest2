package com.google.android.play.core.review;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CreatePublicKeyCredentialResponse;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.domerrors.DataError;
import androidx.credentials.exceptions.domerrors.DomError;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController$Companion;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda6;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda1;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda10;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda5;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda7;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda6;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda7;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController;
import androidx.lifecycle.DispatchQueue$$ExternalSyntheticLambda0;
import androidx.media3.ui.PlayerView;
import androidx.paging.CachedPageEventFlow$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.internal.mlkit_genai_prompt.zzqu;
import com.google.android.gms.internal.p000authapi.zbaq;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.squareup.cash.pools.views.PoolInvitePeopleListViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.session.backend.DbSessionManagerKt;
import com.squareup.cash.sheet.SheetStateKt;
import com.squareup.cash.work.applets.views.WorkApplet$applet$1;
import com.stripe.android.financialconnections.utils.ErrorsKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class zzc extends ResultReceiver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.$r8$classId = 0;
        this.zza = taskCompletionSource;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        String m;
        boolean z;
        CreateCredentialException createCredentialException;
        String m2;
        boolean z2;
        String string2;
        Bundle bundle2;
        CreateCredentialResponse createFrom;
        CreateCredentialException jetpackCreateException;
        String m3;
        int i2 = this.$r8$classId;
        Object obj = this.zza;
        switch (i2) {
            case 0:
                ((TaskCompletionSource) obj).trySetResult(null);
                return;
            case 1:
                bundle.getClass();
                CredentialProviderBeginSignInController credentialProviderBeginSignInController = (CredentialProviderBeginSignInController) obj;
                if (CredentialProviderController.maybeReportErrorFromResultReceiver(bundle, new WorkApplet$applet$1(2, CredentialProviderController.Companion, CredentialProviderBaseController$Companion.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 2), credentialProviderBeginSignInController.getExecutor(), credentialProviderBeginSignInController.getCallback(), credentialProviderBeginSignInController.cancellationSignal)) {
                    return;
                }
                int i3 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) bundle.getParcelable("RESULT_DATA");
                int i4 = CredentialProviderController.CONTROLLER_REQUEST_CODE;
                if (i3 != i4) {
                    Log.w("BeginSignIn", "Returned request code " + i4 + " which  does not match what was given " + i3);
                    return;
                }
                CachedPageEventFlow$$ExternalSyntheticLambda0 cachedPageEventFlow$$ExternalSyntheticLambda0 = new CachedPageEventFlow$$ExternalSyntheticLambda0(credentialProviderBeginSignInController, 9);
                CancellationSignal cancellationSignal = credentialProviderBeginSignInController.cancellationSignal;
                int i5 = 2;
                if (i != -1) {
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "activity with result code: ", " indicating not RESULT_OK");
                    ref$ObjectRef.element = new GetCredentialUnknownException(m);
                    if (i == 0) {
                        ref$ObjectRef.element = new GetCredentialCancellationException("activity is cancelled by the user.");
                    }
                    PoolInvitePeopleListViewKt$$ExternalSyntheticLambda6 poolInvitePeopleListViewKt$$ExternalSyntheticLambda6 = new PoolInvitePeopleListViewKt$$ExternalSyntheticLambda6(cachedPageEventFlow$$ExternalSyntheticLambda0, ref$ObjectRef, i5);
                    CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                    if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
                        return;
                    }
                    poolInvitePeopleListViewKt$$ExternalSyntheticLambda6.invoke();
                    return;
                }
                try {
                    Identity.getSignInClient(credentialProviderBeginSignInController.context);
                    GetCredentialResponse convertResponseToCredentialManager = credentialProviderBeginSignInController.convertResponseToCredentialManager(zbaq.getSignInCredentialFromIntent(intent));
                    CancellationSignal cancellationSignal2 = credentialProviderBeginSignInController.cancellationSignal;
                    CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                    if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal2)) {
                        return;
                    }
                    credentialProviderBeginSignInController.getExecutor().execute(new DispatchQueue$$ExternalSyntheticLambda0(4, credentialProviderBeginSignInController, convertResponseToCredentialManager));
                    return;
                } catch (GetCredentialException e) {
                    CancellationSignal cancellationSignal3 = credentialProviderBeginSignInController.cancellationSignal;
                    CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                    if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal3)) {
                        return;
                    }
                    credentialProviderBeginSignInController.getExecutor().execute(new CredentialProviderBeginSignInController$$ExternalSyntheticLambda6(credentialProviderBeginSignInController, e, i5));
                    return;
                } catch (ApiException e2) {
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ref$ObjectRef2.element = new GetCredentialUnknownException(e2.getMessage());
                    int i6 = e2.mStatus.zza;
                    if (i6 == 16) {
                        ref$ObjectRef2.element = new GetCredentialCancellationException(e2.getMessage());
                    } else if (CredentialProviderController.retryables.contains(Integer.valueOf(i6))) {
                        ref$ObjectRef2.element = new GetCredentialInterruptedException(e2.getMessage());
                    }
                    CancellationSignal cancellationSignal4 = credentialProviderBeginSignInController.cancellationSignal;
                    CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                    if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal4)) {
                        return;
                    }
                    credentialProviderBeginSignInController.getExecutor().execute(new DispatchQueue$$ExternalSyntheticLambda0(5, credentialProviderBeginSignInController, ref$ObjectRef2));
                    return;
                } catch (Throwable th) {
                    GetCredentialUnknownException getCredentialUnknownException = new GetCredentialUnknownException(th.getMessage());
                    CancellationSignal cancellationSignal5 = credentialProviderBeginSignInController.cancellationSignal;
                    CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                    if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal5)) {
                        return;
                    }
                    credentialProviderBeginSignInController.getExecutor().execute(new DispatchQueue$$ExternalSyntheticLambda0(6, credentialProviderBeginSignInController, getCredentialUnknownException));
                    return;
                }
            case 2:
                bundle.getClass();
                WorkApplet$applet$1 workApplet$applet$1 = new WorkApplet$applet$1(2, CredentialProviderController.Companion, CredentialProviderBaseController$Companion.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 3);
                CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = (CredentialProviderCreatePublicKeyCredentialController) obj;
                Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
                if (executor == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    throw null;
                }
                CredentialManagerCallback credentialManagerCallback = credentialProviderCreatePublicKeyCredentialController.callback;
                if (credentialManagerCallback == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    throw null;
                }
                if (CredentialProviderController.maybeReportErrorFromResultReceiver(bundle, workApplet$applet$1, executor, credentialManagerCallback, credentialProviderCreatePublicKeyCredentialController.cancellationSignal)) {
                    return;
                }
                int i7 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent2 = (Intent) bundle.getParcelable("RESULT_DATA");
                int i8 = CredentialProviderController.CONTROLLER_REQUEST_CODE;
                if (i7 != i8) {
                    Log.w("CreatePublicKey", "Returned request code " + i8 + " does not match what was given " + i7);
                    return;
                }
                CachedPageEventFlow$$ExternalSyntheticLambda0 cachedPageEventFlow$$ExternalSyntheticLambda02 = new CachedPageEventFlow$$ExternalSyntheticLambda0(credentialProviderCreatePublicKeyCredentialController, 10);
                CancellationSignal cancellationSignal6 = credentialProviderCreatePublicKeyCredentialController.cancellationSignal;
                if (i != -1) {
                    Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                    m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "activity with result code: ", " indicating not RESULT_OK");
                    ref$ObjectRef3.element = new CreateCredentialUnknownException(m2);
                    if (i == 0) {
                        ref$ObjectRef3.element = new CreateCredentialCancellationException("activity is cancelled by the user.");
                    }
                    PoolInvitePeopleListViewKt$$ExternalSyntheticLambda6 poolInvitePeopleListViewKt$$ExternalSyntheticLambda62 = new PoolInvitePeopleListViewKt$$ExternalSyntheticLambda6(cachedPageEventFlow$$ExternalSyntheticLambda02, ref$ObjectRef3, 1);
                    CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                    if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal6)) {
                        poolInvitePeopleListViewKt$$ExternalSyntheticLambda62.invoke();
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
                byte[] byteArrayExtra = intent2 != null ? intent2.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA") : null;
                if (byteArrayExtra == null) {
                    CredentialProviderPlayServicesImpl.Companion companion = CredentialProviderPlayServicesImpl.INSTANCE;
                    CancellationSignal cancellationSignal7 = credentialProviderCreatePublicKeyCredentialController.cancellationSignal;
                    companion.getClass();
                    if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal7)) {
                        return;
                    }
                    Executor executor2 = credentialProviderCreatePublicKeyCredentialController.executor;
                    if (executor2 != null) {
                        executor2.execute(new CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda1(credentialProviderCreatePublicKeyCredentialController, 0));
                        return;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("executor");
                        throw null;
                    }
                }
                PublicKeyCredential publicKeyCredential = (PublicKeyCredential) ErrorsKt.deserializeFromBytes(byteArrayExtra, PublicKeyCredential.CREATOR);
                publicKeyCredential.getClass();
                LinkedHashMap linkedHashMap = PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
                SafeParcelable safeParcelable = publicKeyCredential.zzd;
                if (safeParcelable == null && (safeParcelable = publicKeyCredential.zze) == null && (safeParcelable = publicKeyCredential.zzf) == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("No response set.");
                    return;
                }
                if (safeParcelable instanceof AuthenticatorErrorResponse) {
                    AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) safeParcelable;
                    ErrorCode errorCode = authenticatorErrorResponse.zza;
                    errorCode.getClass();
                    DomError domError = (DomError) PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions.get(errorCode);
                    String str = authenticatorErrorResponse.zzb;
                    createCredentialException = domError == null ? new CreatePublicKeyCredentialDomException(new DataError(24), Recorder$$ExternalSyntheticOutline2.m("unknown fido gms exception - ", str)) : (errorCode == ErrorCode.NOT_ALLOWED_ERR && str != null && StringsKt.contains((CharSequence) str, (CharSequence) "Unable to get sync account", false)) ? new CreateCredentialCancellationException("Passkey registration was cancelled by the user.") : new CreatePublicKeyCredentialDomException(domError, str);
                } else {
                    createCredentialException = null;
                }
                if (createCredentialException != null) {
                    CancellationSignal cancellationSignal8 = credentialProviderCreatePublicKeyCredentialController.cancellationSignal;
                    CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                    if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal8)) {
                        return;
                    }
                    Executor executor3 = credentialProviderCreatePublicKeyCredentialController.executor;
                    if (executor3 != null) {
                        executor3.execute(new CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda10(credentialProviderCreatePublicKeyCredentialController, createCredentialException, 0));
                        return;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("executor");
                        throw null;
                    }
                }
                try {
                    CreatePublicKeyCredentialResponse convertResponseToCredentialManager2 = CredentialProviderCreatePublicKeyCredentialController.convertResponseToCredentialManager(publicKeyCredential);
                    CancellationSignal cancellationSignal9 = credentialProviderCreatePublicKeyCredentialController.cancellationSignal;
                    CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                    if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal9)) {
                        return;
                    }
                    Executor executor4 = credentialProviderCreatePublicKeyCredentialController.executor;
                    if (executor4 != null) {
                        executor4.execute(new DispatchQueue$$ExternalSyntheticLambda0(7, credentialProviderCreatePublicKeyCredentialController, convertResponseToCredentialManager2));
                        return;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("executor");
                        throw null;
                    }
                } catch (JSONException e3) {
                    CancellationSignal cancellationSignal10 = credentialProviderCreatePublicKeyCredentialController.cancellationSignal;
                    CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                    if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal10)) {
                        return;
                    }
                    Executor executor5 = credentialProviderCreatePublicKeyCredentialController.executor;
                    if (executor5 != null) {
                        executor5.execute(new CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda5(credentialProviderCreatePublicKeyCredentialController, e3, 0));
                        return;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("executor");
                        throw null;
                    }
                } catch (Throwable th2) {
                    CancellationSignal cancellationSignal11 = credentialProviderCreatePublicKeyCredentialController.cancellationSignal;
                    CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                    if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal11)) {
                        return;
                    }
                    Executor executor6 = credentialProviderCreatePublicKeyCredentialController.executor;
                    if (executor6 != null) {
                        executor6.execute(new CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda7(credentialProviderCreatePublicKeyCredentialController, th2, 1));
                        return;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("executor");
                        throw null;
                    }
                }
            case 3:
                bundle.getClass();
                WorkApplet$applet$1 workApplet$applet$12 = new WorkApplet$applet$1(2, CredentialProviderController.Companion, CredentialProviderBaseController$Companion.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 4);
                CreatePublicKeyCredentialController createPublicKeyCredentialController = (CreatePublicKeyCredentialController) obj;
                Executor executor7 = createPublicKeyCredentialController.executor;
                if (executor7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    throw null;
                }
                CredentialManagerCallback credentialManagerCallback2 = createPublicKeyCredentialController.callback;
                if (credentialManagerCallback2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    throw null;
                }
                if (CredentialProviderController.maybeReportErrorFromResultReceiver(bundle, workApplet$applet$12, executor7, credentialManagerCallback2, createPublicKeyCredentialController.cancellationSignal)) {
                    return;
                }
                int i9 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent3 = (Intent) SizeKt.getParcelable(bundle, "RESULT_DATA", Intent.class);
                int i10 = CredentialProviderController.CONTROLLER_REQUEST_CODE;
                if (i9 != i10) {
                    Log.w("CreatePublicKey", "Returned request code " + i10 + " does not match what was given " + i9);
                    return;
                }
                CachedPageEventFlow$$ExternalSyntheticLambda0 cachedPageEventFlow$$ExternalSyntheticLambda03 = new CachedPageEventFlow$$ExternalSyntheticLambda0(createPublicKeyCredentialController, 11);
                CancellationSignal cancellationSignal12 = createPublicKeyCredentialController.cancellationSignal;
                if (i != -1) {
                    Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
                    m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "activity with result code: ", " indicating not RESULT_OK");
                    ref$ObjectRef4.element = new CreateCredentialUnknownException(m3);
                    if (i == 0) {
                        ref$ObjectRef4.element = new CreateCredentialCancellationException("activity is cancelled by the user.");
                    }
                    PoolInvitePeopleListViewKt$$ExternalSyntheticLambda6 poolInvitePeopleListViewKt$$ExternalSyntheticLambda63 = new PoolInvitePeopleListViewKt$$ExternalSyntheticLambda6(cachedPageEventFlow$$ExternalSyntheticLambda03, ref$ObjectRef4, 1);
                    CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                    if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal12)) {
                        poolInvitePeopleListViewKt$$ExternalSyntheticLambda63.invoke();
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return;
                }
                if (intent3 == null) {
                    CancellationSignal cancellationSignal13 = createPublicKeyCredentialController.cancellationSignal;
                    CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                    if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal13)) {
                        return;
                    }
                    Executor executor8 = createPublicKeyCredentialController.executor;
                    if (executor8 != null) {
                        executor8.execute(new CreatePublicKeyCredentialController$$ExternalSyntheticLambda7(createPublicKeyCredentialController, 0));
                        return;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("executor");
                        throw null;
                    }
                }
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 34) {
                    createFrom = PlayerView.Api34.extractCreateCredentialResponse("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", intent3);
                } else {
                    Bundle bundleExtra = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE");
                    createFrom = (bundleExtra == null || (string2 = bundleExtra.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE")) == null || (bundle2 = bundleExtra.getBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA")) == null) ? null : DbSessionManagerKt.createFrom(bundle2, string2);
                }
                if (createFrom != null) {
                    CancellationSignal cancellationSignal14 = createPublicKeyCredentialController.cancellationSignal;
                    CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                    if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal14)) {
                        return;
                    }
                    Executor executor9 = createPublicKeyCredentialController.executor;
                    if (executor9 != null) {
                        executor9.execute(new DispatchQueue$$ExternalSyntheticLambda0(9, createPublicKeyCredentialController, createFrom));
                        return;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("executor");
                        throw null;
                    }
                }
                if (i11 >= 34) {
                    jetpackCreateException = PlayerView.Api34.extractCreateCredentialException(intent3);
                } else {
                    int i12 = CreateCredentialException.$r8$clinit;
                    Bundle bundleExtra2 = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
                    if (bundleExtra2 == null) {
                        jetpackCreateException = null;
                    } else {
                        String string3 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                        if (string3 == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("Bundle was missing exception type.");
                            return;
                        }
                        jetpackCreateException = SheetStateKt.toJetpackCreateException(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string3);
                    }
                }
                CancellationSignal cancellationSignal15 = createPublicKeyCredentialController.cancellationSignal;
                CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal15)) {
                    return;
                }
                Executor executor10 = createPublicKeyCredentialController.executor;
                if (executor10 != null) {
                    executor10.execute(new CreatePublicKeyCredentialController$$ExternalSyntheticLambda6(createPublicKeyCredentialController, jetpackCreateException, 0));
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    throw null;
                }
            case 4:
                bundle.getClass();
                WorkApplet$applet$1 workApplet$applet$13 = new WorkApplet$applet$1(2, CredentialProviderController.Companion, CredentialProviderBaseController$Companion.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 5);
                GetCredentialController getCredentialController = (GetCredentialController) obj;
                Executor executor11 = getCredentialController.executor;
                if (executor11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    throw null;
                }
                CredentialManagerCallback credentialManagerCallback3 = getCredentialController.callback;
                if (credentialManagerCallback3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    throw null;
                }
                if (CredentialProviderController.maybeReportErrorFromResultReceiver(bundle, workApplet$applet$13, executor11, credentialManagerCallback3, getCredentialController.cancellationSignal)) {
                    return;
                }
                int i13 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent4 = (Intent) SizeKt.getParcelable(bundle, "RESULT_DATA", Intent.class);
                Executor executor12 = getCredentialController.executor;
                if (executor12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    throw null;
                }
                CredentialManagerCallback credentialManagerCallback4 = getCredentialController.callback;
                if (credentialManagerCallback4 != null) {
                    zzqu.handleGetCredentialResponse(i13, i, intent4, executor12, credentialManagerCallback4, getCredentialController.cancellationSignal);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    throw null;
                }
            default:
                bundle.getClass();
                WorkApplet$applet$1 workApplet$applet$14 = new WorkApplet$applet$1(2, CredentialProviderController.Companion, CredentialProviderBaseController$Companion.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 6);
                CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController = (CredentialProviderGetDigitalCredentialController) obj;
                Executor executor13 = credentialProviderGetDigitalCredentialController.executor;
                if (executor13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    throw null;
                }
                CredentialManagerCallback credentialManagerCallback5 = credentialProviderGetDigitalCredentialController.callback;
                if (credentialManagerCallback5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    throw null;
                }
                if (CredentialProviderController.maybeReportErrorFromResultReceiver(bundle, workApplet$applet$14, executor13, credentialManagerCallback5, credentialProviderGetDigitalCredentialController.cancellationSignal)) {
                    return;
                }
                int i14 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent5 = (Intent) SizeKt.getParcelable(bundle, "RESULT_DATA", Intent.class);
                Executor executor14 = credentialProviderGetDigitalCredentialController.executor;
                if (executor14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    throw null;
                }
                CredentialManagerCallback credentialManagerCallback6 = credentialProviderGetDigitalCredentialController.callback;
                if (credentialManagerCallback6 != null) {
                    zzqu.handleGetCredentialResponse(i14, i, intent5, executor14, credentialManagerCallback6, credentialProviderGetDigitalCredentialController.cancellationSignal);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    throw null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzc(CredentialProviderController credentialProviderController, Handler handler, int i) {
        super(handler);
        this.$r8$classId = i;
        this.zza = credentialProviderController;
    }
}
