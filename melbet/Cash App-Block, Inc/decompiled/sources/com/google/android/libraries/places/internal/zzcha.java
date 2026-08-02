package com.google.android.libraries.places.internal;

import android.os.StrictMode;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AbstractComposeView;
import app.cash.redwood.treehouse.TreehouseAppContent;
import app.cash.redwood.treehouse.TreehouseLayout;
import com.google.maps.android.compose.NoDrawContainerView;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzcha implements Closeable {
    public final /* synthetic */ int $r8$classId;
    public final Object zza;
    public final Object zza$1;

    public zzcha(StrictMode.ThreadPolicy threadPolicy, StrictMode.VmPolicy vmPolicy) {
        this.$r8$classId = 3;
        threadPolicy.getClass();
        vmPolicy.getClass();
        this.zza$1 = threadPolicy;
        this.zza = vmPolicy;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.$r8$classId;
        Object obj = this.zza;
        Object obj2 = this.zza$1;
        switch (i) {
            case 0:
                ((zzcjp) obj2).close();
                break;
            case 1:
                ((TreehouseAppContent) obj2).unbind();
                ((TreehouseLayout) obj).setReadyForContentChangeListener(null);
                break;
            case 2:
                ((NoDrawContainerView) obj2).removeView((AbstractComposeView) obj);
                break;
            default:
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy) obj2);
                StrictMode.setVmPolicy((StrictMode.VmPolicy) obj);
                break;
        }
    }

    public void diskReads() {
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitDiskReads().build());
    }

    public void diskWrites() {
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitDiskWrites().build());
    }

    public void zza(zzcjt zzcjtVar) {
        ((zzchc) this.zza).zzk++;
        zzcjp zzcjpVar = (zzcjp) this.zza$1;
        synchronized (zzcjpVar) {
            if (zzcjpVar.zze) {
                throw new IOException("closed");
            }
            int i = zzcjpVar.zzd;
            if ((zzcjtVar.zza & 32) != 0) {
                i = zzcjtVar.zzb[5];
            }
            zzcjpVar.zzd = i;
            zzcjpVar.zzl(0, 0, (byte) 4, (byte) 1);
            zzcjpVar.zza.flush();
        }
    }

    public void zzb(int i, zzcje zzcjeVar) {
        ((zzchc) this.zza).zzk++;
        zzcjp zzcjpVar = (zzcjp) this.zza$1;
        synchronized (zzcjpVar) {
            if (zzcjpVar.zze) {
                throw new IOException("closed");
            }
            int i2 = zzcjeVar.zzs;
            if (i2 == -1) {
                throw new IllegalArgumentException();
            }
            zzcjpVar.zzl(i, 4, (byte) 3, (byte) 0);
            zzclx zzclxVar = zzcjpVar.zza;
            zzclxVar.zzL(i2);
            zzclxVar.flush();
        }
    }

    public void zzc(int i, int i2) {
        ((zzchc) this.zza).zzk++;
        zzcjp zzcjpVar = (zzcjp) this.zza$1;
        synchronized (zzcjpVar) {
            if (zzcjpVar.zze) {
                throw new IOException("closed");
            }
            zzcjpVar.zzl(0, 8, (byte) 6, (byte) 1);
            zzclx zzclxVar = zzcjpVar.zza;
            zzclxVar.zzL(i);
            zzclxVar.zzL(i2);
            zzclxVar.flush();
        }
    }

    public void zzd() {
        zzcjp zzcjpVar = (zzcjp) this.zza$1;
        synchronized (zzcjpVar) {
            try {
                if (zzcjpVar.zze) {
                    throw new IOException("closed");
                }
                Logger logger = zzcjq.zza;
                Level level = Level.FINE;
                if (logger.isLoggable(level)) {
                    logger.logp(level, "io.grpc.okhttp.internal.framed.Http2$Writer", "connectionPreface", ">> CONNECTION " + zzcjq.zzb.zzg());
                }
                zzclx zzclxVar = zzcjpVar.zza;
                byte[] zzk = zzcjq.zzb.zzk();
                if (zzclxVar.zzc) {
                    throw new IllegalStateException("closed");
                }
                zzclxVar.zzb.zzz(0, zzk.length, zzk);
                zzclxVar.zza();
                zzclxVar.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void zze() {
        zzcjp zzcjpVar = (zzcjp) this.zza$1;
        synchronized (zzcjpVar) {
            if (zzcjpVar.zze) {
                throw new IOException("closed");
            }
            zzcjpVar.zza.flush();
        }
    }

    public void zzf(int i, List list) {
        zzcjp zzcjpVar = (zzcjp) this.zza$1;
        synchronized (zzcjpVar) {
            boolean z = zzcjpVar.zze;
            if (z) {
                throw new IOException("closed");
            }
            if (z) {
                throw new IOException("closed");
            }
            zzcjpVar.zzc.zza(list);
            zzclo zzcloVar = zzcjpVar.zzb;
            long j = zzcloVar.zzb;
            int min = (int) Math.min(zzcjpVar.zzd, j);
            long j2 = min;
            zzcjpVar.zzl(i, min, (byte) 1, j == j2 ? (byte) 4 : (byte) 0);
            zzclx zzclxVar = zzcjpVar.zza;
            zzclxVar.zzc(zzcloVar, j2);
            if (j > j2) {
                long j3 = j - j2;
                while (j3 > 0) {
                    int min2 = (int) Math.min(zzcjpVar.zzd, j3);
                    long j4 = min2;
                    j3 -= j4;
                    zzcjpVar.zzl(i, min2, (byte) 9, j3 == 0 ? (byte) 4 : (byte) 0);
                    zzclxVar.zzc(zzcloVar, j4);
                }
            }
        }
    }

    public void zzh(boolean z, int i, zzclo zzcloVar, int i2) {
        zzcjp zzcjpVar = (zzcjp) this.zza$1;
        synchronized (zzcjpVar) {
            if (zzcjpVar.zze) {
                throw new IOException("closed");
            }
            zzcjpVar.zzl(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
            if (i2 > 0) {
                zzcjpVar.zza.zzc(zzcloVar, i2);
            }
        }
    }

    public void zzi(zzcjt zzcjtVar) {
        int i;
        zzcjp zzcjpVar = (zzcjp) this.zza$1;
        synchronized (zzcjpVar) {
            try {
                if (zzcjpVar.zze) {
                    throw new IOException("closed");
                }
                zzcjpVar.zzl(0, Integer.bitCount(zzcjtVar.zza) * 6, (byte) 4, (byte) 0);
                int i2 = 0;
                while (i2 < 10) {
                    if ((zzcjtVar.zza & (1 << i2)) != 0) {
                        if (i2 == 4) {
                            i = i2;
                            i2 = 3;
                        } else {
                            i = 7;
                            if (i2 == 7) {
                                i2 = 4;
                            } else {
                                i = i2;
                            }
                        }
                        zzclx zzclxVar = zzcjpVar.zza;
                        if (zzclxVar.zzc) {
                            throw new IllegalStateException("closed");
                        }
                        zzclo zzcloVar = zzclxVar.zzb;
                        zzclz zzE = zzcloVar.zzE(2);
                        byte[] bArr = zzE.zza;
                        int i3 = zzE.zzc;
                        bArr[i3] = (byte) ((i2 >>> 8) & 255);
                        bArr[i3 + 1] = (byte) (i2 & 255);
                        zzE.zzc = i3 + 2;
                        zzcloVar.zzb += 2;
                        zzclxVar.zza();
                        zzclxVar.zzL(zzcjtVar.zzb[i]);
                        i2 = i;
                    }
                    i2++;
                }
                zzcjpVar.zza.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void zzj(zzcje zzcjeVar, byte[] bArr) {
        zzcjp zzcjpVar = (zzcjp) this.zza$1;
        synchronized (zzcjpVar) {
            if (zzcjpVar.zze) {
                throw new IOException("closed");
            }
            int i = zzcjeVar.zzs;
            if (i == -1) {
                Logger logger = zzcjq.zza;
                Locale locale = Locale.US;
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            zzcjpVar.zzl(0, 8, (byte) 7, (byte) 0);
            zzclx zzclxVar = zzcjpVar.zza;
            zzclxVar.zzL(0);
            zzclxVar.zzL(i);
            zzclxVar.flush();
        }
    }

    public void zzk(int i, long j) {
        zzcjp zzcjpVar = (zzcjp) this.zza$1;
        synchronized (zzcjpVar) {
            if (zzcjpVar.zze) {
                throw new IOException("closed");
            }
            if (j == 0) {
                Logger logger = zzcjq.zza;
                Locale locale = Locale.US;
                throw new IllegalArgumentException("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: 0");
            }
            zzcjpVar.zzl(i, 4, (byte) 8, (byte) 0);
            zzclx zzclxVar = zzcjpVar.zza;
            zzclxVar.zzL((int) j);
            zzclxVar.flush();
        }
    }

    public zzcha(zzchc zzchcVar, zzcjp zzcjpVar) {
        this.$r8$classId = 0;
        this.zza = zzchcVar;
        this.zza$1 = zzcjpVar;
    }

    public /* synthetic */ zzcha(Object obj, ViewGroup viewGroup, int i) {
        this.$r8$classId = i;
        this.zza$1 = obj;
        this.zza = viewGroup;
    }
}
