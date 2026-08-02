package androidx.credentials;

import android.content.Context;
import android.credentials.CreateCredentialRequest;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.camera.video.Recorder;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import com.squareup.cash.R;
import java.util.concurrent.Executor;
import kotlinx.coroutines.rx3.RxAwaitKt$await$5$1;

/* loaded from: classes3.dex */
public final class CredentialProviderFrameworkImpl implements CredentialProvider {
    public final CredentialManager credentialManager;

    public CredentialProviderFrameworkImpl(Context context) {
        context.getClass();
        this.credentialManager = (CredentialManager) context.getSystemService("credential");
    }

    @Override // androidx.credentials.CredentialProvider
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.credentialManager != null;
    }

    @Override // androidx.credentials.CredentialProvider
    public final void onCreateCredential(Context context, CreateCredentialRequest createCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback) {
        CredentialManager$createCredential$2$callback$1 credentialManager$createCredential$2$callback$1 = (CredentialManager$createCredential$2$callback$1) credentialManagerCallback;
        CredentialManager credentialManager = this.credentialManager;
        if (credentialManager == null) {
            credentialManager$createCredential$2$callback$1.onError(new CreateCredentialUnsupportedException("Your device doesn't support credential manager"));
            return;
        }
        CredentialProviderFrameworkImpl$onGetCredential$outcome$2 credentialProviderFrameworkImpl$onGetCredential$outcome$2 = new CredentialProviderFrameworkImpl$onGetCredential$outcome$2(credentialManager$createCredential$2$callback$1, (CreatePublicKeyCredentialRequest) createCredentialRequest, this);
        credentialManager.getClass();
        Bundle bundle = createCredentialRequest.credentialData;
        Recorder.AnonymousClass4 anonymousClass4 = createCredentialRequest.displayInfo;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", (String) anonymousClass4.val$audioErrorConsumer);
        CharSequence charSequence = (CharSequence) anonymousClass4.this$0;
        if (!TextUtils.isEmpty(charSequence)) {
            bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", charSequence);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle2.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", null);
        }
        bundle2.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, R.drawable.adx_ic_passkey));
        bundle.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", bundle2);
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = new CreateCredentialRequest.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, createCredentialRequest.candidateQueryData).setIsSystemProviderRequired(false).setAlwaysSendAppInfoToProvider(true);
        alwaysSendAppInfoToProvider.getClass();
        android.credentials.CreateCredentialRequest build = alwaysSendAppInfoToProvider.build();
        build.getClass();
        credentialManager.createCredential(context, build, cancellationSignal, executor, credentialProviderFrameworkImpl$onGetCredential$outcome$2);
    }

    @Override // androidx.credentials.CredentialProvider
    public final void onGetCredential(Context context, GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback) {
        context.getClass();
        RxAwaitKt$await$5$1 rxAwaitKt$await$5$1 = (RxAwaitKt$await$5$1) credentialManagerCallback;
        CredentialManager credentialManager = this.credentialManager;
        if (credentialManager == null) {
            rxAwaitKt$await$5$1.onError((Object) new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
            return;
        }
        CredentialProviderFrameworkImpl$onGetCredential$outcome$2 credentialProviderFrameworkImpl$onGetCredential$outcome$2 = new CredentialProviderFrameworkImpl$onGetCredential$outcome$2(rxAwaitKt$await$5$1, this);
        credentialManager.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", getCredentialRequest.preferImmediatelyAvailableCredentials);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(bundle);
        for (CredentialOption credentialOption : getCredentialRequest.credentialOptions) {
            builder.addCredentialOption(new CredentialOption.Builder(credentialOption.f862type, credentialOption.requestData, credentialOption.candidateQueryData).setIsSystemProviderRequired(false).setAllowedProviders(credentialOption.allowedProviders).build());
        }
        android.credentials.GetCredentialRequest build = builder.build();
        build.getClass();
        credentialManager.getCredential(context, build, cancellationSignal, executor, credentialProviderFrameworkImpl$onGetCredential$outcome$2);
    }
}
