package androidx.camera.core;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class CameraExecutor$$ExternalSyntheticLambda0 implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        StringUtilsKt.w("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
    }
}
