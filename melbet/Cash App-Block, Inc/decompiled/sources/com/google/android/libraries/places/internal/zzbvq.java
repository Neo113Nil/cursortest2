package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import coil3.request.ViewTargetDisposable;
import com.android.volley.Response;
import com.google.common.base.Ascii;
import com.google.common.util.concurrent.DirectExecutor;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.oneformapp.schema.Schema;

/* loaded from: classes4.dex */
public final class zzbvq extends zzbpa {
    public static final Logger zza = Logger.getLogger(zzbvq.class.getName());
    public static final double zzb;
    public final Schema zzc;
    public final Executor zzd;
    public final boolean zze;
    public final zzyr zzf;
    public final zzbpv zzg;
    public zzbvk zzh;
    public final boolean zzi;
    public zzbov zzj;
    public zzbvr zzk;
    public boolean zzl;
    public boolean zzm;
    public final ScheduledExecutorService zzn;
    public zzbqb zzo = zzbqb.zzb;
    public final ViewTargetDisposable zzp;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        zzb = 1.0E9d;
    }

    public zzbvq(Schema schema, Executor executor, zzbov zzbovVar, ViewTargetDisposable viewTargetDisposable, ScheduledExecutorService scheduledExecutorService, zzyr zzyrVar) {
        zzbpn zzbpnVar = zzbpn.zzb;
        this.zzc = schema;
        schema.getClass();
        System.identityHashCode(this);
        int i = zzclf.$r8$clinit;
        if (executor == DirectExecutor.INSTANCE) {
            this.zzd = new zzcfs();
            this.zze = true;
        } else {
            this.zzd = new zzcfw(executor);
            this.zze = false;
        }
        this.zzf = zzyrVar;
        Logger logger = zzbpv.zza;
        zzbpv zzc = zzbpt.zza.zzc();
        this.zzg = zzc == null ? zzbpv.zzb : zzc;
        zzbsq zzbsqVar = (zzbsq) schema.mappedElements;
        this.zzi = zzbsqVar == zzbsq.zza || zzbsqVar == zzbsq.zzc;
        this.zzj = zzbovVar;
        this.zzp = viewTargetDisposable;
        this.zzn = scheduledExecutorService;
    }

    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.add(this.zzc, "method");
        return stringHelper.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbpa
    public final void zza(zzboz zzbozVar, zzbsn zzbsnVar) {
        zzbvr zzcaxVar;
        zzbov zzbovVar;
        int i = zzclf.$r8$clinit;
        Trace.checkState("Already started", this.zzk == null);
        Trace.checkState("call was cancelled", !this.zzl);
        Trace.checkNotNull(zzbozVar, "observer");
        Trace.checkNotNull(zzbsnVar, "headers");
        zzbpv zzbpvVar = this.zzg;
        zzbov zzbovVar2 = this.zzj;
        zzboq zzboqVar = zzccg.zza;
        zzccg zzccgVar = (zzccg) zzbovVar2.zzi(zzboqVar);
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (zzccgVar != null) {
            Long l = zzccgVar.zzb;
            if (l != null) {
                long longValue = l.longValue();
                zzbpw zzbpwVar = zzbpy.zzb;
                Objects.requireNonNull(timeUnit, "units");
                zzbpy zzbpyVar = new zzbpy(zzbpwVar, System.nanoTime(), longValue);
                zzbpy zzbpyVar2 = this.zzj.zzb;
                if (zzbpyVar2 == null || zzbpyVar.compareTo(zzbpyVar2) < 0) {
                    zzbov zzbovVar3 = this.zzj;
                    zzbovVar3.getClass();
                    zzbot zzp = zzbov.zzp(zzbovVar3);
                    zzp.zza = zzbpyVar;
                    this.zzj = new zzbov(zzp);
                }
            }
            Boolean bool = zzccgVar.zzc;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                zzbov zzbovVar4 = this.zzj;
                zzbovVar4.getClass();
                if (booleanValue) {
                    zzbot zzp2 = zzbov.zzp(zzbovVar4);
                    zzp2.zze = Boolean.TRUE;
                    zzbovVar = new zzbov(zzp2);
                } else {
                    zzbot zzp3 = zzbov.zzp(zzbovVar4);
                    zzp3.zze = Boolean.FALSE;
                    zzbovVar = new zzbov(zzp3);
                }
                this.zzj = zzbovVar;
            }
            Integer num = zzccgVar.zzd;
            if (num != null) {
                zzbov zzbovVar5 = this.zzj;
                Integer num2 = zzbovVar5.zzg;
                if (num2 != null) {
                    int min = Math.min(num2.intValue(), num.intValue());
                    Trace.checkArgument("invalid maxsize %s", min, min >= 0);
                    zzbot zzp4 = zzbov.zzp(zzbovVar5);
                    zzp4.zzf = Integer.valueOf(min);
                    this.zzj = new zzbov(zzp4);
                } else {
                    int intValue = num.intValue();
                    Trace.checkArgument("invalid maxsize %s", intValue, intValue >= 0);
                    zzbot zzp5 = zzbov.zzp(zzbovVar5);
                    zzp5.zzf = num;
                    this.zzj = new zzbov(zzp5);
                }
            }
            Integer num3 = zzccgVar.zze;
            if (num3 != null) {
                zzbov zzbovVar6 = this.zzj;
                Integer num4 = zzbovVar6.zzh;
                if (num4 != null) {
                    int min2 = Math.min(num4.intValue(), num3.intValue());
                    Trace.checkArgument("invalid maxsize %s", min2, min2 >= 0);
                    zzbot zzp6 = zzbov.zzp(zzbovVar6);
                    zzp6.zzg = Integer.valueOf(min2);
                    this.zzj = new zzbov(zzp6);
                } else {
                    int intValue2 = num3.intValue();
                    Trace.checkArgument("invalid maxsize %s", intValue2, intValue2 >= 0);
                    zzbot zzp7 = zzbov.zzp(zzbovVar6);
                    zzp7.zzg = num3;
                    this.zzj = new zzbov(zzp7);
                }
            }
        }
        zzbpk zzbpkVar = zzbpk.zza;
        zzbqb zzbqbVar = this.zzo;
        zzbsnVar.zzd(zzbzg.zzf);
        zzbsnVar.zzd(zzbzg.zzb);
        zzbsj zzbsjVar = zzbzg.zzc;
        zzbsnVar.zzd(zzbsjVar);
        byte[] bArr = zzbqbVar.zzd;
        if (bArr.length != 0) {
            zzbsnVar.zzc(zzbsjVar, bArr);
        }
        zzbsnVar.zzd(zzbzg.zzd);
        zzbsnVar.zzd(zzbzg.zze);
        zzbpy zzbpyVar3 = this.zzj.zzb;
        zzbpy zzbpyVar4 = zzbpyVar3 == null ? null : zzbpyVar3;
        boolean z = zzbpyVar4 != null && zzbpyVar4.equals(null);
        zzbvk zzbvkVar = new zzbvk(this, zzbpyVar4, z);
        this.zzh = zzbvkVar;
        if (zzbpyVar4 == null || zzbvkVar.zzd > 0) {
            ViewTargetDisposable viewTargetDisposable = this.zzp;
            Schema schema = this.zzc;
            zzbov zzbovVar7 = this.zzj;
            zzcby zzcbyVar = (zzcby) viewTargetDisposable.view;
            if (zzcbyVar.zzad) {
                zzccg zzccgVar2 = (zzccg) zzbovVar7.zzi(zzboqVar);
                zzcaxVar = new zzcax(viewTargetDisposable, schema, zzbsnVar, zzbovVar7, zzccgVar2 == null ? null : zzccgVar2.zzf, zzccgVar2 == null ? null : zzccgVar2.zzg, zzbpvVar);
            } else {
                zzbph[] zzf = zzbzg.zzf(zzbovVar7, zzbsnVar, 0, false, false);
                zzbpv zzb2 = zzbpvVar.zzb();
                try {
                    zzcaxVar = zzcbyVar.zzK.zzb(schema, zzbsnVar, zzbovVar7, zzf);
                } finally {
                    zzbpvVar.zzc(zzb2);
                }
            }
            this.zzk = zzcaxVar;
        } else {
            zzbph[] zzf2 = zzbzg.zzf(this.zzj, zzbsnVar, 0, false, false);
            String str = true != z ? "CallOptions" : "Context";
            Long l2 = (Long) this.zzj.zzi(zzbph.zza);
            double d = this.zzh.zzd;
            double d2 = zzb;
            this.zzk = new zzbym(zzbtx.zzd.zze(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(d / d2), Double.valueOf(l2 == null ? 0.0d : l2.longValue() / d2))), zzbvs.zza, zzf2);
        }
        if (this.zze) {
            this.zzk.zzr();
        }
        Integer num5 = this.zzj.zzg;
        if (num5 != null) {
            this.zzk.zzc(num5.intValue());
        }
        Integer num6 = this.zzj.zzh;
        if (num6 != null) {
            this.zzk.zzb(num6.intValue());
        }
        if (zzbpyVar4 != null) {
            this.zzk.zza(zzbpyVar4);
        }
        this.zzk.zzv(zzbpkVar);
        this.zzk.zzd(this.zzo);
        zzyr zzyrVar = this.zzf;
        ((zzcan) zzyrVar.zzd).zza();
        ((zzcgm) zzyrVar.zzc).zza();
        this.zzk.zzf(new com.google.android.gms.maps.zzah(this, zzbozVar));
        zzbvk zzbvkVar2 = this.zzh;
        if (zzbvkVar2.zzf) {
            return;
        }
        if (zzbvkVar2.zzc && !zzbvkVar2.zzb) {
            zzbvq zzbvqVar = zzbvkVar2.zza;
            if (zzbvqVar.zzn != null) {
                zzbvkVar2.zze = zzbvqVar.zzn.schedule(new zzcam(zzbvkVar2), zzbvkVar2.zzd, timeUnit);
            }
        }
        zzbvkVar2.zza.zzg.getClass();
        Logger logger = zzbpv.zza;
        if (zzbvkVar2.zzf) {
            zzbvkVar2.zzf = true;
            ScheduledFuture scheduledFuture = zzbvkVar2.zze;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbpa
    public final void zzb(Object obj) {
        int i = zzclf.$r8$clinit;
        Trace.checkState("Not started", this.zzk != null);
        Trace.checkState("call was cancelled", !this.zzl);
        Trace.checkState("call was half-closed", !this.zzm);
        try {
            zzbvr zzbvrVar = this.zzk;
            if (zzbvrVar instanceof zzcax) {
                ((zzcax) zzbvrVar).zzi(obj);
            } else {
                zzbvrVar.zzt(this.zzc.zze(obj));
            }
            if (this.zzi) {
                return;
            }
            this.zzk.zzu();
        } catch (Error e) {
            this.zzk.zzl(zzbtx.zzb.zze("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.zzk.zzl(zzbtx.zzb.zzd(e2).zze("Failed to stream message"));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbpa
    public final void zzc(int i) {
        int i2 = zzclf.$r8$clinit;
        Trace.checkState("Not started", this.zzk != null);
        this.zzk.zzs(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbpa
    public final void zzd() {
        int i = zzclf.$r8$clinit;
        Trace.checkState("Not started", this.zzk != null);
        Trace.checkState("call was cancelled", !this.zzl);
        Trace.checkState("call already half-closed", !this.zzm);
        this.zzm = true;
        this.zzk.zzk();
    }

    @Override // com.google.android.libraries.places.internal.zzbpa
    public final void zze(String str, Throwable th) {
        int i = zzclf.$r8$clinit;
        if (str == null && th == null) {
            CancellationException cancellationException = new CancellationException("Cancelled without a message or cause");
            zza.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", (Throwable) cancellationException);
            th = cancellationException;
        }
        if (this.zzl) {
            return;
        }
        this.zzl = true;
        try {
            if (this.zzk != null) {
                zzbtx zzbtxVar = zzbtx.zzb;
                zzbtx zze = str != null ? zzbtxVar.zze(str) : zzbtxVar.zze("Call cancelled without message");
                if (th != null) {
                    zze = zze.zzd(th);
                }
                this.zzk.zzl(zze);
            }
            zzbvk zzbvkVar = this.zzh;
            if (zzbvkVar != null) {
                zzbvkVar.zzf = true;
                ScheduledFuture scheduledFuture = zzbvkVar.zze;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
            }
        } finally {
        }
    }
}
