package androidx.camera.camera2.pipe;

import android.os.Trace;
import androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent$CameraPipeComponentImpl;
import androidx.camera.video.Recorder;
import androidx.media3.common.util.LongArrayQueue;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicInt;

/* loaded from: classes3.dex */
public abstract class CameraPipeKt {
    public static final AtomicInt cameraPipeIds = AtomicFU.atomic(0);

    public static final CameraPipeImpl CameraPipe(CameraPipe$Config cameraPipe$Config) {
        try {
            Trace.beginSection("CameraPipe");
            DaggerCameraPipeComponent$CameraPipeComponentImpl daggerCameraPipeComponent$CameraPipeComponentImpl = new DaggerCameraPipeComponent$CameraPipeComponentImpl(new Recorder.AnonymousClass6(cameraPipe$Config, 8), new LongArrayQueue(cameraPipe$Config.threadConfig));
            Trace.endSection();
            return new CameraPipeImpl(daggerCameraPipeComponent$CameraPipeComponentImpl);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
