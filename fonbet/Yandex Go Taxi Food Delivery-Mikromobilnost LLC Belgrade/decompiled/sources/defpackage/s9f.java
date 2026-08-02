package defpackage;

import androidx.credentials.exceptions.ClearCredentialProviderConfigurationException;

/* loaded from: classes10.dex */
public final /* synthetic */ class s9f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c9f b;

    public /* synthetic */ s9f(c9f c9fVar, int i) {
        this.a = i;
        this.b = c9fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c(new ClearCredentialProviderConfigurationException("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
                break;
            case 1:
                this.b.onResult(null);
                break;
            default:
                this.b.onResult(null);
                break;
        }
    }
}
