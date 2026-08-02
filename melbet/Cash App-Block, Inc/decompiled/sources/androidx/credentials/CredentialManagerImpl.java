package androidx.credentials;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.rx3.RxAwaitKt$await$5$1;

/* loaded from: classes.dex */
public final class CredentialManagerImpl {
    public final Context context;

    public CredentialManagerImpl(Context context) {
        this.context = context;
    }

    public static Object getCredential(Context context, GetCredentialRequest getCredentialRequest, SuspendLambda suspendLambda) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(suspendLambda));
        cancellableContinuationImpl.initCancellability();
        CancellationSignal cancellationSignal = new CancellationSignal();
        cancellableContinuationImpl.invokeOnCancellation(new CredentialManager$getCredential$2$1(cancellationSignal, 0));
        RxAwaitKt$await$5$1 rxAwaitKt$await$5$1 = new RxAwaitKt$await$5$1(cancellableContinuationImpl, 1);
        CredentialManager$$ExternalSyntheticLambda0 credentialManager$$ExternalSyntheticLambda0 = new CredentialManager$$ExternalSyntheticLambda0(0);
        context.getClass();
        CredentialProvider bestAvailableProvider$default = CredentialProviderFactory.getBestAvailableProvider$default(new CredentialProviderFactory(context, 0), getCredentialRequest);
        if (bestAvailableProvider$default == null) {
            rxAwaitKt$await$5$1.onError((Object) new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            bestAvailableProvider$default.onGetCredential(context, getCredentialRequest, cancellationSignal, credentialManager$$ExternalSyntheticLambda0, rxAwaitKt$await$5$1);
        }
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }
}
