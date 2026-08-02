package app.cash.sqldelight;

import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class TransacterImpl implements Transacter {
    public final SqlDriver driver;

    public TransacterImpl(SqlDriver sqlDriver) {
        sqlDriver.getClass();
        sqlDriver.getClass();
        this.driver = sqlDriver;
    }

    public static String createArguments(int i) {
        if (i == 0) {
            return "()";
        }
        StringBuilder sb = new StringBuilder((i * 2) + 1);
        sb.append("(?");
        int i2 = i - 1;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(",?");
        }
        sb.append(')');
        return sb.toString();
    }

    public final void notifyQueries(int i, Function1 function1) {
        SqlDriver sqlDriver = this.driver;
        AndroidSqliteDriver.Transaction currentTransaction = sqlDriver.currentTransaction();
        if (currentTransaction != null) {
            if (currentTransaction.registeredQueries.add(Integer.valueOf(i))) {
                function1.invoke(new CashApp$$ExternalSyntheticLambda2(currentTransaction, 23));
            }
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            function1.invoke(new BaseTransacterImpl$$ExternalSyntheticLambda1(linkedHashSet, 0));
            String[] strArr = (String[]) linkedHashSet.toArray(new String[0]);
            sqlDriver.notifyListeners((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    public final Object postTransactionCleanup(AndroidSqliteDriver.Transaction transaction, AndroidSqliteDriver.Transaction transaction2, Throwable th, Object obj) {
        LinkedHashSet linkedHashSet = transaction.registeredQueries;
        LinkedHashSet linkedHashSet2 = transaction.pendingTables;
        ArrayList arrayList = transaction.postCommitHooks;
        ArrayList arrayList2 = transaction.postRollbackHooks;
        boolean z = transaction.successful;
        boolean z2 = false;
        if (transaction2 != null) {
            if (z && transaction.childrenSuccessful) {
                z2 = true;
            }
            transaction2.childrenSuccessful = z2;
            transaction2.postCommitHooks.addAll(arrayList);
            transaction2.postRollbackHooks.addAll(arrayList2);
            transaction2.registeredQueries.addAll(linkedHashSet);
            transaction2.pendingTables.addAll(linkedHashSet2);
        } else if (z && transaction.childrenSuccessful) {
            if (!linkedHashSet2.isEmpty()) {
                String[] strArr = (String[]) linkedHashSet2.toArray(new String[0]);
                this.driver.notifyListeners((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            linkedHashSet2.clear();
            linkedHashSet.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Function0) it.next()).invoke();
            }
            arrayList.clear();
        } else {
            try {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((Function0) it2.next()).invoke();
                }
                arrayList2.clear();
            } catch (Throwable th2) {
                if (th == null) {
                    throw th2;
                }
                StringBuilder sb = new StringBuilder("Exception while rolling back from an exception.\nOriginal exception: ");
                sb.append(th);
                Throwable cause = th.getCause();
                sb.append("\nwith cause ");
                sb.append(cause);
                sb.append("\n\nRollback exception: ");
                sb.append(th2);
                throw new Throwable(sb.toString(), th2);
            }
        }
        if (transaction2 == null && (th instanceof RollbackException)) {
            return null;
        }
        if (th == null) {
            return obj;
        }
        throw th;
    }

    public final Object transactionWithWrapper(Function1 function1) {
        Object obj;
        AndroidSqliteDriver.Transaction transaction = (AndroidSqliteDriver.Transaction) this.driver.newTransaction().getValue();
        transaction.getClass();
        AndroidSqliteDriver.Transaction transaction2 = transaction.enclosingTransaction;
        Throwable th = null;
        try {
            obj = function1.invoke(new TransactionWrapper(transaction));
            try {
                transaction.successful = true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            obj = null;
        }
        transaction.endTransaction$runtime();
        return postTransactionCleanup(transaction, transaction2, th, obj);
    }
}
