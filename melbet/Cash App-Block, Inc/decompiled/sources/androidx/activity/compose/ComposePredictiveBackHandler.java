package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import androidx.activity.compose.internal.BackHandlerCompat$navigationEventHandler$1;
import androidx.activity.compose.internal.BackHandlerCompat$onBackPressedCallback$1;
import androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1;
import androidx.paging.CachedPagingDataKt$cachedIn$4;
import com.squareup.cash.clientsync.readers.SyncValueSpec;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import papa.PapaEvent;

/* loaded from: classes3.dex */
public final class ComposePredictiveBackHandler extends SyncValueSpec {
    public BufferedChannel activeChannel;
    public StandaloneCoroutine activeJob;
    public Function2 currentOnBack;
    public boolean isPredictiveBack;
    public final CoroutineScope scope;

    public ComposePredictiveBackHandler(CoroutineScope coroutineScope, PredictiveBackHandlerInfo predictiveBackHandlerInfo) {
        super(predictiveBackHandlerInfo);
        this.scope = coroutineScope;
        this.currentOnBack = new CachedPagingDataKt$cachedIn$4(2, null, 1);
    }

    @Override // com.squareup.cash.clientsync.readers.SyncValueSpec
    public final void onBackCancelled() {
        BufferedChannel bufferedChannel = this.activeChannel;
        if (bufferedChannel != null) {
            bufferedChannel.closeOrCancelImpl(new CancellationException("onBack cancelled"), true);
        }
        StandaloneCoroutine standaloneCoroutine = this.activeJob;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        this.activeChannel = null;
        this.activeJob = null;
        this.isPredictiveBack = false;
    }

    @Override // com.squareup.cash.clientsync.readers.SyncValueSpec
    public final void onBackCompleted() {
        if (this.activeChannel != null && !this.isPredictiveBack) {
            onBackCancelled();
        }
        Continuation continuation = null;
        if (this.activeChannel == null) {
            this.isPredictiveBack = false;
            this.activeChannel = PapaEvent.Channel$default(-2, BufferOverflow.SUSPEND, null, 4);
            this.activeJob = JobKt.launch$default(this.scope, null, null, new VirtualCameraState$connect$2$1(this, continuation, 1), 3);
        }
        BufferedChannel bufferedChannel = this.activeChannel;
        if (bufferedChannel != null) {
            bufferedChannel.close(null);
        }
        this.isPredictiveBack = false;
    }

    @Override // com.squareup.cash.clientsync.readers.SyncValueSpec
    public final void onBackProgressed(BackEventCompat backEventCompat) {
        BufferedChannel bufferedChannel = this.activeChannel;
        if (bufferedChannel != null) {
            bufferedChannel.mo1159trySendJP2dKIU(backEventCompat);
        }
    }

    @Override // com.squareup.cash.clientsync.readers.SyncValueSpec
    public final void onBackStarted() {
        onBackCancelled();
        if (super.isBackEnabled()) {
            this.isPredictiveBack = true;
            this.activeChannel = PapaEvent.Channel$default(-2, BufferOverflow.SUSPEND, null, 4);
            this.activeJob = JobKt.launch$default(this.scope, null, null, new VirtualCameraState$connect$2$1(this, (Continuation) null, 1), 3);
        }
    }

    public final void setBackEnabled(boolean z) {
        StandaloneCoroutine standaloneCoroutine;
        if (!z && super.isBackEnabled() && (standaloneCoroutine = this.activeJob) != null && !standaloneCoroutine.isActive()) {
            onBackCancelled();
        }
        ((BackHandlerCompat$onBackPressedCallback$1) this.valueName).setEnabled(z);
        ((BackHandlerCompat$navigationEventHandler$1) this.valueType).setBackEnabled(z);
    }
}
