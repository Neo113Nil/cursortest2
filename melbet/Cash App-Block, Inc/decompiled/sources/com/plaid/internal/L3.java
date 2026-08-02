package com.plaid.internal;

import androidx.room.SharedSQLiteStatement;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;

/* loaded from: classes5.dex */
public final class L3 extends SharedSQLiteStatement {
    public L3(WorkflowDatabase_Impl workflowDatabase_Impl) {
        super(workflowDatabase_Impl);
    }

    @Override // androidx.room.SharedSQLiteStatement
    public final String createQuery() {
        return "DELETE FROM workflow_local_key_values WHERE pane_id=?";
    }
}
