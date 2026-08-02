package androidx.camera.camera2.adapter;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import androidx.camera.core.impl.AbstractCameraPresenceSource$ObserverWrapper;
import androidx.camera.core.impl.Observable;
import androidx.compose.material.SliderDraggableState$drag$2;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.concurrent.futures.ResolvableFuture;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$clear$2;
import app.cash.local.store.real.RealLocalInstalledStore$hideBrands$$inlined$map$1;
import com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2;
import com.google.common.util.concurrent.ListenableFuture;
import com.squareup.cash.api.Aliases;
import com.squareup.cash.card.onboarding.CardModelView;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes3.dex */
public final class PipeCameraPresenceSource implements Observable {
    public final CameraManager cameraManager;
    public final ContextScope coroutineScope;
    public StandaloneCoroutine flowCollectionJob;
    public final Flow idFlow;
    public final AtomicBoolean isMonitoring;
    public List mCurrentData;
    public Throwable mCurrentError;
    public boolean mIsActive;
    public final Object mLock;
    public final CopyOnWriteArrayList mObservers;

    public PipeCameraPresenceSource(ReadonlySharedFlow readonlySharedFlow, ContextScope contextScope, List list, Context context) {
        readonlySharedFlow.getClass();
        list.getClass();
        context.getClass();
        this.mLock = new Object();
        this.mObservers = new CopyOnWriteArrayList();
        this.mCurrentError = null;
        this.mIsActive = false;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            str.getClass();
            arrayList.add(Aliases.create(str, null, null));
        }
        this.mCurrentData = arrayList;
        this.idFlow = readonlySharedFlow;
        this.coroutineScope = contextScope;
        this.isMonitoring = new AtomicBoolean(false);
        Object systemService = context.getSystemService("camera");
        systemService.getClass();
        this.cameraManager = (CameraManager) systemService;
    }

    @Override // androidx.camera.core.impl.Observable
    public final void addObserver(Executor executor, Observable.Observer observer) {
        List unmodifiableList;
        Throwable th;
        executor.getClass();
        observer.getClass();
        this.mObservers.add(new AbstractCameraPresenceSource$ObserverWrapper(executor, observer));
        synchronized (this.mLock) {
            try {
                if (!this.mIsActive && !this.mObservers.isEmpty()) {
                    Log.i("CameraPresenceSrc", "First observer added. Starting monitoring.");
                    this.mIsActive = true;
                    startMonitoring();
                }
                unmodifiableList = Collections.unmodifiableList(this.mCurrentData);
                th = this.mCurrentError;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        executor.execute(new AFd1wSDK$$ExternalSyntheticLambda2(th, new AbstractCameraPresenceSource$ObserverWrapper(executor, observer), unmodifiableList));
    }

    @Override // androidx.camera.core.impl.Observable
    public final ListenableFuture fetchData() {
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
        callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
        callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
        callbackToFutureAdapter$Completer.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
        try {
            JobKt.launch$default(this.coroutineScope, null, null, new RealBadger2$clear$2(this, callbackToFutureAdapter$Completer, (Continuation) null, 1), 3);
            callbackToFutureAdapter$Completer.tag = "FetchData for PipeCameraPresence0";
        } catch (Exception e) {
            callbackToFutureAdapter$SafeFuture.setException(e);
        }
        return callbackToFutureAdapter$SafeFuture;
    }

    @Override // androidx.camera.core.impl.Observable
    public final void removeObserver(Observable.Observer observer) {
        AbstractCameraPresenceSource$ObserverWrapper abstractCameraPresenceSource$ObserverWrapper;
        observer.getClass();
        Iterator it = this.mObservers.iterator();
        while (true) {
            if (!it.hasNext()) {
                abstractCameraPresenceSource$ObserverWrapper = null;
                break;
            } else {
                abstractCameraPresenceSource$ObserverWrapper = (AbstractCameraPresenceSource$ObserverWrapper) it.next();
                if (abstractCameraPresenceSource$ObserverWrapper.mObserver.equals(observer)) {
                    break;
                }
            }
        }
        if (abstractCameraPresenceSource$ObserverWrapper != null) {
            this.mObservers.remove(abstractCameraPresenceSource$ObserverWrapper);
        }
        synchronized (this.mLock) {
            try {
                if (this.mIsActive && this.mObservers.isEmpty()) {
                    Log.i("CameraPresenceSrc", "Last observer removed. Stopping monitoring.");
                    this.mIsActive = false;
                    Log.i("PipePresenceSrc", "Stopping camera ID flow collection.");
                    if (this.isMonitoring.compareAndSet(true, false)) {
                        StandaloneCoroutine standaloneCoroutine = this.flowCollectionJob;
                        if (standaloneCoroutine != null) {
                            standaloneCoroutine.cancel(null);
                        }
                        this.flowCollectionJob = null;
                    }
                }
            } finally {
            }
        }
    }

    public final void startMonitoring() {
        int i = 1;
        if (!this.isMonitoring.compareAndSet(false, true)) {
            Log.i("PipePresenceSrc", "Monitoring is already active. Ignoring redundant start call.");
            return;
        }
        Log.i("PipePresenceSrc", "Starting to collect camera ID flow.");
        StandaloneCoroutine standaloneCoroutine = this.flowCollectionJob;
        Continuation continuation = null;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        this.flowCollectionJob = FlowKt.launchIn(new FinishSetupTileBadgeCounter(21, new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new RealLocalInstalledStore$hideBrands$$inlined$map$1(this.idFlow, 1), new SliderDraggableState$drag$2(this, ref$BooleanRef, continuation, i), 3), new CardModelView.AnonymousClass1.AnonymousClass4(this, continuation, i)), this.coroutineScope);
    }

    public final void updateState(List list, Throwable th) {
        boolean z;
        boolean z2;
        List unmodifiableList;
        Throwable th2;
        synchronized (this.mLock) {
            try {
                if (th != null) {
                    if (this.mCurrentError != null && this.mCurrentData.isEmpty()) {
                        z2 = false;
                        this.mCurrentError = th;
                        this.mCurrentData = Collections.EMPTY_LIST;
                    }
                    z2 = true;
                    this.mCurrentError = th;
                    this.mCurrentData = Collections.EMPTY_LIST;
                } else {
                    list.getClass();
                    if (this.mCurrentError == null && this.mCurrentData.equals(list)) {
                        z = false;
                        this.mCurrentError = null;
                        this.mCurrentData = list;
                        z2 = z;
                    }
                    z = true;
                    this.mCurrentError = null;
                    this.mCurrentData = list;
                    z2 = z;
                }
                unmodifiableList = Collections.unmodifiableList(this.mCurrentData);
                th2 = this.mCurrentError;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z2) {
            StringBuilder sb = new StringBuilder("Data changed. Notifying ");
            sb.append(this.mObservers.size());
            sb.append(" observers. Error: ");
            sb.append(th2 != null);
            Log.d("CameraPresenceSrc", sb.toString());
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                AbstractCameraPresenceSource$ObserverWrapper abstractCameraPresenceSource$ObserverWrapper = (AbstractCameraPresenceSource$ObserverWrapper) it.next();
                abstractCameraPresenceSource$ObserverWrapper.mExecutor.execute(new AFd1wSDK$$ExternalSyntheticLambda2(th2, abstractCameraPresenceSource$ObserverWrapper, unmodifiableList));
            }
        }
    }
}
