package io.appmetrica.analytics.coreutils.internal.io;

import defpackage.g3r;
import defpackage.nq6;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.buffering.DeferredBatchExecutor;
import io.appmetrica.analytics.coreutils.internal.buffering.LastValueTaskBuffer;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/io/BufferedFileWriter;", "", "Lio/appmetrica/analytics/coreapi/internal/executors/IHandlerExecutor;", "executor", "", "delayMillis", "Ljava/io/File;", "file", "<init>", "(Lio/appmetrica/analytics/coreapi/internal/executors/IHandlerExecutor;JLjava/io/File;)V", "", "value", "Lzy11;", "writeString", "(Ljava/lang/String;)V", "readString", "()Ljava/lang/String;", "flush", "()V", "flushAsync", "core-utils_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class BufferedFileWriter {
    private final File a;
    private final Object b;
    private String c;
    private final DeferredBatchExecutor d;

    public BufferedFileWriter(IHandlerExecutor iHandlerExecutor, long j, File file) {
        this.a = file;
        String str = "[BufferedFileWriter-" + file.getName() + ']';
        this.b = new Object();
        this.d = new DeferredBatchExecutor(iHandlerExecutor, new LastValueTaskBuffer(), new nq6(0, this), j, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BufferedFileWriter bufferedFileWriter, List list) {
        String str = (String) a.P(list);
        try {
            File parentFile = bufferedFileWriter.a.getParentFile();
            if (parentFile != null) {
                if (parentFile.exists()) {
                    parentFile = null;
                }
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
            }
            g3r.g(bufferedFileWriter.a, str);
            synchronized (bufferedFileWriter.b) {
                bufferedFileWriter.c = null;
            }
        } catch (Exception unused) {
        }
    }

    public final void flush() {
        this.d.flush();
    }

    public final void flushAsync() {
        this.d.flushAsync();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001c A[Catch: all -> 0x0017, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:10:0x0008, B:12:0x0010, B:14:0x001c), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String readString() {
        String str;
        synchronized (this.b) {
            str = this.c;
            if (str == null) {
                if (this.a.exists()) {
                    str = g3r.e(this.a);
                    if (str != null) {
                        this.c = str;
                    }
                }
                str = null;
                if (str != null) {
                }
            }
        }
        return str;
    }

    public final void writeString(String value) {
        synchronized (this.b) {
            this.c = value;
        }
        DeferredBatchExecutor.submit$default(this.d, value, false, 2, null);
    }
}
