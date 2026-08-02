package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzab;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzad;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes4.dex */
public abstract class zzo {
    public static final zzd zze;
    public static final zzd zzf;
    public static volatile zzad zzg;
    public static final Object zzi;
    public static Context zzj;

    static {
        Charset charset = StandardCharsets.ISO_8859_1;
        new zzd("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±".getBytes(charset), 0);
        new zzd("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<".getBytes(charset), 1);
        new zzd("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí".getBytes(charset), 2);
        new zzd("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì".getBytes(charset), 3);
        zze = new zzd("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0".getBytes(charset), 4);
        zzf = new zzd("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0".getBytes(charset), 5);
        zzi = new Object();
    }

    public static void zzb() {
        zzad zzabVar;
        if (zzg != null) {
            return;
        }
        com.google.android.gms.common.internal.zzae.checkNotNull(zzj);
        synchronized (zzi) {
            try {
                if (zzg == null) {
                    IBinder instantiate = DynamiteModule.load(zzj, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = zzac.$r8$clinit;
                    if (instantiate == null) {
                        zzabVar = null;
                    } else {
                        IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        zzabVar = queryLocalInterface instanceof zzad ? (zzad) queryLocalInterface : new zzab(instantiate, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 2);
                    }
                    zzg = zzabVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static zzy zzf(String str, zzk zzkVar, boolean z, boolean z2) {
        try {
            zzb();
            com.google.android.gms.common.internal.zzae.checkNotNull(zzj);
            try {
                zzad zzadVar = zzg;
                ObjectWrapper objectWrapper = new ObjectWrapper(zzj.getPackageManager());
                zzab zzabVar = (zzab) zzadVar;
                Parcel zza = zzabVar.zza();
                int i = com.google.android.gms.internal.common.zzc.$r8$clinit;
                boolean z3 = true;
                zza.writeInt(1);
                int zzb = MooncakeHeaderViewKt.zzb(zza, 20293);
                MooncakeHeaderViewKt.writeString(zza, 1, str);
                MooncakeHeaderViewKt.writeIBinder(zza, 2, zzkVar);
                MooncakeHeaderViewKt.zza(zza, 3, 4);
                zza.writeInt(z ? 1 : 0);
                MooncakeHeaderViewKt.zza(zza, 4, 4);
                zza.writeInt(z2 ? 1 : 0);
                MooncakeHeaderViewKt.zzc(zza, zzb);
                com.google.android.gms.internal.common.zzc.zze(zza, objectWrapper);
                Parcel zzB = zzabVar.zzB(zza, 5);
                if (zzB.readInt() == 0) {
                    z3 = false;
                }
                zzB.recycle();
                return z3 ? zzy.zze : new zzx(new zzl(z, str, zzkVar));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return zzy.zzd(e, "module call");
            }
        } catch (DynamiteModule.LoadingException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            return zzy.zzd(e2, "module init: ".concat(String.valueOf(e2.getMessage())));
        }
    }
}
