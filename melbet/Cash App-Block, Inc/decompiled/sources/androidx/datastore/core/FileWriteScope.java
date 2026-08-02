package androidx.datastore.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.FileOutputStream;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.Utf8;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class FileWriteScope extends FileReadScope {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeData(Object obj, ContinuationImpl continuationImpl) {
        FileWriteScope$writeData$1 fileWriteScope$writeData$1;
        int i;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (continuationImpl instanceof FileWriteScope$writeData$1) {
            fileWriteScope$writeData$1 = (FileWriteScope$writeData$1) continuationImpl;
            int i2 = fileWriteScope$writeData$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                fileWriteScope$writeData$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = fileWriteScope$writeData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fileWriteScope$writeData$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    if (this.closed.get()) {
                        a$$ExternalSyntheticBUOutline0.m$1("This scope has already been closed.");
                        return null;
                    }
                    FileOutputStream fileOutputStream3 = new FileOutputStream(this.file);
                    try {
                        Serializer serializer = this.serializer;
                        UncloseableOutputStream uncloseableOutputStream = new UncloseableOutputStream(fileOutputStream3);
                        fileWriteScope$writeData$1.L$0 = fileOutputStream3;
                        fileWriteScope$writeData$1.L$1 = fileOutputStream3;
                        fileWriteScope$writeData$1.label = 1;
                        if (serializer.writeTo(obj, uncloseableOutputStream) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        fileOutputStream2 = fileOutputStream3;
                        fileOutputStream = fileOutputStream2;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream3;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileOutputStream2 = fileWriteScope$writeData$1.L$1;
                    fileOutputStream = fileWriteScope$writeData$1.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            Utf8.closeFinally(fileOutputStream, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                Utf8.closeFinally(fileOutputStream, null);
                return Unit.INSTANCE;
            }
        }
        fileWriteScope$writeData$1 = new FileWriteScope$writeData$1(this, continuationImpl);
        Object obj22 = fileWriteScope$writeData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fileWriteScope$writeData$1.label;
        if (i != 0) {
        }
        fileOutputStream2.getFD().sync();
        Utf8.closeFinally(fileOutputStream, null);
        return Unit.INSTANCE;
    }
}
