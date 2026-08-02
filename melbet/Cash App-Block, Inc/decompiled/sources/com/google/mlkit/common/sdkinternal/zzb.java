package com.google.mlkit.common.sdkinternal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import android.view.Surface;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.runtime.OffsetApplier;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import com.android.volley.Response;
import com.fillr.browsersdk.Fillr;
import com.google.android.filament.Box;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.mlkit_common.zzrq;
import com.google.android.gms.internal.mlkit_common.zzsu;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzc;
import com.google.android.libraries.places.internal.zzbpq;
import com.google.android.libraries.places.internal.zzbqd;
import com.google.android.libraries.places.internal.zzbsn;
import com.google.android.libraries.places.internal.zzbtb;
import com.google.android.libraries.places.internal.zzbtc;
import com.google.android.libraries.places.internal.zzbtd;
import com.google.android.libraries.places.internal.zzbtx;
import com.google.android.libraries.places.internal.zzbtz;
import com.google.android.libraries.places.internal.zzbuf;
import com.google.android.libraries.places.internal.zzbvo;
import com.google.android.libraries.places.internal.zzbwq;
import com.google.android.libraries.places.internal.zzbyi;
import com.google.android.libraries.places.internal.zzbzz;
import com.google.android.libraries.places.internal.zzcaf;
import com.google.android.libraries.places.internal.zzcah;
import com.google.android.libraries.places.internal.zzcax;
import com.google.android.libraries.places.internal.zzcbi;
import com.google.android.libraries.places.internal.zzcbr;
import com.google.android.libraries.places.internal.zzcbs;
import com.google.android.libraries.places.internal.zzcby;
import com.google.android.libraries.places.internal.zzcfa;
import com.google.android.libraries.places.internal.zzcfj;
import com.google.android.libraries.places.internal.zzcfk;
import com.google.android.libraries.places.internal.zzchy;
import com.google.android.libraries.places.internal.zzfv;
import com.google.android.libraries.places.internal.zzmu;
import com.google.android.libraries.places.internal.zzql;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.common.base.Ascii;
import com.google.common.util.concurrent.AbstractFutureState;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.SequentialExecutor;
import com.google.mlkit.common.MlKitException;
import com.miteksystems.misnap.camera.a.n;
import com.miteksystems.misnap.camera.frameproducers.FrameLoader;
import com.miteksystems.misnap.camera.frameproducers.a;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.mixed.SingleFlatMapObservable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSubscribeOn;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import papa.SafeTrace;
import retrofit2.KotlinExtensions$suspendAndThrow$1;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzb implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public Object zza;
    public final Object zzb;

    public zzb(zzbyi zzbyiVar, zzbtb zzbtbVar) {
        this.$r8$classId = 1;
        this.zzb = zzbyiVar;
        Trace.checkNotNull(zzbtbVar, "savedListener");
        this.zza = zzbtbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0232, code lost:
    
        if (r2 != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x045c, code lost:
    
        if (r1.zza.zzc() != false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0478, code lost:
    
        if (r1.zza.zzc() != false) goto L191;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        zzbzz zzbzzVar;
        Throwable tryInternalFastPathGetFailure;
        zzbtd zzbtdVar = null;
        r1 = null;
        zzcaf zzcafVar = null;
        zzbtdVar = null;
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.$r8$classId) {
            case 0:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.zza;
                while (!((Set) this.zzb).isEmpty()) {
                    try {
                        zzd zzdVar = (zzd) referenceQueue.remove();
                        if (zzdVar.zza.remove(zzdVar)) {
                            zzdVar.clear();
                            zzdVar.zzb.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 1:
                zzbyi zzbyiVar = (zzbyi) this.zzb;
                Logger logger = zzbyi.zzh;
                Level level = Level.FINER;
                if (logger.isLoggable(level)) {
                    logger.logp(level, "io.grpc.internal.DnsNameResolver$Resolve", "run", "Attempting DNS resolution of ".concat(String.valueOf(zzbyiVar.zzr)));
                }
                int i2 = 3;
                try {
                    try {
                        zzbqd zzf = zzbyiVar.zzf();
                        if (zzf != null) {
                            if (logger.isLoggable(level)) {
                                String zzbqdVar = zzf.toString();
                                StringBuilder sb = new StringBuilder(zzbqdVar.length() + 20);
                                sb.append("Using proxy address ");
                                sb.append(zzbqdVar);
                                logger.logp(level, "io.grpc.internal.DnsNameResolver$Resolve", "run", sb.toString());
                            }
                            zzbtc zzbtcVar = new zzbtc();
                            zzbtz zzbtzVar = new zzbtz(null, Collections.singletonList(zzf));
                            zzbtcVar.zza = zzbtzVar;
                            zzbtdVar = new zzbtd(zzbtzVar, zzbtcVar.zzb, zzbtcVar.zzc);
                        } else {
                            zzbtdVar = zzbyiVar.zze();
                        }
                        zzbuf zzbufVar = zzbyiVar.zzv;
                        zzbufVar.zzb(new zzc(this, zzbtdVar, objArr2 == true ? 1 : 0, 28));
                        zzbufVar.zza();
                        break;
                    } catch (IOException e) {
                        zzbuf zzbufVar2 = zzbyiVar.zzv;
                        zzbufVar2.zzb(new zzc(this, e, objArr == true ? 1 : 0, 29));
                        zzbufVar2.zza();
                        if (zzbtdVar != null) {
                            break;
                        }
                        r2 = false;
                        zzjy zzjyVar = new zzjy(this, r2, i2);
                        zzbuf zzbufVar3 = zzbyiVar.zzv;
                        zzbufVar3.zzb(zzjyVar);
                        zzbufVar3.zza();
                        return;
                    }
                } catch (Throwable th) {
                    zzjy zzjyVar2 = new zzjy(this, zzbtdVar != null && zzbtdVar.zza.zzc(), i2);
                    zzbuf zzbufVar4 = zzbyiVar.zzv;
                    zzbufVar4.zzb(zzjyVar2);
                    zzbufVar4.zza();
                    throw th;
                }
                break;
            case 2:
                zzcah zzcahVar = (zzcah) this.zzb;
                OffsetApplier offsetApplier = zzcahVar.zzm;
                List list = (List) this.zza;
                SocketAddress socketAddress = (SocketAddress) ((zzbqd) ((List) offsetApplier.applier).get(offsetApplier.offset)).zzd.get(offsetApplier.nesting);
                offsetApplier.applier = list;
                offsetApplier.zzd();
                zzcahVar.zzn = list;
                zzbpq zzbpqVar = zzcahVar.zzw.zza;
                zzbpq zzbpqVar2 = zzbpq.zzb;
                if (zzbpqVar == zzbpqVar2 || zzcahVar.zzw.zza == zzbpq.zza) {
                    OffsetApplier offsetApplier2 = zzcahVar.zzm;
                    while (true) {
                        if (i < ((List) offsetApplier2.applier).size()) {
                            int indexOf = ((zzbqd) ((List) offsetApplier2.applier).get(i)).zzd.indexOf(socketAddress);
                            if (indexOf == -1) {
                                i++;
                            } else {
                                offsetApplier2.offset = i;
                                offsetApplier2.nesting = indexOf;
                            }
                        } else if (zzcahVar.zzw.zza == zzbpqVar2) {
                            zzbzzVar = zzcahVar.zzv;
                            zzcahVar.zzv = null;
                            zzcahVar.zzm.zzd();
                            zzcahVar.zzh(zzbpq.zzd);
                        } else {
                            zzcahVar.zzu.zzd(zzbtx.zzi.zze("InternalSubchannel closed pending transport due to address change"));
                            zzcahVar.zzu = null;
                            zzcahVar.zzm.zzd();
                            zzcahVar.zzf();
                        }
                    }
                }
                zzbzzVar = null;
                if (zzbzzVar != null) {
                    if (zzcahVar.zzq != null) {
                        zzcahVar.zzr.zzd(zzbtx.zzi.zze("InternalSubchannel closed transport early due to address change"));
                        zzcahVar.zzq.zza();
                        zzcahVar.zzq = null;
                        zzcahVar.zzr = null;
                    }
                    zzcahVar.zzr = zzbzzVar;
                    zzcahVar.zzq = zzcahVar.zzl.zzd(zzcahVar.zzf, new zzmu(this, 7), 5L, TimeUnit.SECONDS);
                    return;
                }
                return;
            case 3:
                ((zzcbi) this.zzb).zzc((zzbtx) this.zza);
                return;
            case 4:
                zzcbr zzcbrVar = (zzcbr) this.zza;
                zzcbs zzcbsVar = (zzcbs) this.zzb;
                if (zzcbsVar.zzb.get() != zzcby.zzh) {
                    zzcbrVar.zzm$1();
                    return;
                }
                zzcby zzcbyVar = zzcbsVar.zza;
                if (zzcbyVar.zzI == null) {
                    zzcbyVar.zzI = new LinkedHashSet();
                    zzcbyVar.zzf.zza(zzcbyVar.zzJ, true);
                }
                zzcbyVar.zzI.add(zzcbrVar);
                return;
            case 5:
                ((zzbvo) this.zza).run();
                zzcbr zzcbrVar2 = (zzcbr) this.zzb;
                zzbwq zzbwqVar = new zzbwq(zzcbrVar2, 1);
                zzbuf zzbufVar5 = zzcbrVar2.zzd.zza.zze;
                zzbufVar5.zzb(zzbwqVar);
                zzbufVar5.zza();
                return;
            case 6:
                zzb zzbVar = (zzb) this.zzb;
                zzcax zzcaxVar = (zzcax) zzbVar.zzb;
                synchronized (zzcaxVar.zzl) {
                    try {
                        if (!((zzcaf) zzbVar.zza).zzb) {
                            zzcaxVar.zzr = zzcaxVar.zzr.zzc((zzcfj) this.zza);
                            if (zzcaxVar.zzaj(zzcaxVar.zzr)) {
                                zzcfk zzcfkVar = zzcaxVar.zzp;
                                if (zzcfkVar != null) {
                                    if (zzcfkVar.zzd.get() <= zzcfkVar.zzb) {
                                        r2 = false;
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                zzcafVar = new zzcaf(zzcaxVar.zzl);
                                zzcaxVar.zzz = zzcafVar;
                                r2 = false;
                            }
                            zzcfa zzcfaVar = zzcaxVar.zzr;
                            if (!zzcfaVar.zzh) {
                                zzcfaVar = new zzcfa(zzcfaVar.zzb, zzcfaVar.zzc, zzcfaVar.zzd, zzcfaVar.zzf, zzcfaVar.zzg, zzcfaVar.zza, true, zzcfaVar.zze);
                            }
                            zzcaxVar.zzr = zzcfaVar;
                            zzcaxVar.zzz = null;
                            r2 = false;
                        }
                    } finally {
                    }
                }
                if (r2) {
                    zzcfj zzcfjVar = (zzcfj) this.zza;
                    zzcfjVar.zza.zzf(new Box((zzcax) ((zzb) this.zzb).zzb, zzcfjVar));
                    zzcfjVar.zza.zzl(zzbtx.zzb.zze("Unneeded hedging"));
                    return;
                } else {
                    if (zzcafVar != null) {
                        zzcax zzcaxVar2 = (zzcax) ((zzb) this.zzb).zzb;
                        zzcafVar.zza(zzcaxVar2.zzg.schedule(new zzb(zzcaxVar2, zzcafVar), zzcaxVar2.zzj.zzb, TimeUnit.NANOSECONDS));
                    }
                    ((zzcax) ((zzb) this.zzb).zzb).zzah((zzcfj) this.zza);
                    return;
                }
            case 7:
                zzcax zzcaxVar3 = (zzcax) this.zzb;
                zzcfj zzag = zzcaxVar3.zzag(zzcaxVar3.zzr.zze, false, true);
                if (zzag == null) {
                    return;
                }
                zzcaxVar3.zzc$1.execute(new zzb(6, this, zzag));
                return;
            case 8:
                ((zzcax) ((Box) this.zzb).mHalfExtent).zzx.zza((zzbsn) this.zza);
                return;
            case 9:
                ((zzcax) ((Box) ((Fillr.AnonymousClass2) this.zzb).this$0).mHalfExtent).zzah((zzcfj) this.zza);
                return;
            case 10:
                ((zzcax) ((Box) this.zzb).mHalfExtent).zzah((zzcfj) this.zza);
                return;
            case 11:
                ((zzcax) ((Box) this.zzb).mHalfExtent).zzx.zzb((zzfv) this.zza);
                return;
            case 12:
                try {
                    ((CyclicBarrier) this.zza).await(1000L, TimeUnit.MILLISECONDS);
                    ((CountDownLatch) this.zzb).await();
                    return;
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                    return;
                } catch (BrokenBarrierException | TimeoutException unused3) {
                    return;
                }
            case 13:
                ((zzql) this.zza).zza.setImageBitmap((Bitmap) this.zzb);
                return;
            case 14:
                try {
                    ((SplitCompat) this.zzb).zzg((HashSet) this.zza);
                    return;
                } catch (Exception e2) {
                    Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", e2);
                    return;
                }
            case 15:
                FutureCallback futureCallback = (FutureCallback) this.zzb;
                Future future = (Future) this.zza;
                if ((future instanceof AbstractFutureState) && (tryInternalFastPathGetFailure = ((AbstractFutureState) future).tryInternalFastPathGetFailure()) != null) {
                    futureCallback.onFailure(tryInternalFastPathGetFailure);
                    return;
                }
                try {
                    futureCallback.onSuccess(Futures.getDone(future));
                    return;
                } catch (ExecutionException e3) {
                    futureCallback.onFailure(e3.getCause());
                    return;
                } catch (Throwable th2) {
                    futureCallback.onFailure(th2);
                    return;
                }
            case 16:
                try {
                    workOnQueue();
                    return;
                } catch (Error e4) {
                    synchronized (((SequentialExecutor) this.zzb).queue) {
                        ((SequentialExecutor) this.zzb).workerRunningState = 1;
                        throw e4;
                    }
                }
            case 17:
                Callable callable = (Callable) this.zza;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.zzb;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (MlKitException e5) {
                    taskCompletionSource.setException(e5);
                    return;
                } catch (Exception e6) {
                    taskCompletionSource.setException(new MlKitException(13, e6, "Internal error has occurred when executing ML Kit tasks"));
                    return;
                }
            case 18:
                MLTask mLTask = (MLTask) this.zza;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.zzb;
                int decrementAndGet = mLTask.zza.decrementAndGet();
                zzae.checkState(decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    mLTask.release();
                    mLTask.zzb.set(false);
                }
                zzrq.zza.clear();
                zzsu.zza.clear();
                taskCompletionSource2.setResult(null);
                return;
            case 19:
                Response response = (Response) this.zza;
                AtomicReference atomicReference = (AtomicReference) response.error;
                zzae.checkState(((Thread) atomicReference.getAndSet(Thread.currentThread())) == null);
                try {
                    ((Runnable) this.zzb).run();
                    atomicReference.set(null);
                    response.zzc();
                    return;
                } finally {
                }
            case 20:
                Surface surface = (Surface) this.zzb;
                FrameLoader frameLoader = (FrameLoader) this.zza;
                if (frameLoader.n) {
                    frameLoader.n = false;
                    MutableLiveData mutableLiveData = frameLoader.e;
                    a aVar = frameLoader.o;
                    if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
                        mutableLiveData.setValue(aVar);
                    } else {
                        mutableLiveData.postValue(aVar);
                    }
                }
                Rect rect = new Rect(0, 0, frameLoader.l.getWidth(), frameLoader.l.getHeight());
                if (surface.isValid()) {
                    Canvas lockCanvas = surface.lockCanvas(rect);
                    lockCanvas.drawBitmap(frameLoader.l, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, (Paint) null);
                    surface.unlockCanvasAndPost(lockCanvas);
                    frameLoader.i.postDelayed(this, 500L);
                    return;
                }
                return;
            case 21:
                ((Observable) ((ObservableSubscribeOn) this.zzb).source).subscribe((SingleFlatMapObservable.FlatMapObserver) this.zza);
                return;
            case 22:
                ((CancellableContinuationImpl) this.zzb).resumeUndispatched((ExecutorCoroutineDispatcherImpl) this.zza, Unit.INSTANCE);
                return;
            default:
                Continuation intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted((KotlinExtensions$suspendAndThrow$1) this.zza);
                Result.Companion companion = Result.Companion;
                intercepted.resumeWith(SafeTrace.createFailure((Throwable) this.zzb));
                return;
        }
    }

    public String toString() {
        int i = this.$r8$classId;
        int i2 = 4;
        Object obj = this.zzb;
        switch (i) {
            case 15:
                Response stringHelper = Ascii.toStringHelper(this);
                n nVar = new n(i2);
                ((n) stringHelper.error).c = nVar;
                stringHelper.error = nVar;
                nVar.b = (FutureCallback) obj;
                return stringHelper.toString();
            case 16:
                Runnable runnable = (Runnable) this.zza;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i3 = ((SequentialExecutor) obj).workerRunningState;
                sb.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.zza).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        com.google.common.util.concurrent.SequentialExecutor.log.get().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.zza), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        r10.zza = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void workOnQueue() {
        boolean z = false;
        boolean z2 = false;
        while (true) {
            try {
                synchronized (((SequentialExecutor) this.zzb).queue) {
                    if (!z) {
                        SequentialExecutor sequentialExecutor = (SequentialExecutor) this.zzb;
                        if (sequentialExecutor.workerRunningState != 4) {
                            sequentialExecutor.workerRunCount++;
                            sequentialExecutor.workerRunningState = 4;
                            z = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((SequentialExecutor) this.zzb).queue.poll();
                    this.zza = runnable;
                    if (runnable == null) {
                        ((SequentialExecutor) this.zzb).workerRunningState = 1;
                    }
                }
                if (!z2) {
                    return;
                }
            } finally {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public /* synthetic */ zzb(Object obj, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.zza = obj;
        this.zzb = obj2;
    }

    public /* synthetic */ zzb(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.zza = obj2;
        this.zzb = obj;
    }

    public zzb(zzcah zzcahVar, List list) {
        this.$r8$classId = 2;
        this.zza = list;
        Objects.requireNonNull(zzcahVar);
        this.zzb = zzcahVar;
    }

    public zzb(zzcax zzcaxVar, zzcaf zzcafVar) {
        this.$r8$classId = 7;
        Objects.requireNonNull(zzcaxVar);
        this.zzb = zzcaxVar;
        this.zza = zzcafVar;
    }

    public zzb(zzcbr zzcbrVar, zzbvo zzbvoVar) {
        this.$r8$classId = 5;
        this.zza = zzbvoVar;
        Objects.requireNonNull(zzcbrVar);
        this.zzb = zzcbrVar;
    }

    public zzb(zzchy zzchyVar, CyclicBarrier cyclicBarrier, CountDownLatch countDownLatch) {
        this.$r8$classId = 12;
        this.zza = cyclicBarrier;
        this.zzb = countDownLatch;
    }

    public zzb(SequentialExecutor sequentialExecutor) {
        this.$r8$classId = 16;
        this.zzb = sequentialExecutor;
    }
}
