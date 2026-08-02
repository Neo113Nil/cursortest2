package androidx.room.coroutines;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.LinesIterator;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;

/* loaded from: classes3.dex */
public final class ConnectionWithLock implements SQLiteConnection, Mutex {
    public CoroutineContext acquireCoroutineContext;
    public Throwable acquireThrowable;
    public final SQLiteConnection delegate;
    public final Mutex lock;

    public ConnectionWithLock(SQLiteConnection sQLiteConnection) {
        MutexImpl mutexImpl = new MutexImpl();
        sQLiteConnection.getClass();
        this.delegate = sQLiteConnection;
        this.lock = mutexImpl;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.delegate.close();
    }

    public final void dump(StringBuilder sb) {
        Iterable iterable;
        if (this.acquireCoroutineContext == null && this.acquireThrowable == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
            return;
        }
        sb.append("\t\tStatus: Acquired connection");
        sb.append('\n');
        CoroutineContext coroutineContext = this.acquireCoroutineContext;
        if (coroutineContext != null) {
            sb.append("\t\tCoroutine: " + coroutineContext);
            sb.append('\n');
        }
        Throwable th = this.acquireThrowable;
        if (th != null) {
            sb.append("\t\tAcquired:");
            sb.append('\n');
            String stackTraceToString = ExceptionsKt__ExceptionsKt.stackTraceToString(th);
            stackTraceToString.getClass();
            LinesIterator linesIterator = new LinesIterator(stackTraceToString);
            if (linesIterator.hasNext()) {
                Object next = linesIterator.next();
                if (linesIterator.hasNext()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(next);
                    while (linesIterator.hasNext()) {
                        arrayList.add(linesIterator.next());
                    }
                    iterable = arrayList;
                } else {
                    iterable = CollectionsKt__CollectionsJVMKt.listOf(next);
                }
            } else {
                iterable = EmptyList.INSTANCE;
            }
            Iterator it = CollectionsKt.drop(iterable, 1).iterator();
            while (it.hasNext()) {
                sb.append("\t\t" + ((String) it.next()));
                sb.append('\n');
            }
        }
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final boolean isLocked() {
        return this.lock.isLocked();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final Object lock(Continuation continuation) {
        return this.lock.lock(continuation);
    }

    @Override // androidx.sqlite.SQLiteConnection
    public final SQLiteStatement prepare(String str) {
        str.getClass();
        return this.delegate.prepare(str);
    }

    public final String toString() {
        return this.delegate.toString();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final boolean tryLock(Object obj) {
        return this.lock.tryLock(obj);
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final void unlock(Object obj) {
        this.lock.unlock(obj);
    }
}
