package androidx.wear.remote.interactions;

import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import androidx.wear.utils.WearApiVersionHelper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.wear.Sdk;
import com.google.wear.services.remoteinteractions.RemoteInteractionsManager;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RemoteInteractionsManagerCompat.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u0016\u0010\u0013\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J<\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u000e\u001a\u00020\u000f2\u0014\u0010\u001a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\u001e"}, d2 = {"Landroidx/wear/remote/interactions/RemoteInteractionsManagerCompat;", "Landroidx/wear/remote/interactions/IRemoteInteractionsManager;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "isAvailabilityStatusApiSupported", "", "()Z", "remoteInteractionsManager", "Lcom/google/wear/services/remoteinteractions/RemoteInteractionsManager;", "isWearSdkApiStartRemoteActivitySupported", "registerRemoteActivityHelperStatusListener", "", "executor", "Ljava/util/concurrent/Executor;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljava/util/function/Consumer;", "", "unregisterRemoteActivityHelperStatusListener", "startRemoteActivity", "dataUri", "Landroid/net/Uri;", "additionalCategories", "", "", "outcomeReceiver", "Landroid/os/OutcomeReceiver;", "Ljava/lang/Void;", "", "wear-remote-interactions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class RemoteInteractionsManagerCompat implements IRemoteInteractionsManager {
    private final boolean isAvailabilityStatusApiSupported;
    private final boolean isWearSdkApiStartRemoteActivitySupported;
    private final RemoteInteractionsManager remoteInteractionsManager;

    public RemoteInteractionsManagerCompat(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.isAvailabilityStatusApiSupported = RemoteInteractionsUtil.INSTANCE.isCurrentDeviceAWatch$wear_remote_interactions(context) && WearApiVersionHelper.isApiVersionAtLeast(WearApiVersionHelper.WEAR_TIRAMISU_4);
        this.remoteInteractionsManager = getIsAvailabilityStatusApiSupported() ? (RemoteInteractionsManager) Sdk.getWearManager(context, RemoteInteractionsManager.class) : null;
        this.isWearSdkApiStartRemoteActivitySupported = RemoteInteractionsUtil.INSTANCE.isCurrentDeviceAWatch$wear_remote_interactions(context) && WearApiVersionHelper.isApiVersionAtLeast(WearApiVersionHelper.WEAR_BAKLAVA_0);
    }

    @Override // androidx.wear.remote.interactions.IRemoteInteractionsManager
    /* renamed from: isAvailabilityStatusApiSupported, reason: from getter */
    public boolean getIsAvailabilityStatusApiSupported() {
        return this.isAvailabilityStatusApiSupported;
    }

    @Override // androidx.wear.remote.interactions.IRemoteInteractionsManager
    /* renamed from: isWearSdkApiStartRemoteActivitySupported, reason: from getter */
    public boolean getIsWearSdkApiStartRemoteActivitySupported() {
        return this.isWearSdkApiStartRemoteActivitySupported;
    }

    @Override // androidx.wear.remote.interactions.IRemoteInteractionsManager
    public void registerRemoteActivityHelperStatusListener(Executor executor, Consumer<Integer> listener) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (getIsAvailabilityStatusApiSupported()) {
            RemoteInteractionsManager remoteInteractionsManager = this.remoteInteractionsManager;
            Intrinsics.checkNotNull(remoteInteractionsManager);
            remoteInteractionsManager.registerRemoteActivityHelperStatusListener(executor, listener);
            return;
        }
        throw new UnsupportedOperationException("Should not call wear sdk when not supported.");
    }

    @Override // androidx.wear.remote.interactions.IRemoteInteractionsManager
    public void unregisterRemoteActivityHelperStatusListener(Consumer<Integer> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (getIsAvailabilityStatusApiSupported()) {
            RemoteInteractionsManager remoteInteractionsManager = this.remoteInteractionsManager;
            Intrinsics.checkNotNull(remoteInteractionsManager);
            remoteInteractionsManager.unregisterRemoteActivityHelperStatusListener(listener);
            return;
        }
        throw new UnsupportedOperationException("Should not call wear sdk when not supported.");
    }

    @Override // androidx.wear.remote.interactions.IRemoteInteractionsManager
    public void startRemoteActivity(Uri dataUri, List<String> additionalCategories, Executor executor, OutcomeReceiver<Void, Throwable> outcomeReceiver) {
        Intrinsics.checkNotNullParameter(dataUri, "dataUri");
        Intrinsics.checkNotNullParameter(additionalCategories, "additionalCategories");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(outcomeReceiver, "outcomeReceiver");
        if (getIsWearSdkApiStartRemoteActivitySupported()) {
            RemoteInteractionsManager remoteInteractionsManager = this.remoteInteractionsManager;
            Intrinsics.checkNotNull(remoteInteractionsManager);
            remoteInteractionsManager.startRemoteActivity(dataUri, additionalCategories, executor, outcomeReceiver);
            return;
        }
        throw new UnsupportedOperationException("Should not call wear sdk when not supported.");
    }
}
