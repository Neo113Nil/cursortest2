package androidx.camera.camera2.pipe.core;

import androidx.camera.video.Recorder$$ExternalSyntheticLambda14;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final /* synthetic */ class AndroidThreads$$ExternalSyntheticLambda0 implements ThreadFactory {
    public final /* synthetic */ int f$0;
    public final /* synthetic */ AndroidThreads$$ExternalSyntheticLambda1 f$1;

    public /* synthetic */ AndroidThreads$$ExternalSyntheticLambda0(int i, AndroidThreads$$ExternalSyntheticLambda1 androidThreads$$ExternalSyntheticLambda1) {
        this.f$0 = i;
        this.f$1 = androidThreads$$ExternalSyntheticLambda1;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i;
        int i2;
        int i3 = 0;
        while (true) {
            i = this.f$0;
            i2 = 10;
            if (i3 >= 10) {
                break;
            }
            if (i >= AndroidThreads.NICE_VALUES[i3]) {
                i2 = i3 + 1;
                break;
            }
            i3++;
        }
        Thread newThread = this.f$1.newThread(new Recorder$$ExternalSyntheticLambda14(i, runnable));
        newThread.setPriority(i2);
        return newThread;
    }
}
