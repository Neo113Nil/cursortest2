package androidx.camera.camera2.impl;

import android.util.Log;
import android.view.Surface;
import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser;
import androidx.camera.camera2.pipe.CameraPipeImpl;
import androidx.camera.camera2.pipe.CameraSurfaceManager;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.compose.material3.ThumbNode$onAttach$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class UseCaseSurfaceManager {
    public final LinkedHashMap activeSurfaceMap;
    public final CameraPipeImpl cameraPipe;
    public LinkedHashMap configuredSurfaceMap;
    public final InactiveSurfaceCloser inactiveSurfaceCloser;
    public final Object lock;
    public final SessionConfigAdapter sessionConfigAdapter;
    public DeferredCoroutine setupDeferred;
    public CompletableDeferredImpl stopDeferred;
    public final UseCaseThreads threads;

    public UseCaseSurfaceManager(UseCaseThreads useCaseThreads, CameraPipeImpl cameraPipeImpl, InactiveSurfaceCloser inactiveSurfaceCloser, SessionConfigAdapter sessionConfigAdapter) {
        useCaseThreads.getClass();
        sessionConfigAdapter.getClass();
        this.threads = useCaseThreads;
        this.cameraPipe = cameraPipeImpl;
        this.inactiveSurfaceCloser = inactiveSurfaceCloser;
        this.sessionConfigAdapter = sessionConfigAdapter;
        this.lock = new Object();
        this.activeSurfaceMap = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$getSurfaces(UseCaseSurfaceManager useCaseSurfaceManager, List list, long j, ContinuationImpl continuationImpl) {
        UseCaseSurfaceManager$getSurfaces$1 useCaseSurfaceManager$getSurfaces$1;
        int i;
        if (continuationImpl instanceof UseCaseSurfaceManager$getSurfaces$1) {
            useCaseSurfaceManager$getSurfaces$1 = (UseCaseSurfaceManager$getSurfaces$1) continuationImpl;
            int i2 = useCaseSurfaceManager$getSurfaces$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                useCaseSurfaceManager$getSurfaces$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = useCaseSurfaceManager$getSurfaces$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = useCaseSurfaceManager$getSurfaces$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ThumbNode$onAttach$1 thumbNode$onAttach$1 = new ThumbNode$onAttach$1(list, continuation, 4);
                    useCaseSurfaceManager$getSurfaces$1.label = 1;
                    obj = JobKt.withTimeoutOrNull(j, thumbNode$onAttach$1, useCaseSurfaceManager$getSurfaces$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                List list2 = (List) obj;
                return list2 != null ? EmptyList.INSTANCE : list2;
            }
        }
        useCaseSurfaceManager$getSurfaces$1 = new UseCaseSurfaceManager$getSurfaces$1(useCaseSurfaceManager, continuationImpl);
        Object obj2 = useCaseSurfaceManager$getSurfaces$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = useCaseSurfaceManager$getSurfaces$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        List list22 = (List) obj2;
        if (list22 != null) {
        }
    }

    public static final void access$setSurfaceListener(UseCaseSurfaceManager useCaseSurfaceManager) {
        Set keySet;
        CameraSurfaceManager cameraSurfaceManager = useCaseSurfaceManager.cameraPipe.cameraSurfaceManager();
        cameraSurfaceManager.getClass();
        synchronized (cameraSurfaceManager.lock) {
            try {
                cameraSurfaceManager.listeners.add(useCaseSurfaceManager);
                LinkedHashMap linkedHashMap = cameraSurfaceManager.useCountMap;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((Number) entry.getValue()).intValue() > 0) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                keySet = linkedHashMap2.keySet();
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            useCaseSurfaceManager.onSurfaceActive((Surface) it.next());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object awaitSetupCompletion$suspendImpl(UseCaseSurfaceManager useCaseSurfaceManager, ContinuationImpl continuationImpl) {
        UseCaseSurfaceManager$awaitSetupCompletion$1 useCaseSurfaceManager$awaitSetupCompletion$1;
        int i;
        try {
            if (continuationImpl instanceof UseCaseSurfaceManager$awaitSetupCompletion$1) {
                useCaseSurfaceManager$awaitSetupCompletion$1 = (UseCaseSurfaceManager$awaitSetupCompletion$1) continuationImpl;
                int i2 = useCaseSurfaceManager$awaitSetupCompletion$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    useCaseSurfaceManager$awaitSetupCompletion$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = useCaseSurfaceManager$awaitSetupCompletion$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = useCaseSurfaceManager$awaitSetupCompletion$1.label;
                    if (i == 0) {
                        if (i == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    synchronized (useCaseSurfaceManager.lock) {
                        DeferredCoroutine deferredCoroutine = useCaseSurfaceManager.setupDeferred;
                        if (deferredCoroutine == null || useCaseSurfaceManager.stopDeferred != null) {
                            return Boolean.FALSE;
                        }
                        useCaseSurfaceManager$awaitSetupCompletion$1.label = 1;
                        Object awaitInternal = deferredCoroutine.awaitInternal(useCaseSurfaceManager$awaitSetupCompletion$1);
                        return awaitInternal == coroutineSingletons ? coroutineSingletons : awaitInternal;
                    }
                }
            }
            if (i == 0) {
            }
        } catch (CancellationException unused) {
            if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                Log.w("CXCP", "Surface setup was cancelled");
            }
            return Boolean.FALSE;
        }
        useCaseSurfaceManager$awaitSetupCompletion$1 = new UseCaseSurfaceManager$awaitSetupCompletion$1(useCaseSurfaceManager, continuationImpl);
        Object obj2 = useCaseSurfaceManager$awaitSetupCompletion$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = useCaseSurfaceManager$awaitSetupCompletion$1.label;
    }

    public final void onSurfaceActive(Surface surface) {
        DeferrableSurface deferrableSurface;
        surface.getClass();
        synchronized (this.lock) {
            try {
                LinkedHashMap linkedHashMap = this.configuredSurfaceMap;
                if (linkedHashMap != null && (deferrableSurface = (DeferrableSurface) linkedHashMap.get(surface)) != null && !this.activeSurfaceMap.containsKey(surface)) {
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "SurfaceActive " + deferrableSurface + " in " + this);
                    }
                    this.activeSurfaceMap.put(surface, deferrableSurface);
                    try {
                        deferrableSurface.incrementUseCount();
                    } catch (DeferrableSurface.SurfaceClosedException e) {
                        if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                            Log.w("CXCP", "Error when " + surface + " going to increase the use count.", e);
                        }
                        SessionConfigAdapter sessionConfigAdapter = this.sessionConfigAdapter;
                        DeferrableSurface deferrableSurface2 = e.mDeferrableSurface;
                        deferrableSurface2.getClass();
                        sessionConfigAdapter.reportSurfaceInvalid(deferrableSurface2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void tryClearSurfaceListener() {
        synchronized (this.lock) {
            try {
                if (this.activeSurfaceMap.isEmpty() && this.configuredSurfaceMap == null) {
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", this + " remove surface listener");
                    }
                    CameraSurfaceManager cameraSurfaceManager = this.cameraPipe.cameraSurfaceManager();
                    cameraSurfaceManager.getClass();
                    synchronized (cameraSurfaceManager.lock) {
                        cameraSurfaceManager.listeners.remove(this);
                    }
                    CompletableDeferredImpl completableDeferredImpl = this.stopDeferred;
                    if (completableDeferredImpl != null) {
                        completableDeferredImpl.makeCompleting$kotlinx_coroutines_core(Unit.INSTANCE);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
