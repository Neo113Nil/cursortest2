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
final class zzkc implements Runnable {
    final /* synthetic */ Uri zza;
    final /* synthetic */ BaseImplementation.ResultHolder zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzkf zze;

    zzkc(zzkf zzkfVar, Uri uri, BaseImplementation.ResultHolder resultHolder, boolean z, String str) {
        this.zza = uri;
        this.zzb = resultHolder;
        this.zzc = z;
        this.zzd = str;
        Objects.requireNonNull(zzkfVar);
        this.zze = zzkfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", "Executing receiveFileFromChannelTask");
        }
        Uri uri = this.zza;
        if (!Objects.equals(uri.getScheme(), "file")) {
            Log.w("WearableClient", "Channel.receiveFile used with non-file URI");
            this.zzb.setFailedResult(new Status(10, "Channel.receiveFile used with non-file URI"));
            return;
        }
        com.google.android.gms.internal.wearable.zzg.zza();
        String path = uri.getPath();
        com.google.android.gms.internal.wearable.zzk zzkVar = com.google.android.gms.internal.wearable.zzk.zza;
        File file = new File(path);
        try {
            ParcelFileDescriptor open = ParcelFileDescriptor.open(file, (true != this.zzc ? 0 : 33554432) | 671088640);
            try {
                try {
                    ((zzgq) this.zze.getService()).zzB(new zzka(this.zzb), this.zzd, open);
                } finally {
                    try {
                        open.close();
                    } catch (IOException e) {
                        Log.w("WearableClient", "Failed to close targetFd", e);
                    }
                }
            } catch (RemoteException e2) {
                Log.w("WearableClient", "Channel.receiveFile failed.", e2);
                this.zzb.setFailedResult(new Status(8));
            }
        } catch (FileNotFoundException unused) {
            Log.w("WearableClient", "File couldn't be opened for Channel.receiveFile: ".concat(file.toString()));
            this.zzb.setFailedResult(new Status(13));
        }
    }
}
