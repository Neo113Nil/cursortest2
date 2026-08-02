package com.google.android.gms.internal.measurement;

import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.view.NestedScrollingParentHelper;
import coil3.util.AndroidSystemCallbacks;
import com.google.common.collect.Maps;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.util.concurrent.AbstractCatchingFuture;
import com.google.common.util.concurrent.AbstractTransformFuture;
import com.google.common.util.concurrent.Futures;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzot implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzpg zza;
    public final /* synthetic */ AbstractTransformFuture.TransformFuture zzb;

    public /* synthetic */ zzot(zzpg zzpgVar, AbstractTransformFuture.TransformFuture transformFuture, int i) {
        this.$r8$classId = i;
        this.zza = zzpgVar;
        this.zzb = transformFuture;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040 A[Catch: CancellationException | ExecutionException -> 0x0024, CancellationException | ExecutionException -> 0x0024, TryCatch #1 {CancellationException | ExecutionException -> 0x0024, blocks: (B:5:0x0009, B:7:0x001f, B:10:0x002f, B:10:0x002f, B:12:0x0040, B:12:0x0040, B:14:0x004c, B:14:0x004c, B:18:0x005e, B:18:0x005e, B:20:0x0062, B:20:0x0062, B:23:0x0026, B:34:0x0085, B:34:0x0085), top: B:4:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062 A[Catch: CancellationException | ExecutionException -> 0x0024, CancellationException | ExecutionException -> 0x0024, TRY_LEAVE, TryCatch #1 {CancellationException | ExecutionException -> 0x0024, blocks: (B:5:0x0009, B:7:0x001f, B:10:0x002f, B:10:0x002f, B:12:0x0040, B:12:0x0040, B:14:0x004c, B:14:0x004c, B:18:0x005e, B:18:0x005e, B:20:0x0062, B:20:0x0062, B:23:0x0026, B:34:0x0085, B:34:0x0085), top: B:4:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        AndroidSystemCallbacks androidSystemCallbacks;
        RegularImmutableMap regularImmutableMap;
        RegularImmutableMap regularImmutableMap2;
        switch (this.$r8$classId) {
            case 0:
                zzpg zzpgVar = this.zza;
                try {
                    Futures.getDone(this.zzb);
                    return;
                } catch (Exception e) {
                    String str = zzpgVar.zzf;
                    Log.w("FlagStore", Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(String.valueOf(str).length() + 73), "Failed to store account on flag read for: ", str, " which may lead to stale flags."), e);
                    return;
                }
            default:
                zzpg zzpgVar2 = this.zza;
                try {
                    zzqv zzqvVar = (zzqv) Futures.getDone(this.zzb);
                    AndroidSystemCallbacks androidSystemCallbacks2 = new AndroidSystemCallbacks(zzqvVar, new NestedScrollingParentHelper(6, 2));
                    boolean z = zzpgVar2.zzh;
                    if (!z) {
                        androidSystemCallbacks = zzpgVar2.zzd;
                        if (androidSystemCallbacks == null) {
                        }
                        regularImmutableMap = (RegularImmutableMap) androidSystemCallbacks.componentCallbacks;
                        regularImmutableMap2 = (RegularImmutableMap) androidSystemCallbacks2.componentCallbacks;
                        regularImmutableMap.getClass();
                        if (!Maps.equalsImpl(regularImmutableMap, regularImmutableMap2)) {
                            zzqm zzqmVar = (zzqm) zzpgVar2.zze.zzk.get();
                            if (zzqmVar != null) {
                                zzqmVar.zza();
                                return;
                            }
                            return;
                        }
                        if (zzpgVar2.zzh) {
                            return;
                        }
                        zzlk zzlkVar = zzpgVar2.zze;
                        AbstractCatchingFuture.create(((zzmn) zzlkVar.zzj.get()).zzb(zzqvVar.zza()), Throwable.class, new zzow(zzpgVar2, 0), zzlkVar.zzg());
                        return;
                    }
                    synchronized (zzpgVar2) {
                        if (!z) {
                            androidSystemCallbacks = zzpgVar2.zzd;
                            if (androidSystemCallbacks != null) {
                                regularImmutableMap = (RegularImmutableMap) androidSystemCallbacks.componentCallbacks;
                                regularImmutableMap2 = (RegularImmutableMap) androidSystemCallbacks2.componentCallbacks;
                                regularImmutableMap.getClass();
                                if (!Maps.equalsImpl(regularImmutableMap, regularImmutableMap2)) {
                                }
                            }
                        }
                        zzpgVar2.zzd = androidSystemCallbacks2;
                        ((AtomicInteger) zzpgVar2.zzj.zza$1).incrementAndGet();
                    }
                    if (zzpgVar2.zzh) {
                    }
                } catch (CancellationException | ExecutionException e2) {
                    if (e2.getCause() instanceof SecurityException) {
                        return;
                    }
                    String str2 = zzpgVar2.zzf;
                    Log.w("FlagStore", Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(String.valueOf(str2).length() + 64), "Unable to update local snapshot for ", str2, ", may result in stale flags."), e2);
                    return;
                }
        }
    }
}
