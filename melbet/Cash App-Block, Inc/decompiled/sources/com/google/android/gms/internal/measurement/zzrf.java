package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.FluentFuture;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ImmediateFuture;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator;
import com.squareup.util.Strings;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzrf {
    public static final Object zza = new Object();
    public static final Object zzb = new Object();
    public final Context zzc;
    public final Supplier zzd;
    public final Supplier zze;
    public final Supplier zzf;
    public final Supplier zzg;
    public final Supplier zzh;
    public final Uri zzi;
    public volatile zzni zzj;
    public final Uri zzk;

    public zzrf(Context context, Supplier supplier, Supplier supplier2, Supplier supplier3) {
        this.zzc = context;
        this.zze = supplier;
        this.zzd = supplier3;
        this.zzf = supplier2;
        Pattern pattern = zzsa.zzc;
        zzlj zzljVar = new zzlj(context);
        zzljVar.zzb("phenotype_storage_info");
        zzljVar.zzc("storage-info.pb");
        this.zzi = zzljVar.zzd();
        zzlj zzljVar2 = new zzlj(context);
        zzljVar2.zzb("phenotype_storage_info");
        zzljVar2.zzc("device-encrypted-storage-info.pb");
        Set set = zzsa.zze;
        zzky.zza(set.contains("directboot-files"), "The only supported locations are %s: %s", set, "directboot-files");
        zzljVar2.zzb = "directboot-files";
        this.zzk = zzljVar2.zzd();
        int i = 1;
        this.zzg = Strings.memoize(new zzlm(this, i));
        this.zzh = Strings.memoize(new zzlq(supplier, i));
    }

    public final void zza() {
        if (!zzky.zzi(this.zzc) || zzg().zze() + 86400000 >= System.currentTimeMillis()) {
            ImmediateFuture immediateFuture = ImmediateFuture.NULL;
            return;
        }
        MoreExecutors$ScheduledListeningDecorator moreExecutors$ScheduledListeningDecorator = (MoreExecutors$ScheduledListeningDecorator) this.zze.get();
        moreExecutors$ScheduledListeningDecorator.getClass();
        Futures.transformAsync(FluentFuture.from(Futures.nonCancellationPropagating((ListenableFuture) this.zzh.get())), new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zzrc
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return Futures.nonCancellationPropagating((ListenableFuture) zzrf.this.zzg.get());
            }
        }, moreExecutors$ScheduledListeningDecorator);
    }

    public final zzqn zzc() {
        zzni zzg = zzg();
        return new zzqn(zzg.zzc(), ImmutableList.copyOf((Collection) zzg.zzi()), zzg.zzb(), zzg.zzd(), (zzg.zzj() && zzg.zzk().zzb() == ((long) Build.VERSION.SDK_INT)) ? zzg.zzk().zza() : "", ImmutableList.copyOf((Collection) zzg.zzf()), ImmutableList.copyOf((Collection) zzg.zzh()), zzg.zza(), zzg.zzm(), zzg.zzl(), zzg.zzn());
    }

    public final zzni zzg() {
        zzni zzniVar;
        zzni zzniVar2 = this.zzj;
        if (zzniVar2 != null) {
            return zzniVar2;
        }
        synchronized (zza) {
            zzniVar = this.zzj;
            if (zzniVar == null) {
                zzniVar = zzni.zzp();
                if (zzky.zzi(this.zzc)) {
                    zzafj zzafjVar = (zzafj) zzniVar.zzg(7);
                    zzadf zzadfVar = zzadf.zzd;
                    int i = zzacf.$r8$clinit;
                    zzadf zzadfVar2 = zzadf.zza;
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                    try {
                        InputStream zzc = zzlf.zzc(((zzru) this.zzf.get()).zze(this.zzi));
                        try {
                            zzadu zza2 = ((zzadq) zzafjVar).zza(zzc, zzadfVar2);
                            if (zzc != null) {
                                zzc.close();
                            }
                            zzniVar = (zzni) zza2;
                        } catch (Throwable th) {
                            if (zzc != null) {
                                try {
                                    zzc.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused) {
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                    this.zzj = zzniVar;
                }
            }
        }
        return zzniVar;
    }
}
