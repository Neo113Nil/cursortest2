package com.plaid.internal;

import androidx.room.SharedSQLiteStatement;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;

/* renamed from: com.plaid.internal.c8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0117c8 extends SharedSQLiteStatement {
    public C0117c8(WorkflowDatabase_Impl workflowDatabase_Impl) {
        super(workflowDatabase_Impl);
    }

    @Override // androidx.room.SharedSQLiteStatement
    public final String createQuery() {
        return "DELETE FROM workflow_analytics WHERE workflow_id=?";
    }
}
