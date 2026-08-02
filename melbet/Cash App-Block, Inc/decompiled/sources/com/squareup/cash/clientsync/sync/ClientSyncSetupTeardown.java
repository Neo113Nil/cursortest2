package com.squareup.cash.clientsync.sync;

import androidx.lifecycle.Lifecycle;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.UiActivitySetupTeardown;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2;

/* loaded from: classes.dex */
public final class ClientSyncSetupTeardown implements UiActivitySetupTeardown {
    public final RealClientSyncer clientSyncer;
    public final SessionManager sessionManager;
    public final SyncValueReader syncValueReader;

    public ClientSyncSetupTeardown(RealClientSyncer realClientSyncer, SessionManager sessionManager, SyncValueReader syncValueReader) {
        this.clientSyncer = realClientSyncer;
        this.sessionManager = sessionManager;
        this.syncValueReader = syncValueReader;
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        Lifecycle lifecycle = (Lifecycle) obj;
        coroutineScope.getClass();
        lifecycle.getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new CombineKt$combineInternal$2.AnonymousClass1(null, this, lifecycle, 2), 1);
        return StateFlowKt.noOpTeardown;
    }
}
