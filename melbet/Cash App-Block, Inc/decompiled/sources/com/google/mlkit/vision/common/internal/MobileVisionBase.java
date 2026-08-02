package com.google.mlkit.vision.common.internal;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.room.Room;
import coil3.request.OneShotDisposable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.vision.common.InputImage;
import com.squareup.cash.clientroutes.PatternRedaction;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public abstract class MobileVisionBase implements Closeable, LifecycleObserver {
    public static final PatternRedaction zzb = new PatternRedaction("MobileVisionBase", "");
    public final AtomicBoolean zzc = new AtomicBoolean(false);
    public final MLTask zzd;
    public final OneShotDisposable zze;
    public final Executor zzf;

    public MobileVisionBase(MLTask mLTask, Executor executor) {
        this.zzd = mLTask;
        OneShotDisposable oneShotDisposable = new OneShotDisposable(25);
        this.zze = oneShotDisposable;
        this.zzf = executor;
        mLTask.zza.incrementAndGet();
        mLTask.callAfterLoad(executor, zzb.zza, (com.google.android.gms.tasks.zzb) oneShotDisposable.job).addOnFailureListener(zzc.zza);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, com.google.mlkit.vision.barcode.BarcodeScanner
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public synchronized void close() {
        boolean z = true;
        if (this.zzc.getAndSet(true)) {
            return;
        }
        this.zze.cancel();
        MLTask mLTask = this.zzd;
        Executor executor = this.zzf;
        boolean z2 = false;
        if (mLTask.zza.get() <= 0) {
            z = false;
        }
        zzae.checkState(z);
        mLTask.taskQueue.submit(new com.google.mlkit.common.sdkinternal.zzb(mLTask, new TaskCompletionSource(), z2, 18), executor);
    }

    public final synchronized zzw processBase(InputImage inputImage) {
        zzae.checkNotNull(inputImage, "InputImage can not be null");
        if (this.zzc.get()) {
            return Room.forException(new MlKitException("This detector is already closed!", 14));
        }
        if (inputImage.zzd < 32 || inputImage.zze < 32) {
            return Room.forException(new MlKitException("InputImage width and height should be at least 32!", 3));
        }
        return this.zzd.callAfterLoad(this.zzf, new zza(this, inputImage), (com.google.android.gms.tasks.zzb) this.zze.job);
    }
}
