package com.plaid.internal;

import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;
import java.util.concurrent.Callable;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class P3 implements I3 {
    public final WorkflowDatabase_Impl a;
    public final J3 b;
    public final L3 c;

    public P3(WorkflowDatabase_Impl workflowDatabase_Impl) {
        this.a = workflowDatabase_Impl;
        this.b = new J3(workflowDatabase_Impl);
        new K3(workflowDatabase_Impl);
        this.c = new L3(workflowDatabase_Impl);
    }

    @Override // com.plaid.internal.I3
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(2, "SELECT string FROM workflow_local_key_values WHERE pane_id=? AND `key`=?");
        acquire.bindString(1, str);
        acquire.bindString(2, str2);
        CancellationSignal cancellationSignal = new CancellationSignal();
        return CoroutinesRoom.Companion.execute(this.a, cancellationSignal, new O3(this, acquire), continuationImpl);
    }

    @Override // com.plaid.internal.I3
    public final Object a(String str, ContinuationImpl continuationImpl) {
        return CoroutinesRoom.Companion.execute((RoomDatabase) this.a, true, (Callable) new N3(this, str), continuationImpl);
    }

    @Override // com.plaid.internal.I3
    public final Object a(String str, String str2, String str3, R3 r3) {
        return CoroutinesRoom.Companion.execute((RoomDatabase) this.a, true, (Callable) new M3(this, str, str2, str3), (ContinuationImpl) r3);
    }
}
