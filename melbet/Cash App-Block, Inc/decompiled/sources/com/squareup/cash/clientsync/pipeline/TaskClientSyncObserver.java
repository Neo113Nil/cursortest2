package com.squareup.cash.clientsync.pipeline;

import com.squareup.cash.clientsync.pipeline.SyncRequestOperation;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class TaskClientSyncObserver implements ClientSyncRequestObserver {
    public ArrayList syncObservers;

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncRequestObserver
    public final void onAfterSyncRequestOperation(SyncRequestOperation.Result result) {
        result.getClass();
        ArrayList arrayList = this.syncObservers;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(it.next());
            TaskId taskId = result.getSyncRequestOperation().taskId;
            throw null;
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(it2.next());
            throw null;
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncRequestObserver
    public final void onBeforeSyncRequestOperation(SyncRequestOperation syncRequestOperation) {
        syncRequestOperation.getClass();
        ArrayList arrayList = this.syncObservers;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(it.next());
            throw null;
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(it2.next());
            throw null;
        }
    }
}
