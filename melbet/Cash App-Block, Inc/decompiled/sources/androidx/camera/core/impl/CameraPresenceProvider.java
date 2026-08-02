package androidx.camera.core.impl;

import androidx.camera.camera2.adapter.PipeCameraPresenceSource;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import androidx.camera.video.Recorder;
import androidx.lifecycle.Observer;
import androidx.media3.common.FlagSet;
import androidx.media3.common.util.StuckPlayerDetector;
import com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.plaid.internal.c7$$ExternalSyntheticLambda0;
import com.squareup.cash.api.Aliases;
import com.stripe.hcaptcha.HCaptcha;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class CameraPresenceProvider {
    public final Executor backgroundExecutor;
    public StuckPlayerDetector cameraFactory;
    public CameraRepository cameraRepository;
    public FlagSet.Builder cameraValidator;
    public ScheduledFuture retryScanFuture;
    public final HandlerScheduledExecutorService scheduledExecutor;
    public PipeCameraPresenceSource sourcePresenceObservable;
    public final Object observerLock = new Object();
    public final Object retryLock = new Object();
    public final Recorder.AnonymousClass7 sourceObserver = new Recorder.AnonymousClass7(this, 1);
    public volatile List currentFilteredIds = EmptyList.INSTANCE;
    public final AtomicBoolean isMonitoring = new AtomicBoolean(false);
    public final CopyOnWriteArrayList dependentInternalListeners = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList publicApiListeners = new CopyOnWriteArrayList();
    public final LinkedHashMap cameraStateObservers = new LinkedHashMap();

    public final class ListenerWrapper {
        public final HandlerScheduledExecutorService executor;
        public final HCaptcha listener;

        public ListenerWrapper(HCaptcha hCaptcha, HandlerScheduledExecutorService handlerScheduledExecutorService) {
            this.listener = hCaptcha;
            this.executor = handlerScheduledExecutorService;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerWrapper)) {
                return false;
            }
            ListenerWrapper listenerWrapper = (ListenerWrapper) obj;
            return this.listener == listenerWrapper.listener && this.executor == listenerWrapper.executor;
        }

        public final int hashCode() {
            return this.executor.hashCode() + (this.listener.hashCode() * 31);
        }

        public final String toString() {
            return "ListenerWrapper(listener=" + this.listener + ", executor=" + this.executor + ')';
        }
    }

    public CameraPresenceProvider(Executor executor, HandlerScheduledExecutorService handlerScheduledExecutorService) {
        this.backgroundExecutor = executor;
        this.scheduledExecutor = handlerScheduledExecutorService;
    }

    public final void conditionallySetupCameraStateObserver(String str) {
        CameraRepository cameraRepository = this.cameraRepository;
        if (cameraRepository == null) {
            return;
        }
        try {
            CameraInfoInternal cameraInfoInternal = cameraRepository.getCamera(str).getCameraInfoInternal();
            cameraInfoInternal.getClass();
            setupCameraStateObserver(cameraInfoInternal);
        } catch (IllegalArgumentException unused) {
            StringUtilsKt.w("CameraPresencePrvdr", "CameraInternal not found for " + str + ". Cannot setup state observer.");
        }
    }

    public final void notifyPublicListeners(Set set, Set set2) {
        boolean isEmpty = set.isEmpty();
        CopyOnWriteArrayList copyOnWriteArrayList = this.publicApiListeners;
        if (!isEmpty) {
            StringUtilsKt.i("CameraPresencePrvdr", "Notifying " + set.size() + " cameras added.");
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ListenerWrapper listenerWrapper = (ListenerWrapper) it.next();
                listenerWrapper.executor.execute(new Preview$$ExternalSyntheticLambda0(listenerWrapper, set));
            }
        }
        if (set2.isEmpty()) {
            return;
        }
        StringUtilsKt.i("CameraPresencePrvdr", "Notifying " + set2.size() + " cameras removed.");
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            ListenerWrapper listenerWrapper2 = (ListenerWrapper) it2.next();
            listenerWrapper2.executor.execute(new CameraX$$ExternalSyntheticLambda2(19, listenerWrapper2, set2));
        }
    }

    public final void removeCameraStateObserver(String str) {
        synchronized (this.observerLock) {
            Observer observer = (Observer) this.cameraStateObservers.remove(str);
            CameraRepository cameraRepository = this.cameraRepository;
            if (observer != null && cameraRepository != null) {
                try {
                    zzabp.mainThreadExecutor().execute(new CameraX$$ExternalSyntheticLambda2(20, cameraRepository.getCamera(str), observer));
                    StringUtilsKt.d("CameraPresencePrvdr", "Removed state observer for: " + str);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public final void scheduleRetryAttempt(int i, List list) {
        if (i > 0 && this.isMonitoring.get()) {
            this.retryScanFuture = this.scheduledExecutor.schedule(new CameraPresenceProvider$$ExternalSyntheticLambda9(this, list, i, 0), i == 3 ? 0L : 400L, TimeUnit.MILLISECONDS);
        } else if (i <= 0) {
            StringUtilsKt.w("CameraPresencePrvdr", "Exhausted all retries for camera list refresh.");
        }
    }

    public final void setupCameraStateObserver(CameraInfoInternal cameraInfoInternal) {
        String cameraId = cameraInfoInternal.getCameraId();
        cameraId.getClass();
        if (this.isMonitoring.get()) {
            synchronized (this.observerLock) {
                if (this.cameraStateObservers.containsKey(cameraId)) {
                    return;
                }
                c7$$ExternalSyntheticLambda0 c7__externalsyntheticlambda0 = new c7$$ExternalSyntheticLambda0(1, this, cameraId);
                zzabp.mainThreadExecutor().execute(new CameraX$$ExternalSyntheticLambda2(21, cameraInfoInternal, c7__externalsyntheticlambda0));
                this.cameraStateObservers.put(cameraId, c7__externalsyntheticlambda0);
                StringUtilsKt.d("CameraPresencePrvdr", "Registered state observer for camera: ".concat(cameraId));
            }
        }
    }

    public final void shutdown() {
        if (!this.isMonitoring.getAndSet(false)) {
            StringUtilsKt.d("CameraPresencePrvdr", "Shutdown called when not monitoring. Ignoring.");
            return;
        }
        StringUtilsKt.i("CameraPresencePrvdr", "Shutting down CameraPresenceProvider monitoring.");
        synchronized (this.retryLock) {
            try {
                ScheduledFuture scheduledFuture = this.retryScanFuture;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.retryScanFuture = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        PipeCameraPresenceSource pipeCameraPresenceSource = this.sourcePresenceObservable;
        if (pipeCameraPresenceSource != null) {
            pipeCameraPresenceSource.removeObserver(this.sourceObserver);
        }
        synchronized (this.observerLock) {
            if (!this.cameraStateObservers.isEmpty()) {
                Map map = MapsKt__MapsKt.toMap(this.cameraStateObservers);
                this.cameraStateObservers.clear();
                CameraRepository cameraRepository = this.cameraRepository;
                if (cameraRepository != null) {
                    LinkedHashSet<CameraInternal> cameras = cameraRepository.getCameras();
                    ArrayList arrayList = new ArrayList();
                    for (CameraInternal cameraInternal : cameras) {
                        CameraInfoInternal cameraInfoInternal = cameraInternal != null ? cameraInternal.getCameraInfoInternal() : null;
                        if (cameraInfoInternal != null) {
                            arrayList.add(cameraInfoInternal);
                        }
                    }
                    StringUtilsKt.d("CameraPresencePrvdr", "Clearing all " + map.size() + " state observers.");
                    for (Map.Entry entry : map.entrySet()) {
                        zzabp.mainThreadExecutor().execute(new AFd1wSDK$$ExternalSyntheticLambda2(5, arrayList, (Observer) entry.getValue(), (String) entry.getKey()));
                    }
                }
            }
        }
        this.cameraValidator = null;
        this.dependentInternalListeners.clear();
        this.publicApiListeners.clear();
        this.currentFilteredIds = EmptyList.INSTANCE;
        this.cameraFactory = null;
        this.cameraRepository = null;
    }

    public final void startup(FlagSet.Builder builder, StuckPlayerDetector stuckPlayerDetector, CameraRepository cameraRepository) {
        stuckPlayerDetector.getClass();
        cameraRepository.getClass();
        if (this.isMonitoring.compareAndSet(false, true)) {
            StringUtilsKt.i("CameraPresencePrvdr", "Starting CameraPresenceProvider monitoring.");
            this.cameraValidator = builder;
            Set availableCameraIds = stuckPlayerDetector.getAvailableCameraIds();
            availableCameraIds.getClass();
            Set<String> set = availableCameraIds;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
            for (String str : set) {
                str.getClass();
                arrayList.add(Aliases.create(str, null, null));
            }
            this.currentFilteredIds = arrayList;
            this.cameraFactory = stuckPlayerDetector;
            this.cameraRepository = cameraRepository;
            this.sourcePresenceObservable = (PipeCameraPresenceSource) stuckPlayerDetector.handler;
            this.backgroundExecutor.execute(new CameraPresenceProvider$$ExternalSyntheticLambda3(this, 1));
            PipeCameraPresenceSource pipeCameraPresenceSource = this.sourcePresenceObservable;
            if (pipeCameraPresenceSource != null) {
                pipeCameraPresenceSource.addObserver(new SequentialExecutor(this.backgroundExecutor), this.sourceObserver);
            }
        }
    }
}
