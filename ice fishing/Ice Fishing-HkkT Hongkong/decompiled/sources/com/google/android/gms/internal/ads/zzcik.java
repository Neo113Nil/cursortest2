package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzcik extends zzgq {
    private final Context zza;
    private final zzgw zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbbb zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private ListenableFuture zzo;
    private final AtomicLong zzp;
    private final zzciv zzq;

    public zzcik(Context context, zzgw zzgwVar, String str, int i, zzhy zzhyVar, zzciv zzcivVar) {
        super(false);
        this.zza = context;
        this.zzb = zzgwVar;
        this.zzq = zzcivVar;
        this.zzc = str;
        this.zzd = i;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = 0L;
        this.zzp = new AtomicLong(-1L);
        this.zzo = null;
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzbQ)).booleanValue();
        zzf(zzhyVar);
    }

    private final boolean zzr() {
        if (!this.zze) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzem)).booleanValue() || this.zzl) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzen)).booleanValue() && !this.zzm;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        int read = inputStream != null ? inputStream.read(bArr, i, i2) : this.zzb.zza(bArr, i, i2);
        if (!this.zze || this.zzf != null) {
            zzg(read);
        }
        return read;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01dc  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.zzgw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzhb zzhbVar) throws IOException {
        zzbay zzbayVar;
        Long l;
        boolean z;
        boolean z2;
        long elapsedRealtime;
        zzbbn zzbbnVar;
        String str = "ms";
        if (this.zzg) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        boolean z3 = true;
        this.zzg = true;
        this.zzh = zzhbVar.zza;
        if (!this.zze) {
            zzj(zzhbVar);
        }
        this.zzi = zzbbb.zza(zzhbVar.zza);
        ?? r4 = -1;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzej)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzhbVar.zzf;
                this.zzi.zzi = zzfxt.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbayVar = com.google.android.gms.ads.internal.zzt.zzc().zzb(this.zzi);
            } else {
                zzbayVar = null;
            }
            if (zzbayVar != null && zzbayVar.zze()) {
                this.zzj = zzbayVar.zzd();
                this.zzl = zzbayVar.zzg();
                this.zzm = zzbayVar.zzf();
                this.zzn = zzbayVar.zza();
                this.zzk = true;
                if (!zzr()) {
                    this.zzf = zzbayVar.zzc();
                    if (this.zze) {
                        zzj(zzhbVar);
                    }
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzhbVar.zzf;
            this.zzi.zzi = zzfxt.zzc(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzel);
            } else {
                l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzek);
            }
            long longValue = l.longValue();
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzd();
            Future zza = zzbbm.zza(this.zza, this.zzi);
            try {
                try {
                    zzbbnVar = (zzbbn) zza.get(longValue, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    th = th;
                    z3 = r4;
                }
            } catch (InterruptedException unused) {
                z2 = false;
            } catch (ExecutionException | TimeoutException unused2) {
                z = false;
            } catch (Throwable th2) {
                th = th2;
                z3 = false;
            }
            try {
                this.zzj = zzbbnVar.zzd();
                this.zzl = zzbbnVar.zzf();
                this.zzm = zzbbnVar.zze();
                this.zzn = zzbbnVar.zza();
            } catch (InterruptedException unused3) {
                z2 = true;
                zza.cancel(true);
                Thread.currentThread().interrupt();
                elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime2;
                this.zzq.zza.zzab(z2, elapsedRealtime);
                this.zzk = z2;
                r4 = new StringBuilder("Cache connection took ");
                r4.append(elapsedRealtime);
                r4.append("ms");
                str = r4.toString();
                com.google.android.gms.ads.internal.util.zze.zza(str);
                this.zzk = false;
                if (this.zzi != null) {
                }
                return this.zzb.zzb(zzhbVar);
            } catch (ExecutionException | TimeoutException unused4) {
                z = true;
                zza.cancel(true);
                elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime2;
                this.zzq.zza.zzab(z, elapsedRealtime);
                this.zzk = z;
                r4 = new StringBuilder("Cache connection took ");
                r4.append(elapsedRealtime);
                r4.append("ms");
                str = r4.toString();
                com.google.android.gms.ads.internal.util.zze.zza(str);
                this.zzk = false;
                if (this.zzi != null) {
                }
                return this.zzb.zzb(zzhbVar);
            } catch (Throwable th3) {
                th = th3;
                long elapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime2;
                this.zzq.zza.zzab(z3, elapsedRealtime3);
                this.zzk = z3;
                com.google.android.gms.ads.internal.util.zze.zza("Cache connection took " + elapsedRealtime3 + str);
                throw th;
            }
            if (!zzr()) {
                this.zzf = zzbbnVar.zzc();
                if (this.zze) {
                    zzj(zzhbVar);
                }
                long elapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime2;
                this.zzq.zza.zzab(true, elapsedRealtime4);
                this.zzk = true;
                com.google.android.gms.ads.internal.util.zze.zza("Cache connection took " + elapsedRealtime4 + "ms");
                return -1L;
            }
            long elapsedRealtime5 = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime2;
            this.zzq.zza.zzab(true, elapsedRealtime5);
            this.zzk = true;
            str = "Cache connection took " + elapsedRealtime5 + "ms";
            com.google.android.gms.ads.internal.util.zze.zza(str);
        }
        this.zzk = false;
        if (this.zzi != null) {
            Uri parse = Uri.parse(this.zzi.zza);
            byte[] bArr = zzhbVar.zzc;
            long j = zzhbVar.zze;
            long j2 = zzhbVar.zzf;
            long j3 = zzhbVar.zzg;
            String str2 = zzhbVar.zzh;
            zzhbVar = new zzhb(parse, null, j, j2, j3, null, zzhbVar.zzi);
        }
        return this.zzb.zzb(zzhbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        boolean z = (this.zze && this.zzf == null) ? false : true;
        InputStream inputStream = this.zzf;
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
            this.zzf = null;
        } else {
            this.zzb.zzd();
        }
        if (z) {
            zzh();
        }
    }

    public final long zzk() {
        return this.zzn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long zzl() {
        if (this.zzi != null) {
            if (this.zzp.get() != -1) {
                return this.zzp.get();
            }
            synchronized (this) {
                if (this.zzo == null) {
                    this.zzo = zzcep.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcij
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzcik.this.zzm();
                        }
                    });
                }
            }
            if (this.zzo.isDone()) {
                try {
                    this.zzp.compareAndSet(-1L, ((Long) this.zzo.get()).longValue());
                    return this.zzp.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    final /* synthetic */ Long zzm() throws Exception {
        return Long.valueOf(com.google.android.gms.ads.internal.zzt.zzc().zza(this.zzi));
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final boolean zzo() {
        return this.zzm;
    }

    public final boolean zzp() {
        return this.zzl;
    }

    public final boolean zzq() {
        return this.zzk;
    }
}
