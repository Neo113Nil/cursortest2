package r4;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import o4.o;
import y4.l;
import y4.n;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6073g;

    /* renamed from: h, reason: collision with root package name */
    public final i f6074h;

    public /* synthetic */ h(i iVar, int i10) {
        this.f6073g = i10;
        this.f6074h = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a5.b bVar;
        h hVar;
        boolean isEmpty;
        boolean isEmpty2;
        switch (this.f6073g) {
            case 0:
                synchronized (this.f6074h.f6082m) {
                    i iVar = this.f6074h;
                    iVar.f6083n = (Intent) iVar.f6082m.get(0);
                }
                Intent intent = this.f6074h.f6083n;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.f6074h.f6083n.getIntExtra("KEY_START_ID", 0);
                    o d10 = o.d();
                    String str = i.f6075p;
                    d10.a(str, "Processing command " + this.f6074h.f6083n + ", " + intExtra);
                    PowerManager.WakeLock a6 = n.a(this.f6074h.f6076g, action + " (" + intExtra + ")");
                    try {
                        o.d().a(str, "Acquiring operation wake lock (" + action + ") " + a6);
                        a6.acquire();
                        i iVar2 = this.f6074h;
                        iVar2.f6081l.a(iVar2.f6083n, intExtra, iVar2);
                        o.d().a(str, "Releasing operation wake lock (" + action + ") " + a6);
                        a6.release();
                        i iVar3 = this.f6074h;
                        bVar = (a5.b) ((a5.c) iVar3.f6077h).f263i;
                        hVar = new h(iVar3, 1);
                    } catch (Throwable th) {
                        try {
                            o d11 = o.d();
                            String str2 = i.f6075p;
                            d11.c(str2, "Unexpected error in onHandleIntent", th);
                            o.d().a(str2, "Releasing operation wake lock (" + action + ") " + a6);
                            a6.release();
                            i iVar4 = this.f6074h;
                            bVar = (a5.b) ((a5.c) iVar4.f6077h).f263i;
                            hVar = new h(iVar4, 1);
                        } catch (Throwable th2) {
                            o.d().a(i.f6075p, "Releasing operation wake lock (" + action + ") " + a6);
                            a6.release();
                            i iVar5 = this.f6074h;
                            ((a5.b) ((a5.c) iVar5.f6077h).f263i).execute(new h(iVar5, 1));
                            throw th2;
                        }
                    }
                    bVar.execute(hVar);
                    return;
                }
                return;
            default:
                i iVar6 = this.f6074h;
                o d12 = o.d();
                String str3 = i.f6075p;
                d12.a(str3, "Checking if commands are complete.");
                i.c();
                synchronized (iVar6.f6082m) {
                    try {
                        if (iVar6.f6083n != null) {
                            o.d().a(str3, "Removing command " + iVar6.f6083n);
                            if (!((Intent) iVar6.f6082m.remove(0)).equals(iVar6.f6083n)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            iVar6.f6083n = null;
                        }
                        l lVar = (l) ((a5.c) iVar6.f6077h).f262h;
                        c cVar = iVar6.f6081l;
                        synchronized (cVar.f6052i) {
                            isEmpty = cVar.f6051h.isEmpty();
                        }
                        if (isEmpty && iVar6.f6082m.isEmpty()) {
                            synchronized (lVar.f8754j) {
                                isEmpty2 = lVar.f8751g.isEmpty();
                            }
                            if (isEmpty2) {
                                o.d().a(str3, "No more commands & intents.");
                                SystemAlarmService systemAlarmService = iVar6.f6084o;
                                if (systemAlarmService != null) {
                                    systemAlarmService.c();
                                }
                            }
                        }
                        if (!iVar6.f6082m.isEmpty()) {
                            iVar6.d();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }
}
