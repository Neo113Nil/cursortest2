package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzkb implements Callable {
    final /* synthetic */ ParcelFileDescriptor zza;
    final /* synthetic */ byte[] zzb;

    zzkb(zzkf zzkfVar, ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) {
        this.zza = parcelFileDescriptor;
        this.zzb = bArr;
        Objects.requireNonNull(zzkfVar);
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (Log.isLoggable("WearableClient", 3)) {
            String valueOf = String.valueOf(this.zza);
            String.valueOf(valueOf);
            Log.d("WearableClient", "processAssets: writing data to FD : ".concat(String.valueOf(valueOf)));
        }
        ParcelFileDescriptor parcelFileDescriptor = this.zza;
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
        try {
            try {
                autoCloseOutputStream.write(this.zzb);
                autoCloseOutputStream.flush();
                if (Log.isLoggable("WearableClient", 3)) {
                    String valueOf2 = String.valueOf(parcelFileDescriptor);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 27);
                    sb.append("processAssets: wrote data: ");
                    sb.append(valueOf2);
                    Log.d("WearableClient", sb.toString());
                }
                try {
                    if (Log.isLoggable("WearableClient", 3)) {
                        String valueOf3 = String.valueOf(this.zza);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 24);
                        sb2.append("processAssets: closing: ");
                        sb2.append(valueOf3);
                        Log.d("WearableClient", sb2.toString());
                    }
                    autoCloseOutputStream.close();
                    return true;
                } catch (IOException unused) {
                    return true;
                }
            } catch (IOException unused2) {
                String valueOf4 = String.valueOf(this.zza);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 36);
                sb3.append("processAssets: writing data failed: ");
                sb3.append(valueOf4);
                Log.w("WearableClient", sb3.toString());
                return false;
            }
        } finally {
            try {
                if (Log.isLoggable("WearableClient", 3)) {
                    String valueOf5 = String.valueOf(this.zza);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf5).length() + 24);
                    sb4.append("processAssets: closing: ");
                    sb4.append(valueOf5);
                    Log.d("WearableClient", sb4.toString());
                }
                autoCloseOutputStream.close();
            } catch (IOException unused3) {
            }
        }
    }
}
