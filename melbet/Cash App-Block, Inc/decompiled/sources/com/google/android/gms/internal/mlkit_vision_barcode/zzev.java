package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.camera.camera2.adapter.ZoomValue;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdz;
import com.google.mlkit.vision.barcode.ZoomSuggestionOptions;
import com.google.mlkit.vision.common.zzb;
import com.squareup.cash.androidsvg.SVGAndroidRenderer;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes4.dex */
public final class zzev extends AtomicReference implements Runnable {
    public static final zzeq zza$1 = new zzeq();
    public static final zzeq zzb$1 = new zzeq();
    public final /* synthetic */ zzew zza;
    public final SVGAndroidRenderer zzb;

    public zzev(zzew zzewVar, SVGAndroidRenderer sVGAndroidRenderer) {
        this.zza = zzewVar;
        this.zzb = sVGAndroidRenderer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        zzem zzemVar = null;
        if (compareAndSet(null, currentThread)) {
            zzew zzewVar = this.zza;
            boolean isDone = zzewVar.isDone();
            zzeq zzeqVar = zza$1;
            if (!isDone) {
                try {
                    zzemVar = zza();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, zzeqVar)) {
                            zzg(currentThread);
                        }
                        if (zzdz.zzc.zzf(zzewVar, null, new zzdz.zzc(th))) {
                            zzdz.zzv(zzewVar);
                            return;
                        }
                        return;
                    } catch (Throwable unused) {
                        if (!compareAndSet(currentThread, zzeqVar)) {
                            zzg(currentThread);
                        }
                        zzd(null);
                        throw null;
                    }
                }
            }
            if (!compareAndSet(currentThread, zzeqVar)) {
                zzg(currentThread);
            }
            if (isDone) {
                return;
            }
            zzd(zzemVar);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable runnable = (Runnable) get();
        return Recorder$$ExternalSyntheticOutline2.m(runnable == zza$1 ? "running=[DONE]" : runnable instanceof zzeo ? "running=[INTERRUPTED]" : runnable instanceof Thread ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]", ", ", this.zzb.toString());
    }

    public final zzem zza() {
        CameraControlInternal cameraControl;
        CameraInfo cameraInfo;
        LiveData zoomState;
        ZoomValue zoomValue;
        SVGAndroidRenderer sVGAndroidRenderer = this.zzb;
        zzxk zzxkVar = (zzxk) sVGAndroidRenderer.fullPath;
        float f = sVGAndroidRenderer.dpi;
        zzb zzbVar = zzxkVar.zzs;
        float f2 = zzxkVar.zzo;
        if (f < 1.0f) {
            f = 1.0f;
        }
        float f3 = RecyclerView.DECELERATION_RATE;
        if (f2 <= RecyclerView.DECELERATION_RATE || f <= f2) {
            f2 = f;
        }
        ZoomSuggestionOptions zoomSuggestionOptions = (ZoomSuggestionOptions) zzbVar.zza;
        int i = com.google.mlkit.vision.barcode.internal.zzh.$r8$clinit;
        MutableState mutableState = zoomSuggestionOptions.zza.f$0;
        Camera camera = (Camera) mutableState.getValue();
        Float valueOf = (camera == null || (cameraInfo = camera.getCameraInfo()) == null || (zoomState = cameraInfo.getZoomState()) == null || (zoomValue = (ZoomValue) zoomState.getValue()) == null) ? null : Float.valueOf(zoomValue.maxZoomRatio);
        if (valueOf != null && f2 < valueOf.floatValue()) {
            Camera camera2 = (Camera) mutableState.getValue();
            if (camera2 != null && (cameraControl = camera2.getCameraControl()) != null) {
                cameraControl.setZoomRatio(f2);
            }
            f3 = f2;
        }
        return new zzem(Float.valueOf(f3));
    }

    public final void zzd(zzem zzemVar) {
        Object zzbVar;
        Object obj;
        zzew zzewVar = this.zza;
        zzemVar.getClass();
        if (zzewVar.value == null) {
            boolean isCancelled = zzemVar.isCancelled();
            boolean z = true;
            if ((!zzdz.zza) && isCancelled) {
                zzbVar = zzdz.zzb.zzb;
                Objects.requireNonNull(zzbVar);
            } else {
                boolean z2 = false;
                while (true) {
                    try {
                        try {
                            obj = zzemVar.get();
                            break;
                        } catch (InterruptedException unused) {
                            z2 = z;
                        } catch (Throwable th) {
                            if (z2) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (Error | Exception e) {
                        zzbVar = new zzdz.zzc(e);
                    } catch (CancellationException e2) {
                        zzbVar = !isCancelled ? new zzdz.zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzemVar)), e2)) : new zzdz.zzb(e2, false);
                    } catch (ExecutionException e3) {
                        zzbVar = isCancelled ? new zzdz.zzb(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzemVar)), e3), false) : new zzdz.zzc(e3.getCause());
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                zzbVar = isCancelled ? new zzdz.zzb(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzemVar))), false) : obj == null ? zzdz.zzd : obj;
            }
            if (zzdz.zzc.zzf(zzewVar, null, zzbVar)) {
                zzdz.zzv(zzewVar);
            }
        }
    }

    public final void zzg(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzeo zzeoVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof zzeo;
            zzeq zzeqVar = zzb$1;
            if (!z2) {
                if (runnable != zzeqVar) {
                    break;
                }
            } else {
                zzeoVar = (zzeo) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == zzeqVar || compareAndSet(runnable, zzeqVar)) {
                z = Thread.interrupted() || z;
                LockSupport.park(zzeoVar);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }
}
