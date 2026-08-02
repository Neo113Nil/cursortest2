package com.squareup.cash.clientsync.persistence;

import android.database.sqlite.SQLiteException;
import androidx.room.TransactorKt;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.clientsync.database.ClientSyncDatabaseImpl;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda3;
import com.squareup.util.android.drawable.DrawablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class SqlClientSyncTransactor implements ClientSyncTransactor {
    public final /* synthetic */ int $r8$classId;
    public final Object database;

    public /* synthetic */ SqlClientSyncTransactor(Object obj, int i) {
        this.$r8$classId = i;
        this.database = obj;
    }

    @Override // com.squareup.cash.clientsync.persistence.ClientSyncTransactor
    public final void transaction(Function1 function1) {
        int i = this.$r8$classId;
        Object obj = this.database;
        switch (i) {
            case 0:
                ((ClientSyncDatabaseImpl) obj).transactionWithWrapper(new ComposeDialogKt$$ExternalSyntheticLambda3(2, function1));
                return;
            case 1:
                ((ClientSyncTransactor) obj).transaction(new SsnViewKt$$ExternalSyntheticLambda1(27, function1));
                return;
            default:
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                try {
                    ((CashAccountDatabaseImpl) obj).transactionWithWrapper(new RealClientSyncTransactor$$ExternalSyntheticLambda0(function1, ref$ObjectRef, 1));
                    return;
                } catch (SQLiteException e) {
                    if (ref$ObjectRef.element == null || !DrawablesKt.access$isNoActiveTransactionException(e)) {
                        throw e;
                    }
                    Object obj2 = ref$ObjectRef.element;
                    obj2.getClass();
                    throw ((Throwable) obj2);
                }
        }
    }

    @Override // com.squareup.cash.clientsync.persistence.ClientSyncTransactor
    public final Object transactionWithResult(Function1 function1) {
        int i = this.$r8$classId;
        Object obj = this.database;
        switch (i) {
            case 0:
                return TransactorKt.transactionWithResult$default((ClientSyncDatabaseImpl) obj, new ComposeDialogKt$$ExternalSyntheticLambda3(1, function1));
            case 1:
                return ((ClientSyncTransactor) obj).transactionWithResult(new SsnViewKt$$ExternalSyntheticLambda1(26, function1));
            default:
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                try {
                    return TransactorKt.transactionWithResult$default((CashAccountDatabaseImpl) obj, new RealClientSyncTransactor$$ExternalSyntheticLambda0(function1, ref$ObjectRef, 0));
                } catch (SQLiteException e) {
                    if (ref$ObjectRef.element == null || !DrawablesKt.access$isNoActiveTransactionException(e)) {
                        throw e;
                    }
                    Object obj2 = ref$ObjectRef.element;
                    obj2.getClass();
                    throw ((Throwable) obj2);
                }
        }
    }
}
