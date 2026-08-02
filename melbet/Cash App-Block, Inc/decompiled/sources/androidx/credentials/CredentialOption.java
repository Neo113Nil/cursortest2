package androidx.credentials;

import android.os.Bundle;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class CredentialOption {
    public final Set allowedProviders;
    public final Bundle candidateQueryData;
    public final Bundle requestData;

    /* renamed from: type, reason: collision with root package name */
    public final String f862type;

    public CredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z, Set set) {
        set.getClass();
        this.f862type = str;
        this.requestData = bundle;
        this.candidateQueryData = bundle2;
        this.allowedProviders = set;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z);
        bundle.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 100);
        bundle2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 100);
    }
}
