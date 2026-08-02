package com.google.android.gms.stats;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.gms.internal.time.zzbq;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.measurement.internal.zzal;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhb;
import com.google.android.gms.measurement.internal.zzhh;
import com.google.android.gms.measurement.internal.zzhz;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzju;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzmb;
import com.google.android.gms.measurement.internal.zzmh;
import com.google.android.gms.measurement.internal.zznd;
import com.google.android.gms.measurement.internal.zznf;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zznx;
import com.google.android.gms.measurement.internal.zzoa;
import com.google.android.gms.measurement.internal.zzoc;
import com.google.android.gms.measurement.internal.zzpp;
import com.google.android.gms.measurement.internal.zzv;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.zzh;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitinstall.zzo;
import com.google.android.play.core.splitinstall.zzx;
import com.google.common.base.Splitter;
import com.google.maps.android.collections.MarkerManager;
import com.miteksystems.misnap.controller.MiSnapController;
import com.robinhood.spark.ScrubGestureDetector;
import com.squareup.cash.reactions.views.ChooseReactionSheet;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.android.HandlerDispatcherKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class zza implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zza;

    public zza(Function0 function0) {
        this.$r8$classId = 18;
        function0.getClass();
        this.zza = function0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d3, code lost:
    
        if (r11.zzak() >= 242600) goto L86;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        zzx zzxVar;
        int i = 2;
        int i2 = 0;
        switch (this.$r8$classId) {
            case 0:
                WakeLock wakeLock = (WakeLock) this.zza;
                synchronized (wakeLock.zzf) {
                    try {
                        if (wakeLock.isHeld()) {
                            Log.e("WakeLock", String.valueOf(wakeLock.zzp).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            wakeLock.zzc();
                            if (wakeLock.isHeld()) {
                                wakeLock.zzh = 1;
                                wakeLock.zzd();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 1:
                ((zzhb) this.zza).zza.zzaM();
                return;
            case 2:
                zzmb zzmbVar = (zzmb) this.zza;
                zzmbVar.zza = zzmbVar.zzh;
                return;
            case 3:
                zznl zznlVar = ((zznf) this.zza).zza;
                zznlVar.zzW(new ComponentName(((zzic) zznlVar.$$delegate_0).zzd, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            case 4:
                zznl zznlVar2 = ((zznf) ((com.google.android.gms.tasks.zzc) this.zza).zzb).zza;
                zzhz zzhzVar = ((zzic) zznlVar2.$$delegate_0).zzj;
                zzic.zzP(zzhzVar);
                zzhzVar.zzj(new zznd(zznlVar2, i2));
                return;
            case 5:
                zznx zznxVar = (zznx) this.zza;
                zzoc zzocVar = (zzoc) zznxVar.zzc.workTaskExecutor;
                zzocVar.zzg();
                zzic zzicVar = (zzic) zzocVar.$$delegate_0;
                zzgu zzguVar = zzicVar.zzi;
                Context context = zzicVar.zzd;
                zzic.zzP(zzguVar);
                zzguVar.zzk.zza("Application going to the background");
                zzhh zzhhVar = zzicVar.zzh;
                zzic.zzN(zzhhVar);
                zzhhVar.zzn.zzb(true);
                zzocVar.zzg();
                zzocVar.zze = true;
                zzal zzalVar = zzicVar.zzg;
                if (!zzalVar.zzv()) {
                    long j = zznxVar.zzb;
                    zzoa zzoaVar = zzocVar.zzb;
                    zzoaVar.zzd(j, false, false);
                    zzoaVar.zzd.zzd();
                }
                long j2 = zznxVar.zza;
                zzic.zzP(zzguVar);
                zzguVar.zzj.zzb(Long.valueOf(j2), "Application backgrounded at: timestamp_millis");
                zzlj zzljVar = zzicVar.zzp;
                zzic.zzO(zzljVar);
                zzljVar.zzg();
                zzic zzicVar2 = (zzic) zzljVar.$$delegate_0;
                zzljVar.zzb$1();
                zznl zzt = zzicVar2.zzt();
                zzt.zzg();
                zzt.zzb$1();
                if (zzt.zzK()) {
                    zzpp zzppVar = ((zzic) zzt.$$delegate_0).zzl;
                    zzic.zzN(zzppVar);
                    break;
                }
                zznl zzt2 = zzicVar2.zzt();
                zzt2.zzg();
                zzt2.zzb$1();
                zzt2.zzaf(new zzmh(zzt2, zzt2.zzah(true), i));
                if (zzalVar.zzp(null, zzfy.zzaN)) {
                    zzpp zzppVar2 = zzicVar.zzl;
                    zzic.zzN(zzppVar2);
                    long zzl = zzppVar2.zzad(context.getPackageName(), zzalVar.zzb) ? 1000L : zzalVar.zzl(context.getPackageName(), zzfy.zzD);
                    zzic.zzP(zzguVar);
                    zzguVar.zzl.zzb(Long.valueOf(zzl), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    zzic.zzM(zzicVar.zzx);
                    zzicVar.zzx.zzh(zzl);
                    return;
                }
                return;
            case 6:
                zzic zzicVar3 = (zzic) ((zzbq) this.zza).zza;
                zzic.zzM(zzicVar3.zzx);
                zzicVar3.zzx.zzh(((Long) zzfy.zzC.zzb(null)).longValue());
                return;
            case 7:
                zzic zzicVar4 = (zzic) this.zza;
                zzpp zzppVar3 = zzicVar4.zzl;
                zzlj zzljVar2 = zzicVar4.zzp;
                zzic.zzN(zzppVar3);
                zzppVar3.zzg();
                if (zzppVar3.zzX() != 1) {
                    zzgu zzguVar2 = zzicVar4.zzi;
                    zzic.zzP(zzguVar2);
                    zzguVar2.zzg.zza("registerTrigger called but app not eligible");
                    return;
                }
                zzic.zzO(zzljVar2);
                zzljVar2.zzg();
                zzju zzjuVar = zzljVar2.zzl;
                if (zzjuVar != null) {
                    zzjuVar.zzd();
                }
                zzic.zzO(zzljVar2);
                new Thread(new zzv(zzljVar2, i2)).start();
                return;
            case 8:
                zzh zzhVar = (zzh) this.zza;
                synchronized (zzhVar.zzb) {
                    try {
                        OnCanceledListener onCanceledListener = (OnCanceledListener) zzhVar.zzc;
                        if (onCanceledListener != null) {
                            onCanceledListener.onCanceled();
                        }
                    } finally {
                    }
                }
                return;
            case 9:
                Splitter splitter = (Splitter) this.zza;
                splitter.omitEmptyStrings = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) splitter.strategy;
                ViewDragHelper viewDragHelper = bottomSheetBehavior.viewDragHelper;
                if (viewDragHelper != null && viewDragHelper.continueSettling()) {
                    splitter.continueSettlingToState(splitter.limit);
                    return;
                } else {
                    if (bottomSheetBehavior.state == 2) {
                        bottomSheetBehavior.setStateInternal(splitter.limit);
                        return;
                    }
                    return;
                }
            case 10:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.zza).endLayout.endIconView;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 11:
                Context context2 = (Context) this.zza;
                AtomicReference atomicReference = SplitCompat.zzb;
                try {
                    synchronized (zzx.class) {
                        try {
                            if (zzx.zzc == null) {
                                zzo zzoVar = zzo.zza;
                                zzx.zzc = new zzx(context2);
                            }
                            zzxVar = zzx.zzc;
                        } finally {
                        }
                    }
                    synchronized (zzxVar) {
                        zzxVar.zzf$1 = true;
                        zzxVar.zzf();
                    }
                    return;
                } catch (SecurityException unused) {
                    Log.e("SplitCompat", "Failed to set broadcast receiver to always on.");
                    return;
                }
            case 12:
                try {
                    ((SplitCompat) this.zza).zzc.zzk();
                    return;
                } catch (Exception e) {
                    Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e);
                    return;
                }
            case 13:
                ((zzx) this.zza).zzk();
                return;
            case 14:
                MarkerManager markerManager = (MarkerManager) this.zza;
                GoogleMap googleMap = markerManager.mMap;
                if (googleMap != null) {
                    googleMap.setOnInfoWindowClickListener(markerManager);
                    googleMap.setOnInfoWindowLongClickListener(markerManager);
                    googleMap.setOnMarkerClickListener(markerManager);
                    googleMap.setOnMarkerDragListener(markerManager);
                    googleMap.setInfoWindowAdapter(markerManager);
                    return;
                }
                return;
            case 15:
                MiSnapController miSnapController = (MiSnapController) this.zza;
                miSnapController.q = false;
                miSnapController.r = false;
                miSnapController.o.addUxpEvent("MCMDD", new String[0]);
                return;
            case 16:
                ScrubGestureDetector scrubGestureDetector = (ScrubGestureDetector) this.zza;
                scrubGestureDetector.scrubListener.onScrubbed(scrubGestureDetector.downX, scrubGestureDetector.downY);
                return;
            case 17:
                ((ChooseReactionSheet) this.zza).requestLayout();
                return;
            case 18:
                ((Function0) this.zza).invoke();
                return;
            default:
                HandlerDispatcherKt.access$updateChoreographerAndPostFrameCallback((CancellableContinuationImpl) this.zza);
                return;
        }
    }

    public /* synthetic */ zza(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }

    public zza(zzx zzxVar, com.google.android.play.core.splitinstall.zza zzaVar, int i, int i2) {
        this.$r8$classId = 13;
        this.zza = zzxVar;
    }

    public zza(zzhb zzhbVar, boolean z) {
        this.$r8$classId = 1;
        this.zza = zzhbVar;
    }

    public zza(zzmb zzmbVar) {
        this.$r8$classId = 2;
        Objects.requireNonNull(zzmbVar);
        this.zza = zzmbVar;
    }
}
