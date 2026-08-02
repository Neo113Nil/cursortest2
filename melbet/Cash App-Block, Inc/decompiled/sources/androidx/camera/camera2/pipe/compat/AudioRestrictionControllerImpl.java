package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.AudioRestrictionMode;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.internal.CameraPipeLifetime;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.view.PreviewView;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorJobImpl;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes3.dex */
public final class AudioRestrictionControllerImpl {
    public final CopyOnWriteArrayList activeListeners;
    public final LinkedHashMap audioRestrictionModeMap;
    public final PreviewView.AnonymousClass1 coroutineMutex;
    public final Object lock;
    public final ContextScope scope;

    public AudioRestrictionControllerImpl(Threads threads, CameraPipeLifetime cameraPipeLifetime, Job job) {
        threads.getClass();
        cameraPipeLifetime.getClass();
        job.getClass();
        this.scope = JobKt.CoroutineScope(CoroutineContext.Element.DefaultImpls.plus(new SupervisorJobImpl(job), threads.lightweightDispatcher.plus(new CoroutineName("CXCP-AudioRestrictionControllerImpl"))));
        this.coroutineMutex = new PreviewView.AnonymousClass1(5);
        this.lock = new Object();
        this.audioRestrictionModeMap = new LinkedHashMap();
        this.activeListeners = new CopyOnWriteArrayList();
        cameraPipeLifetime.addShutdownAction(CameraPipeLifetime.ShutdownType.SCOPE, new Preview$$ExternalSyntheticLambda0(this, 2));
    }

    /* renamed from: computeAudioRestrictionMode-4o0Og1A, reason: not valid java name */
    public final AudioRestrictionMode m62computeAudioRestrictionMode4o0Og1A() {
        LinkedHashMap linkedHashMap = this.audioRestrictionModeMap;
        if (linkedHashMap.containsValue(new AudioRestrictionMode(3))) {
            return new AudioRestrictionMode(3);
        }
        synchronized (this.lock) {
        }
        if (linkedHashMap.containsValue(new AudioRestrictionMode(1))) {
            return new AudioRestrictionMode(1);
        }
        synchronized (this.lock) {
        }
        if (linkedHashMap.containsValue(new AudioRestrictionMode(0))) {
            return new AudioRestrictionMode(0);
        }
        synchronized (this.lock) {
        }
        return null;
    }
}
