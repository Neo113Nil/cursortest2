package androidx.datastore.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.Utf8;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public class FileReadScope implements Closeable {
    public final AtomicBoolean closed = new AtomicBoolean(false);
    public final File file;
    public final Serializer serializer;

    public FileReadScope(File file, Serializer serializer) {
        this.file = file;
        this.serializer = serializer;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:25|26))(3:27|28|29))(2:40|(6:44|45|46|47|(1:49)|50)(2:42|43))|30|31))|69|6|7|(0)(0)|30|31|(3:(1:36)|(1:21)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x006e, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.datastore.core.FileReadScope] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object readData$suspendImpl(FileReadScope fileReadScope, ContinuationImpl continuationImpl) {
        FileReadScope$readData$1 fileReadScope$readData$1;
        ?? r2;
        Throwable th;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        Throwable th2;
        if (continuationImpl instanceof FileReadScope$readData$1) {
            fileReadScope$readData$1 = (FileReadScope$readData$1) continuationImpl;
            int i = fileReadScope$readData$1.label;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                fileReadScope$readData$1.label = i - PKIFailureInfo.systemUnavail;
                Object obj = fileReadScope$readData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                r2 = fileReadScope$readData$1.label;
                if (r2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (fileReadScope.closed.get()) {
                        a$$ExternalSyntheticBUOutline0.m$1("This scope has already been closed.");
                        return null;
                    }
                    try {
                        FileInputStream fileInputStream3 = new FileInputStream(fileReadScope.file);
                        try {
                            Serializer serializer = fileReadScope.serializer;
                            fileReadScope$readData$1.L$0 = fileReadScope;
                            fileReadScope$readData$1.L$1 = fileInputStream3;
                            fileReadScope$readData$1.label = 1;
                            Object readFrom = serializer.readFrom(fileInputStream3);
                            if (readFrom != coroutineSingletons) {
                                fileInputStream2 = fileInputStream3;
                                obj = readFrom;
                            }
                        } catch (Throwable th3) {
                            r2 = fileReadScope;
                            fileInputStream2 = fileInputStream3;
                            th2 = th3;
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                        File file = fileReadScope.file;
                        Serializer serializer2 = fileReadScope.serializer;
                        if (!file.exists()) {
                            return serializer2.getDefaultValue();
                        }
                        FileInputStream fileInputStream4 = new FileInputStream(fileReadScope.file);
                        try {
                            fileReadScope$readData$1.L$0 = fileInputStream4;
                            fileReadScope$readData$1.L$1 = null;
                            fileReadScope$readData$1.label = 2;
                            Object readFrom2 = serializer2.readFrom(fileInputStream4);
                            if (readFrom2 != coroutineSingletons) {
                                obj = readFrom2;
                                fileInputStream = fileInputStream4;
                                Utf8.closeFinally(fileInputStream, null);
                                return obj;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th4) {
                            th = th4;
                            fileInputStream = fileInputStream4;
                            throw th;
                        }
                    }
                    return coroutineSingletons;
                }
                if (r2 != 1) {
                    if (r2 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileInputStream = (java.io.Closeable) fileReadScope$readData$1.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        Utf8.closeFinally(fileInputStream, null);
                        return obj;
                    } catch (Throwable th5) {
                        th = th5;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                fileInputStream2 = fileReadScope$readData$1.L$1;
                r2 = (FileReadScope) fileReadScope$readData$1.L$0;
                try {
                    SafeTrace.throwOnFailure(obj);
                } catch (Throwable th6) {
                    th2 = th6;
                    try {
                        throw th;
                    } finally {
                    }
                }
                Utf8.closeFinally(fileInputStream2, null);
                return obj;
            }
        }
        fileReadScope$readData$1 = new FileReadScope$readData$1(fileReadScope, continuationImpl);
        Object obj2 = fileReadScope$readData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r2 = fileReadScope$readData$1.label;
        if (r2 != 0) {
        }
        Utf8.closeFinally(fileInputStream2, null);
        return obj2;
    }

    @Override // androidx.datastore.core.Closeable
    public final void close() {
        this.closed.set(true);
    }
}
