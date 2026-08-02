package androidx.credentials;

import android.os.Bundle;
import androidx.camera.video.Recorder;

/* loaded from: classes3.dex */
public abstract class CreateCredentialRequest {
    public final Bundle candidateQueryData;
    public final Bundle credentialData;
    public final Recorder.AnonymousClass4 displayInfo;

    public CreateCredentialRequest(Bundle bundle, Bundle bundle2, Recorder.AnonymousClass4 anonymousClass4) {
        this.credentialData = bundle;
        this.candidateQueryData = bundle2;
        this.displayInfo = anonymousClass4;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
