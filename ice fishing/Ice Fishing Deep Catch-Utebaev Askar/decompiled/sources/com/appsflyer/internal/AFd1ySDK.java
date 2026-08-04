package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class AFd1ySDK extends ThreadPoolExecutor {
    private final Queue<Runnable> getCurrencyIso4217Code;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFd1ySDK(int i2, int i3, long j2, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, final Queue<Runnable> queue) {
        super(i2, i3, j2, timeUnit, blockingQueue, new RejectedExecutionHandler() { // from class: com.appsflyer.internal.m
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                AFd1ySDK.AFAdRevenueData(queue, runnable, threadPoolExecutor);
            }
        });
        Intrinsics.checkNotNullParameter(timeUnit, "");
        Intrinsics.checkNotNullParameter(blockingQueue, "");
        Intrinsics.checkNotNullParameter(queue, "");
        this.getCurrencyIso4217Code = queue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(Queue queue, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        Intrinsics.checkNotNullParameter(queue, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(threadPoolExecutor, "");
        queue.add(runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        Intrinsics.checkNotNullParameter(runnable, "");
        super.afterExecute(runnable, th);
        Intrinsics.checkNotNullParameter(runnable, "");
        if (th != null) {
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.AF_EXECUTOR, "Error while executing task: " + runnable, th, true, true, true, false, 64, null);
            return;
        }
        synchronized (this) {
            int size = this.getCurrencyIso4217Code.size();
            for (int i2 = 0; i2 < size; i2++) {
                Runnable runnablePoll = this.getCurrencyIso4217Code.poll();
                if (runnablePoll != null) {
                    execute(runnablePoll);
                }
            }
            Unit unit = Unit.f157a;
        }
    }

    public /* synthetic */ AFd1ySDK(int i2, int i3, long j2, TimeUnit timeUnit, BlockingQueue blockingQueue, Queue queue, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, j2, timeUnit, blockingQueue, (i4 & 32) != 0 ? new LinkedList() : queue);
    }
}
