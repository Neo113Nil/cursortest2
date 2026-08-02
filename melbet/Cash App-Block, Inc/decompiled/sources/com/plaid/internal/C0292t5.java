package com.plaid.internal;

import android.app.Application;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import dagger.internal.Factory;

/* renamed from: com.plaid.internal.t5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0292t5 implements Factory {
    public final Factory a;

    public C0292t5(C0266q5 c0266q5, Factory factory) {
        this.a = factory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.a.get();
        application.getClass();
        RoomDatabase.Builder databaseBuilder = Room.databaseBuilder(application, WorkflowDatabase.class, "plaid_workflow_database");
        databaseBuilder.requireMigration = false;
        databaseBuilder.allowDestructiveMigrationOnDowngrade = true;
        return (WorkflowDatabase) databaseBuilder.build();
    }
}
