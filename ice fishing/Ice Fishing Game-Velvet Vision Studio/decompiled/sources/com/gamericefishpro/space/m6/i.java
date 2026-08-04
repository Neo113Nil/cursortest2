package com.gamericefishpro.space.m6;

import androidx.work.impl.WorkDatabase;
import com.gamericefishpro.space.l6.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final /* synthetic */ int a = 0;

    static {
        q.d("Schedulers");
    }

    public static void a(com.gamericefishpro.space.l6.c cVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        com.gamericefishpro.space.u6.q qVarB = workDatabase.B();
        workDatabase.c();
        try {
            ArrayList arrayListH = qVarB.h(cVar.h);
            ArrayList arrayListG = qVarB.g();
            if (arrayListH.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                int size = arrayListH.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListH.get(i);
                    i++;
                    qVarB.n(((com.gamericefishpro.space.u6.p) obj).a, jCurrentTimeMillis);
                }
            }
            workDatabase.u();
            workDatabase.q();
            if (arrayListH.size() > 0) {
                com.gamericefishpro.space.u6.p[] pVarArr = (com.gamericefishpro.space.u6.p[]) arrayListH.toArray(new com.gamericefishpro.space.u6.p[arrayListH.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    if (hVar.e()) {
                        hVar.a(pVarArr);
                    }
                }
            }
            if (arrayListG.size() > 0) {
                com.gamericefishpro.space.u6.p[] pVarArr2 = (com.gamericefishpro.space.u6.p[]) arrayListG.toArray(new com.gamericefishpro.space.u6.p[arrayListG.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    h hVar2 = (h) it2.next();
                    if (!hVar2.e()) {
                        hVar2.a(pVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.q();
            throw th;
        }
    }
}
