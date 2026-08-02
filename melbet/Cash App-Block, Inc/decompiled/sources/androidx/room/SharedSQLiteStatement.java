package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes3.dex */
public abstract class SharedSQLiteStatement {
    private final RoomDatabase database;
    private final AtomicBoolean lock;
    private final Lazy stmt$delegate;

    public SharedSQLiteStatement(WorkflowDatabase_Impl workflowDatabase_Impl) {
        workflowDatabase_Impl.getClass();
        this.database = workflowDatabase_Impl;
        this.lock = new AtomicBoolean(false);
        this.stmt$delegate = LazyKt.lazy(new Worker$$ExternalSyntheticLambda0(this, 15));
    }

    public SupportSQLiteStatement acquire() {
        assertNotMainThread();
        return this.lock.compareAndSet(false, true) ? (SupportSQLiteStatement) this.stmt$delegate.getValue() : createNewStatement();
    }

    public void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    public final SupportSQLiteStatement createNewStatement() {
        return this.database.compileStatement(createQuery());
    }

    public abstract String createQuery();

    public void release(SupportSQLiteStatement supportSQLiteStatement) {
        supportSQLiteStatement.getClass();
        if (supportSQLiteStatement == ((SupportSQLiteStatement) this.stmt$delegate.getValue())) {
            this.lock.set(false);
        }
    }
}
