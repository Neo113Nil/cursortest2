package com.plaid.internal;

import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;

/* renamed from: com.plaid.internal.a8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0097a8 extends EntityDeletionOrUpdateAdapter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0097a8(WorkflowDatabase_Impl workflowDatabase_Impl) {
        super(workflowDatabase_Impl);
        workflowDatabase_Impl.getClass();
    }

    @Override // androidx.room.EntityDeletionOrUpdateAdapter
    public final void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
        h8 h8Var = (h8) obj;
        supportSQLiteStatement.bindString(1, h8Var.a);
        supportSQLiteStatement.bindString(2, h8Var.b);
    }

    @Override // androidx.room.SharedSQLiteStatement
    public final String createQuery() {
        return "DELETE FROM `workflow_analytics` WHERE `workflow_id` = ? AND `id` = ?";
    }
}
