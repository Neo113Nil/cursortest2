package androidx.room.coroutines;

import androidx.collection.CircularArray;
import androidx.room.Room;
import androidx.sqlite.SQLiteConnection;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;
import kotlinx.coroutines.sync.SemaphoreImpl;
import kotlinx.coroutines.sync.SemaphoreKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class Pool {
    public final CircularArray availableConnections;
    public final int capacity;
    public final Function0 connectionFactory;
    public final SemaphoreImpl connectionPermits;
    public final ConnectionWithLock[] connections;
    public boolean isClosed;
    public final ReentrantLock lock = new ReentrantLock();
    public int size;

    public Pool(int i, Function0 function0) {
        this.capacity = i;
        this.connectionFactory = function0;
        this.connections = new ConnectionWithLock[i];
        int i2 = SemaphoreKt.MAX_SPIN_CYCLES;
        this.connectionPermits = new SemaphoreImpl(i);
        CircularArray circularArray = new CircularArray();
        if (i < 1) {
            a$$ExternalSyntheticBUOutline0.m$3("capacity must be >= 1");
            throw null;
        }
        if (i > 1073741824) {
            a$$ExternalSyntheticBUOutline0.m$3("capacity must be <= 2^30");
            throw null;
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        circularArray.capacityBitmask = i - 1;
        circularArray.elements = new Object[i];
        this.availableConnections = circularArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[Catch: all -> 0x008c, TryCatch #1 {all -> 0x008c, blocks: (B:13:0x0047, B:15:0x004b, B:17:0x0051, B:20:0x0058, B:21:0x0072, B:23:0x0078, B:27:0x008e, B:28:0x0093, B:29:0x0094, B:30:0x009b), top: B:12:0x0047, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094 A[Catch: all -> 0x008c, TryCatch #1 {all -> 0x008c, blocks: (B:13:0x0047, B:15:0x004b, B:17:0x0051, B:20:0x0058, B:21:0x0072, B:23:0x0078, B:27:0x008e, B:28:0x0093, B:29:0x0094, B:30:0x009b), top: B:12:0x0047, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object acquire(ContinuationImpl continuationImpl) {
        Pool$acquire$1 pool$acquire$1;
        int i;
        ReentrantLock reentrantLock;
        try {
            try {
                if (continuationImpl instanceof Pool$acquire$1) {
                    pool$acquire$1 = (Pool$acquire$1) continuationImpl;
                    int i2 = pool$acquire$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        pool$acquire$1.label = i2 - PKIFailureInfo.systemUnavail;
                        Object obj = pool$acquire$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = pool$acquire$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            pool$acquire$1.L$0 = this;
                            pool$acquire$1.label = 1;
                            if (this.connectionPermits.acquire(pool$acquire$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            this = pool$acquire$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                        }
                        reentrantLock = this.lock;
                        CircularArray circularArray = this.availableConnections;
                        reentrantLock.lock();
                        if (!this.isClosed) {
                            Room.throwSQLiteException(21, "Connection pool is closed");
                            throw null;
                        }
                        if (circularArray.head == circularArray.tail && this.size < this.capacity) {
                            ConnectionWithLock connectionWithLock = new ConnectionWithLock((SQLiteConnection) this.connectionFactory.invoke());
                            ConnectionWithLock[] connectionWithLockArr = this.connections;
                            int i3 = this.size;
                            this.size = i3 + 1;
                            connectionWithLockArr[i3] = connectionWithLock;
                            circularArray.addLast(connectionWithLock);
                        }
                        int i4 = circularArray.head;
                        if (i4 == circularArray.tail) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        Object[] objArr = circularArray.elements;
                        Object obj2 = objArr[i4];
                        objArr[i4] = null;
                        circularArray.head = (i4 + 1) & circularArray.capacityBitmask;
                        return (ConnectionWithLock) obj2;
                    }
                }
                if (!this.isClosed) {
                }
            } finally {
                reentrantLock.unlock();
            }
            reentrantLock = this.lock;
            CircularArray circularArray2 = this.availableConnections;
            reentrantLock.lock();
        } catch (Throwable th) {
            this.connectionPermits.release();
            throw th;
        }
        pool$acquire$1 = new Pool$acquire$1(this, continuationImpl);
        Object obj3 = pool$acquire$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pool$acquire$1.label;
        if (i != 0) {
        }
    }

    public final void close() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.isClosed = true;
            for (ConnectionWithLock connectionWithLock : this.connections) {
                if (connectionWithLock != null) {
                    connectionWithLock.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void dump(StringBuilder sb) {
        CircularArray circularArray = this.availableConnections;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            int i = (circularArray.tail - circularArray.head) & circularArray.capacityBitmask;
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 >= 0) {
                    int i3 = circularArray.tail;
                    int i4 = circularArray.head;
                    int i5 = circularArray.capacityBitmask;
                    if (i2 < ((i3 - i4) & i5)) {
                        Object obj = circularArray.elements[(i4 + i2) & i5];
                        obj.getClass();
                        createListBuilder.add(obj);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.capacity + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            SemaphoreImpl semaphoreImpl = this.connectionPermits;
            semaphoreImpl.getClass();
            sb2.append(Math.max(SemaphoreAndMutexImpl._availablePermits$volatile$FU.get(semaphoreImpl), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + build.getSize() + ")[" + CollectionsKt.joinToString$default(build, null, null, null, 0, null, null, 63) + "], ");
            sb.append(")");
            sb.append('\n');
            ConnectionWithLock[] connectionWithLockArr = this.connections;
            int length = connectionWithLockArr.length;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                ConnectionWithLock connectionWithLock = connectionWithLockArr[i7];
                i6++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i6);
                sb3.append("] - ");
                sb3.append(connectionWithLock != null ? connectionWithLock.delegate.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (connectionWithLock != null) {
                    connectionWithLock.dump(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void recycle(ConnectionWithLock connectionWithLock) {
        connectionWithLock.getClass();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.availableConnections.addLast(connectionWithLock);
            reentrantLock.unlock();
            this.connectionPermits.release();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
