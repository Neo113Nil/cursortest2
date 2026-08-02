package androidx.credentials.playservices;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda15;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.credentials.ClearCredentialStateRequest;
import androidx.credentials.CreateCredentialRequest;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.CredentialOption;
import androidx.credentials.CredentialProvider;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetDigitalCredentialOption;
import androidx.credentials.PrepareGetCredentialResponse$PendingGetCredentialHandle;
import androidx.credentials.SignalCredentialStateRequest;
import androidx.credentials.exceptions.ClearCredentialProviderConfigurationException;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$$ExternalSyntheticLambda2;
import androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController;
import androidx.lifecycle.DispatchQueue$$ExternalSyntheticLambda0;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda4;
import androidx.navigation.Navigator$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.n$$ExternalSyntheticLambda1;
import bo.app.n3$$ExternalSyntheticLambda0;
import com.fillr.n;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.identitycredentials.ClearCredentialStateResponse;
import com.google.android.gms.identitycredentials.internal.InternalIdentityCredentialClient;
import com.google.android.gms.internal.identity_credentials.zze;
import com.google.android.gms.internal.p000authapi.zbaq;
import com.google.android.gms.internal.p000authapi.zbas;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.zzb;
import com.google.android.gms.tasks.zzw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\fH\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001dJ?\u0010!\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u001e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020 0\fH\u0016¢\u0006\u0004\b!\u0010\"J3\u0010&\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\fH\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b(\u0010)J?\u0010*\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u001e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020 0\fH\u0002¢\u0006\u0004\b*\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R(\u0010-\u001a\u00020,8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b3\u00104\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00066"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;", "Landroidx/credentials/CredentialProvider;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/credentials/GetCredentialRequest;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/credentials/CredentialManagerCallback;", "Landroidx/credentials/GetCredentialResponse;", "Landroidx/credentials/exceptions/GetCredentialException;", "callback", "", "onGetCredential", "(Landroid/content/Context;Landroidx/credentials/GetCredentialRequest;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/CredentialManagerCallback;)V", "Landroidx/credentials/CreateCredentialRequest;", "Landroidx/credentials/CreateCredentialResponse;", "Landroidx/credentials/exceptions/CreateCredentialException;", "onCreateCredential", "(Landroid/content/Context;Landroidx/credentials/CreateCredentialRequest;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/CredentialManagerCallback;)V", "", "isAvailableOnDevice", "()Z", "", "minApkVersion", "(I)Z", "Landroidx/credentials/ClearCredentialStateRequest;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "onClearCredential", "(Landroidx/credentials/ClearCredentialStateRequest;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/CredentialManagerCallback;)V", "Landroidx/credentials/SignalCredentialStateRequest;", "", "Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateException;", "onSignalCredentialState", "(Landroidx/credentials/SignalCredentialStateRequest;Ljava/util/concurrent/Executor;Landroidx/credentials/CredentialManagerCallback;)V", "isGooglePlayServicesAvailable", "(Landroid/content/Context;I)I", "runFallbackClearCredFlow", "Landroid/content/Context;", "Lcom/google/android/gms/common/GoogleApiAvailability;", "googleApiAvailability", "Lcom/google/android/gms/common/GoogleApiAvailability;", "getGoogleApiAvailability", "()Lcom/google/android/gms/common/GoogleApiAvailability;", "setGoogleApiAvailability", "(Lcom/google/android/gms/common/GoogleApiAvailability;)V", "getGoogleApiAvailability$annotations", "()V", "Companion", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CredentialProviderPlayServicesImpl implements CredentialProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    public static final int MIN_GMS_APK_VERSION_SIGNAL_API = 254625000;
    public static final int PRE_U_MIN_GMS_APK_VERSION = 252400000;
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private GoogleApiAvailability googleApiAvailability;

    public final class Companion {
        public static boolean cancellationReviewer$credentials_play_services_auth(CancellationSignal cancellationSignal) {
            if (cancellationSignal == null) {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "No cancellationSignal found");
                return false;
            }
            if (!cancellationSignal.isCanceled()) {
                return false;
            }
            Log.i(CredentialProviderPlayServicesImpl.TAG, "the flow has been canceled");
            return true;
        }

        public static void cancellationReviewerWithCallback$credentials_play_services_auth(CancellationSignal cancellationSignal, Function0 function0) {
            if (cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
                return;
            }
            function0.invoke();
        }
    }

    public CredentialProviderPlayServicesImpl(Context context) {
        context.getClass();
        this.context = context;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        googleApiAvailability.getClass();
        this.googleApiAvailability = googleApiAvailability;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(Context context, int minApkVersion) {
        return this.googleApiAvailability.isGooglePlayServicesAvailable(context, minApkVersion);
    }

    private static final Unit onClearCredential$lambda$0(Executor executor, CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0(credentialManagerCallback, 0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$0$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new ClearCredentialProviderConfigurationException("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added", "androidx.credentials.TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION"));
    }

    private static final Unit onClearCredential$lambda$1(CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback, Boolean bool) {
        Companion companion = INSTANCE;
        CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda10 credentialProviderPlayServicesImpl$$ExternalSyntheticLambda10 = new CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda10(executor, credentialManagerCallback, 2);
        companion.getClass();
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, credentialProviderPlayServicesImpl$$ExternalSyntheticLambda10);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$1$0(Executor executor, CredentialManagerCallback credentialManagerCallback) {
        Log.i(TAG, "Cleared restore credential successfully!");
        executor.execute(new CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0(credentialManagerCallback, 2));
        return Unit.INSTANCE;
    }

    private static final void onClearCredential$lambda$3(CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback, Exception exc) {
        exc.getClass();
        Log.w(TAG, "Clearing restore credential failed", exc);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new ClearCredentialUnknownException("Clear restore credential failed for unknown reason.");
        if ((exc instanceof ApiException) && ((ApiException) exc).mStatus.zza == 40201) {
            ref$ObjectRef.element = new ClearCredentialUnknownException("The restore credential internal service had a failure.");
        }
        INSTANCE.getClass();
        if (Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        onClearCredential$lambda$3$0(executor, credentialManagerCallback, ref$ObjectRef);
    }

    private static final Unit onClearCredential$lambda$3$0(Executor executor, CredentialManagerCallback credentialManagerCallback, Ref$ObjectRef ref$ObjectRef) {
        executor.execute(new Recorder$$ExternalSyntheticLambda15(29, credentialManagerCallback, ref$ObjectRef));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$3$0$0(CredentialManagerCallback credentialManagerCallback, Ref$ObjectRef ref$ObjectRef) {
        credentialManagerCallback.onError(ref$ObjectRef.element);
    }

    private static final Unit onClearCredential$lambda$4(CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback, ClearCredentialStateResponse clearCredentialStateResponse) {
        Companion companion = INSTANCE;
        CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda10 credentialProviderPlayServicesImpl$$ExternalSyntheticLambda10 = new CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda10(executor, credentialManagerCallback, 0);
        companion.getClass();
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, credentialProviderPlayServicesImpl$$ExternalSyntheticLambda10);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$4$0(Executor executor, CredentialManagerCallback credentialManagerCallback) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0(credentialManagerCallback, 6));
        return Unit.INSTANCE;
    }

    private static final void onClearCredential$lambda$6(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, ClearCredentialStateRequest clearCredentialStateRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback, Exception exc) {
        exc.getClass();
        Log.e(TAG, "GMS Clear credential flow failed, calling fallback");
        credentialProviderPlayServicesImpl.runFallbackClearCredFlow(clearCredentialStateRequest, cancellationSignal, executor, credentialManagerCallback);
    }

    private static final Unit onCreateCredential$lambda$0(Executor executor, CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0(credentialManagerCallback, 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateCredential$lambda$0$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new CreateCredentialProviderConfigurationException("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    private static final Unit onGetCredential$lambda$0(Executor executor, CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0(credentialManagerCallback, 5));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$0$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new GetCredentialProviderConfigurationException("this device requires a Google Play Services update for the given feature to be supported"));
    }

    private static final Unit onGetCredential$lambda$1(Executor executor, CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0(credentialManagerCallback, 4));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$1$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.common.Feature[], java.io.Serializable] */
    private final void runFallbackClearCredFlow(ClearCredentialStateRequest request, final CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback callback) {
        zbaq signInClient = Identity.getSignInClient(this.context);
        signInClient.zab.getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = GoogleApiClient.zaa;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((GoogleApiClient) it.next()).maybeSignOut();
        }
        GoogleApiManager.reportSignOut();
        zacn builder = zacn.builder();
        builder.zaa$1 = new Feature[]{zbas.zbb};
        builder.zaa = new zzb(signInClient, 17);
        builder.zab = false;
        builder.zac = 1554;
        zzw zae = signInClient.zae(1, builder.build());
        StreamSharing$$ExternalSyntheticLambda1 streamSharing$$ExternalSyntheticLambda1 = new StreamSharing$$ExternalSyntheticLambda1(new Function1() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit runFallbackClearCredFlow$lambda$0;
                runFallbackClearCredFlow$lambda$0 = CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$0(cancellationSignal, executor, callback, (Void) obj);
                return runFallbackClearCredFlow$lambda$0;
            }
        }, 22);
        zae.getClass();
        zae.addOnSuccessListener(TaskExecutors.MAIN_THREAD, streamSharing$$ExternalSyntheticLambda1);
        zae.addOnFailureListener(new DefaultTrackSelector$$ExternalSyntheticLambda4(this, cancellationSignal, executor, callback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$0(CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback, Void r5) {
        Companion companion = INSTANCE;
        CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda10 credentialProviderPlayServicesImpl$$ExternalSyntheticLambda10 = new CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda10(executor, credentialManagerCallback, 1);
        companion.getClass();
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, credentialProviderPlayServicesImpl$$ExternalSyntheticLambda10);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$0$0(Executor executor, CredentialManagerCallback credentialManagerCallback) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0(credentialManagerCallback, 3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$2(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback, Exception exc) {
        exc.getClass();
        Companion companion = INSTANCE;
        n$$ExternalSyntheticLambda1 n__externalsyntheticlambda1 = new n$$ExternalSyntheticLambda1(7, exc, executor, credentialManagerCallback);
        companion.getClass();
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, n__externalsyntheticlambda1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$2$0$0(Exception exc, Executor executor, CredentialManagerCallback credentialManagerCallback) {
        Log.w(TAG, "During clear credential sign out failed with " + exc);
        executor.execute(new DispatchQueue$$ExternalSyntheticLambda0(1, credentialManagerCallback, exc));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$2$0$0$0(CredentialManagerCallback credentialManagerCallback, Exception exc) {
        credentialManagerCallback.onError(new ClearCredentialUnknownException(exc.getMessage()));
    }

    public final GoogleApiAvailability getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public final boolean isAvailableOnDevice(int minApkVersion) {
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, minApkVersion);
        boolean z = isGooglePlayServicesAvailable == 0;
        if (!z) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new ConnectionResult(isGooglePlayServicesAvailable, null, null));
        }
        return z;
    }

    public void onClearCredential(ClearCredentialStateRequest request, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback callback) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [com.google.android.gms.common.Feature[], java.io.Serializable] */
    @Override // androidx.credentials.CredentialProvider
    public void onCreateCredential(Context context, CreateCredentialRequest request, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback callback) {
        context.getClass();
        request.getClass();
        executor.getClass();
        callback.getClass();
        Companion companion = INSTANCE;
        companion.getClass();
        if (Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        if (!(request instanceof CreatePublicKeyCredentialRequest)) {
            a$$ExternalSyntheticBUOutline0.m("Create Credential request is unsupported, not password or publickeycredential");
            return;
        }
        if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
            new CredentialProviderCreatePublicKeyCredentialController(context).invokePlayServices((CreatePublicKeyCredentialRequest) request, callback, executor, cancellationSignal);
            return;
        }
        CreatePublicKeyCredentialController createPublicKeyCredentialController = new CreatePublicKeyCredentialController(context);
        CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest = (CreatePublicKeyCredentialRequest) request;
        createPublicKeyCredentialController.cancellationSignal = cancellationSignal;
        createPublicKeyCredentialController.callback = callback;
        createPublicKeyCredentialController.executor = executor;
        companion.getClass();
        if (Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        com.google.android.gms.identitycredentials.CreateCredentialRequest createCredentialRequest = new com.google.android.gms.identitycredentials.CreateCredentialRequest("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", createPublicKeyCredentialRequest.credentialData, createPublicKeyCredentialRequest.candidateQueryData, null, createPublicKeyCredentialRequest.requestJson, null);
        InternalIdentityCredentialClient internalIdentityCredentialClient = new InternalIdentityCredentialClient(context, null, InternalIdentityCredentialClient.API, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
        zacn builder = zacn.builder();
        builder.zaa$1 = new Feature[]{zze.zzf};
        builder.zaa = new n.b(createCredentialRequest, 20);
        builder.zac = 32704;
        zzw zae = internalIdentityCredentialClient.zae(1, builder.build());
        zae.getClass();
        zae.addOnSuccessListener(TaskExecutors.MAIN_THREAD, new StreamSharing$$ExternalSyntheticLambda1(new n3$$ExternalSyntheticLambda0(cancellationSignal, createPublicKeyCredentialController, executor, callback, 7), 25));
        zae.addOnFailureListener(new GetCredentialController$$ExternalSyntheticLambda2(createPublicKeyCredentialRequest, createPublicKeyCredentialController, callback, executor, cancellationSignal, 1));
    }

    @Override // androidx.credentials.CredentialProvider
    public void onGetCredential(Context context, GetCredentialRequest request, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback callback) {
        Api.ApiOptions.NoOptions noOptions;
        context.getClass();
        request.getClass();
        boolean z = request.preferImmediatelyAvailableCredentials;
        List<CredentialOption> list = request.credentialOptions;
        executor.getClass();
        callback.getClass();
        INSTANCE.getClass();
        if (Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        Iterator it = list.iterator();
        do {
            boolean hasNext = it.hasNext();
            noOptions = Api.ApiOptions.NO_OPTIONS;
            if (!hasNext) {
                INSTANCE.getClass();
                for (CredentialOption credentialOption : list) {
                }
                if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
                    INSTANCE.getClass();
                    for (CredentialOption credentialOption2 : list) {
                    }
                    new CredentialProviderBeginSignInController(context).invokePlayServices(request, cancellationSignal, executor, callback);
                    return;
                }
                GetCredentialController getCredentialController = new GetCredentialController(context);
                getCredentialController.cancellationSignal = cancellationSignal;
                getCredentialController.callback = callback;
                getCredentialController.executor = executor;
                INSTANCE.getClass();
                if (Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
                bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z);
                bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
                List<CredentialOption> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (CredentialOption credentialOption3 : list2) {
                    arrayList.add(new com.google.android.gms.identitycredentials.CredentialOption(credentialOption3.f862type, credentialOption3.requestData, credentialOption3.candidateQueryData, "", "", ""));
                }
                com.google.android.gms.identitycredentials.GetCredentialRequest getCredentialRequest = new com.google.android.gms.identitycredentials.GetCredentialRequest(arrayList, bundle, null, new ResultReceiver(null));
                Context context2 = getCredentialController.context;
                context2.getClass();
                zzw credential = new InternalIdentityCredentialClient(context2, null, InternalIdentityCredentialClient.API, noOptions, GoogleApi.Settings.DEFAULT_SETTINGS).getCredential(getCredentialRequest);
                credential.addOnSuccessListener(TaskExecutors.MAIN_THREAD, new StreamSharing$$ExternalSyntheticLambda1(new n3$$ExternalSyntheticLambda0(cancellationSignal, getCredentialController, executor, callback, 8), 26));
                credential.addOnFailureListener(new GetCredentialController$$ExternalSyntheticLambda2(request, getCredentialController, callback, executor, cancellationSignal, 0));
                return;
            }
        } while (!(((CredentialOption) it.next()) instanceof GetDigitalCredentialOption));
        if (!isAvailableOnDevice(MIN_GMS_APK_VERSION_DIGITAL_CRED)) {
            INSTANCE.getClass();
            if (Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
                return;
            }
            onGetCredential$lambda$0(executor, callback);
            return;
        }
        CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController = new CredentialProviderGetDigitalCredentialController(context);
        credentialProviderGetDigitalCredentialController.cancellationSignal = cancellationSignal;
        credentialProviderGetDigitalCredentialController.callback = callback;
        credentialProviderGetDigitalCredentialController.executor = executor;
        INSTANCE.getClass();
        if (Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (CredentialOption credentialOption4 : list) {
            if (credentialOption4 instanceof GetDigitalCredentialOption) {
                arrayList2.add(new com.google.android.gms.identitycredentials.CredentialOption(credentialOption4.f862type, credentialOption4.requestData, credentialOption4.candidateQueryData, ((GetDigitalCredentialOption) credentialOption4).requestJson, "", ""));
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z);
        bundle2.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        com.google.android.gms.identitycredentials.GetCredentialRequest getCredentialRequest2 = new com.google.android.gms.identitycredentials.GetCredentialRequest(arrayList2, bundle2, null, new ResultReceiver(null));
        Context context3 = credentialProviderGetDigitalCredentialController.context;
        context3.getClass();
        zzw credential2 = new InternalIdentityCredentialClient(context3, null, InternalIdentityCredentialClient.API, noOptions, GoogleApi.Settings.DEFAULT_SETTINGS).getCredential(getCredentialRequest2);
        credential2.addOnSuccessListener(TaskExecutors.MAIN_THREAD, new StreamSharing$$ExternalSyntheticLambda1(new Navigator$$ExternalSyntheticLambda0(23, cancellationSignal, credentialProviderGetDigitalCredentialController), 27));
        credential2.addOnFailureListener(new PreviewView$1$$ExternalSyntheticLambda2(credentialProviderGetDigitalCredentialController, cancellationSignal, executor, callback));
    }

    public void onPrepareCredential(GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback) {
        getCredentialRequest.getClass();
        executor.getClass();
        credentialManagerCallback.getClass();
    }

    public void onSignalCredentialState(SignalCredentialStateRequest request, Executor executor, CredentialManagerCallback callback) {
        throw null;
    }

    public final void setGoogleApiAvailability(GoogleApiAvailability googleApiAvailability) {
        googleApiAvailability.getClass();
        this.googleApiAvailability = googleApiAvailability;
    }

    @Override // androidx.credentials.CredentialProvider
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    public void onGetCredential(Context context, PrepareGetCredentialResponse$PendingGetCredentialHandle prepareGetCredentialResponse$PendingGetCredentialHandle, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback) {
        context.getClass();
        throw null;
    }
}
