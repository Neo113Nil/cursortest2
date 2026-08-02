package com.plaid.internal;

import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import com.plaid.internal.C0317w3;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class g8 implements Y7 {
    public final WorkflowDatabase_Impl a;
    public final C0097a8 b;
    public final C0107b8 c;

    public g8(WorkflowDatabase_Impl workflowDatabase_Impl) {
        this.a = workflowDatabase_Impl;
        this.b = new C0097a8(workflowDatabase_Impl);
        this.c = new C0107b8(workflowDatabase_Impl);
        new C0117c8(workflowDatabase_Impl);
        new d8(workflowDatabase_Impl);
    }

    @Override // com.plaid.internal.Y7
    public final Object a(C0335y3 c0335y3) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(0, "SELECT * FROM workflow_analytics");
        CancellationSignal cancellationSignal = new CancellationSignal();
        return CoroutinesRoom.Companion.execute(this.a, cancellationSignal, new Z7(this, acquire), c0335y3);
    }

    @Override // com.plaid.internal.Y7
    public final Object a(String str, String str2, byte[] bArr, C0317w3.a aVar) {
        return CoroutinesRoom.Companion.execute((RoomDatabase) this.a, true, (Callable) new f8(this, str, str2, bArr), (ContinuationImpl) aVar);
    }

    @Override // com.plaid.internal.Y7
    public final Object a(ArrayList arrayList, C0299u3 c0299u3) {
        return CoroutinesRoom.Companion.execute((RoomDatabase) this.a, true, (Callable) new e8(this, arrayList), (ContinuationImpl) c0299u3);
    }
}
