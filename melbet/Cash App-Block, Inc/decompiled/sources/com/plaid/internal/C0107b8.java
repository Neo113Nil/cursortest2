package com.plaid.internal;

import androidx.room.SharedSQLiteStatement;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;

/* renamed from: com.plaid.internal.b8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0107b8 extends SharedSQLiteStatement {
    public C0107b8(WorkflowDatabase_Impl workflowDatabase_Impl) {
        super(workflowDatabase_Impl);
    }

    @Override // androidx.room.SharedSQLiteStatement
    public final String createQuery() {
        return "REPLACE INTO workflow_analytics (workflow_id, id, analytics_model) VALUES (?, ?, ?)";
    }
}
