package androidx.camera.core.impl.utils.executor;

import android.os.Looper;
import androidx.camera.core.CameraExecutor;
import com.google.android.gms.internal.base.zao;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class IoExecutor implements Executor {
    public static volatile IoExecutor sExecutor;
    public final /* synthetic */ int $r8$classId;
    public final Object mIoService;

    public IoExecutor() {
        this.$r8$classId = 0;
        this.mIoService = Executors.newFixedThreadPool(2, new CameraExecutor.AnonymousClass1(2));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.$r8$classId) {
            case 0:
                ((ExecutorService) this.mIoService).execute(runnable);
                break;
            default:
                ((zao) this.mIoService).post(runnable);
                break;
        }
    }

    public IoExecutor(Looper looper) {
        this.$r8$classId = 1;
        this.mIoService = new zao(looper, 2);
    }
}
