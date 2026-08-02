package androidx.datastore.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.contour.ContourLayout$geometry$1;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class FileStorageConnection implements Closeable {
    public final AtomicBoolean closed;
    public final SingleProcessCoordinator coordinator;
    public final File file;
    public final ContourLayout$geometry$1 onClose;
    public final Serializer serializer;
    public final MutexImpl transactionMutex;

    public FileStorageConnection(File file, Serializer serializer, SingleProcessCoordinator singleProcessCoordinator, ContourLayout$geometry$1 contourLayout$geometry$1) {
        singleProcessCoordinator.getClass();
        this.file = file;
        this.serializer = serializer;
        this.coordinator = singleProcessCoordinator;
        this.onClose = contourLayout$geometry$1;
        this.closed = new AtomicBoolean(false);
        this.transactionMutex = new MutexImpl();
    }

    @Override // androidx.datastore.core.Closeable
    public final void close() {
        this.closed.set(true);
        this.onClose.invoke();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|(1:(3:9|10|11)(2:42|43))(2:44|(6:46|47|48|49|50|(1:52)(1:53))(2:57|58))|12|13|14|(2:(1:17)|18)(2:20|21)))|59|6|(0)(0)|12|13|14|(0)(0)|(2:(0)|(1:40))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readScope(StorageConnectionKt$readData$2 storageConnectionKt$readData$2, ContinuationImpl continuationImpl) {
        FileStorageConnection$readScope$1 fileStorageConnection$readScope$1;
        int i;
        boolean tryLock;
        Throwable th;
        FileReadScope fileReadScope;
        FileStorageConnection fileStorageConnection;
        boolean z;
        if (continuationImpl instanceof FileStorageConnection$readScope$1) {
            fileStorageConnection$readScope$1 = (FileStorageConnection$readScope$1) continuationImpl;
            int i2 = fileStorageConnection$readScope$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                fileStorageConnection$readScope$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = fileStorageConnection$readScope$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fileStorageConnection$readScope$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (this.closed.get()) {
                        a$$ExternalSyntheticBUOutline0.m$1("StorageConnection has already been disposed.");
                        return null;
                    }
                    tryLock = this.transactionMutex.tryLock(null);
                    try {
                        FileReadScope fileReadScope2 = new FileReadScope(this.file, this.serializer);
                        try {
                            Object valueOf = Boolean.valueOf(tryLock);
                            fileStorageConnection$readScope$1.L$0 = this;
                            fileStorageConnection$readScope$1.L$1 = fileReadScope2;
                            fileStorageConnection$readScope$1.Z$0 = tryLock;
                            fileStorageConnection$readScope$1.label = 1;
                            Object invoke = storageConnectionKt$readData$2.invoke(fileReadScope2, valueOf, fileStorageConnection$readScope$1);
                            if (invoke == obj2) {
                                return obj2;
                            }
                            fileStorageConnection = this;
                            z = tryLock;
                            obj = invoke;
                            fileReadScope = fileReadScope2;
                        } catch (Throwable th2) {
                            th = th2;
                            fileReadScope = fileReadScope2;
                            fileReadScope.close();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (tryLock) {
                            this.transactionMutex.unlock(null);
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = fileStorageConnection$readScope$1.Z$0;
                    fileReadScope = fileStorageConnection$readScope$1.L$1;
                    fileStorageConnection = fileStorageConnection$readScope$1.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                    } catch (Throwable th4) {
                        tryLock = z;
                        this = fileStorageConnection;
                        th = th4;
                        try {
                            fileReadScope.close();
                            throw th;
                        } catch (Throwable th5) {
                            ExceptionsKt__ExceptionsKt.addSuppressed(th, th5);
                            throw th;
                        }
                    }
                }
                fileReadScope.close();
                th = null;
                if (th != null) {
                    if (z) {
                        fileStorageConnection.transactionMutex.unlock(null);
                    }
                    return obj;
                }
                try {
                    throw th;
                } catch (Throwable th6) {
                    th = th6;
                    tryLock = z;
                    this = fileStorageConnection;
                    if (tryLock) {
                    }
                    throw th;
                }
            }
        }
        fileStorageConnection$readScope$1 = new FileStorageConnection$readScope$1(this, continuationImpl);
        Object obj3 = fileStorageConnection$readScope$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fileStorageConnection$readScope$1.label;
        if (i != 0) {
        }
        fileReadScope.close();
        th = null;
        if (th != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0088, code lost:
    
        if (r3 == r2) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cb A[Catch: all -> 0x010d, IOException -> 0x010f, TRY_ENTER, TryCatch #6 {IOException -> 0x010f, blocks: (B:18:0x00cb, B:20:0x00d1, B:25:0x00ec, B:26:0x010c, B:32:0x0119, B:39:0x0127, B:42:0x0124), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0119 A[Catch: all -> 0x010d, IOException -> 0x010f, TRY_ENTER, TRY_LEAVE, TryCatch #6 {IOException -> 0x010f, blocks: (B:18:0x00cb, B:20:0x00d1, B:25:0x00ec, B:26:0x010c, B:32:0x0119, B:39:0x0127, B:42:0x0124), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.File, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeScope(DataStoreImpl$writeData$2 dataStoreImpl$writeData$2, ContinuationImpl continuationImpl) {
        FileStorageConnection$writeScope$1 fileStorageConnection$writeScope$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        ?? r11;
        ?? r3;
        Function2 function2;
        FileWriteScope fileWriteScope;
        Throwable th;
        FileWriteScope fileWriteScope2;
        FileStorageConnection fileStorageConnection;
        Mutex mutex;
        File file;
        try {
            try {
                try {
                    try {
                        try {
                            if (continuationImpl instanceof FileStorageConnection$writeScope$1) {
                                fileStorageConnection$writeScope$1 = (FileStorageConnection$writeScope$1) continuationImpl;
                                int i2 = fileStorageConnection$writeScope$1.label;
                                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                                    fileStorageConnection$writeScope$1.label = i2 - PKIFailureInfo.systemUnavail;
                                    Object obj = fileStorageConnection$writeScope$1.result;
                                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i = fileStorageConnection$writeScope$1.label;
                                    boolean z = true;
                                    if (i != 0) {
                                        SafeTrace.throwOnFailure(obj);
                                        if (this.closed.get()) {
                                            a$$ExternalSyntheticBUOutline0.m$1("StorageConnection has already been disposed.");
                                            return null;
                                        }
                                        File file2 = this.file;
                                        File parentFile = file2.getCanonicalFile().getParentFile();
                                        if (parentFile != null) {
                                            parentFile.mkdirs();
                                            if (!parentFile.isDirectory()) {
                                                a$$ExternalSyntheticBUOutline0.m$3(file2, "Unable to create parent directories of ");
                                                return null;
                                            }
                                        }
                                        fileStorageConnection$writeScope$1.L$0 = this;
                                        fileStorageConnection$writeScope$1.L$1 = dataStoreImpl$writeData$2;
                                        MutexImpl mutexImpl = this.transactionMutex;
                                        fileStorageConnection$writeScope$1.L$2 = mutexImpl;
                                        fileStorageConnection$writeScope$1.label = 1;
                                        Object lock = mutexImpl.lock(fileStorageConnection$writeScope$1);
                                        function2 = dataStoreImpl$writeData$2;
                                        r11 = mutexImpl;
                                    } else {
                                        if (i != 1) {
                                            if (i != 2) {
                                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                                return null;
                                            }
                                            fileWriteScope2 = fileStorageConnection$writeScope$1.L$3;
                                            file = (File) fileStorageConnection$writeScope$1.L$2;
                                            mutex = (Mutex) fileStorageConnection$writeScope$1.L$1;
                                            fileStorageConnection = fileStorageConnection$writeScope$1.L$0;
                                            try {
                                                SafeTrace.throwOnFailure(obj);
                                                try {
                                                    fileWriteScope2.close();
                                                    th = null;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                                if (th == null) {
                                                    throw th;
                                                }
                                                if (file.exists()) {
                                                    try {
                                                        Files.move(file.toPath(), fileStorageConnection.file.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                                    } catch (IOException unused) {
                                                        z = false;
                                                    }
                                                    if (!z) {
                                                        throw new IOException("Unable to rename " + file + " to " + fileStorageConnection.file + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                                    }
                                                }
                                                mutex.unlock(null);
                                                return Unit.INSTANCE;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                try {
                                                    fileWriteScope2.close();
                                                } catch (Throwable th4) {
                                                    ExceptionsKt__ExceptionsKt.addSuppressed(th, th4);
                                                }
                                                throw th;
                                            }
                                        }
                                        Mutex mutex2 = (Mutex) fileStorageConnection$writeScope$1.L$2;
                                        Function2 function22 = (Function2) fileStorageConnection$writeScope$1.L$1;
                                        FileStorageConnection fileStorageConnection2 = fileStorageConnection$writeScope$1.L$0;
                                        SafeTrace.throwOnFailure(obj);
                                        r11 = mutex2;
                                        this = fileStorageConnection2;
                                        function2 = function22;
                                    }
                                    r3 = new File(this.file.getAbsolutePath() + ".tmp");
                                    fileWriteScope = new FileWriteScope(r3, this.serializer);
                                    fileStorageConnection$writeScope$1.L$0 = this;
                                    fileStorageConnection$writeScope$1.L$1 = r11;
                                    fileStorageConnection$writeScope$1.L$2 = r3;
                                    fileStorageConnection$writeScope$1.L$3 = fileWriteScope;
                                    fileStorageConnection$writeScope$1.label = 2;
                                    if (function2.invoke(fileWriteScope, fileStorageConnection$writeScope$1) != coroutineSingletons) {
                                        fileStorageConnection = this;
                                        mutex = r11;
                                        file = r3;
                                        fileWriteScope2 = fileWriteScope;
                                        fileWriteScope2.close();
                                        th = null;
                                        if (th == null) {
                                        }
                                    }
                                    return coroutineSingletons;
                                }
                            }
                            fileStorageConnection$writeScope$1.L$0 = this;
                            fileStorageConnection$writeScope$1.L$1 = r11;
                            fileStorageConnection$writeScope$1.L$2 = r3;
                            fileStorageConnection$writeScope$1.L$3 = fileWriteScope;
                            fileStorageConnection$writeScope$1.label = 2;
                            if (function2.invoke(fileWriteScope, fileStorageConnection$writeScope$1) != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        } catch (Throwable th5) {
                            th = th5;
                            fileWriteScope2 = fileWriteScope;
                            fileWriteScope2.close();
                            throw th;
                        }
                        fileWriteScope = new FileWriteScope(r3, this.serializer);
                    } catch (IOException e) {
                        e = e;
                        if (r3.exists()) {
                            r3.delete();
                        }
                        throw e;
                    }
                    r3 = new File(this.file.getAbsolutePath() + ".tmp");
                } catch (Throwable th6) {
                    th = th6;
                    r11.unlock(null);
                    throw th;
                }
                if (i != 0) {
                }
            } catch (IOException e2) {
                e = e2;
                r3 = dataStoreImpl$writeData$2;
                r11 = coroutineSingletons;
            }
        } catch (Throwable th7) {
            th = th7;
            r11 = coroutineSingletons;
            r11.unlock(null);
            throw th;
        }
        fileStorageConnection$writeScope$1 = new FileStorageConnection$writeScope$1(this, continuationImpl);
        Object obj2 = fileStorageConnection$writeScope$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fileStorageConnection$writeScope$1.label;
        boolean z2 = true;
    }
}
