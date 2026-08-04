package com.gamericefishpro.space.o6;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.gamericefishpro.space.c8.p;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.m6.o;
import com.gamericefishpro.space.n.a0;
import com.gamericefishpro.space.u6.j;
import com.gamericefishpro.space.v6.m;
import com.gamericefishpro.space.v6.t;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements com.gamericefishpro.space.m6.c {
    public static final String C = q.d("SystemAlarmDispatcher");
    public Intent A;
    public SystemAlarmService B;
    public final Context d;
    public final com.gamericefishpro.space.x6.a e;
    public final t i;
    public final com.gamericefishpro.space.m6.f v;
    public final o w;
    public final c y;
    public final ArrayList z;

    public i(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.d = applicationContext;
        this.y = new c(applicationContext, new com.gamericefishpro.space.u6.e(6));
        o oVarA = o.a(systemAlarmService);
        this.w = oVarA;
        this.i = new t(oVarA.b.e);
        com.gamericefishpro.space.m6.f fVar = oVarA.f;
        this.v = fVar;
        this.e = oVarA.d;
        fVar.a(this);
        this.z = new ArrayList();
        this.A = null;
    }

    public static void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(int i, Intent intent) {
        q qVarC = q.c();
        String str = C;
        Objects.toString(intent);
        qVarC.getClass();
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            q.c().e(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.z) {
                try {
                    ArrayList arrayList = this.z;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.z) {
            try {
                boolean zIsEmpty = this.z.isEmpty();
                this.z.add(intent);
                if (zIsEmpty) {
                    c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        b();
        PowerManager.WakeLock wakeLockA = m.a(this.d, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.w.d.a(new h(this, 0));
        } finally {
            wakeLockA.release();
        }
    }

    @Override // com.gamericefishpro.space.m6.c
    public final void f(j jVar, boolean z) {
        p pVar = (p) ((com.gamericefishpro.space.r5.b) this.e).v;
        String str = c.w;
        Intent intent = new Intent(this.d, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        c.c(intent, jVar);
        pVar.execute(new a0(0, 1, this, intent));
    }
}
