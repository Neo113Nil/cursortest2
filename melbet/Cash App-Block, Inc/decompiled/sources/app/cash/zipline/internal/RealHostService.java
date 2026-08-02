package app.cash.zipline.internal;

import app.cash.zipline.EventListener;
import app.cash.zipline.Zipline;
import app.cash.zipline.internal.bridge.Endpoint;
import app.cash.zipline.internal.bridge.SerializableZiplineServiceType;
import app.cash.zipline.internal.bridge.ThrowablesKt;
import com.fillr.n;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes3.dex */
public final class RealHostService implements HostService {
    public final Endpoint endpoint;
    public final EventListener eventListener;
    public final n eventLoop;
    public final Zipline zipline;

    public RealHostService(Endpoint endpoint, Zipline zipline, EventListener eventListener, n nVar) {
        eventListener.getClass();
        this.endpoint = endpoint;
        this.zipline = zipline;
        this.eventListener = eventListener;
        this.eventLoop = nVar;
    }

    @Override // app.cash.zipline.internal.HostService
    public final void clearTimeout(int i) {
        CoroutineEventLoop$DelayedJob coroutineEventLoop$DelayedJob = (CoroutineEventLoop$DelayedJob) ((LinkedHashMap) this.eventLoop.d).remove(Integer.valueOf(i));
        if (coroutineEventLoop$DelayedJob != null) {
            coroutineEventLoop$DelayedJob.canceled = true;
            StandaloneCoroutine standaloneCoroutine = coroutineEventLoop$DelayedJob.job;
            if (standaloneCoroutine != null) {
                standaloneCoroutine.cancel(ThrowablesKt.theOnlyCancellationException);
            }
        }
    }

    @Override // app.cash.zipline.internal.EndpointService
    public final Set getServiceNames() {
        return this.endpoint.getServiceNames();
    }

    @Override // app.cash.zipline.internal.HostService
    public final void log(String str, String str2, Throwable th) {
        LogAndroidKt.log(str, str2, th);
    }

    @Override // app.cash.zipline.internal.HostService
    public final void serviceLeaked(String str) {
        this.eventListener.serviceLeaked(this.zipline, str);
    }

    @Override // app.cash.zipline.internal.EndpointService
    public final SerializableZiplineServiceType serviceType(String str) {
        return this.endpoint.serviceType(str);
    }

    @Override // app.cash.zipline.internal.HostService
    public final void setTimeout(int i, int i2) {
        n nVar = this.eventLoop;
        CoroutineEventLoop$DelayedJob coroutineEventLoop$DelayedJob = new CoroutineEventLoop$DelayedJob(nVar, i, i2);
        ((LinkedHashMap) nVar.d).put(Integer.valueOf(i), coroutineEventLoop$DelayedJob);
        ((CoroutineDispatcher) nVar.a).dispatch(((ContextScope) nVar.b).coroutineContext, coroutineEventLoop$DelayedJob);
    }
}
