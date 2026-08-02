package androidx.camera.camera2.impl;

import android.util.Log;
import androidx.camera.camera2.compat.workaround.TargetAspectRatio;
import androidx.camera.camera2.impl.UseCaseManager;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.badging.backend.RealBadger2$clear$2;
import com.squareup.cash.money.loadable.LoadableStateKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.JobKt;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class State3AControl implements UseCaseCameraControl, UseCaseManager.RunningUseCasesChangeListener {
    public int _flashMode;
    public Integer _preferredAeMode;
    public Integer _preferredFocusMode;
    public UseCaseCameraRequestControl _requestControl;
    public int _template;
    public boolean _tryExternalFlashAeMode;
    public final TargetAspectRatio aeModeDisabler;
    public final CameraPipeCameraProperties cameraProperties;
    public long currentRevision;
    public final Object lock;
    public final ArrayList pendingSignals;
    public final UseCaseThreads threads;

    public State3AControl(CameraPipeCameraProperties cameraPipeCameraProperties, TargetAspectRatio targetAspectRatio, UseCaseThreads useCaseThreads) {
        cameraPipeCameraProperties.getClass();
        useCaseThreads.getClass();
        this.cameraProperties = cameraPipeCameraProperties;
        this.aeModeDisabler = targetAspectRatio;
        this.threads = useCaseThreads;
        this.lock = new Object();
        this.pendingSignals = new ArrayList();
        this._flashMode = 2;
        this._template = 1;
    }

    public final void failAllPendingSignals(Exception exc) {
        List list;
        synchronized (this.lock) {
            list = CollectionsKt.toList(this.pendingSignals);
            this.pendingSignals.clear();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((CompletableDeferred) it.next()).completeExceptionally(exc);
        }
    }

    public final int getFinalPreferredAeMode(int i, Integer num, boolean z) {
        int i2;
        if (num == null) {
            if (i == 0) {
                switch (this.aeModeDisabler.$r8$classId) {
                    case 1:
                        i2 = 1;
                        break;
                    default:
                        i2 = 2;
                        break;
                }
            } else {
                if (i == 1) {
                    i2 = 3;
                }
                i2 = 1;
            }
        } else {
            i2 = num.intValue();
        }
        if (z) {
            CameraMetadata cameraMetadata = this.cameraProperties.metadata;
            cameraMetadata.getClass();
            if (LoadableStateKt.getSupportedAeMode(cameraMetadata, 5) == 5) {
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "State3AControl.invalidate: trying external flash AE mode.");
                }
                i2 = 5;
            }
        }
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            CameraState$Type$EnumUnboxingLocalUtility.m(i2, "State3AControl.getFinalPreferredAeMode: preferAeMode = ", "CXCP");
        }
        return i2;
    }

    public final int getFinalSupportedAeMode() {
        int supportedAeMode;
        synchronized (this.lock) {
            supportedAeMode = LoadableStateKt.getSupportedAeMode(this.cameraProperties.metadata, getFinalPreferredAeMode(this._flashMode, this._preferredAeMode, this._tryExternalFlashAeMode));
        }
        return supportedAeMode;
    }

    @Override // androidx.camera.camera2.impl.UseCaseManager.RunningUseCasesChangeListener
    public final void onRunningUseCasesChanged(LinkedHashSet linkedHashSet) {
        JobKt.launch$default(this.threads.sequentialScope, null, null, new RealBadger2$clear$2((Continuation) null, CollectionsKt.toSet(linkedHashSet), this, 3), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void reset() {
        synchronized (this.lock) {
            this._tryExternalFlashAeMode = false;
            this._preferredAeMode = null;
            this._preferredFocusMode = null;
            this._flashMode = 2;
            this._template = 1;
        }
        update();
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this._requestControl = useCaseCameraRequestControl;
        update();
    }

    public final CompletableDeferredImpl update() {
        CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl();
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        synchronized (this.lock) {
            this.pendingSignals.add(completableDeferredImpl);
            long j = this.currentRevision + 1;
            this.currentRevision = j;
            ref$LongRef.element = j;
        }
        JobKt.launch$default(this.threads.sequentialScope, null, null, new RealBadger2$clear$2((Continuation) null, this, ref$LongRef, 4), 3);
        return completableDeferredImpl;
    }
}
