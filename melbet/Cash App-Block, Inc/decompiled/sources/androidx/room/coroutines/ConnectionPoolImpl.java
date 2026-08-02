package androidx.room.coroutines;

import android.database.SQLException;
import androidx.compose.material3.SliderState$drag$2;
import androidx.room.Room;
import androidx.sqlite.SQLiteConnection;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import app.cash.zipline.loader.ZiplineLoader$ModuleJob$run$3;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.svg.internal.AndroidSvg;
import com.bumptech.glide.GlideBuilder$1;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.ThreadLocalElement;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class ConnectionPoolImpl implements ConnectionPool {
    public final AtomicBoolean _isClosed;
    public final Pool readers;
    public final ThreadLocal threadLocal;
    public final long timeout;
    public final Pool writers;

    public ConnectionPoolImpl(final AndroidSvg androidSvg, final String str, int i) {
        str.getClass();
        this.threadLocal = new ThreadLocal();
        final int i2 = 0;
        this._isClosed = new AtomicBoolean(false);
        Duration.Companion companion = Duration.Companion;
        this.timeout = DurationKt.toDuration(30, DurationUnit.SECONDS);
        if (i <= 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Maximum number of readers must be greater than 0");
            throw null;
        }
        this.readers = new Pool(i, new Function0() { // from class: androidx.room.coroutines.ConnectionPoolImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                String str2 = str;
                AndroidSvg androidSvg2 = androidSvg;
                switch (i3) {
                    case 0:
                        SQLiteConnection open = androidSvg2.open(str2);
                        Room.execSQL(open, "PRAGMA query_only = 1");
                        return open;
                    default:
                        return androidSvg2.open(str2);
                }
            }
        });
        final int i3 = 1;
        this.writers = new Pool(1, new Function0() { // from class: androidx.room.coroutines.ConnectionPoolImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                String str2 = str;
                AndroidSvg androidSvg2 = androidSvg;
                switch (i32) {
                    case 0:
                        SQLiteConnection open = androidSvg2.open(str2);
                        Room.execSQL(open, "PRAGMA query_only = 1");
                        return open;
                    default:
                        return androidSvg2.open(str2);
                }
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this._isClosed.compareAndSet(false, true)) {
            this.readers.close();
            this.writers.close();
        }
    }

    public final void throwTimeoutException(boolean z) {
        String str = z ? "reader" : "writer";
        StringBuilder sb = new StringBuilder();
        sb.append("Timed out attempting to acquire a " + str + " connection.");
        sb.append("\n\nWriter pool:\n");
        this.writers.dump(sb);
        sb.append("Reader pool:");
        sb.append('\n');
        this.readers.dump(sb);
        Room.throwSQLiteException(5, sb.toString());
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0199 A[Catch: all -> 0x01b1, TRY_LEAVE, TryCatch #1 {all -> 0x01b1, blocks: (B:16:0x0193, B:18:0x0199, B:23:0x01a3, B:20:0x01a8), top: B:15:0x0193 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0133 A[Catch: all -> 0x0150, TryCatch #0 {all -> 0x0150, blocks: (B:62:0x012d, B:64:0x0133, B:68:0x014c, B:69:0x0156, B:73:0x0160, B:77:0x01b2, B:78:0x01b9, B:79:0x01ba, B:80:0x01bb, B:81:0x01be), top: B:61:0x012d }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bb A[Catch: all -> 0x0150, TryCatch #0 {all -> 0x0150, blocks: (B:62:0x012d, B:64:0x0133, B:68:0x014c, B:69:0x0156, B:73:0x0160, B:77:0x01b2, B:78:0x01b9, B:79:0x01ba, B:80:0x01bb, B:81:0x01be), top: B:61:0x012d }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0076  */
    @Override // androidx.room.coroutines.ConnectionPool
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object useConnection(boolean z, Function2 function2, Continuation continuation) {
        ConnectionPoolImpl$useConnection$1 connectionPoolImpl$useConnection$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        Throwable th;
        Pool pool;
        CoroutineContext context;
        Ref$ObjectRef ref$ObjectRef2;
        Pool pool2;
        Ref$ObjectRef ref$ObjectRef3;
        Function2 function22;
        CoroutineContext coroutineContext;
        ConnectionPoolImpl connectionPoolImpl;
        boolean z2;
        Ref$ObjectRef ref$ObjectRef4;
        Ref$ObjectRef ref$ObjectRef5;
        ConnectionWithLock connectionWithLock;
        PooledConnectionImpl pooledConnectionImpl;
        PooledConnectionImpl pooledConnectionImpl2;
        ConnectionPoolImpl connectionPoolImpl2 = this;
        boolean z3 = z;
        Function2 function23 = function2;
        try {
            if (continuation instanceof ConnectionPoolImpl$useConnection$1) {
                connectionPoolImpl$useConnection$1 = (ConnectionPoolImpl$useConnection$1) continuation;
                int i2 = connectionPoolImpl$useConnection$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    connectionPoolImpl$useConnection$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = connectionPoolImpl$useConnection$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = connectionPoolImpl$useConnection$1.label;
                    int i3 = 1;
                    CoroutineContext coroutineContext2 = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    Object[] objArr3 = 0;
                    Object[] objArr4 = 0;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (connectionPoolImpl2._isClosed.get()) {
                            Room.throwSQLiteException(21, "Connection pool is closed");
                            throw null;
                        }
                        ThreadLocal threadLocal = connectionPoolImpl2.threadLocal;
                        PooledConnectionImpl pooledConnectionImpl3 = (PooledConnectionImpl) threadLocal.get();
                        GlideBuilder$1 glideBuilder$1 = ConnectionElement.Key;
                        if (pooledConnectionImpl3 == null) {
                            ConnectionElement connectionElement = (ConnectionElement) connectionPoolImpl$useConnection$1.getContext().get(glideBuilder$1);
                            pooledConnectionImpl3 = connectionElement != null ? connectionElement.connectionWrapper : null;
                        }
                        if (pooledConnectionImpl3 == null) {
                            Pool pool3 = z3 ? connectionPoolImpl2.readers : connectionPoolImpl2.writers;
                            ref$ObjectRef = new Ref$ObjectRef();
                            try {
                                context = connectionPoolImpl$useConnection$1.getContext();
                                ref$ObjectRef2 = new Ref$ObjectRef();
                                try {
                                    long j = connectionPoolImpl2.timeout;
                                    SliderState$drag$2 sliderState$drag$2 = new SliderState$drag$2((Object) ref$ObjectRef2, (Object) pool3, (Continuation) (objArr == true ? 1 : 0), 16);
                                    connectionPoolImpl$useConnection$1.L$0 = connectionPoolImpl2;
                                    connectionPoolImpl$useConnection$1.L$1 = function23;
                                    connectionPoolImpl$useConnection$1.L$2 = pool3;
                                    connectionPoolImpl$useConnection$1.L$3 = ref$ObjectRef;
                                    connectionPoolImpl$useConnection$1.L$4 = context;
                                    connectionPoolImpl$useConnection$1.L$5 = ref$ObjectRef2;
                                    connectionPoolImpl$useConnection$1.Z$0 = z3;
                                    connectionPoolImpl$useConnection$1.label = 3;
                                    if (JobKt.m4184withTimeoutKLykuaI(j, sliderState$drag$2, connectionPoolImpl$useConnection$1) != coroutineSingletons) {
                                        pool2 = pool3;
                                        ref$ObjectRef3 = ref$ObjectRef;
                                        function22 = function23;
                                        coroutineContext = context;
                                        connectionPoolImpl = connectionPoolImpl2;
                                        z2 = z3;
                                        ref$ObjectRef4 = ref$ObjectRef2;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    pool2 = pool3;
                                    ref$ObjectRef3 = ref$ObjectRef;
                                    function22 = function23;
                                    coroutineContext = context;
                                    connectionPoolImpl = connectionPoolImpl2;
                                    ref$ObjectRef5 = ref$ObjectRef3;
                                    connectionWithLock = (ConnectionWithLock) ref$ObjectRef2.element;
                                    if (connectionWithLock == null) {
                                    }
                                    ref$ObjectRef5.element = pooledConnectionImpl;
                                    if (!(th instanceof TimeoutCancellationException)) {
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                pool = pool3;
                                throw th;
                            }
                        } else {
                            if (!z3 && pooledConnectionImpl3.isReadOnly) {
                                Room.throwSQLiteException(1, "Cannot upgrade connection from reader to writer");
                                throw null;
                            }
                            if (connectionPoolImpl$useConnection$1.getContext().get(glideBuilder$1) == null) {
                                ConnectionElement connectionElement2 = new ConnectionElement(pooledConnectionImpl3);
                                threadLocal.getClass();
                                CoroutineContext plus = CoroutineContext.Element.DefaultImpls.plus(connectionElement2, new ThreadLocalElement(pooledConnectionImpl3, threadLocal));
                                ZiplineLoader$ModuleJob$run$3 ziplineLoader$ModuleJob$run$3 = new ZiplineLoader$ModuleJob$run$3(function23, pooledConnectionImpl3, objArr2 == true ? 1 : 0, i3);
                                connectionPoolImpl$useConnection$1.label = 1;
                                Object withContext = JobKt.withContext(plus, ziplineLoader$ModuleJob$run$3, connectionPoolImpl$useConnection$1);
                                if (withContext != coroutineSingletons) {
                                    return withContext;
                                }
                            } else {
                                connectionPoolImpl$useConnection$1.label = 2;
                                Object invoke = function23.invoke(pooledConnectionImpl3, connectionPoolImpl$useConnection$1);
                                if (invoke != coroutineSingletons) {
                                    return invoke;
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    if (i == 3) {
                        z2 = connectionPoolImpl$useConnection$1.Z$0;
                        ref$ObjectRef4 = connectionPoolImpl$useConnection$1.L$5;
                        coroutineContext = connectionPoolImpl$useConnection$1.L$4;
                        ref$ObjectRef3 = connectionPoolImpl$useConnection$1.L$3;
                        pool2 = connectionPoolImpl$useConnection$1.L$2;
                        function22 = (Function2) connectionPoolImpl$useConnection$1.L$1;
                        connectionPoolImpl = (ConnectionPoolImpl) connectionPoolImpl$useConnection$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                        } catch (Throwable th4) {
                            th = th4;
                            ref$ObjectRef2 = ref$ObjectRef4;
                            z3 = z2;
                            connectionPoolImpl2 = connectionPoolImpl;
                            context = coroutineContext;
                            function23 = function22;
                            function22 = function23;
                            coroutineContext = context;
                            connectionPoolImpl = connectionPoolImpl2;
                            ref$ObjectRef5 = ref$ObjectRef3;
                            connectionWithLock = (ConnectionWithLock) ref$ObjectRef2.element;
                            if (connectionWithLock == null) {
                            }
                            ref$ObjectRef5.element = pooledConnectionImpl;
                            if (!(th instanceof TimeoutCancellationException)) {
                            }
                        }
                    } else {
                        if (i != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ref$ObjectRef5 = (Ref$ObjectRef) connectionPoolImpl$useConnection$1.L$1;
                        pool = (Pool) connectionPoolImpl$useConnection$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            try {
                                pooledConnectionImpl2 = (PooledConnectionImpl) ref$ObjectRef5.element;
                                if (pooledConnectionImpl2 != null) {
                                    if (pooledConnectionImpl2._isRecycled.compareAndSet(false, true)) {
                                        try {
                                            Room.execSQL(pooledConnectionImpl2.delegate, "ROLLBACK TRANSACTION");
                                        } catch (SQLException unused) {
                                        }
                                    }
                                    ConnectionWithLock connectionWithLock2 = pooledConnectionImpl2.delegate;
                                    connectionWithLock2.acquireCoroutineContext = null;
                                    connectionWithLock2.acquireThrowable = null;
                                    pool.recycle(connectionWithLock2);
                                }
                            } catch (Throwable unused2) {
                            }
                            return obj;
                        } catch (Throwable th5) {
                            th = th5;
                            ref$ObjectRef = ref$ObjectRef5;
                            th = th;
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    ref$ObjectRef2 = ref$ObjectRef4;
                    th = null;
                    z3 = z2;
                    ref$ObjectRef5 = ref$ObjectRef3;
                    connectionWithLock = (ConnectionWithLock) ref$ObjectRef2.element;
                    if (connectionWithLock == null) {
                        coroutineContext.getClass();
                        connectionWithLock.acquireCoroutineContext = coroutineContext;
                        connectionWithLock.acquireThrowable = new Throwable();
                        pooledConnectionImpl = new PooledConnectionImpl(connectionWithLock, connectionPoolImpl.readers != connectionPoolImpl.writers && z3);
                    } else {
                        pooledConnectionImpl = null;
                    }
                    ref$ObjectRef5.element = pooledConnectionImpl;
                    if (!(th instanceof TimeoutCancellationException)) {
                        connectionPoolImpl.throwTimeoutException(z3);
                        throw null;
                    }
                    if (th != null) {
                        throw th;
                    }
                    if (pooledConnectionImpl == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    connectionPoolImpl.getClass();
                    ConnectionElement connectionElement3 = new ConnectionElement(pooledConnectionImpl);
                    ThreadLocal threadLocal2 = connectionPoolImpl.threadLocal;
                    threadLocal2.getClass();
                    CoroutineContext plus2 = CoroutineContext.Element.DefaultImpls.plus(connectionElement3, new ThreadLocalElement(pooledConnectionImpl, threadLocal2));
                    ZiplineLoader$ModuleJob$run$3 ziplineLoader$ModuleJob$run$32 = new ZiplineLoader$ModuleJob$run$3(function22, ref$ObjectRef5, objArr3 == true ? 1 : 0, 2);
                    connectionPoolImpl$useConnection$1.L$0 = pool2;
                    connectionPoolImpl$useConnection$1.L$1 = ref$ObjectRef5;
                    connectionPoolImpl$useConnection$1.L$2 = null;
                    connectionPoolImpl$useConnection$1.L$3 = null;
                    connectionPoolImpl$useConnection$1.L$4 = null;
                    connectionPoolImpl$useConnection$1.L$5 = null;
                    connectionPoolImpl$useConnection$1.label = 4;
                    obj = JobKt.withContext(plus2, ziplineLoader$ModuleJob$run$32, connectionPoolImpl$useConnection$1);
                    if (obj != coroutineSingletons) {
                        pool = pool2;
                        pooledConnectionImpl2 = (PooledConnectionImpl) ref$ObjectRef5.element;
                        if (pooledConnectionImpl2 != null) {
                        }
                        return obj;
                    }
                    return coroutineSingletons;
                }
            }
            connectionWithLock = (ConnectionWithLock) ref$ObjectRef2.element;
            if (connectionWithLock == null) {
            }
            ref$ObjectRef5.element = pooledConnectionImpl;
            if (!(th instanceof TimeoutCancellationException)) {
            }
        } catch (Throwable th6) {
            th = th6;
            ref$ObjectRef = ref$ObjectRef5;
            pool = pool2;
            th = th;
            throw th;
        }
        connectionPoolImpl$useConnection$1 = new ConnectionPoolImpl$useConnection$1(connectionPoolImpl2, continuation);
        Object obj2 = connectionPoolImpl$useConnection$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = connectionPoolImpl$useConnection$1.label;
        int i32 = 1;
        CoroutineContext coroutineContext22 = null;
        Object[] objArr5 = 0;
        Object[] objArr22 = 0;
        Object[] objArr32 = 0;
        Object[] objArr42 = 0;
        if (i != 0) {
        }
        ref$ObjectRef2 = ref$ObjectRef4;
        th = null;
        z3 = z2;
        ref$ObjectRef5 = ref$ObjectRef3;
    }

    public ConnectionPoolImpl(AndroidSvg androidSvg) {
        this.threadLocal = new ThreadLocal();
        this._isClosed = new AtomicBoolean(false);
        Duration.Companion companion = Duration.Companion;
        this.timeout = DurationKt.toDuration(30, DurationUnit.SECONDS);
        Pool pool = new Pool(1, new Worker$$ExternalSyntheticLambda0(androidSvg, 16));
        this.readers = pool;
        this.writers = pool;
    }
}
