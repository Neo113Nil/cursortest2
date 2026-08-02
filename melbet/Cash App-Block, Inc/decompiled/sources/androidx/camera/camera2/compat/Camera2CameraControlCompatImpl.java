package androidx.camera.camera2.compat;

import androidx.appcompat.widget.Toolbar;
import androidx.biometric.BiometricPrompt;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.impl.TagsKt;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.compat.AndroidFrameInfo;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.TagBundle;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferredImpl;
import radiography.internal.RenderTreeStringKt;

/* loaded from: classes3.dex */
public final class Camera2CameraControlCompatImpl implements Request.Listener {
    public CompletableDeferredImpl pendingSignal;
    public CompletableDeferredImpl updateSignal;
    public final Object lock = new Object();
    public final Object updateSignalLock = new Object();
    public Toolbar.AnonymousClass1 configBuilder = new Toolbar.AnonymousClass1(5);

    public final void addRequestOption(BiometricPrompt biometricPrompt) {
        synchronized (this.lock) {
            for (AutoValue_Config_Option autoValue_Config_Option : biometricPrompt.listOptions()) {
                autoValue_Config_Option.getClass();
                ((MutableOptionsBundle) this.configBuilder.this$0).insertOption(autoValue_Config_Option, Config.OptionPriority.ALWAYS_OVERRIDE, biometricPrompt.retrieveOption(autoValue_Config_Option));
            }
        }
    }

    public final CompletableDeferredImpl applyAsync(UseCaseCameraRequestControl useCaseCameraRequestControl, boolean z) {
        Camera2ImplConfig build;
        CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl();
        synchronized (this.lock) {
            build = this.configBuilder.build();
        }
        synchronized (this.updateSignalLock) {
            try {
                if (useCaseCameraRequestControl != null) {
                    CompletableDeferredImpl completableDeferredImpl2 = this.updateSignal;
                    if (z) {
                        if (completableDeferredImpl2 != null) {
                            completableDeferredImpl2.completeExceptionally(new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options."));
                        }
                    } else if (completableDeferredImpl2 != null) {
                        RenderTreeStringKt.propagateTo(completableDeferredImpl, completableDeferredImpl2);
                    }
                    this.updateSignal = completableDeferredImpl;
                    useCaseCameraRequestControl.updateCamera2ConfigAsync(build, MapsKt__MapsJVMKt.mapOf(new Pair("Camera2CameraControl.tag", Integer.valueOf(completableDeferredImpl.hashCode()))));
                } else {
                    CompletableDeferredImpl completableDeferredImpl3 = this.pendingSignal;
                    if (completableDeferredImpl3 != null) {
                        completableDeferredImpl3.completeExceptionally(new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options."));
                    }
                    this.pendingSignal = completableDeferredImpl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return completableDeferredImpl;
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onComplete-CcXjc1I */
    public final void mo16onCompleteCcXjc1I(RequestMetadata requestMetadata, long j, AndroidFrameInfo androidFrameInfo) {
        synchronized (this.updateSignalLock) {
            CompletableDeferredImpl completableDeferredImpl = this.updateSignal;
            if (completableDeferredImpl != null) {
                if (Intrinsics.areEqual(((TagBundle) requestMetadata.getOrDefault(TagsKt.CAMERAX_TAG_BUNDLE, TagBundle.EMPTY_TAGBUNDLE)).mTagMap.get("Camera2CameraControl.tag"), Integer.valueOf(completableDeferredImpl.hashCode()))) {
                    completableDeferredImpl.makeCompleting$kotlinx_coroutines_core(null);
                    this.updateSignal = null;
                    CompletableDeferredImpl completableDeferredImpl2 = this.pendingSignal;
                    if (completableDeferredImpl2 != null) {
                        completableDeferredImpl2.makeCompleting$kotlinx_coroutines_core(null);
                        this.pendingSignal = null;
                    }
                }
            }
        }
    }
}
