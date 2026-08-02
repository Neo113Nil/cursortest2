package ru.yandex.video.m3.preload_manager;

import android.os.Handler;
import android.os.Looper;
import defpackage.h5z0;
import defpackage.jl40;
import defpackage.sls;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0 ¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0015¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R0\u0010/\u001a\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020(0-j\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020(`.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020(018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadRequestsQueue;", "", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/os/Handler;)V", "Lkotlin/Function0;", "Lzy11;", "callback", "setDataReadyCallback", "(Lsls;)V", "Lru/yandex/video/m3/preload_manager/PreloadRequest;", "preloadRequest", "", "silent", "addRequest", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;Z)V", "peekTopRequest", "()Lru/yandex/video/m3/preload_manager/PreloadRequest;", "popTopRequest", "()V", "", "preloadKey", "findRequest", "(Ljava/lang/String;)Lru/yandex/video/m3/preload_manager/PreloadRequest;", "request", "Lru/yandex/video/m3/preload_manager/PreloadPriority;", "priority", "setPriority", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;Lru/yandex/video/m3/preload_manager/PreloadPriority;)V", "removeRequest", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;)V", "", "removeAllRequests", "()Ljava/util/List;", "tag", "debugState", "(Ljava/lang/String;)V", "Landroid/os/Handler;", "Ljava/util/Comparator;", "Lru/yandex/video/m3/preload_manager/PreloadRequestsQueue$PriorityHolder;", "priorityComparator", "Ljava/util/Comparator;", "onDataReadyCallback", "Lsls;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "requestsMap", "Ljava/util/HashMap;", "Ljava/util/PriorityQueue;", "requestsQueue", "Ljava/util/PriorityQueue;", "PriorityHolder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreloadRequestsQueue {
    public static final int $stable = 8;
    private final Handler handler;
    private sls onDataReadyCallback;
    private final Comparator<PriorityHolder> priorityComparator;
    private final HashMap<String, PriorityHolder> requestsMap;
    private final PriorityQueue<PriorityHolder> requestsQueue;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadRequestsQueue$PriorityHolder;", "", "priority", "Lru/yandex/video/m3/preload_manager/PreloadPriority;", "parent", "Lru/yandex/video/m3/preload_manager/PreloadRequest;", "(Lru/yandex/video/m3/preload_manager/PreloadPriority;Lru/yandex/video/m3/preload_manager/PreloadRequest;)V", "getParent", "()Lru/yandex/video/m3/preload_manager/PreloadRequest;", "getPriority", "()Lru/yandex/video/m3/preload_manager/PreloadPriority;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PriorityHolder {
        private final PreloadRequest parent;
        private final PreloadPriority priority;

        public PriorityHolder(PreloadPriority preloadPriority, PreloadRequest preloadRequest) {
            this.priority = preloadPriority;
            this.parent = preloadRequest;
        }

        public static /* synthetic */ PriorityHolder copy$default(PriorityHolder priorityHolder, PreloadPriority preloadPriority, PreloadRequest preloadRequest, int i, Object obj) {
            if ((i & 1) != 0) {
                preloadPriority = priorityHolder.priority;
            }
            if ((i & 2) != 0) {
                preloadRequest = priorityHolder.parent;
            }
            return priorityHolder.copy(preloadPriority, preloadRequest);
        }

        /* renamed from: component1, reason: from getter */
        public final PreloadPriority getPriority() {
            return this.priority;
        }

        /* renamed from: component2, reason: from getter */
        public final PreloadRequest getParent() {
            return this.parent;
        }

        public final PriorityHolder copy(PreloadPriority priority, PreloadRequest parent) {
            return new PriorityHolder(priority, parent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriorityHolder)) {
                return false;
            }
            PriorityHolder priorityHolder = (PriorityHolder) other;
            return jl40.l(this.priority, priorityHolder.priority) && jl40.l(this.parent, priorityHolder.parent);
        }

        public final PreloadRequest getParent() {
            return this.parent;
        }

        public final PreloadPriority getPriority() {
            return this.priority;
        }

        public int hashCode() {
            return this.parent.hashCode() + (this.priority.hashCode() * 31);
        }

        public String toString() {
            return "PriorityHolder(priority=" + this.priority + ", parent=" + this.parent + ')';
        }
    }

    public PreloadRequestsQueue(Handler handler) {
        this.handler = handler;
        a aVar = new a();
        this.priorityComparator = aVar;
        this.requestsMap = new HashMap<>();
        this.requestsQueue = new PriorityQueue<>(16, aVar);
    }

    public static /* synthetic */ void addRequest$default(PreloadRequestsQueue preloadRequestsQueue, PreloadRequest preloadRequest, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        preloadRequestsQueue.addRequest(preloadRequest, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int priorityComparator$lambda$0(PriorityHolder priorityHolder, PriorityHolder priorityHolder2) {
        if (priorityHolder.getPriority().compareTo(priorityHolder2.getPriority()) > 0) {
            return -1;
        }
        return priorityHolder.getPriority().compareTo(priorityHolder2.getPriority()) < 0 ? 1 : 0;
    }

    public final void addRequest(PreloadRequest preloadRequest, boolean silent) {
        sls slsVar;
        h5z0.a.a("addRequest() called with: preloadRequest = " + preloadRequest, new Object[0]);
        jl40.l(this.handler.getLooper(), Looper.myLooper());
        this.requestsMap.containsKey(preloadRequest.getPreloadKey());
        PriorityHolder priorityHolder = new PriorityHolder(preloadRequest.getPriority(), preloadRequest);
        this.requestsMap.put(preloadRequest.getPreloadKey(), priorityHolder);
        this.requestsQueue.add(priorityHolder);
        if (silent || (slsVar = this.onDataReadyCallback) == null) {
            return;
        }
        slsVar.invoke();
    }

    public final void debugState(String tag) {
        StringBuilder sb = new StringBuilder();
        Iterator<PriorityHolder> it = this.requestsQueue.iterator();
        boolean z = true;
        while (it.hasNext()) {
            PriorityHolder next = it.next();
            if (!z) {
                sb.append("\n");
            }
            sb.append("p = ");
            sb.append(next.getPriority());
            sb.append(", url = ");
            sb.append(next.getParent().getManifestUrl());
            z = false;
        }
        h5z0.a.a(tag + ": Queue:\n" + ((Object) sb) + '\n', new Object[0]);
    }

    public final PreloadRequest findRequest(String preloadKey) {
        jl40.l(this.handler.getLooper(), Looper.myLooper());
        PriorityHolder priorityHolder = this.requestsMap.get(preloadKey);
        if (priorityHolder != null) {
            return priorityHolder.getParent();
        }
        return null;
    }

    public final PreloadRequest peekTopRequest() {
        jl40.l(this.handler.getLooper(), Looper.myLooper());
        PriorityHolder peek = this.requestsQueue.peek();
        if (peek != null) {
            return peek.getParent();
        }
        return null;
    }

    public final void popTopRequest() {
        jl40.l(this.handler.getLooper(), Looper.myLooper());
        PriorityHolder poll = this.requestsQueue.poll();
        if (poll != null) {
            this.requestsMap.remove(poll.getParent().getPreloadKey());
        }
    }

    public final List<PreloadRequest> removeAllRequests() {
        h5z0.a.a("removeAllRequests() called", new Object[0]);
        jl40.l(this.handler.getLooper(), Looper.myLooper());
        List<PriorityHolder> J0 = kotlin.collections.a.J0(this.requestsMap.values());
        ArrayList arrayList = new ArrayList(tcc.n(J0, 10));
        for (PriorityHolder priorityHolder : J0) {
            h5z0.a.a("request " + priorityHolder + " is removing", new Object[0]);
            arrayList.add(priorityHolder.getParent());
        }
        this.requestsMap.clear();
        this.requestsQueue.clear();
        return arrayList;
    }

    public final void removeRequest(PreloadRequest request) {
        h5z0.a.a("removeRequest() called with: request = " + request, new Object[0]);
        jl40.l(this.handler.getLooper(), Looper.myLooper());
        PriorityHolder priorityHolder = this.requestsMap.get(request.getPreloadKey());
        this.requestsMap.remove(request.getPreloadKey());
        this.requestsQueue.remove(priorityHolder);
    }

    public final void setDataReadyCallback(sls callback) {
        this.onDataReadyCallback = callback;
    }

    public final void setPriority(PreloadRequest request, PreloadPriority priority) {
        removeRequest(request);
        addRequest$default(this, PreloadRequest.copy$default(request, null, null, priority, null, 0, null, false, false, false, false, 1019, null), false, 2, null);
    }
}
