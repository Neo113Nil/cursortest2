package com.google.android.gms.measurement.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.work.impl.WorkLauncherImpl;
import com.google.android.libraries.places.internal.zzbtx;
import com.google.android.libraries.places.internal.zzcbr;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTimeoutTimed$TimeoutObserver;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public final class zzly implements Runnable {
    public final /* synthetic */ int $r8$classId = 3;
    public final long zza;
    public final Object zzb;

    public zzly(zzmb zzmbVar, long j) {
        this.zza = j;
        Objects.requireNonNull(zzmbVar);
        this.zzb = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        long j = this.zza;
        Object obj = this.zzb;
        switch (i) {
            case 0:
                zzmb zzmbVar = (zzmb) obj;
                zzd zzdVar = ((zzic) zzmbVar.$$delegate_0).zzq;
                zzic.zzM(zzdVar);
                zzdVar.zzc(j);
                zzmbVar.zza = null;
                break;
            case 1:
                zzoc zzocVar = (zzoc) obj;
                zzocVar.zzg();
                zzocVar.zzn$1();
                zzic zzicVar = (zzic) zzocVar.$$delegate_0;
                zzgu zzguVar = zzicVar.zzi;
                zzic.zzP(zzguVar);
                zzgs zzgsVar = zzguVar.zzl;
                long j2 = this.zza;
                zzgsVar.zzb(Long.valueOf(j2), "Activity paused, time");
                WorkLauncherImpl workLauncherImpl = zzocVar.zzc;
                zzoc zzocVar2 = (zzoc) workLauncherImpl.workTaskExecutor;
                ((zzic) zzocVar2.$$delegate_0).zzn.getClass();
                zznx zznxVar = new zznx(workLauncherImpl, System.currentTimeMillis(), j2);
                workLauncherImpl.processor = zznxVar;
                zzocVar2.zzd.postDelayed(zznxVar, 2000L);
                if (zzicVar.zzg.zzv()) {
                    zzocVar.zzb.zzd.zzd();
                    break;
                }
                break;
            case 2:
                long abs = Math.abs(j) / 1000000000;
                long abs2 = Math.abs(j) % 1000000000;
                StringBuilder sb = new StringBuilder();
                if (j < 0) {
                    sb.append("ClientCall started after CallOptions deadline was exceeded. Deadline has been exceeded for ");
                } else {
                    sb.append("Deadline CallOptions was exceeded after ");
                }
                sb.append(abs);
                sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
                sb.append("s");
                ((zzcbr) obj).zzn(zzbtx.zzd.zze(sb.toString()), true);
                break;
            default:
                ObservableTimeoutTimed$TimeoutObserver observableTimeoutTimed$TimeoutObserver = (ObservableTimeoutTimed$TimeoutObserver) obj;
                if (observableTimeoutTimed$TimeoutObserver.compareAndSet(j, Long.MAX_VALUE)) {
                    DisposableHelper.dispose(observableTimeoutTimed$TimeoutObserver.upstream);
                    Observer observer = observableTimeoutTimed$TimeoutObserver.downstream;
                    long j3 = observableTimeoutTimed$TimeoutObserver.timeout;
                    TimeUnit timeUnit = observableTimeoutTimed$TimeoutObserver.unit;
                    Throwable th = ExceptionHelper.TERMINATED;
                    StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(j3, "The source did not signal an event for ", " ");
                    m1149m.append(timeUnit.toString().toLowerCase());
                    m1149m.append(" and has been terminated.");
                    observer.onError(new TimeoutException(m1149m.toString()));
                    observableTimeoutTimed$TimeoutObserver.worker.dispose();
                    break;
                }
                break;
        }
    }

    public zzly(zzoc zzocVar, long j) {
        this.zza = j;
        Objects.requireNonNull(zzocVar);
        this.zzb = zzocVar;
    }

    public zzly(zzcbr zzcbrVar, long j) {
        this.zza = j;
        this.zzb = zzcbrVar;
    }

    public zzly(long j, ObservableTimeoutTimed$TimeoutObserver observableTimeoutTimed$TimeoutObserver) {
        this.zza = j;
        this.zzb = observableTimeoutTimed$TimeoutObserver;
    }
}
