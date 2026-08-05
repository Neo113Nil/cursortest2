package androidx.wear.remote.interactions;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.os.Parcel;
import android.os.ResultReceiver;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.wear.remote.interactions.RemoteActivityHelper;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeClient;
import com.google.android.gms.wearable.Wearable;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.annotation.AnnotationRetention;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: RemoteActivityHelper.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 52\u00020\u0001:\u000556789B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0003J\"\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#H\u0007J\u0010\u0010$\u001a\u00020%2\u0006\u0010 \u001a\u00020!H\u0002J'\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#H\u0001¢\u0006\u0002\b'J*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u0003J8\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020!2\b\u0010*\u001a\u0004\u0018\u00010#2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001f0,2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010-\u001a\u00020.H\u0002J7\u0010/\u001a\u00020!2\b\u00100\u001a\u0004\u0018\u00010!2\b\u00101\u001a\u0004\u0018\u0001022\b\u0010*\u001a\u0004\u0018\u00010#2\n\b\u0002\u00103\u001a\u0004\u0018\u00010#H\u0001¢\u0006\u0002\b4R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006:"}, d2 = {"Landroidx/wear/remote/interactions/RemoteActivityHelper;", "", "context", "Landroid/content/Context;", "executor", "Ljava/util/concurrent/Executor;", "<init>", "(Landroid/content/Context;Ljava/util/concurrent/Executor;)V", "nodeClient", "Lcom/google/android/gms/wearable/NodeClient;", "getNodeClient$wear_remote_interactions$annotations", "()V", "getNodeClient$wear_remote_interactions", "()Lcom/google/android/gms/wearable/NodeClient;", "setNodeClient$wear_remote_interactions", "(Lcom/google/android/gms/wearable/NodeClient;)V", "remoteInteractionsManager", "Landroidx/wear/remote/interactions/IRemoteInteractionsManager;", "getRemoteInteractionsManager$wear_remote_interactions$annotations", "getRemoteInteractionsManager$wear_remote_interactions", "()Landroidx/wear/remote/interactions/IRemoteInteractionsManager;", "setRemoteInteractionsManager$wear_remote_interactions", "(Landroidx/wear/remote/interactions/IRemoteInteractionsManager;)V", "availabilityStatus", "Lkotlinx/coroutines/flow/Flow;", "", "getAvailabilityStatus", "()Lkotlinx/coroutines/flow/Flow;", "getRemoteActivityHelperStatusInternal", "startRemoteActivity", "Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/lang/Void;", "targetIntent", "Landroid/content/Intent;", "targetNodeId", "", "checkTargetIntentPrecondition", "", "startRemoteActivityLegacy", "startRemoteActivityLegacy$wear_remote_interactions", "startCreatingIntentForRemoteActivity", "intent", "nodeId", "completer", "Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;", "callback", "Landroidx/wear/remote/interactions/RemoteActivityHelper$Callback;", "createIntent", "extraIntent", "resultReceiver", "Landroid/os/ResultReceiver;", "packageName", "createIntent$wear_remote_interactions", "Companion", "SendResult", "RemoteIntentException", "Callback", "RemoteIntentResultReceiver", "wear-remote-interactions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RemoteActivityHelper {
    public static final String ACTION_REMOTE_INTENT = "com.google.android.wearable.intent.action.REMOTE_INTENT";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String DEFAULT_PACKAGE = "com.google.android.wearable.app";
    private static final String EXTRA_INTENT = "com.google.android.wearable.intent.extra.INTENT";
    private static final String EXTRA_NODE_ID = "com.google.android.wearable.intent.extra.NODE_ID";
    private static final String EXTRA_RESULT_RECEIVER = "com.google.android.wearable.intent.extra.RESULT_RECEIVER";
    public static final int RESULT_FAILED = 1;
    public static final int RESULT_OK = 0;
    public static final int STATUS_AVAILABLE = 3;
    public static final int STATUS_TEMPORARILY_UNAVAILABLE = 2;
    public static final int STATUS_UNAVAILABLE = 1;
    public static final int STATUS_UNKNOWN = 0;
    private static boolean sUseWearSdkImpl;
    private final Context context;
    private final Executor executor;
    private NodeClient nodeClient;
    private IRemoteInteractionsManager remoteInteractionsManager;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RemoteActivityHelper.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bb\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\u0006\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\bj\u0002`\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/wear/remote/interactions/RemoteActivityHelper$Callback;", "", "intentCreated", "", "intent", "Landroid/content/Intent;", "onFailure", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "wear-remote-interactions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    interface Callback {
        void intentCreated(Intent intent);

        void onFailure(Exception exception);
    }

    /* compiled from: RemoteActivityHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/wear/remote/interactions/RemoteActivityHelper$SendResult;", "", "wear-remote-interactions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface SendResult {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RemoteActivityHelper(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getNodeClient$wear_remote_interactions$annotations() {
    }

    public static /* synthetic */ void getRemoteInteractionsManager$wear_remote_interactions$annotations() {
    }

    @JvmStatic
    public static final Intent getTargetIntent(Intent intent) {
        return INSTANCE.getTargetIntent(intent);
    }

    @JvmStatic
    public static final String getTargetNodeId(Intent intent) {
        return INSTANCE.getTargetNodeId(intent);
    }

    public final ListenableFuture<Void> startRemoteActivity(Intent targetIntent) {
        Intrinsics.checkNotNullParameter(targetIntent, "targetIntent");
        return startRemoteActivity$default(this, targetIntent, null, 2, null);
    }

    public RemoteActivityHelper(Context context, Executor executor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.context = context;
        this.executor = executor;
        NodeClient nodeClient = Wearable.getNodeClient(context);
        Intrinsics.checkNotNullExpressionValue(nodeClient, "getNodeClient(...)");
        this.nodeClient = nodeClient;
        this.remoteInteractionsManager = new RemoteInteractionsManagerCompat(context);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ RemoteActivityHelper(Context context, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, executor);
        if ((i & 2) != 0) {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
            executor = newSingleThreadExecutor;
        }
    }

    /* compiled from: RemoteActivityHelper.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0019J\u0015\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0001¢\u0006\u0002\b\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/wear/remote/interactions/RemoteActivityHelper$Companion;", "", "<init>", "()V", "ACTION_REMOTE_INTENT", "", "STATUS_UNKNOWN", "", "STATUS_UNAVAILABLE", "STATUS_TEMPORARILY_UNAVAILABLE", "STATUS_AVAILABLE", "EXTRA_INTENT", "EXTRA_NODE_ID", "EXTRA_RESULT_RECEIVER", "sUseWearSdkImpl", "", "RESULT_OK", "RESULT_FAILED", "DEFAULT_PACKAGE", "getTargetIntent", "Landroid/content/Intent;", "intent", "getTargetNodeId", "getRemoteIntentResultReceiver", "Landroid/os/ResultReceiver;", "getRemoteIntentResultReceiver$wear_remote_interactions", "getResultReceiverForSending", "receiver", "getResultReceiverForSending$wear_remote_interactions", "wear-remote-interactions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Intent getTargetIntent(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return (Intent) intent.getParcelableExtra(RemoteActivityHelper.EXTRA_INTENT);
        }

        @JvmStatic
        public final String getTargetNodeId(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return intent.getStringExtra(RemoteActivityHelper.EXTRA_NODE_ID);
        }

        @JvmStatic
        public final ResultReceiver getRemoteIntentResultReceiver$wear_remote_interactions(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return (ResultReceiver) intent.getParcelableExtra(RemoteActivityHelper.EXTRA_RESULT_RECEIVER);
        }

        @JvmStatic
        public final ResultReceiver getResultReceiverForSending$wear_remote_interactions(ResultReceiver receiver) {
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            Parcel obtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
            receiver.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            ResultReceiver resultReceiver = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            Intrinsics.checkNotNull(resultReceiver);
            return resultReceiver;
        }
    }

    /* renamed from: getNodeClient$wear_remote_interactions, reason: from getter */
    public final NodeClient getNodeClient() {
        return this.nodeClient;
    }

    public final void setNodeClient$wear_remote_interactions(NodeClient nodeClient) {
        Intrinsics.checkNotNullParameter(nodeClient, "<set-?>");
        this.nodeClient = nodeClient;
    }

    /* renamed from: getRemoteInteractionsManager$wear_remote_interactions, reason: from getter */
    public final IRemoteInteractionsManager getRemoteInteractionsManager() {
        return this.remoteInteractionsManager;
    }

    public final void setRemoteInteractionsManager$wear_remote_interactions(IRemoteInteractionsManager iRemoteInteractionsManager) {
        Intrinsics.checkNotNullParameter(iRemoteInteractionsManager, "<set-?>");
        this.remoteInteractionsManager = iRemoteInteractionsManager;
    }

    public final Flow<Integer> getAvailabilityStatus() {
        if (!RemoteInteractionsUtil.INSTANCE.isCurrentDeviceAWatch$wear_remote_interactions(this.context)) {
            return FlowKt.flowOf(0);
        }
        if (!this.remoteInteractionsManager.getIsAvailabilityStatusApiSupported()) {
            return FlowKt.flowOf(0);
        }
        if (Build.VERSION.SDK_INT < 33) {
            return FlowKt.flowOf(0);
        }
        return getRemoteActivityHelperStatusInternal();
    }

    private final Flow<Integer> getRemoteActivityHelperStatusInternal() {
        return FlowKt.callbackFlow(new RemoteActivityHelper$getRemoteActivityHelperStatusInternal$1(this, null));
    }

    public static /* synthetic */ ListenableFuture startRemoteActivity$default(RemoteActivityHelper remoteActivityHelper, Intent intent, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return remoteActivityHelper.startRemoteActivity(intent, str);
    }

    public final ListenableFuture<Void> startRemoteActivity(Intent targetIntent, String targetNodeId) {
        Intrinsics.checkNotNullParameter(targetIntent, "targetIntent");
        if (this.remoteInteractionsManager.getIsWearSdkApiStartRemoteActivitySupported()) {
            return startRemoteActivity(this.remoteInteractionsManager, targetIntent, this.executor);
        }
        return startRemoteActivityLegacy$wear_remote_interactions(targetIntent, targetNodeId);
    }

    private final void checkTargetIntentPrecondition(Intent targetIntent) {
        if (!Intrinsics.areEqual("android.intent.action.VIEW", targetIntent.getAction())) {
            throw new IllegalArgumentException("Only android.intent.action.VIEW action is currently supported for starting a remote activity".toString());
        }
        if (targetIntent.getData() == null) {
            throw new IllegalArgumentException("Data URI is required when starting a remote activity".toString());
        }
        Set<String> categories = targetIntent.getCategories();
        if (categories == null || !categories.contains("android.intent.category.BROWSABLE")) {
            throw new IllegalArgumentException("The category android.intent.category.BROWSABLE must be present on the intent".toString());
        }
    }

    public static /* synthetic */ ListenableFuture startRemoteActivityLegacy$wear_remote_interactions$default(RemoteActivityHelper remoteActivityHelper, Intent intent, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return remoteActivityHelper.startRemoteActivityLegacy$wear_remote_interactions(intent, str);
    }

    public final ListenableFuture<Void> startRemoteActivityLegacy$wear_remote_interactions(final Intent targetIntent, final String targetNodeId) {
        Intrinsics.checkNotNullParameter(targetIntent, "targetIntent");
        ListenableFuture<Void> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.wear.remote.interactions.RemoteActivityHelper$$ExternalSyntheticLambda4
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                Unit startRemoteActivityLegacy$lambda$0;
                startRemoteActivityLegacy$lambda$0 = RemoteActivityHelper.startRemoteActivityLegacy$lambda$0(RemoteActivityHelper.this, targetIntent, targetNodeId, completer);
                return startRemoteActivityLegacy$lambda$0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(future, "getFuture(...)");
        return future;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startRemoteActivityLegacy$lambda$0(final RemoteActivityHelper remoteActivityHelper, Intent intent, String str, final CallbackToFutureAdapter.Completer it) {
        Intrinsics.checkNotNullParameter(it, "it");
        remoteActivityHelper.checkTargetIntentPrecondition(intent);
        remoteActivityHelper.startCreatingIntentForRemoteActivity(intent, str, it, remoteActivityHelper.nodeClient, new Callback() { // from class: androidx.wear.remote.interactions.RemoteActivityHelper$startRemoteActivityLegacy$1$1
            @Override // androidx.wear.remote.interactions.RemoteActivityHelper.Callback
            public void intentCreated(Intent intent2) {
                Context context;
                Intrinsics.checkNotNullParameter(intent2, "intent");
                context = RemoteActivityHelper.this.context;
                context.sendBroadcast(intent2);
            }

            @Override // androidx.wear.remote.interactions.RemoteActivityHelper.Callback
            public void onFailure(Exception exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                it.setException(exception);
            }
        });
        return Unit.INSTANCE;
    }

    private final ListenableFuture<Void> startRemoteActivity(final IRemoteInteractionsManager remoteInteractionsManager, final Intent targetIntent, final Executor executor) {
        ListenableFuture<Void> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.wear.remote.interactions.RemoteActivityHelper$$ExternalSyntheticLambda1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                Object startRemoteActivity$lambda$0;
                startRemoteActivity$lambda$0 = RemoteActivityHelper.startRemoteActivity$lambda$0(RemoteActivityHelper.this, targetIntent, remoteInteractionsManager, executor, completer);
                return startRemoteActivity$lambda$0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(future, "getFuture(...)");
        return future;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object startRemoteActivity$lambda$0(RemoteActivityHelper remoteActivityHelper, Intent intent, IRemoteInteractionsManager iRemoteInteractionsManager, Executor executor, final CallbackToFutureAdapter.Completer completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        remoteActivityHelper.checkTargetIntentPrecondition(intent);
        Uri data = intent.getData();
        Intrinsics.checkNotNull(data);
        Set<String> categories = intent.getCategories();
        Intrinsics.checkNotNull(categories);
        iRemoteInteractionsManager.startRemoteActivity(data, CollectionsKt.toList(categories), executor, new OutcomeReceiver<Void, Throwable>() { // from class: androidx.wear.remote.interactions.RemoteActivityHelper$startRemoteActivity$1$1
            @Override // android.os.OutcomeReceiver
            public void onResult(Void result) {
                RemoteInteractionsUtil.INSTANCE.logDOrNotUser$wear_remote_interactions("startRemoteActivity", "onResult");
                completer.set(null);
            }

            @Override // android.os.OutcomeReceiver
            public void onError(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                RemoteInteractionsUtil.INSTANCE.logDOrNotUser$wear_remote_interactions("startRemoteActivity", "onError:" + error);
                completer.setException(error);
            }
        });
        return "startRemoteActivity";
    }

    private final void startCreatingIntentForRemoteActivity(final Intent intent, final String nodeId, final CallbackToFutureAdapter.Completer<Void> completer, final NodeClient nodeClient, final Callback callback) {
        if (RemoteInteractionsUtil.INSTANCE.isCurrentDeviceAWatch$wear_remote_interactions(this.context)) {
            callback.intentCreated(createIntent$wear_remote_interactions(intent, new RemoteIntentResultReceiver(completer, 1), nodeId, DEFAULT_PACKAGE));
            return;
        }
        if (nodeId != null) {
            Task<String> companionPackageForNode = nodeClient.getCompanionPackageForNode(nodeId);
            Executor executor = this.executor;
            final Function1 function1 = new Function1() { // from class: androidx.wear.remote.interactions.RemoteActivityHelper$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit startCreatingIntentForRemoteActivity$lambda$0;
                    startCreatingIntentForRemoteActivity$lambda$0 = RemoteActivityHelper.startCreatingIntentForRemoteActivity$lambda$0(RemoteActivityHelper.Callback.this, nodeId, this, intent, completer, (String) obj);
                    return startCreatingIntentForRemoteActivity$lambda$0;
                }
            };
            companionPackageForNode.addOnSuccessListener(executor, new OnSuccessListener() { // from class: androidx.wear.remote.interactions.RemoteActivityHelper$$ExternalSyntheticLambda6
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    Function1.this.invoke(obj);
                }
            }).addOnFailureListener(this.executor, new OnFailureListener() { // from class: androidx.wear.remote.interactions.RemoteActivityHelper$$ExternalSyntheticLambda7
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    RemoteActivityHelper.startCreatingIntentForRemoteActivity$lambda$2(RemoteActivityHelper.Callback.this, exc);
                }
            });
            return;
        }
        Task<List<Node>> connectedNodes = nodeClient.getConnectedNodes();
        Executor executor2 = this.executor;
        final Function1 function12 = new Function1() { // from class: androidx.wear.remote.interactions.RemoteActivityHelper$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit startCreatingIntentForRemoteActivity$lambda$3;
                startCreatingIntentForRemoteActivity$lambda$3 = RemoteActivityHelper.startCreatingIntentForRemoteActivity$lambda$3(RemoteActivityHelper.Callback.this, completer, nodeClient, this, intent, (List) obj);
                return startCreatingIntentForRemoteActivity$lambda$3;
            }
        };
        connectedNodes.addOnSuccessListener(executor2, new OnSuccessListener() { // from class: androidx.wear.remote.interactions.RemoteActivityHelper$$ExternalSyntheticLambda9
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Function1.this.invoke(obj);
            }
        }).addOnFailureListener(this.executor, new OnFailureListener() { // from class: androidx.wear.remote.interactions.RemoteActivityHelper$$ExternalSyntheticLambda10
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                RemoteActivityHelper.startCreatingIntentForRemoteActivity$lambda$5(RemoteActivityHelper.Callback.this, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startCreatingIntentForRemoteActivity$lambda$0(Callback callback, String str, RemoteActivityHelper remoteActivityHelper, Intent intent, CallbackToFutureAdapter.Completer completer, String str2) {
        if (str2 == null) {
            str2 = DEFAULT_PACKAGE;
        }
        if (str2.length() == 0) {
            callback.onFailure(new Resources.NotFoundException("Device " + str + " is not connected"));
        } else {
            callback.intentCreated(remoteActivityHelper.createIntent$wear_remote_interactions(intent, new RemoteIntentResultReceiver(completer, 1), str, str2));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startCreatingIntentForRemoteActivity$lambda$2(Callback callback, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        callback.onFailure(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startCreatingIntentForRemoteActivity$lambda$3(final Callback callback, CallbackToFutureAdapter.Completer completer, NodeClient nodeClient, final RemoteActivityHelper remoteActivityHelper, final Intent intent, List list) {
        if (list.size() == 0) {
            callback.onFailure(new Resources.NotFoundException("No devices connected"));
        } else {
            final RemoteIntentResultReceiver remoteIntentResultReceiver = new RemoteIntentResultReceiver(completer, list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final Node node = (Node) it.next();
                Task<String> companionPackageForNode = nodeClient.getCompanionPackageForNode(node.getId());
                Executor executor = remoteActivityHelper.executor;
                final Function1 function1 = new Function1() { // from class: androidx.wear.remote.interactions.RemoteActivityHelper$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit startCreatingIntentForRemoteActivity$lambda$3$0;
                        startCreatingIntentForRemoteActivity$lambda$3$0 = RemoteActivityHelper.startCreatingIntentForRemoteActivity$lambda$3$0(RemoteActivityHelper.Callback.this, remoteActivityHelper, intent, remoteIntentResultReceiver, node, (String) obj);
                        return startCreatingIntentForRemoteActivity$lambda$3$0;
                    }
                };
                companionPackageForNode.addOnSuccessListener(executor, new OnSuccessListener() { // from class: androidx.wear.remote.interactions.RemoteActivityHelper$$ExternalSyntheticLambda2
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        Function1.this.invoke(obj);
                    }
                }).addOnFailureListener(remoteActivityHelper.executor, new OnFailureListener() { // from class: androidx.wear.remote.interactions.RemoteActivityHelper$$ExternalSyntheticLambda3
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        RemoteActivityHelper.startCreatingIntentForRemoteActivity$lambda$3$2(RemoteActivityHelper.Callback.this, exc);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startCreatingIntentForRemoteActivity$lambda$3$0(Callback callback, RemoteActivityHelper remoteActivityHelper, Intent intent, RemoteIntentResultReceiver remoteIntentResultReceiver, Node node, String str) {
        if (str == null) {
            str = DEFAULT_PACKAGE;
        }
        callback.intentCreated(remoteActivityHelper.createIntent$wear_remote_interactions(intent, remoteIntentResultReceiver, node.getId(), str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startCreatingIntentForRemoteActivity$lambda$3$2(Callback callback, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        callback.onFailure(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startCreatingIntentForRemoteActivity$lambda$5(Callback callback, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        callback.onFailure(it);
    }

    public static /* synthetic */ Intent createIntent$wear_remote_interactions$default(RemoteActivityHelper remoteActivityHelper, Intent intent, ResultReceiver resultReceiver, String str, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        return remoteActivityHelper.createIntent$wear_remote_interactions(intent, resultReceiver, str, str2);
    }

    public final Intent createIntent$wear_remote_interactions(Intent extraIntent, ResultReceiver resultReceiver, String nodeId, String packageName) {
        Intent intent = new Intent(ACTION_REMOTE_INTENT);
        if (extraIntent != null) {
            intent.putExtra(EXTRA_INTENT, extraIntent);
        }
        if (resultReceiver != null) {
            intent.putExtra(EXTRA_RESULT_RECEIVER, INSTANCE.getResultReceiverForSending$wear_remote_interactions(resultReceiver));
        }
        if (nodeId != null) {
            intent.putExtra(EXTRA_NODE_ID, nodeId);
        }
        if (packageName != null) {
            intent.setPackage(packageName);
        }
        return intent;
    }

    /* compiled from: RemoteActivityHelper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/wear/remote/interactions/RemoteActivityHelper$RemoteIntentException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "<init>", "(Ljava/lang/String;)V", "wear-remote-interactions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteIntentException extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteIntentException(String message) {
            super(message);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RemoteActivityHelper.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/wear/remote/interactions/RemoteActivityHelper$RemoteIntentResultReceiver;", "Landroid/os/ResultReceiver;", "completer", "Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;", "Ljava/lang/Void;", "numNodes", "", "<init>", "(Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;I)V", "numFailedResults", "onReceiveResult", "", "resultCode", "resultData", "Landroid/os/Bundle;", "wear-remote-interactions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class RemoteIntentResultReceiver extends ResultReceiver {
        private final CallbackToFutureAdapter.Completer<Void> completer;
        private int numFailedResults;
        private int numNodes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteIntentResultReceiver(CallbackToFutureAdapter.Completer<Void> completer, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(completer, "completer");
            this.completer = completer;
            this.numNodes = i;
        }

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int resultCode, Bundle resultData) {
            int i = this.numNodes - 1;
            this.numNodes = i;
            if (resultCode != 0) {
                this.numFailedResults++;
            }
            if (i > 0) {
                return;
            }
            if (this.numFailedResults == 0) {
                this.completer.set(null);
            } else {
                this.completer.setException(new RemoteIntentException("There was an error while starting remote activity."));
            }
        }
    }
}
