package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.o6.i;
import com.gamericefishpro.space.v6.m;
import com.gamericefishpro.space.v6.n;
import com.gamericefishpro.space.z4.x;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends x {
    public i e;
    public boolean i;

    static {
        q.d("SystemAlarmService");
    }

    public final void c() {
        this.i = true;
        q.c().getClass();
        String str = m.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (n.a) {
            linkedHashMap.putAll(n.b);
            Unit unit = Unit.a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                q.c().e(m.a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // com.gamericefishpro.space.z4.x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        i iVar = new i(this);
        this.e = iVar;
        if (iVar.B != null) {
            q.c().a(i.C, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            iVar.B = this;
        }
        this.i = false;
    }

    @Override // com.gamericefishpro.space.z4.x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.i = true;
        i iVar = this.e;
        iVar.getClass();
        q.c().getClass();
        iVar.v.d(iVar);
        iVar.B = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.i) {
            q.c().getClass();
            i iVar = this.e;
            iVar.getClass();
            q.c().getClass();
            iVar.v.d(iVar);
            iVar.B = null;
            i iVar2 = new i(this);
            this.e = iVar2;
            if (iVar2.B != null) {
                q.c().a(i.C, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                iVar2.B = this;
            }
            this.i = false;
        }
        if (intent == null) {
            return 3;
        }
        this.e.a(i2, intent);
        return 3;
    }
}
