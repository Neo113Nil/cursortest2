package io.appmetrica.analytics.coreutils.internal.buffering;

import defpackage.ooh;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0018*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0018B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00028\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0016¨\u0006\u0019"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/buffering/DeferredBatchExecutor;", "T", "", "Lio/appmetrica/analytics/coreapi/internal/executors/IHandlerExecutor;", "executor", "Lio/appmetrica/analytics/coreutils/internal/buffering/TaskBuffer;", "buffer", "Lio/appmetrica/analytics/coreutils/internal/buffering/BatchProcessor;", "processor", "", "delayMillis", "", "tag", "<init>", "(Lio/appmetrica/analytics/coreapi/internal/executors/IHandlerExecutor;Lio/appmetrica/analytics/coreutils/internal/buffering/TaskBuffer;Lio/appmetrica/analytics/coreutils/internal/buffering/BatchProcessor;JLjava/lang/String;)V", "task", "", "urgent", "Lzy11;", "submit", "(Ljava/lang/Object;Z)V", "flush", "()V", "flushAsync", "Companion", "core-utils_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class DeferredBatchExecutor<T> {
    private final IHandlerExecutor a;
    private final TaskBuffer b;
    private final BatchProcessor c;
    private final long d;
    private Runnable e;

    public /* synthetic */ DeferredBatchExecutor(IHandlerExecutor iHandlerExecutor, TaskBuffer taskBuffer, BatchProcessor batchProcessor, long j, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iHandlerExecutor, taskBuffer, batchProcessor, (i & 8) != 0 ? 1000L : j, (i & 16) != 0 ? "[DeferredBatchExecutor]" : str);
    }

    private final void a() {
        if (this.b.isEmpty()) {
            this.e = null;
            return;
        }
        List<T> andClear = this.b.getAndClear();
        this.e = null;
        try {
            this.c.processBatch(andClear);
        } catch (Exception unused) {
        }
    }

    private final void b() {
        ooh oohVar = new ooh(this, 1);
        this.e = oohVar;
        this.a.executeDelayed(oohVar, this.d);
    }

    public static /* synthetic */ void submit$default(DeferredBatchExecutor deferredBatchExecutor, Object obj, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = false;
        }
        deferredBatchExecutor.submit(obj, z);
    }

    public final synchronized void flush() {
        try {
            Runnable runnable = this.e;
            if (runnable != null) {
                this.a.remove(runnable);
                this.e = null;
            }
            if (!this.b.isEmpty()) {
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void flushAsync() {
        this.a.execute(new ooh(this, 0));
    }

    public final synchronized void submit(T task, boolean urgent) {
        try {
            this.b.add(task);
            Runnable runnable = this.e;
            if (urgent) {
                if (runnable != null) {
                    this.a.remove(runnable);
                    this.e = null;
                }
                a();
            } else if (runnable == null) {
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(DeferredBatchExecutor deferredBatchExecutor) {
        synchronized (deferredBatchExecutor) {
            deferredBatchExecutor.a();
        }
    }

    public DeferredBatchExecutor(IHandlerExecutor iHandlerExecutor, TaskBuffer<T> taskBuffer, BatchProcessor<T> batchProcessor, long j, String str) {
        this.a = iHandlerExecutor;
        this.b = taskBuffer;
        this.c = batchProcessor;
        this.d = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(DeferredBatchExecutor deferredBatchExecutor) {
        deferredBatchExecutor.flush();
    }
}
