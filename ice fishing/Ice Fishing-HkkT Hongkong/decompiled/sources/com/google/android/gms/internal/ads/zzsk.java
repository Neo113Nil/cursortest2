package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzsk implements zzss {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzeo zzg;
    private boolean zzh;

    public zzsk(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzeo zzeoVar = new zzeo(zzel.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzeoVar;
        this.zzf = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* bridge */ /* synthetic */ void zza(zzsk zzskVar, Message message) {
        zzsj zzsjVar;
        int i = message.what;
        zzsj zzsjVar2 = null;
        if (i == 0) {
            zzsjVar = (zzsj) message.obj;
            int i2 = zzsjVar.zza;
            int i3 = zzsjVar.zzb;
            try {
                zzskVar.zzc.queueInputBuffer(i2, 0, zzsjVar.zzc, zzsjVar.zze, zzsjVar.zzf);
            } catch (RuntimeException e) {
                zzsh.zza(zzskVar.zzf, null, e);
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    zzskVar.zzg.zze();
                } else if (i != 3) {
                    zzsh.zza(zzskVar.zzf, null, new IllegalStateException(String.valueOf(message.what)));
                } else {
                    try {
                        zzskVar.zzc.setParameters((Bundle) message.obj);
                    } catch (RuntimeException e2) {
                        zzsh.zza(zzskVar.zzf, null, e2);
                    }
                }
                if (zzsjVar2 == null) {
                    ArrayDeque arrayDeque = zza;
                    synchronized (arrayDeque) {
                        arrayDeque.add(zzsjVar2);
                    }
                    return;
                }
                return;
            }
            zzsjVar = (zzsj) message.obj;
            int i4 = zzsjVar.zza;
            int i5 = zzsjVar.zzb;
            MediaCodec.CryptoInfo cryptoInfo = zzsjVar.zzd;
            long j = zzsjVar.zze;
            int i6 = zzsjVar.zzf;
            try {
                synchronized (zzb) {
                    zzskVar.zzc.queueSecureInputBuffer(i4, 0, cryptoInfo, j, i6);
                }
            } catch (RuntimeException e3) {
                zzsh.zza(zzskVar.zzf, null, e3);
            }
        }
        zzsjVar2 = zzsjVar;
        if (zzsjVar2 == null) {
        }
    }

    private static zzsj zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new zzsj();
            }
            return (zzsj) arrayDeque.removeFirst();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzb() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                this.zzg.zzc();
                Handler handler2 = this.zze;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(2).sendToTarget();
                this.zzg.zza();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzd(int i, int i2, int i3, long j, int i4) {
        zzc();
        zzsj zzi = zzi();
        zzi.zza(i, 0, i3, j, i4);
        Handler handler = this.zze;
        int i5 = zzfy.zza;
        handler.obtainMessage(0, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zze(int i, int i2, zzie zzieVar, long j, int i3) {
        zzc();
        zzsj zzi = zzi();
        zzi.zza(i, 0, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = zzi.zzd;
        cryptoInfo.numSubSamples = zzieVar.zzf;
        cryptoInfo.numBytesOfClearData = zzk(zzieVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzk(zzieVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] zzj = zzj(zzieVar.zzb, cryptoInfo.key);
        zzj.getClass();
        cryptoInfo.key = zzj;
        byte[] zzj2 = zzj(zzieVar.zza, cryptoInfo.iv);
        zzj2.getClass();
        cryptoInfo.iv = zzj2;
        cryptoInfo.mode = zzieVar.zzc;
        if (zzfy.zza >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzieVar.zzg, zzieVar.zzh));
        }
        this.zze.obtainMessage(1, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzf(Bundle bundle) {
        zzc();
        Handler handler = this.zze;
        int i = zzfy.zza;
        handler.obtainMessage(3, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzg() {
        if (this.zzh) {
            zzb();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzh() {
        if (this.zzh) {
            return;
        }
        this.zzd.start();
        this.zze = new zzsi(this, this.zzd.getLooper());
        this.zzh = true;
    }

    private static byte[] zzj(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static int[] zzk(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }
}
