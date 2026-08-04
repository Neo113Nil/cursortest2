package com.gamericefishpro.space.o6;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.c8.p;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.s5.y;
import com.gamericefishpro.space.v6.m;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {
    public final /* synthetic */ int d;
    public final i e;

    public /* synthetic */ h(i iVar, int i) {
        this.d = i;
        this.e = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007f A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:6:0x0015, B:8:0x0019, B:10:0x0035, B:13:0x003b, B:14:0x0042, B:15:0x0043, B:16:0x004f, B:20:0x0059, B:22:0x0061, B:23:0x0063, B:27:0x006d, B:29:0x0078, B:37:0x008a, B:33:0x007e, B:34:0x007f, B:36:0x0087, B:41:0x008e, B:24:0x0064, B:25:0x006a, B:17:0x0050, B:18:0x0056), top: B:66:0x0015, inners: #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0087 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:6:0x0015, B:8:0x0019, B:10:0x0035, B:13:0x003b, B:14:0x0042, B:15:0x0043, B:16:0x004f, B:20:0x0059, B:22:0x0061, B:23:0x0063, B:27:0x006d, B:29:0x0078, B:37:0x008a, B:33:0x007e, B:34:0x007f, B:36:0x0087, B:41:0x008e, B:24:0x0064, B:25:0x006a, B:17:0x0050, B:18:0x0056), top: B:66:0x0015, inners: #3, #4 }] */
    @Override // java.lang.Runnable
    public final void run() {
        p pVar;
        h hVar;
        boolean zIsEmpty;
        boolean zIsEmpty2;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                synchronized (this.e.z) {
                    i iVar = this.e;
                    iVar.A = (Intent) iVar.z.get(0);
                    break;
                }
                Intent intent = this.e.A;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.e.A.getIntExtra("KEY_START_ID", 0);
                    q qVarC = q.c();
                    String str = i.C;
                    Objects.toString(this.e.A);
                    qVarC.getClass();
                    PowerManager.WakeLock wakeLockA = m.a(this.e.d, action + " (" + intExtra + ")");
                    int i = 1;
                    try {
                        q qVarC2 = q.c();
                        Objects.toString(wakeLockA);
                        qVarC2.getClass();
                        wakeLockA.acquire();
                        i iVar2 = this.e;
                        iVar2.y.a(iVar2.A, intExtra, iVar2);
                        q qVarC3 = q.c();
                        wakeLockA.toString();
                        qVarC3.getClass();
                        wakeLockA.release();
                        i iVar3 = this.e;
                        pVar = (p) ((com.gamericefishpro.space.r5.b) iVar3.e).v;
                        hVar = new h(iVar3, i);
                    } catch (Throwable th) {
                        try {
                            q.c().b(i.C, "Unexpected error in onHandleIntent", th);
                            q qVarC4 = q.c();
                            Objects.toString(wakeLockA);
                            qVarC4.getClass();
                            wakeLockA.release();
                            i iVar4 = this.e;
                            pVar = (p) ((com.gamericefishpro.space.r5.b) iVar4.e).v;
                            hVar = new h(iVar4, i);
                        } catch (Throwable th2) {
                            q qVarC5 = q.c();
                            String str2 = i.C;
                            Objects.toString(wakeLockA);
                            qVarC5.getClass();
                            wakeLockA.release();
                            i iVar5 = this.e;
                            ((p) ((com.gamericefishpro.space.r5.b) iVar5.e).v).execute(new h(iVar5, i));
                            throw th2;
                        }
                    }
                    pVar.execute(hVar);
                    return;
                }
                return;
            default:
                i iVar6 = this.e;
                q.c().getClass();
                i.b();
                synchronized (iVar6.z) {
                    try {
                        if (iVar6.A != null) {
                            q qVarC6 = q.c();
                            Objects.toString(iVar6.A);
                            qVarC6.getClass();
                            if (!((Intent) iVar6.z.remove(0)).equals(iVar6.A)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            iVar6.A = null;
                        }
                        y yVar = (y) ((com.gamericefishpro.space.r5.b) iVar6.e).e;
                        c cVar = iVar6.y;
                        synchronized (cVar.i) {
                            zIsEmpty = cVar.e.isEmpty();
                            break;
                        }
                        if (zIsEmpty && iVar6.z.isEmpty()) {
                            synchronized (yVar.w) {
                                zIsEmpty2 = yVar.e.isEmpty();
                                break;
                            }
                            if (zIsEmpty2) {
                                q.c().getClass();
                                SystemAlarmService systemAlarmService = iVar6.B;
                                if (systemAlarmService != null) {
                                    systemAlarmService.c();
                                }
                            } else if (!iVar6.z.isEmpty()) {
                                iVar6.c();
                            }
                        } else if (!iVar6.z.isEmpty()) {
                            iVar6.c();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }
}
