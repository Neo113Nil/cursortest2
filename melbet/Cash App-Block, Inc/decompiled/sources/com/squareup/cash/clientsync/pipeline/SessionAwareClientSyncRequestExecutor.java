package com.squareup.cash.clientsync.pipeline;

import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.cash.clientsync.pipeline.SyncRequestOperation;
import com.squareup.cash.data.profile.RealProfileManager$setPhoto$2;
import com.squareup.cash.session.backend.NotInitiatedState;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.session.backend.SwitchingState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class SessionAwareClientSyncRequestExecutor implements ClientSyncRequestExecutor {
    public final CoroutineScope coroutineScope;
    public final ConcurrentLinkedDeque deferredSyncRequests = new ConcurrentLinkedDeque();
    public final RealClientSyncRequestExecutor delegateRequestExecutor;
    public final SessionManager sessionManager;

    public final class DeferredSyncRequest {
        public final SyncRequestOperation syncRequestOperation;
        public final CompletableDeferredImpl syncRequestOperationResult;

        public DeferredSyncRequest(SyncRequestOperation syncRequestOperation, CompletableDeferredImpl completableDeferredImpl) {
            this.syncRequestOperation = syncRequestOperation;
            this.syncRequestOperationResult = completableDeferredImpl;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DeferredSyncRequest) {
                DeferredSyncRequest deferredSyncRequest = (DeferredSyncRequest) obj;
                return this.syncRequestOperation.equals(deferredSyncRequest.syncRequestOperation) && this.syncRequestOperationResult == deferredSyncRequest.syncRequestOperationResult;
            }
            return false;
        }

        public final int hashCode() {
            return this.syncRequestOperationResult.hashCode() + (this.syncRequestOperation.hashCode() * 31);
        }

        public final String toString() {
            return "DeferredSyncRequest(syncRequestOperation=" + this.syncRequestOperation + ", syncRequestOperationResult=" + this.syncRequestOperationResult + ")";
        }
    }

    public SessionAwareClientSyncRequestExecutor(CoroutineScope coroutineScope, RealClientSyncRequestExecutor realClientSyncRequestExecutor, SessionManager sessionManager) {
        this.coroutineScope = coroutineScope;
        this.delegateRequestExecutor = realClientSyncRequestExecutor;
        this.sessionManager = sessionManager;
        JobKt.launch$default(coroutineScope, null, null, new CashApp$onCreate$4$1$1(this, null, 17), 3);
    }

    public final void executeDeferredRequests() {
        while (true) {
            DeferredSyncRequest deferredSyncRequest = (DeferredSyncRequest) this.deferredSyncRequests.pollFirst();
            if (deferredSyncRequest == null) {
                return;
            }
            JobKt.launch$default(this.coroutineScope, null, null, new RealProfileManager$setPhoto$2(deferredSyncRequest, this.delegateRequestExecutor.executeSyncRequest(deferredSyncRequest.syncRequestOperation), (Continuation) null, 5), 3);
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncRequestExecutor
    public final Deferred executeSyncRequest(SyncRequestOperation syncRequestOperation) {
        SessionState sessionState = (SessionState) this.sessionManager.getSessionState().getValue();
        if ((sessionState instanceof NotInitiatedState) || (sessionState instanceof SwitchingState)) {
            return JobKt.CompletableDeferred(new SyncRequestOperation.Result.Skipped(syncRequestOperation));
        }
        if (sessionState instanceof SessionState.Authenticated) {
            executeDeferredRequests();
            return this.delegateRequestExecutor.executeSyncRequest(syncRequestOperation);
        }
        if (!(sessionState instanceof SessionState.Initiated)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl();
        this.deferredSyncRequests.add(new DeferredSyncRequest(syncRequestOperation, completableDeferredImpl));
        return completableDeferredImpl;
    }
}
