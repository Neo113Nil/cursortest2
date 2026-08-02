package com.google.android.gms.internal.mlkit_genai_prompt;

import android.content.ComponentName;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzfq implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final Object zza;
    public final Object zzb;

    public /* synthetic */ zzfq(zzjw zzjwVar, int i, ListenableFuture listenableFuture) {
        this.$r8$classId = 2;
        this.zza = zzjwVar;
        this.zzb = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzla zzlaVar;
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream;
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        byte[] bArr;
        zzcm zzcmVar;
        Throwable zzg;
        int i = this.$r8$classId;
        Object obj = this.zza;
        Object obj2 = this.zzb;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj;
                zzmc zzmcVar = (zzmc) ((zzeo) obj2).f67zza;
                try {
                    try {
                        autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) pair.first);
                        try {
                            autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) pair.second);
                            try {
                                bArr = new byte[PKIFailureInfo.badCertTemplate];
                            } finally {
                            }
                        } catch (Throwable th) {
                            try {
                                autoCloseInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } finally {
                        zzlaVar = (zzla) zzmcVar.zzc.get(null);
                        if (zzlaVar != null) {
                            zzlaVar.zzl(Boolean.TRUE);
                        }
                    }
                } catch (IOException e) {
                    Log.e("DataTransporter", "Failed to transport the file", e);
                }
                while (true) {
                    int read = autoCloseInputStream.read(bArr);
                    if (read == -1) {
                        autoCloseOutputStream.flush();
                        autoCloseOutputStream.close();
                        autoCloseInputStream.close();
                        if (zzlaVar != null) {
                            return;
                        } else {
                            return;
                        }
                    }
                    autoCloseOutputStream.write(bArr, 0, read);
                }
            case 1:
                switch (((zzzx) obj2).$r8$classId) {
                    case 13:
                        zzcmVar = new zzcm(3, 6, "AICore service disconnected", null);
                        break;
                    default:
                        ComponentName componentName = zzfn.zzd;
                        zzcmVar = zzcm.zzc(6, null, "AICore service disconnected");
                        break;
                }
                ((CallbackToFutureAdapter$Completer) obj).setException(zzcmVar);
                return;
            case 2:
                ((zzjw) obj).zzE((ListenableFuture) obj2);
                return;
            default:
                zzke zzkeVar = (zzke) obj2;
                ListenableFuture listenableFuture = (ListenableFuture) obj;
                if ((listenableFuture instanceof zzjd) && (zzg = ((zzjd) listenableFuture).zzg()) != null) {
                    zzkeVar.zza(zzg);
                    return;
                }
                try {
                    zzkeVar.zzb(zzki.zzi(listenableFuture));
                    return;
                } catch (ExecutionException e2) {
                    zzkeVar.zza(e2.getCause());
                    return;
                } catch (Throwable th3) {
                    zzkeVar.zza(th3);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 3:
                zzlq zzlqVar = new zzlq("zzkf");
                zzke zzkeVar = (zzke) this.zzb;
                zzlq zzlqVar2 = new zzlq(6);
                ((zzlq) zzlqVar.zze).zze = zzlqVar2;
                zzlqVar.zze = zzlqVar2;
                zzlqVar2.zzd = zzkeVar;
                return zzlqVar.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ zzfq(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.zza = obj;
        this.zzb = obj2;
    }
}
