package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcs;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class zzmc implements Runnable {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzr zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ Object zze;
    public final /* synthetic */ zznl zzf;

    public zzmc(zznl zznlVar, String str, String str2, zzr zzrVar, boolean z, zzcs zzcsVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzrVar;
        this.zzd = z;
        this.zze = zzcsVar;
        this.zzf = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpp zzppVar;
        zzgb zzgbVar;
        zzic zzicVar;
        AtomicReference atomicReference;
        zznl zznlVar;
        zzgb zzgbVar2;
        switch (this.$r8$classId) {
            case 0:
                String str = this.zzb;
                String str2 = this.zza;
                zzcs zzcsVar = (zzcs) this.zze;
                zznl zznlVar2 = this.zzf;
                Bundle bundle = new Bundle();
                try {
                    try {
                        zzgbVar = zznlVar2.zzb;
                        zzicVar = (zzic) zznlVar2.$$delegate_0;
                    } catch (RemoteException e) {
                        e = e;
                    }
                    if (zzgbVar == null) {
                        zzgu zzguVar = zzicVar.zzi;
                        zzic.zzP(zzguVar);
                        zzguVar.zzd.zzc("Failed to get user properties; not connected to service", str2, str);
                        zzppVar = zzicVar.zzl;
                        zzic.zzN(zzppVar);
                        zzppVar.zzat(zzcsVar, bundle);
                        return;
                    }
                    List<zzpl> zzp = zzgbVar.zzp(str2, str, this.zzd, this.zzc);
                    Bundle bundle2 = new Bundle();
                    if (zzp != null) {
                        for (zzpl zzplVar : zzp) {
                            String str3 = zzplVar.zze;
                            String str4 = zzplVar.zzb;
                            if (str3 != null) {
                                bundle2.putString(str4, str3);
                            } else {
                                Long l = zzplVar.zzd;
                                if (l != null) {
                                    bundle2.putLong(str4, l.longValue());
                                } else {
                                    Double d = zzplVar.zzg;
                                    if (d != null) {
                                        bundle2.putDouble(str4, d.doubleValue());
                                    }
                                }
                            }
                        }
                    }
                    try {
                        zznlVar2.zzae();
                        zzpp zzppVar2 = zzicVar.zzl;
                        zzic.zzN(zzppVar2);
                        zzppVar2.zzat(zzcsVar, bundle2);
                        return;
                    } catch (RemoteException e2) {
                        e = e2;
                        bundle = bundle2;
                        zzgu zzguVar2 = ((zzic) zznlVar2.$$delegate_0).zzi;
                        zzic.zzP(zzguVar2);
                        zzguVar2.zzd.zzc("Failed to get user properties; remote exception", str2, e);
                        zzppVar = ((zzic) zznlVar2.$$delegate_0).zzl;
                        zzic.zzN(zzppVar);
                        zzppVar.zzat(zzcsVar, bundle);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        bundle = bundle2;
                        zzpp zzppVar3 = ((zzic) zznlVar2.$$delegate_0).zzl;
                        zzic.zzN(zzppVar3);
                        zzppVar3.zzat(zzcsVar, bundle);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.zze;
                synchronized (atomicReference2) {
                    try {
                        try {
                            zznlVar = this.zzf;
                            zzgbVar2 = zznlVar.zzb;
                        } catch (RemoteException e3) {
                            zzgu zzguVar3 = ((zzic) this.zzf.$$delegate_0).zzi;
                            zzic.zzP(zzguVar3);
                            zzguVar3.zzd.zzd("(legacy) Failed to get user properties; remote exception", null, this.zza, e3);
                            ((AtomicReference) this.zze).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.zze;
                        }
                        if (zzgbVar2 == null) {
                            zzgu zzguVar4 = ((zzic) zznlVar.$$delegate_0).zzi;
                            zzic.zzP(zzguVar4);
                            zzguVar4.zzd.zzd("(legacy) Failed to get user properties; not connected to service", null, this.zza, this.zzb);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(zzgbVar2.zzp(this.zza, this.zzb, this.zzd, this.zzc));
                        } else {
                            atomicReference2.set(zzgbVar2.zzq(null, this.zza, this.zzb, this.zzd));
                        }
                        zznlVar.zzae();
                        atomicReference = (AtomicReference) this.zze;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th3) {
                        ((AtomicReference) this.zze).notify();
                        throw th3;
                    }
                }
        }
    }

    public zzmc(zznl zznlVar, AtomicReference atomicReference, String str, String str2, zzr zzrVar, boolean z) {
        this.zze = atomicReference;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzrVar;
        this.zzd = z;
        this.zzf = zznlVar;
    }
}
