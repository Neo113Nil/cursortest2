package M0;

import J0.s;
import O2.B;
import T0.l;
import T0.n;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1805n;

    /* renamed from: u, reason: collision with root package name */
    public final j f1806u;

    public /* synthetic */ h(j jVar, int i) {
        this.f1805n = i;
        this.f1806u = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B b9;
        h hVar;
        boolean isEmpty;
        boolean isEmpty2;
        switch (this.f1805n) {
            case 0:
                synchronized (this.f1806u.f1820z) {
                    j jVar = this.f1806u;
                    jVar.f1812A = (Intent) jVar.f1820z.get(0);
                }
                Intent intent = this.f1806u.f1812A;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.f1806u.f1812A.getIntExtra("KEY_START_ID", 0);
                    s d2 = s.d();
                    String str = j.f1811C;
                    d2.a(str, "Processing command " + this.f1806u.f1812A + ", " + intExtra);
                    PowerManager.WakeLock a9 = n.a(this.f1806u.f1814n, action + " (" + intExtra + ")");
                    try {
                        s.d().a(str, "Acquiring operation wake lock (" + action + ") " + a9);
                        a9.acquire();
                        j jVar2 = this.f1806u;
                        jVar2.f1819y.a(jVar2.f1812A, intExtra, jVar2);
                        s.d().a(str, "Releasing operation wake lock (" + action + ") " + a9);
                        a9.release();
                        j jVar3 = this.f1806u;
                        b9 = (B) jVar3.f1815u.f4172w;
                        hVar = new h(jVar3, 1);
                    } catch (Throwable th) {
                        try {
                            s d9 = s.d();
                            String str2 = j.f1811C;
                            d9.c(str2, "Unexpected error in onHandleIntent", th);
                            s.d().a(str2, "Releasing operation wake lock (" + action + ") " + a9);
                            a9.release();
                            j jVar4 = this.f1806u;
                            b9 = (B) jVar4.f1815u.f4172w;
                            hVar = new h(jVar4, 1);
                        } catch (Throwable th2) {
                            s.d().a(j.f1811C, "Releasing operation wake lock (" + action + ") " + a9);
                            a9.release();
                            j jVar5 = this.f1806u;
                            ((B) jVar5.f1815u.f4172w).execute(new h(jVar5, 1));
                            throw th2;
                        }
                    }
                    b9.execute(hVar);
                    return;
                }
                return;
            default:
                j jVar6 = this.f1806u;
                jVar6.getClass();
                s d10 = s.d();
                String str3 = j.f1811C;
                d10.a(str3, "Checking if commands are complete.");
                j.c();
                synchronized (jVar6.f1820z) {
                    try {
                        if (jVar6.f1812A != null) {
                            s.d().a(str3, "Removing command " + jVar6.f1812A);
                            if (!((Intent) jVar6.f1820z.remove(0)).equals(jVar6.f1812A)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            jVar6.f1812A = null;
                        }
                        l lVar = (l) jVar6.f1815u.f4170u;
                        c cVar = jVar6.f1819y;
                        synchronized (cVar.f1783v) {
                            isEmpty = cVar.f1782u.isEmpty();
                        }
                        if (isEmpty && jVar6.f1820z.isEmpty()) {
                            synchronized (lVar.f3044u) {
                                isEmpty2 = lVar.f3045v.isEmpty();
                            }
                            if (isEmpty2) {
                                s.d().a(str3, "No more commands & intents.");
                                SystemAlarmService systemAlarmService = jVar6.f1813B;
                                if (systemAlarmService != null) {
                                    systemAlarmService.a();
                                }
                            }
                        }
                        if (!jVar6.f1820z.isEmpty()) {
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
