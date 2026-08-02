package androidx.camera.camera2.pipe.config;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.camera.camera2.pipe.CameraPipe$ThreadConfig;
import androidx.camera.camera2.pipe.core.AndroidThreads;
import androidx.camera.camera2.pipe.core.AndroidThreads$$ExternalSyntheticLambda0;
import androidx.camera.camera2.pipe.internal.CameraPipeLifetime;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.media3.common.util.LongArrayQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ThreadConfigModule$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LongArrayQueue f$0;
    public final /* synthetic */ CameraPipeLifetime f$1;

    public /* synthetic */ ThreadConfigModule$$ExternalSyntheticLambda1(LongArrayQueue longArrayQueue, CameraPipeLifetime cameraPipeLifetime, int i) {
        this.$r8$classId = i;
        this.f$0 = longArrayQueue;
        this.f$1 = cameraPipeLifetime;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        CameraPipeLifetime cameraPipeLifetime = this.f$1;
        LongArrayQueue longArrayQueue = this.f$0;
        switch (i) {
            case 0:
                ((CameraPipe$ThreadConfig) longArrayQueue.data).getClass();
                HandlerThread handlerThread = new HandlerThread("CXCP-Camera-H", longArrayQueue.size);
                handlerThread.start();
                cameraPipeLifetime.addShutdownAction(CameraPipeLifetime.ShutdownType.THREAD, new Preview$$ExternalSyntheticLambda0(handlerThread, 5));
                return new Handler(handlerThread.getLooper());
            default:
                Executor executor = ((CameraPipe$ThreadConfig) longArrayQueue.data).defaultCameraExecutor;
                if (executor != null) {
                    return executor;
                }
                ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(1, new AndroidThreads$$ExternalSyntheticLambda0(longArrayQueue.size, AndroidThreads.withPrefix(AndroidThreads.factory, "CXCP-Camera-E")));
                newFixedThreadPool.getClass();
                cameraPipeLifetime.addShutdownAction(CameraPipeLifetime.ShutdownType.THREAD, new Preview$$ExternalSyntheticLambda0(newFixedThreadPool, 6));
                return newFixedThreadPool;
        }
    }
}
