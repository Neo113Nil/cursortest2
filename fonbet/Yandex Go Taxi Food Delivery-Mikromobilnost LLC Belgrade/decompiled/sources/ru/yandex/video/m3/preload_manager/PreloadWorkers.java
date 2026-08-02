package ru.yandex.video.m3.preload_manager;

import android.os.Handler;
import android.os.Looper;
import defpackage.bms;
import defpackage.d5z0;
import defpackage.h5z0;
import defpackage.j73;
import defpackage.jl40;
import defpackage.sls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.preload_manager.PreloadWorkers;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u00017B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u0018J\r\u0010\u001d\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u0018J\u000f\u0010\u001e\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001e\u0010\u0018J\u0015\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0014¢\u0006\u0004\b!\u0010\u0018J\u001d\u0010$\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u0004\u0018\u00010\u00122\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0014H\u0087\u0010¢\u0006\u0004\b*\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00105¨\u00068"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadWorkers;", "", "", "maxSimultaneousDownloads", "Lru/yandex/video/m3/preload_manager/PreloadWorkerJobFactory;", "jobFactory", "Landroid/os/Handler;", "handler", "Lru/yandex/video/m3/preload_manager/PreloadRequestsQueue;", "queue", "Lru/yandex/video/m3/preload_manager/PreloadWorkers$Listener;", "listener", "<init>", "(ILru/yandex/video/m3/preload_manager/PreloadWorkerJobFactory;Landroid/os/Handler;Lru/yandex/video/m3/preload_manager/PreloadRequestsQueue;Lru/yandex/video/m3/preload_manager/PreloadWorkers$Listener;)V", "getLowestPriorityWorkerIndex", "()I", "getFreeWorkerIndex", "index", "Lru/yandex/video/m3/preload_manager/PreloadRequest;", "request", "Lzy11;", "scheduleWithIndex", "(ILru/yandex/video/m3/preload_manager/PreloadRequest;)V", "debugState", "()V", "Ljava/io/Closeable;", "batchMode", "()Ljava/io/Closeable;", "enterBatchMode", "exitBatchMode", "shutdown", "cancelRequest", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;)V", "cancelAllRequest", "Lru/yandex/video/m3/preload_manager/PreloadPriority;", "priority", "setPriority", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;Lru/yandex/video/m3/preload_manager/PreloadPriority;)V", "", "preloadKey", "findRequest", "(Ljava/lang/String;)Lru/yandex/video/m3/preload_manager/PreloadRequest;", "schedule", "Lru/yandex/video/m3/preload_manager/PreloadWorkerJobFactory;", "Landroid/os/Handler;", "Lru/yandex/video/m3/preload_manager/PreloadRequestsQueue;", "Lru/yandex/video/m3/preload_manager/PreloadWorkers$Listener;", "", "Lru/yandex/video/m3/preload_manager/PreloadWorkerJobHandle;", "workers", "[Lru/yandex/video/m3/preload_manager/PreloadWorkerJobHandle;", "", "isInBatchMode", "Z", "isShuttingDown", "Listener", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreloadWorkers {
    public static final int $stable = 8;
    private final Handler handler;
    private boolean isInBatchMode;
    private volatile boolean isShuttingDown;
    private final PreloadWorkerJobFactory jobFactory;
    private final Listener listener;
    private final PreloadRequestsQueue queue;
    private final PreloadWorkerJobHandle[] workers;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadWorkers$Listener;", "", "Lru/yandex/video/m3/preload_manager/PreloadRequest;", "request", "", "Lru/yandex/video/m3/preload_manager/DownloadResult;", "results", "Lzy11;", "onSuccess", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;Ljava/util/List;)V", "Lru/yandex/video/m3/preload_manager/PreloadException;", Constants.KEY_EXCEPTION, "onCancel", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;Lru/yandex/video/m3/preload_manager/PreloadException;)V", "onError", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Listener {
        void onCancel(PreloadRequest request, PreloadException exception);

        void onError(PreloadRequest request, PreloadException exception);

        void onSuccess(PreloadRequest request, List<DownloadResult> results);
    }

    public PreloadWorkers(int i, PreloadWorkerJobFactory preloadWorkerJobFactory, Handler handler, PreloadRequestsQueue preloadRequestsQueue, Listener listener) {
        this.jobFactory = preloadWorkerJobFactory;
        this.handler = handler;
        this.queue = preloadRequestsQueue;
        this.listener = listener;
        this.workers = new PreloadWorkerJobHandle[i];
        preloadRequestsQueue.setDataReadyCallback(new sls() { // from class: ru.yandex.video.m3.preload_manager.PreloadWorkers.1
            {
                super(0);
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m901invoke();
                return zy11.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m901invoke() {
                PreloadWorkers.this.schedule();
            }
        });
    }

    private final void debugState() {
        StringBuilder sb = new StringBuilder();
        PreloadWorkerJobHandle[] preloadWorkerJobHandleArr = this.workers;
        int length = preloadWorkerJobHandleArr.length;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            PreloadWorkerJobHandle preloadWorkerJobHandle = preloadWorkerJobHandleArr[i];
            if (!z) {
                sb.append("\n");
            }
            int i3 = i2 + 1;
            sb.append(i2);
            if (preloadWorkerJobHandle == null) {
                sb.append(", null");
            } else {
                sb.append(", p = ");
                sb.append(preloadWorkerJobHandle.getRequest().getPriority());
                sb.append(", url = ");
                sb.append(preloadWorkerJobHandle.getRequest().getManifestUrl());
            }
            i++;
            i2 = i3;
            z = false;
        }
        h5z0.a.a("Downloading:\n" + ((Object) sb) + '\n', new Object[0]);
    }

    private final int getFreeWorkerIndex() {
        PreloadWorkerJobHandle[] preloadWorkerJobHandleArr = this.workers;
        int length = preloadWorkerJobHandleArr.length;
        for (int i = 0; i < length; i++) {
            if (preloadWorkerJobHandleArr[i] == null) {
                return i;
            }
        }
        return -1;
    }

    private final int getLowestPriorityWorkerIndex() {
        PreloadPriority highest_priority = PreloadPriorityKt.getHIGHEST_PRIORITY();
        int length = this.workers.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            PreloadWorkerJobHandle preloadWorkerJobHandle = this.workers[i2];
            if (preloadWorkerJobHandle != null && preloadWorkerJobHandle.getRequest().getPriority().compareTo(highest_priority) < 0) {
                highest_priority = preloadWorkerJobHandle.getRequest().getPriority();
                i = i2;
            }
        }
        return i;
    }

    private final void scheduleWithIndex(int index, final PreloadRequest request) {
        h5z0.a.a("scheduleWithIndex(), index = " + index + ", request = " + request, new Object[0]);
        this.workers[index] = this.jobFactory.launchJob(request, new bms() { // from class: ru.yandex.video.m3.preload_manager.PreloadWorkers$scheduleWithIndex$1

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[JobResult.values().length];
                    try {
                        iArr[JobResult.SUCCESS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[JobResult.CANCELED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[JobResult.ERROR.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public final void invoke(PreloadWorkerJobHandle preloadWorkerJobHandle, JobResult jobResult, List<DownloadResult> list, PreloadException preloadException) {
                Handler handler;
                PreloadWorkerJobHandle[] preloadWorkerJobHandleArr;
                PreloadWorkers.Listener listener;
                PreloadWorkers.Listener listener2;
                PreloadWorkers.Listener listener3;
                PreloadWorkerJobHandle[] preloadWorkerJobHandleArr2;
                PreloadRequestsQueue preloadRequestsQueue;
                PreloadRequestsQueue preloadRequestsQueue2;
                h5z0.a.a("finished job of request = " + PreloadRequest.this + ", status = " + jobResult.name() + " error = " + preloadException, new Object[0]);
                handler = this.handler;
                jl40.l(handler.getLooper(), Looper.myLooper());
                preloadWorkerJobHandleArr = this.workers;
                int H = j73.H(preloadWorkerJobHandleArr, preloadWorkerJobHandle);
                if (jobResult == JobResult.SUCCESS && H < 0) {
                    preloadRequestsQueue = this.queue;
                    PreloadRequest findRequest = preloadRequestsQueue.findRequest(PreloadRequest.this.getPreloadKey());
                    if (findRequest != null) {
                        preloadRequestsQueue2 = this.queue;
                        preloadRequestsQueue2.removeRequest(findRequest);
                    }
                }
                if (H >= 0) {
                    preloadWorkerJobHandleArr2 = this.workers;
                    preloadWorkerJobHandleArr2[H] = null;
                    this.schedule();
                }
                int i = WhenMappings.$EnumSwitchMapping$0[jobResult.ordinal()];
                if (i == 1) {
                    listener = this.listener;
                    listener.onSuccess(PreloadRequest.this, list);
                    return;
                }
                if (i == 2) {
                    if (preloadWorkerJobHandle.getRequestResultIsFinal()) {
                        listener2 = this.listener;
                        listener2.onCancel(PreloadRequest.this, preloadException);
                        return;
                    }
                    return;
                }
                if (i != 3) {
                    return;
                }
                preloadWorkerJobHandle.getRequestResultIsFinal();
                listener3 = this.listener;
                listener3.onError(PreloadRequest.this, preloadException);
            }

            @Override // defpackage.bms
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((PreloadWorkerJobHandle) obj, (JobResult) obj2, (List<DownloadResult>) obj3, (PreloadException) obj4);
                return zy11.a;
            }
        });
    }

    public final Closeable batchMode() {
        return new Closeable() { // from class: ru.yandex.video.m3.preload_manager.PreloadWorkers$batchMode$1
            {
                PreloadWorkers.this.enterBatchMode();
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                PreloadWorkers.this.exitBatchMode();
            }
        };
    }

    public final void cancelAllRequest() {
        jl40.l(this.handler.getLooper(), Looper.myLooper());
        PreloadWorkerJobHandle[] preloadWorkerJobHandleArr = this.workers;
        int length = preloadWorkerJobHandleArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            PreloadWorkerJobHandle preloadWorkerJobHandle = preloadWorkerJobHandleArr[i];
            int i3 = i2 + 1;
            d5z0 d5z0Var = h5z0.a;
            StringBuilder sb = new StringBuilder("cancelAllRequest(), request = ");
            sb.append(preloadWorkerJobHandle != null ? preloadWorkerJobHandle.getRequest() : null);
            d5z0Var.a(sb.toString(), new Object[0]);
            if (preloadWorkerJobHandle != null) {
                preloadWorkerJobHandle.cancel();
            }
            this.workers[i2] = null;
            i++;
            i2 = i3;
        }
        schedule();
    }

    public final void cancelRequest(PreloadRequest request) {
        jl40.l(this.handler.getLooper(), Looper.myLooper());
        PreloadWorkerJobHandle[] preloadWorkerJobHandleArr = this.workers;
        int length = preloadWorkerJobHandleArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            PreloadWorkerJobHandle preloadWorkerJobHandle = preloadWorkerJobHandleArr[i];
            if (jl40.l(preloadWorkerJobHandle != null ? preloadWorkerJobHandle.getRequest() : null, request)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            h5z0.a.a("cancelRequest(), request = " + request, new Object[0]);
            this.workers[i].cancel();
            this.workers[i] = null;
            schedule();
        }
    }

    public final void enterBatchMode() {
        jl40.l(this.handler.getLooper(), Looper.myLooper());
        this.isInBatchMode = true;
    }

    public final void exitBatchMode() {
        jl40.l(this.handler.getLooper(), Looper.myLooper());
        this.isInBatchMode = false;
        schedule();
    }

    public final PreloadRequest findRequest(String preloadKey) {
        PreloadWorkerJobHandle preloadWorkerJobHandle;
        PreloadRequest request;
        jl40.l(this.handler.getLooper(), Looper.myLooper());
        PreloadWorkerJobHandle[] preloadWorkerJobHandleArr = this.workers;
        int length = preloadWorkerJobHandleArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                preloadWorkerJobHandle = null;
                break;
            }
            preloadWorkerJobHandle = preloadWorkerJobHandleArr[i];
            if (jl40.l((preloadWorkerJobHandle == null || (request = preloadWorkerJobHandle.getRequest()) == null) ? null : request.getPreloadKey(), preloadKey)) {
                break;
            }
            i++;
        }
        if (preloadWorkerJobHandle != null) {
            return preloadWorkerJobHandle.getRequest();
        }
        return null;
    }

    public final void schedule() {
        while (true) {
            jl40.l(this.handler.getLooper(), Looper.myLooper());
            if (this.isShuttingDown) {
                h5z0.a.a("schedule(), skip due to shutdown", new Object[0]);
                return;
            }
            if (this.isInBatchMode) {
                h5z0.a.a("schedule(), skip due to batch mode", new Object[0]);
                return;
            }
            PreloadRequest peekTopRequest = this.queue.peekTopRequest();
            if (peekTopRequest == null) {
                h5z0.a.a("schedule(), requests queue is empty", new Object[0]);
                return;
            }
            int freeWorkerIndex = getFreeWorkerIndex();
            if (freeWorkerIndex >= 0) {
                this.queue.popTopRequest();
                scheduleWithIndex(freeWorkerIndex, peekTopRequest);
            } else {
                int lowestPriorityWorkerIndex = getLowestPriorityWorkerIndex();
                if (lowestPriorityWorkerIndex < 0) {
                    return;
                }
                PreloadWorkerJobHandle preloadWorkerJobHandle = this.workers[lowestPriorityWorkerIndex];
                if (preloadWorkerJobHandle.getRequest().getPriority().compareTo(peekTopRequest.getPriority()) >= 0) {
                    return;
                }
                h5z0.a.a("schedule(), replace lower priority request = " + preloadWorkerJobHandle.getRequest(), new Object[0]);
                this.queue.popTopRequest();
                preloadWorkerJobHandle.withdraw();
                this.queue.addRequest(preloadWorkerJobHandle.getRequest(), true);
                scheduleWithIndex(lowestPriorityWorkerIndex, peekTopRequest);
            }
        }
    }

    public final void setPriority(PreloadRequest request, PreloadPriority priority) {
        jl40.l(this.handler.getLooper(), Looper.myLooper());
        PreloadWorkerJobHandle[] preloadWorkerJobHandleArr = this.workers;
        int length = preloadWorkerJobHandleArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            PreloadWorkerJobHandle preloadWorkerJobHandle = preloadWorkerJobHandleArr[i];
            if (jl40.l(preloadWorkerJobHandle != null ? preloadWorkerJobHandle.getRequest() : null, request)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            h5z0.a.a("setPriority(), request = " + request + ", new priority = " + priority + ", worker index = " + i, new Object[0]);
            this.workers[i].changePriority(priority);
            schedule();
        }
    }

    public final void shutdown() {
        this.isShuttingDown = true;
    }
}
