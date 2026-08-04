package com.gamericefishpro.space.s4;

import android.os.Build;
import com.gamericefishpro.space.i9.d5;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends d5 {
    public final /* synthetic */ e c;

    public d(e eVar) {
        this.c = eVar;
    }

    @Override // com.gamericefishpro.space.i9.d5
    public final void O(Throwable th) {
        this.c.a.e(th);
    }

    @Override // com.gamericefishpro.space.i9.d5
    public final void P(com.gamericefishpro.space.tb.s sVar) {
        e eVar = this.c;
        eVar.c = sVar;
        com.gamericefishpro.space.tb.s sVar2 = eVar.c;
        k kVar = eVar.a;
        eVar.b = new com.gamericefishpro.space.r5.b(sVar2, kVar.g, kVar.i, Build.VERSION.SDK_INT >= 34 ? n.a() : com.gamericefishpro.space.u6.f.y());
        k kVar2 = eVar.a;
        kVar2.getClass();
        ArrayList arrayList = new ArrayList();
        kVar2.a.writeLock().lock();
        try {
            kVar2.c = 1;
            arrayList.addAll(kVar2.b);
            kVar2.b.clear();
            kVar2.a.writeLock().unlock();
            kVar2.d.post(new i(arrayList, kVar2.c, (Throwable) null));
        } catch (Throwable th) {
            kVar2.a.writeLock().unlock();
            throw th;
        }
    }
}
