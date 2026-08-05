package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzkd implements Runnable {
    final /* synthetic */ Uri zza;
    final /* synthetic */ BaseImplementation.ResultHolder zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzkf zzf;

    zzkd(zzkf zzkfVar, Uri uri, BaseImplementation.ResultHolder resultHolder, String str, long j, long j2) {
        this.zza = uri;
        this.zzb = resultHolder;
        this.zzc = str;
        this.zzd = j;
        this.zze = j2;
        Objects.requireNonNull(zzkfVar);
        this.zzf = zzkfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", "Executing sendFileToChannelTask");
        }
        Uri uri = this.zza;
        if (!Objects.equals(uri.getScheme(), "file")) {
            Log.w("WearableClient", "Channel.sendFile used with non-file URI");
            this.zzb.setFailedResult(new Status(10, "Channel.sendFile used with non-file URI"));
            return;
        }
        com.google.android.gms.internal.wearable.zzg.zza();
        String path = uri.getPath();
        com.google.android.gms.internal.wearable.zzk zzkVar = com.google.android.gms.internal.wearable.zzk.zza;
        File file = new File(path);
        try {
            ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
            try {
                try {
                    ((zzgq) this.zzf.getService()).zzC(new zzjw(this.zzb), this.zzc, open, this.zzd, this.zze);
                } catch (RemoteException e) {
                    Log.w("WearableClient", "Channel.sendFile failed.", e);
                    this.zzb.setFailedResult(new Status(8));
                }
            } finally {
                try {
                    open.close();
                } catch (IOException e2) {
                    Log.w("WearableClient", "Failed to close sourceFd", e2);
                }
            }
        } catch (FileNotFoundException unused) {
            Log.w("WearableClient", "File couldn't be opened for Channel.sendFile: ".concat(file.toString()));
            this.zzb.setFailedResult(new Status(13));
        }
    }
}
