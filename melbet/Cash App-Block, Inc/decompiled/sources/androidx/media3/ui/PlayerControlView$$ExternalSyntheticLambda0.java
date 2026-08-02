package androidx.media3.ui;

import android.os.Handler;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.media3.common.util.SystemHandlerWrapper;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final /* synthetic */ class PlayerControlView$$ExternalSyntheticLambda0 implements Executor {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ PlayerControlView$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((Handler) obj).post(runnable);
                break;
            case 1:
                UseCaseThreads useCaseThreads = (UseCaseThreads) obj;
                useCaseThreads.sequentialExecutorDelegate.execute(new CameraX$$ExternalSyntheticLambda2(5, useCaseThreads, runnable));
                break;
            default:
                ((SystemHandlerWrapper) obj).post(runnable);
                break;
        }
    }
}
