package com.google.android.gms.wearable.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.wearable.ChannelIOException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzch extends OutputStream {
    private final OutputStream zza;
    private final boolean zzb;
    private final zzbn zzc;
    private volatile zzbp zzd;

    public zzch(OutputStream outputStream, boolean z, zzbn zzbnVar) {
        this.zza = outputStream;
        this.zzb = z;
        zzbnVar.getClass();
        this.zzc = zzbnVar;
    }

    private final IOException zzb(IOException iOException) {
        zzbp zzbpVar = this.zzd;
        if (zzbpVar == null) {
            return iOException;
        }
        if (Log.isLoggable("ChannelOutputStream", 2)) {
            Log.v("ChannelOutputStream", "Caught IOException, but channel has been closed. Translating to ChannelIOException.", iOException);
        }
        return new ChannelIOException("Channel closed unexpectedly before stream was finished", zzbpVar.zza, zzbpVar.zzb);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.zza.flush();
            if (this.zzb) {
                try {
                    final Task zza = this.zzc.zza();
                    if (Looper.getMainLooper() != Looper.myLooper()) {
                        Tasks.await(zza);
                    } else {
                        com.google.android.gms.internal.wearable.zzay.zza(new Callable() { // from class: com.google.android.gms.wearable.internal.zzcg
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                return (Void) Tasks.await(Task.this);
                            }
                        }, com.google.android.gms.internal.wearable.zzbl.zza(com.google.android.gms.internal.wearable.zzp.zza().zzb(2))).get();
                    }
                } catch (InterruptedException | ExecutionException e) {
                    if (e instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    if (Log.isLoggable("ChannelOutputStream", 3)) {
                        Log.d("ChannelOutputStream", "flush: Failed to notify the service", e);
                    }
                }
            }
        } catch (IOException e2) {
            throw zzb(e2);
        }
    }

    final void zza(zzbp zzbpVar) {
        this.zzd = zzbpVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            this.zza.close();
        } catch (IOException e) {
            throw zzb(e);
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        try {
            this.zza.write(i);
        } catch (IOException e) {
            throw zzb(e);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        try {
            this.zza.write(bArr);
        } catch (IOException e) {
            throw zzb(e);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.zza.write(bArr, i, i2);
        } catch (IOException e) {
            throw zzb(e);
        }
    }
}
