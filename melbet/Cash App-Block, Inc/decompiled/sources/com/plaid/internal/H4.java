package com.plaid.internal;

import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;
import java.util.concurrent.Callable;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class H4 implements C4 {
    public final WorkflowDatabase_Impl a;
    public final D4 b;

    public H4(WorkflowDatabase_Impl workflowDatabase_Impl) {
        this.a = workflowDatabase_Impl;
        this.b = new D4(workflowDatabase_Impl);
        new E4(workflowDatabase_Impl);
    }

    @Override // com.plaid.internal.C4
    public final Object a(String str, String str2, C0261q0 c0261q0) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(2, "SELECT * FROM workflow_pane WHERE workflow_id=? AND id=?");
        acquire.bindString(1, str);
        acquire.bindString(2, str2);
        CancellationSignal cancellationSignal = new CancellationSignal();
        return CoroutinesRoom.Companion.execute(this.a, cancellationSignal, new G4(this, acquire), c0261q0);
    }

    @Override // com.plaid.internal.C4
    public final Object a(String str, String str2, byte[] bArr, S2 s2) {
        return CoroutinesRoom.Companion.execute((RoomDatabase) this.a, true, (Callable) new F4(this, str, str2, bArr), (ContinuationImpl) s2);
    }
}
