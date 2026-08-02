package M0;

import J0.r;
import Q2.A;
import T0.l;
import T0.n;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1838n;

    /* renamed from: u, reason: collision with root package name */
    public final j f1839u;

    public /* synthetic */ h(j jVar, int i) {
        this.f1838n = i;
        this.f1839u = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        A a9;
        h hVar;
        boolean isEmpty;
        boolean isEmpty2;
        switch (this.f1838n) {
            case 0:
                synchronized (this.f1839u.f1853z) {
                    j jVar = this.f1839u;
                    jVar.f1845A = (Intent) jVar.f1853z.get(0);
                }
                Intent intent = this.f1839u.f1845A;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.f1839u.f1845A.getIntExtra("KEY_START_ID", 0);
                    r d9 = r.d();
                    String str = j.f1844C;
                    d9.a(str, "Processing command " + this.f1839u.f1845A + ", " + intExtra);
                    PowerManager.WakeLock a10 = n.a(this.f1839u.f1847n, action + " (" + intExtra + ")");
                    try {
                        r.d().a(str, "Acquiring operation wake lock (" + action + ") " + a10);
                        a10.acquire();
                        j jVar2 = this.f1839u;
                        jVar2.f1852y.a(jVar2.f1845A, intExtra, jVar2);
                        r.d().a(str, "Releasing operation wake lock (" + action + ") " + a10);
                        a10.release();
                        j jVar3 = this.f1839u;
                        a9 = (A) jVar3.f1848u.f5559w;
                        hVar = new h(jVar3, 1);
                    } catch (Throwable th) {
                        try {
                            r d10 = r.d();
                            String str2 = j.f1844C;
                            d10.c(str2, "Unexpected error in onHandleIntent", th);
                            r.d().a(str2, "Releasing operation wake lock (" + action + ") " + a10);
                            a10.release();
                            j jVar4 = this.f1839u;
                            a9 = (A) jVar4.f1848u.f5559w;
                            hVar = new h(jVar4, 1);
                        } catch (Throwable th2) {
                            r.d().a(j.f1844C, "Releasing operation wake lock (" + action + ") " + a10);
                            a10.release();
                            j jVar5 = this.f1839u;
                            ((A) jVar5.f1848u.f5559w).execute(new h(jVar5, 1));
                            throw th2;
                        }
                    }
                    a9.execute(hVar);
                    return;
                }
                return;
            default:
                j jVar6 = this.f1839u;
                jVar6.getClass();
                r d11 = r.d();
                String str3 = j.f1844C;
                d11.a(str3, "Checking if commands are complete.");
                j.c();
                synchronized (jVar6.f1853z) {
                    try {
                        if (jVar6.f1845A != null) {
                            r.d().a(str3, "Removing command " + jVar6.f1845A);
                            if (!((Intent) jVar6.f1853z.remove(0)).equals(jVar6.f1845A)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            jVar6.f1845A = null;
                        }
                        l lVar = (l) jVar6.f1848u.f5557u;
                        c cVar = jVar6.f1852y;
                        synchronized (cVar.f1816v) {
                            isEmpty = cVar.f1815u.isEmpty();
                        }
                        if (isEmpty && jVar6.f1853z.isEmpty()) {
                            synchronized (lVar.f3127u) {
                                isEmpty2 = lVar.f3128v.isEmpty();
                            }
                            if (isEmpty2) {
                                r.d().a(str3, "No more commands & intents.");
                                SystemAlarmService systemAlarmService = jVar6.f1846B;
                                if (systemAlarmService != null) {
                                    systemAlarmService.a();
                                }
                            }
                        }
                        if (!jVar6.f1853z.isEmpty()) {
                            jVar6.d();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }
}
