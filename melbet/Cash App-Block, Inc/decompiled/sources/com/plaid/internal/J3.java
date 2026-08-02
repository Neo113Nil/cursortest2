package com.plaid.internal;

import androidx.room.SharedSQLiteStatement;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;

/* loaded from: classes5.dex */
public final class J3 extends SharedSQLiteStatement {
    public J3(WorkflowDatabase_Impl workflowDatabase_Impl) {
        super(workflowDatabase_Impl);
    }

    @Override // androidx.room.SharedSQLiteStatement
    public final String createQuery() {
        return "REPLACE INTO workflow_local_key_values (pane_id, `key`, string) VALUES (?, ?, ?)";
    }
}
