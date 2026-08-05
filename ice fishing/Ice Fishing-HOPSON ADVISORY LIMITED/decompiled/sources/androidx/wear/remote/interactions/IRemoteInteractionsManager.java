package androidx.wear.remote.interactions;

import android.net.Uri;
import android.os.OutcomeReceiver;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.Metadata;

/* compiled from: IRemoteInteractionsManager.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u0016\u0010\r\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J<\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\b\u001a\u00020\t2\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00170\u0015H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Landroidx/wear/remote/interactions/IRemoteInteractionsManager;", "", "isAvailabilityStatusApiSupported", "", "()Z", "isWearSdkApiStartRemoteActivitySupported", "registerRemoteActivityHelperStatusListener", "", "executor", "Ljava/util/concurrent/Executor;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljava/util/function/Consumer;", "", "unregisterRemoteActivityHelperStatusListener", "startRemoteActivity", "dataUri", "Landroid/net/Uri;", "additionalCategories", "", "", "outcomeReceiver", "Landroid/os/OutcomeReceiver;", "Ljava/lang/Void;", "", "wear-remote-interactions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface IRemoteInteractionsManager {
    boolean isAvailabilityStatusApiSupported();

    boolean isWearSdkApiStartRemoteActivitySupported();

    void registerRemoteActivityHelperStatusListener(Executor executor, Consumer<Integer> listener);

    void startRemoteActivity(Uri dataUri, List<String> additionalCategories, Executor executor, OutcomeReceiver<Void, Throwable> outcomeReceiver);

    void unregisterRemoteActivityHelperStatusListener(Consumer<Integer> listener);
}
