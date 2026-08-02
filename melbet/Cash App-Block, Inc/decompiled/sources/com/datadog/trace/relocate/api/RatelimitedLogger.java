package com.datadog.trace.relocate.api;

import android.util.Log;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.zipline.CallResult;
import coil3.svg.internal.AndroidSvg;
import com.android.volley.Response;
import com.bumptech.glide.disklrucache.DiskLruCache;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker$WriteLock;
import com.caverock.androidsvg.SVG;
import com.datadog.trace.api.time.SystemTimeSource;
import com.datadog.trace.logger.Logger;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzid;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.tasks.zzb;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class RatelimitedLogger implements DiskCache {
    public long delayNanos;
    public Object log;
    public Object nextLogNanos;
    public Serializable noLogMessage;
    public Object timeSource;

    public RatelimitedLogger(Logger logger, int i, TimeUnit timeUnit) {
        this.log = logger;
        this.delayNanos = timeUnit.toNanos(i);
        StringBuilder sb = new StringBuilder(" (Will not log warnings for ");
        sb.append(i);
        sb.append(' ');
        String lowerCase = timeUnit.name().toLowerCase(Locale.ROOT);
        this.noLogMessage = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, i == 1 ? Boxes$$ExternalSyntheticOutline1.m1148m(1, 0, lowerCase) : lowerCase, ")");
        this.timeSource = SystemTimeSource.INSTANCE;
        this.nextLogNanos = new AtomicLong(System.nanoTime());
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public File get(Key key) {
        String safeKey = ((AndroidSvg) this.log).getSafeKey(key);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + safeKey + " for for Key: " + key);
        }
        try {
            zzb zzbVar = getDiskCache().get(safeKey);
            if (zzbVar != null) {
                return ((File[]) zzbVar.zza)[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    public synchronized DiskLruCache getDiskCache() {
        try {
            if (((DiskLruCache) this.nextLogNanos) == null) {
                this.nextLogNanos = DiskLruCache.open((File) this.noLogMessage, this.delayNanos);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (DiskLruCache) this.nextLogNanos;
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public void put(Key key, SVG svg) {
        DiskCacheWriteLocker$WriteLock diskCacheWriteLocker$WriteLock;
        boolean z;
        String safeKey = ((AndroidSvg) this.log).getSafeKey(key);
        CallResult callResult = (CallResult) this.timeSource;
        synchronized (callResult) {
            diskCacheWriteLocker$WriteLock = (DiskCacheWriteLocker$WriteLock) ((HashMap) callResult.result).get(safeKey);
            if (diskCacheWriteLocker$WriteLock == null) {
                zzb zzbVar = (zzb) callResult.serviceNames;
                synchronized (((ArrayDeque) zzbVar.zza)) {
                    diskCacheWriteLocker$WriteLock = (DiskCacheWriteLocker$WriteLock) ((ArrayDeque) zzbVar.zza).poll();
                }
                if (diskCacheWriteLocker$WriteLock == null) {
                    diskCacheWriteLocker$WriteLock = new DiskCacheWriteLocker$WriteLock();
                }
                ((HashMap) callResult.result).put(safeKey, diskCacheWriteLocker$WriteLock);
            }
            diskCacheWriteLocker$WriteLock.interestedThreads++;
        }
        diskCacheWriteLocker$WriteLock.lock.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + safeKey + " for for Key: " + key);
            }
            try {
                DiskLruCache diskCache = getDiskCache();
                if (diskCache.get(safeKey) == null) {
                    Response edit = diskCache.edit(safeKey);
                    if (edit == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(safeKey));
                    }
                    try {
                        if (((Encoder) svg.rootElement).encode(svg.cssRules, edit.getFile(), (Options) svg.idToElementMap)) {
                            DiskLruCache.access$2100((DiskLruCache) edit.error, edit, true);
                            edit.intermediate = true;
                        }
                        if (!z) {
                            try {
                                edit.abort();
                            } catch (IOException unused) {
                            }
                        }
                    } finally {
                        if (!edit.intermediate) {
                            try {
                                edit.abort();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            ((CallResult) this.timeSource).release(safeKey);
        }
    }

    public void warn(String str, Object... objArr) {
        AtomicLong atomicLong = (AtomicLong) this.nextLogNanos;
        Logger logger = (Logger) this.log;
        if (logger.isWarnEnabled()) {
            long j = atomicLong.get();
            ((SystemTimeSource) this.timeSource).getClass();
            long nanoTime = System.nanoTime();
            if (nanoTime - j < 0 || !atomicLong.compareAndSet(j, nanoTime + this.delayNanos)) {
                return;
            }
            StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(str);
            m.append((String) this.noLogMessage);
            logger.warn(m.toString(), objArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        if (r2 < java.lang.Math.max(0, ((java.lang.Integer) com.google.android.gms.measurement.internal.zzfy.zzi.zzb(null)).intValue())) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        if (r2 >= java.lang.Math.max(0, ((java.lang.Integer) com.google.android.gms.measurement.internal.zzfy.zzi.zzb(null)).intValue())) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean zza(long j, zzhs zzhsVar) {
        if (((ArrayList) this.timeSource) == null) {
            this.timeSource = new ArrayList();
        }
        if (((ArrayList) this.noLogMessage) == null) {
            this.noLogMessage = new ArrayList();
        }
        if (((ArrayList) this.timeSource).isEmpty() || ((((zzhs) ((ArrayList) this.timeSource).get(0)).zzf() / 1000) / 60) / 60 == ((zzhsVar.zzf() / 1000) / 60) / 60) {
            long zzcq = this.delayNanos + zzhsVar.zzcq();
            zzpg zzpgVar = (zzpg) this.nextLogNanos;
            if (zzpgVar.zzd().zzp(null, zzfy.zzaY)) {
                if (!((ArrayList) this.timeSource).isEmpty()) {
                    zzpgVar.zzd();
                }
                this.delayNanos = zzcq;
                ((ArrayList) this.timeSource).add(zzhsVar);
                ((ArrayList) this.noLogMessage).add(Long.valueOf(j));
                zzid zzidVar = (zzid) this.log;
                if (((ArrayList) this.timeSource).size() < Math.max(1, zzpgVar.zzd().zzm(zzidVar != null ? zzidVar.zzA() : null, zzfy.zzj))) {
                    return true;
                }
            } else {
                zzpgVar.zzd();
            }
        }
        return false;
    }

    public /* synthetic */ RatelimitedLogger(zzpg zzpgVar) {
        this.nextLogNanos = zzpgVar;
    }
}
