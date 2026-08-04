package com.gamericefishpro.space.o6;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.gamericefishpro.space.c8.p;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.m6.j;
import com.gamericefishpro.space.n.a0;
import com.gamericefishpro.space.s5.y;
import com.gamericefishpro.space.v6.m;
import com.gamericefishpro.space.v6.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements com.gamericefishpro.space.q6.b, r {
    public final y A;
    public final p B;
    public PowerManager.WakeLock C;
    public boolean D;
    public final j E;
    public final Context d;
    public final int e;
    public final com.gamericefishpro.space.u6.j i;
    public final i v;
    public final com.gamericefishpro.space.a8.c w;
    public final Object y;
    public int z;

    static {
        q.d("DelayMetCommandHandler");
    }

    public g(Context context, int i, i iVar, j jVar) {
        this.d = context;
        this.e = i;
        this.v = iVar;
        this.i = jVar.a;
        this.E = jVar;
        com.gamericefishpro.space.u6.i iVar2 = iVar.w.j;
        com.gamericefishpro.space.r5.b bVar = (com.gamericefishpro.space.r5.b) iVar.e;
        this.A = (y) bVar.e;
        this.B = (p) bVar.v;
        this.w = new com.gamericefishpro.space.a8.c(iVar2, this);
        this.D = false;
        this.z = 0;
        this.y = new Object();
    }

    public static void a(g gVar) {
        int i = gVar.e;
        p pVar = gVar.B;
        Context context = gVar.d;
        i iVar = gVar.v;
        com.gamericefishpro.space.u6.j jVar = gVar.i;
        if (gVar.z >= 2) {
            q.c().getClass();
            return;
        }
        gVar.z = 2;
        q.c().getClass();
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        c.c(intent, jVar);
        pVar.execute(new a0(i, 1, iVar, intent));
        if (!iVar.v.c(jVar.a)) {
            q.c().getClass();
            return;
        }
        q.c().getClass();
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        c.c(intent2, jVar);
        pVar.execute(new a0(i, 1, iVar, intent2));
    }

    public final void b() {
        synchronized (this.y) {
            try {
                this.w.x();
                this.v.i.a(this.i);
                PowerManager.WakeLock wakeLock = this.C;
                if (wakeLock != null && wakeLock.isHeld()) {
                    q qVarC = q.c();
                    Objects.toString(this.C);
                    Objects.toString(this.i);
                    qVarC.getClass();
                    this.C.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.gamericefishpro.space.q6.b
    public final void c(ArrayList arrayList) {
        this.A.execute(new f(this, 0));
    }

    @Override // com.gamericefishpro.space.q6.b
    public final void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (a4.y((com.gamericefishpro.space.u6.p) it.next()).equals(this.i)) {
                this.A.execute(new f(this, 1));
                return;
            }
        }
    }

    public final void e() {
        String str = this.i.a;
        this.C = m.a(this.d, str + " (" + this.e + ")");
        q qVarC = q.c();
        Objects.toString(this.C);
        qVarC.getClass();
        this.C.acquire();
        com.gamericefishpro.space.u6.p pVarM = this.v.w.c.B().m(str);
        if (pVarM == null) {
            this.A.execute(new f(this, 0));
            return;
        }
        boolean zB = pVarM.b();
        this.D = zB;
        if (zB) {
            this.w.w(Collections.singletonList(pVarM));
        } else {
            q.c().getClass();
            d(Collections.singletonList(pVarM));
        }
    }

    public final void f(boolean z) {
        q qVarC = q.c();
        com.gamericefishpro.space.u6.j jVar = this.i;
        Objects.toString(jVar);
        qVarC.getClass();
        b();
        int i = this.e;
        i iVar = this.v;
        p pVar = this.B;
        Context context = this.d;
        if (z) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            c.c(intent, jVar);
            pVar.execute(new a0(i, 1, iVar, intent));
        }
        if (this.D) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            pVar.execute(new a0(i, 1, iVar, intent2));
        }
    }
}
