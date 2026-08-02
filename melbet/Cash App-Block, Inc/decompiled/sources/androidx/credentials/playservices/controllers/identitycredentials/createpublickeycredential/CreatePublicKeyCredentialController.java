package androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.play.core.review.zzc;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class CreatePublicKeyCredentialController extends CredentialProviderController {
    public CredentialManagerCallback callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final zzc resultReceiver;

    public CreatePublicKeyCredentialController(Context context) {
        context.getClass();
        this.context = context;
        this.resultReceiver = new zzc(this, new Handler(Looper.getMainLooper()), 3);
    }
}
