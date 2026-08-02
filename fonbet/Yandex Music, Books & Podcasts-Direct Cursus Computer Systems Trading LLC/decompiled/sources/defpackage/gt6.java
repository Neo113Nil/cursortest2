package defpackage;

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
import java.util.concurrent.Executor;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class gt6 implements ns6 {
    public final CredentialManager a;

    public gt6(Context context) {
        context.getClass();
        this.a = (CredentialManager) context.getSystemService("credential");
    }

    @Override // defpackage.ns6
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.a != null;
    }

    @Override // defpackage.ns6
    public final void onCreateCredential(Context context, ar6 ar6Var, CancellationSignal cancellationSignal, Executor executor, ls6 ls6Var) {
        context.getClass();
        rp7 rp7Var = (rp7) ls6Var;
        rs6 rs6Var = new rs6(3, rp7Var);
        CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            rs6Var.invoke();
            return;
        }
        et6 et6Var = new et6(rp7Var, ar6Var, this);
        credentialManager.getClass();
        String str = ar6Var.a;
        Bundle bundle = ar6Var.b;
        yfx yfxVar = ar6Var.d;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", (CharSequence) yfxVar.b);
        CharSequence charSequence = (CharSequence) yfxVar.c;
        if (!TextUtils.isEmpty(charSequence)) {
            bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", charSequence);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle2.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", null);
        }
        bundle2.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, ar6Var instanceof wr6 ? R.drawable.ic_password : ar6Var instanceof bs6 ? R.drawable.ic_passkey : R.drawable.ic_other_sign_in));
        bundle.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", bundle2);
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = new CreateCredentialRequest.Builder(str, bundle, ar6Var.c).setIsSystemProviderRequired(false).setAlwaysSendAppInfoToProvider(true);
        alwaysSendAppInfoToProvider.getClass();
        CreateCredentialRequest build = alwaysSendAppInfoToProvider.build();
        build.getClass();
        credentialManager.createCredential(context, build, cancellationSignal, executor, et6Var);
    }

    @Override // defpackage.ns6
    public final void onGetCredential(Context context, n7d n7dVar, CancellationSignal cancellationSignal, Executor executor, ls6 ls6Var) {
        context.getClass();
        jzi jziVar = (jzi) ls6Var;
        rs6 rs6Var = new rs6(4, jziVar);
        CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            rs6Var.invoke();
            return;
        }
        ft6 ft6Var = new ft6(jziVar, this);
        credentialManager.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(bundle);
        for (ms6 ms6Var : n7dVar.a) {
            builder.addCredentialOption(new CredentialOption.Builder(ms6Var.a, ms6Var.b, ms6Var.c).setIsSystemProviderRequired(false).setAllowedProviders(ms6Var.e).build());
        }
        GetCredentialRequest build = builder.build();
        build.getClass();
        credentialManager.getCredential(context, build, cancellationSignal, executor, ft6Var);
    }
}
