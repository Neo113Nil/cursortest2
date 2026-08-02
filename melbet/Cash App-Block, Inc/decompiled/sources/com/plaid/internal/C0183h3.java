package com.plaid.internal;

import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.plaid.internal.h3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0183h3 implements Factory {
    public final Provider a;

    public C0183h3(C0147d3 c0147d3, Provider provider) {
        this.a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        WorkflowDatabase workflowDatabase = (WorkflowDatabase) this.a.get();
        workflowDatabase.getClass();
        return new S3(workflowDatabase);
    }
}
