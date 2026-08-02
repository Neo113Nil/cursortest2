package androidx.credentials.playservices;

import androidx.credentials.CredentialManagerCallback;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda10 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Executor f$0;
    public final /* synthetic */ CredentialManagerCallback f$1;

    public /* synthetic */ CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda10(Executor executor, CredentialManagerCallback credentialManagerCallback, int i) {
        this.$r8$classId = i;
        this.f$0 = executor;
        this.f$1 = credentialManagerCallback;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit onClearCredential$lambda$4$0;
        Unit runFallbackClearCredFlow$lambda$0$0;
        Unit onClearCredential$lambda$1$0;
        switch (this.$r8$classId) {
            case 0:
                onClearCredential$lambda$4$0 = CredentialProviderPlayServicesImpl.onClearCredential$lambda$4$0(this.f$0, this.f$1);
                return onClearCredential$lambda$4$0;
            case 1:
                runFallbackClearCredFlow$lambda$0$0 = CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$0$0(this.f$0, this.f$1);
                return runFallbackClearCredFlow$lambda$0$0;
            default:
                onClearCredential$lambda$1$0 = CredentialProviderPlayServicesImpl.onClearCredential$lambda$1$0(this.f$0, this.f$1);
                return onClearCredential$lambda$1$0;
        }
    }
}
