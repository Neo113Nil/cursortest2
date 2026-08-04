package com.gamericefishpro.space.v6;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Runnable {
    public static final /* synthetic */ int z = 0;
    public final com.gamericefishpro.space.w6.j d = new com.gamericefishpro.space.w6.j();
    public final Context e;
    public final com.gamericefishpro.space.u6.p i;
    public final com.gamericefishpro.space.l6.p v;
    public final p w;
    public final com.gamericefishpro.space.x6.a y;

    static {
        com.gamericefishpro.space.l6.q.d("WorkForegroundRunnable");
    }

    public o(Context context, com.gamericefishpro.space.u6.p pVar, com.gamericefishpro.space.l6.p pVar2, p pVar3, com.gamericefishpro.space.r5.b bVar) {
        this.e = context;
        this.i = pVar;
        this.v = pVar2;
        this.w = pVar3;
        this.y = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.i.q || Build.VERSION.SDK_INT >= 31) {
            this.d.i(null);
            return;
        }
        com.gamericefishpro.space.w6.j jVar = new com.gamericefishpro.space.w6.j();
        com.gamericefishpro.space.r5.b bVar = (com.gamericefishpro.space.r5.b) this.y;
        ((com.gamericefishpro.space.c8.p) bVar.v).execute(new com.gamericefishpro.space.bb.h(15, this, jVar));
        jVar.a(new com.gamericefishpro.space.r9.l(8, this, jVar), (com.gamericefishpro.space.c8.p) bVar.v);
    }
}
