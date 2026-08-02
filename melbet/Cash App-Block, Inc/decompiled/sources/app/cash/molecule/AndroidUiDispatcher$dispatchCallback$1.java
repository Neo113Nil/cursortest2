package app.cash.molecule;

import android.view.Choreographer;
import java.util.ArrayList;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes.dex */
public final class AndroidUiDispatcher$dispatchCallback$1 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CoroutineDispatcher this$0;

    public /* synthetic */ AndroidUiDispatcher$dispatchCallback$1(CoroutineDispatcher coroutineDispatcher, int i) {
        this.$r8$classId = i;
        this.this$0 = coroutineDispatcher;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = 0;
        switch (this.$r8$classId) {
            case 0:
                ((AndroidUiDispatcher) this.this$0).handler.removeCallbacks(this);
                AndroidUiDispatcher.access$performTrampolineDispatch((AndroidUiDispatcher) this.this$0);
                AndroidUiDispatcher androidUiDispatcher = (AndroidUiDispatcher) this.this$0;
                synchronized (androidUiDispatcher.lock) {
                    if (androidUiDispatcher.scheduledFrameDispatch) {
                        androidUiDispatcher.scheduledFrameDispatch = false;
                        ArrayList arrayList = androidUiDispatcher.toRunOnFrame;
                        androidUiDispatcher.toRunOnFrame = androidUiDispatcher.spareToRunOnFrame;
                        androidUiDispatcher.spareToRunOnFrame = arrayList;
                        int size = arrayList.size();
                        while (i < size) {
                            ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                            i++;
                        }
                        arrayList.clear();
                        return;
                    }
                    return;
                }
            default:
                ((androidx.compose.ui.platform.AndroidUiDispatcher) this.this$0).handler.removeCallbacks(this);
                androidx.compose.ui.platform.AndroidUiDispatcher.access$performTrampolineDispatch((androidx.compose.ui.platform.AndroidUiDispatcher) this.this$0);
                androidx.compose.ui.platform.AndroidUiDispatcher androidUiDispatcher2 = (androidx.compose.ui.platform.AndroidUiDispatcher) this.this$0;
                synchronized (androidUiDispatcher2.lock) {
                    if (androidUiDispatcher2.scheduledFrameDispatch) {
                        androidUiDispatcher2.scheduledFrameDispatch = false;
                        ArrayList arrayList2 = androidUiDispatcher2.toRunOnFrame;
                        androidUiDispatcher2.toRunOnFrame = androidUiDispatcher2.spareToRunOnFrame;
                        androidUiDispatcher2.spareToRunOnFrame = arrayList2;
                        int size2 = arrayList2.size();
                        while (i < size2) {
                            ((Choreographer.FrameCallback) arrayList2.get(i)).doFrame(j);
                            i++;
                        }
                        arrayList2.clear();
                        return;
                    }
                    return;
                }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AndroidUiDispatcher.access$performTrampolineDispatch((AndroidUiDispatcher) this.this$0);
                AndroidUiDispatcher androidUiDispatcher = (AndroidUiDispatcher) this.this$0;
                synchronized (androidUiDispatcher.lock) {
                    if (androidUiDispatcher.toRunOnFrame.isEmpty()) {
                        androidUiDispatcher.choreographer.removeFrameCallback(this);
                        androidUiDispatcher.scheduledFrameDispatch = false;
                    }
                }
                return;
            default:
                androidx.compose.ui.platform.AndroidUiDispatcher.access$performTrampolineDispatch((androidx.compose.ui.platform.AndroidUiDispatcher) this.this$0);
                androidx.compose.ui.platform.AndroidUiDispatcher androidUiDispatcher2 = (androidx.compose.ui.platform.AndroidUiDispatcher) this.this$0;
                synchronized (androidUiDispatcher2.lock) {
                    if (androidUiDispatcher2.toRunOnFrame.isEmpty()) {
                        androidUiDispatcher2.choreographer.removeFrameCallback(this);
                        androidUiDispatcher2.scheduledFrameDispatch = false;
                    }
                }
                return;
        }
    }
}
