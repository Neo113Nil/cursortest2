package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.zzae;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class zzhy extends Thread {
    public final /* synthetic */ zzhz zza;
    public final Object zzb;
    public final BlockingQueue zzc;
    public boolean zzd = false;

    public zzhy(zzhz zzhzVar, String str, BlockingQueue blockingQueue) {
        this.zza = zzhzVar;
        zzae.checkNotNull(blockingQueue);
        this.zzb = new Object();
        this.zzc = blockingQueue;
        setName(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.zza.zzh.acquire();
                z = true;
            } catch (InterruptedException e) {
                zzgu zzguVar = ((zzic) this.zza.$$delegate_0).zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzg.zzb(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.zzc;
                zzhx zzhxVar = (zzhx) blockingQueue.poll();
                if (zzhxVar != null) {
                    Process.setThreadPriority(true != zzhxVar.zza ? 10 : threadPriority);
                    zzhxVar.run();
                } else {
                    Object obj = this.zzb;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.zza.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e2) {
                                zzgu zzguVar2 = ((zzic) this.zza.$$delegate_0).zzi;
                                zzic.zzP(zzguVar2);
                                zzguVar2.zzg.zzb(e2, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.zza.zzg) {
                        if (this.zzc.peek() == null) {
                            zzb();
                            zzb();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            zzb();
            throw th;
        }
    }

    public final void zzb() {
        zzhz zzhzVar = this.zza;
        synchronized (zzhzVar.zzg) {
            try {
                if (!this.zzd) {
                    zzhzVar.zzh.release();
                    zzhzVar.zzg.notifyAll();
                    if (this == zzhzVar.zza) {
                        zzhzVar.zza = null;
                    } else if (this == zzhzVar.zzb) {
                        zzhzVar.zzb = null;
                    } else {
                        zzgu zzguVar = ((zzic) zzhzVar.$$delegate_0).zzi;
                        zzic.zzP(zzguVar);
                        zzguVar.zzd.zza("Current scheduler thread is neither worker nor network");
                    }
                    this.zzd = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
